package selection.statements;

import java.util.Scanner;

public class SelectionStatements {
    public static void main(String[] args) {
        
//if...else Statement
/*
1- if statement
2- if...else statement
3- if...else if...else statement
4- Nested if...else statement
*/

//Java if Statement
    int number = 10;

    // checks if number is greater than 0
    if (number > 0) {
      System.out.println("The number is positive.");
    }

    System.out.println("Statement outside if block");
    
//if...else (if-then-else) Statement
    number = 10;

    // checks if number is greater than 0
    if (number > 0) {
      System.out.println("The number is positive.");
    }
    
    // execute this block
    // if number is not greater than 0
    else {
      System.out.println("The number is not positive.");
    }

    System.out.println("Statement outside if...else block");
    
//if...else...if Statement
    number = 0;

    // checks if number is greater than 0
    if (number > 0) {
      System.out.println("The number is positive.");
    }

    // checks if number is less than 0
    else if (number < 0) {
      System.out.println("The number is negative.");
    }
    
    // if both condition is false
    else {
      System.out.println("The number is 0.");
    }
    
//Nested if..else Statement
    double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

    // checks if n1 is greater than or equal to n2
    if (n1 >= n2) {

      // if...else statement inside the if block
      // checks if n1 is greater than or equal to n3
      if (n1 >= n3) {
        largest = n1;
      }

      else {
        largest = n3;
      }
    } else {

      // if..else statement inside else block
      // checks if n2 is greater than or equal to n3
      if (n2 >= n3) {
        largest = n2;
      }

      else {
        largest = n3;
      }
    }

    System.out.println("Largest Number: " + largest);

//Java Ternary Operator
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your marks: ");
    double marks = input.nextDouble();

    // ternary operator checks if
    // marks is greater than 40
    String result = (marks > 40) ? "pass" : "fail";

    System.out.println("You " + result + " the exam.");
    input.close();
    
//Nested Ternary Operators

    int N1 = 2, N2 = 9, N3 = -11;

    // nested ternary operator
    // to find the largest number
    int Largest;
        Largest = (N1 >= N2) ? ((N1 >= N3) ? N1 : N3) : ((N2 >= N3) ? N2 : N3);
    System.out.println("Largest Number: " + Largest);
/*---------------------------------------------------------------------------*/
    
//Java switch Statement

    number = 44;
    String size;

    // switch statement to check size
    switch (number) {

      case 29:
        size = "Small";
        break;

      case 42:
        size = "Medium";
        break;

      // match the value of week
      case 44:
        size = "Large";
        break;

      case 48:
        size = "Extra Large";
        break;
      
      default:
        size = "Unknown";
        break;

    }
    System.out.println("Size: " + size);
    
    }   
}
