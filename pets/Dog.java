package pets;

// A public class must be named the same as the file in which it's implemented.
public class Dog {
  // This is a private data member of the Dog class.
  private String name;

  // This is the Dog class's constructor.
  public Dog(String name) {
    this.name = new String(name);
  }

  // Below are two interface methods for the Dog class.
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = new String(name);
  }

  public static String says() {
    return "woof";
  }
}
