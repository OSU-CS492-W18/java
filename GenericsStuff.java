import java.util.Stack;

class GenericsStuff {
  public static void main(String[] args) {
    Stack<Integer> intStack = new Stack<Integer>();
    for (int i = 0; i < 10; i++) {
      intStack.push(new Integer(i));
    }

    while (!intStack.isEmpty()) {
      System.out.println(intStack.pop());
    }

    Stack<String> strStack = new Stack<String>();
    for (int i = 0; i < 10; i++) {
      strStack.push(String.valueOf(i) + String.valueOf(i));
    }

    while (!strStack.isEmpty()) {
      System.out.println(strStack.pop());
    }
  }
}
