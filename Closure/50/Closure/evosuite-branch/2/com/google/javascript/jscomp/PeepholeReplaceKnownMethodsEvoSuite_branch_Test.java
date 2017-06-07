/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:22:57 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DefaultPassConfig;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PassConfig;
import com.google.javascript.jscomp.PeepholeOptimizationsPass;
import com.google.javascript.jscomp.PeepholeReplaceKnownMethods;
import com.google.javascript.jscomp.ScopeCreator;
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
      
      int int0 = 37;
      String string0 = "J<K5h";
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getCharno());
      assertNull(node0.getSourceFileName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[1];
      PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
      assertNotNull(peepholeOptimizationsPass0);
      
      DefaultPassConfig defaultPassConfig0 = compiler0.ensureDefaultPassConfig();
      assertNotNull(defaultPassConfig0);
      
      PassConfig.PassConfigDelegate passConfig_PassConfigDelegate0 = new PassConfig.PassConfigDelegate(defaultPassConfig0);
      assertNotNull(passConfig_PassConfigDelegate0);
      
      MemoizedScopeCreator memoizedScopeCreator0 = passConfig_PassConfigDelegate0.getTypedScopeCreator();
      assertNull(memoizedScopeCreator0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) peepholeOptimizationsPass0, (ScopeCreator) memoizedScopeCreator0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      peepholeReplaceKnownMethods0.beginTraversal(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      node0.addChildToFront(node0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getCharno());
      assertNull(node0.getSourceFileName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getChildCount());
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertNotNull(node1);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getCharno());
      assertNull(node0.getSourceFileName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isFromExterns());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(true, node1.hasChildren());
      assertEquals(-1, node1.getCharno());
      assertEquals(37, node1.getType());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isVarArgs());
      assertNull(node1.getSourceFileName());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(true, node1.hasOneChild());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(-1, node1.getLineno());
      assertSame(node0, node1);
      assertSame(node1, node0);
  }

  @Test
  public void test1()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      int int0 = 37;
      String string0 = "J<K5h";
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(37, node0.getType());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertNotNull(node1);
      assertEquals(false, node1.hasChildren());
      assertEquals(-1, node1.getCharno());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isQuotedString());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(0, node1.getChildCount());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isFromExterns());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(37, node1.getType());
      assertEquals(-1, node1.getSourcePosition());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(37, node0.getType());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertSame(node1, node0);
      assertSame(node0, node1);
  }

  @Test
  public void test2()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      int int0 = (-1);
      String string0 = "! ZC':*+x-A?s]2P/%";
      Node node0 = Node.newString(int0, string0, int0, int0);
      assertNotNull(node0);
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isFromExterns());
      assertEquals(0, node0.getLength());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getType());
      assertEquals(false, node0.hasChildren());
      assertNull(node0.getSourceFileName());
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertNotNull(node1);
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isQuotedString());
      assertEquals(-1, node1.getType());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isFromExterns());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.hasChildren());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.wasEmptyNode());
      assertNull(node1.getSourceFileName());
      assertEquals(0, node1.getLength());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isFromExterns());
      assertEquals(0, node0.getLength());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getType());
      assertEquals(false, node0.hasChildren());
      assertNull(node0.getSourceFileName());
      assertSame(node1, node0);
      assertSame(node0, node1);
  }
}