package com.generics;
import java.util.Scanner;
/*
 * Given 3 Integers find the maximum
 * 
 * @ Dnyandeo Bansode
 * 
 * */

public class MaximumNum {
	public static Integer findMaxNum(Integer num1, Integer num2, Integer num3) {
		Integer max = num1;
		if(num2.compareTo(max) > 0 && num2.compareTo(num3) > 0) {
			max = num2;
			return max;
		}else if(num3.compareTo(max) > 0) {
			max = num3;
			return max;
		}
		return max;
	}
	
	public void findMaxInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first num1:-> ");
		Integer num1 = scanner.nextInt();
		System.out.print("Enter first num2:-> ");
		Integer num2 = scanner.nextInt();
		System.out.print("Enter first num3:-> ");
		Integer num3 = scanner.nextInt();
		
		System.out.println("Maximum num is:-> " + findMaxNum(num1, num2, num3));
	}

	public static void main(String[] args) {
		MaximumNum maximum = new MaximumNum();
		maximum.findMaxInt();
	}
}
