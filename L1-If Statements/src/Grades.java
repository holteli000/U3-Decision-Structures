package src;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String grade = "";

        System.out.print("Please enter your percentage grade:");
        double percentage = read.nextDouble();

        if(percentage < 60){

           grade ="F";
        }

        if(percentage >= 60){
            if (percentage < 70){

                System.out.println("your grade is d");
            }
        }

        if(percentage >= 70){
            if (percentage < 80) {
                System.out.println("your grade is a c");
            }
        }

        if(percentage >= 80){
            if(percentage <90){
                System.out.println("your grade is b");
            }
        }

        if(percentage >= 90){
            System.out.println("your grade is: " + grade);
        }

    }
}