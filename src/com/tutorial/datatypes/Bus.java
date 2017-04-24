package com.tutorial.datatypes;


public class Bus {

	public static void main(String[] args) {

		int stop =0;
		int fare =0;
		
		stop = stop + 1;
		fare = fare + 3;
		stop = stop +1;
		fare = fare + 5; 
		
		System.out.println(stop);
		System.out.println(fare);
		System.out.println("The Bus earned $"+fare+ " by end of " +stop+ " Stops");

	}

}
