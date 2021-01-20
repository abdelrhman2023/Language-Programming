package inheritance;
public class Inheritance {
    public static void main(String[] args) {
        
//Java Inheritance
    
    // create an object of the subclass
    Dog labrador = new Dog();

    // access field of superclass
    labrador.name = "Rohu";
    labrador.display();

    // call method of superclass
    // using object of subclass
    labrador.eat();
    
    /*
    (is-a relationship)
    In Java, inheritance is an is-a relationship. That is, we use inheritance only if there exists an is-a relationship between two classes. For example,

    1- Car is a Vehicle
    2- Orange is a Fruit
    3- Surgeon is a Doctor
    4- Dog is an Animal
    */
    
    
    }
    
}
