package com.leszko.calculator;

import org.junit.Test;
import static org.junit.Assert.fail;

public class FailingTest {

	            @Test
		                    public void shouldAlwaysFail() {
					                                    fail("Intentionally failing to demonstrate pipeline failure.");
									                                        }
}

