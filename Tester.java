public class Tester{
  public static void main(String[]args) {
    // RealNumber num1 = new RealNumber(100);
    // RealNumber num2 = new RealNumber(5);
    // // System.out.println(num1.equals(num2));
    // // System.out.println(num1.add(num2));
    // // System.out.println(num1.multiply(num2));
    // // System.out.println(num1.divide(num2));
    // System.out.println(num1.subtract(num2));

    // RationalNumber num1 = new RationalNumber(2, 3);
    // RationalNumber num2 = new RationalNumber(2, 0);
    // RationalNumber num3 = new RationalNumber(2, -1);

    // System.out.println(num1.getValue());
    // System.out.println(num2.getValue());
    // System.out.println(num3.getValue());

    // System.out.println(num1.getDenominator());
    // System.out.println(num2.getDenominator());
    // System.out.println(num3.getDenominator());
    //
    // System.out.println(num1.getNumerator());
    // System.out.println(num2.getNumerator());
    // System.out.println(num3.getNumerator());

    // RationalNumber num1recip = num1.reciprocal();
    // System.out.println(num1recip.getNumerator());
    // System.out.println(num1recip.getDenominator());

    // RationalNumber num4 = new RationalNumber(2, 4);
    // System.out.println(num4.equals(num1));

    // System.out.println(num1);
    // System.out.println(num2.toString());
    // System.out.println(num3);

    //temporarily changed gcd to public
    // System.out.println(RationalNumber.gcd(45, 210));

    //temporaily changed reduce to public
    // RationalNumber num1 = new RationalNumber(10, 5);
    // System.out.println(num1.getNumerator());
    // System.out.println(num1.getDenominator());
    // num1.reduce();
    // System.out.println("After reducing...");
    // System.out.println(num1.getNumerator());
    // System.out.println(num1.getDenominator());

    // RationalNumber num1 = new RationalNumber(100, 5);
    // RationalNumber num2 = new RationalNumber(4, 1);
    // // System.out.println(num1.multiply(num2));
    // System.out.println(num1.divide(num2));

    // RationalNumber num1 = new RationalNumber(100, 5);
    // System.out.println(num1.getNumerator());
    // System.out.println(num1.getDenominator());

    // RationalNumber num1 = new RationalNumber(15, 100);
    // RationalNumber num2 = new RationalNumber(5, 100);
    // RationalNumber num1 = new RationalNumber(5, 2);
    // RationalNumber num2 = new RationalNumber(2, 3);
    // System.out.println(num1.add(num2));
    // System.out.println(num1.subtract(num2));

    //NEW TESTING WITH NUMBER ABSTRACT CLASS
    // RealNumber num1 = new RealNumber(100);
    // RationalNumber num2 = new RationalNumber(200, 2);
    // RationalNumber num3 = new RationalNumber(400, 4);
    // System.out.println(num1.equals(num2));
    // System.out.println(num2.equals(num3));

    RationalNumber num1 = new RationalNumber(0, 100);
    RationalNumber num2 = new RationalNumber(100, 1);
    RationalNumber num3 = new RationalNumber(10, 5);
    RealNumber num4 = new RealNumber(2);
    // System.out.println(num1);
    // System.out.println(num2);
    System.out.println(num1.compareTo(num2));
    System.out.println(num3.compareTo(num4));
    System.out.println(num2.compareTo(num1));

  }
}
