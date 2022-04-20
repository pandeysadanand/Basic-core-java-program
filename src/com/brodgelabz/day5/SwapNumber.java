package com.brodgelabz.day5;

import java.util.Scanner;

import utility.Util;

public class SwapNumber {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number to swap : ");
		num1 = sc.nextInt();
		System.out.print("Enter second number to swap : ");
		num2 = sc.nextInt();
		Util util = new Util();
		util.swap(num1, num2);
	}

}
