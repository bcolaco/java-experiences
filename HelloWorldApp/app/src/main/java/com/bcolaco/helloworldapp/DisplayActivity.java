package com.bcolaco.helloworldapp;

import android.app.*;
import android.os.*;
import android.content.*;
import android.widget.*;
import android.view.*;

public class DisplayActivity extends Activity
{
	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
		
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		TextView textView = (TextView)findViewById(R.id.display_message);
		textView.setText(message);
    }
	
	public void back(View view) {
		finish();
	}
}
