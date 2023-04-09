package working_with_array;
// Code to Find Largest Number Present in an Array
public class FindLargestNumberInAnArray {
	
	public static void main(String []args) {
		int [] ar= {600,243,10020,50,40,7000,30,1000};
		int i=0;
		int max = ar[i];	

		for (;i<ar.length;i++) {
			if(max < ar[i]) {
				max = ar[i];
			}
		}
		System.out.println("Largest Number is: "+max);
	}
}
