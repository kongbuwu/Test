package until;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.annotation.SuppressLint;

@SuppressLint("SimpleDateFormat")
public class DateUtil {

  private static final String TAG = "DateUtil";

  private static final String FORMAT1 = "yyyy-MM-dd";
  private static final String FORMAT2 = "yyyyMMdd";
  private static SimpleDateFormat sdfNormal;
  private static SimpleDateFormat sdfStr;

  static {
    sdfNormal = new SimpleDateFormat(FORMAT1);
    sdfStr = new SimpleDateFormat(FORMAT2);
  }

  public static String formatDate(String date) {
    String format = null;
    try {
      if (date == null || "".equals(date)) {
        return "";
      }
      format = sdfNormal.format(sdfNormal.parse(date));
    } catch (ParseException e) {
      return date;
    }
    return format;
  }

  /**
   * get current date,date pattern : yyyy-MM-dd
   * 
   * @return
   */
  public static String getCurrentDate() {
    String format = null;
    format = sdfNormal.format(new Date());
    return format;
  }

  public static String formatDateStr(String date) {
    String format = null;
    try {
      Date parseDate = sdfStr.parse(date);
      format = sdfNormal.format(parseDate);
    } catch (ParseException e) {
      return date;
    }
    return format;
  }

  /**
   * 获取当前时间的字符串
   */
  public static String getCurrentDateStr() {
    Date date = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
    int w = c.get(Calendar.DAY_OF_WEEK) - 1;
    if (w < 0) {
      w = 0;
    }
    String mDate = c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH) + 1) + "月" + c.get(Calendar.DATE) + "日  "
        + weekDays[w];
    return mDate;
  }

  /**
   * String 转化Calendar
   * 
   * @return
   */
  public static Calendar strToCalendar(String str) {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date date = null;
    Calendar calendar = null;
    try {
      date = sdf.parse(str);
      calendar = Calendar.getInstance();
      calendar.setTime(date);
    } catch (ParseException e) {

    }
    return calendar;
  }

  /****
   * 减一天
   * 
   * @author owen xu
   * **/
  public static String reduceOneHour(Calendar c2) {
    long b = 1000 * 3600 * 24;
    long a = c2.getTimeInMillis() - b;
    c2.setTimeInMillis(a);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    return sdf.format(c2.getTime());

  }

}
