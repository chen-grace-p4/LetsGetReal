public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(RealNumber other){
    if (this.getValue() == 0.0 && other.getValue() == 0.0) {
      return true;
    }
    double difference1 = Math.abs(this.getValue() - other.getValue()) / this.getValue();
    double difference2 = Math.abs(this.getValue() - other.getValue()) / other.getValue();
    return difference1 <= 0.000001 && difference2 <= 0.000001;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other){
     //other can be ANY RealNumber, including a RationalNumber
     //or other subclasses of RealNumber (that aren't written yet)
   RealNumber retvalue = new RealNumber (this.getValue() + other.getValue());
   return retvalue;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
    RealNumber retvalue = new RealNumber (this.getValue() * other.getValue());
    return retvalue;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other){
    RealNumber retvalue = new RealNumber (this.getValue() / other.getValue());
    return retvalue;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other){
    RealNumber retvalue = new RealNumber (this.getValue() - other.getValue());
    return retvalue;
  }
}
