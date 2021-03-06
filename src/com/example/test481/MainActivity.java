package com.example.test481;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TextView name = (TextView)findViewById(R.id.textView1);
		final Button changeName = (Button)findViewById(R.id.button1);
		changeName.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				name.setText(R.string.hello_world2);
				changeName.setText("Name Changed!");
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
