package Polynomial;

import java.util.Scanner;

public class Main {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Polynomial poly1 = new Polynomial();
    Polynomial poly2 = new Polynomial();
    poly1.read(sc);
    poly2.read(sc);
    Polynomial result = poly1.multiply(poly2);
    System.out.println(result);
  }

}
