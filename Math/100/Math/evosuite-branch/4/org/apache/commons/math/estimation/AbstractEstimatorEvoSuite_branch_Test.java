/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:03:57 GMT 2014
 */

package org.apache.commons.math.estimation;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.estimation.EstimatedParameter;
import org.apache.commons.math.estimation.EstimationException;
import org.apache.commons.math.estimation.EstimationProblem;
import org.apache.commons.math.estimation.GaussNewtonEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
import org.apache.commons.math.estimation.SimpleEstimationProblem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AbstractEstimatorEvoSuite_branch_Test extends AbstractEstimatorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      assertNotNull(levenbergMarquardtEstimator0);
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      assertNotNull(simpleEstimationProblem0);
      
      try {
        double[] doubleArray0 = levenbergMarquardtEstimator0.guessParametersErrors((EstimationProblem) simpleEstimationProblem0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no degrees of freedom (0 measurements, 0 parameters)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      assertNotNull(levenbergMarquardtEstimator0);
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      
      int int0 = (-3209);
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      assertNotNull(simpleEstimationProblem0);
      
      levenbergMarquardtEstimator0.initializeEstimate(simpleEstimationProblem0);
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      
      String string0 = "9(b";
      EstimatedParameter estimatedParameter0 = new EstimatedParameter(string0, (double) int0);
      assertNotNull(estimatedParameter0);
      assertEquals("9(b", estimatedParameter0.getName());
      assertEquals((-3209.0), estimatedParameter0.getEstimate(), 0.01D);
      assertEquals(false, estimatedParameter0.isBound());
      
      simpleEstimationProblem0.addParameter(estimatedParameter0);
      assertEquals("9(b", estimatedParameter0.getName());
      assertEquals((-3209.0), estimatedParameter0.getEstimate(), 0.01D);
      assertEquals(false, estimatedParameter0.isBound());
      
      try {
        double[][] doubleArray0 = levenbergMarquardtEstimator0.getCovariances((EstimationProblem) simpleEstimationProblem0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unable to compute covariances: singular problem
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      assertNotNull(levenbergMarquardtEstimator0);
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      assertNotNull(simpleEstimationProblem0);
      
      double double0 = levenbergMarquardtEstimator0.getChiSquare((EstimationProblem) simpleEstimationProblem0);
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      assertNotNull(levenbergMarquardtEstimator0);
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      assertNotNull(simpleEstimationProblem0);
      
      double double0 = levenbergMarquardtEstimator0.getRMS((EstimationProblem) simpleEstimationProblem0);
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      assertNotNull(levenbergMarquardtEstimator0);
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      
      int int0 = 8;
      levenbergMarquardtEstimator0.rows = int0;
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      
      // Undeclared exception!
      try {
        levenbergMarquardtEstimator0.updateResidualsAndCost();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = (-3389);
      GaussNewtonEstimator gaussNewtonEstimator0 = new GaussNewtonEstimator(int0, int0, int0);
      assertNotNull(gaussNewtonEstimator0);
      assertEquals(0, gaussNewtonEstimator0.getCostEvaluations());
      assertEquals(0, gaussNewtonEstimator0.getJacobianEvaluations());
      
      try {
        gaussNewtonEstimator0.updateResidualsAndCost();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // maximal number of evaluations exceeded (-3,389)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      assertNotNull(levenbergMarquardtEstimator0);
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      
      double[] doubleArray0 = new double[1];
      levenbergMarquardtEstimator0.jacobian = doubleArray0;
      assertNotNull(levenbergMarquardtEstimator0.jacobian);
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      
      int int0 = 1090;
      levenbergMarquardtEstimator0.rows = int0;
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      assertNotNull(simpleEstimationProblem0);
      
      // Undeclared exception!
      try {
        double[][] doubleArray1 = levenbergMarquardtEstimator0.getCovariances((EstimationProblem) simpleEstimationProblem0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      assertNotNull(levenbergMarquardtEstimator0);
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      
      int int0 = levenbergMarquardtEstimator0.getJacobianEvaluations();
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(0, int0);
  }

  @Test
  public void test8()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      assertNotNull(levenbergMarquardtEstimator0);
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      assertNotNull(simpleEstimationProblem0);
      
      levenbergMarquardtEstimator0.estimate((EstimationProblem) simpleEstimationProblem0);
      assertEquals(1, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(1, levenbergMarquardtEstimator0.getJacobianEvaluations());
  }

  @Test
  public void test9()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      assertNotNull(levenbergMarquardtEstimator0);
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      
      int int0 = levenbergMarquardtEstimator0.getCostEvaluations();
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(0, int0);
  }
}