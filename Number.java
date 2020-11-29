public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other Number
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    //TO BE IMPLEMENTED
    return 0;
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
    if (this.getValue() == 0.0 && other.getValue() == 0.0) {
      return true;
    }
    double difference1 = Math.abs(this.getValue() - other.getValue()) / this.getValue();
    double difference2 = Math.abs(this.getValue() - other.getValue()) / other.getValue();
    return difference1 <= 0.000001 && difference2 <= 0.000001;
  }
}
