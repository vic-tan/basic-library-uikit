package com.tlf.basic.uikit.list;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

public class NoneScrollGridView extends GridView {

	public NoneScrollGridView(Context context) {
		super(context);
	}

	public NoneScrollGridView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public NoneScrollGridView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(
				Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}
}
