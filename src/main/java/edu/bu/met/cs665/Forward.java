package edu.bu.met.cs665;

/*
 * Forward class, responsible for creating forward objects.
 * Implements the Strategy class and inherits from HockeyPlayer class.
 * Contains Forward constructor, and overrides the getStats(), to present forward stats, as a part of 
 * Strategy pattern.
 */

public class Forward extends HockeyPlayer implements Strategy{
	String name;
	String position;
	private int assist;
	private int goal;
	private int points;
	private String team;
	
	public Forward(String name, String position, int goal, int assist,  int points, String team) {
		super(name, position, team);
		this.setAssist(assist);
		this.setGoal(goal);
		this.setPoints(points);
		this.name = name;
		this.position = position;
		this.team = team;
	
	}
	
	
	@Override
	public void getStats() {
		System.out.println("Name: "+ this.name+ ", Position: "+ this.position+ ", Goals: "+ this.getGoal()
		+ ", Assists: "+ this.getAssist()+ ", Points: "+ this.getPoints()+ ", Team: "+ this.getTeam());
	}
	

	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
	}


	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}


	public int getGoal() {
		return goal;
	}



	public void setGoal(int goal) {
		this.goal = goal;
	}


	public int getAssist() {
		return assist;
	}


	public void setAssist(int assist) {
		this.assist = assist;
	}

}
