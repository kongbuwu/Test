package until;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Activity的工具类 com.ecej.utils.ActivityUtil
 * 
 * @author Tom
 */
public class ActivityUtil {

  /**
   * 通过类名启动Activity
   * 
   * @param pClass
   */
  public static void openActivity(Context context, Class<?> pClass) {
    openActivity(context, pClass, null);
  }

  /**
   * 通过类名启动Activity，并且含有Bundle数据
   * 
   * @param pClass
   * @param pBundle
   */
  public static void openActivity(Context context, Class<?> pClass, Bundle pBundle) {
    Intent intent = new Intent(context, pClass);
    if (pBundle != null) {
      intent.putExtras(pBundle);
    }
    context.startActivity(intent);
  }

  /**
   * 以回调结果的方式启动一个 Activity
   * 
   * @param cls
   *          需要启动的 Activity 的类名
   * @param requestCode
   *          启动时候的请求码
   */
  public static void openActivityForResult(Context context, Class<?> cls, int requestCode) {
    openActivityForResult(context, cls, requestCode, null);
  }

  /**
   * 以回调结果的方式启动一个 Activity，并且含有Bundle数据
   * 
   * @param cls
   * @param requestCode
   * @param pBundle
   */
  public static void openActivityForResult(Context context, Class<?> cls, int requestCode, Bundle pBundle) {
    Activity activity = (Activity) context;
    Intent intent = new Intent(activity, cls);
    if (pBundle != null) {
      intent.putExtras(pBundle);
    }
    activity.startActivityForResult(intent, requestCode);
  }
  
  /**
   * 延迟去往新的Activity
   * 
   * @param context
   * @param cls
   * @param delay
   */
  public static void delayToActivity(final Context context, final Class<?> cls, long delay) {
    Timer timer = new Timer();
    timer.schedule(new TimerTask() {

      @Override
      public void run() {
        context.startActivity(new Intent(context, cls));
      }
    }, delay);
  }
  
  
}
