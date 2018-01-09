class ArrayStuff {
  public static void main(String[] args) {
    int[] arr = new int[8];
    int[] arr2 = new int[10];

    /*
     * Arrays in Java are pointers, so when we say arr2 = arr like this, we
     * make them point to the same place in memory.  This means when we print
     * arr2[4] below, it's printing the value that's also stored in arr[4],
     * since both arrays point to the same memory.
     */
    arr2 = arr;

    /*
     * Java automatically detects when an array index is out of bounds (like
     * below) and raises an exception.
     */
    // arr[1000] = 10;

    for (int i = 0; i < arr.length; i++) {
      arr[i] = i * i;
    }

    // This is an "enhanced" for loop.
    for (int elem : arr) {
      System.out.println(elem);
    }

    System.out.println("arr2[4]: " + arr2[4]);
  }
}
