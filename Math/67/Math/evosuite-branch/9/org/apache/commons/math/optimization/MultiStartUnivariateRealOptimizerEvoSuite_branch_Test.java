/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:35:28 GMT 2014
 */

package org.apache.commons.math.optimization;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer;
import org.apache.commons.math.optimization.UnivariateRealOptimizer;
import org.apache.commons.math.random.JDKRandomGenerator;
import org.apache.commons.math.random.MersenneTwister;
import org.apache.commons.math.random.RandomAdaptor;
import org.apache.commons.math.random.RandomGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class MultiStartUnivariateRealOptimizerEvoSuite_branch_Test extends MultiStartUnivariateRealOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 1109;
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer1 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) multiStartUnivariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotSame(multiStartUnivariateRealOptimizer1, multiStartUnivariateRealOptimizer0);
      assertNotSame(multiStartUnivariateRealOptimizer0, multiStartUnivariateRealOptimizer1);
      assertFalse(multiStartUnivariateRealOptimizer1.equals((Object)multiStartUnivariateRealOptimizer0));
      assertFalse(multiStartUnivariateRealOptimizer0.equals((Object)multiStartUnivariateRealOptimizer1));
      assertEquals(2147483647, multiStartUnivariateRealOptimizer1.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer1.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer1.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer1.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertNotNull(multiStartUnivariateRealOptimizer1);
      
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try {
        double double0 = multiStartUnivariateRealOptimizer1.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, doubleArray0[1], doubleArray0[4]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-28);
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      try {
        double[] doubleArray0 = multiStartUnivariateRealOptimizer0.getOptimaValues();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no optimum computed yet
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-51);
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      assertNotNull(jDKRandomGenerator0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) jDKRandomGenerator0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      try {
        double[] doubleArray0 = multiStartUnivariateRealOptimizer0.getOptima();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no optimum computed yet
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 3845;
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      // Undeclared exception!
      try {
        double double0 = multiStartUnivariateRealOptimizer0.getFunctionValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 0;
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      UnivariateRealFunction univariateRealFunction0 = null;
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        double double0 = multiStartUnivariateRealOptimizer0.optimize(univariateRealFunction0, goalType0, (double) int0, (double) int0, (double) int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-168);
      MersenneTwister mersenneTwister0 = new MersenneTwister(int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.resetRelativeAccuracy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-669);
      int[] intArray0 = new int[1];
      MersenneTwister mersenneTwister0 = new MersenneTwister(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertArrayEquals(new int[] {0}, intArray0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      int int1 = multiStartUnivariateRealOptimizer0.getMaximalIterationCount();
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertArrayEquals(new int[] {0}, intArray0);
      assertEquals(Integer.MAX_VALUE, int1);
  }

  @Test
  public void test07()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-168);
      MersenneTwister mersenneTwister0 = new MersenneTwister(int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      int int1 = multiStartUnivariateRealOptimizer0.getEvaluations();
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, int1);
  }

  @Test
  public void test08()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 2168;
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      // Undeclared exception!
      try {
        double double0 = multiStartUnivariateRealOptimizer0.getAbsoluteAccuracy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 272;
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      RandomAdaptor randomAdaptor0 = new RandomAdaptor((RandomGenerator) mersenneTwister0);
      assertNotNull(randomAdaptor0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) randomAdaptor0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      // Undeclared exception!
      try {
        double double0 = multiStartUnivariateRealOptimizer0.getResult();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-17);
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.resetMaximalIterationCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 1702;
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.resetAbsoluteAccuracy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 3625;
      MersenneTwister mersenneTwister0 = new MersenneTwister(int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.setRelativeAccuracy((double) int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-838);
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      // Undeclared exception!
      try {
        double double0 = multiStartUnivariateRealOptimizer0.getRelativeAccuracy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-669);
      int[] intArray0 = new int[1];
      MersenneTwister mersenneTwister0 = new MersenneTwister(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertArrayEquals(new int[] {0}, intArray0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      int int1 = multiStartUnivariateRealOptimizer0.getIterationCount();
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertArrayEquals(new int[] {0}, intArray0);
      assertEquals(0, int1);
  }

  @Test
  public void test15()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 0;
      MersenneTwister mersenneTwister0 = new MersenneTwister(int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.setAbsoluteAccuracy((double) int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 0;
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      int int1 = multiStartUnivariateRealOptimizer0.getMaxEvaluations();
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(Integer.MAX_VALUE, int1);
  }
}