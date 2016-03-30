package until;

import android.content.Context;
import android.provider.Settings.Secure;
import android.util.Log;
import android.widget.Toast;

public class LogUtil {
	private static boolean mLog = true;
	private static boolean mToast = false;
	/**
	 * 打印Log。v日志
	 * 
	 * @param _tag
	 * @param _content
	 */
	public static void log_v(String _tag, String _content) {
		if (mLog && _tag != null && !_tag.equals("")) {
			Log.v(_tag, _content);
		}
	}

	/**
	 * 打印Log。v日志
	 * 
	 * @param _content
	 */
	public static void log_v(String _content) {
		log_v("tag", _content);
	}
	public static void toastShow(Context context,String content){
		if (mToast) {			
			Toast.makeText(context, content, Toast.LENGTH_LONG).show();
		}
	}
	 

	public static String getAndroidID(Context context) {
		String androidID = Secure.getString(context.getContentResolver(),
				Secure.ANDROID_ID);
		return androidID;
	}
}
