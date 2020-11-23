public class Tester{
  public static void main(String[]args) {
    // RealNumber num1 = new RealNumber(100);
    // RealNumber num2 = new RealNumber(5);
    // // System.out.println(num1.equals(num2));
    // // System.out.println(num1.add(num2));
    // // System.out.println(num1.multiply(num2));
    // // System.out.println(num1.divide(num2));
    // System.out.println(num1.subtract(num2));

    RationalNumber num1 = new RationalNumber(2, 3);
    RationalNumber num2 = new RationalNumber(2, 0);
    RationalNumber num3 = new RationalNumber(2, -1);

    System.out.println(num1.getValue());
    System.out.println(num2.getValue());
    System.out.println(num3.getValue());
  }
}
