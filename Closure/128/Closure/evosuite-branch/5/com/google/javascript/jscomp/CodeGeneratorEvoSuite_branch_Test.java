/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:21:15 GMT 2014
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
      String string0 = " tkrb\n";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertEquals(" tkrb\n", string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "82";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "9";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(9.0, double0, 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = "Expected children to be strings";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      String string0 = "01";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = " tkrb\n";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      String string0 = "\u0000\u00AD\u0600\u06DD\u070F\u1680\u180E\u2000.\u205F\u206A\u3000\uD8007\uFFFA";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertEquals("\\u0000\\u007f\\u00ad\\u0600\\u06dd\\u070f\\u1680\\u180e\\u2000.\\u205f\\u206a\\u3000\\ud8007\\ufffa", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
  }
}