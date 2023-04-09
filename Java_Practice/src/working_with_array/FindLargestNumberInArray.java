package working_with_array;
// Code to Find Largest Number Present in an Array
public class FindLargestNumberInArray {
	public static int largestNumber(int []ar) {
		int i=0;
		int max = ar[i];	
		
		for (;i<ar.length;i++) {
			if(max < ar[i]) {
				max = ar[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
	int [] ar= {600,243,1020,50,40,405,30,1000};
	int max=FindLargestNumberInArray.largestNumber(ar);
	System.out.println("Largest Number is: "+max);
	
	}
}
