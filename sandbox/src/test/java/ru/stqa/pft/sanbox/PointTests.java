package ru.stqa.pft.sanbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

/**
 * Created by i.mescheryakov on 10.07.2017.
 */
public class PointTests {

  @Test
  public void testArea() {
    Point p1 = new Point(3, 1);
    Point p2 = new Point(7, 4);
    Assert.assertEquals(p1.distance(p2), 5.0);
  }
  @Test
  public void testArea1() {
    Point p1 = new Point(3, 1);
    Point p2 = new Point(7, 4);
    assert p1.distance(p2) == 7;
  }
  @Test
  public void testArea2() {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(1, 1);
    Assert.assertEquals(p1.distance(p2), 0.0);
  }

  }
