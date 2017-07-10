package ru.stqa.pft.sanbox;


import org.testng.Assert;

import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Square;

/**
 * Created by i.mescheryakov on 10.07.2017.
 */
public class SquareTests {

  @Test
  public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
