/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:38:13 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BrentSolverEvoSuite_branch_Test extends BrentSolverEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertNotNull(brentSolver0);
      
      double double0 = (-2301.885588124879);
      double[] doubleArray0 = new double[24];
      doubleArray0[0] = double0;
      double double1 = 1851.75;
      doubleArray0[2] = double1;
      doubleArray0[15] = doubleArray0[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(15, polynomialFunction0.degree());
      assertArrayEquals(new double[] {(-2301.885588124879), 0.0, 1851.75, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1851.75, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[2]);
      assertEquals(15, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(44, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertArrayEquals(new double[] {(-2301.885588124879), 0.0, 1851.75, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1851.75, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals(0.9355113387788883, double2, 0.01D);
  }

  @Test
  public void test01()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      int int0 = (-3608);
      brentSolver0.setMaximalIterationCount(int0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(-3608, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      double[] doubleArray0 = new double[6];
      double double0 = 1842.6699289223598;
      doubleArray0[2] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(2, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 1842.6699289223598, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertEquals(1, polynomialFunction1.degree());
      assertEquals(2, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 1842.6699289223598, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction1);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      
      try {
        double double1 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction1, (double) int0, doubleArray0[2]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-3,608) exceeded
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      double double0 = 650.3724686986316;
      doubleArray0[1] = double0;
      double double1 = (-1719.4194777403109);
      double double2 = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(1, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 650.3724686986316, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(1, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertArrayEquals(new double[] {0.0, 650.3724686986316, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      
      double double3 = brentSolver0.solve(double1, double2);
      assertEquals(1, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertArrayEquals(new double[] {0.0, 650.3724686986316, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double2 == double1);
      assertTrue(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertTrue(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertEquals(0.0, double3, 0.01D);
  }

  @Test
  public void test03()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double[] doubleArray0 = new double[2];
      double double0 = 4201.95;
      doubleArray0[0] = double0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertArrayEquals(new double[] {4201.95, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunctionLagrangeForm0);
      
      double double1 = Double.NaN;
      double double2 = 0.0;
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, double1, double2);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertArrayEquals(new double[] {4201.95, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertTrue(double3 == double2);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double2 == double0);
      assertTrue(double2 == double3);
      assertFalse(double2 == double1);
      assertEquals(0.0, double3, 0.01D);
  }

  @Test
  public void test04()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double double0 = brentSolver0.getAbsoluteAccuracy();
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-6, double0, 0.01D);
      
      double[] doubleArray0 = new double[11];
      doubleArray0[5] = double0;
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(5, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-6, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      double double1 = 1970.740642414892;
      assertFalse(double1 == double0);
      
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, double1);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(5, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-6, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertTrue(double0 == double2);
      assertFalse(double2 == double1);
      assertTrue(double2 == double0);
      assertEquals(1.0E-6, double2, 0.01D);
  }

  @Test
  public void test05()  throws Throwable  {
      double double0 = Double.NaN;
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      //  // Unstable assertion: assertEquals(2, polynomialFunction0.degree());
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      //  // Unstable assertion: assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(0, brentSolver0.getIterationCount());
      //  // Unstable assertion: assertEquals(100, brentSolver0.getMaximalIterationCount());
      //  // Unstable assertion: assertEquals(2, polynomialFunction0.degree());
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(brentSolver0);
      
      // Undeclared exception!
      try {
        double double1 = brentSolver0.solve(doubleArray0[2], double0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [\uFFFD, \uFFFD], Values: [\uFFFD, \uFFFD]
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      double double0 = Double.NaN;
      BrentSolver brentSolver0 = new BrentSolver();
      //  // Unstable assertion: assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(0, brentSolver0.getIterationCount());
      //  // Unstable assertion: assertEquals(100, brentSolver0.getMaximalIterationCount());
      //  // Unstable assertion: assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertNotNull(brentSolver0);
      
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      //  // Unstable assertion: assertEquals(0, polynomialFunction0.degree());
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(polynomialFunction0);
      
      double double1 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, double0);
      //  // Unstable assertion: assertEquals(0, polynomialFunction0.degree());
      //  // Unstable assertion: assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(0, brentSolver0.getIterationCount());
      //  // Unstable assertion: assertEquals(100, brentSolver0.getMaximalIterationCount());
      //  // Unstable assertion: assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertTrue(double0 == double1);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = (-257.7807459413153);
      doubleArray0[0] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {(-257.7807459413153), 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double double1 = Double.POSITIVE_INFINITY;
      double double2 = 2493.170676263486;
      // Undeclared exception!
      try {
        double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, double1, double2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-257.781, \u221E], Values: [-257.781, -257.781]
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double[] doubleArray0 = new double[5];
      double double0 = 349.41326686628;
      doubleArray0[0] = double0;
      double double1 = (-1707.136603193848);
      doubleArray0[4] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(4, polynomialFunction0.degree());
      assertArrayEquals(new double[] {349.41326686628, 0.0, 0.0, 0.0, (-1707.136603193848)}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      double double2 = 0.0;
      double double3 = 0.5;
      double double4 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double2, doubleArray0[0], double3);
      assertEquals(4, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(8, brentSolver0.getIterationCount());
      assertArrayEquals(new double[] {349.41326686628, 0.0, 0.0, 0.0, (-1707.136603193848)}, doubleArray0, 0.01);
      assertFalse(double2 == double4);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double4 == double1);
      assertFalse(double4 == double0);
      assertFalse(double4 == double3);
      assertFalse(double4 == double2);
      assertFalse(double3 == double4);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertEquals(0.6726169069998639, double4, 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = (-4330.00134908387);
      doubleArray0[2] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(2, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, (-4330.00134908387), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double double1 = 0.0;
      double double2 = (-2884.429034196735);
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, double1, double2);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(2, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, (-4330.00134908387), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double0);
      assertTrue(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertTrue(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertEquals(0.0, double3, 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = (-4330.00134908387);
      doubleArray0[2] = double0;
      double double1 = 1998.0;
      doubleArray0[3] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(3, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, (-4330.00134908387), 1998.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(2, polynomialFunction1.degree());
      assertArrayEquals(new double[] {0.0, 0.0, (-4330.00134908387), 1998.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction1);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      
      PolynomialFunction polynomialFunction2 = polynomialFunction1.polynomialDerivative();
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(1, polynomialFunction2.degree());
      assertEquals(2, polynomialFunction1.degree());
      assertArrayEquals(new double[] {0.0, 0.0, (-4330.00134908387), 1998.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction2);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(1, polynomialFunction2.degree());
      assertEquals(2, polynomialFunction1.degree());
      assertArrayEquals(new double[] {0.0, 0.0, (-4330.00134908387), 1998.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      
      double double2 = 1.5;
      double double3 = brentSolver0.solve(doubleArray0[2], doubleArray0[3], double2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(1, polynomialFunction2.degree());
      assertEquals(2, polynomialFunction1.degree());
      assertArrayEquals(new double[] {0.0, 0.0, (-4330.00134908387), 1998.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(double3 == double2);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertEquals(0.722389280794773, double3, 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertNotNull(brentSolver0);
      
      double[] doubleArray0 = new double[3];
      double double0 = (-3510.1786814591906);
      brentSolver0.functionValueAccuracy = double0;
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-3510.1786814591906), brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      double double1 = 649.6;
      double double2 = (-27.204729932646078);
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, double1, double2);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-3510.1786814591906), brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(30, brentSolver0.getIterationCount());
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double3 == double2);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertEquals(423.99842343556907, double3, 0.01D);
  }

  @Test
  public void test12()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertNotNull(brentSolver0);
      
      double[] doubleArray0 = new double[1];
      double double0 = (-1141.6322);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      double double1 = 648.0987985162512;
      double double2 = 0.0;
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, double1, double2);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertFalse(double3 == double0);
      assertTrue(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertTrue(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertEquals(0.0, double3, 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      double double0 = 650.3724686986316;
      doubleArray0[1] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(1, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 650.3724686986316, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertNotNull(brentSolver0);
      
      double double1 = Double.POSITIVE_INFINITY;
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[4], double1, double0);
      assertEquals(1, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertArrayEquals(new double[] {0.0, 650.3724686986316, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(0.0, double2, 0.01D);
  }
}