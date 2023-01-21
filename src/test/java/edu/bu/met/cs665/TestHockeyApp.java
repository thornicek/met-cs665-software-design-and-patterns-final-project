package edu.bu.met.cs665;

import edu.bu.met.cs665.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestHockeyApp {
	
	/*
	 *  test of single instance of mediator object. Made to fail!
	 *  Can be obtained by the getMediator() but can't be instantiated 
	 */
	@Test
	public void testSingleton() {
		Mediator mediator = Mediator.getMediator();
		Mediator newMediator = new Mediator();
	}
	
	/*
	 * test for addPlayer()
	 */
	@Test
	public void testAdd() {
		 Mediator mediator = Mediator.getMediator();
		 ArrayList<HockeyPlayer> NHL = mediator.getList();
		 Forward Pastrnak = new Forward("David Pastrnak","Forward", 50, 37, 87, "Free Agent");
		 mediator.addPlayer(NHL, Pastrnak);
		 assertEquals(NHL.get(0).name, Pastrnak.name);
	}
	
	/*
	 * test for removePlayer()
	 */
	@Test
	public void testRemove() {
		 Mediator mediator = Mediator.getMediator();
		 ArrayList<HockeyPlayer> NHL = mediator.getList();
		 mediator.clearData(NHL);
		 Forward Pastrnak = new Forward("David Pastrnak","Forward", 50, 37, 87, "Free Agent");
		 mediator.addPlayer(NHL, Pastrnak);
		 mediator.removePlayer(Pastrnak);
		 assertEquals(0, NHL.size());
	}
	
	/*
	 *  test for updateTeamForward(), if the team gets updated
	 */
	@Test
	public void testChangeTeamForwardMediator() {
		 Mediator mediator = Mediator.getMediator();
		 ArrayList<HockeyPlayer> NHL = mediator.getList();
		 Forward Pastrnak = new Forward("David Pastrnak","Forward", 50, 37, 87, "Free Agent");
		 mediator.addPlayer(NHL, Pastrnak);
		 Team Boston = new Team("Boston Bruins");
		 mediator.updateTeamForward(NHL, Pastrnak, Boston);
		 
		 assertEquals("Boston Bruins", Pastrnak.getTeam());
		 
	}
	
	
	/*
	 *  test for updateTeamDefence(), if the team gets updated
	 */
	@Test
	public void testChangeTeamDefenceMediator() {
		 Mediator mediator = Mediator.getMediator();
		 ArrayList<HockeyPlayer> NHL = mediator.getList();
		 Defence Orr = new Defence("Bobby Orr", "Defence", 150, 70, "Free Agent");
		 mediator.addPlayer(NHL, Orr);
		 Team Boston = new Team("Boston Bruins");
		 mediator.updateTeamDefence(NHL, Orr, Boston);
		 
		 assertEquals("Boston Bruins", Orr.getTeam());
		 
	}
	
	/*
	 *  test for updateTeamGoalie(), if the team gets updated
	 */
	@Test
	public void testChangeTeamGoalieMediator() {
		 Mediator mediator = Mediator.getMediator();
		 ArrayList<HockeyPlayer> NHL = mediator.getList();
		 Goalie Vanecek = new Goalie("Vitek Vanecek","Goalie", 93.71, 2.36, "Free Agent");
		 mediator.addPlayer(NHL, Vanecek);
		 Team NewJersey = new Team("New Jersey");
		 mediator.updateTeamGoalie(NHL, Vanecek, NewJersey);
		 
		 assertEquals("New Jersey", Vanecek.getTeam());
		 
	}

}
