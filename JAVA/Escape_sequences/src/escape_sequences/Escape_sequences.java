package escape_sequences;

import java.awt.Toolkit;

public class Escape_sequences {
    public static void main(String[] args) {
        //Backspace
        System.out.println("I\b Love\b Java\b Very\b Much");
        //New Line
        System.out.println("I \nLove \nJava \nVery \nMuch");
        //Carriage Return
        System.out.println("ILoveJava\rVeryMuch");
        //Tab (Horizontal)
        System.out.println("I\tLove\tJava\tVery\tMuch");
        //Backslash
        System.out.println("I\\Love\\Java\\Very\\Much");
        //Single Quote
        System.out.println("'ILoveJavaVeryMuch'");
        //Double Quote
        System.out.println("\"ILoveJavaVeryMuch\"");
        //Alarm or Beep
        Toolkit.getDefaultToolkit().beep();
    }
    
}
