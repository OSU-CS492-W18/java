import pets.Cat;
import pets.Dog;

class PetStuff {
  public static void main(String[] args) {
    // This is how we can allocate a new Cat object.
    Cat c = new Cat("Francis");

    // And this is how we can call one of its public member functions.
    System.out.println("The cat's name is: " + c.getName());
    System.out.println("All cats say: " + Cat.says());
    System.out.println("All dogs say: " + Dog.says());
  }
}
