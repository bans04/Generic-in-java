package com.generics;
import java.util.Scanner;
/*
 * Given 3 Integers find the maximum
 * Given 3 Float find the maximum
 * Given 3 String find the maximum
 * 
 * Refactor all the 3 to One Generic Method and find the maximum
 * 
 * @ Dnyandeo Bansode
 * 
 * */

public class MaximumNum {
	public <G extends Comparable<G>> G getMaximum(G num1, G num2, G num3) {
		G max = num1;
		if(num2.compareTo(max) > 0 && num2.compareTo(num3) > 0) {
			max = num2;
			return max;
		}else if(num3.compareTo(max) > 0) {
			max = num3;
			return max;
		}
		return max;
	}
	
	/*public Float getMaximumFloat(Float num1, Float num2, Float num3) {
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
	
	public String getMaximumString(String str1, String str2, String str3) {
		String max = str1;
		if(str2.compareToIgnoreCase(max) > 0 && str2.compareToIgnoreCase(str3) > 0) {
			max = str2;
			return max;
		}else if(str3.compareToIgnoreCase(max) > 0) {
			max = str3;
			return max;
		}
		return max;
	}*/
	
	public void findMaxInteger() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first num1:-> ");
		Integer num1 = scanner.nextInt();
		System.out.print("Enter first num2:-> ");
		Integer num2 = scanner.nextInt();
		System.out.print("Enter first num3:-> ");
		Integer num3 = scanner.nextInt();
		
		System.out.println("Maximum num is:-> " + getMaximum(num1, num2, num3));
	}
	
	public void findMaxFloat() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first Float Num:-> ");
		Float num1 = scanner.nextFloat();
		System.out.print("Enter first Float Num:-> ");
		Float num2 = scanner.nextFloat();
		System.out.print("Enter first Float Num:-> ");
		Float num3 = scanner.nextFloat();
		
		System.out.println("Maximum num is:-> " + getMaximum(num1, num2, num3));
	}
	
	public void findMaxString() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first str1:-> ");
		String str1 = scanner.next();
		System.out.print("Enter first str2:-> ");
		String str2 = scanner.next();
		System.out.print("Enter first str3:-> ");
		String str3 = scanner.next();
		
		System.out.println("Maximum String is:-> " + getMaximum(str1, str2, str3));
	}

	public static void main(String[] args) {
		MaximumNum maximum = new MaximumNum();
		//maximum.findMaxInteger();
		maximum.findMaxFloat();
		//maximum.findMaxString();
	}
}
