package org.liushui.mycommons.android.base;

import org.liushui.mycommons.android.log.McLog;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

/**
 * Title: BaseActivity.java<br>
 * author:xiaqiulei@gmail.com <br>
 * Date: 2013-1-22<br>
 * Version:v1.0
 */
public abstract class BaseActivity extends Activity {

	protected Context context;

	/**
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		context = this;
		McLog.m(this, "onCreate");
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onStart()
	 */
	protected void onStart() {
		super.onStart();
		McLog.m(this, "onStart");
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onResume()
	 */
	protected void onResume() {
		super.onResume();
		McLog.m(this, "onResume");
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onPause()
	 */
	protected void onPause() {
		super.onPause();
		McLog.m(this, "onPause");
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onStop()
	 */
	protected void onStop() {
		super.onStop();
		McLog.m(this, "onStop");
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onDestroy()
	 */
	protected void onDestroy() {
		super.onDestroy();
		McLog.m(this, "onDestroy");
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onRestart()
	 */
	protected void onRestart() {
		super.onRestart();
		McLog.m(this, "onRestart");
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onConfigurationChanged(android.content.res.Configuration)
	 */
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		McLog.m(this, "onConfigurationChanged");
	}
}