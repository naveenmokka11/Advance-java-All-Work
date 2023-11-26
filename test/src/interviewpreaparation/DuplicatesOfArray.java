package interviewpreaparation;

public class DuplicatesOfArray {

	public static void main(String[] args) {
		int a[]= {1,2,4,8,1,2,8};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("found dupliacte element "+a[i]);
					
				}
				
			}
			
		}
			
	
	}

}
