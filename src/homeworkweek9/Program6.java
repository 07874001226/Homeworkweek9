package homeworkweek9;
import java.util.ArrayList;

/*Write a Java program to retrieve an element (at a specified index) from a given array list

 */
public class Program6 {
    //Main Method
    public static void main(String[] args) {

        ArrayList list = new ArrayList();// creat a object
        list.add(10);
        list.add("Prime");
        list.add(20.25);
        list.add(null);
        list.add(true);
        list.add("Prime");


        // Retrive element directly using index num
        System.out.println(list.get(0));
        System.out.println(list.get(5));
    }
}


