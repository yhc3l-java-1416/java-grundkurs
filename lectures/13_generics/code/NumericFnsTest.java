import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class NumericFnsTest
{
	NumericFns<Double> dblNum;
	NumericFns<Float> fltNum;
	NumericFns<Integer> intNum;
	
	@Before
	public void setUp() throws Exception
	{
		dblNum = new NumericFns<Double>(20.35d);
		fltNum = new NumericFns<Float>(1.34567f);
		intNum = new NumericFns<Integer>(12);
	}

	@Test
	public void test()
	{
		assertEquals(0.35d, dblNum.fraction(), 0.0000001);
		assertEquals(0.34567d, fltNum.fraction(), 0.0000001);
		assertEquals(0.0d, intNum.fraction(), 0.0000001);
	}

}
