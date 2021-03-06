/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:21:14 GMT 2014
 */

package org.apache.commons.lang.time;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.lang.time.StopWatch;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class StopWatchEvoSuite_branch_Test extends StopWatchEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      stopWatch0.start();
      stopWatch0.split();
      String string0 = stopWatch0.toSplitString();
      assertNotNull(string0);
      assertEquals("0:00:00.000", string0);
  }

  @Test
  public void test01()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      stopWatch0.start();
      long long0 = stopWatch0.getTime();
      assertEquals(0L, long0);
  }

  @Test
  public void test02()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      stopWatch0.start();
      stopWatch0.suspend();
      long long0 = stopWatch0.getTime();
      assertEquals(0L, long0);
  }

  @Test
  public void test03()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      stopWatch0.start();
      stopWatch0.stop();
      long long0 = stopWatch0.getTime();
      assertEquals(0L, long0);
  }

  @Test
  public void test04()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      // Undeclared exception!
      try {
        stopWatch0.resume();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch must be suspended to resume. 
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      stopWatch0.start();
      stopWatch0.suspend();
      stopWatch0.resume();
  }

  @Test
  public void test06()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      // Undeclared exception!
      try {
        stopWatch0.suspend();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch must be running to suspend. 
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      // Undeclared exception!
      try {
        stopWatch0.unsplit();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch has not been split. 
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      stopWatch0.start();
      stopWatch0.split();
      stopWatch0.unsplit();
  }

  @Test
  public void test09()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      // Undeclared exception!
      try {
        stopWatch0.split();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch is not running. 
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      // Undeclared exception!
      try {
        stopWatch0.stop();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch is not running. 
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      stopWatch0.start();
      stopWatch0.suspend();
      stopWatch0.stop();
  }

  @Test
  public void test12()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      stopWatch0.start();
      // Undeclared exception!
      try {
        stopWatch0.start();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch already started. 
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      stopWatch0.start();
      stopWatch0.stop();
      // Undeclared exception!
      try {
        stopWatch0.start();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch must be reset before being restarted. 
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      String string0 = stopWatch0.toString();
      assertNotNull(string0);
      assertEquals("0:00:00.000", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      stopWatch0.reset();
  }

  @Test
  public void test16()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      assertNotNull(stopWatch0);
      
      // Undeclared exception!
      try {
        String string0 = stopWatch0.toSplitString();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch must be split to get the split time. 
         //
      }
  }
}
