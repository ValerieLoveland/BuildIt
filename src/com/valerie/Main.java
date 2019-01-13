package com.valerie;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int highest = 0;
        int lowest = 0;
        int total = 0;
        double average = 0;
        int numbers[] = new int[7];
        //char wholeName[] = new char[];
        String fName;
        String lName="";
        String lastName;
        String nameSwitch =null;
        String reportTitle = "Report Title";
        String firstIn, firstOut = "";
        String lastIn, lastOut = "";

        Scanner keyboard = new Scanner (System.in);
 //FIRST NAME TIME!

        System.out.println("Enter your first name: ");
        firstIn = keyboard.next();


        for (int i = 0; i < firstIn.length(); i++)

        {
            if (firstIn.charAt(i) >= 'A' && firstIn.charAt(i) <= 'Z')
                firstOut = firstOut + firstIn.charAt(i);
            if (firstIn.charAt(i) >= 'a' && firstIn.charAt(i) <= 'z')
                firstOut = firstOut + firstIn.charAt(i);
        }

        System.out.println("Your first name is ");
        System.out.println(firstOut);


        //LAST NAME TIME
lastIn="";

       while (lastIn != "#") {
           System.out.println("Type your name letter by letter and type '#' to end");
           lastIn = keyboard.next();
           //for (int i=0; i<100; i++){
           if (lastIn.charAt(0) == '#')
               break;
           if (lastIn.charAt(0) >= 'A' && lastIn.charAt(0) <= 'Z')
               lastOut = lastOut + lastIn.charAt(0);
           if (lastIn.charAt(0) >= 'a' && lastIn.charAt(0) <= 'z')
               lastOut = lastOut + lastIn.charAt(0);
           if (lastIn.length() > 1)
               System.out.println("Please type only one letter at a time.");
           //if (! lastIn.matches("[a - zA - Z]")){
           else{System.out.println("Please use only letters in your last name.");
       }

            }


            System.out.println("Your Last name is ");
            System.out.println(lastOut);


    }
}
/*







            for (int i=0; i<7; i++) {
                char n = reader.next().charAt(0);

                if ((n >= 'a' && n <= 'z' || n >= 'A' && n <= 'Z')) {
                    lName = lName + n;
                    System.out.println(lName);
                } else {
                    lName = lName + "";
                }

            }

            //we are going to get the 7 numbers now and run them

//for first one make its own logic
            //  highest = numbers[i];
            // lowest = numbers[i];
            System.out.println("What are the seven numbers");//I didn't work out how to accept different inputs in this yet
            for (i=0; i<7; i++){

                numbers[i]= reader.nextInt();
                total=total + numbers[i];

                System.out.println("Running total: "+total);
                average = total/(i+1);
                System.out.println("Running average: "+ average);
                if (numbers[i]> highest){
                    highest = numbers[i];}

                else if (numbers[i]< lowest){
                    lowest = numbers[i];

                }

                System.out.println("Current highest: "+ highest);
                System.out.println("Current lowest: "+ lowest);
            }
            System.out.println(Arrays.toString(numbers));

        }

        //average = total/7;

    }}*/
