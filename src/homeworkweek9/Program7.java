package homeworkweek9;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to test an array list is empty or not. Define array list with
 underground tube names
 */
public class Program7 {
    //Main Method
    public static void main(String[] args) {


        List list = new ArrayList();// Cteat a object
        list.add("Piccadily Line");
        list.add("Bakerloo Line");
        list.add("Jubilee Line");
        list.add("Central Line");
        list.add("Distric Line");
        list.add("Northen Line");
        list.add("Victoria Line");


        System.out.println("Original array list : " + list);
        System.out.println("Checking the above array list is empty or not...." + list.isEmpty());
        list.remove(2);
        System.out.println("Array list after remove element : " + list);
        list.removeAll(list);
        System.out.println("Array list after remove all element : " + list);
        System.out.println("Checking the above array list is empty or not...." + list.isEmpty());
    }
}


