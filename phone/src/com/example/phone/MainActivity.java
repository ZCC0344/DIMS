package com.example.phone;



import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{
     private   Button  but1,but2,but3,but4,but5,but6,but7,but8,but9,but10,but11,but12,but13;
     EditText editText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		editText = (EditText)findViewById(R.id.editText1);
		
		but1=(Button) findViewById(R.id.button2);  
		but2=(Button) findViewById(R.id.button3);  
		but3=(Button) findViewById(R.id.button4);
		but4=(Button) findViewById(R.id.button5);
		but5=(Button) findViewById(R.id.button1);
		but6=(Button) findViewById(R.id.button6);
		but7=(Button) findViewById(R.id.button7);
		but8=(Button) findViewById(R.id.button8);
		but9=(Button) findViewById(R.id.button9);  //#
		but10=(Button) findViewById(R.id.button10);  //0
		but11=(Button) findViewById(R.id.button11);   //9
		but12=(Button) findViewById(R.id.button12);    //*
		but13=(Button) findViewById(R.id.button13);    //拨打
		but1.setOnClickListener((android.view.View.OnClickListener) this);
		but2.setOnClickListener((android.view.View.OnClickListener) this);
		but3.setOnClickListener((android.view.View.OnClickListener) this);
		but4.setOnClickListener((android.view.View.OnClickListener) this);
		but5.setOnClickListener((android.view.View.OnClickListener) this);
		but6.setOnClickListener((android.view.View.OnClickListener) this);
		but7.setOnClickListener((android.view.View.OnClickListener) this);
		but8.setOnClickListener((android.view.View.OnClickListener) this);
		but9.setOnClickListener((android.view.View.OnClickListener) this);
		but10.setOnClickListener((android.view.View.OnClickListener) this);
		but11.setOnClickListener((android.view.View.OnClickListener) this);
		but12.setOnClickListener((android.view.View.OnClickListener) this);
		but13.setOnClickListener((android.view.View.OnClickListener) this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case  R.id.button1 :
		     editText.setText(editText.getText()+but5.getText().toString());
		     editText.setSelection(editText.getText().length());
		     break;
		case  R.id.button2 :
		     editText.setText(editText.getText()+but1.getText().toString());
		     editText.setSelection(editText.getText().length());
		     break;
		case  R.id.button3:
			 editText.setText(editText.getText()+but2.getText().toString());
			 editText.setSelection(editText.getText().length());
			 break;
		case  R.id.button4:
			 editText.setText(editText.getText()+but3.getText().toString());
			 editText.setSelection(editText.getText().length());
			 break;
		case  R.id.button5:
			 editText.setText(editText.getText()+but4.getText().toString());
			 editText.setSelection(editText.getText().length());
			 break;
		case  R.id.button6:
			 editText.setText(editText.getText()+but6.getText().toString());
			 editText.setSelection(editText.getText().length());
			 break;
		case  R.id.button7:
			 editText.setText(editText.getText()+but7.getText().toString());
			 editText.setSelection(editText.getText().length());
			 break;
		case  R.id.button8:
			 editText.setText(editText.getText()+but8.getText().toString());
			 editText.setSelection(editText.getText().length());
			 break;
		case  R.id.button9:
			 editText.setText(editText.getText()+but9.getText().toString());
			 editText.setSelection(editText.getText().length());
			 break;
		case  R.id.button10:
			 editText.setText(editText.getText()+but10.getText().toString());
			 editText.setSelection(editText.getText().length());
			 break;
		case  R.id.button11:
			 editText.setText(editText.getText()+but11.getText().toString());
			 editText.setSelection(editText.getText().length());
			 break;
		case  R.id.button12:
			 editText.setText(editText.getText()+but12.getText().toString());
			 editText.setSelection(editText.getText().length());
			 break;
		case R.id.button13:
	        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+ editText.getText()));//显式意图
	               /*
	               intent.setAction("android.intent.action.CALL");
	         intent.setData(Uri.parse("tel:"+ number));
	                */
	        startActivity(intent);    //开启Activity
			break;
		
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
