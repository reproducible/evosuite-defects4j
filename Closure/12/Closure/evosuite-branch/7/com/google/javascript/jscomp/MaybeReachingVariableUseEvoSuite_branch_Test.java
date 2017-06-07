/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:37:08 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.MaybeReachingVariableUse;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class MaybeReachingVariableUseEvoSuite_branch_Test extends MaybeReachingVariableUseEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      assertNotNull(maybeReachingVariableUse_ReachingUses0);
      
      boolean boolean0 = maybeReachingVariableUse_ReachingUses0.equals((Object) maybeReachingVariableUse_ReachingUses0);
      assertTrue(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      assertNotNull(maybeReachingVariableUse_ReachingUses0);
      
      String string0 = "s4%D'2Us@AMid2&t{6";
      boolean boolean0 = maybeReachingVariableUse_ReachingUses0.equals((Object) string0);
      assertFalse(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      ControlFlowGraph<Node> controlFlowGraph0 = null;
      Scope scope0 = null;
      MaybeReachingVariableUse maybeReachingVariableUse0 = null;
      try {
        maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      assertNotNull(maybeReachingVariableUse_ReachingUses0);
      
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = new MaybeReachingVariableUse.ReachingUses(maybeReachingVariableUse_ReachingUses0);
      assertNotNull(maybeReachingVariableUse_ReachingUses1);
      assertNotSame(maybeReachingVariableUse_ReachingUses1, maybeReachingVariableUse_ReachingUses0);
      assertNotSame(maybeReachingVariableUse_ReachingUses0, maybeReachingVariableUse_ReachingUses1);
      assertTrue(maybeReachingVariableUse_ReachingUses1.equals((Object)maybeReachingVariableUse_ReachingUses0));
      assertTrue(maybeReachingVariableUse_ReachingUses0.equals((Object)maybeReachingVariableUse_ReachingUses1));
  }
}