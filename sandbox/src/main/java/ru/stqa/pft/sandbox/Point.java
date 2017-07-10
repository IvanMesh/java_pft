package ru.stqa.pft.sandbox;

/**
 * Created by i.mescheryakov on 07.07.2017.
 */
public class Point {

  double x;
  double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;

  }


  public double distance(Point p2) {

    double qx = this.x - p2.x;
    double qy = this.y - p2.y;
    return Math.sqrt(qx * qx + qy * qy);
  }

  public static void main(String[] args) {

    Point p1 = new Point(4, 2);
    Point p2 = new Point(7, 4);
    System.out.println("Дистанция между точками р1 и р2 равна " + p1.distance(p2));

  }
}








