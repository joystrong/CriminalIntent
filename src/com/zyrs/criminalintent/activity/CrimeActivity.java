package com.zyrs.criminalintent.activity;

import java.util.UUID;

import android.support.v4.app.Fragment;
/**
 * CrimeActivity
 * 犯错信息详情页Activity
 * 为了支持低版本FragmeMent
 * @author Administrator
 *@deprecated
 *使用CrimePagerActivity代替
 */
public class CrimeActivity extends SingleFragmentActivity {

	@Override
	public Fragment createFragment() {
		UUID crime_id = (UUID)getIntent().getSerializableExtra("uuid");
		return CrimeFragment.newInstance(crime_id);
	}

}
