/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:43:56 GMT 2014
 */

package org.apache.commons.math.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.distribution.GammaDistributionImpl;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AbstractContinuousDistributionEvoSuite_branch_Test extends AbstractContinuousDistributionEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 0.47;
      double double1 = 1.0E-4;
      GammaDistributionImpl gammaDistributionImpl0 = new GammaDistributionImpl(double1, double0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertNotNull(gammaDistributionImpl0);
      assertEquals(0.47, gammaDistributionImpl0.getBeta(), 0.01D);
      assertEquals(1.0E-4, gammaDistributionImpl0.getAlpha(), 0.01D);
      
      try {
        double double2 = gammaDistributionImpl0.inverseCumulativeProbability(double0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: number of iterations=1, maximum iterations=2,147,483,647, initial=0, lower bound=0, upper bound=0, final a value=0, final b value=0, f(a)=0.458, f(b)=0.529
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 1601.1496514726393;
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertNotNull(normalDistributionImpl0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      
      // Undeclared exception!
      try {
        double double1 = normalDistributionImpl0.inverseCumulativeProbability(double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,601.15 out of [0, 1] range
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 1698.7465060652478;
      GammaDistributionImpl gammaDistributionImpl0 = new GammaDistributionImpl(double0, double0);
      assertNotNull(gammaDistributionImpl0);
      assertEquals(1698.7465060652478, gammaDistributionImpl0.getBeta(), 0.01D);
      assertEquals(1698.7465060652478, gammaDistributionImpl0.getAlpha(), 0.01D);
      
      double double1 = (-2.10264E-4);
      // Undeclared exception!
      try {
        double double2 = gammaDistributionImpl0.inverseCumulativeProbability(double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -0 out of [0, 1] range
         //
      }
  }
}