package working_with_string;
public class Duplicate_Characters_in_String {
    public static void main(String[] args) {
        String s="i am a good by";
        s=s.replaceAll("\\s","");   // Replces all Spaces in the String
        char []ch=s.toCharArray();  //Storing all String chars in a char Array
        System.out.println(s);
        for (int i=0;i<s.length();i++){     //reading all char of the Sting one by One
//            System.out.println(ch[i]);
            for(int j=i+1;j<s.length();j++){   //reading all chars from
                    if (s.charAt(i)==s.charAt(j)){
                        System.out.println("Duplicate Char is: "+s.charAt(i));
                    }
            }

        }

    }



}
