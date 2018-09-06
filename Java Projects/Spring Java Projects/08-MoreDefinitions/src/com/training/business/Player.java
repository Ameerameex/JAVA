package com.training.business;

public class Player {

	String name;
	int age;
	int runsScored,wicketsTaken;
	boolean captain;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
	public int getWicketsTaken() {
		return wicketsTaken;
	}
	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}
	public boolean isCaptain() {
		return captain;
	}
	public void setCaptain(boolean captain) {
		this.captain = captain;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", runsScored=" + runsScored + ", wicketsTaken=" + wicketsTaken
				+ ", captain=" + captain + "]";
	}
	
	
	
	
}
