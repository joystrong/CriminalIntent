package com.zyrs.criminalintent.model;

import java.util.Date;
import java.util.UUID;
/**
 * ������¼����
 * @author Administrator
 *
 */
public class Crime {

	private UUID mId;
	private String mTitle;
	private Date mDate;
	private boolean mSolved;
	
	public Crime() {
		mId = UUID.randomUUID();
		mDate = new Date();
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String title) {
		mTitle = title;
	}

	public UUID getId() {
		return mId;
	}

	public boolean isSolved() {
		return mSolved;
	}

	public void setSolved(boolean solved) {
		mSolved = solved;
	}

	public Date getDate() {
		return mDate;
	}
	
	@Override
	public String toString() {
		return getTitle();
	}
}
