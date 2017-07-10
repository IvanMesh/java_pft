package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
      hello("world");
      hello("user");
      hello("Ivan");

      Square s = new Square(5);
      System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

      Rectangle r = new Rectangle(4, 6);
      System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

/*Домашка, второе задание*/
      Point p1 = new Point(5, 2);
      Point p2 = new Point(7, 5);
      System.out.println("Дистанция между точками р1 и р2 равна " + p1.distance(p2));
    }
/*Конец второго домашнего задания*/

    public static void hello (String somebody){

      System.out.println("Hello, " + somebody + "!");
    }


  }