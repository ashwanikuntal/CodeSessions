package com.interview.practice;

import java.util.Comparator;

public class AmountComparator implements Comparator<Average> {

	@Override
	public int compare(Average o1, Average o2) {
		if(o1.getAmount()<o2.getAmount())
			return 1;
		if(o1.getAmount()>o2.getAmount())
			return -1;
		else
			return 0;
	}

}
