/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:30:32 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.InlineObjectLiterals;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class InlineObjectLiteralsEvoSuite_branch_Test extends InlineObjectLiteralsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertNotNull(supplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      InlineObjectLiterals inlineObjectLiterals0 = new InlineObjectLiterals(compiler0, functionToBlockMutator_LabelNameSupplier0);
      assertNotNull(inlineObjectLiterals0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      double double0 = (-17.246104542471784);
      Node node0 = Node.newNumber(double0);
      assertNotNull(node0);
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isNE());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isIn());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isWhile());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.isNumber());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isInc());
      assertEquals(0, node0.getChildCount());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isInstanceOf());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isCall());
      
      // Undeclared exception!
      try {
        inlineObjectLiterals0.process(node0, node0);
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