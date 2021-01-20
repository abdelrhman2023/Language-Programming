
package data_types;

import java.util.Scanner;

public class Data_types {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // -128 ---> 127
        byte a = 100 ;
        a = input.nextByte();
        // -32768 ---> 32767
        short h = 32767 ;
        h = input.nextShort();
        // integer
        int x ;
        x = input.nextInt();
        // print max value for x
        System.out.println(Integer.MAX_VALUE);
        // print min value for x
        System.out.println(Integer.MIN_VALUE);
        long p ;
        p = input.nextLong();
        // print max value for x
        System.out.println(Long.MAX_VALUE);
        // print min value for x
        System.out.println(Long.MIN_VALUE);
        float w = 13.123456789f;
//        w = input.nextFloat();
        //print 7 numbers after decimal point
        System.out.println(w);
        double c = 1.123456789777555d ;
        c = input.nextDouble();
        //print 15 numbers after decimal point
        System.out.println(c);
        boolean e = true;
        e = input.nextBoolean();
        String s = "i love java";
        s = input.next();
        char ch = 'a';
        ch = input.next().charAt(0);
        //binary number
        byte BinaryToDecimal = 0b1111111 ;
        System.out.println(BinaryToDecimal); 
    }
    
}
