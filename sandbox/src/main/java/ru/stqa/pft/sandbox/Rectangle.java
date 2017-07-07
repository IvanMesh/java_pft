package ru.stqa.pft.sandbox;

/**
 * Created by i.mescheryakov on 07.07.2017.
 */
public class Rectangle {

  public double a;
  public double b;

  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }
  public double area() {
    return this.a * this.b;
  }
}
