package Polynomial;

import java.util.Scanner;

public class Polynomial {
  private Term[] term =  new Term[4];
  private int size = 0;

  public Polynomial(int size){
    if(size == term.length){
      resize();
    }
  }

  private void resize(){
    Term[] newTerms = new Term[size*2];
    for(int i=0;i< term.length;i++){
      newTerms[i] = term[i];
      size++;
    }
    term = newTerms;
  }

  //입력 받은 게수 지수를 입력시 각각 배열에 저장해둠.
  public void read(Scanner sc){
    int constant = 0;
    int exponent = 0;

    System.out.println("다항식을 계수-지수 쌍으로 입력하세요.(지수가 0으로 입력되면 종료");
    while(true){ //지수가 0이 될때까지만 입력받기
      if(exponent == 0){
        break;
      }
      constant = sc.nextInt();
      exponent = sc.nextInt();

      addTerm(constant, exponent);
    }

  }

  public Polynomial multiply(Polynomial other) {
    Polynomial result = new Polynomial();
    for (int i = 0; i < size; i++) {
      for (int j = 0; j <other.size; j++) {
        int newCon = term[i].getConstant() * other.term[j].getConstant();
        int newExp = term[i].getExponent() + other.term[j].getExponent();
        result.addTerm(newCon, newExp);
      }
    }
    return result;
  }

  private void addTerm(int constant, int exponent){
    if (size == term.length) {
      resize();
    }
    term[size] = new Term(constant, exponent);
  }

  //계산된 결과값 출력
  public void result(Polynomial polynomial){
    System.out.print("두 다항식의 곱은 : " );
    for(int i = 0; i < size; i++){
      System.out.print(polynomial.term[i]);
    }
    
  }

}
