package interviewpreaparation;

public class Prime {
	
	public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (prime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean prime(int n) {
        int c = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        return c == 2;
    }
	

//	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//            if (prime(i)) {
//                System.out.println(i);
//            }
//        }
//				
//	}
//
//	public static boolean prime(int n) {
//		int c = 0;
//
//		for (int i = 2; i <= n; i++) {
//			if (n % i == 0) {
//				c++;
//
//			}
//
//		}
//
//		return c == 2;
//
//	}

}
