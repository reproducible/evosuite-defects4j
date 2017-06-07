/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:48:58 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class TypedScopeCreatorEvoSuite_branch_Test extends TypedScopeCreatorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      String string0 = "$3{";
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Charset charset0 = null;
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile(string0, charset0);
      assertNotNull(sourceFile_OnDisk0);
      assertEquals("$3{", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("$3{", sourceFile_OnDisk0.getName());
      assertEquals("$3{", sourceFile_OnDisk0.toString());
      
      Node node0 = compiler0.parse((SourceFile) sourceFile_OnDisk0);
      assertNotNull(node0);
      assertEquals("$3{", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("$3{", sourceFile_OnDisk0.getName());
      assertEquals("$3{", sourceFile_OnDisk0.toString());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isExprResult());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isBreak());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isReturn());
      assertEquals("$3{", node0.getSourceFileName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isDec());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isOr());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isAnd());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isLabel());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isNE());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      assertNotNull(typedScopeCreator0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      
      Scope scope0 = typedScopeCreator0.createInitialScope(node0);
      assertNotNull(scope0);
      assertEquals(true, scope0.isGlobal());
      assertEquals(32, scope0.getVarCount());
      assertEquals(false, scope0.isLocal());
      assertEquals("$3{", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("$3{", sourceFile_OnDisk0.getName());
      assertEquals("$3{", sourceFile_OnDisk0.toString());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isExprResult());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isBreak());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isReturn());
      assertEquals("$3{", node0.getSourceFileName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isDec());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isOr());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isAnd());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isLabel());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isNE());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
  }
}