import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Parent {

}
class child extends Parent{

}
public class Main {
    public static void check(Object o){
        if(o instanceof String s){
            System.out.println("String it is:"+s);
        }
        else {
            System.out.println("Not a string");

        }
    }
    public  static void main(String[] args)   {
        check(888);
        System.out.println("hello how are you");
        child c = new child();
        Parent c1 = new Parent();
        System.out.println(c1 instanceof child);
        System.out.println(c instanceof Parent);



    }

}
