package com.bcolaco.helloworldapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.util.*;
import android.view.inputmethod.*;

public class MainActivity extends Activity 
{
	private static final String TAG = "HelloWorldApp";
	private EditText editText;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		Log.v(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		editText = (EditText) findViewById(R.id.edit_message);
		
		editText.setOnEditorActionListener(new EditText.OnEditorActionListener() {
			@Override
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
				Log.v(TAG, "onEditorAction");
				boolean handled = false;
				Log.v(TAG, "actionId=" + actionId);
				if (actionId == EditorInfo.IME_ACTION_SEND) {
					submitMessage(v);
					handled = true;
				}
				return handled;
			}
		});
    }
	
	public void submitMessage(View view)
	{
		Log.v(TAG, "submitMessage");
		new AlertDialog.Builder(this)
			.setTitle(R.string.message)
			.setMessage(editText.getText().toString())
			.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int which) {
					Log.v(TAG, "onClick");
				}
			})
			.setIcon(android.R.drawable.ic_dialog_alert)
			.show();
	}
}

