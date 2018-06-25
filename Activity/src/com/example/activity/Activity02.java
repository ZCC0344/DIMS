package com.example.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class Activity02 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity02);
		Log.i("Acyivity02", "onCreate()");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("Acyivity02", "onstart()");
	}


	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("Acyivity02", "onRestart()");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("Acyivity02", "onResume()");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("Acyivity02", "onPause()");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("Acyivity02", "onStop()");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("Acyivity02", "onDestroy()");
	}
}
