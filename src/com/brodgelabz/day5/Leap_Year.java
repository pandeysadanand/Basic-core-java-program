package com.brodgelabz.day5;

import java.util.Scanner;

import utility.Util;

/*
 * This program is for checking that given year is leap year or not
 * @author : Sadanand pandey
 */
public class Leap_Year {

	public static void main(String[] args) {
		int year = 0;
		Util util = new Util();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check leap year...");
		year = sc.nextInt();
		util.year(year);

	}

}
