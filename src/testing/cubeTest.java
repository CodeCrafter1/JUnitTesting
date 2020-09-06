package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cubeTest 
{

	@Test
	void test_cube() 
	{
		JUnitTesting test = new JUnitTesting();
		int output = test.cube(3);
		assertEquals(27,output);
		
		//fail("Not yet implemented");
	}

}
