package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test_square() 
	{
		JUnitTesting test = new JUnitTesting();
		int output = test.square(5);
		assertEquals(25,output);
		
		//fail("Not yet implemented");
	}
	
}
