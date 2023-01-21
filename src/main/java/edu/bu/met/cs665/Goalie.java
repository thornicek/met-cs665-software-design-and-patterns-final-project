package edu.bu.met.cs665;

/*
 * Goalie class, responsible for creating goalie objects.
 * Implements the Strategy class and inherits from HockeyPlayer class.
 * Contains Goalie constructor, and overrides the getStats(), to present goalie stats, as a part of 
 * Strategy pattern.
 */

public class Goalie extends HockeyPlayer implements Strategy{
	String name;
	String position;
	private double saveAverage;
	private double goalsAgainstAverage;
	private String team;
	
	
	public Goalie(String name, String position, double saveAverage, double goalsAgainstAverage, String team) {
		super(name, position, team);
		this.saveAverage = saveAverage;
		this.goalsAgainstAverage = goalsAgainstAverage;
		this.name = name;
		this.position = position;
		this.team = team;
		
	}
	
	@Override
	public void getStats() {
		System.out.println("Name: "+ this.name+ ", Position: "+ this.position+ ", Save Average: "+ this.getSaveAverage()
		+ "%, Goals Against Average: "+ this.getGoalsAgainstAverage()+ ", Team: "+ this.getTeam());
		
	}
	
	public double getSaveAverage() {
		return saveAverage;
	}
	
	public void setSaveAverage(float saveAverage) {
		this.saveAverage = saveAverage;
	}
	
	public double getGoalsAgainstAverage() {
		return goalsAgainstAverage;
	}
	public void setGoalsAgainstAverage(float goalsAgainstAverage) {
		this.goalsAgainstAverage = goalsAgainstAverage;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	

}
