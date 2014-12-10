
public class NumericFns<T extends Number>
{
	private T num;
	public NumericFns(T obj)
	{
		num = obj;
	}
	public double fraction()
	{
		return num.doubleValue() - num.intValue();
	}

}
