package com.interview.practice;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Service {

	public static void main(String[] args) {
		
		String inputStr = null;
		List<Demography> demographies = null;
		Map<String,Double> map = null;
		List<Average> averages = null;
		
		//Read the input file and store the content to a String.
		try {
			inputStr = InputReader.readCSVtoString("D:/Algoworks/Algoworks/Algorithms/src/algorithm/interviews/PCInput.csv");
		} catch(Exception e) {
			e.printStackTrace();
		}	
		
		//Create a list of Demography Objects
		demographies = ObjectFactory.createDemographyObjects(inputStr);
		
		//Create a map for average demographic income
		map = ObjectFactory.AverageDemographicIncome(demographies);
		
		//Create final list of Average Objects
		averages = ObjectFactory.createAverageObjects(map);
		
		Collections.sort(averages, new CountryComparator());
		
		//Print Average Objects
		for(Average av : averages)
			System.out.println(av.toString());
	}

}
