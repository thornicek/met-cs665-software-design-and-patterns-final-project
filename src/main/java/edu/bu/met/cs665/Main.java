package edu.bu.met.cs665;

import java.util.ArrayList;

/*
 * Main class used for running the application 
 */

public class Main {
	public static void main(String args[]) {
	  Mediator mediator = Mediator.getMediator();
	  ArrayList<HockeyPlayer> NHL = mediator.getList();
	  
	  Forward Pastrnak = new Forward("David Pastrnak","Forward", 50, 37, 87, "Free Agent");
	  Defence Orr = new Defence("Bobby Orr", "Defence", 150, 70, "Free Agent");
	  Goalie Vanecek = new Goalie("Vitek Vanecek","Goalie", 93.71, 2.36, "Free Agent");
	  
	  
	  mediator.addPlayer(NHL, Pastrnak);
	  mediator.addPlayer(NHL, Orr);
	  mediator.addPlayer(NHL, Vanecek);

	
	  
	  mediator.printList(NHL);
	  
	  Team Boston = new Team("Boston Bruins");
	  Team NewJersey = new Team("New Jersey");
	  

	  mediator.updateTeamForward(NHL, Pastrnak, Boston);
	  mediator.updateTeamDefence(NHL, Orr, Boston);
	  mediator.updateTeamGoalie(NHL, Vanecek, NewJersey);
	  
	  mediator.printList(NHL);
	  
	  mediator.removePlayer(Vanecek);
	  
	  
	  
	  
	}
}
