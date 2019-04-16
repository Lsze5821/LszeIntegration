// Louis Sze

/*
 * Inheritance is where a child class inherits its methods from parent class. The benefits of
 * inheritance is that you don't have to copy and rewrite new code. This makes it more easier to
 * read and no need to rewrite the same code over again.
 */
public class Animal {
  void walk() {// animal actions also method
    System.out.println("Foot steps");// prints out walk
  }

  public void Action() {
    System.out.println("Dogs extending from animal");
    Dog dog = new Dog();// assigning dog
    dog.walk();
    dog.bark();
    
  }
}


class Dog extends Animal {// dog extends animal which means it contains method from animal
  void bark() {
    System.out.println("Barf-Barf");// prints out the dog action dog
  }
public void Action() {
    System.out.println("Dogs extending from animal");
    Dog dog = new Dog();// assigning dog
    dog.walk();
    dog.bark();
    
  }
  
}
