package com.training.business;

import java.util.Arrays;
import java.util.List;

public class Team {

	String name;
	String captianName;
	Player[] players;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCaptianName() {
		return captianName;
	}

	public void setCaptianName(String captianName) {
		this.captianName = captianName;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", captianName=" + captianName + ", players=" + Arrays.toString(players) + "]";
	}



	

}
