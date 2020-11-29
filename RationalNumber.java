public class RationalNumber extends Number{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *  If the denominator is negative, negate both numerator and denominator
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    } else if (deno < 0) {
      numerator = -nume;
      denominator = -deno;
    } else {
      numerator = nume;
      denominator = deno;
    }
    reduce();
  }

  public double getValue(){
    return (double) numerator / (double) denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber recip = new RationalNumber(denominator, numerator);
    return recip;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */

  public boolean equals(RationalNumber other){
    return this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator();
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (denominator == 1) {
      return numerator + "";
    }
    if (numerator == 0) {
      return 0 + "";
    }
    return numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){ //temporaily changed to public to test...
    /*use euclids method or a better one*/
    if (a == 0 & b != 0) {
      return b;
    } else if (b == 0 & a != 0) {
      return a;
    }

    int max;
    int min;
    if (a > b) {
      max = a;
      min = b;
    } else {
      max = b;
      min = a;
    }

    int divisor = 1;
    while (divisor != 0) {
      divisor = max % min;
      max = min;
      min = divisor;
    }
    return max;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){ //temporarily changed to public to test...
    int gcd = gcd(numerator, denominator);
    numerator = numerator / gcd;
    denominator = denominator / gcd;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int numvalue = this.getNumerator() * other.getNumerator();
    int denvalue = this.getDenominator() * other.getDenominator();
    RationalNumber retvalue = new RationalNumber(numvalue, denvalue);
    return retvalue;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    other = other.reciprocal();
    int numvalue = this.getNumerator() * other.getNumerator();
    int denvalue = this.getDenominator() * other.getDenominator();
    RationalNumber retvalue = new RationalNumber(numvalue, denvalue);
    return retvalue;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int numvalue;
    int denvalue;
    if (this.getDenominator() != other.getDenominator()) {
      numvalue = this.getNumerator() * other.getDenominator() + other.getNumerator() * this.getDenominator();
      denvalue = this.getDenominator()*other.getDenominator();
    } else {
      numvalue = this.getNumerator() + other.getNumerator();
      denvalue = this.getDenominator();
    }
    RationalNumber retvalue = new RationalNumber(numvalue, denvalue);
    return retvalue;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int numvalue;
    int denvalue;
    if (this.getDenominator() != other.getDenominator()) {
      numvalue = this.getNumerator() * other.getDenominator() - other.getNumerator() * this.getDenominator();
      denvalue = this.getDenominator()*other.getDenominator();
    } else {
      numvalue = this.getNumerator() - other.getNumerator();
      denvalue = this.getDenominator();
    }
    RationalNumber retvalue = new RationalNumber(numvalue, denvalue);
    return retvalue;
  }
}
