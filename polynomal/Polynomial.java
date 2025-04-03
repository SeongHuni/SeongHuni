package polynomial;

public class Polynomial {
    private Term[] terms;
    private int size;

    public Polynomial() {
        this.terms = new Term[4]; // 초기 크기 4로 설정
        this.size = 0;
    }

    private void resize() {
        Term[] newTerms = new Term[terms.length * 2];
        System.arraycopy(terms, 0, newTerms, 0, terms.length);
        terms = newTerms;
    }

    public void addTerm(int coefficient, int exponent) {
        if (size == terms.length) {
            resize();
        }
        terms[size++] = new Term(coefficient, exponent);
    }

    public Polynomial multiply(Polynomial other) {
        Polynomial result = new Polynomial();

        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < other.size; j++) {
                int newCoefficient = this.terms[i].getCoefficient() * other.terms[j].getCoefficient();
                int newExponent = this.terms[i].getExponent() + other.terms[j].getExponent();
                result.addTerm(newCoefficient, newExponent);
            }
        }
        return result;
    }

    public String result() {
        String output = "";
        for (int i = 0; i < size; i++) {
            if (terms[i].getExponent() > 0 && i != 0) {
                output += terms[i] + " ";
            }
            if (i < size - 1) {
                output += "+ ";
            }
        }
        return output.trim();
    }
}