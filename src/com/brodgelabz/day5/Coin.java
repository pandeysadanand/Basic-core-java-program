package com.brodgelabz.day5;

import java.util.Random;
/*
 * This program for coin toss, it ccount number of head and tails getting
 * @author : Sadnand Pandey
 */

class Flip_Coin {
	public String chanceFunc() {
		Random ran = new Random();
		int chance = ran.nextInt(2);
		if (chance == 1) {
			return "tail";
		} else {
			return "head";
		}
	}
}

public class Coin {
	public static void main(String[] args) {
		Flip_Coin flcn = new Flip_Coin();
		int tail = 0, head = 0;
		int chance = 10;
		for (int i = 1; i <= chance; i++) {
			if (flcn.chanceFunc().equals("tail")) {
				tail++;
			} else {
				head++;
			}
		}
		System.out.println("Chances = " + chance);
		System.out.println("Heads : " + head);
		System.out.println("Tails : " + tail);
	}
}
