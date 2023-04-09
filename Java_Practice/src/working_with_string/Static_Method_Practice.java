package working_with_string;
public class Static_Method_Practice {
    static int a;
    int b;

    static void m1(){
        Static_Method_Practice.a=50;

    }


    public static void main(String[] args) {
        m1();
        System.out.println(a);

        }

    }

