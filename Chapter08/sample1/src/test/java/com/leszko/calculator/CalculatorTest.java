package com.leszko.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *  * Unit tests for the Calculator class.
 *   */
public class CalculatorTest {
	    private Calculator calculator = new Calculator();

	        /**
		 *      * Test to verify the sum method of Calculator.
		 *           */
	        @Test
		    public void testSum() {
			            assertEquals(5, calculator.sum(2, 3));
				        }
}

