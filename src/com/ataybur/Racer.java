package com.ataybur;

public class Racer implements Runnable {
public static String winner;
	
	public void race(){
		String racerName = Thread.currentThread().getName();
		for(int distance = 1; distance<= 100; distance++){
			System.out.printf("Distance Covered By %s is %d. \n", racerName, distance);
			isRaceWon(distance);
		}
		showResult(racerName);
	}
	
	private boolean isRaceWon(int totalDistanceCovered){
		boolean isRaceWon = false;
		if((Racer.winner == null) && totalDistanceCovered == 100){
			String winnerName = Thread.currentThread().getName();
			Racer.winner = winnerName;
			isRaceWon = true;
		} else if (Racer.winner == null){
			isRaceWon = false;
		} else if (Racer.winner != null){
			isRaceWon = true;
		}
		return isRaceWon;
	}
	
	public void showResult(String racerName){
		String message;
		if((winner != null) && racerName.equals(winner)){
			message = "Winner is %s \n";
		} else {
			message = "%s is completed the race \n";
		}
		System.out.printf(message, racerName);
	}
	
	@Override
	public void run() {
		this.race();
	}
}
