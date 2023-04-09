package working_with_string;

public class StringBuffer_Practice {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());  //default capacity is 16
		System.out.println(sb.length());	//length is 0
		
		sb.append("Hello abstubsgtyz");		
		System.out.println(sb.capacity());	//after reaching the default capacity it will
											//increse the cpacity by default (capacity*2)+2
		System.out.println(sb.length());	//length is 17
		sb.delete(1,3);	//delete the chars from the given index range
		System.out.println(sb);
		sb.deleteCharAt(0);		// delete the current given index character 
		System.out.println(sb);
		
	
	
	
	
	}

}
