package until;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import android.annotation.SuppressLint;

/**
 * TimeUtil
 * 
 * @author wei2bei132
 * 
 */
public class TimeUtil {
	public final static String FORMAT_DATE = "yyyy-MM-dd";
	public final static String FORMAT_TIME = "hh:mm";
	public final static String FORMAT_DATE_TIME = "yyyy-MM-dd hh:mm";
	public final static String FORMAT_MONTH_DAY_TIME = "MM-dd hh:mm";
	// 用来对日期字符串进行解析和格式化输出的类
	private static SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat();
	private static final int YEAR = 365 * 24 * 60 * 60;
	private static final int MONTH = 30 * 24 * 60 * 60;
	private static final int DAY = 24 * 60 * 60;
	private static final int HOUR = 60 * 60;
	private static final int MINUTE = 60;

	/**
	 * 根据时间戳获取描述性时间，如3分钟前，1天前
	 * 
	 * @param timestamp
	 *            时间戳 单位为毫秒
	 * @return 时间字符串
	 */
	public static String getDescriptionTimeFromTimestamp(long timestamp) {
		// 获取系统当前的时间（毫秒）
		long currentTime = System.currentTimeMillis();
		System.out.println(currentTime);
		// 传入的时间和系统的时间差（秒）
		long timeGap = (currentTime - timestamp) / 1000;
		String timeStr = null;
		if (timeGap > YEAR) {
			timeStr = timeGap / YEAR + "年前";
		} else if (timeGap > MONTH) {
			timeStr = timeGap / MONTH + "个月前";
		} else if (timeGap > DAY) {
			timeStr = timeGap / DAY + "天前";
		} else if (timeGap > HOUR) {
			timeStr = timeGap / HOUR + "小时前";
		} else if (timeGap > MINUTE) {
			timeStr = timeGap / MINUTE + "分钟前";
		} else {
			timeStr = "刚刚";
		}
		return timeStr;

	}

	/**
	 * 根据时间戳获取指定格式的时间，如2011-11-30 08:40
	 * 
	 * @param timestamp
	 *            时间戳 单位为毫秒
	 * @param format
	 *            指定格式 如果为null或空串则使用默认格式"yyyy-MM-dd HH:MM"
	 * @return
	 */
	public static String getFormatTimeFromTimestamp(long timestamp,
			String format) {
		if (format == null || format.equals("")) {
			// 用新创建的日期格式表达式替换其原有的
			mSimpleDateFormat.applyPattern(FORMAT_DATE);
			// 获取当前年份
			int currentYear = Calendar.getInstance().get(Calendar.YEAR);
			// 获取输入的时间戳进行格式化
			String input_time = mSimpleDateFormat.format(new Date(timestamp));
			// 获取输入的年份
			int year = Integer.valueOf(input_time.substring(0, 4));
			// 判断如果当前年份与输入的年份相同,格式化的时间是"MM-dd hh:mm"，如果不同格式化时间是"yyyy-MM-dd hh:mm"
			if (currentYear == year) {
				// "MM-dd hh:mm"
				mSimpleDateFormat.applyPattern(FORMAT_MONTH_DAY_TIME);
			} else {
				// "yyyy-MM-dd hh:mm"
				mSimpleDateFormat.applyPattern(FORMAT_DATE_TIME);
			}
		} else {
			// 采用默认格式"yyyy-MM-dd HH:MM"
			mSimpleDateFormat.applyPattern(format);
		}
		// 将输入的字符串转化成时间格式
		Date date = new Date(timestamp);
		// 返回格式化的时间
		return mSimpleDateFormat.format(date);
	}

	/**
	 * 根据时间戳获取时间字符串，并根据指定的时间分割数partionSeconds来自动判断返回描述性时间还是指定格式的时间
	 * 
	 * @param timestamp
	 *            时间戳 单位是毫秒
	 * @param partionSeconds
	 *            时间分割线，当现在时间与指定的时间戳的秒数差大于这个分割线时则返回指定格式时间，否则返回描述性时间
	 * @param format
	 * @return
	 */
	public static String getMixTimeFromTimestamp(long timestamp,
			long partionSeconds, String format) {
		// 获取当前的时间（毫秒）
		long currentTime = System.currentTimeMillis();
		// 传入的时间和系统的时间差（秒）
		long timeGap = (currentTime - timestamp) / 1000;
		// 如果时间差小于传入的时间分割线，返回时间格式如3分钟前，1天前，反之返回的格式如2011-11-30 08:40
		if (timeGap <= partionSeconds) {
			// 时间格式如3分钟前，1天前
			return getDescriptionTimeFromTimestamp(timestamp);
		} else {
			// 时间格式如2011-11-30 08:40
			return getFormatTimeFromTimestamp(timestamp, format);
		}
	}

	/**
	 * 获取当前日期的指定格式的字符串
	 * 
	 * @param format
	 *            指定的日期时间格式，若为null或""则使用指定的格式"yyyy-MM-dd HH:MM"
	 * @return
	 */
	public static String getCurrentTime(String format) {
		if (format == null || format.equals("")) {
			mSimpleDateFormat.applyPattern(FORMAT_DATE_TIME);
		} else {
			mSimpleDateFormat.applyPattern(format);
		}
		return mSimpleDateFormat.format(new Date());
	}

	/**
	 * 将日期字符串以指定格式转换为Date
	 * 
	 * @param time
	 *            日期字符串
	 * @param format
	 *            指定的日期格式，若为null或""则使用指定的格式"yyyy-MM-dd HH:MM"
	 * @return
	 */
	public static Date getTimeFromString(String timeStr, String format) {
		if (format == null || format.equals("")) {
			mSimpleDateFormat.applyPattern(FORMAT_DATE_TIME);
		} else {
			mSimpleDateFormat.applyPattern(format);
		}
		try {
			return mSimpleDateFormat.parse(timeStr);
		} catch (ParseException e) {
			return new Date();
		}
	}

	/**
	 * 将Date以指定格式转换为日期时间字符串
	 * 
	 * @param date
	 *            日期
	 * @param format
	 *            指定的日期时间格式，若为null或""则使用指定的格式"yyyy-MM-dd HH:MM"
	 * @return
	 */
	public static String getStringFromTime(Date time, String format) {
		if (format == null || format.equals("")) {
			mSimpleDateFormat.applyPattern(FORMAT_DATE_TIME);
		} else {
			mSimpleDateFormat.applyPattern(format);
		}
		return mSimpleDateFormat.format(time);
	}

	/**
	 * 将日期时间字符串转化成时间戳
	 * 
	 * @param date
	 *            日期
	 * @return
	 */
	public static long getLongFromDate(String date, String format) {
		try {
			// 用新创建的日期格式表达式替换其原有的
			if (format == null || format.equals("")) {
				mSimpleDateFormat.applyPattern(FORMAT_DATE);
			} else {
				mSimpleDateFormat.applyPattern(format);
			}
			// 将字符串转化为date类型
			Date mTime = mSimpleDateFormat.parse(date);
			// 获取时间戳
			long timeStemp = mTime.getTime();
			return timeStemp;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 获取两个时间之间的日期
	 * 
	 * @param smdate 按顺序输入的
	 * @param bdate
	 * @return
	 * @throws ParseException
	 * @throws ParseException
	 */
	@SuppressLint("SimpleDateFormat")
	public static List<String> daysBetween(String smdate, String bdate)
			throws ParseException, ParseException {
		List<String> daysList = new ArrayList<String>();
		Calendar startCalendar = Calendar.getInstance();
		Calendar endCalendar = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-M-d");
		Date startDate;
		Date tempDate;
		Date endDate;
		try {
			startDate = df.parse(smdate);
			endDate = df.parse(bdate);
			if (startDate.getTime() > endDate.getTime()) {
				tempDate = startDate;
				startDate = endDate;
				endDate = tempDate;
			}
			startCalendar.setTime(startDate);
			endCalendar.setTime(endDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		while (true) {
			startCalendar.add(Calendar.DAY_OF_MONTH, 1);
			if (startCalendar.getTimeInMillis() <= endCalendar
					.getTimeInMillis()) {
				Calendar date = Calendar.getInstance();
				date.setTime(startCalendar.getTime());
				date.set(Calendar.DATE, date.get(Calendar.DATE) - 1);
				daysList.add(df.format(date.getTime())); // 转数组或是集合
				// System.out.println(df.format(date.getTime())+"----------------------");
			} else {
				daysList.add(df.format(endCalendar.getTime()));
				// System.out.println(df.format(endCalendar.getTime())+"=====================");
				break;
			}
		}
		return daysList;

	}

	/**
	 * 获取指定日后 后 dayAddNum 天的 日期
	 * 
	 * @param day
	 *            日期，格式为String："2013-9-3";
	 * @param dayAddNum
	 *            增加天数 格式为int;
	 * @return
	 * @throws ParseException
	 */
	@SuppressLint("SimpleDateFormat")
	public static String getData(String day, int dayAddNum)
			throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-d");
		try {
			Date myDate = formatter.parse(day);
			Calendar c = Calendar.getInstance();
			c.setTime(myDate);
			c.add(Calendar.DATE, dayAddNum);
			myDate = c.getTime();
			return formatter.format(myDate);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		return day;

	}

	/**
	 * 获取两个时间的时间差
	 * 
	 * @param time1
	 * @param time2
	 * @return
	 */
	public static String getDataCha(String time1, String time2) {
		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		long between = 0;
		String time = "";
		try {
			Date begin = dfs.parse(time1);
			Date end = dfs.parse(time2);
			between = (end.getTime() - begin.getTime());// 得到两者的毫秒数
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		long day = between / (24 * 60 * 60 * 1000);
		long hour = (between / (60 * 60 * 1000) - day * 24);
		long min = ((between / (60 * 1000)) - day * 24 * 60 - hour * 60);
		long s = (between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
		long ms = (between - day * 24 * 60 * 60 * 1000 - hour * 60 * 60 * 1000
				- min * 60 * 1000 - s * 1000);
		System.out.println(day + "天" + hour + "小时" + min + "分");
		if (hour > 0 && min < 0) {
			time = hour + "小时";
		} else if (hour > 0 && min > 0) {
			time = hour + "小时" + min + "分";
		} else if (hour > 0 && min == 0) {
			time = hour + "小时";
		} else if (hour < 0 && min > 0) {
			time = min + "分";
		} else if (hour == 0 && min > 0) {
			time = min + "分";
		}
		System.out.println(time + "==time===");
		return time;

	}

	/**
	 * 获取两个时间的时间差
	 * 
	 * @param time1
	 * @param time2
	 * @return
	 */
	public static double getDataIntCha(String time1, String time2) {
		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		long between = 0;
		double time = 0;
		try {
			Date begin = dfs.parse(time1);
			Date end = dfs.parse(time2);
			between = (end.getTime() - begin.getTime());// 得到两者的毫秒数
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		int day = (int) between / (24 * 60 * 60 * 1000);
		int hour = (int) (between / (60 * 60 * 1000) - day * 24);
		int min = (int) ((between / (60 * 1000)) - day * 24 * 60 - hour * 60);
		int s = (int) (between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
		int ms = (int) (between - day * 24 * 60 * 60 * 1000 - hour * 60 * 60
				* 1000 - min * 60 * 1000 - s * 1000);
		System.out.println(day + "天" + hour + "小时" + min + "分");
		time = (double) hour + (double) (min / 60.00) + (double) (s / 3600.00);
		System.out.println(time + "==time===" + (double) (min / 60.00));
		return time;

	}

	/**
	 * 获取两个时间的时间差
	 * 
	 * @param time1
	 * @param time2
	 * @return
	 */
	public static int getDataIntCha1(String time1, String time2) {
		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		long between = 0;
		int time = 0;
		try {
			Date begin = dfs.parse(time1);
			Date end = dfs.parse(time2);
			between = (end.getTime() - begin.getTime());// 得到两者的毫秒数
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		int day = (int) between / (24 * 60 * 60 * 1000);
		int hour = (int) (between / (60 * 60 * 1000) - day * 24);
		int min = (int) ((between / (60 * 1000)) - day * 24 * 60 - hour * 60);
		int s = (int) (between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
		int ms = (int) (between - day * 24 * 60 * 60 * 1000 - hour * 60 * 60
				* 1000 - min * 60 * 1000 - s * 1000);
		System.out.println(day + "天" + hour + "小时" + min + "分");
		time = hour * 60 + min;
		System.out.println(time + "==time===");
		return time;

	}

	/**
	 * 比较两个日期的大小
	 * 
	 * @param DATE1
	 * @param DATE2
	 * @return
	 */
	public static int compare_date(String DATE1, String DATE2) {

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dt1 = df.parse(DATE1);
			Date dt2 = df.parse(DATE2);
			System.out.println(dt1.getTime() + "-------------" + dt2.getTime());
			if (dt1.getTime() > dt2.getTime()) {
				System.out.println("dt1 在dt2后");
				return 1;
			} else if (dt1.getTime() < dt2.getTime()) {
				System.out.println("dt1在dt2前");
				return -1;
			} else {
				return 0;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return 0;
	}
	/*
	 * 获取当前时间
	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
	 */


}
