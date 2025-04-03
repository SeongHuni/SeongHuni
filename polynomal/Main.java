package polynomal;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final Polynomial polynomial = new Polynomial(poly1,poly2);
    private String poly1,poly2;

    public static void main(String[] args) {

        System.out.println("다항식을 계수-지수 쌍으로 입력하세요.(지수가 0으로 입력되면 종료");;
        poly1 = sc.nextLine();
        System.out.println("다항식을 계수-지수 쌍으로 입력하세요.(지수가 0으로 입력되면 종료");
        poly2 = sc.nextLine();
        System.out.println("두 다항식의 곱은 :" + result);
    }

}
