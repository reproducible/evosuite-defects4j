/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:43:08 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.ObjectPropertyStringPreprocess;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.SourceExcerptProvider;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.VariableShadowDeclarationCheck;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.FileSystemHandling;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class LightweightMessageFormatterEvoSuite_branch_Test extends LightweightMessageFormatterEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/.l-k<0.l-k<");
      String string0 = "^\n";
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      assertTrue(boolean0);
      
      String string1 = ".l-k<";
      assertNotSame(string1, string0);
      
      MockFile mockFile0 = (MockFile)MockFile.createTempFile(string1, string1);
      assertNotSame(string1, string0);
      assertFalse(string1.equals((Object)string0));
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile((File) mockFile0);
      assertNotSame(string1, string0);
      assertEquals("/tmp/.l-k<0.l-k<", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/.l-k<0.l-k<", sourceFile_OnDisk0.getName());
      assertEquals("/tmp/.l-k<0.l-k<", sourceFile_OnDisk0.getOriginalPath());
      assertFalse(string1.equals((Object)string0));
      assertNotNull(sourceFile_OnDisk0);
      
      int int0 = (-10);
      SimpleRegion simpleRegion0 = (SimpleRegion)sourceFile_OnDisk0.getRegion(int0);
      assertNotSame(string1, string0);
      assertEquals(3, simpleRegion0.getEndingLineNumber());
      assertEquals(1, simpleRegion0.getBeginningLineNumber());
      assertEquals("^\n", simpleRegion0.getSourceExcerpt());
      assertEquals("/tmp/.l-k<0.l-k<", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/.l-k<0.l-k<", sourceFile_OnDisk0.getName());
      assertEquals("/tmp/.l-k<0.l-k<", sourceFile_OnDisk0.getOriginalPath());
      assertFalse(string1.equals((Object)string0));
      assertNotNull(simpleRegion0);
      
      String string2 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertEquals(3, simpleRegion0.getEndingLineNumber());
      assertEquals(1, simpleRegion0.getBeginningLineNumber());
      assertEquals("^\n", simpleRegion0.getSourceExcerpt());
      assertEquals("/tmp/.l-k<0.l-k<", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/.l-k<0.l-k<", sourceFile_OnDisk0.getName());
      assertEquals("/tmp/.l-k<0.l-k<", sourceFile_OnDisk0.getOriginalPath());
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertEquals("  1| ^", string2);
      assertNotNull(string2);
  }

  @Test
  public void test1()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      String string0 = "";
      int int0 = 38;
      SimpleRegion simpleRegion0 = new SimpleRegion(int0, int0, string0);
      assertEquals(38, simpleRegion0.getBeginningLineNumber());
      assertEquals("", simpleRegion0.getSourceExcerpt());
      assertEquals(38, simpleRegion0.getEndingLineNumber());
      assertNotNull(simpleRegion0);
      
      String string1 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertEquals(38, simpleRegion0.getBeginningLineNumber());
      assertEquals("", simpleRegion0.getSourceExcerpt());
      assertEquals(38, simpleRegion0.getEndingLineNumber());
      assertNull(string1);
  }

  @Test
  public void test2()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      Region region0 = null;
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(region0);
      assertNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = ";rUu@$";
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertEquals(";rUu@$", jSSourceFile0.getOriginalPath());
      assertEquals(";rUu@$", jSSourceFile0.toString());
      assertEquals(";rUu@$", jSSourceFile0.getName());
      assertNotNull(jSSourceFile0);
      
      int int0 = (-28);
      SimpleRegion simpleRegion0 = (SimpleRegion)jSSourceFile0.getRegion(int0);
      assertEquals(1, simpleRegion0.getEndingLineNumber());
      assertEquals(";rUu@$", simpleRegion0.getSourceExcerpt());
      assertEquals(1, simpleRegion0.getBeginningLineNumber());
      assertEquals(";rUu@$", jSSourceFile0.getOriginalPath());
      assertEquals(";rUu@$", jSSourceFile0.toString());
      assertEquals(";rUu@$", jSSourceFile0.getName());
      assertNotNull(simpleRegion0);
      
      String string1 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(1, simpleRegion0.getEndingLineNumber());
      assertEquals(";rUu@$", simpleRegion0.getSourceExcerpt());
      assertEquals(1, simpleRegion0.getBeginningLineNumber());
      assertEquals(";rUu@$", jSSourceFile0.getOriginalPath());
      assertEquals(";rUu@$", jSSourceFile0.toString());
      assertEquals(";rUu@$", jSSourceFile0.getName());
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("  1| ;rUu@$", string1);
      assertNotNull(string1);
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 2323;
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      assertNotNull(lightweightMessageFormatter0);
      
      String string0 = null;
      CheckLevel checkLevel0 = CheckLevel.OFF;
      DiagnosticType diagnosticType0 = ObjectPropertyStringPreprocess.STRING_LITERAL_EXPECTED_ERROR;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[9];
      JSError jSError0 = JSError.make(string0, int0, int0, checkLevel0, diagnosticType0, stringArray0);
      assertEquals(2323, jSError0.getCharno());
      assertNotNull(jSError0);
      
      String string1 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals(2323, jSError0.getCharno());
      assertEquals("WARNING - goog.testing.ObjectPropertyString instantiated with invalid argument, string literal expected. Was \"null\".\n", string1);
      assertNotNull(string1);
  }

  @Test
  public void test5()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      assertNotNull(lightweightMessageFormatter0);
      
      String string0 = ";rUu@$";
      int int0 = 101;
      DiagnosticType diagnosticType0 = VariableShadowDeclarationCheck.SHADOW_VAR_ERROR;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[4];
      JSError jSError0 = JSError.make(string0, int0, int0, diagnosticType0, stringArray0);
      assertEquals(101, jSError0.getCharno());
      assertNotNull(jSError0);
      
      String string1 = lightweightMessageFormatter0.formatError(jSError0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(101, jSError0.getCharno());
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals(";rUu@$:101: ERROR - Highly error prone shadowing of variable name null.Consider using a different local variable name.\n", string1);
      assertNotNull(string1);
  }

  @Test
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      LightweightMessageFormatter lightweightMessageFormatter0 = new LightweightMessageFormatter((SourceExcerptProvider) compiler0);
      assertNotNull(lightweightMessageFormatter0);
      
      String string0 = "/7!N";
      int int0 = (-2861);
      DiagnosticType diagnosticType0 = DiagnosticType.disabled(string0, string0);
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[1];
      JSError jSError0 = JSError.make(string0, int0, int0, diagnosticType0, stringArray0);
      assertEquals(-2861, jSError0.getCharno());
      assertNotNull(jSError0);
      
      String string1 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(-2861, jSError0.getCharno());
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("/7!N: WARNING - /7!N\n", string1);
      assertNotNull(string1);
  }
}
