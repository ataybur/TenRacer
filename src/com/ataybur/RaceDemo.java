package com.ataybur;

public class RaceDemo {

	public static void main(String[] args) {
		Racer racer = new Racer();
		for(int i = 1; i<= 10;i++){
			new Thread(racer,String.valueOf(i)).start();;
		}
//		Thread tortoiseThread = new Thread(racer,"Tortoise");
//		Thread hareThread = new Thread(racer,"Hare");
//		tortoiseThread.start();
//		hareThread.start();

	}

}
