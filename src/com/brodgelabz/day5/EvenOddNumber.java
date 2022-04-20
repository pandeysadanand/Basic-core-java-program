package com.brodgelabz.day5;

import java.util.Scanner;

import utility.Util;

public class EvenOddNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter numer : ");
		num = sc.nextInt();
		Util util = new Util();
		util.display(num);
	}
}
