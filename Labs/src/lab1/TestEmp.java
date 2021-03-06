package lab1;

public class TestEmp {
	public static void main(String[] args) {
		/* Questions:
		 * Q2 - We need an empty constructor because it does not automatically make one for you
		 * when you have already created a constructor. This is useful when someone makes an object with no parameters.
		 * Q6(c) - Yes, count will be incremented when we make a object of the type "Staff" because it is referenced thru "super(...)"
		 */
		Person p = new Person();
		Student stu = new Student();
		Employee e = new Employee();
		Faculty f = new Faculty();
		Staff s = new Staff();
		Person p1 = new Person();
				
		System.out.println(e.toString());
		
		System.out.println(Person.getCount());
		
	}
}
