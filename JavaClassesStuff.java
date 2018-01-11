import java.time.LocalDateTime;

class JavaClassesStuff {
  public static void main(String[] args) {
    // Object o = new Cat("Francis");

    String greeting = new String("Hello world!");
    // String greeting = "Hello world!";
    String secondGreeting = greeting;
    System.out.println(greeting.charAt(4));

    if (greeting.equals("Hello world!")) {
      System.out.println("The strings are the same");
    }

    if (greeting == "Hello world!") {
      System.out.println("The strings are NOT the same");
    }

    if (greeting == secondGreeting) {
      System.out.println("The pointers are the same");
    }

    System.out.println("Does java have the ternary operator? " + (true ? "yes" : "no"));

    System.out.println(greeting.replace("world", "CS 492"));

    double pi = Double.parseDouble("3.1415");
    int i = Integer.parseInt("16");

    String piStr = String.valueOf(pi);

    System.out.println("The current date/time is: " + LocalDateTime.now());
  }
}
