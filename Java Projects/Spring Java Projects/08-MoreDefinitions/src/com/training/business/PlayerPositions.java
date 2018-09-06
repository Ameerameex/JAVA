package com.training.business;

import java.util.Map;

public class PlayerPositions {

	int year;
	Map<String,Player> postionMap;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Map<String, Player> getPostionMap() {
		return postionMap;
	}
	public void setPostionMap(Map<String, Player> postionMap) {
		this.postionMap = postionMap;
	}
	@Override
	public String toString() {
		return "PlayerPositions [year=" + year + ", postionMap=" + postionMap + "]";
	}
	
	
	
}
