package com.zyrs.criminalintent.activity;

import java.util.UUID;

import android.support.v4.app.Fragment;
/**
 * CrimeActivity
 * ������Ϣ����ҳActivity
 * Ϊ��֧�ֵͰ汾FragmeMent
 * @author Administrator
 *@deprecated
 *ʹ��CrimePagerActivity����
 */
public class CrimeActivity extends SingleFragmentActivity {

	@Override
	public Fragment createFragment() {
		UUID crime_id = (UUID)getIntent().getSerializableExtra("uuid");
		return CrimeFragment.newInstance(crime_id);
	}

}
