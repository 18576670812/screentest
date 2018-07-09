package com.example.screentest;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity{
    TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);
        
	}
	
	@Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        android.util.Log.i("ScreenTest", "newConfig.orientation: " + newConfig.orientation);
        android.util.Log.i("ScreenTest", "ORIENTATION_LANDSCAPE: " + Configuration.ORIENTATION_LANDSCAPE);
        android.util.Log.i("ScreenTest", "ORIENTATION_PORTRAIT: " + Configuration.ORIENTATION_PORTRAIT);
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            tv.setText("∫·∆¡");
        }else{
            tv.setText(" ˙∆¡");
        }
        
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
