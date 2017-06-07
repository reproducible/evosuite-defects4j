/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:42:43 GMT 2014
 */

package org.apache.commons.math.optimization.direct;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.random.UnitSphereRandomVectorGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BOBYQAOptimizerEvoSuite_branch_Test extends BOBYQAOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 2838;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(int0);
      assertNotNull(bOBYQAOptimizer0);
      assertEquals(0, bOBYQAOptimizer0.getEvaluations());
      assertEquals(0, bOBYQAOptimizer0.getMaxEvaluations());
      assertNull(bOBYQAOptimizer0.getGoalType());
      
      double[] doubleArray0 = new double[2];
      int int1 = 0;
      double[][] doubleArray1 = new double[2][5];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray1[0];
      assertNotNull(doubleArray1[1]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertFalse(int1 == int0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int1, int1, unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int1 == int0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try {
        RealPointValuePair realPointValuePair0 = bOBYQAOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0, doubleArray1[1], doubleArray1[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of interpolation points (2,838)
         //
      }
  }
}