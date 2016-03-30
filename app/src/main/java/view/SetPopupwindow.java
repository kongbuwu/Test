package view;



import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.ViewGroup.LayoutParams;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
/*
 * setAlpha(float alpha) :设置透明度
 * setPopupWindow() : 创建popupwindow
 */

public class SetPopupwindow
{
	Context mContext;
	View view; 
	PopupWindow pw;
	float mAlpha; // 透明度
	WindowManager.LayoutParams mParams;
	static PopupWindow popup;
	LayoutInflater inflater;
	int mViewid; // popupwindow要绑定的布局
//	public static SetPopupwindow getInstance(Context context) {
//		synchronized (SetPopupwindow.class) {
//			if (popup == null) {
//				popup = new PopupWindow(context);
//			}
//		}
//
//		return popup;
//
//	}
	
	public SetPopupwindow(Context context,float alpha,View parent){
		this.mContext = context;
		this.mAlpha = alpha;
		this.inflater = LayoutInflater.from(mContext);
		this.view = parent;
		init();
	}
	public SetPopupwindow(Context context,int viewId){
		this.mContext = context;
		this.inflater = LayoutInflater.from(mContext);
		this.mViewid = viewId;
		init();
	}
	
	public SetPopupwindow(Context context, float f) {
		// TODO Auto-generated constructor stub
	}

	public void init(){
		mParams = ((Activity)mContext).getWindow().getAttributes();
		
	}
	
	// 设置背景透明度
	public float setAlpha(float alpha){
		this.mAlpha = alpha;
		return mAlpha;
	}

	public void setAlpha(){
		mParams.alpha = mAlpha;
		((Activity)mContext).getWindow().setAttributes(mParams);
	}
	
	// 创建popupwindow
	public void setPopupWindow(){
//		view = inflater.inflate(mViewid, null);
		pw = new PopupWindow(mContext);
		// 绑定视图
		pw.setContentView(view);
		// 设置长和高，必须要写
		pw.setWidth(LayoutParams.MATCH_PARENT);
		pw.setHeight(LayoutParams.WRAP_CONTENT);
		// 设置背景，通常设置无色，可以这么写
		// pw.setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_launcher));
		pw.setBackgroundDrawable(new BitmapDrawable());
//		// 是否获取焦点。
		pw.setFocusable(true);
		// 设置位置，Gravity.CENTER ，为居中。
		pw.showAtLocation(view, Gravity.CENTER, 0, 0);
		setAlpha();
		pw.setOnDismissListener(listener);
		
	}
	
	// 消失的监听事件。
	OnDismissListener listener = new OnDismissListener()
	{
		@Override
		public void onDismiss()
		{
			mParams.alpha = 1.0f;
			((Activity)mContext).getWindow().setAttributes(mParams);
		}
	};
}
