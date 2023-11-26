package functionalInfterfaces;
import java.util.Scanner;
import java.util.function.*;

public class Predicate {

	public static void main(String[] args) {
		
		//if you want check the conditions predicate is suiatble
//		Predicate<Integer> val=(a)->a>18;
//		Predicate<Integer> val2=(b)->b<60;
		
		//if you want to satisfy both the conditions (and)
//		Predicate<Integer> res = val.and(val2);
//		System.out.println(res.test(45));
	
//		Predicate<String> s1=(i)->i.startsWith("A");
//		Predicate<String> s2=(j)->j.endsWith("Z");
//		
//		Predicate<String> res = s1.and(s2);
//		System.out.println(res.test("abc"));
//		System.out.println(res.test("abz"));
//		System.out.println(res.test("AbZ"));
		
		
		///if you satisfy only one condition(or)
//		Predicate<String> val=(i)-> i.startsWith("a");
//		Predicate<String> val2=(j)->j.endsWith("z");
//		Predicate<String> res = val.or(val2);
//		System.out.println(res.test("akz"));
		
		
		
//	Predicate<Integer> val=(adult)-> adult>18;
//	Predicate<Integer> val2=(oldage)->oldage<60;
//	//System.out.println(val.test(9));
//	System.out.println(val2.negate().test(6));
//	
		
//		Predicate<String> test = Predicate.isEqual("PI");
//		Predicate<String> is=Predicate.isEqual("PI");
//		System.out.println(is.test("PI"));
		
		Scanner sc=new Scanner(System.in);
		
		int res = (int)(Math.random()*100000);
		
		System.out.println(res);
		
		
		
		System.out.println("Enter OTP");
		int input=sc.nextInt();
		
		if(res==input) {
			System.out.println("welcome");
		}
		else {
			System.out.println("otp not matched");
		}
	
		
	
		
		
		

	}

}
