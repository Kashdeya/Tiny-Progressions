package com.kashdeya.tinyprogressions.util;

import java.util.Random;

public class CanUtil {
	
	public static int randInt(int min, int max){
		
	    Random rand = new Random();
	    
	    int randomNum = rand.nextInt(max - min + 1) + min;
	    
	    return randomNum;
	  }
	
}