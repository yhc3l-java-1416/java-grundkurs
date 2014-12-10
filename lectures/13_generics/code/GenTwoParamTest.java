import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GenTwoParamTest
{
	GenTwo<String, Integer> strIntGen;
	GenTwo<Integer, Boolean> intBoolGen;

	@Before
	public void setUp() throws Exception
	{
		strIntGen = new GenTwo<String, Integer>("Hello World", 12);
		intBoolGen = new GenTwo<Integer, Boolean>(102, Boolean.TRUE);
	}

	@Test
	public void getValue()
	{
		assertEquals("Hello World", strIntGen.getValue());
		int a = intBoolGen.getValue();
		assertEquals(102, a);
	}
	
	@Test
	public void getValue2()
	{
		assertEquals(12, (int)strIntGen.getValue2());
		assertTrue(intBoolGen.getValue2());
	}

}
