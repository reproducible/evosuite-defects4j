/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:59:57 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.DefaultPassConfig;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SyntacticScopeCreatorEvoSuite_branch_Test extends SyntacticScopeCreatorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      assertNotNull(syntacticScopeCreator0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      
      int int0 = 104;
      Node node0 = new Node(int0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(104, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(104, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(104, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      
      Scope scope0 = null;
      Scope scope1 = syntacticScopeCreator0.createScope(node0, scope0);
      assertNotNull(scope1);
      assertEquals(0, scope1.getVarCount());
      assertEquals(false, scope1.isLocal());
      assertEquals(true, scope1.isGlobal());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(104, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(104, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(104, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      assertNotNull(syntacticScopeCreator0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      int int0 = 118;
      Node node0 = new Node(int0, int0, int0);
      assertNotNull(node0);
      assertEquals(118, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(118, node0.getCharno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(118, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      
      node0.addChildrenToFront(node0);
      assertEquals(118, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(118, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(118, node0.getType());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      
      CompilerOptions compilerOptions0 = null;
      DefaultPassConfig defaultPassConfig0 = new DefaultPassConfig(compilerOptions0);
      assertNotNull(defaultPassConfig0);
      
      Scope scope0 = defaultPassConfig0.getTopScope();
      assertNull(scope0);
      
      // Undeclared exception!
      try {
        Scope scope1 = syntacticScopeCreator0.createScope(node0, scope0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      assertNotNull(syntacticScopeCreator0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      
      int int0 = 120;
      Node node0 = new Node(int0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(120, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(120, node0.getType());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(120, node0.getCharno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      
      CompilerOptions compilerOptions0 = null;
      DefaultPassConfig defaultPassConfig0 = new DefaultPassConfig(compilerOptions0);
      assertNotNull(defaultPassConfig0);
      
      Scope scope0 = defaultPassConfig0.getTopScope();
      assertNull(scope0);
      
      // Undeclared exception!
      try {
        Scope scope1 = syntacticScopeCreator0.createScope(node0, scope0);
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
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      assertNotNull(syntacticScopeCreator0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      int int0 = 118;
      Node node0 = new Node(int0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasOneChild());
      assertEquals(118, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(118, node0.getCharno());
      assertEquals(118, node0.getType());
      assertEquals(false, node0.isQualifiedName());
      
      Scope scope0 = null;
      Scope scope1 = syntacticScopeCreator0.createScope(node0, scope0);
      assertNotNull(scope1);
      assertEquals(0, scope1.getVarCount());
      assertEquals(false, scope1.isLocal());
      assertEquals(true, scope1.isGlobal());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasOneChild());
      assertEquals(118, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(118, node0.getCharno());
      assertEquals(118, node0.getType());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      assertNotNull(syntacticScopeCreator0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      String string0 = "";
      SyntheticAst syntheticAst0 = new SyntheticAst(string0);
      assertNotNull(syntheticAst0);
      
      int int0 = 105;
      Node node0 = new Node(int0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(105, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(105, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(105, node0.getLineno());
      
      Node node1 = syntheticAst0.getAstRoot((AbstractCompiler) compiler0);
      assertNotNull(node1);
      assertNotSame(node1, node0);
      assertFalse(node1.equals((Object)node0));
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, node1.isVarArgs());
      assertEquals(132, node1.getType());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.hasChildren());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getLineno());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.isQualifiedName());
      
      node1.addChildrenToFront(node0);
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(105, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(105, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(105, node0.getLineno());
      assertEquals(false, node1.isVarArgs());
      assertEquals(132, node1.getType());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(1, node1.getChildCount());
      assertEquals(-1, node1.getLineno());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isQualifiedName());
      
      Scope scope0 = null;
      // Undeclared exception!
      try {
        Scope scope1 = syntacticScopeCreator0.createScope(node1, scope0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      assertNotNull(syntacticScopeCreator0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      String string0 = "p";
      SyntheticAst syntheticAst0 = new SyntheticAst(string0);
      assertNotNull(syntheticAst0);
      
      int int0 = 115;
      Node node0 = new Node(int0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(115, node0.getCharno());
      assertEquals(115, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(115, node0.getLineno());
      
      CompilerOptions compilerOptions0 = null;
      DefaultPassConfig defaultPassConfig0 = new DefaultPassConfig(compilerOptions0);
      assertNotNull(defaultPassConfig0);
      
      Scope scope0 = defaultPassConfig0.getTopScope();
      assertNull(scope0);
      
      Scope scope1 = syntacticScopeCreator0.createScope(node0, scope0);
      assertNotNull(scope1);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(115, node0.getCharno());
      assertEquals(115, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(115, node0.getLineno());
      assertEquals(false, scope1.isLocal());
      assertEquals(0, scope1.getVarCount());
      assertEquals(true, scope1.isGlobal());
      
      Node node1 = syntheticAst0.getAstRoot((AbstractCompiler) compiler0);
      assertNotNull(node1);
      assertNotSame(node1, node0);
      assertFalse(node1.equals((Object)node0));
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(132, node1.getType());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.hasChildren());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isVarArgs());
      
      // Undeclared exception!
      try {
        Scope scope2 = syntacticScopeCreator0.createScope(node1, scope1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      assertNotNull(syntacticScopeCreator0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      
      int int0 = 105;
      Node node0 = new Node(int0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(105, node0.getLineno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(105, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(105, node0.getType());
      assertEquals(false, node0.hasOneChild());
      
      CompilerOptions compilerOptions0 = null;
      DefaultPassConfig defaultPassConfig0 = new DefaultPassConfig(compilerOptions0);
      assertNotNull(defaultPassConfig0);
      
      Scope scope0 = defaultPassConfig0.getTopScope();
      assertNull(scope0);
      
      // Undeclared exception!
      try {
        Scope scope1 = syntacticScopeCreator0.createScope(node0, scope0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}