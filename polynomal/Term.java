package polynomal;

public class Term {
    private int constant; // 계수
    private int exponent;    // 지수

    public Term(int coefficient, int exponent) {
        this.constant = coefficient;
        this.exponent = exponent;
    }

    public int getConstant() {
        return constant;
    }

    public int getExponent() {
        return exponent;
    }

    @Override
    public String toString() {
        return constant + (exponent != 0 ? "x^" + exponent : "");
    }
}
