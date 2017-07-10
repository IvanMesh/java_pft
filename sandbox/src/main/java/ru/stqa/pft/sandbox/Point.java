package ru.stqa.pft.sandbox;

/**
 * Created by i.mescheryakov on 07.07.2017.
 */
public class Point {

  double x;
  double y;
  Point(double xКоордината, double yКоордината) {
    this.x = xКоордината;
    this.y = yКоордината;

  }


  public static double distance(Point p1, Point p2) {
    return Math.sqrt((p1.x - p2.x )*(p1.x - p2.x ) + (p1.y - p2.y)*(p1.y - p2.y));
  }

  public static void main(String[] args) {
    Point p1 = new Point(3, 2);
    Point p2 = new Point(7, 4);
    System.out.println("Дистанция между точками р1 и р2 равна " + distance(p1, p2));
  }


  }





