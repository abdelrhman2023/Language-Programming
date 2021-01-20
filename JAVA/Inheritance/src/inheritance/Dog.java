package inheritance;
public class Dog extends Animal {

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
  
  //Method overriding in Java Inheritance
  /*
  
//super Keyword in Java Inheritance
    * Previously we saw that the same method in the subclass overrides the method in superclass.
    * In such a situation, the super keyword is used to call the method of the parent class from the method of the child class.
 
  */
  
  // overriding the eat() method
  @Override
  public void eat() {
    
    // call method of superclass
    super.eat();
    System.out.println("I eat dog food");
  }

  // new method in subclass
  public void bark() {
    System.out.println("I can bark");
    
    
  }
  
}
