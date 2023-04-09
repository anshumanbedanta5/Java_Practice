package Programs;

public class SwapTwoNumbersWithoutTempVar {

	public static void main(String[] args) {
		int a=10,b=31;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+"  "+b);
	}

}
