/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:34:37 GMT 2014
 */

package org.apache.commons.math.analysis;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BrentSolverEvoSuite_branch_Test extends BrentSolverEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      double double0 = (-1228.4565309081754);
      doubleArray0[2] = double0;
      double double1 = 382.8123101311002;
      doubleArray0[5] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, (-1228.4565309081754), 0.0, 0.0, 382.8123101311002, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(10, polynomialFunction0.degree());
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertNotNull(polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, (-1228.4565309081754), 0.0, 0.0, 382.8123101311002, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertEquals(10, polynomialFunction0.degree());
      assertEquals(9, polynomialFunction1.degree());
      
      PolynomialFunction polynomialFunction2 = polynomialFunction1.polynomialDerivative();
      assertNotNull(polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, (-1228.4565309081754), 0.0, 0.0, 382.8123101311002, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertEquals(10, polynomialFunction0.degree());
      assertEquals(9, polynomialFunction1.degree());
      assertEquals(8, polynomialFunction2.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction2);
      assertNotNull(brentSolver0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, (-1228.4565309081754), 0.0, 0.0, 382.8123101311002, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertEquals(10, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(9, polynomialFunction1.degree());
      assertEquals(8, polynomialFunction2.degree());
      
      double double2 = 2390.7345974153855;
      double double3 = brentSolver0.solve(doubleArray0[3], double2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, (-1228.4565309081754), 0.0, 0.0, 382.8123101311002, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.6846333846148732, double3, 0.01D);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(double3 == double0);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertEquals(10, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(9, polynomialFunction1.degree());
      assertEquals(8, polynomialFunction2.degree());
  }

  @Test
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = Double.NaN;
      doubleArray0[1] = double0;
      double double1 = 3085.4914601931955;
      doubleArray0[2] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, Double.NaN, 3085.4914601931955, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(4, polynomialFunction0.degree());
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertNotNull(polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertArrayEquals(new double[] {0.0, Double.NaN, 3085.4914601931955, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertEquals(4, polynomialFunction0.degree());
      assertEquals(3, polynomialFunction1.degree());
      
      PolynomialFunction polynomialFunction2 = polynomialFunction1.polynomialDerivative();
      assertNotNull(polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertArrayEquals(new double[] {0.0, Double.NaN, 3085.4914601931955, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertEquals(4, polynomialFunction0.degree());
      assertEquals(2, polynomialFunction2.degree());
      assertEquals(3, polynomialFunction1.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction2);
      assertNotNull(brentSolver0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertArrayEquals(new double[] {0.0, Double.NaN, 3085.4914601931955, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertEquals(4, polynomialFunction0.degree());
      assertEquals(2, polynomialFunction2.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(3, polynomialFunction1.degree());
      
      try {
        double double2 = brentSolver0.solve(doubleArray0[2], doubleArray0[1], doubleArray0[0]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[25];
      double double0 = 0.0;
      double double1 = 403.91540481168215;
      doubleArray0[3] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 403.91540481168215, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(24, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 403.91540481168215, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(24, polynomialFunction0.degree());
      
      double double2 = (-900.2819884845942);
      double double3 = brentSolver0.solve(double2, double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 403.91540481168215, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double3, 0.01D);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double2);
      assertTrue(double0 == double3);
      assertFalse(double0 == double1);
      assertFalse(double3 == double2);
      assertTrue(double3 == double0);
      assertFalse(double3 == double1);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(24, polynomialFunction0.degree());
  }

  @Test
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      double double0 = (-1228.4565309081754);
      doubleArray0[2] = double0;
      double double1 = 382.8123101311002;
      doubleArray0[5] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, (-1228.4565309081754), 0.0, 0.0, 382.8123101311002, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(10, polynomialFunction0.degree());
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertNotNull(polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, (-1228.4565309081754), 0.0, 0.0, 382.8123101311002, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertEquals(10, polynomialFunction0.degree());
      assertEquals(9, polynomialFunction1.degree());
      
      PolynomialFunction polynomialFunction2 = polynomialFunction1.polynomialDerivative();
      assertNotNull(polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertArrayEquals(new double[] {0.0, 0.0, (-1228.4565309081754), 0.0, 0.0, 382.8123101311002, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertEquals(10, polynomialFunction0.degree());
      assertEquals(9, polynomialFunction1.degree());
      assertEquals(8, polynomialFunction2.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction2);
      assertNotNull(brentSolver0);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertArrayEquals(new double[] {0.0, 0.0, (-1228.4565309081754), 0.0, 0.0, 382.8123101311002, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertEquals(10, polynomialFunction0.degree());
      assertEquals(9, polynomialFunction1.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(8, polynomialFunction2.degree());
      
      double double2 = brentSolver0.solve(doubleArray0[3], doubleArray0[5]);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertArrayEquals(new double[] {0.0, 0.0, (-1228.4565309081754), 0.0, 0.0, 382.8123101311002, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.6846332166732301, double2, 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertEquals(10, polynomialFunction0.degree());
      assertEquals(9, polynomialFunction1.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(8, polynomialFunction2.degree());
  }

  @Test
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = (-1428.96159530986);
      doubleArray0[0] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {(-1428.96159530986), 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {(-1428.96159530986), 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1, polynomialFunction0.degree());
      
      double double1 = 0.0;
      // Undeclared exception!
      try {
        double double2 = brentSolver0.solve(doubleArray0[0], double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-1428.96159530986,0.0]  Values: [-1428.96159530986,-1428.96159530986]
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[31];
      double double0 = Double.POSITIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(30, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(30, polynomialFunction0.degree());
      
      double double1 = brentSolver0.solve(doubleArray0[0], double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(30, polynomialFunction0.degree());
  }

  @Test
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[18];
      double double0 = (-669.36037037337);
      doubleArray0[4] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-669.36037037337), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(17, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-669.36037037337), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(17, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double double1 = brentSolver0.getRelativeAccuracy();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-669.36037037337), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-14, double1, 0.01D);
      assertFalse(double1 == double0);
      assertEquals(17, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double double2 = brentSolver0.solve(double0, double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-669.36037037337), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-14, double2, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double0);
      assertTrue(double1 == double2);
      assertEquals(17, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
  }

  @Test
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      double double0 = 382.8123101311002;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(10, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(10, polynomialFunction0.degree());
      
      double double1 = brentSolver0.solve(doubleArray0[3], double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(10, polynomialFunction0.degree());
  }

  @Test
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = 0.7428296234076361;
      doubleArray0[1] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.7428296234076361}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.7428296234076361}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      
      double double1 = (-650.7585);
      double double2 = brentSolver0.solve(double0, double1, double0);
      assertArrayEquals(new double[] {0.0, 0.7428296234076361}, doubleArray0, 0.01);
      assertEquals(0.0, double2, 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertEquals(1, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
  }

  @Test
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = 0.0;
      double double1 = Double.NaN;
      double double2 = (-2.2);
      doubleArray0[2] = double2;
      doubleArray0[3] = doubleArray0[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, (-2.2), (-2.2), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(8, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, (-2.2), (-2.2), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(8, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double double3 = brentSolver0.solve(doubleArray0[3], double0, double1);
      assertArrayEquals(new double[] {0.0, 0.0, (-2.2), (-2.2), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double3, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertTrue(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertTrue(double3 == double0);
      assertEquals(8, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[23];
      double double0 = 35.81331306315333;
      double double1 = (-1209.6306142045783);
      doubleArray0[6] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 35.81331306315333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(22, polynomialFunction0.degree());
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertNotNull(polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 35.81331306315333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertEquals(21, polynomialFunction1.degree());
      assertEquals(22, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction1);
      assertNotNull(brentSolver0);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 35.81331306315333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertEquals(21, polynomialFunction1.degree());
      assertEquals(22, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      
      double double2 = brentSolver0.solve(double1, doubleArray0[6], doubleArray0[6]);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 35.81331306315333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(2.9581059581758204E-4, double2, 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertEquals(21, polynomialFunction1.degree());
      assertEquals(22, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = 1.0;
      doubleArray0[1] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0}, doubleArray0, 0.01);
      assertEquals(2, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(2, polynomialFunction0.degree());
      
      double double1 = brentSolver0.solve(doubleArray0[2], double0, double0);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(2, polynomialFunction0.degree());
  }

  @Test
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[18];
      double double0 = (-669.36037037337);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(17, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(17, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      
      double double1 = brentSolver0.getRelativeAccuracy();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-14, double1, 0.01D);
      assertFalse(double1 == double0);
      assertEquals(17, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      
      // Undeclared exception!
      try {
        double double2 = brentSolver0.solve(double1, double1, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Initial guess is not in search interval.  Initial: -669.36037037337  Endpoints: [1.0E-14,1.0E-14]
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[23];
      double double0 = 35.81331306315333;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(22, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(22, polynomialFunction0.degree());
      
      double double1 = brentSolver0.solve(double0, doubleArray0[6], doubleArray0[6]);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(22, polynomialFunction0.degree());
  }
}