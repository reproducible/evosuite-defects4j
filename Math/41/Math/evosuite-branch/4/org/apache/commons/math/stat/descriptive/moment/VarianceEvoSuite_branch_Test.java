/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:14:34 GMT 2014
 */

package org.apache.commons.math.stat.descriptive.moment;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class VarianceEvoSuite_branch_Test extends VarianceEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      boolean boolean0 = false;
      Variance variance0 = new Variance(boolean0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertEquals(false, variance0.isBiasCorrected());
      assertNotNull(variance0);
      
      double[] doubleArray0 = new double[48];
      double double0 = 1.0;
      doubleArray0[26] = double0;
      double double1 = variance0.evaluate(doubleArray0, doubleArray0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertEquals(false, variance0.isBiasCorrected());
      assertEquals(0.0, double1, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double0);
  }

  @Test
  public void test01()  throws Throwable  {
      Variance variance0 = new Variance();
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertNotNull(variance0);
      
      double[] doubleArray0 = new double[1];
      double double0 = 4959.859163340557;
      doubleArray0[0] = double0;
      double double1 = variance0.evaluate(doubleArray0, doubleArray0, double0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertEquals(0.0, double1, 0.01D);
      assertArrayEquals(new double[] {4959.859163340557}, doubleArray0, 0.01);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test02()  throws Throwable  {
      boolean boolean0 = false;
      Variance variance0 = new Variance(boolean0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(false, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertNotNull(variance0);
      
      double[] doubleArray0 = new double[2];
      double double0 = variance0.evaluate(doubleArray0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(false, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertEquals(0.0, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test03()  throws Throwable  {
      Variance variance0 = new Variance();
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertEquals(true, variance0.isBiasCorrected());
      assertNotNull(variance0);
      
      double[] doubleArray0 = new double[18];
      int int0 = 0;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0[1], int0, int0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(Double.NaN, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test04()  throws Throwable  {
      Variance variance0 = new Variance();
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertEquals(true, variance0.isBiasCorrected());
      assertNotNull(variance0);
      
      double[] doubleArray0 = new double[1];
      double double0 = 4959.859163340557;
      doubleArray0[0] = double0;
      double double1 = variance0.evaluate(doubleArray0, doubleArray0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0.0, double1, 0.01D);
      assertArrayEquals(new double[] {4959.859163340557}, doubleArray0, 0.01);
      assertFalse(double1 == double0);
  }

  @Test
  public void test05()  throws Throwable  {
      Variance variance0 = new Variance();
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertNotNull(variance0);
      
      double[] doubleArray0 = new double[1];
      double double0 = variance0.evaluate(doubleArray0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertEquals(0.0, double0, 0.01D);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test06()  throws Throwable  {
      boolean boolean0 = false;
      Variance variance0 = new Variance(boolean0);
      assertEquals(false, variance0.isBiasCorrected());
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertNotNull(variance0);
      
      double[] doubleArray0 = new double[2];
      int int0 = 0;
      double double0 = variance0.evaluate(doubleArray0, int0, int0);
      assertEquals(false, variance0.isBiasCorrected());
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertEquals(Double.NaN, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test07()  throws Throwable  {
      Variance variance0 = new Variance();
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertNotNull(variance0);
      
      // Undeclared exception!
      try {
        double double0 = variance0.evaluate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Variance variance0 = new Variance();
      assertEquals(0L, variance0.getN());
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(true, variance0.isBiasCorrected());
      assertNotNull(variance0);
      
      double[] doubleArray0 = new double[18];
      double double0 = variance0.evaluate(doubleArray0);
      assertEquals(0L, variance0.getN());
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test09()  throws Throwable  {
      Variance variance0 = new Variance();
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertNotNull(variance0);
      
      SecondMoment secondMoment0 = variance0.moment;
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(Double.NaN, secondMoment0.getResult(), 0.01D);
      assertNotNull(secondMoment0);
      
      Variance variance1 = new Variance(secondMoment0);
      assertEquals(0L, variance1.getN());
      assertEquals(Double.NaN, variance1.getResult(), 0.01D);
      assertEquals(true, variance1.isBiasCorrected());
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(Double.NaN, secondMoment0.getResult(), 0.01D);
      assertNotSame(variance1, variance0);
      assertNotSame(variance0, variance1);
      assertNotNull(variance1);
      assertTrue(variance1.equals((Object)variance0));
      assertTrue(variance0.equals((Object)variance1));
      
      double[] doubleArray0 = new double[2];
      double double0 = 1.9862;
      doubleArray0[0] = double0;
      double double1 = variance1.evaluate(doubleArray0, doubleArray0);
      assertEquals(0L, variance1.getN());
      assertEquals(Double.NaN, variance1.getResult(), 0.01D);
      assertEquals(true, variance1.isBiasCorrected());
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(Double.NaN, secondMoment0.getResult(), 0.01D);
      assertNotSame(variance1, variance0);
      assertNotSame(variance0, variance1);
      assertEquals(0.0, double1, 0.01D);
      assertArrayEquals(new double[] {1.9862, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double0);
      assertTrue(variance1.equals((Object)variance0));
      assertTrue(variance0.equals((Object)variance1));
  }

  @Test
  public void test10()  throws Throwable  {
      Variance variance0 = new Variance();
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertEquals(true, variance0.isBiasCorrected());
      assertNotNull(variance0);
      
      boolean boolean0 = false;
      variance0.setBiasCorrected(boolean0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertEquals(false, variance0.isBiasCorrected());
      
      double[] doubleArray0 = new double[13];
      variance0.incrementAll(doubleArray0);
      assertEquals(false, variance0.isBiasCorrected());
      assertEquals(0.0, variance0.getResult(), 0.01D);
      assertEquals(13L, variance0.getN());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      Variance variance1 = new Variance(variance0);
      assertEquals(false, variance0.isBiasCorrected());
      assertEquals(0.0, variance0.getResult(), 0.01D);
      assertEquals(13L, variance0.getN());
      assertEquals(false, variance1.isBiasCorrected());
      assertEquals(0.0, variance1.getResult(), 0.01D);
      assertEquals(13L, variance1.getN());
      assertNotSame(variance0, variance1);
      assertNotSame(variance1, variance0);
      assertNotNull(variance1);
      assertTrue(variance0.equals((Object)variance1));
      assertTrue(variance1.equals((Object)variance0));
      
      boolean boolean1 = variance1.equals((Object) variance0);
      assertEquals(false, variance0.isBiasCorrected());
      assertEquals(0.0, variance0.getResult(), 0.01D);
      assertEquals(13L, variance0.getN());
      assertEquals(false, variance1.isBiasCorrected());
      assertEquals(0.0, variance1.getResult(), 0.01D);
      assertEquals(13L, variance1.getN());
      assertNotSame(variance0, variance1);
      assertNotSame(variance1, variance0);
      assertTrue(boolean1);
      assertTrue(variance0.equals((Object)variance1));
      assertTrue(variance1.equals((Object)variance0));
      assertFalse(boolean1 == boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      Variance variance0 = new Variance();
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertNotNull(variance0);
      
      double[] doubleArray0 = new double[13];
      variance0.incrementAll(doubleArray0);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0.0, variance0.getResult(), 0.01D);
      assertEquals(13L, variance0.getN());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      Variance variance1 = new Variance(variance0);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0.0, variance0.getResult(), 0.01D);
      assertEquals(13L, variance0.getN());
      assertEquals(true, variance1.isBiasCorrected());
      assertEquals(13L, variance1.getN());
      assertEquals(0.0, variance1.getResult(), 0.01D);
      assertNotSame(variance0, variance1);
      assertNotSame(variance1, variance0);
      assertNotNull(variance1);
      assertTrue(variance0.equals((Object)variance1));
      assertTrue(variance1.equals((Object)variance0));
      
      boolean boolean0 = variance1.equals((Object) variance0);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0.0, variance0.getResult(), 0.01D);
      assertEquals(13L, variance0.getN());
      assertEquals(true, variance1.isBiasCorrected());
      assertEquals(13L, variance1.getN());
      assertEquals(0.0, variance1.getResult(), 0.01D);
      assertNotSame(variance0, variance1);
      assertNotSame(variance1, variance0);
      assertTrue(boolean0);
      assertTrue(variance0.equals((Object)variance1));
      assertTrue(variance1.equals((Object)variance0));
  }

  @Test
  public void test12()  throws Throwable  {
      Variance variance0 = new Variance();
      assertEquals(0L, variance0.getN());
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertNotNull(variance0);
      
      double double0 = Double.NaN;
      variance0.increment(double0);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(1L, variance0.getN());
      assertEquals(0.0, variance0.getResult(), 0.01D);
      
      double double1 = variance0.getResult();
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(1L, variance0.getN());
      assertEquals(0.0, variance0.getResult(), 0.01D);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
  }

  @Test
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      boolean boolean0 = true;
      SecondMoment secondMoment0 = new SecondMoment();
      assertEquals(Double.NaN, secondMoment0.getResult(), 0.01D);
      assertNotNull(secondMoment0);
      
      Variance variance0 = new Variance(boolean0, secondMoment0);
      assertEquals(Double.NaN, secondMoment0.getResult(), 0.01D);
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertNotNull(variance0);
      
      variance0.increment(doubleArray0[1]);
      assertEquals(Double.NaN, secondMoment0.getResult(), 0.01D);
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test14()  throws Throwable  {
      boolean boolean0 = true;
      SecondMoment secondMoment0 = new SecondMoment();
      assertEquals(Double.NaN, secondMoment0.getResult(), 0.01D);
      assertNotNull(secondMoment0);
      
      Variance variance0 = new Variance(boolean0, secondMoment0);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(Double.NaN, secondMoment0.getResult(), 0.01D);
      assertNotNull(variance0);
      
      Variance variance1 = variance0.copy();
      assertEquals(true, variance1.isBiasCorrected());
      assertEquals(Double.NaN, variance1.getResult(), 0.01D);
      assertEquals(0L, variance1.getN());
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(Double.NaN, secondMoment0.getResult(), 0.01D);
      assertNotSame(variance1, variance0);
      assertNotSame(variance0, variance1);
      assertNotNull(variance1);
      assertTrue(variance1.equals((Object)variance0));
      assertTrue(variance0.equals((Object)variance1));
  }

  @Test
  public void test15()  throws Throwable  {
      Variance variance0 = new Variance();
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertEquals(true, variance0.isBiasCorrected());
      assertNotNull(variance0);
      
      Variance variance1 = new Variance(variance0);
      assertEquals(0L, variance1.getN());
      assertEquals(Double.NaN, variance1.getResult(), 0.01D);
      assertEquals(true, variance1.isBiasCorrected());
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertEquals(true, variance0.isBiasCorrected());
      assertNotSame(variance1, variance0);
      assertNotSame(variance0, variance1);
      assertNotNull(variance1);
      assertTrue(variance1.equals((Object)variance0));
      assertTrue(variance0.equals((Object)variance1));
      
      boolean boolean0 = variance1.equals((Object) variance0);
      assertEquals(0L, variance1.getN());
      assertEquals(Double.NaN, variance1.getResult(), 0.01D);
      assertEquals(true, variance1.isBiasCorrected());
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertEquals(true, variance0.isBiasCorrected());
      assertNotSame(variance1, variance0);
      assertNotSame(variance0, variance1);
      assertTrue(boolean0);
      assertTrue(variance1.equals((Object)variance0));
      assertTrue(variance0.equals((Object)variance1));
  }

  @Test
  public void test16()  throws Throwable  {
      boolean boolean0 = false;
      Variance variance0 = new Variance(boolean0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertEquals(false, variance0.isBiasCorrected());
      assertNotNull(variance0);
      
      boolean boolean1 = variance0.isBiasCorrected();
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(0L, variance0.getN());
      assertEquals(false, variance0.isBiasCorrected());
      assertFalse(boolean1);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
  }

  @Test
  public void test17()  throws Throwable  {
      Variance variance0 = new Variance();
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertNotNull(variance0);
      
      double[] doubleArray0 = new double[1];
      double double0 = variance0.evaluate(doubleArray0, doubleArray0[0]);
      assertEquals(Double.NaN, variance0.getResult(), 0.01D);
      assertEquals(true, variance0.isBiasCorrected());
      assertEquals(0L, variance0.getN());
      assertEquals(0.0, double0, 0.01D);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }
}