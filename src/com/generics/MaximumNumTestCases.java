package com.generics;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

class MaximumNumTestCases {

	@Test
	void test() {
		MaximumNum maximumNum = new MaximumNum();
		Integer expectedOutput = maximumNum.findMaxNum(45, 23, 12);
		Integer actualOutput = 45;
		assertEquals(expectedOutput, actualOutput);
	}
}
