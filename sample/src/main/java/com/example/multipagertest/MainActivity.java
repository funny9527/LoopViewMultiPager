package com.example.multipagertest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.loop.multi.pager.Pager;
import com.loop.multi.pager.ScrollPanel;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initUi();
	}
	
	private void initUi() {
		ScrollPanel panel = (ScrollPanel) findViewById(R.id.panel);
		Pager p = panel.addPage(R.layout.page_item);
		p.setBackgroundColor(Color.DKGRAY);

		p = panel.addPage(R.layout.page_item);
		p.setBackgroundColor(Color.WHITE);
	}
}
