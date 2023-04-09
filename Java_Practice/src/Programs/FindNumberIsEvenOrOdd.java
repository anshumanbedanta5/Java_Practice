package Programs;

import java.util.Scanner;

public class FindNumberIsEvenOrOdd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("FindOut ");
		System.out.println("Please enter a number to know that is even or odd");
		int num=scn.nextInt();
		if(num%2==1) {
			System.out.println(num+" is odd num");
		}else {
			System.out.println(num+" is even num");
			
		}
	}

}
