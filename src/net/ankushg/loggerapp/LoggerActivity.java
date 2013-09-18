package net.ankushg.loggerapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class LoggerActivity extends Activity {
	private static final String TAG = "LoggerActivity";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Log.d(TAG, "THIS IS MY LOGGING LINE --- IT'S GREAT FOR DEBUGGING");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG, "I got onPause!!!");
	}
}
