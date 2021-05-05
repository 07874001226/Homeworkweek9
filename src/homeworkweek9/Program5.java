package homeworkweek9;
/*Write a Java program to iterate through all elements in an array list using  Iterator.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program5 {
    //Main Method
    public static void main(String[] args) {

        List list = new ArrayList();//Creat a object
        list.add('V');//Add elements to Arraylist
        list.add(10);
        list.add("Prime");
        list.add(20.25);
        list.add(null);
        list.add(true);
        list.add("Prime");
        list.add(1234);

        Iterator iterator = list.iterator();//Iterator object
        while (iterator.hasNext()){//Iterator to iterate through the elements.
            System.out.println(iterator.next());//Print statement
        }

    }
}



