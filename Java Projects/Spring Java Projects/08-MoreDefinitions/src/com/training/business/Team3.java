package com.training.business;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Team3 {

	String name;
	String captianName;
	Set<Player> players;

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

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team3 [name=" + name + ", captianName=" + captianName + ", players=" + players + "]";
	}




	

}
