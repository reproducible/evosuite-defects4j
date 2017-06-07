/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:01:43 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FlowSensitiveInlineVariables;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PeepholeReplaceKnownMethods;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class PeepholeReplaceKnownMethodsEvoSuite_branch_Test extends PeepholeReplaceKnownMethodsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      peepholeReplaceKnownMethods0.beginTraversal(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      String string0 = "";
      int int0 = 37;
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isFromExterns());
      
      node0.addChildrenToBack(node0);
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(1, node0.getChildCount());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.hasChildren());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isFromExterns());
      assertEquals(true, node0.hasOneChild());
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertSame(node0, node1);
      assertSame(node1, node0);
      assertNotNull(node1);
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(1, node0.getChildCount());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.hasChildren());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isFromExterns());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node1.isFromExterns());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(1, node1.getChildCount());
      assertEquals(true, node1.hasOneChild());
      assertEquals(37, node1.getType());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isQuotedString());
      assertEquals(0, node1.getSideEffectFlags());
      assertNull(node1.getSourceFileName());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(-1, node1.getCharno());
  }

  @Test
  public void test1()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      int int0 = 37;
      int int1 = 35;
      Node node0 = new Node(int1, int0, int0);
      assertNotNull(node0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(151589, node0.getSourcePosition());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(35, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(37, node0.getCharno());
      assertEquals(37, node0.getLineno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getChildCount());
      
      Node node1 = new Node(int0, node0, node0, int0, int0);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertNotNull(node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertFalse(node0.equals((Object)node1));
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(37, node1.getLineno());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(37, node1.getCharno());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(151589, node1.getSourcePosition());
      assertEquals(true, node1.hasOneChild());
      assertEquals(true, node1.hasChildren());
      assertEquals(37, node1.getType());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isFromExterns());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isQuotedString());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isVarArgs());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(151589, node0.getSourcePosition());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(35, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(37, node0.getCharno());
      assertEquals(37, node0.getLineno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getChildCount());
      
      // Undeclared exception!
      try {
        Node node2 = peepholeReplaceKnownMethods0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      String string0 = "";
      int int0 = 37;
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(37, node0.getType());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertSame(node0, node1);
      assertSame(node1, node0);
      assertNotNull(node1);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(37, node0.getType());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node1.hasChildren());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.hasOneChild());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.isQuotedString());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(0, node1.getLength());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(37, node1.getType());
      assertEquals(false, node1.isFromExterns());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.hasMoreThanOneChild());
  }

  @Test
  public void test3()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      double double0 = 925.5429825569386;
      Node node0 = Node.newNumber(double0);
      assertNotNull(node0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getLength());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertSame(node1, node0);
      assertSame(node0, node1);
      assertNotNull(node1);
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.hasChildren());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(0, node1.getChildCount());
      assertEquals(-1, node1.getLineno());
      assertNull(node1.getSourceFileName());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(39, node1.getType());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isFromExterns());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getLength());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
  }
}