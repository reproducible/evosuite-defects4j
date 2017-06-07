/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:47:40 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.InlineObjectLiterals;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.rhino.Node;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class InlineObjectLiteralsEvoSuite_branch_Test extends InlineObjectLiteralsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0() {}
//   @Test
//   public void test0()  throws Throwable  {
//       Logger logger0 = Logger.global;
//       assertNotNull(logger0);
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       
//       LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
//       assertNotNull(loggerErrorManager0);
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       
//       Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
//       assertNotNull(compiler0);
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(0, compiler0.getErrorCount());
//       assertEquals(0, compiler0.getWarningCount());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       
//       Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
//       assertNotNull(supplier0);
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(0, compiler0.getErrorCount());
//       assertEquals(0, compiler0.getWarningCount());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       
//       FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
//       assertNotNull(functionToBlockMutator_LabelNameSupplier0);
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(0, compiler0.getErrorCount());
//       assertEquals(0, compiler0.getWarningCount());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       
//       InlineObjectLiterals inlineObjectLiterals0 = new InlineObjectLiterals(compiler0, functionToBlockMutator_LabelNameSupplier0);
//       assertNotNull(inlineObjectLiterals0);
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(0, compiler0.getErrorCount());
//       assertEquals(0, compiler0.getWarningCount());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       
//       int int0 = 9;
//       Node node0 = new Node(int0, int0, int0);
//       assertNotNull(node0);
//       assertEquals(false, node0.wasEmptyNode());
//       assertEquals(false, node0.isSyntheticBlock());
//       assertEquals(9, node0.getCharno());
//       assertEquals(false, node0.hasChildren());
//       assertNull(node0.getSourceFileName());
//       assertEquals(0, node0.getChildCount());
//       assertEquals(false, node0.isFromExterns());
//       assertEquals(9, node0.getType());
//       assertEquals(false, node0.isLocalResultCall());
//       assertEquals(0, node0.getLength());
//       assertEquals(false, node0.isOnlyModifiesThisCall());
//       assertEquals(false, node0.isNoSideEffectsCall());
//       assertEquals(0, node0.getSideEffectFlags());
//       assertEquals(9, node0.getLineno());
//       assertEquals(false, node0.isUnscopedQualifiedName());
//       assertEquals(false, node0.isOptionalArg());
//       assertEquals(false, node0.isQualifiedName());
//       assertEquals(36873, node0.getSourcePosition());
//       assertEquals(false, node0.isQuotedString());
//       assertEquals(false, node0.hasOneChild());
//       assertEquals(false, node0.hasMoreThanOneChild());
//       assertEquals(false, node0.isVarArgs());
//       
//       // Undeclared exception!
//       try {
//         inlineObjectLiterals0.process(node0, node0);
//         fail("Expecting exception: RuntimeException");
//       
//       } catch(RuntimeException e) {
//          //
//          // INTERNAL COMPILER ERROR.
//          // Please report this problem.
//          // null
//          //
//       }
//   }
}