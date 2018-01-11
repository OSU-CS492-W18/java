class CatStuff {
  public static void main(String[] args) {
    // This is how we can allocate a new Cat object.
    Cat c = new Cat("Francis");

    // And this is how we can call one of its public member functions.
    System.out.println("The cat's name is: " + c.getName());
  }
}
