package edu.bu.met.cs665;

/*
 * Defence class, responsible for creating defenceman objects.
 * Implements the Strategy class and inherits from HockeyPlayer class.
 * Contains Defence constructor, and overrides the getStats(), to present defenceman stats, as a part of 
 * Strategy pattern.
 */

public class Defence extends HockeyPlayer implements Strategy{
	String name;
	String position;
	private int hits;
	private int blockedShots;
	private String team;
	
	public Defence(String name, String position, int hits, int blockedShots, String team) {
		super(name, position, team);
		this.hits = hits;
		this.blockedShots = blockedShots;
		this.name = name;
		this.position = position;
		this.team = team;
	}

	@Override
	public void getStats() {
		System.out.println("Name: "+ this.name+ ", Position: "+ this.position+ ", Hits: "+ this.getHits()
		+ ", Blocked Shots: "+ this.getBlockedShots()+ ", Team: "+ this.getTeam());
		
		
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getBlockedShots() {
		return blockedShots;
	}

	public void setBlockedShots(int blockedShots) {
		this.blockedShots = blockedShots;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	
}
