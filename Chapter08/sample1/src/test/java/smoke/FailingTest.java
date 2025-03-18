package smoke;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

public class FailingTest {
	    @Test
	        void shouldAlwaysFail() {
			        fail("Intentionally failing to demonstrate pipeline failure.");
				    }
}

