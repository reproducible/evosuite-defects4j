/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:39:00 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class UnivariateRealSolverUtilsEvoSuite_branch_Test extends UnivariateRealSolverUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = 93.663188099;
      doubleArray0[0] = double0;
      double double1 = 0.5;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {93.663188099, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double0, double1, double0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=94, maximum iterations=2,147,483,647, initial=93.663, lower bound=0.5, upper bound=93.663, final a value=0.5, final b value=93.663, f(a)=93.663, f(b)=93.663
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = 0.5;
      doubleArray0[3] = double0;
      double double1 = 1581.1055;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(3, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      int int0 = 2;
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[3], double0, double1, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=2, maximum iterations=2, initial=0.5, lower bound=0.5, upper bound=1,581.106, final a value=0.5, final b value=2.5, f(a)=0.062, f(b)=7.812
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = (-2084.0879946);
      double double1 = UnivariateRealSolverUtils.midpoint(double0, double0);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals((-2084.0879946), double1, 0.01D);
      
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], double1, doubleArray0[1]);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {(-1.0), 0.0}, doubleArray1, 0.01);
      assertNotNull(doubleArray1);
      assertTrue(double0 == double1);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertTrue(double1 == double0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = 0.0;
      double double1 = 1424.71868;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double1, doubleArray0[1], double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=1,424.719, upper bound=0
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = (-1160.94618334631);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      int int0 = 1814;
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[1], doubleArray0[7], int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=-1,160.946, upper bound=0
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      int int0 = 0;
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[2], doubleArray0[4], doubleArray0[1], int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = null;
      double double0 = 0.0;
      int int0 = 3022;
      // Undeclared exception!
      try {
        double[] doubleArray0 = UnivariateRealSolverUtils.bracket(univariateRealFunction0, double0, double0, double0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = null;
      double double0 = (-2016.01);
      double double1 = UnivariateRealSolverUtils.midpoint(double0, double0);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals((-2016.01), double1, 0.01D);
      
      // Undeclared exception!
      try {
        double double2 = UnivariateRealSolverUtils.solve(univariateRealFunction0, double0, double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      // Undeclared exception!
      try {
        double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[0], doubleArray0[2], doubleArray0[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      double double0 = 0.0;
      double double1 = UnivariateRealSolverUtils.midpoint(double0, double0);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(0.0, double1, 0.01D);
      
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], double0, double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=0
         //
      }
  }
}