package working_with_array;

public class Wednesday {

	public static void main(String[] args) {
		// task for the day
	String [] arr = {"Anshuman", "Siku", "Silu"};
	System.out.println(arr[0].charAt(2));
	System.out.println(arr[1].charAt(1));
	System.out.println(arr[2].charAt(2));
	System.out.println(arr[0].charAt(4));
	System.out.println(arr[0].length());
	arr[1] = "Alok";
		System.out.println(arr[1]);
		String str1=arr[0];
		int i;
		
		for (i=0;i<str1.length();i++) {
		System.out.print(str1.charAt(i));	}
	}

}
