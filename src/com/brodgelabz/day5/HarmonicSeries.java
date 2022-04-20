package com.brodgelabz.day5;

import java.util.Scanner;
import utility.*;

public class HarmonicSeries {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		Util util = new Util();
		System.out.println(util.nthHarmonic(num));
	}

}
