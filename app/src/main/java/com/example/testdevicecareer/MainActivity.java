package com.example.testdevicecareer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		TelephonyManager manager = (TelephonyManager)this.getSystemService(Context.TELEPHONY_SERVICE);
		((TextView)findViewById(R.id.textview_id)).setText(manager.getSimOperator().toString());
		/*
		 * DOCOMO：44010
		 * SoftBank：44020
		 * Au：44070
		 */
	}
}
