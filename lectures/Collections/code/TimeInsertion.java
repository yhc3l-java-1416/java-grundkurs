import java.util.ArrayList;
import java.util.List;


public class TimeInsertion
{
	public static void main(String[] args){
		List<Integer> nums = new ArrayList<Integer>();
		
		for(int i = 0; i < 10000000; i ++){
			nums.add(i);
		}
		long start = System.currentTimeMillis();
		nums.add(50000, 500);
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start));
	}
}
