/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:25:35 GMT 2014
 */

package com.google.javascript.jscomp.type;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ClosureReverseAbstractInterpreterEvoSuite_branch_Test extends ClosureReverseAbstractInterpreterEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      assertNotNull(googleCodingConvention0);
      
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      assertNotNull(simpleErrorReporter0);
      
      boolean boolean0 = false;
      double double0 = 3804.523801891;
      Node node0 = Node.newNumber(double0);
      assertNotNull(node0);
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isBreak());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isScript());
      assertEquals(0, node0.getLength());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isIn());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.hasChildren());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isCase());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isFunction());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isIf());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isThrow());
      
      String string0 = "EOC";
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) simpleErrorReporter0);
      assertNotNull(jSTypeRegistry0);
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter((CodingConvention) googleCodingConvention0, jSTypeRegistry0);
      assertNotNull(closureReverseAbstractInterpreter0);
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      
      boolean boolean1 = googleCodingConvention0.isExported(string0, boolean0);
      assertFalse(boolean1);
      assertTrue(boolean0 == boolean1);
      assertTrue(boolean1 == boolean0);
      
      FlowScope flowScope0 = null;
      FlowScope flowScope1 = closureReverseAbstractInterpreter0.getPreciserScopeKnowingConditionOutcome(node0, flowScope0, boolean1);
      assertTrue(boolean0 == boolean1);
      assertTrue(boolean1 == boolean0);
      assertNull(flowScope1);
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isBreak());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isScript());
      assertEquals(0, node0.getLength());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isIn());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.hasChildren());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isCase());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isFunction());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isIf());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isThrow());
  }
}