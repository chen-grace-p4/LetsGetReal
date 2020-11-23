public class Tester{
  public static void main(String[]args) {
    RealNumber num1 = new RealNumber(10.0000001);
    RealNumber num2 = new RealNumber(10.0000003);
    System.out.println(num1.equals(num2));

  }
}
