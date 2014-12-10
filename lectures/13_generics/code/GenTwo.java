
public class GenTwo<T1, T2>
{
	private T1 value1;
	private T2 value2;
	
	public GenTwo(T1 val1, T2 val2){
		this.value1 = val1;
		this.value2 = val2;
	}
	public T1 getValue(){
		return value1;
	}
	public T2 getValue2(){
		return value2;
	}
}
