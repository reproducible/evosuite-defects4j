/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:17:33 GMT 2014
 */

package org.apache.commons.math;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.univariate.BrentOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ConvergingAlgorithmImplEvoSuite_branch_Test extends ConvergingAlgorithmImplEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      int int0 = 2808;
      double[] doubleArray0 = new double[10];
      doubleArray0[7] = (double) int0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(7, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2808.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      try {
        double double0 = brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, doubleArray0[8], doubleArray0[2], doubleArray0[7]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // maximal number of iterations (100) exceeded
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      assertEquals(0, riddersSolver0.getIterationCount());
      assertEquals(1.0E-14, riddersSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, riddersSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, riddersSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(riddersSolver0);
      
      riddersSolver0.resetMaximalIterationCount();
      assertEquals(0, riddersSolver0.getIterationCount());
      assertEquals(1.0E-14, riddersSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, riddersSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, riddersSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      assertEquals(1.0E-14, newtonSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, newtonSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, newtonSolver0.getIterationCount());
      assertEquals(1.0E-6, newtonSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(newtonSolver0);
      
      int int0 = newtonSolver0.getIterationCount();
      assertEquals(0, int0);
      assertEquals(1.0E-14, newtonSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, newtonSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, newtonSolver0.getIterationCount());
      assertEquals(1.0E-6, newtonSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertNotNull(brentOptimizer0);
      
      double double0 = brentOptimizer0.getAbsoluteAccuracy();
      assertEquals(1.0E-11, double0, 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      
      BrentSolver brentSolver0 = new BrentSolver(double0);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-11, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      brentSolver0.resetRelativeAccuracy();
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-11, brentSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, secantSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, secantSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, secantSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, secantSolver0.getIterationCount());
      assertNotNull(secantSolver0);
      
      int int0 = secantSolver0.getMaximalIterationCount();
      assertEquals(100, int0);
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, secantSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, secantSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, secantSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, secantSolver0.getIterationCount());
  }

  @Test
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(1.0E-6, laguerreSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, laguerreSolver0.getIterationCount());
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
      assertNotNull(laguerreSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      laguerreSolver0.resetAbsoluteAccuracy();
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(1.0E-6, laguerreSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, laguerreSolver0.getIterationCount());
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }
}