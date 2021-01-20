package inheritance;
public class Animal {
   /*
    //protected Members in Inheritance
        In Java, if a class includes protected fields and methods, then these fields and methods are accessible from the subclass of the class.
    */
    
// field and method of the parent class
  protected String name;
  
  public void eat() {
    System.out.println("I can eat");
  }
  
/*
//Why use inheritance?
    The most important use of inheritance in Java is code reusability. The code that is present in the parent class can be directly used by the child class.
    Method overriding is also known as runtime polymorphism. Hence, we can achieve Polymorphism in Java with the help of inheritance.
//Types of inheritance
    
  1. Single Inheritance:
    In single inheritance, a single subclass extends from a single superclass.  
    
  2. Multilevel Inheritance
    In multilevel inheritance, a subclass extends from a superclass and then the same subclass acts as a superclass for another class.
  
  3. Hierarchical Inheritance
    In hierarchical inheritance, multiple subclasses extend from a single superclass.
  
  4. Multiple Inheritance
    In multiple inheritance, a single subclass extends from multiple superclasses.
  
  5. Hybrid Inheritance
    Hybrid inheritance is a combination of two or more types of inheritance.
  */
  
  
/*
//Java super
    The super keyword in Java is used in subclasses to access superclass members (attributes, constructors and methods).

//Uses of super keyword
    1- To call methods of the superclass that is overridden in the subclass.
    2- To access attributes (fields) of the superclass if both superclass and subclass have attributes with the same name.
    3- To explicitly call superclass no-arg (default) or parameterized constructor from the subclass constructor.
  
*/
}
