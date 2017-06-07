/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:31:02 GMT 2014
 */

package org.apache.commons.math.util;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigInteger;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.exception.NonMonotonousSequenceException;
import org.apache.commons.math.util.MathUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockArithmeticException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class MathUtilsEvoSuite_branch_Test extends MathUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = Double.POSITIVE_INFINITY;
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      double double1 = MathUtils.safeNorm(doubleArray0);
      assertFalse(double1 == double0);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test
  public void test01()  throws Throwable  {
      double double0 = 1487.7001;
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = double0;
      double double1 = MathUtils.safeNorm(doubleArray0);
      assertTrue(double1 == double0);
      assertArrayEquals(new double[] {0.0, 1487.7001, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1487.7001, double1, 0.01D);
  }

  @Test
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = MathUtils.safeNorm(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test03()  throws Throwable  {
      int int0 = 2797;
      double double0 = (-1354.7937394162648);
      boolean boolean0 = MathUtils.equalsIncludingNaN((double) int0, double0);
      assertFalse(boolean0);
      
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = double0;
      MathUtils.OrderDirection mathUtils_OrderDirection0 = MathUtils.OrderDirection.DECREASING;
      // Undeclared exception!
      try {
        MathUtils.checkOrder(doubleArray0, mathUtils_OrderDirection0, boolean0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 0 and 1 are not decreasing (-1,354.794 < 0)
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      int int0 = 2797;
      double double0 = (-1354.7937394162648);
      boolean boolean0 = MathUtils.equalsIncludingNaN((double) int0, double0);
      assertFalse(boolean0);
      
      double[] doubleArray0 = new double[8];
      MathUtils.OrderDirection mathUtils_OrderDirection0 = MathUtils.OrderDirection.DECREASING;
      MathUtils.checkOrder(doubleArray0, mathUtils_OrderDirection0, boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      short short0 = (short)7;
      doubleArray0[1] = (double) short0;
      // Undeclared exception!
      try {
        MathUtils.checkOrder(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 1 and 2 are not strictly increasing (7 >= 0)
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      int int0 = 2797;
      boolean boolean0 = MathUtils.equalsIncludingNaN((double) int0, (double) int0);
      assertTrue(boolean0);
      
      double[] doubleArray0 = new double[8];
      MathUtils.OrderDirection mathUtils_OrderDirection0 = MathUtils.OrderDirection.DECREASING;
      // Undeclared exception!
      try {
        MathUtils.checkOrder(doubleArray0, mathUtils_OrderDirection0, boolean0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 0 and 1 are not strictly decreasing (0 <= 0)
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      MathUtils.OrderDirection mathUtils_OrderDirection0 = MathUtils.OrderDirection.INCREASING;
      boolean boolean0 = false;
      MathUtils.checkOrder(doubleArray0, mathUtils_OrderDirection0, boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = MathUtils.distanceInf(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[8];
      double double0 = MathUtils.distance(intArray0, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = MathUtils.distance(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = MathUtils.distance1(intArray0, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = MathUtils.distance1(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte) (-118);
      byteArray0[0] = byte0;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-118), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotNull(bigInteger0);
      assertEquals(0, bigInteger0.shortValue());
      assertEquals(0, bigInteger0.byteValue());
      
      try {
        BigInteger bigInteger1 = MathUtils.pow(bigInteger0, bigInteger0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (-8,502,796,096,475,496,448^-8,502,796,096,475,496,448)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      assertNotNull(bigInteger0);
      assertEquals(1, bigInteger0.byteValue());
      assertEquals(1, bigInteger0.shortValue());
      
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, bigInteger0);
      assertTrue(bigInteger1.equals((Object)bigInteger0));
      assertTrue(bigInteger0.equals((Object)bigInteger1));
      assertNotSame(bigInteger1, bigInteger0);
      assertNotSame(bigInteger0, bigInteger1);
      assertNotNull(bigInteger1);
      assertEquals(1, bigInteger1.shortValue());
      assertEquals(1, bigInteger1.byteValue());
      assertEquals(1, bigInteger0.byteValue());
      assertEquals(1, bigInteger0.shortValue());
  }

  @Test
  public void test15()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      assertNotNull(bigInteger0);
      assertEquals(0, bigInteger0.shortValue());
      assertEquals(0, bigInteger0.byteValue());
      
      int int0 = 18;
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, (long) int0);
      assertSame(bigInteger0, bigInteger1);
      assertSame(bigInteger1, bigInteger0);
      assertNotNull(bigInteger1);
      assertEquals(0, bigInteger0.shortValue());
      assertEquals(0, bigInteger0.byteValue());
      assertEquals(0, bigInteger1.byteValue());
      assertEquals(0, bigInteger1.shortValue());
  }

  @Test
  public void test16()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      assertNotNull(bigInteger0);
      assertEquals(1, bigInteger0.byteValue());
      assertEquals(1, bigInteger0.shortValue());
      
      int int0 = 0;
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, int0);
      assertTrue(bigInteger1.equals((Object)bigInteger0));
      assertTrue(bigInteger0.equals((Object)bigInteger1));
      assertNotSame(bigInteger1, bigInteger0);
      assertNotSame(bigInteger0, bigInteger1);
      assertNotNull(bigInteger1);
      assertEquals(1, bigInteger1.byteValue());
      assertEquals(1, bigInteger1.shortValue());
      assertEquals(1, bigInteger0.byteValue());
      assertEquals(1, bigInteger0.shortValue());
  }

  @Test
  public void test17()  throws Throwable  {
      int int0 = 18;
      long long0 = MathUtils.pow((long) int0, (long) int0);
      assertEquals((-497033925936021504L), long0);
  }

  @Test
  public void test18()  throws Throwable  {
      int int0 = 18;
      int int1 = MathUtils.addAndCheck(int0, int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(36, int1);
      
      long long0 = MathUtils.pow((long) int0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals((-7881464205923057664L), long0);
  }

  @Test
  public void test19()  throws Throwable  {
      int int0 = 0;
      long long0 = 20922789888000L;
      int int1 = MathUtils.pow(int0, long0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0, int1);
  }

  @Test
  public void test20()  throws Throwable  {
      short short0 = (short)623;
      short short1 = MathUtils.indicator(short0);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals((short)1, short1);
      
      long long0 = MathUtils.subAndCheck((long) short0, (long) short1);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals(622L, long0);
  }

  @Test
  public void test21()  throws Throwable  {
      int int0 = (-2312);
      int int1 = MathUtils.subAndCheck(int0, int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(0, int1);
  }

  @Test
  public void test22()  throws Throwable  {
      byte byte0 = (byte)34;
      short short0 = MathUtils.sign((short) byte0);
      assertEquals((short)1, short0);
  }

  @Test
  public void test23()  throws Throwable  {
      short short0 = (short)0;
      short short1 = MathUtils.sign(short0);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      assertEquals((short)0, short1);
  }

  @Test
  public void test24()  throws Throwable  {
      int int0 = (-2312);
      long long0 = MathUtils.sign((long) int0);
      assertEquals((-1L), long0);
  }

  @Test
  public void test25()  throws Throwable  {
      long long0 = 0L;
      long long1 = MathUtils.sign(long0);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
      assertEquals(0L, long1);
  }

  @Test
  public void test26()  throws Throwable  {
      short short0 = (short)623;
      short short1 = MathUtils.indicator(short0);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertEquals((short)1, short1);
      
      long long0 = MathUtils.sign((long) short1);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertEquals(1L, long0);
  }

  @Test
  public void test27()  throws Throwable  {
      int int0 = 661;
      int int1 = MathUtils.sign(int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(1, int1);
  }

  @Test
  public void test28()  throws Throwable  {
      int int0 = 0;
      int int1 = MathUtils.sign(int0);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      assertEquals(0, int1);
  }

  @Test
  public void test29()  throws Throwable  {
      byte byte0 = (byte) (-122);
      byte byte1 = MathUtils.indicator(byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals((byte) (-1), byte1);
      
      int int0 = MathUtils.sign((int) byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals((-1), int0);
  }

  @Test
  public void test30()  throws Throwable  {
      float float0 = (-1741.859F);
      float float1 = MathUtils.sign(float0);
      assertFalse(float0 == float1);
      assertFalse(float1 == float0);
      assertEquals((-1.0F), float1, 0.01F);
  }

  @Test
  public void test31()  throws Throwable  {
      byte byte0 = (byte)0;
      float float0 = MathUtils.sign((float) byte0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test32()  throws Throwable  {
      int int0 = 18;
      float float0 = MathUtils.sign((float) int0);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test
  public void test33()  throws Throwable  {
      float float0 = (-25.167F);
      double double0 = MathUtils.sign((double) float0);
      assertEquals((-1.0), double0, 0.01D);
  }

  @Test
  public void test34()  throws Throwable  {
      int int0 = 0;
      double double0 = MathUtils.sign((double) int0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test35()  throws Throwable  {
      byte byte0 = (byte)73;
      byte byte1 = MathUtils.sign(byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals((byte)1, byte1);
  }

  @Test
  public void test36()  throws Throwable  {
      byte byte0 = (byte) (-31);
      byte byte1 = MathUtils.sign(byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals((byte) (-1), byte1);
  }

  @Test
  public void test37()  throws Throwable  {
      int int0 = 2105;
      int int1 = 17;
      int int2 = MathUtils.pow(int0, int1);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertEquals(1288175033, int2);
      
      float float0 = MathUtils.round((float) int2, int1);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertEquals(1.28817498E9F, float0, 0.01F);
  }

  @Test
  public void test38()  throws Throwable  {
      int int0 = (-2312);
      int int1 = MathUtils.indicator(int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      // Undeclared exception!
      try {
        float float0 = MathUtils.round((float) int1, int1, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid rounding method -1, valid methods: ROUND_CEILING (2), ROUND_DOWN (1), ROUND_FLOOR (3), ROUND_HALF_DOWN (5), ROUND_HALF_EVEN (6), ROUND_HALF_UP (4), ROUND_UNNECESSARY (7), ROUND_UP (0)
         //
      }
  }

  @Test
  public void test39()  throws Throwable  {
      float float0 = (-398.88242F);
      int int0 = (-20);
      int int1 = 5;
      float float1 = MathUtils.round(float0, int0, int1);
      assertFalse(int1 == int0);
      assertFalse(float1 == float0);
      assertFalse(float0 == float1);
      assertFalse(int0 == int1);
      assertEquals(-0.0F, float1, 0.01F);
  }

  @Test
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = 2.0;
      int int0 = 2105;
      doubleArray0[0] = double0;
      double double1 = Double.NaN;
      doubleArray0[2] = double1;
      double[] doubleArray1 = MathUtils.normalizeArray(doubleArray0, (double) int0);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {2.0, 0.0, Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {2105.0, 0.0, Double.NaN, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotNull(doubleArray1);
  }

  @Test
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      int int0 = 2105;
      double double0 = Double.NaN;
      doubleArray0[2] = double0;
      try {
        double[] doubleArray1 = MathUtils.normalizeArray(doubleArray0, (double) int0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
      }
  }

  @Test
  public void test42()  throws Throwable  {
      int int0 = 3434;
      double double0 = 0.0;
      double double1 = MathUtils.scalb(double0, int0);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test
  public void test43()  throws Throwable  {
      int[] intArray0 = new int[9];
      long long0 = MathUtils.mulAndCheck((long) intArray0[7], (long) intArray0[7]);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0L, long0);
  }

  @Test
  public void test44()  throws Throwable  {
      int int0 = (-20);
      long long0 = 0L;
      long long1 = MathUtils.mulAndCheck((long) int0, long0);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
      assertEquals(0L, long1);
  }

  @Test
  public void test45()  throws Throwable  {
      int int0 = (-20);
      byte byte0 = (byte)73;
      long long0 = MathUtils.mulAndCheck((long) int0, (long) byte0);
      assertEquals((-1460L), long0);
  }

  @Test
  public void test46()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = 0;
      int int1 = 4194304;
      intArray0[1] = int1;
      long long0 = MathUtils.lcm((long) intArray0[1], (long) int0);
      assertFalse(int0 == int1);
      assertArrayEquals(new int[] {0, 4194304, 0, 0, 0, 0}, intArray0);
      assertEquals(0L, long0);
  }

  @Test
  public void test47()  throws Throwable  {
      int int0 = (-2312);
      int[] intArray0 = new int[9];
      long long0 = MathUtils.lcm((long) intArray0[8], (long) int0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0L, long0);
  }

  @Test
  public void test48()  throws Throwable  {
      short short0 = (short) (-3019);
      short short1 = MathUtils.indicator(short0);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertEquals((short) (-1), short1);
  }

  @Test
  public void test49()  throws Throwable  {
      int int0 = 2105;
      long long0 = MathUtils.indicator((long) int0);
      assertEquals(1L, long0);
  }

  @Test
  public void test50()  throws Throwable  {
      long long0 = (-1310L);
      long long1 = MathUtils.indicator(long0);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertEquals((-1L), long1);
  }

  @Test
  public void test51()  throws Throwable  {
      int int0 = 8;
      int int1 = MathUtils.indicator(int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(1, int1);
  }

  @Test
  public void test52()  throws Throwable  {
      int int0 = 1114;
      long long0 = 1471L;
      long long1 = MathUtils.lcm((long) int0, long0);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertEquals(1638694L, long1);
  }

  @Test
  public void test53()  throws Throwable  {
      short short0 = (short) (-1055);
      short short1 = MathUtils.sign(short0);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertEquals((short) (-1), short1);
      
      long long0 = MathUtils.gcd((long) short1, (long) short1);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertEquals(1L, long0);
  }

  @Test
  public void test54()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = 1114;
      intArray0[0] = int0;
      long long0 = MathUtils.lcm((long) int0, (long) intArray0[0]);
      assertArrayEquals(new int[] {1114, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(1114L, long0);
  }

  @Test
  public void test55()  throws Throwable  {
      long long0 = 0L;
      long long1 = MathUtils.gcd(long0, long0);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
      assertEquals(0L, long1);
  }

  @Test
  public void test56()  throws Throwable  {
      byte byte0 = (byte)34;
      int[] intArray0 = new int[1];
      int int0 = MathUtils.distanceInf(intArray0, intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
      assertEquals(0, int0);
      
      int int1 = MathUtils.gcd(int0, (int) byte0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new int[] {0}, intArray0);
      assertEquals(34, int1);
  }

  @Test
  public void test57()  throws Throwable  {
      int int0 = 0;
      double double0 = MathUtils.factorialDouble(int0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test
  public void test58()  throws Throwable  {
      byte byte0 = (byte)73;
      double double0 = MathUtils.factorialDouble((int) byte0);
      assertEquals(4.4701154615126436E105, double0, 0.01D);
  }

  @Test
  public void test59()  throws Throwable  {
      int int0 = 2869;
      // Undeclared exception!
      try {
        long long0 = MathUtils.factorial(int0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // factorial value is too large to fit in a long
         //
      }
  }

  @Test
  public void test60()  throws Throwable  {
      byte byte0 = (byte)34;
      byte byte1 = MathUtils.indicator(byte0);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertEquals((byte)1, byte1);
      
      double double0 = MathUtils.factorialLog((int) byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test61()  throws Throwable  {
      double double0 = 2356.428342651934;
      double double1 = MathUtils.sign(double0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(1.0, double1, 0.01D);
      
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = double1;
      double[] doubleArray1 = MathUtils.normalizeArray(doubleArray0, doubleArray0[2]);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotNull(doubleArray1);
      
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test
  public void test62()  throws Throwable  {
      float float0 = (-25.167F);
      byte byte0 = (byte)34;
      byte byte1 = MathUtils.indicator(byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals((byte)1, byte1);
      
      float float1 = MathUtils.indicator(float0);
      assertFalse(float0 == float1);
      assertFalse(float1 == float0);
      assertEquals((-1.0F), float1, 0.01F);
      
      boolean boolean0 = MathUtils.equalsIncludingNaN((double) float1, (double) byte1, (int) byte1);
      assertFalse(byte0 == byte1);
      assertFalse(float0 == float1);
      assertFalse(float1 == float0);
      assertFalse(byte1 == byte0);
      assertFalse(boolean0);
  }

  @Test
  public void test63()  throws Throwable  {
      byte byte0 = (byte) (-122);
      byte byte1 = MathUtils.indicator(byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals((byte) (-1), byte1);
      
      int int0 = MathUtils.compareTo((double) byte1, (double) byte1, (double) byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals(0, int0);
  }

  @Test
  public void test64()  throws Throwable  {
      double double0 = 2.0;
      int int0 = 0;
      // Undeclared exception!
      try {
        boolean boolean0 = MathUtils.equalsIncludingNaN(double0, (double) int0, int0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test65()  throws Throwable  {
      double double0 = 0.0;
      double double1 = 1487.7001;
      double double2 = 0.0;
      boolean boolean0 = MathUtils.equalsIncludingNaN(double0, double1, double2);
      assertFalse(double2 == double1);
      assertTrue(double2 == double0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double1);
      assertTrue(double0 == double2);
      assertFalse(boolean0);
  }

  @Test
  public void test66()  throws Throwable  {
      int int0 = 3434;
      double double0 = MathUtils.scalb((double) int0, int0);
      assertEquals(1.7944987546193256E-196, double0, 0.01D);
      
      int int1 = MathUtils.compareTo(double0, (double) int0, (double) int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
  }

  @Test
  public void test67()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = Double.NaN;
      doubleArray0[2] = double0;
      boolean boolean0 = MathUtils.equalsIncludingNaN(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(boolean0);
  }

  @Test
  public void test68()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      short short0 = (short)7;
      short short1 = MathUtils.indicator(short0);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals((short)1, short1);
      
      boolean boolean0 = MathUtils.equalsIncludingNaN(doubleArray0[1], (double) short1, (double) short1);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(boolean0);
  }

  @Test
  public void test69()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = 1114;
      double double0 = MathUtils.indicator((double) int0);
      assertEquals(1.0, double0, 0.01D);
      
      intArray0[0] = int0;
      intArray0[4] = intArray0[0];
      int int1 = MathUtils.compareTo((double) intArray0[4], (double) intArray0[2], double0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertArrayEquals(new int[] {1114, 0, 0, 0, 1114, 0, 0, 0}, intArray0);
      assertEquals(1, int1);
  }

  @Test
  public void test70()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = 1114;
      double double0 = MathUtils.indicator((double) int0);
      assertEquals(1.0, double0, 0.01D);
      
      intArray0[7] = int0;
      int int1 = MathUtils.compareTo((double) intArray0[6], (double) intArray0[7], double0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 1114}, intArray0);
      assertEquals((-1), int1);
  }

  @Test
  public void test71()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)14;
      byteArray0[0] = byte0;
      // Undeclared exception!
      try {
        long long0 = MathUtils.binomialCoefficient((int) byteArray0[3], (int) byteArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k), got n = 0, k = 14
         //
      }
  }

  @Test
  public void test72()  throws Throwable  {
      int int0 = 1731;
      int int1 = 20;
      double double0 = MathUtils.binomialCoefficientLog(int0, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(106.68329699763166, double0, 0.01D);
  }

  @Test
  public void test73()  throws Throwable  {
      int int0 = 157;
      int int1 = (-1392);
      double double0 = MathUtils.binomialCoefficientLog(int0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test74()  throws Throwable  {
      int int0 = 1731;
      int int1 = 1;
      double double0 = MathUtils.binomialCoefficientLog(int0, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(7.456454555176209, double0, 0.01D);
  }

  @Test
  public void test75()  throws Throwable  {
      byte byte0 = (byte) (-122);
      byte byte1 = MathUtils.indicator(byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals((byte) (-1), byte1);
      
      int int0 = 661;
      int int1 = MathUtils.lcm((int) byte1, int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals(661, int1);
      
      int int2 = 153;
      assertFalse(int2 == int1);
      
      double double0 = MathUtils.binomialCoefficientDouble(int1, int2);
      assertTrue(int1 == int0);
      assertFalse(int1 == int2);
      assertTrue(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertEquals(7.62237225872837E153, double0, 0.01D);
  }

  @Test
  public void test76()  throws Throwable  {
      byte byte0 = (byte) (-122);
      byte byte1 = MathUtils.indicator(byte0);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertEquals((byte) (-1), byte1);
      
      int int0 = MathUtils.lcm((int) byte1, (int) byte0);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertEquals(122, int0);
      
      double double0 = MathUtils.binomialCoefficientDouble(int0, (int) byte0);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test
  public void test77()  throws Throwable  {
      byte byte0 = (byte) (-122);
      byte byte1 = MathUtils.indicator(byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals((byte) (-1), byte1);
      
      int int0 = MathUtils.lcm((int) byte1, (int) byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals(1, int0);
      
      double double0 = MathUtils.binomialCoefficientDouble(int0, (int) byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test
  public void test78()  throws Throwable  {
      int int0 = 0;
      double double0 = MathUtils.binomialCoefficientDouble(int0, int0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test
  public void test79()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = 1114;
      intArray0[0] = int0;
      int int1 = (-733);
      long long0 = MathUtils.binomialCoefficient(intArray0[0], int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new int[] {1114, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(1L, long0);
  }

  @Test
  public void test80()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = (-733);
      intArray0[0] = int0;
      intArray0[4] = intArray0[0];
      intArray0[6] = intArray0[4];
      int int1 = 66;
      double double0 = MathUtils.binomialCoefficientLog(int1, intArray0[6]);
      assertFalse(int1 == int0);
      assertArrayEquals(new int[] {(-733), 0, 0, 0, (-733), 0, (-733), 0}, intArray0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test81()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = 1114;
      intArray0[0] = int0;
      intArray0[3] = intArray0[0];
      int int1 = 1524;
      // Undeclared exception!
      try {
        long long0 = MathUtils.binomialCoefficient(int1, intArray0[3]);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
      }
  }

  @Test
  public void test82()  throws Throwable  {
      int int0 = 20;
      int int1 = 14;
      double double0 = MathUtils.binomialCoefficientLog(int0, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(10.565144066004702, double0, 0.01D);
  }

  @Test
  public void test83()  throws Throwable  {
      int int0 = 0;
      long long0 = MathUtils.binomialCoefficient(int0, int0);
      assertEquals(1L, long0);
  }

  @Test
  public void test84()  throws Throwable  {
      short short0 = (short)7;
      short short1 = MathUtils.indicator(short0);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals((short)1, short1);
      
      long long0 = MathUtils.addAndCheck((long) short0, (long) short1);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals(8L, long0);
  }

  @Test
  public void test85()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      int int0 = MathUtils.hash(doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(31, int0);
  }

  @Test
  public void test86()  throws Throwable  {
      int int0 = 2105;
      int int1 = MathUtils.pow(int0, int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(1254996857, int1);
      
      float float0 = MathUtils.round((float) int1, int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test
  public void test87()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(boolean0);
  }

  @Test
  public void test88()  throws Throwable  {
      double double0 = (-362.8);
      int int0 = 18;
      double double1 = MathUtils.round(double0, int0);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals((-362.8), double1, 0.01D);
  }

  @Test
  public void test89()  throws Throwable  {
      byte byte0 = (byte) (-122);
      double double0 = MathUtils.cosh((double) byte0);
      assertEquals(4.818332836801601E52, double0, 0.01D);
  }

  @Test
  public void test90()  throws Throwable  {
      short short0 = (short)623;
      double double0 = MathUtils.log((double) short0, (double) short0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test
  public void test91()  throws Throwable  {
      byte byte0 = (byte)34;
      byte byte1 = MathUtils.indicator(byte0);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertEquals((byte)1, byte1);
      
      double double0 = MathUtils.sinh((double) byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertEquals(1.1752011936438014, double0, 0.01D);
  }

  @Test
  public void test92()  throws Throwable  {
      double double0 = (-362.8);
      int int0 = MathUtils.hash(double0);
      assertEquals(213540865, int0);
  }

  @Test
  public void test93()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      short short0 = (short)7;
      short short1 = MathUtils.indicator(short0);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertEquals((short)1, short1);
      
      double double0 = MathUtils.normalizeAngle((double) short1, doubleArray0[1]);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test
  public void test94()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      float float0 = MathUtils.round((float) byteArray0[0], (int) byteArray0[0], (int) byteArray0[0]);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(1.0F, float0, 0.01F);
  }
}