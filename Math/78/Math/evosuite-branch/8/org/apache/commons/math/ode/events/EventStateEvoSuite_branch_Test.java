/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:27:45 GMT 2014
 */

package org.apache.commons.math.ode.events;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class EventStateEvoSuite_branch_Test extends EventStateEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = 1120.1167106784085;
      int int0 = 3028;
      EventState eventState0 = new EventState(eventHandler0, (double) int0, double0, int0);
      assertEquals(3028, eventState0.getMaxIterationCount());
      assertEquals(1120.1167106784085, eventState0.getConvergence(), 0.01D);
      assertEquals(3028.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertNotNull(eventState0);
      
      double[] doubleArray0 = new double[23];
      boolean boolean0 = eventState0.reset((double) int0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(3028, eventState0.getMaxIterationCount());
      assertEquals(1120.1167106784085, eventState0.getConvergence(), 0.01D);
      assertEquals(3028.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = 1.0;
      int int0 = (-17);
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertEquals(false, eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(-17, eventState0.getMaxIterationCount());
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(1.0, eventState0.getConvergence(), 0.01D);
      assertNotNull(eventState0);
      
      boolean boolean0 = eventState0.stop();
      assertEquals(false, eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(-17, eventState0.getMaxIterationCount());
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(1.0, eventState0.getConvergence(), 0.01D);
      assertFalse(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = 1.0;
      int int0 = (-17);
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(1.0, eventState0.getConvergence(), 0.01D);
      assertEquals(-17, eventState0.getMaxIterationCount());
      assertNotNull(eventState0);
      
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      assertEquals(true, dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01D);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01D);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01D);
      assertNotNull(dummyStepInterpolator0);
      
      // Undeclared exception!
      try {
        boolean boolean0 = eventState0.evaluateStep((StepInterpolator) dummyStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = 0.0;
      int int0 = 0;
      EventState eventState0 = new EventState(eventHandler0, (double) int0, double0, int0);
      assertEquals(false, eventState0.stop());
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(0.0, eventState0.getConvergence(), 0.01D);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertNotNull(eventState0);
      
      double[] doubleArray0 = new double[20];
      boolean boolean0 = false;
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(false, dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01D);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01D);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01D);
      assertNotNull(dummyStepInterpolator0);
      
      // Undeclared exception!
      try {
        boolean boolean1 = eventState0.evaluateStep((StepInterpolator) dummyStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = 14.85689416191017;
      int int0 = (-635);
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertEquals(-635, eventState0.getMaxIterationCount());
      assertEquals(false, eventState0.stop());
      assertEquals(14.85689416191017, eventState0.getConvergence(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(14.85689416191017, eventState0.getMaxCheckInterval(), 0.01D);
      assertNotNull(eventState0);
      
      double double1 = eventState0.getConvergence();
      assertEquals(-635, eventState0.getMaxIterationCount());
      assertEquals(false, eventState0.stop());
      assertEquals(14.85689416191017, eventState0.getConvergence(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(14.85689416191017, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(14.85689416191017, double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
  }

  @Test
  public void test5()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = 1.0;
      int int0 = (-17);
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertEquals(1.0, eventState0.getConvergence(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(-17, eventState0.getMaxIterationCount());
      assertNotNull(eventState0);
      
      double double1 = eventState0.getMaxCheckInterval();
      assertEquals(1.0, eventState0.getConvergence(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(-17, eventState0.getMaxIterationCount());
      assertEquals(1.0, double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
  }

  @Test
  public void test6()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = 1120.1167106784085;
      int int0 = 3028;
      EventState eventState0 = new EventState(eventHandler0, (double) int0, double0, int0);
      assertEquals(3028, eventState0.getMaxIterationCount());
      assertEquals(1120.1167106784085, eventState0.getConvergence(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(3028.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertNotNull(eventState0);
      
      int int1 = eventState0.getMaxIterationCount();
      assertEquals(3028, eventState0.getMaxIterationCount());
      assertEquals(1120.1167106784085, eventState0.getConvergence(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(3028.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(3028, int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }

  @Test
  public void test7()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = 0.0;
      int int0 = 0;
      EventState eventState0 = new EventState(eventHandler0, (double) int0, double0, int0);
      assertEquals(0.0, eventState0.getConvergence(), 0.01D);
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertNotNull(eventState0);
      
      double double1 = eventState0.getEventTime();
      assertEquals(0.0, eventState0.getConvergence(), 0.01D);
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test
  public void test8()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = 14.85689416191017;
      int int0 = (-635);
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertEquals(false, eventState0.stop());
      assertEquals(14.85689416191017, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(-635, eventState0.getMaxIterationCount());
      assertEquals(14.85689416191017, eventState0.getConvergence(), 0.01D);
      assertNotNull(eventState0);
      
      EventHandler eventHandler1 = eventState0.getEventHandler();
      assertEquals(false, eventState0.stop());
      assertEquals(14.85689416191017, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(-635, eventState0.getMaxIterationCount());
      assertEquals(14.85689416191017, eventState0.getConvergence(), 0.01D);
      assertNull(eventHandler1);
  }
}