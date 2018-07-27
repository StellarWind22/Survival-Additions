package com.crimsondawn45.survivaladditions.util;

import java.text.DecimalFormat;
import java.util.Random;

public class DiceRoll {
	
	//for simple things such as a random 1 in 3 chance
	public static boolean probCheck(int min, int max) {
		Random r = new Random();
		int i =  r.nextInt((max - min) + 1) + min;
		if(i == max) {
			return true;
		}
		return false;
	}
	
	//for generating a random integer within a range anywhere in the code
	public static int genRandInt(int min, int max) {
		Random r = new Random();
		int i = r.nextInt((max - min) + 1) + min;
		return i;
	}
	
	//gen random double value
	public static double genRandDoub(double max) {
		Random r = new Random();
		double i = r.nextDouble() * max;
		if(i < 0.05) {
			i = i + 0.1;
		}
		return i;
	}
	
	//gen random float value
	public static float genRandFlot(float max) {
		Random r = new Random();
		float i = r.nextFloat() * max;
		if(i < 0.05F) {
			i = i + 0.1F;
		}
		return i;
	}
	
	//randomly inverts a integer value
	public static int randInvertInt(int num) {
		Random r = new Random();
		boolean rb = r.nextBoolean();
		if(rb) {
			return -num;
		} else {
			return num;
		}
	}
	
	//randomly inverts a double value
	public static double randInvertDoub(double num) {
		Random r = new Random();
		boolean rb = r.nextBoolean();
		if(rb) {
			return -num;
		} else {
			return num;
		}
	}
	
	//generates a random boolean value ~= 50% chance
	public static boolean genRandBool() {
		Random r = new Random();
		boolean i = r.nextBoolean();
		return i;
	}
	
	//imput a number range of seconds calculates a effect duration for entity.addPotionEffect 1 sec ~= 21.4
	public static int genRandEffectDurSecs(int min, int max) {
		Random r = new Random();
		int i =  r.nextInt((max - min) + 1) + min;
		return i * 21;
	}
}
