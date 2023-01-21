package edu.bu.met.cs665;
/*
 * Team class representing Hockey teams in the league
 * Used to create Team objects
 */
public class Team {
	private String name;
	
	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
