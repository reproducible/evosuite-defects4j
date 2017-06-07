/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:03:09 GMT 2014
 */

package org.apache.commons.math.ode.nonstiff;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class EmbeddedRungeKuttaIntegratorEvoSuite_branch_Test extends EmbeddedRungeKuttaIntegratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = (-19.347154624878176);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(double0, double0, double0, double0);
      assertNotNull(dormandPrince853Integrator0);
      assertEquals(19.347154624878176, dormandPrince853Integrator0.getMaxStep(), 0.01D);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(2147483647, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(19.347154624878176, dormandPrince853Integrator0.getMinStep(), 0.01D);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01D);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01D);
      assertEquals(19.347154624878176, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01D);
      
      double double1 = dormandPrince853Integrator0.getMaxGrowth();
      assertEquals(10.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(19.347154624878176, dormandPrince853Integrator0.getMaxStep(), 0.01D);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(2147483647, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(19.347154624878176, dormandPrince853Integrator0.getMinStep(), 0.01D);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01D);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01D);
      assertEquals(19.347154624878176, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 4.1033623904810135;
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(double0, double0, double0, double0);
      assertNotNull(highamHall54Integrator0);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(4.1033623904810135, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01D);
      assertEquals(4.1033623904810135, highamHall54Integrator0.getMaxStep(), 0.01D);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01D);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(2147483647, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(4.1033623904810135, highamHall54Integrator0.getMinStep(), 0.01D);
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      
      double double1 = highamHall54Integrator0.getMinReduction();
      assertEquals(0.2, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(4.1033623904810135, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01D);
      assertEquals(4.1033623904810135, highamHall54Integrator0.getMaxStep(), 0.01D);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01D);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(2147483647, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(4.1033623904810135, highamHall54Integrator0.getMinStep(), 0.01D);
      assertEquals(0, highamHall54Integrator0.getEvaluations());
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = (-19.347154624878176);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(double0, double0, double0, double0);
      assertNotNull(dormandPrince853Integrator0);
      assertEquals(19.347154624878176, dormandPrince853Integrator0.getMaxStep(), 0.01D);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01D);
      assertEquals(19.347154624878176, dormandPrince853Integrator0.getMinStep(), 0.01D);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(2147483647, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01D);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(19.347154624878176, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01D);
      
      double double1 = dormandPrince853Integrator0.getSafety();
      assertEquals(0.9, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(19.347154624878176, dormandPrince853Integrator0.getMaxStep(), 0.01D);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01D);
      assertEquals(19.347154624878176, dormandPrince853Integrator0.getMinStep(), 0.01D);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(2147483647, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01D);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(19.347154624878176, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 4.1033623904810135;
      double[] doubleArray0 = new double[13];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(double0, double0, doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(dormandPrince853Integrator0);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01D);
      assertEquals(4.1033623904810135, dormandPrince853Integrator0.getMinStep(), 0.01D);
      assertEquals(2147483647, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01D);
      assertEquals(4.1033623904810135, dormandPrince853Integrator0.getMaxStep(), 0.01D);
      assertEquals(4.1033623904810135, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01D);
  }
}