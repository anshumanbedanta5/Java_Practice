package working_with_string;
// Taking Name as Input and Displaying that to the End User
import java.util.Scanner;
public class StringLengthMethod {
	public static void main(String[] args) {
			System.out.println("Welcome");
			Scanner sc=new Scanner(System.in);
			String s="";
			while(!s.equalsIgnoreCase("exit")) {
			System.out.println("Enter Name");
			 s=sc.nextLine();
			
			if(s.trim().length()==0) {
				System.out.println("Name Can't be Empty");
				
			}
			else if (s.equalsIgnoreCase("exit")){
				System.out.println("Thank You");
			}else {
				System.out.println("Your Name is: "+s);
			}
			
			}
	
	
	
	}

}
