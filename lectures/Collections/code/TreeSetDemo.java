import java.util.Collection;
import java.util.TreeSet;


public class TreeSetDemo
{

	public static void main(String[] args)
	{
		Collection<String> words = new TreeSet<String>();
		words.add("fox");
		words.add("in");
		words.add("socks");
		words.add("on");
		words.add("box");
		words.add("in");
		words.add("rocks");
		
		for(String word: words){
			System.out.println(word);
		}

	}

}
