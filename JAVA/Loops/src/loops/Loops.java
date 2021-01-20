/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;
public class Loops {
    public static void main(String[] args) {
        
// Java for Loop
/*
1- for loop
2- while loop
3- do...while loop
*/

// Display Sum of n Natural Numbers

    int sum = 0;
    int n = 1000;

    // for loop
    for (int i = 1; i <= n; ++i) {
      // body inside for loop
      sum += i;     // sum = sum + i
    }
       
    System.out.println("Sum = " + sum);
  
//Java for-each Loop

    // create an array
    int[] numbers = {3, 7, 5, -5};
    
    // iterating through the array 
    for (int number: numbers) {
       System.out.println(number);
    }
    
//Java Infinite for Loop

        for (int i = 1; i <= 10; --i) {
            System.out.println("Hello");
        }
    
/*---------------------------------------------------------------------------*/
// Java while loop

//Display Numbers from 1 to 5

    // declare variables
    int i = 1, N = 5;

    // while loop from 1 to 5
    while(i <= N) {
      System.out.println(i);
      i++;
    }

/*---------------------------------------------------------------------------*/
//Java do...while loop
    
//Display Numbers from 1 to 5

    i = 1; 
    n = 5;
    
    // do...while loop from 1 to 5
    do {
      System.out.println(i);
      i++;
    } while(i <= n);
    
/*---------------------------------------------------------------------------*/
//Java break statement

    // for loop
        for (int j = 1; j <= 10; ++j) {

            // if the value of j is 5 the loop terminates  
            if (j == 5) {
                break;
            }      
            System.out.println(j);
        }   

// labeled break Statement

    first:
        for( int p = 1; p < 5; p++) {

            // the for loop is labeled as second
            second:
            for(int j = 1; j < 3; j ++ ) {
                System.out.println("p = " + p + "; j = " +j);
             
                // the break statement breaks the first for loop
                if ( p == 2)
                    break first;
            }
        }
    
//Java continue statement

    // for loop
    for ( i = 1; i <= 10; ++i) {

      // if value of i is between 4 and 9
      // continue is executed
      if (i > 4 && i < 9) {
        continue;
      }
      System.out.println(i);
    }
    
//Labeled continue Statement

    // outer loop is labeled as first
    first:
    for ( i = 1; i < 6; ++i) {

      // inner loop
      for (int j = 1; j < 5; ++j) {
        if (i == 3 || j == 2)

          // skips the current iteration of outer loop
          continue first;
        System.out.println("i = " + i + "; j = " + j);
      }
    }
    
    }
}
