package main.java.oop.ex01;

public class Exam240 {

  public static void main(String[] args) {

    class Score {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
    }

    Score[] arr = new Score[3];

    arr[0] = new Score();
    arr[1] = new Score();

    arr[0].name = "Elise";
    arr[0].kor = 100;
    arr[0].eng = 100;
    arr[0].math = 100;
    arr[0].sum = arr[0].kor + arr[0].eng + arr[0].math;
    arr[0].aver = arr[0].sum / 3f;

    arr[1].name = "Even";
    arr[1].kor = 100;
    arr[1].eng = 100;
    arr[1].math = 100;
    arr[1].sum = arr[1].kor + arr[1].eng + arr[1].math;
    arr[1].aver = arr[1].sum / 3f;


    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%s: %d, %d, %d, %d, %.1f\n", arr[i].name, arr[i].kor, arr[i].eng,
          arr[i].math, arr[i].sum, arr[i].aver);
    }
  }
}