package com.tcs.day14;

public class Details implements Comparable<Details> {
	private String name;
	private String batch;
	private String disease;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public int compareTo(Details o) {
		// TODO Auto-generated method stub
		if (cost == o.cost)
		{
			return 0;
		}
		else if(cost > o.cost)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	}

