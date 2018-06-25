package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("Acyivity01", "onCreate()");
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
	Log.i("Acyivity01", "onstart()");
}


@Override
protected void onRestart() {
	// TODO Auto-generated method stub
	super.onRestart();
	Log.i("Acyivity01", "onRestart()");
}

@Override
protected void onResume() {
	// TODO Auto-generated method stub
	super.onResume();
	Log.i("Acyivity01", "onResume()");
}

@Override
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	Log.i("Acyivity01", "onPause()");
}

@Override
protected void onStop() {
	// TODO Auto-generated method stub
	super.onStop();
	Log.i("Acyivity01", "onStop()");
}

@Override
protected void onDestroy() {
	// TODO Auto-generated method stub
	super.onDestroy();
	Log.i("Acyivity01", "onDestroy()");
}

      public  void  click(View  view)
  {
	        Intent   intent=new Intent(this,Activity02.class);
	        startActivity(intent);
  }
}
