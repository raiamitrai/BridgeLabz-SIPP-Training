//CP - Write a DoubleOperation program by taking a, b, and c as input values and print the results of the
//following operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the Operator
//Precedence.
//Hint =>
//1. Create variables a, b, and c of double data type.
//2. Take user input for a, b, and c.
//3. Compute 3 double operations and assign the result to a variable
//4. Finally, print the result and try to understand operator precedence.
//I/P => fee, discountPrecent
//O/P => The results of Double Operations are ___, ___, and ___

import java.util.Scanner;

class DoubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

     
        double result1 = a + b * c;        
        double result2 = a * b + c;        
        double result3 = c + a / b;       
        double result4 = a % b + c;        

        
        System.out.printf("The results of Double Operations are: %.2f, %.2f, %.2f, and %.2f",
                result1, result2, result3, result4);
    }
}









