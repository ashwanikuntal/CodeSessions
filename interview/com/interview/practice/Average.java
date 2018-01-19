package com.interview.practice;

public class Average implements Comparable<Average> {
	
	private String country;
	private String gender;
	private double amount;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Average [country=" + country + ", gender=" + gender + ", amount=" + amount + "]";
	}

	@Override
	public int compareTo(Average o) {
		return (int) (this.getAmount() - o.getAmount());
	}

}
