package homeworkweek9;

import java.util.HashMap;
import java.util.Map;

/*Create a HashMap object called people that will store
String keys and Integer values: And use for each loop to iterate the value from Map.
*/
public class Program9 {
    public static void main(String[] args) {
        //creat a hasmap object
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        //Add keys and value
        people.put("Siya", 3);
        people.put("Shiv", 7);
        people.put("Vrajesh", 39);
        people.put("Foram", 39);
        people.put("Vaidehi", 30);
        people.put("Bhumi", 30);
        people.put("Jyoti", 39);
        people.put("Ram", 10);

        //for each loop
        for (String i : people.keySet()) {
            //print statement
            System.out.println("String keys : " + i + ", Integer Value : " + people.get(i));
        }
    }
}