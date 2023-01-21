package edu.bu.met.cs665;
/*
 * HockeyPlayer abstract class, responsible for the Factory design pattern;
 * used to create Forward, Defence and Goalie objects.
 * Implements Strategy and has State object, with setters and getters, ensuring
 * the children of the class have access and can implement the State and Strategy patterns.
 */

public abstract class HockeyPlayer implements Strategy{
	String name;
	String position;
	String teams;
	
	State state;
	
	public HockeyPlayer(String name, String position, String teams) {
		this.name = name;
		this.position = position;
		this.teams = teams;
	}
	
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}

	@Override
	public void getStats() {
		
	}
	
}
