/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:12:21 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PeepholeReplaceKnownMethods;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
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
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isLocalResultCall());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isSyntheticBlock());
      
      PrintStream printStream0 = null;
      Compiler compiler0 = new Compiler(printStream0);
      assertNotNull(compiler0);
      
      NodeTraversal.Callback nodeTraversal_Callback0 = null;
      MemoizedScopeCreator memoizedScopeCreator0 = compiler0.getTypedScopeCreator();
      assertNull(memoizedScopeCreator0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, nodeTraversal_Callback0, (ScopeCreator) memoizedScopeCreator0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      peepholeReplaceKnownMethods0.beginTraversal(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      Node node1 = new Node(int0, node0, node0, node0);
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      assertNotNull(node1);
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isLocalResultCall());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node1.isFromExterns());
      assertEquals(-1, node1.getCharno());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(1, node1.getChildCount());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(37, node1.getType());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isQuotedString());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isVarArgs());
      assertEquals(true, node1.hasOneChild());
      assertEquals(true, node1.hasChildren());
      
      Node node2 = peepholeReplaceKnownMethods0.optimizeSubtree(node1);
      assertNotSame(node0, node1);
      assertNotSame(node0, node2);
      assertSame(node1, node2);
      assertNotSame(node1, node0);
      assertSame(node2, node1);
      assertNotSame(node2, node0);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node0.equals((Object)node2));
      assertFalse(node1.equals((Object)node0));
      assertFalse(node2.equals((Object)node0));
      assertNotNull(node2);
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isLocalResultCall());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node1.isFromExterns());
      assertEquals(-1, node1.getCharno());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(1, node1.getChildCount());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(37, node1.getType());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isQuotedString());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isVarArgs());
      assertEquals(true, node1.hasOneChild());
      assertEquals(true, node1.hasChildren());
      assertNull(node2.getSourceFileName());
      assertEquals(false, node2.isOptionalArg());
      assertEquals(false, node2.wasEmptyNode());
      assertEquals(false, node2.isOnlyModifiesThisCall());
      assertEquals(false, node2.isUnscopedQualifiedName());
      assertEquals(-1, node2.getLineno());
      assertEquals(-1, node2.getCharno());
      assertEquals(0, node2.getSideEffectFlags());
      assertEquals(1, node2.getChildCount());
      assertEquals(false, node2.isQualifiedName());
      assertEquals(false, node2.isVarArgs());
      assertEquals(0, node2.getLength());
      assertEquals(false, node2.isFromExterns());
      assertEquals(false, node2.isSyntheticBlock());
      assertEquals(true, node2.hasOneChild());
      assertEquals(true, node2.hasChildren());
      assertEquals(false, node2.isLocalResultCall());
      assertEquals(false, node2.isQuotedString());
      assertEquals(false, node2.hasMoreThanOneChild());
      assertEquals(-1, node2.getSourcePosition());
      assertEquals(37, node2.getType());
      assertEquals(false, node2.isNoSideEffectsCall());
  }

  @Test
  public void test1()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      int int0 = 37;
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(37, node0.getType());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.wasEmptyNode());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getLength());
      assertEquals(-1, node0.getCharno());
      
      PrintStream printStream0 = null;
      Compiler compiler0 = new Compiler(printStream0);
      assertNotNull(compiler0);
      
      NodeTraversal.Callback nodeTraversal_Callback0 = null;
      MemoizedScopeCreator memoizedScopeCreator0 = compiler0.getTypedScopeCreator();
      assertNull(memoizedScopeCreator0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, nodeTraversal_Callback0, (ScopeCreator) memoizedScopeCreator0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      peepholeReplaceKnownMethods0.beginTraversal(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      Node node1 = new Node(int0, node0, node0, node0);
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      assertNotNull(node1);
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(37, node0.getType());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.wasEmptyNode());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getLength());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(37, node1.getType());
      assertEquals(false, node1.isQuotedString());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(-1, node1.getSourcePosition());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isFromExterns());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isVarArgs());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(-1, node1.getLineno());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isOptionalArg());
      
      Node node2 = peepholeReplaceKnownMethods0.optimizeSubtree(node1);
      assertNotSame(node0, node2);
      assertNotSame(node0, node1);
      assertSame(node1, node2);
      assertNotSame(node1, node0);
      assertNotSame(node2, node0);
      assertSame(node2, node1);
      assertFalse(node0.equals((Object)node2));
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      assertFalse(node2.equals((Object)node0));
      assertNotNull(node2);
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(37, node0.getType());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.wasEmptyNode());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getLength());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(37, node1.getType());
      assertEquals(false, node1.isQuotedString());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(-1, node1.getSourcePosition());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isFromExterns());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isVarArgs());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(-1, node1.getLineno());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(true, node2.hasChildren());
      assertEquals(false, node2.isUnscopedQualifiedName());
      assertEquals(0, node2.getLength());
      assertEquals(false, node2.isNoSideEffectsCall());
      assertEquals(false, node2.isQualifiedName());
      assertEquals(-1, node2.getLineno());
      assertEquals(false, node2.wasEmptyNode());
      assertEquals(false, node2.isOnlyModifiesThisCall());
      assertEquals(true, node2.hasOneChild());
      assertEquals(false, node2.isFromExterns());
      assertNull(node2.getSourceFileName());
      assertEquals(0, node2.getSideEffectFlags());
      assertEquals(-1, node2.getCharno());
      assertEquals(false, node2.isSyntheticBlock());
      assertEquals(false, node2.isOptionalArg());
      assertEquals(false, node2.isLocalResultCall());
      assertEquals(1, node2.getChildCount());
      assertEquals(false, node2.isVarArgs());
      assertEquals(-1, node2.getSourcePosition());
      assertEquals(false, node2.isQuotedString());
      assertEquals(37, node2.getType());
      assertEquals(false, node2.hasMoreThanOneChild());
  }

  @Test
  public void test2()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      int int0 = 37;
      int int1 = 33;
      Node node0 = new Node(int1);
      assertFalse(int1 == int0);
      assertNotNull(node0);
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(33, node0.getType());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getLength());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      
      String string0 = "";
      Node node1 = Node.newString(int0, string0, int1, int1);
      assertNotSame(node1, node0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertFalse(node1.equals((Object)node0));
      assertNotNull(node1);
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isFromExterns());
      assertEquals(33, node1.getLineno());
      assertEquals(0, node1.getChildCount());
      assertEquals(33, node1.getCharno());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.hasChildren());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(37, node1.getType());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.hasOneChild());
      assertEquals(0, node1.getLength());
      assertEquals(135201, node1.getSourcePosition());
      assertEquals(false, node1.hasMoreThanOneChild());
      
      node0.addChildToFront(node1);
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(33, node0.getType());
      assertEquals(false, node0.isFromExterns());
      assertEquals(1, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isFromExterns());
      assertEquals(33, node1.getLineno());
      assertEquals(0, node1.getChildCount());
      assertEquals(33, node1.getCharno());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.hasChildren());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(37, node1.getType());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.hasOneChild());
      assertEquals(0, node1.getLength());
      assertEquals(135201, node1.getSourcePosition());
      assertEquals(false, node1.hasMoreThanOneChild());
      
      Node node2 = new Node(int0, node0, node0, node0);
      assertNotSame(node2, node0);
      assertNotSame(node2, node1);
      assertNotSame(node0, node1);
      assertNotSame(node0, node2);
      assertFalse(int1 == int0);
      assertFalse(node2.equals((Object)node0));
      assertFalse(node2.equals((Object)node1));
      assertFalse(int0 == int1);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node0.equals((Object)node2));
      assertNotNull(node2);
      assertEquals(true, node2.hasOneChild());
      assertEquals(false, node2.isLocalResultCall());
      assertEquals(false, node2.isOptionalArg());
      assertNull(node2.getSourceFileName());
      assertEquals(-1, node2.getSourcePosition());
      assertEquals(0, node2.getSideEffectFlags());
      assertEquals(false, node2.isUnscopedQualifiedName());
      assertEquals(0, node2.getLength());
      assertEquals(false, node2.isOnlyModifiesThisCall());
      assertEquals(1, node2.getChildCount());
      assertEquals(false, node2.isNoSideEffectsCall());
      assertEquals(false, node2.wasEmptyNode());
      assertEquals(-1, node2.getLineno());
      assertEquals(false, node2.isSyntheticBlock());
      assertEquals(false, node2.isQualifiedName());
      assertEquals(false, node2.isQuotedString());
      assertEquals(false, node2.hasMoreThanOneChild());
      assertEquals(37, node2.getType());
      assertEquals(false, node2.isFromExterns());
      assertEquals(-1, node2.getCharno());
      assertEquals(false, node2.isVarArgs());
      assertEquals(true, node2.hasChildren());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(33, node0.getType());
      assertEquals(false, node0.isFromExterns());
      assertEquals(1, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      
      Node node3 = peepholeReplaceKnownMethods0.optimizeSubtree(node2);
      assertNotSame(node3, node0);
      assertSame(node3, node2);
      assertNotSame(node3, node1);
      assertNotSame(node2, node0);
      assertSame(node2, node3);
      assertNotSame(node2, node1);
      assertNotSame(node0, node1);
      assertNotSame(node0, node3);
      assertNotSame(node0, node2);
      assertFalse(node3.equals((Object)node0));
      assertFalse(node3.equals((Object)node1));
      assertFalse(int1 == int0);
      assertFalse(node2.equals((Object)node0));
      assertFalse(node2.equals((Object)node1));
      assertFalse(int0 == int1);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node0.equals((Object)node3));
      assertFalse(node0.equals((Object)node2));
      assertNotNull(node3);
      assertEquals(false, node3.hasMoreThanOneChild());
      assertEquals(false, node3.isUnscopedQualifiedName());
      assertEquals(-1, node3.getCharno());
      assertNull(node3.getSourceFileName());
      assertEquals(1, node3.getChildCount());
      assertEquals(true, node3.hasChildren());
      assertEquals(false, node3.isOptionalArg());
      assertEquals(false, node3.wasEmptyNode());
      assertEquals(false, node3.isFromExterns());
      assertEquals(false, node3.isLocalResultCall());
      assertEquals(true, node3.hasOneChild());
      assertEquals(-1, node3.getLineno());
      assertEquals(37, node3.getType());
      assertEquals(false, node3.isNoSideEffectsCall());
      assertEquals(false, node3.isQuotedString());
      assertEquals(false, node3.isOnlyModifiesThisCall());
      assertEquals(false, node3.isVarArgs());
      assertEquals(0, node3.getSideEffectFlags());
      assertEquals(false, node3.isQualifiedName());
      assertEquals(0, node3.getLength());
      assertEquals(false, node3.isSyntheticBlock());
      assertEquals(-1, node3.getSourcePosition());
      assertEquals(true, node2.hasOneChild());
      assertEquals(false, node2.isLocalResultCall());
      assertEquals(false, node2.isOptionalArg());
      assertNull(node2.getSourceFileName());
      assertEquals(-1, node2.getSourcePosition());
      assertEquals(0, node2.getSideEffectFlags());
      assertEquals(false, node2.isUnscopedQualifiedName());
      assertEquals(0, node2.getLength());
      assertEquals(false, node2.isOnlyModifiesThisCall());
      assertEquals(1, node2.getChildCount());
      assertEquals(false, node2.isNoSideEffectsCall());
      assertEquals(false, node2.wasEmptyNode());
      assertEquals(-1, node2.getLineno());
      assertEquals(false, node2.isSyntheticBlock());
      assertEquals(false, node2.isQualifiedName());
      assertEquals(false, node2.isQuotedString());
      assertEquals(false, node2.hasMoreThanOneChild());
      assertEquals(37, node2.getType());
      assertEquals(false, node2.isFromExterns());
      assertEquals(-1, node2.getCharno());
      assertEquals(false, node2.isVarArgs());
      assertEquals(true, node2.hasChildren());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(33, node0.getType());
      assertEquals(false, node0.isFromExterns());
      assertEquals(1, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
  }

  @Test
  public void test3()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      int int0 = 37;
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(false, node0.hasOneChild());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(37, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertSame(node0, node1);
      assertSame(node1, node0);
      assertNotNull(node1);
      assertEquals(false, node0.hasOneChild());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(37, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.hasChildren());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isFromExterns());
      assertEquals(37, node1.getType());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(-1, node1.getLineno());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.hasOneChild());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.isVarArgs());
      assertEquals(0, node1.getSideEffectFlags());
  }

  @Test
  public void test4()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      int int0 = 1663;
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(false, node0.isFromExterns());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1663, node0.getType());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getSideEffectFlags());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertSame(node1, node0);
      assertSame(node0, node1);
      assertNotNull(node1);
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isQuotedString());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isVarArgs());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.hasChildren());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isFromExterns());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(1663, node1.getType());
      assertNull(node1.getSourceFileName());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node0.isFromExterns());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1663, node0.getType());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getSideEffectFlags());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
  }
}