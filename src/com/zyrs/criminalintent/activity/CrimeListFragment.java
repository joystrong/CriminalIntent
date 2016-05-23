package com.zyrs.criminalintent.activity;

import java.util.ArrayList;
import com.zyrs.criminalintent.R;
import com.zyrs.criminalintent.model.Crime;
import com.zyrs.criminalintent.model.CrimeLab;
import com.zyrs.criminalintent.util.DateFormats;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

/**
 * CrimeListFragment
 * 犯错列表Fragment
 * @author Administrator
 *
 */
public class CrimeListFragment extends ListFragment {

	private ArrayList<Crime> mCrimes;
	public static final int REQUEST_CRIME = 1;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActivity().setTitle(R.string.crimes_title);
		mCrimes = CrimeLab.get(getActivity()).getCrimes();
		CrimeAdapter adapter = new CrimeAdapter();//自定义适配器
		setListAdapter(adapter);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Crime crime = ((CrimeAdapter)getListAdapter()).getItem(position);
		//Log.d("CrimeList", crime.getTitle());
		//打开详情页
		Intent i = new Intent(getActivity(),CrimePagerActivity.class);
		i.putExtra("uuid", crime.getId());
		//startActivity(i);
		startActivityForResult(i, REQUEST_CRIME);
	}
	
	/**
	 * 自定义适配器
	 * @author Administrator
	 *
	 */
	public class CrimeAdapter extends ArrayAdapter<Crime>{

		public CrimeAdapter() {
			super(getActivity(), 0, mCrimes);
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if(convertView == null)
			{
				convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item_crime,null);
			}
			Crime c = getItem(position);
			TextView titleTextView = (TextView)convertView.findViewById(R.id.crime_list_itme_titleTextView);
			TextView dateTextView = (TextView)convertView.findViewById(R.id.crime_list_item_dateTextView);
			CheckBox slovedCheckBox = (CheckBox)convertView.findViewById(R.id.crime_list_item_slovedCheckBox);
			titleTextView.setText(c.getTitle());
			dateTextView.setText(DateFormats.getLocalDate(c.getDate()));
			slovedCheckBox.setChecked(c.isSolved());
			return convertView;
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		((CrimeAdapter)getListAdapter()).notifyDataSetChanged();
	}
	
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(requestCode == REQUEST_CRIME)
		{
			
		}
	}
}
