
pckage com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 *  * This is the Calculator service class that provides basic arithmetic operations.
 *   * It is annotated as a Spring service for dependency injection.
 *    */
@Service
public class Calculator {

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
        final static int umlNUMBER1 = 3;
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
}
