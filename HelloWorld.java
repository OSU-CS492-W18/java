class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // These are Java's native types.
    boolean b = true;
    char c = 'a';
    byte by = 1;
    short sh = 2;
    int in = 4;
    long lo = 8;
    float fl = 32.0f;
    double db = 64.0;
  }
}

/*
 * We can have multiple classes defined within a single file.  Each of them
 * can have a main() function.  When we compile this file, one .class file
 * will be generated for each of the classes it contains.
 */
class SomethingElse {
  public static void main(String[] args) {
    System.out.println("Something else!");
  }
}
