package objectcreations;


public class ObjectCreation2 implements Cloneable{
	int id=1;
	String name="ravi";
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectCreation2 ob1=new ObjectCreation2();
		 ObjectCreation2 stu = (ObjectCreation2) ob1.clone();
		 System.out.println(stu.id);
	
		
	}

     
  
}

