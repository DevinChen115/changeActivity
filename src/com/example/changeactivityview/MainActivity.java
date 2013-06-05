package com.example.changeactivityview;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button changeActivity = (Button)findViewById(R.id.button1);
		changeActivity.setOnClickListener(new changeActivieyListener());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private class changeActivieyListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			EditText etText = (EditText)findViewById(R.id.etText);
			Intent i = new Intent();
			i.setClass(MainActivity.this, SecondActivity.class);
			String sourceText = etText.getText().toString();
			i.putExtra("source", sourceText);
			startActivity(i);
		}
		
	}

}
