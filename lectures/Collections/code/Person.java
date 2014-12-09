
public class Person implements Comparable<Person>
{
	private String firstname;
	private String lastname;
	private int age;
	
	Person(String firstname, String lastname, int age){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Person: " + firstname + " " + lastname + ", age: " + age;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstname == null) ? 0 : firstname.toUpperCase().hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.toUpperCase().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Person other = (Person) obj;
		if (age != other.age) return false;
		if (firstname == null)
		{
			if (other.firstname != null) return false;
		}
		else if (!firstname.equals(other.firstname)) return false;
		if (lastname == null)
		{
			if (other.lastname != null) return false;
		}
		else if (!lastname.equals(other.lastname)) return false;
		return true;
	}

	@Override
	public int compareTo(Person o)
	{
		return lastname.compareTo(o.lastname);
	}

}
