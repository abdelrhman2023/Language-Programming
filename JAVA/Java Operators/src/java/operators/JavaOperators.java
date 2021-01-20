package java.operators;
public class JavaOperators {
    public static void main(String[] args) {
        
// Java Arithmetic Operators
        //( +   -   *   /   % )
         // declare variables
    int a = 12, b = 5;

    // addition operator
    System.out.println("a + b = " + (a + b));

    // subtraction operator
    System.out.println("a - b = " + (a - b));

    // multiplication operator
    System.out.println("a * b = " + (a * b));

    // division operator
    System.out.println("a / b = " + (a / b));

    // modulo operator
    System.out.println("a % b = " + (a % b));
    
    /*
    (9 / 2) is 4
    (9.0 / 2) is 4.5
    (9 / 2.0) is 4.5
    (9.0 / 2.0) is 4.5
    */
    
    //Java Assignment Operators
    // ( =   +=   -=   *=   /=   %= )
    // create variables
    int c = 4;
    int var;

    // assign value using =
    var = c;
    System.out.println("var using =: " + var);

    // assign value using =+
    var += c;
    System.out.println("var using +=: " + var);

    // assign value using =*
    var *= c;
    System.out.println("var using *=: " + var);
        
//Java Relational Operators
    //( ==   !=   >   <   >=   <= )
    
    // create variables
    int x = 7, y = 11 ;

    // value of x and y
    System.out.println("x is " + x + " and y is " + y);

    // == operator
    System.out.println(x == y);  // false

    // != operator
    System.out.println(x != y);  // true

    // > operator
    System.out.println(x > y);  // false

    // < operator
    System.out.println(x < y);  // true

    // >= operator
    System.out.println(x >= y);  // false

    // <= operator
    System.out.println(x <= y);  // true
        
//Java Logical Operators
    //( &&   ||   ! )
    
    // && operator
    System.out.println((5 > 3) && (8 > 5));  // true
    System.out.println((5 > 3) && (8 < 5));  // false

    // || operator
    System.out.println((5 < 3) || (8 > 5));  // true
    System.out.println((5 > 3) || (8 < 5));  // true
    System.out.println((5 < 3) || (8 < 5));  // false

    // ! operator
    System.out.println(!(5 == 3));  // true
    System.out.println(!(5 > 3));  // false
        
//Java Unary Operators
    //( +   -   ++   -- )
    
    // declare variables
    int w = 12, e = 12;
    int result1, result2;

    // original value
    System.out.println("Value of a: " + w);

    // increment operator
    result1 = ++w;
    System.out.println("After increment: " + result1);

    System.out.println("Value of b: " + e);

    // decrement operator
    result2 = --e;
    System.out.println("After decrement: " + result2);
    
    /*----------------------------------------------------------*/
    
//Java Bitwise Operators
    //( ~   <<   >>   >>>   &   ^ )
    
// Java Bitwise OR Operator
/*
    12 = 00001100 (In Binary)
    25 = 00011001 (In Binary)

    Bitwise OR Operation of 12 and 25
    00001100
  | 00011001
    ________
    00011101 = 29 (In Decimal)
*/
    
    int number1 = 12, number2 = 25, result;

    // bitwise OR between 12 and 25
    result = number1 | number2;
    System.out.println(result);    // prints 29
    
//Java Bitwise AND Operator
/*
    12 = 00001100 (In Binary)
    25 = 00011001 (In Binary)

    // Bitwise AND Operation of 12 and 25
    00001100
  & 00011001
    ________
    00001000 = 8 (In Decimal)
*/
  
    int number_1 = 12, number_2 = 25, result_;

    // bitwise AND between 12 and 25
    result_ = number_1 & number_2;
    System.out.println(result_);    // prints 8
    
//Java Bitwise XOR Operator
/*
    12 = 00001100 (In Binary)
    25 = 00011001 (In Binary)

    // Bitwise XOR Operation of 12 and 25
    00001100
  ^ 00011001
    ________
    00010101 = 21 (In Decimal)
*/
    
    int number1_ = 12, number2_ = 25, _result;

    // bitwise XOR between 12 and 25
    _result = number1_ ^ number2_;
    System.out.println(_result);    // prints 21
    
//Java Bitwise Complement Operator
/*
    35 = 00100011 (In Binary)
    
    // using bitwise complement operator
    ~ 00100011
    __________
      11011100
*/

//2's Complement
/*
    // compute the 2's complement of 36
    36 = 00100100 (In Binary)
    
    1's complement = 11011011
    
    2's complement:
    11011011
   +       1
   _________
    11011100
*/

    int Number = 35, Result ;

    // bitwise complement of 35
    Result = ~Number;
    System.out.println(Result);    // prints -36
    

//Java Shift Operators
/*
1- Signed Left Shift (<<)
2- Signed Right Shift (>>)
3- Unsigned Right Shift (>>>)
*/

//Java Left Shift Operator
/*
    // left shift of 2
    2 = 0010 (In Binary)
    
    // perform 2 bit left shift
    2 << 8:
    0010 << 2 = 1000 (equivalent to 8)
*/
    int n1 = 2;
   
    // 2 bit left shift operation 
    int r1 = n1 << 2;
    System.out.println(r1);    // prints 8
    
//Java Signed Right Shift Operator
/*
    // right shift of 8
    8 = 1000 (In Binary)

    // perform 2 bit right shift
    8 >> 2:
    1000 >> 2 = 0010 (equivalent to 2)
*/
/*
    // right shift of -8
    8 = 1000 (In Binary)
    
    1's complement = 0111
    
    2's complement:
    
    0111
   +   1
    _____
    1000
    
    Signed bit = 1
    
    // perform 2 bit right shift
    8 >> 2:
    1000 >> 2 = 1110 (equivalent to -2)
*/

    int n2 = 8;
    int n3 = -8;
    
    // 2 bit signed right shift
    System.out.println(n2 >> 2);    // prints 2
    System.out.println(n3 >> 2);    // prints -2

//Java Unsigned Right Shift Operator
/*
    // unsigned right shift of 8
    8 = 1000
    
    8 >>> 2 = 0010
    
    // unsigned right shift of -8
    -8 = 1000 (see calculation above)
    
    -8 >>> 2 = 0010
*/

    int n4 = 8;
    int n5 = -8;
    
    // 2 bit signed right shift
    System.out.println(n4 >>> 2);    // prints 2
    System.out.println(n5 >>> 2);    // prints 1073741822
    }
}
