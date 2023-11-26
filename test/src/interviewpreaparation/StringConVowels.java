package interviewpreaparation;

public class StringConVowels {
		public static void main(String[] args) {
			String s="iam practicing for interview";
			String str=s.toLowerCase();
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				System.out.println("given String contains"+str.charAt(i)+"at the index "+i);	
				}
				
			}
				
		}
		
}


