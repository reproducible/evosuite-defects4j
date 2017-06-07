/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:59:33 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SimplexOptimizerEvoSuite_branch_Test extends SimplexOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = (-1.7976931348623157E308);
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(double0, double0);
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertNotNull(simplexOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      int int0 = 257;
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(int0, (double) int0, double0, (double) int0, (double) int0, double0);
      assertEquals(257, nelderMeadSimplex0.getDimension());
      assertNotNull(nelderMeadSimplex0);
      
      optimizationDataArray0[0] = (OptimizationData) nelderMeadSimplex0;
      assertEquals(257, nelderMeadSimplex0.getDimension());
      assertNotNull(optimizationDataArray0[0]);
      
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(int0);
      assertNotNull(simpleBounds0);
      
      optimizationDataArray0[2] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[2]);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 2374.14;
      int int0 = 3641;
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(double0, double0, int0);
      assertEquals(2374.14, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(2374.14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer((ConvergenceChecker<PointValuePair>) simplePointChecker0);
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(2374.14, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(2374.14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simplexOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[6];
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = double0;
      doubleArray0[1] = (double) int0;
      doubleArray0[2] = (double) int0;
      doubleArray0[3] = (double) int0;
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      assertNotNull(initialGuess0);
      assertArrayEquals(new double[] {2374.14, 3641.0, 3641.0, 3641.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[0] = (OptimizationData) initialGuess0;
      assertNotNull(optimizationDataArray0[0]);
      
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0, double0, doubleArray0[3]);
      assertEquals(4, multiDirectionalSimplex0.getDimension());
      assertNotNull(multiDirectionalSimplex0);
      assertArrayEquals(new double[] {2374.14, 3641.0, 3641.0, 3641.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[1] = (OptimizationData) multiDirectionalSimplex0;
      assertEquals(4, multiDirectionalSimplex0.getDimension());
      assertNotNull(optimizationDataArray0[1]);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = (-1.7976931348623157E308);
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(double0, double0);
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertNotNull(simplexOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
      }
  }
}