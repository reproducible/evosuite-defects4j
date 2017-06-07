/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:51:39 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.ConcreteType;
import com.google.javascript.jscomp.DisambiguateProperties;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.rhino.jstype.JSType;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DisambiguatePropertiesEvoSuite_branch_Test extends DisambiguatePropertiesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      compiler0.initCompilerOptionsIfTesting();
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(tightenTypes0);
      
      HashMap<String, CheckLevel> hashMap0 = new HashMap<String, CheckLevel>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0, hashMap0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(disambiguateProperties0);
      
      String string0 = "t";
      TightenTypes.ConcreteScope tightenTypes_ConcreteScope0 = null;
      TightenTypes.ConcreteScope tightenTypes_ConcreteScope1 = tightenTypes0.new ConcreteScope(tightenTypes_ConcreteScope0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(tightenTypes_ConcreteScope1);
      
      ConcreteType concreteType0 = tightenTypes_ConcreteScope1.getTypeOfThis();
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(concreteType0);
      
      ConcreteType.ConcreteUniqueType concreteType_ConcreteUniqueType0 = (ConcreteType.ConcreteUniqueType)disambiguateProperties0.getTypeWithProperty(string0, concreteType0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(concreteType_ConcreteUniqueType0);
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      compiler0.initCompilerOptionsIfTesting();
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertNotNull(tightenTypes0);
      
      HashMap<String, CheckLevel> hashMap0 = new HashMap<String, CheckLevel>();
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      String string0 = "t";
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckLevel checkLevel1 = hashMap0.put(string0, checkLevel0);
      assertEquals("{t=ERROR}", hashMap0.toString());
      assertEquals(1, hashMap0.size());
      assertEquals(false, hashMap0.isEmpty());
      
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0, hashMap0);
      assertEquals("{t=ERROR}", hashMap0.toString());
      assertEquals(1, hashMap0.size());
      assertEquals(false, hashMap0.isEmpty());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertNotNull(disambiguateProperties0);
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      Map<String, CheckLevel> map0 = null;
      // Undeclared exception!
      try {
        DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0, map0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      compiler0.initCompilerOptionsIfTesting();
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(tightenTypes0);
      
      HashMap<String, CheckLevel> hashMap0 = new HashMap<String, CheckLevel>();
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0, hashMap0);
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(disambiguateProperties0);
      
      String string0 = "";
      ConcreteType concreteType0 = ConcreteType.ALL;
      assertNotNull(concreteType0);
      
      ConcreteType concreteType1 = disambiguateProperties0.getTypeWithProperty(string0, concreteType0);
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertNull(concreteType1);
  }

  @Test
  public void test4()  throws Throwable  {
      DisambiguateProperties.Warnings disambiguateProperties_Warnings0 = new DisambiguateProperties.Warnings();
      assertNotNull(disambiguateProperties_Warnings0);
  }
}