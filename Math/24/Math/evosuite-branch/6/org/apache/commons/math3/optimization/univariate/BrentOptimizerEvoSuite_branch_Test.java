/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 16:03:05 GMT 2014
 */

package org.apache.commons.math3.optimization.univariate;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Asin;
import org.apache.commons.math3.analysis.function.Atanh;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.univariate.BrentOptimizer;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BrentOptimizerEvoSuite_branch_Test extends BrentOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 2.80055E-8;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNotNull(brentOptimizer0);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      
      int int0 = 453;
      Asin asin0 = new Asin();
      assertNotNull(asin0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      double double1 = (-1760.047);
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) asin0, goalType0, double1, double1, double0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertNotNull(univariatePointValuePair0);
      assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      assertEquals(2.80055E-8, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals((-1760.047), brentOptimizer0.getMin(), 0.01D);
      assertEquals((-1760.047), brentOptimizer0.getMax(), 0.01D);
      assertEquals(453, brentOptimizer0.getMaxEvaluations());
      assertEquals(27, brentOptimizer0.getEvaluations());
      assertEquals((-7.843080300015839E-16), univariatePointValuePair0.getValue(), 0.01D);
      assertEquals((-7.843080300015839E-16), univariatePointValuePair0.getPoint(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 2.80055E-8;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      //  // Unstable assertion: assertNotNull(brentOptimizer0);
      //  // Unstable assertion: assertNull(brentOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, brentOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(0, brentOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      //  // Unstable assertion: assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      //  // Unstable assertion: assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      
      int int0 = 453;
      double double1 = (-1760.047);
      Atanh atanh0 = new Atanh();
      //  // Unstable assertion: assertNotNull(atanh0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) atanh0, goalType0, double1, double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertNotNull(univariatePointValuePair0);
      //  // Unstable assertion: assertEquals((-1760.0468883388385), univariatePointValuePair0.getPoint(), 0.01D);
      //  // Unstable assertion: assertEquals(Double.NaN, univariatePointValuePair0.getValue(), 0.01D);
      //  // Unstable assertion: assertEquals(453, brentOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals((-1760.047), brentOptimizer0.getMin(), 0.01D);
      //  // Unstable assertion: assertEquals(35, brentOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(2.80055E-8, brentOptimizer0.getMax(), 0.01D);
      //  // Unstable assertion: assertEquals((-880.0234999859973), brentOptimizer0.getStartValue(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 3.814697265625E-6;
      double double1 = 0.167;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double1);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertNotNull(brentOptimizer0);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      
      ConvergenceChecker<UnivariatePointValuePair> convergenceChecker0 = brentOptimizer0.getConvergenceChecker();
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertNull(convergenceChecker0);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      
      BrentOptimizer brentOptimizer1 = new BrentOptimizer(double1, double0, convergenceChecker0);
      assertFalse(brentOptimizer0.equals((Object)brentOptimizer1));
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(brentOptimizer1.equals((Object)brentOptimizer0));
      assertNotSame(brentOptimizer0, brentOptimizer1);
      assertNotSame(brentOptimizer1, brentOptimizer0);
      assertNotNull(brentOptimizer1);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer1.getEvaluations());
      assertEquals(0.0, brentOptimizer1.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer1.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer1.getMax(), 0.01D);
      assertNull(brentOptimizer1.getGoalType());
      assertEquals(0, brentOptimizer1.getMaxEvaluations());
      
      int int0 = 357;
      Sin sin0 = new Sin();
      assertNotNull(sin0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer1.optimize(int0, (UnivariateFunction) sin0, goalType0, double1, double0, double0);
      assertFalse(brentOptimizer0.equals((Object)brentOptimizer1));
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(brentOptimizer1.equals((Object)brentOptimizer0));
      assertNotSame(brentOptimizer0, brentOptimizer1);
      assertNotSame(brentOptimizer1, brentOptimizer0);
      assertNotNull(univariatePointValuePair0);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(8.266448974609374E-6, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(8.266448974515228E-6, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(0.167, brentOptimizer1.getMin(), 0.01D);
      assertEquals(357, brentOptimizer1.getMaxEvaluations());
      assertEquals(3.814697265625E-6, brentOptimizer1.getMax(), 0.01D);
      assertEquals(12, brentOptimizer1.getEvaluations());
      assertEquals(3.814697265625E-6, brentOptimizer1.getStartValue(), 0.01D);
      assertEquals(GoalType.MINIMIZE, brentOptimizer1.getGoalType());
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 3.814697265625E-6;
      double double1 = (-1602.436193599);
      double double2 = 0.167;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertNotNull(brentOptimizer0);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      
      int int0 = 357;
      Sin sin0 = new Sin();
      assertNotNull(sin0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) sin0, goalType0, double2, double1, double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertNotNull(univariatePointValuePair0);
      assertEquals((-447.49797667911355), univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals((-0.9840264217888028), univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(0.167, brentOptimizer0.getMin(), 0.01D);
      assertEquals(3.814697265625E-6, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals(357, brentOptimizer0.getMaxEvaluations());
      assertEquals((-1602.436193599), brentOptimizer0.getMax(), 0.01D);
      assertEquals(13, brentOptimizer0.getEvaluations());
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = 3.814697265625E-6;
      double double1 = (-1602.436193599);
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertFalse(double0 == double1);
      assertNotNull(brentOptimizer0);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      
      int int0 = 352;
      Sin sin0 = new Sin();
      assertNotNull(sin0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) sin0, goalType0, double0, double1, double0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertNotNull(univariatePointValuePair0);
      assertEquals((-4.712388989659198), univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(1.0, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(352, brentOptimizer0.getMaxEvaluations());
      assertEquals(3.814697265625E-6, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      assertEquals(3.814697265625E-6, brentOptimizer0.getMin(), 0.01D);
      assertEquals((-1602.436193599), brentOptimizer0.getMax(), 0.01D);
      assertEquals(16, brentOptimizer0.getEvaluations());
  }

  @Test
  public void test5()  throws Throwable  {
      double double0 = 2.80055E-8;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNotNull(brentOptimizer0);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      
      int int0 = 453;
      Atanh atanh0 = new Atanh();
      assertNotNull(atanh0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) atanh0, goalType0, double0, double0);
      assertNotNull(univariatePointValuePair0);
      assertEquals(2.8005500000000005E-8, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(2.80055E-8, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(453, brentOptimizer0.getMaxEvaluations());
      assertEquals(2.80055E-8, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1, brentOptimizer0.getEvaluations());
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals(2.80055E-8, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(2.80055E-8, brentOptimizer0.getMin(), 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      double double0 = 3.814697265625E-6;
      double double1 = (-1602.436193599);
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer(double0, double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,602.436 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      double double0 = 3.814697265625E-6;
      double double1 = (-1602.436193599);
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer(double1, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,602.436 is smaller than the minimum (0)
         //
      }
  }
}