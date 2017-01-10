package com.bcolaco.helloworldapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 
{
	public final static String EXTRA_MESSAGE = "com.bcolaco.helloworldapp.MESSAGE";
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	public void submitMessage(View view)
	{
		Intent intent = new Intent(this, DisplayActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
	}
}

