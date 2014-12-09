import java.util.LinkedList;
import java.util.List;


public class PersonDemo
{

	public static void main(String[] args)
	{
		Person tom = new Person("Tom", "Blackmore", 38);
		Person harry = new Person("Harry", "Potter", 14);
		Person ginny = new Person("Ginny", "Weasley", 13);
		Person fred = new Person("Fred", "Weasley", 14);
		Person harry2 = new Person("Harry", "Potter", 14);
		
		List<Person> people = new LinkedList<Person>();
		people.add(tom);
		people.add(harry);
		people.add(ginny);
		people.add(fred);
		people.add(harry2);
		
		people.add(2, tom);
		
		//people.remove(harry);
		
		System.out.println(people.size());
		
		for(Person person: people){
			System.out.println(person);
		}
		
		System.out.println();
		
		for(int i = 0; i < people.size(); i++ ){
			System.out.println(people.get(i));
		}
	}
	


}
