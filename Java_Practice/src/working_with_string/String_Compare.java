package working_with_string;
class String_Compare{
	public static void main(String[] args) {
		
		String s1="Anshu";  // Creates 1 Object
		String s2="Anshu";
		System.out.println(s1.equals(s2));  //true   // .equals() compares by Object data 
		System.out.println(s1==s2);  		//true   // == (equality operator) compares object by 
													 // reference of the Object
		
		String s3=new String("Anshu");   //Creates 2 Objects
		String s4=new String("Anshu");
		System.out.println(s3.equals(s4)); //true     // .equals() compares by Object data
		System.out.println(s3==s4); 	   // false   //== (equality operator) compares object by 
										              // reference of the Object
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}