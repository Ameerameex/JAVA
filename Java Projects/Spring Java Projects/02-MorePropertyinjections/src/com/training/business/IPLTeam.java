package com.training.business;

import java.util.Set;

public class IPLTeam {

	String teamName;
	String captainName;
	Set<String> playerNames;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	public Set<String> getPlayerNames() {
		return playerNames;
	}
	public void setPlayerNames(Set<String> playerNames) {
		this.playerNames = playerNames;
	}
	@Override
	public String toString() {
		return "IPLTeam [teamName=" + teamName + ", captainName=" + captainName + ", playerNames=" + playerNames + "]";
	}
	
	
}
