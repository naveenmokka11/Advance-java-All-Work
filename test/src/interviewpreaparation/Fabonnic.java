package interviewpreaparation;

public class Fabonnic {

	public static void main(String[] args) {
		int a[]= {3,8,1,4,7,2};
		for(int i=0;i<=a.length-1;i++) {
			if(fibonicci(a[i])) {
				System.out.println(a[i]);
				
			}
			
		}
		

	}

	public static boolean fibonicci(int n) {
		if(n==0||n==1) {
			return true;	
		}
		int a=0;
		int b=1;
		while(b<=n) {
			int c=a+b;
			if(c==n) {
				return true;
				
			}
			a=b;
			b=c;
			
		}
		return false;
		
	}
}
