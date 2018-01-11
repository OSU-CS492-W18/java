class EmployeeStuff {
  public static void main(String[] args) {
    Employee e = new Employee("Luke Skywalker", 933111111, 50.0);
    System.out.println("Monthly pay for " + e.getName() + ": " + e.getMonthlyPay(160));

    Instructor i = new Instructor("Princess Leia", 933222222, 1000000, 9);
    System.out.println("Monthly pay for " + i.getName() + ": " + i.getMonthlyPay());

    /*
     * Java uses dynamic dispatch to determine at runtime whether an object
     * is of an inherited class and, if so, to call the inherited class's
     * methods instead of the parent class's.  Here, we have an Instructor
     * object stored polymorphically as an Employee, but the Instructor class's
     * getName() and getMonthlyPay() methods are c orrectly called.
     */
    Employee e2 = new Instructor("Darth Vader", 933999999, 500000, 12);
    System.out.println("Monthly pay for " + e2.getName() + ": " + e2.getMonthlyPay(160));

    /*
     * Upcasting a superclass as an instance of a subclass like below is not
     * allowed.  This will be a compile time error.
     */
    // Instructor i2 = new Employee("Han Solo", 933777777, 50);

    /*
     * Since the Employee class doesn't have a printClasses() method, we need
     * to cast as an instructor to call that method.  This only works if the
     * underlying object is in fact an Instructor.  Uncommenting the second
     * line below will result in a runtime error.
     */
    ((Instructor)e2).printClasses();
    // ((Instructor)e).printClasses();

    /*
     * Because the Instructor class implements the Lecturer interface, we can
     * treat Instructor objects as Lecturer objects, like we do in these
     * function calls.
     */
    haveALecture(i);
    haveALecture(((Instructor)e2));
  }

  public static void haveALecture(Lecturer l) {
    System.out.println(l.getName() + " says " + l.deliverLecture());
  }
}
