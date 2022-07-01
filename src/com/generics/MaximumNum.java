package com.generics;
import java.util.Scanner;
/*
 * Given 3 Integers find the maximum
 * Given 3 Float find the maximum
 * 
 * @ Dnyandeo Bansode
 * 
 * */

public class MaximumNum {
	public Integer getMaximumInteger(Integer num1, Integer num2, Integer num3) {
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
	
	public Float getMaxNumFloat(Float num1, Float num2, Float num3) {
		Float max = num1;
		if(num2.compareTo(max) > 0 && num2.compareTo(num3) > 0) {
			max = num2;
			return max;
		}else if(num3.compareTo(max) > 0) {
			max = num3;
			return max;
		}
		return max;
	}
	
	public void findMaxInteger() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first num1:-> ");
		Integer num1 = scanner.nextInt();
		System.out.print("Enter first num2:-> ");
		Integer num2 = scanner.nextInt();
		System.out.print("Enter first num3:-> ");
		Integer num3 = scanner.nextInt();
		
		System.out.println("Maximum num is:-> " + getMaximumInteger(num1, num2, num3));
	}
	
	public void findMaxFloat() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first Float Num:-> ");
		Float num1 = scanner.nextFloat();
		System.out.print("Enter first Float Num:-> ");
		Float num2 = scanner.nextFloat();
		System.out.print("Enter first Float Num:-> ");
		Float num3 = scanner.nextFloat();
		
		System.out.println("Maximum num is:-> " + getMaxNumFloat(num1, num2, num3));
	}

	public static void main(String[] args) {
		MaximumNum maximum = new MaximumNum();
		//maximum.findMaxInteger();
		
		maximum.findMaxFloat();
		
		
	}
}
