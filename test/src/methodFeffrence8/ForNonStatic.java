package methodFeffrence8;

public class ForNonStatic {
	public void m1() {
		for(int i=1;i<=10;i++) {
			System.out.println("child thread");
			
		}
	}

	public static void main(String[] args) {
		ForNonStatic ns=new ForNonStatic();
		Runnable r =ns ::m1;
		Thread t=new Thread(r);
		t.start();
	
		for(int i=1;i<=10;i++) {
			System.out.println("main thread");
		}
		
		
	}

}
