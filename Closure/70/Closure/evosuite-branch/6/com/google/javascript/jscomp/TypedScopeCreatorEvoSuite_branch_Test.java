/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:23:53 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class TypedScopeCreatorEvoSuite_branch_Test extends TypedScopeCreatorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 38;
      Node node0 = Node.newNumber((double) int0);
      assertNotNull(node0);
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSyntheticBlock());
      
      Node node1 = new Node(int0, node0);
      assertNotNull(node1);
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node1.getLineno());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(true, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isVarArgs());
      assertEquals(38, node1.getType());
      assertEquals(true, node1.hasOneChild());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(true, node1.isQualifiedName());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      
      // Undeclared exception!
      try {
        JSDocInfo jSDocInfo0 = TypedScopeCreator.getBestJSDocInfo(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 84;
      Node node0 = Node.newNumber((double) int0);
      assertNotNull(node0);
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasChildren());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      
      Node node1 = new Node(int0, node0);
      assertNotNull(node1);
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasChildren());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(1, node1.getChildCount());
      assertEquals(true, node1.hasOneChild());
      assertEquals(84, node1.getType());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(-1, node1.getLineno());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      
      JSDocInfo jSDocInfo0 = TypedScopeCreator.getBestJSDocInfo(node0);
      assertNull(jSDocInfo0);
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasChildren());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertNotSame(node0, node1);
      assertFalse(node0.equals((Object)node1));
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertNotNull(loggerErrorManager0);
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      
      ClosureCodingConvention closureCodingConvention0 = (ClosureCodingConvention)compiler0.defaultCodingConvention;
      assertNotNull(closureCodingConvention0);
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertNull(closureCodingConvention0.getDelegateSuperclassName());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, closureCodingConvention0);
      assertNotNull(typedScopeCreator0);
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertNull(closureCodingConvention0.getDelegateSuperclassName());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      
      String string0 = "Vy>1s.}_ddsx}^%1";
      SyntheticAst syntheticAst0 = new SyntheticAst(string0);
      assertNotNull(syntheticAst0);
      
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) compiler0);
      assertNotNull(node0);
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      
      Scope scope0 = compiler0.getTopScope();
      assertNull(scope0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      
      Scope scope1 = typedScopeCreator0.createScope(node0, scope0);
      assertNotNull(scope1);
      assertEquals(33, scope1.getVarCount());
      assertEquals(false, scope1.isLocal());
      assertEquals(true, scope1.isGlobal());
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertNull(closureCodingConvention0.getDelegateSuperclassName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertNotNull(loggerErrorManager0);
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      
      ClosureCodingConvention closureCodingConvention0 = (ClosureCodingConvention)compiler0.defaultCodingConvention;
      assertNotNull(closureCodingConvention0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertNull(closureCodingConvention0.getDelegateSuperclassName());
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, closureCodingConvention0);
      assertNotNull(typedScopeCreator0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertNull(closureCodingConvention0.getDelegateSuperclassName());
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      
      String string0 = "Vy>1s.}_ddsx}^%1";
      SyntheticAst syntheticAst0 = new SyntheticAst(string0);
      assertNotNull(syntheticAst0);
      
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) compiler0);
      assertNotNull(node0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      
      Scope scope0 = typedScopeCreator0.createInitialScope(node0);
      assertNotNull(scope0);
      assertEquals(true, scope0.isGlobal());
      assertEquals(false, scope0.isLocal());
      assertEquals(33, scope0.getVarCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertNull(closureCodingConvention0.getDelegateSuperclassName());
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      
      // Undeclared exception!
      try {
        Scope scope1 = typedScopeCreator0.createScope(node0, scope0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}