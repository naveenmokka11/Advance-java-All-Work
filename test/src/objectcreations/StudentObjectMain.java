package objectcreations;

public class StudentObjectMain {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Student s1=new Student();
//		System.out.println(s1.id);
//		System.out.println(s1.name);
//		System.out.println(s1.email);
		
		Class<?> c = Class.forName("objectcreations.Student");
		 Student cls = (Student) c.newInstance();
		 System.out.println(cls.name);
		 System.out.println(cls.id);
		 System.out.println(cls.email);
		
	}			

}
