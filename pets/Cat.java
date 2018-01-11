package pets;

// A public class must be named the same as the file in which it's implemented.
public class Cat {

  private static final int STARTING_NUM_LIVES = 9;

  // This is a private data member of the Cat class.
  private String name;

  // This is the Cat class's constructor.
  public Cat(String name) {
    this.name = new String(name);
  }

  // Below are two interface methods for the Cat class.
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = new String(name);
  }

  public static String says() {
    return "meow";
  }
}
