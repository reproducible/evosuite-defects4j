/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:20:30 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.VarCheck;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class VarCheckEvoSuite_branch_Test extends VarCheckEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertNotNull(loggerErrorManager0);
      
      boolean boolean0 = false;
      VarCheck varCheck0 = new VarCheck(compiler0, boolean0);
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertNotNull(varCheck0);
      
      String string0 = "lea=vewith";
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, string0, string0);
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(1, node0.getLineno());
      assertEquals(true, node0.hasChildren());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(1, node0.getChildCount());
      assertNotNull(node0);
      
      // Undeclared exception!
      try {
        varCheck0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(loggerErrorManager0);
      
      boolean boolean0 = true;
      int int0 = 38;
      VarCheck varCheck0 = new VarCheck(compiler0, boolean0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(varCheck0);
      
      String string0 = "0W`yFyf/37WDmmRv7;MO";
      Node node0 = Node.newString(int0, string0);
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasChildren());
      assertEquals(true, node0.isUnscopedQualifiedName());
      assertEquals(38, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertNotNull(node0);
      
      Node node1 = new Node(int0, node0, node0, int0, int0);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(true, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isQuotedString());
      assertEquals(38, node1.getType());
      assertEquals(true, node1.isQualifiedName());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(38, node1.getCharno());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(38, node1.getLineno());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasChildren());
      assertEquals(true, node0.isUnscopedQualifiedName());
      assertEquals(38, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertNotNull(node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      
      // Undeclared exception!
      try {
        varCheck0.process(node0, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Unexpected variable 0W`yFyf/37WDmmRv7;MO
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertNotNull(loggerErrorManager0);
      
      boolean boolean0 = true;
      int int0 = 38;
      VarCheck varCheck0 = new VarCheck(compiler0, boolean0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertNotNull(varCheck0);
      
      String string0 = "";
      Node node0 = Node.newString(int0, string0);
      assertEquals(true, node0.isQualifiedName());
      assertEquals(38, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(true, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertNotNull(node0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) varCheck0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertNotNull(nodeTraversal0);
      
      // Undeclared exception!
      try {
        varCheck0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertNotNull(loggerErrorManager0);
      
      boolean boolean0 = true;
      int int0 = 8;
      VarCheck varCheck0 = new VarCheck(compiler0, boolean0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertNotNull(varCheck0);
      
      String string0 = "-wY`-7<7R(:j*bo!Q";
      Node node0 = Node.newString(int0, string0);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(8, node0.getType());
      assertNotNull(node0);
      
      Node node1 = new Node(int0, node0);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(true, node1.hasOneChild());
      assertEquals(-1, node1.getCharno());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isVarArgs());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getLineno());
      assertEquals(8, node1.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(8, node0.getType());
      assertNotNull(node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      
      varCheck0.process(node0, node0);
      assertNotSame(node0, node1);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(8, node0.getType());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertFalse(node0.equals((Object)node1));
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertNotNull(loggerErrorManager0);
      
      boolean boolean0 = false;
      VarCheck varCheck0 = new VarCheck(compiler0, boolean0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertNotNull(varCheck0);
      
      String string0 = "javaElMng.String";
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, string0, string0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(1, node0.getLineno());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getChildCount());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQualifiedName());
      assertNotNull(node0);
      
      // Undeclared exception!
      try {
        varCheck0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }
}