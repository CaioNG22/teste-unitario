package testeexerc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class teste1Test {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testFindMax() {
		assertEquals("caso 1:", 4,teste1.findMax(new int[]{1,3,4,2}));

	}

	@Test
	public void testCube() {
		assertEquals("caso 2:",8,teste1.cube(2)); 
		assertEquals("caso 3:",0,teste1.cube(0)); 

	}

	@Test
	public void testReverseWord() {
		assertEquals("Caso 06: ", "oiaC", teste1.reverseWord("Caio"));

	}

}
