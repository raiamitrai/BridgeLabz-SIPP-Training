//CP - Write a program to create a basic calculator for addition, subtraction, multiplication, and division.
//The program should ask for two numbers (floating point) and perform all the operations
//Hint =>
//Create a variable number1 and number 2 and take user inputs.
//Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the
//result to a variable and finally print the result
//I/P => number1, number2
//O/P => The addition, subtraction, multiplication, and division value of 2 numbers ___ and ___ is ___,
//____, ____, and ___

import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

       
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        
        System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f",
                number1, number2, addition, subtraction, multiplication, division);
    }
}







