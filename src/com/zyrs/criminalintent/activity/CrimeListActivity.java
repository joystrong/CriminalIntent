package com.zyrs.criminalintent.activity;

import android.support.v4.app.Fragment;

/**
 * CrimeListActivity
 * �����б�Activity
 * @author Administrator
 *
 */
public class CrimeListActivity extends SingleFragmentActivity {

	@Override
	public Fragment createFragment() {
		return new CrimeListFragment();
	}

}
