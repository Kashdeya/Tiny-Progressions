package com.kashdeya.tinyprogressions.handlers;

import java.util.Random;

public class CanHandler {
	
	public static int randInt(int min, int max){
		
	    Random rand = new Random();
	    
	    int randomNum = rand.nextInt(max - min + 1) + min;
	    
	    return randomNum;
	  }
	
}
