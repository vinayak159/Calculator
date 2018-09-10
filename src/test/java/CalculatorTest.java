package test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.java.CalculatorLogic;

public class CalculatorTest {
	
	@Test
	public void testPassFunction() {
		
		CalculatorLogic calcLogic = new CalculatorLogic();
		
			assertEquals(8, calcLogic.sum(1,7));
		
	}
	
	@Test
	public void testFailFunction() {
		
		CalculatorLogic calcLogic = new CalculatorLogic();
		
			assertEquals(9, calcLogic.sum(2,7));
		
	}
}