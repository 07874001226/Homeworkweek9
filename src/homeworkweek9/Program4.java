package homeworkweek9;
import java.util.ArrayList;
import java.util.List;

/*Write a Java program to create a new array list,
add some colours (string) and printout the collection using for each loop.

 */
public class Program4 {
    //Main method
    public static void main(String[] args) {

        List list = new ArrayList();//creat a object
        //add element to arraylist
        list.add("White");
        list.add("Yellow");
        list.add("Purple");
        list.add("Black");
        list.add("Green");
        list.add("Red");

        //for each loop
        for(Object value : list)

            System.out.println(value);//Print statement
    }
}

