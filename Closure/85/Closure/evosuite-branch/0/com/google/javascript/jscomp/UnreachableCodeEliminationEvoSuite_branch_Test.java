/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:28:53 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.UnreachableCodeElimination;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class UnreachableCodeEliminationEvoSuite_branch_Test extends UnreachableCodeEliminationEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = true;
      UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(compiler0, boolean0);
      assertNotNull(unreachableCodeElimination0);
      
      String string0 = "asign_bitr";
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptEcmaScript5());
      
      unreachableCodeElimination0.process(node0, node0);
      assertEquals(false, node0.hasChildren());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptEcmaScript5());
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = true;
      UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(compiler0, boolean0);
      assertNotNull(unreachableCodeElimination0);
      
      String string0 = ";s%=nb_bitor";
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(2, node0.getChildCount());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      
      unreachableCodeElimination0.process(node0, node0);
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(2, node0.getChildCount());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = true;
      UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(compiler0, boolean0);
      assertNotNull(unreachableCodeElimination0);
      
      String string0 = "unreachabe fcode";
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, string0, string0);
      assertNotNull(node0);
      assertEquals(true, compiler0.hasErrors());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(125, node0.getType());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      
      int int0 = (-1733);
      Node node1 = new Node(int0, node0, node0, node0, node0, int0, int0);
      assertNotNull(node1);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertEquals(true, compiler0.hasErrors());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(125, node0.getType());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1733, node1.getType());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(-1, node1.getCharno());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isVarArgs());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(-1, node1.getLineno());
      
      unreachableCodeElimination0.process(node0, node1);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertEquals(true, compiler0.hasErrors());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(125, node0.getType());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1733, node1.getType());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(-1, node1.getCharno());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isVarArgs());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(-1, node1.getLineno());
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = true;
      UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(compiler0, boolean0);
      assertNotNull(unreachableCodeElimination0);
      
      String string0 = ";s%=nb_bitor";
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(2, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) unreachableCodeElimination0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      
      unreachableCodeElimination0.visit(nodeTraversal0, node0, node0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(2, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = false;
      UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(compiler0, boolean0);
      assertNotNull(unreachableCodeElimination0);
      
      String string0 = ";ss=nb_bitor";
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(132, node0.getType());
      assertEquals(2, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptEcmaScript5());
      
      unreachableCodeElimination0.process(node0, node0);
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(132, node0.getType());
      assertEquals(2, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptEcmaScript5());
  }
}