package com.generics;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
/*
 * Ensure the test data has Max Integer in the First position
 * Ensure the test data has Max Integer in the Second position
 * Ensure the test data has Max Integer in the Third position
 * 
 * Ensure the test data has Max Float in the First position
 * Ensure the test data has Max Float in the First position
 * 
 * */

class MaximumNumTestCases {
	//Tc1.1
	@Test
	void testForFirstPosition() {
		MaximumNum maximumNum = new MaximumNum();
		Integer expectedOutput = maximumNum.getMaximumInteger(4534, 783, 12);
		Integer actualOutput = 4534;
		assertEquals(expectedOutput, actualOutput);
	}
	
	//Tc1.2
	@Test
	void testForSecondePosition() {
		MaximumNum maximumNum = new MaximumNum();
		Integer expectedOutput = maximumNum.getMaximumInteger(45, 783, 12);
		Integer actualOutput = 783;
		assertEquals(expectedOutput, actualOutput);
	}
	
	//Tc1.3
	@Test
	void test() {
		MaximumNum maximumNum = new MaximumNum();
		Integer expectedOutput = maximumNum.getMaximumInteger(45, 783, 1245);
		Integer actualOutput = 1245;
		assertEquals(expectedOutput, actualOutput);
	}
	
	//Tc2.1
		@Test
		void testForFloatFirstPosition() {
			MaximumNum maximumNum = new MaximumNum();
			Float expectedOutput = maximumNum.getMaximumFloat(454f, 234f, 343f);
			Float actualOutput = (float) 454;
			assertEquals(expectedOutput, actualOutput);
		}
		
		//Tc2.2
		@Test
		void testForFloatSecondPosition() {
			MaximumNum maximumNum = new MaximumNum();
			Float expectedOutput = maximumNum.getMaximumFloat(45f, 6783f, 1245f);
			Float actualOutput = 6783f;
			assertEquals(expectedOutput, actualOutput);
		}
		
}
