
//CP - Create a Program that takes user input for Student Fee and University Discount to compute the
//discounted amount and discounted price the student will pay for the course.
//Hint =>
//Create a variable named fee and take user input for fee.
//Create another variable discountPercent and take user input.
//Compute the discount and assign it to the discount variable.
//Compute and print the fee you have to pay by subtracting the discount from the fee.
//I/P => fee, discountPrecent
//O/P => The discount amount is INR ___ and final discounted fee is INR ___


import java.util.Scanner;

class CourseFeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter the student fee: ");
        double fee = sc.nextDouble();

  
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = sc.nextDouble();

      
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f", discount, finalFee);
    }
}




