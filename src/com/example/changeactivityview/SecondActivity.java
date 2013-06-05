package com.example.changeactivityview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	

		setContentView(R.layout.activity_second);
		
		TextView tv = (TextView)findViewById(R.id.helloWorld);
		Bundle params = getIntent().getExtras();
		System.out.println("start get extra");
		String getParam = params.getString("source");
		System.out.println(getParam);
		tv.setText(getParam);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
