/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:49:36 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodeGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CodeGeneratorEvoSuite_branch_Test extends CodeGeneratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      String string0 = "7";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("7", string1);
      assertNotNull(string1);
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "7";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(7.0, double0, 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "?ePXw";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = " ";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = "137";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = "\u00004JU\u05F3TQQ\u0E00NW'~3d6";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("\\u00004JU\\u05f3TQQ\\u0e00NW'~3d6", string1);
      assertNotNull(string1);
  }
}
