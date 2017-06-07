/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 02:53:58 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CMAESOptimizerEvoSuite_branch_Test extends CMAESOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 1186;
      boolean boolean0 = false;
      Well19937a well19937a0 = new Well19937a((long) int0);
      assertNotNull(well19937a0);
      
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>((double) int0, (double) int0);
      assertNotNull(simplePointChecker0);
      assertEquals(1186.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1186.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, (double) int0, boolean0, int0, int0, (RandomGenerator) well19937a0, boolean0, (ConvergenceChecker<PointValuePair>) simplePointChecker0);
      assertNotNull(cMAESOptimizer0);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, cMAESOptimizer0.getMaxIterations());
      assertEquals(0, cMAESOptimizer0.getIterations());
      assertEquals(1186.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1186.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[30];
      double[] doubleArray0 = new double[33];
      doubleArray0[2] = (double) int0;
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      assertNotNull(initialGuess0);
      assertArrayEquals(new double[] {0.0, 0.0, 1186.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[0] = (OptimizationData) initialGuess0;
      assertNotNull(optimizationDataArray0[0]);
      
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
      assertNotNull(cMAESOptimizer_Sigma0);
      assertArrayEquals(new double[] {0.0, 0.0, 1186.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[2] = (OptimizationData) cMAESOptimizer_Sigma0;
      assertNotNull(optimizationDataArray0[2]);
      
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      assertNotNull(simpleBounds0);
      assertArrayEquals(new double[] {0.0, 0.0, 1186.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[1] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[1]);
      
      // Undeclared exception!
      try {
        cMAESOptimizer0.parseOptimizationData(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,186 out of [0, 0] range
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      int int0 = 1;
      boolean boolean0 = false;
      Well44497b well44497b0 = new Well44497b(int0);
      assertNotNull(well44497b0);
      
      ConvergenceChecker<PointValuePair> convergenceChecker0 = null;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, (double) int0, boolean0, int0, int0, (RandomGenerator) well44497b0, boolean0, convergenceChecker0);
      assertNotNull(cMAESOptimizer0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getIterations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(2147483647, cMAESOptimizer0.getMaxIterations());
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      assertNotNull(simpleBounds0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[0] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[0]);
      
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      assertNotNull(initialGuess0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[1] = (OptimizationData) initialGuess0;
      assertNotNull(optimizationDataArray0[1]);
      
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
      assertNotNull(cMAESOptimizer_Sigma0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[2] = (OptimizationData) cMAESOptimizer_Sigma0;
      assertNotNull(optimizationDataArray0[2]);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 1729;
      boolean boolean0 = false;
      RandomGenerator randomGenerator0 = null;
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker((double) int0, (double) int0, int0);
      assertNotNull(simpleValueChecker0);
      assertEquals(1729.0, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1729.0, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, (double) int0, boolean0, int0, int0, randomGenerator0, boolean0, (ConvergenceChecker<PointValuePair>) simpleValueChecker0);
      assertNotNull(cMAESOptimizer0);
      assertEquals(1729.0, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1729.0, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(2147483647, cMAESOptimizer0.getMaxIterations());
      assertEquals(0, cMAESOptimizer0.getIterations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[11];
      double[] doubleArray0 = new double[2];
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
      assertNotNull(cMAESOptimizer_Sigma0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[1] = (OptimizationData) cMAESOptimizer_Sigma0;
      assertNotNull(optimizationDataArray0[1]);
      
      double[] doubleArray1 = new double[1];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      InitialGuess initialGuess0 = new InitialGuess(doubleArray1);
      assertNotNull(initialGuess0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      optimizationDataArray0[3] = (OptimizationData) initialGuess0;
      assertNotNull(optimizationDataArray0[3]);
      
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 1
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 1298;
      boolean boolean0 = true;
      CMAESOptimizer.PopulationSize cMAESOptimizer_PopulationSize0 = new CMAESOptimizer.PopulationSize(int0);
      assertNotNull(cMAESOptimizer_PopulationSize0);
      
      int int1 = cMAESOptimizer_PopulationSize0.getPopulationSize();
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(1298, int1);
      
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      assertTrue(int0 == int1);
      
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>((double) int1, (double) int0, int0);
      assertNotNull(simplePointChecker0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(1298.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(1298.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int1, (double) int1, boolean0, int0, int1, (RandomGenerator) mersenneTwister0, boolean0, (ConvergenceChecker<PointValuePair>) simplePointChecker0);
      assertNotNull(cMAESOptimizer0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getIterations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(2147483647, cMAESOptimizer0.getMaxIterations());
      assertEquals(1298.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(1298.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[32];
      optimizationDataArray0[10] = (OptimizationData) cMAESOptimizer_PopulationSize0;
      assertNotNull(optimizationDataArray0[10]);
      
      cMAESOptimizer0.parseOptimizationData(optimizationDataArray0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getIterations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(2147483647, cMAESOptimizer0.getMaxIterations());
      assertEquals(1298.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(1298.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = (-2122);
      CMAESOptimizer.PopulationSize cMAESOptimizer_PopulationSize0 = null;
      try {
        cMAESOptimizer_PopulationSize0 = new CMAESOptimizer.PopulationSize(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,122 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = (-2762.638156789988);
      doubleArray0[2] = double0;
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = null;
      try {
        cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,762.638 is smaller than the minimum (0)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 61;
      boolean boolean0 = false;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker((double) int0, (double) int0, int0);
      assertNotNull(simpleValueChecker0);
      assertEquals(61.0, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(61.0, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, (double) int0, boolean0, int0, int0, (RandomGenerator) well44497a0, boolean0, (ConvergenceChecker<PointValuePair>) simpleValueChecker0);
      assertNotNull(cMAESOptimizer0);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getIterations());
      assertEquals(2147483647, cMAESOptimizer0.getMaxIterations());
      assertEquals(61.0, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(61.0, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      
      List<Double> list0 = cMAESOptimizer0.getStatisticsFitnessHistory();
      assertNotNull(list0);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getIterations());
      assertEquals(2147483647, cMAESOptimizer0.getMaxIterations());
      assertEquals(61.0, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(61.0, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 1298;
      boolean boolean0 = true;
      CMAESOptimizer.PopulationSize cMAESOptimizer_PopulationSize0 = new CMAESOptimizer.PopulationSize(int0);
      assertNotNull(cMAESOptimizer_PopulationSize0);
      
      int int1 = cMAESOptimizer_PopulationSize0.getPopulationSize();
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(1298, int1);
      
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      assertTrue(int0 == int1);
      
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>((double) int1, (double) int0, int0);
      assertNotNull(simplePointChecker0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(1298.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1298.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int1, (double) int1, boolean0, int0, int1, (RandomGenerator) mersenneTwister0, boolean0, (ConvergenceChecker<PointValuePair>) simplePointChecker0);
      assertNotNull(cMAESOptimizer0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(1298.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1298.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(0, cMAESOptimizer0.getIterations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(2147483647, cMAESOptimizer0.getMaxIterations());
      
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsDHistory();
      assertNotNull(list0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(1298.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1298.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, cMAESOptimizer0.getIterations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(2147483647, cMAESOptimizer0.getMaxIterations());
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 1;
      boolean boolean0 = false;
      Well44497b well44497b0 = new Well44497b(int0);
      assertNotNull(well44497b0);
      
      ConvergenceChecker<PointValuePair> convergenceChecker0 = null;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, (double) int0, boolean0, int0, int0, (RandomGenerator) well44497b0, boolean0, convergenceChecker0);
      assertNotNull(cMAESOptimizer0);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(2147483647, cMAESOptimizer0.getMaxIterations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getIterations());
      
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsMeanHistory();
      assertNotNull(list0);
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(2147483647, cMAESOptimizer0.getMaxIterations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getIterations());
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 1729;
      boolean boolean0 = false;
      RandomGenerator randomGenerator0 = null;
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker((double) int0, (double) int0, int0);
      assertNotNull(simpleValueChecker0);
      assertEquals(1729.0, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1729.0, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, (double) int0, boolean0, int0, int0, randomGenerator0, boolean0, (ConvergenceChecker<PointValuePair>) simpleValueChecker0);
      assertNotNull(cMAESOptimizer0);
      assertEquals(0, cMAESOptimizer0.getIterations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, cMAESOptimizer0.getMaxIterations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(1729.0, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1729.0, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      
      List<Double> list0 = cMAESOptimizer0.getStatisticsSigmaHistory();
      assertNotNull(list0);
      assertEquals(0, cMAESOptimizer0.getIterations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, cMAESOptimizer0.getMaxIterations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(1729.0, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1729.0, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
  }
}