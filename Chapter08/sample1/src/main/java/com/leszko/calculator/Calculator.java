package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 *  * A simple calculator service that provides basic arithmetic operations.
 *   */
@Service
public class Calculator {

	    final static int umlNUMBER1 = 3;

	        /**
		 *      * Adds two integers and returns the result.
		 *           * 
		 *                * @param a the first integer
		 *                     * @param b the second integer
		 *                          * @return the sum of the two integers
		 *                               */
	        @Cacheable("sum")
		    public int sum(int a, int b) {
			            return a + b;
				        }
}

