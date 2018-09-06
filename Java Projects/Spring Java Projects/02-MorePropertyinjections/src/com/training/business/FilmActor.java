package com.training.business;

import java.util.Arrays;

public class FilmActor {

	
	String actorName;
	
	String[] hitMovies;

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String[] getHitMovies() {
		return hitMovies;
	}

	public void setHitMovies(String[] hitMovies) {
		this.hitMovies = hitMovies;
	}

	@Override
	public String toString() {
		return "FilmActor [actorName=" + actorName + ", hitMovies=" + Arrays.toString(hitMovies) + "]";
	}
	
	
}
