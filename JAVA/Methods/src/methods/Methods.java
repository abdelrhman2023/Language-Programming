package methods;
public class Methods {
    
//Java Methods
    
  // create a method
  public int addNumbers(int a, int b) {
    int sum = a + b;
    // return value
    return sum;
  }
  
  // create a method
  public static int square(int num) {

    // return statement
    return num * num;
  }
  
  public static void square_(int a) {
  int square = a * a;
  System.out.println("Square is: " + square);
}
  
// Java Method Overloading
  
  //Overloading by changing the number of arguments
  
    public static void display(int a){
        System.out.println("Arguments: " + a);
    }

    public static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }
  
//By changing the datatype of parameters
    
    // this method accepts int
    public static void display_(int A){
        System.out.println("Got Integer data.");
    }

    // this method  accepts String object
    private static void display_(String A){
        System.out.println("Got String object.");
    }
    
/*------------------------------------------------------------------------*/
 //Java Recursion
    
 //Factorial of a Number Using Recursion
    
    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
