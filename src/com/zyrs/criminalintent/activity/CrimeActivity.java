package com.zyrs.criminalintent.activity;

import com.zyrs.criminalintent.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
//Ϊ��֧�ֵͰ汾FragmeMent
public class CrimeActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crime);
		//��ȡ����Fragment�Ĺ�����FragmentManager
		FragmentManager fm = getSupportFragmentManager();
		//��ȡ��fragmentջ��fragment
		Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
		if(fragment ==null)
		{
			fragment = new CrimeFragment();
			fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
		}
		
	}
}
