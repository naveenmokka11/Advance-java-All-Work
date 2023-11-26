package interviewpreaparation;

public class RevserseAString {

	public static void main(String[] args) {
		String str="abcde";
		System.out.println(Reverse(str));
		
	}
		
		public static String Reverse(String s) {
			if(s==null) {
				throw new IllegalArgumentException ("null is not valid input");
				
			}
			else {
				
				String out = "";
				char[] chs=s.toCharArray();
				for (int i = chs.length - 1; i >= 0; i--)
					out+=(chs[i]);

				return out;
			}
			
		}
			
	

}
