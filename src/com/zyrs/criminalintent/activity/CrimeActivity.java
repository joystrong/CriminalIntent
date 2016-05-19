package com.zyrs.criminalintent.activity;

import com.zyrs.criminalintent.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
//为了支持低版本FragmeMent
public class CrimeActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crime);
		//获取管理Fragment的管理类FragmentManager
		FragmentManager fm = getSupportFragmentManager();
		//获取本fragment栈中fragment
		Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
		if(fragment ==null)
		{
			fragment = new CrimeFragment();
			fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
		}
		
	}
}
