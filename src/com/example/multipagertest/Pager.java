/**
 * 
 */
package com.example.multipagertest;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * @author szy
 *
 */
public class Pager extends LinearLayout {

	public Pager(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	@Override 
	public boolean onTouchEvent(MotionEvent event) {
		return true;
	}

//	@Override
//	public void onDraw(Canvas canvas) {
////		super.onDraw(canvas);
//		
//		Matrix matrix = canvas.getMatrix();
//		Camera camera = new Camera();
//		camera.save();
//		camera.rotateY(45 * 1000);
//		camera.getMatrix(matrix);
//		camera.restore();
//		super.onDraw(canvas);
//	}
}
