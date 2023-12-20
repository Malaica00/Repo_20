package project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MulDivTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}

	
	@Test
	void mulTest()
	{
		MulDiv objMul = new MulDiv();
		int expected = 6;
		int actual = objMul.multiply(3,2);
		assertEquals(expected, actual);
	}
	
	@Test
	void DivTest()
	{
		MulDiv objDiv = new MulDiv();
		int expected = 1;
		int actual = objDiv.Division(3,3);
		assertEquals(expected, actual);
	}
	
}
