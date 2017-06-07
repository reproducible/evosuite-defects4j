/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:46:45 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.InlineVariables;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class InlineVariablesEvoSuite_branch_Test extends InlineVariablesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.LOCALS_ONLY;
      boolean boolean0 = true;
      InlineVariables inlineVariables0 = new InlineVariables(abstractCompiler0, inlineVariables_Mode0, boolean0);
      assertNotNull(inlineVariables0);
      
      Node node0 = null;
      // Undeclared exception!
      try {
        inlineVariables0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.CONSTANTS_ONLY;
      boolean boolean0 = false;
      InlineVariables inlineVariables0 = new InlineVariables(abstractCompiler0, inlineVariables_Mode0, boolean0);
      assertNotNull(inlineVariables0);
      
      Node node0 = null;
      // Undeclared exception!
      try {
        inlineVariables0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.ALL;
      boolean boolean0 = false;
      Node node0 = null;
      InlineVariables inlineVariables0 = new InlineVariables(abstractCompiler0, inlineVariables_Mode0, boolean0);
      assertNotNull(inlineVariables0);
      
      // Undeclared exception!
      try {
        inlineVariables0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}