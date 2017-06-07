/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:18:29 GMT 2014
 */

package org.apache.commons.math3.optim;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.linear.SimplexSolver;
import org.apache.commons.math3.optim.univariate.BrentOptimizer;
import org.apache.commons.math3.optim.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BaseOptimizerEvoSuite_branch_Test extends BaseOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 1.0;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNotNull(brentOptimizer0);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(2147483647, brentOptimizer0.getMaxIterations());
      assertEquals(0, brentOptimizer0.getIterations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[8];
      MaxIter maxIter0 = MaxIter.unlimited();
      assertNotNull(maxIter0);
      assertEquals(2147483647, maxIter0.getMaxIter());
      
      optimizationDataArray0[3] = (OptimizationData) maxIter0;
      assertNotNull(optimizationDataArray0[3]);
      assertEquals(2147483647, maxIter0.getMaxIter());
      
      try {
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 5.94;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNotNull(brentOptimizer0);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(2147483647, brentOptimizer0.getMaxIterations());
      assertEquals(0, brentOptimizer0.getIterations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[8];
      MaxEval maxEval0 = MaxEval.unlimited();
      assertNotNull(maxEval0);
      assertEquals(2147483647, maxEval0.getMaxEval());
      
      optimizationDataArray0[2] = (OptimizationData) maxEval0;
      assertNotNull(optimizationDataArray0[2]);
      assertEquals(2147483647, maxEval0.getMaxEval());
      
      // Undeclared exception!
      try {
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertNotNull(simplexSolver0);
      assertEquals(0, simplexSolver0.getEvaluations());
      assertNull(simplexSolver0.getGoalType());
      assertEquals(2147483647, simplexSolver0.getMaxIterations());
      assertEquals(0, simplexSolver0.getMaxEvaluations());
      assertEquals(0, simplexSolver0.getIterations());
      
      int int0 = simplexSolver0.getIterations();
      assertEquals(0, simplexSolver0.getEvaluations());
      assertNull(simplexSolver0.getGoalType());
      assertEquals(2147483647, simplexSolver0.getMaxIterations());
      assertEquals(0, simplexSolver0.getMaxEvaluations());
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(0, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertNotNull(simplexSolver0);
      assertEquals(0, simplexSolver0.getMaxEvaluations());
      assertEquals(0, simplexSolver0.getEvaluations());
      assertEquals(2147483647, simplexSolver0.getMaxIterations());
      assertEquals(0, simplexSolver0.getIterations());
      assertNull(simplexSolver0.getGoalType());
      
      int int0 = simplexSolver0.getEvaluations();
      assertEquals(0, simplexSolver0.getMaxEvaluations());
      assertEquals(0, simplexSolver0.getEvaluations());
      assertEquals(2147483647, simplexSolver0.getMaxIterations());
      assertEquals(0, simplexSolver0.getIterations());
      assertNull(simplexSolver0.getGoalType());
      assertEquals(0, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertNotNull(simplexSolver0);
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(0, simplexSolver0.getMaxEvaluations());
      assertEquals(0, simplexSolver0.getEvaluations());
      assertEquals(2147483647, simplexSolver0.getMaxIterations());
      assertNull(simplexSolver0.getGoalType());
      
      int int0 = simplexSolver0.getMaxEvaluations();
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(0, simplexSolver0.getMaxEvaluations());
      assertEquals(0, simplexSolver0.getEvaluations());
      assertEquals(2147483647, simplexSolver0.getMaxIterations());
      assertNull(simplexSolver0.getGoalType());
      assertEquals(0, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertNotNull(simplexSolver0);
      assertEquals(0, simplexSolver0.getMaxEvaluations());
      assertEquals(2147483647, simplexSolver0.getMaxIterations());
      assertNull(simplexSolver0.getGoalType());
      assertEquals(0, simplexSolver0.getEvaluations());
      assertEquals(0, simplexSolver0.getIterations());
      
      int int0 = simplexSolver0.getMaxIterations();
      assertEquals(0, simplexSolver0.getMaxEvaluations());
      assertEquals(2147483647, simplexSolver0.getMaxIterations());
      assertNull(simplexSolver0.getGoalType());
      assertEquals(0, simplexSolver0.getEvaluations());
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(Integer.MAX_VALUE, int0);
  }
}