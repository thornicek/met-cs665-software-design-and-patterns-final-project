package edu.bu.met.cs665;

/*
 * State interface responsible for the State Design Pattern
 * Contains sendUpdate() to be overriden
 */

public interface State {
	

	void sendUpdate(HockeyPlayer player);
	
	
}
