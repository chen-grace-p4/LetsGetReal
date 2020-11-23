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

    RationalNumber num1 = new RationalNumber(100, 5);
    RationalNumber num2 = new RationalNumber(4, 1);
    // System.out.println(num1.multiply(num2));
    System.out.println(num1.divide(num2));

  }
}
