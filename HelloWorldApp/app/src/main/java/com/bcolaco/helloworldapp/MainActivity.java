package com.bcolaco.helloworldapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 
{
	//public final static String EXTRA_MESSAGE = "com.bcolaco.helloworldapp.MESSAGE";
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	public void submitMessage(View view)
	{
		EditText editText = (EditText) findViewById(R.id.edit_message);
		
		/*Intent intent = new Intent(this, DisplayActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);*/
		
		new AlertDialog.Builder(this)
			.setTitle(R.string.message)
			.setMessage(editText.getText().toString())
			.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int which) { 
					// continue with delete
				}
			})
			/*.setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int which) { 
					// do nothing
				}
			})*/
			.setIcon(android.R.drawable.ic_dialog_alert)
			.show();
	}
}

