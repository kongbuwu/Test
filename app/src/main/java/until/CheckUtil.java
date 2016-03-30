package until;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 * 检验字符串是否符合规范
 * 
 * @author Allan
 * 
 */
public class CheckUtil {

	/**
	 * 功能：判断字符串是否为数字
	 * 
	 * @param str
	 * @return
	 */
	private static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(str);
		if (isNum.matches()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 判断是否是手机号
	 * 
	 * @param mobiles
	 *            要判断的字符串
	 * @return true表示是合法的电话号码
	 */
	public static boolean isMobileNO(String mobiles) {
		if (isNullString(mobiles))
			return false;
		boolean isValid = false;
		/*
		 * 可接受的电话格式有：
		 */
		String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{5})$";
		/*
		 * 可接受的电话格式有：
		 */
		String expression2 = "^\\(?(\\d{3})\\)?[- ]?(\\d{4})[- ]?(\\d{4})$";
		Pattern pattern = Pattern.compile(expression);
		Matcher matcher = pattern.matcher(mobiles);

		Pattern pattern2 = Pattern.compile(expression2);
		Matcher matcher2 = pattern2.matcher(mobiles);
		if (matcher.matches() || matcher2.matches()) {
			isValid = true;
		}
		return isValid;
	}

	/**
	 * 检查邮箱是否有效
	 * 
	 * @param email
	 *            要判断的字符串
	 * @return true 表示合法邮箱
	 */
	public static boolean isEmail(String email) {
		if (isNullString(email))
			return false;
		// 验证邮箱的正则表达式
		String format = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
		if (email.matches(format)) {
			return true;
			// 邮箱名合法，返回true
		} else {
			return false;
			// 邮箱名不合法，返回false
		}
	}

	public static boolean isCode(String code, String locationCode) {
		String codeMd5 = MD5.getMd5(code);
		if (codeMd5.equals(locationCode)) {
			return true;
		}
		return false;
	}
	/**
	 * 字符串为null或者“”，返回true
	 * @param value
	 * @return
	 */
	public static boolean isNullString(String value) {
		if (value == null || "".equals(value)) {
			return true;
		}
		return false;
	}

	/**
	 * 检查密码是否有效
	 * 
	 * @param pwdString
	 * @return true 表示合法的密码
	 */
	public static boolean isPassword(String pwdString) {
		String regEx = "[~!@#$%^&*<>]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(pwdString);
		if (m.find()) {
			return false;
		}
		return true;
	}

}
