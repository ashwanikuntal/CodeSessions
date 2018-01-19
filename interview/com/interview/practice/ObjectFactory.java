package com.interview.practice;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectFactory {
	
	public static List<Demography> createDemographyObjects(String str) {
		List<Demography> list  = new ArrayList<Demography>();
		String s[] = str.split(" ");
		for(String eachObj : s) {
			String objContent[] = eachObj.split(",");
			Demography demo = new Demography();
			for(int i=0; i<objContent.length; i++) {
				if(i==0)
					demo.setCity(objContent[i]);
				if(i==1)
					demo.setCountry(objContent[i]);
				if(i==2)
					demo.setGender(objContent[i].charAt(0));
				if(i==3)
					demo.setCurrency(objContent[i]);
				if(i==4)
					demo.setAmount(Double.parseDouble(currencyConverter(demo.getCurrency(), objContent[i])));	
			}
			list.add(demo);
		}
		return list;
	}
	
	public static String currencyConverter(String curr, String amt) {
		double amountUSD = 0.0; String amount = "";
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		switch(curr)  { 
		case "INR" :
			amountUSD = Double.parseDouble(amt)*(0.015);
			break;
		case "USD" :
			amountUSD = Double.parseDouble(amt);
			break;
		case "GBP" :
			amountUSD = Double.parseDouble(amt)*(1.30);
			break;
		case "Yuan" :
			amountUSD = Double.parseDouble(amt)*(0.15);
			break;
		default :
			break;
		}
		amount = String.valueOf(df.format(amountUSD));
		return amount;
	}
	
	public static Map<String,Double> AverageDemographicIncome(List<Demography> list) {
		Map<String,Double> map = new HashMap<String,Double>();
		for(Demography demo : list) {
			String key = demo.getCountry() + "," + demo.getGender();
			Double value = demo.getAmount();
			
			if(!map.containsKey(key)) {
				map.put(key, value);
			} else {
				double newVal = (map.get(key) + value)/2;
				map.put(key, newVal);
			}
		}
		return map;
	}
	
	public static List<Average> createAverageObjects(Map<String,Double> map) {
		List<Average> list = new ArrayList<Average>();
		for(Map.Entry<String, Double> m : map.entrySet()) {
			Average av = new Average();
			String key[] = m.getKey().split(",");
			for(int i=0; i<key.length; i++) {
				if(i==0)
					av.setCountry(key[i]);
				else
					av.setGender(key[i]);
			}
			av.setAmount(m.getValue());
			list.add(av);
		}
		return list;
	}

}
