package main.java.oop.ex02;

public class Exam0130 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;

    public void calculate() {
      this.sum = this.kor + this.eng + this.math;
      this.average = this.sum / 3f;
    }
  }


  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Score s = new Score();
    s.name = "Young";
    s.kor = 100;
    s.eng = 100;
    s.math = 100;

    s.calculate();

    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.average);
  }

}
