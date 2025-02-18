package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
	    
	    final static int umlNUMBER1 = 3;
	        
	        /**
		 *      * Returns the sum of two integers.
		 *           *
		 *                * @param a the first number
		 *                     * @param b the second number
		 *                          * @return the sum of a and b
		 *                               */
	        @Cacheable("sum")
		    public int sum(int a, int b) {
			            return a + b;
				        }
}
