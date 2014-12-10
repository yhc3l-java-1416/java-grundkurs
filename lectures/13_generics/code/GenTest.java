import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GenTest
{
	Gen<String> strGen;
	Gen<Integer> intGen;

	@Before
	public void setUp() throws Exception
	{
		strGen = new Gen<String>("Hello World");
		intGen = new Gen<Integer>(102);
	}

	@Test
	public void getValue()
	{
		assertEquals("Hello World", strGen.getValue());
		int a = intGen.getValue();
		assertEquals(102, a);
	}

}
