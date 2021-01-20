package pkgabstract;
public class Abstract {
    public static void main(String[] args) {
     
/*
//Java Abstract Class
    The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes).
    We use the abstract keyword to declare an abstract class. 
    
    If the abstract class includes any abstract method,
    then all the child classes inherited from the abstract superclass must provide the implementation of the abstract method.
    
        
*/

// create an object of Dog class
    Dog d1 = new Dog();

    d1.makeSound();
    d1.eat();
    
/*
//Key Points to Remember:
    1- We use the abstract keyword to create abstract classes and methods.
    2- An abstract method doesn't have any implementation (method body).
    3- A class containing abstract methods should also be abstract.
    4- We cannot create objects of an abstract class.
    5- To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
    6- A subclass must override all abstract methods of an abstract class. However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
    7- We can access the static attributes and methods of an abstract class using the reference of the abstract class. For example,    
*/

    }
    
}
