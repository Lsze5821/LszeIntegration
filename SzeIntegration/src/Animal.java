
public class Animal {
  void walk() {//animal actions also method
    System.out.println("Foot steps");//prints out walk
  }
}

class Dog extends Animal{//dog extends animal which means it contains method from animal
  void bark() {
    System.out.println("Barf-Barf");//prints out the dog action dog
  }

public static void Action(String args[]) {
  Dog dog = new Dog();//assigning dog
  dog.walk();
  dog.bark();
  }
}