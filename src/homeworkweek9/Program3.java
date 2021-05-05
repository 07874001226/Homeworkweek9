package homeworkweek9;

import java.util.Scanner;

    /*Write a Java program to reverse an array of integer values.
     */
    public class Program3 {
        //Main Method
        public static void main(String[] args) {


            int a, b, c;
            Scanner sca = new Scanner(System.in);//scanner class object
            System.out.print("Enter num of elements you want array :");//print staement
            a = sca.nextInt();
            int[] num = new int[a];
            System.out.println("Enter all the elements :");
            for (b = 0; b < num.length; b++) {// for loop statement
                num[b] = sca.nextInt();
            }

            System.out.println("\n Array before reverse : ");
            for (b = 0; b < num.length; b++) {
                System.out.println(num[b] + " ");
            }
            for (b = 0, c = num.length - 1; b < c; b++, c--) {
                int pro = num[b];
                num[b] = num[c];
                num[c] = pro;
            }
            System.out.println("\n Array after reverse : ");
            for (b = 0; b < num.length; b++) {
                System.out.println(num[b] + " ");
            }
        }
    }

