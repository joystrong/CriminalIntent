package com.zyrs.criminalintent.activity;

import android.support.v4.app.Fragment;

/**
 * CrimeListActivity
 * ∑∏¥Ì¡–±ÌActivity
 * @author Administrator
 *
 */
public class CrimeListActivity extends SingleFragmentActivity {

	@Override
	public Fragment createFragment() {
		return new CrimeListFragment();
	}

}
