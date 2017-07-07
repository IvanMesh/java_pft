package ru.stqa.pft.sandbox;

/**
 * Created by i.mescheryakov on 07.07.2017.
 */
public class Point {

  double x;
  double y;
  Point(double xCoord, double yCoord) {
    this.x = xCoord;
    this.y = yCoord;

  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt((p1.x - p2.x )*(p1.x - p2.x ) + (p1.y - p2.y)*(p1.y - p2.y));
  }


  }





