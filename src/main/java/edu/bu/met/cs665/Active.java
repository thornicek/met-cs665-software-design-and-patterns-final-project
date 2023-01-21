package edu.bu.met.cs665;

/*
 * Active class, which implements the State interface.
 * Is part of the State design pattern and it overrides the 
 * sendUpdate() State method, to display the state of an active  
 * player in the league.
 */


public class Active implements State{
	
	
	@Override
	public void sendUpdate(HockeyPlayer player) {
		System.out.println(player.name + " is an active player in the league");
		
	}
	

	

}
