package until;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;

public class ChangeTextColor {

	/**
	 * 改变字体颜色
	 * @param res
	 * @param start
	 * @param end
	 * @param colors
	 * @return
	 */
	 public static SpannableStringBuilder location(String res,int start,int end,int colors){
		 SpannableStringBuilder style=new SpannableStringBuilder(res);
		 style.setSpan(new ForegroundColorSpan(colors), start, end, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
		   
		 return style;
	 }
}
