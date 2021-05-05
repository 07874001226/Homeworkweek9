package homeworkweek9;

import java.util.Scanner;

/*Re write the student mark sheet programme using if else and while loop.
 */

public class Program2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);//scanner class
        System.out.println("Marks sheet");// print statement
        System.out.println("Enter the name of Student : ");
        String name = sc.next();
        System.out.println("Enter the Roll Number : ");
        int roll = sc.nextInt();
        System.out.println("Enter the Marks of Maths : ");
        int maths = sc.nextInt();
        //While loop
        while (maths < 0 || maths > 100) {
            System.out.println("Invalid input, Marks should be between 0 to 100");
            System.out.println("Please Enter correct Marks");
            maths = sc.nextInt();
        }
        System.out.println("Enter the Marks of Science : ");
        int science = sc.nextInt();
        while (science < 0 || science > 100) {
            System.out.println("Invalid input, Marks should be between 0 to 100");
            System.out.println("Please Enter correct Marks");
            science = sc.nextInt();
        }
        System.out.println("Enter the Marks of English : ");
        int english = sc.nextInt();
        while (english < 0 || english > 100) {
            System.out.println("Invalid input, Marks should be between 0 to 100");
            System.out.println("Please Enter correct Marks");
            english = sc.nextInt();
        }

            float percent;
            int total = maths + science + english;
            percent = total / 3;
            String grade = "";
            String result = "";

            //if else statement
            if (percent >= 80) {
                grade = "A+";
                result = "Pass";
            } else if (percent >= 60) {
                grade = "A";
                result = "Pass";

            } else if (percent >= 50) {
                grade = "B";
                result = "Pass";
            } else if (percent >= 35) {
                grade = "C";
                result = "Pass";

            } else {
                result = "Fail";
            }
            //If statement
            if ((maths <= 34) || (science <= 34) || (english <= 34)) {
                result = "Fail";
            }
////print statement
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|            Mark Sheet               |");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            System.out.println("|    Name:    " + name + " |");
            System.out.println("|    Roll No: " + roll + "|");
            System.out.println("|-------------------------------------|");
            System.out.println("|    Subject:    Marks                |");
            System.out.println("|-------------------------------------|");
            System.out.println("|    Math:    " + maths + "|" + "|");
            System.out.println("|    English: " + english + "|");
            System.out.println("|    Science: " + science + "|");
            System.out.println("|-------------------------------------|");
            System.out.println("|    Total:   " + total + "|");
            System.out.println("|-------------------------------------|");
            System.out.println("|    Percentage: " + percent + "|");
            System.out.println("| Result:     " + result + "|");
            System.out.println("| Grade:      " + grade + "|");
            System.out.println("|-------------------------------------|");
        }
    }



