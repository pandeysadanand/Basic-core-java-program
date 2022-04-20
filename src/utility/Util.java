package utility;

import java.util.HashSet;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Util {
	int year;

	public void year(int year) {
		int length = String.valueOf(year).length();
		if (length == 4) {
			if (year >= 1532) {
				if ((year % 400 == 0) || (year % 4 == 0)) {
					System.out.println(year + " is a leap year. ");

				} else {
					System.out.println(year + " is not leap year.");
				}
			} else {
				System.out.println("Please enter valid year..");
			}
		}
	}

	public static float nthHarmonic(int num) {
		float harmonic = 1;
		if (num > 0) {
			for (int i = 2; i <= num; i++) {
				harmonic += (float) 1 / i;
			}
		} else {
			System.out.println("Enter number greater than 0.");
		}
		return harmonic;
	}
/*==============================================================
 * Factors business logic
 * =============================================================
 */
	public static void primeFactors(int num, HashSet<Integer> hashSet) {
		while (num % 2 == 0) {
			hashSet.add(2);
		}
		for (int i = 3; i < Math.sqrt(num); i += 2) {
			while (num % i == 0) {
				hashSet.add(i);
				num /= i;
			}
		}
		if (num > 2)
			hashSet.add(num);
	}
	public static void display(HashSet<Integer> hashSet) {
		java.util.Iterator<Integer> it = hashSet.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
/*
 * ===========================================================
 * Swapping number business logic	
 * ===========================================================
 */
	int temp;
	public void swap(int num1, int num2){
		temp = num1;
		num1 = num2;//10
		num2 = temp;//20
		
		System.out.println("Number after swapping :");
		System.out.println("num1 : "+ num1);
		System.out.print("num2 :"+ num2);
	}
/*
* ===========================================================
* checking even or odd number business logic	
* ===========================================================
*/
public void display(int num) {
	if (num > 0) {
		if (num % 2 == 0) {
			System.out.println(num + " is a even number.");
		} else {
			System.out.println(num + " is odd number.");
		}
	} else {
		System.out.println("Please enter correct positive number.");
		}
	}
}
