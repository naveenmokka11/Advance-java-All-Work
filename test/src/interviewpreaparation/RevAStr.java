package interviewpreaparation;

public class RevAStr {
	public static void main(String[] args) {
		String s="this a string";
		System.out.println(revString(s));
		
	}
	public static String revString(String input) {
		if(input==null) {
			throw new IllegalArgumentException("null is not valid input");
			
		}
		else {
			String res="";
			char[] chars = input.toCharArray();
			for(int i=chars.length-1;i>=0;i--) {
				res+=chars[i];
				
			}
			return res;
		}
		
	}
	

}
