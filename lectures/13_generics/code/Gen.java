
public class Gen<T>
{
	private T value;
	
	public Gen(T obj){
		value = obj;
	}
	
	public T getValue(){
		return value;
	}
}
