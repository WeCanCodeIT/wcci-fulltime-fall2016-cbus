//Scanner class must be imported in order to be used
import java.util.Scanner;

public class CalculatorII{

     public static void main(String []args){
        
        //Variable created for the user's response to "Do another calculation?" 
        String answer;
        
        //Create a scanner object for getting user input
        Scanner values = new Scanner(System.in);
        
        //Start the do while loop that will allow the program to run again if user chooses
        do{
        //Prompt the user to input the first value and use scanner object and a variable to store their input
        System.out.println("Enter a number: ");
        double firstValue = values.nextDouble();
        
        //Prompt the user to input the second value and use scanner object and a variable to store their input
        System.out.println("Enter another number: ");
        double secondValue = values.nextDouble();
        
        //Prompt the user to choose an operator and store their input in a variable
        System.out.println("Choose an operator (+,-,*,/): ");
        String operator = values.next();
        
        //Switch case for choosing which calculation to perform based on operator chosen
        switch(operator)
        {
            case "+":
                System.out.println("RESULT:");
                System.out.println(firstValue + secondValue);
                break;
            case "-":
                System.out.println("RESULT:");
                System.out.println(firstValue - secondValue);
                break;
            case "*":
                System.out.println("RESULT:");
                System.out.println(firstValue * secondValue);
                break;
            case "/":
                System.out.println("RESULT:");
                System.out.println(firstValue / secondValue);
                break;
            default:
                System.out.println("NOT AN OPERATOR");
                break;
        }//Closing curly brace for switch case
        
        //Ask the user if they want to do another calculation
        System.out.println("Do you want to do another calculation?");
        
        //Get the user's responsie and store it in the answer variable
        answer = values.next();
        }//closing curly brace for "do" code block
        while (answer.equals("yes"));
        
        //Close the Scanner
        values.close();
    }
}
