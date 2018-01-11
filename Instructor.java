/*
 * This Instructor class inherits from the Employee class from Employee.java.
 * It also implements the Lecturer interface defined in Lecturer.java.
 */
class Instructor extends Employee implements Lecturer {
  private int appointmentMonths;

  public Instructor(String name, int id, double payRate, int appointmentMonths) {
    /*
     * Because name, id, and payRate are private fields of the Employee class,
     * we need to invoke the Employee class's constructor to initialize them.
     * We do that using the super keyword.
     */
    super(name, id, payRate);
    this.appointmentMonths = appointmentMonths;
  }

  public void printClasses() {
    System.out.println("CS 492, CS 480, CS 162");
  }

  @Override
  public String getName() {
    // We can call a method from the superclass using the super keyword.
    return super.getName() + "**";
  }

  /*
   * Here, we're overriding the Employee class's getMonthlyPay() method to
   * compute the Instructor's monthly pay as a salary instead of a wage.
   * The @Override annotation is not needed here, but it's good practice.
   */
  @Override
  public double getMonthlyPay(double hoursWorked) {
    return this.getPayRate() / this.appointmentMonths;
  }

  public double getMonthlyPay() {
    return this.getPayRate() / this.appointmentMonths;
  }

  public String deliverLecture() {
    return "Blah, blah, blah...";
  }
}
