package edu.bu.met.cs665;

import java.util.ArrayList;

/*
 * Mediator class, responsible for implementing the mediator pattern(between team and players)
 * Singleton pattern is implemented, as there is only one instance of the mediator in the whole project
 * Contains: addPlayer(), to add a player to the league database(ArrayList) and update state of the player,
 * removePlayer(), to remove a player from league database(ArrayList) and update state of player,
 * clearData(), to clear the contents of the league database(ArrayList),
 * printList(), to print the contents of the league database(ArrayList),
 * updateTeamForward(), updateTeamDefence(), updateTeamGoalie(), which implement the mediator pattern
 * and update the requested player to the requested team.
 */

public class Mediator {
	
	

	private ArrayList<HockeyPlayer> listOfPlayers = new ArrayList<HockeyPlayer>();
	
	// Singleton pattern
	private Mediator() {};
	
	private static Mediator mediator = new Mediator();
	
	public static Mediator getMediator() {
		return mediator;
	}
	
	// Methods to add/remove/update team, State pattern 
	public void addPlayer(ArrayList<HockeyPlayer> listOfPlayers, HockeyPlayer player) {
		listOfPlayers.add(player);
		Active activeState = new Active();
		activeState.sendUpdate(player);
		
	}
	
	public void removePlayer(HockeyPlayer player) {
		listOfPlayers.remove(player);
		RetireState retired = new RetireState();
		retired.sendUpdate(player);
		
	}
	
	public void clearData(ArrayList<HockeyPlayer> listOfPlayers) {
		listOfPlayers.clear();
	}
	
	// print the ArrayList
	public void printList(ArrayList<HockeyPlayer> listOfPlayers) {
		listOfPlayers.forEach((n) -> n.getStats());
	}
	
	
	// mediator pattern
	public void updateTeamForward(ArrayList<HockeyPlayer> listOfPlayers, Forward forward, Team team) {
		int index = listOfPlayers.indexOf(forward);
		Forward playerToUpdate =  (Forward) listOfPlayers.get(index);
		String newTeam = team.getName();
		playerToUpdate.setTeam(newTeam);
		
	}

	public void updateTeamDefence(ArrayList<HockeyPlayer> listOfPlayers, Defence defence, Team team) {
		int index = listOfPlayers.indexOf(defence);
		Defence playerToUpdate =  (Defence) listOfPlayers.get(index);
		String newTeam = team.getName();
		playerToUpdate.setTeam(newTeam);
	}
	
	public void updateTeamGoalie(ArrayList<HockeyPlayer> listOfPlayers, Goalie goalie, Team team) {
		int index = listOfPlayers.indexOf(goalie);
		Goalie playerToUpdate =  (Goalie) listOfPlayers.get(index);
		String newTeam = team.getName();
		playerToUpdate.setTeam(newTeam);
	}
	
	// method to get list
	public ArrayList<HockeyPlayer>getList(){
		return listOfPlayers;
	}

}
