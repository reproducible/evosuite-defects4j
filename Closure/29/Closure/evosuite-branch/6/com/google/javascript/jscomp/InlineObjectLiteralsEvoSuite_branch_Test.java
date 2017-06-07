/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:19:48 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.InlineObjectLiterals;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.RenameLabels;
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
  public void test0()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      assertNotNull(logger0);
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertNull(logger0.getName());
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      assertNotNull(loggerErrorManager0);
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertNull(logger0.getName());
      
      Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
      assertNotNull(compiler0);
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertNull(logger0.getName());
      
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      InlineObjectLiterals inlineObjectLiterals0 = new InlineObjectLiterals(compiler0, renameLabels_DefaultNameSupplier0);
      assertNotNull(inlineObjectLiterals0);
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertNull(logger0.getName());
      
      Node node0 = null;
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