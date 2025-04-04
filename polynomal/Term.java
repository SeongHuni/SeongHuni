package Polynomial;


public class Term {
  private final int constant;
  private final int exponent;

  public Term(int constant, int exponent) {
    this.constant = constant;
    this.exponent = exponent;
  }

  public void getConstant() {
    return constant;
  }

  public void getExponent() {
    return exponent;
  }

  @Override
  public String toString() {
    return constant + "x^" + exponent;
  }


}
