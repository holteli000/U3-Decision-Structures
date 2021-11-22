/*import javax.swing.*;
import java.util.Random;
public class QuizGame {

   static int usersAnswer, correctAnswer;
  static String displayProblem = "";

    public static void main(String[] args) {


        int choice = input("choose: addition(1), subtraction(2), multiplication(3), division(4)");

        if(choice >= 1){
            if(choice < 5){

                if(choice == 1){
                    add();
                }
                if(choice == 2){
                    sub();
                }
                if(choice ==3){
                    mult();
                }
                if(choice == 4){
                    div();
                }



            }

        }else{
            System.out.println("wrong input, restart, try again");
        }


        System.out.println(displayProblem);
        System.out.println(correctAnswer);
    }
public static void add(){

        int number1 = random();
        int number2 = random();

        correctAnswer = number1 + number2;
        displayProblem = number1 + " + " + number2;



}


//helper methods
    public static int random(){

        Random random = new Random();


        return random.nextInt(20)+ 1;

    }

    public static int input(String message){

        return Integer.parseInt(JOptionPane.showInputDialog(message));

    }


}/*/
