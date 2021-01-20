package arrays;
public class Arrays {
    public static void main(String[] args) {
        
//Java Arrays

//How to declare an array in Java?
   
double[] data = new double[10];

/*
// declare an array
    double[] data ;
// allocate memory
    data = new Double[];
*/

//declare and initialize and array
    int[] age = {12, 4, 5, 2, 5};

/*
// declare an array
    int[] age = new int[5];
    
// initialize array
    age[0] = 12;
    age[1] = 4;
    age[2] = 5;
    ..
*/

//Compute Sum and Average of Array Elements

   int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
   int sum = 0;
   Double average;
   
   // access all elements using for each loop
   // add each element in sum
   for (int number: numbers) {
     sum += number;
   }
  
   // get the total number of elements
   int arrayLength = numbers.length;

   // calculate the average
   // convert the average from int to double
   average =  ((double)sum / (double)arrayLength);

   System.out.println("Sum = " + sum);
   System.out.println("Average = " + average);
   
/*-------------------------------------------------------------------------*/
//Multidimensional Arrays

//int[][] a = new int[3][4];
/*
int[][] a = {
      {1, 2, 3}, 
      {4, 5, 6, 9}, 
      {7}, 
};
*/

    // create a 2d array
        int[][] a = {
            {1, -2, 3}, 
            {-4, -5, 6, 9}, 
            {7}, 
        };
      
        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] innerArray: a) {
            // second for...each loop access each element inside the row
            for(int Data: innerArray) {
                System.out.println(Data);
            }
        }
        
        
    }
    
}
