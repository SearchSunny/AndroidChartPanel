package com.example.androidchartpanel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
/**
 * Android上实现柱状图算法实现
 * @author miaowei
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		//setContentView(new BarChartPanel(this,"Quarter Vs. sales volume"));
		
		setContentView(new BarChartPanel(this,"Android上实现柱状图算法实现"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
