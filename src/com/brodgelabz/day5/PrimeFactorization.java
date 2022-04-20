package com.brodgelabz.day5;

import java.util.HashSet;
import java.util.Scanner;

import utility.Util;

/*
 * This program is for finding prime factorization
 * of a given number
 * @author : Sadanand pandey
 */
public class PrimeFactorization {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		HashSet<Integer> hashSet = new HashSet<>();
		Util util = new Util();
		util.primeFactors(num, hashSet);
		util.display(hashSet);
	}
}
