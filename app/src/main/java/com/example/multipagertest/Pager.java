/**
 * 
 */
package com.example.multipagertest;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * @author szy
 *
 */
public class Pager extends LinearLayout {
	private int mHronMargin = 0;

	public Pager(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		TypedArray a = context.obtainStyledAttributes(attrs,
				R.styleable.Pager, 0, 0);
		mHronMargin = a.getDimensionPixelSize(R.styleable.Pager_HronMargin, 0);
		a.recycle();
	}

	public void setHronMargin(int id) {
		mHronMargin = getContext().getResources().getInteger(id);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

		final int widthMode = MeasureSpec.getMode(widthMeasureSpec);
		int width = MeasureSpec.getSize(widthMeasureSpec) - 2 * mHronMargin;

		Log.v("www", "width =   " + width + "      " + mHronMargin);

		widthMeasureSpec =  MeasureSpec.makeMeasureSpec(width, widthMode);
//		measureChild(childView, widthMeasureSpec, heightMeasureSpec);
//		this.measure(widthMeasureSpec, heightMeasureSpec);
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}
	
	@Override 
	public boolean onTouchEvent(MotionEvent event) {
		return true;
	}
}
