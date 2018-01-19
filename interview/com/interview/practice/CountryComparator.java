package com.interview.practice;

import java.util.Comparator;

public class CountryComparator implements Comparator<Average> {

	@Override
	public int compare(Average o1, Average o2) {
		int value1 = o1.getCountry().compareTo(o2.getCountry());
        if (value1 == 0) {
            int value2 = o1.getGender().compareTo(o2.getGender());
            if (value2 == 0) {
                return (int) (o1.getAmount() - o2.getAmount());
            } else {
                return value2;
            }
        }
        return value1;
	}
}
