

//CP - Write a program that takes your height in centimeters and converts it into feet and inches
//Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
//I/P => height
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
import java.util.Scanner;
class CmToInchAndFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cm = sc.nextFloat();
        float inch = (1/2.54F) *cm;
        float foot = (1/12) * inch;
        System.out.println("Your Height in cm is : "+cm+ "while in feet is : "+ foot + "and inches is "+ inch);
    }
}



