/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 06:30:37 GMT 2014
 */

package com.google.javascript.jscomp.deps;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.deps.DependencyInfo;
import com.google.javascript.jscomp.deps.DepsFileParser;
import com.google.javascript.jscomp.deps.JsFileLineParser;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DepsFileParserEvoSuite_branch_Test extends DepsFileParserEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      boolean boolean0 = true;
      PrintStream printStream0 = null;
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(printStream0);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertNotNull(printStreamErrorManager0);
      
      DepsFileParser depsFileParser0 = new DepsFileParser((ErrorManager) printStreamErrorManager0);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(false, depsFileParser0.didParseSucceed());
      assertNotNull(depsFileParser0);
      
      depsFileParser0.setShortcutMode(boolean0);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(false, depsFileParser0.didParseSucceed());
      
      String string0 = "";
      boolean boolean1 = depsFileParser0.parseLine(string0);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(false, depsFileParser0.didParseSucceed());
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test
  public void test1() {}
//   @Test
//   public void test1()  throws Throwable  {
//       String string0 = "Found dp: ";
//       boolean boolean0 = true;
//       JsFileLineParser.ParseException jsFileLineParser_ParseException0 = new JsFileLineParser.ParseException(string0, boolean0);
//       assertNotNull(jsFileLineParser_ParseException0);
//       
//       String string1 = jsFileLineParser_ParseException0.toString();
//       assertFalse(string0.equals((Object)string1));
//       assertFalse(string1.equals((Object)string0));
//       assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable: Found dp: ", string1);
//       assertNotNull(string1);
//       assertNotSame(string0, string1);
//       assertNotSame(string1, string0);
//       
//       Logger logger0 = Logger.getGlobal();
//       assertNull(logger0.getResourceBundleName());
//       assertEquals("global", logger0.getName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertNotNull(logger0);
//       
//       LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
//       assertNull(logger0.getResourceBundleName());
//       assertEquals("global", logger0.getName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertNotNull(loggerErrorManager0);
//       
//       DepsFileParser depsFileParser0 = new DepsFileParser((ErrorManager) loggerErrorManager0);
//       assertEquals(false, depsFileParser0.didParseSucceed());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals("global", logger0.getName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertNotNull(depsFileParser0);
//       
//       depsFileParser0.setShortcutMode(boolean0);
//       assertEquals(false, depsFileParser0.didParseSucceed());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals("global", logger0.getName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       
//       List<DependencyInfo> list0 = depsFileParser0.parseFile(string0, string1);
//       assertEquals(true, list0.isEmpty());
//       assertEquals(0, list0.size());
//       assertEquals(true, depsFileParser0.didParseSucceed());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals("global", logger0.getName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertFalse(string0.equals((Object)string1));
//       assertFalse(string1.equals((Object)string0));
//       assertNotNull(list0);
//       assertNotSame(string0, string1);
//       assertNotSame(string1, string0);
//   }

  @Test
  public void test2() {}
//   @Test
//   public void test2()  throws Throwable  {
//       String string0 = "\\s*goog.addDependency\\((.*)\\);?\\s*";
//       Logger logger0 = Logger.global;
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       assertNotNull(logger0);
//       
//       LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertNotNull(loggerErrorManager0);
//       
//       DepsFileParser depsFileParser0 = new DepsFileParser((ErrorManager) loggerErrorManager0);
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(false, depsFileParser0.didParseSucceed());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertNotNull(depsFileParser0);
//       
//       List<DependencyInfo> list0 = depsFileParser0.parseFile(string0, string0);
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(true, depsFileParser0.didParseSucceed());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertEquals(true, list0.isEmpty());
//       assertEquals(0, list0.size());
//       assertNotNull(list0);
//   }

  @Test
  public void test3()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      assertNull(logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertNotNull(logger0);
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      assertNull(logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertNotNull(loggerErrorManager0);
      
      DepsFileParser depsFileParser0 = new DepsFileParser((ErrorManager) loggerErrorManager0);
      assertNull(logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(false, depsFileParser0.didParseSucceed());
      assertNotNull(depsFileParser0);
      
      String string0 = "com.gogle.javascipt.jscomp.AliasStrngs";
      try {
        List<DependencyInfo> list0 = depsFileParser0.parseFile(string0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}