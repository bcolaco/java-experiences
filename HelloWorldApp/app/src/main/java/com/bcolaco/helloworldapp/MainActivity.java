package com.bcolaco.helloworldapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.view.inputmethod.*;

public class MainActivity extends Activity 
{
	private EditText editText;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		editText = (EditText) findViewById(R.id.edit_message);
		
		editText.setOnEditorActionListener(new EditText.OnEditorActionListener() {
			@Override
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
				boolean handled = false;
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
		new AlertDialog.Builder(this)
			.setTitle(R.string.message)
			.setMessage(editText.getText().toString())
			.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int which) { 
				}
			})
			.setIcon(android.R.drawable.ic_dialog_alert)
			.show();
	}
}

