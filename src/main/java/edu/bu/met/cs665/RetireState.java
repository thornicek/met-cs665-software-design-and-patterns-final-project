package edu.bu.met.cs665;

/*
 * RetireState class, which implements the State interface.
 * Is part of the State design pattern and it overrides the 
 * sendUpdate() State method, to display the state of a retired 
 * player.
 */

public class RetireState implements State{

	
	
	@Override
	public void sendUpdate(HockeyPlayer player) {
		System.out.println(player.name + " has retired from the league");
		
	}
	
	
	
}
