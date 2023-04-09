package working_with_array;
import java.util.ArrayList;

public class WorkingWithArrayList {
    public static void main(String[] args) {        //main method
        ArrayList <String> Al=new ArrayList<>();       //Creating new Object of ArrayList

        Al.add("Anshuman");  //Adding Elements using add method in ArrayList
        Al.add("Lokan");
        Al.add("Lokan");
        Al.add("Siku");
        Al.add("Silu");
        Al.add("Alok");
        Al.add("Mahesh");

        Al.set(1,"21");     //Updating Element data using set method

        for (int i=0;i<Al.size();i++) {     //getting all elements using for loop in ArrayList
            System.out.println(Al.get(i));
        }
        int a=Integer.parseInt(Al.get(1));    //Converting an Element to its Native data type
        //by using Wrapper Class
        int b=20;       //Stored a int  type variable

        System.out.println(a+b);
        System.out.println(Al);     //Printing all elements of ArrayList by its Object Name
        System.out.println(Al.contains("Lokan"));   //Searching an element by using contains
        // method in Arraylist
        System.out.println(Al.size());      //Checking the size of the ArrayList by Using size method
        System.out.println();

        for (int i=0;i<Al.size();i++){                  // Printing all Characters of ArrayList using
            for (int j=0;j<Al.get(i).length();j++){     // nested for loop
                System.out.println((Al.get(i)).charAt(j));
            }
            System.out.println();

        }




    }       //main method end
}       //class end