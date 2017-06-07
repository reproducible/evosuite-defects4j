/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:32:47 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.common.base.Supplier;
import com.google.common.io.CharSource;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FunctionInjector;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.WhitelistWarningsGuard;
import com.google.javascript.rhino.Node;
import java.util.ArrayList;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class FunctionInjectorEvoSuite_branch_Test extends FunctionInjectorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(supplier0);
      
      boolean boolean0 = false;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, supplier0, boolean0, boolean0, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(functionInjector0);
      
      String string0 = "04*";
      CharSource charSource0 = CharSource.wrap((CharSequence) string0);
      assertNotNull(charSource0);
      
      Set<String> set0 = WhitelistWarningsGuard.loadWhitelistedJsWarnings(charSource0);
      assertEquals(false, set0.isEmpty());
      assertEquals(1, set0.size());
      assertNotNull(set0);
      
      functionInjector0.setKnownConstants(set0);
      assertEquals(false, set0.isEmpty());
      assertEquals(1, set0.size());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      // Undeclared exception!
      try {
        functionInjector0.setKnownConstants(set0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      Node node0 = compiler0.getJsRoot();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNull(node0);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(supplier0);
      
      boolean boolean0 = true;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, supplier0, boolean0, boolean0, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(functionInjector0);
      
      String string0 = "0Y*";
      CharSource charSource0 = CharSource.wrap((CharSequence) string0);
      assertNotNull(charSource0);
      
      JSModule jSModule0 = new JSModule(string0);
      assertEquals("0Y*", jSModule0.getName());
      assertEquals(-1, jSModule0.getDepth());
      assertEquals("0Y*", jSModule0.toString());
      assertNotNull(jSModule0);
      
      ArrayList<FunctionInjector.Reference> arrayList0 = new ArrayList<FunctionInjector.Reference>();
      assertEquals(0, arrayList0.size());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      assertNotNull(arrayList0);
      
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, jSModule0, functionInjector_InliningMode0);
      assertEquals("0Y*", jSModule0.getName());
      assertEquals(-1, jSModule0.getDepth());
      assertEquals("0Y*", jSModule0.toString());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(functionInjector_Reference0);
      
      boolean boolean1 = arrayList0.add(functionInjector_Reference0);
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      assertEquals(1, arrayList0.size());
      assertEquals(false, arrayList0.isEmpty());
      assertEquals("0Y*", jSModule0.getName());
      assertEquals(-1, jSModule0.getDepth());
      assertEquals("0Y*", jSModule0.toString());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean2 = arrayList0.add(functionInjector_Reference0);
      assertTrue(boolean2);
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(2, arrayList0.size());
      assertEquals("0Y*", jSModule0.getName());
      assertEquals(-1, jSModule0.getDepth());
      assertEquals("0Y*", jSModule0.toString());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Set<String> set0 = WhitelistWarningsGuard.loadWhitelistedJsWarnings(charSource0);
      assertEquals(1, set0.size());
      assertEquals(false, set0.isEmpty());
      assertNotNull(set0);
      
      // Undeclared exception!
      try {
        boolean boolean3 = functionInjector0.inliningLowersCost(jSModule0, node0, arrayList0, set0, boolean0, boolean2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      Node node0 = compiler0.getJsRoot();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNull(node0);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(supplier0);
      
      boolean boolean0 = true;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, supplier0, boolean0, boolean0, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(functionInjector0);
      
      String string0 = "0Y*";
      CharSource charSource0 = CharSource.wrap((CharSequence) string0);
      assertNotNull(charSource0);
      
      JSModule jSModule0 = new JSModule(string0);
      assertEquals("0Y*", jSModule0.toString());
      assertEquals("0Y*", jSModule0.getName());
      assertEquals(-1, jSModule0.getDepth());
      assertNotNull(jSModule0);
      
      ArrayList<FunctionInjector.Reference> arrayList0 = new ArrayList<FunctionInjector.Reference>();
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      assertEquals(true, arrayList0.isEmpty());
      assertNotNull(arrayList0);
      
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      JSModule jSModule1 = null;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, jSModule1, functionInjector_InliningMode0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(functionInjector_Reference0);
      
      boolean boolean1 = arrayList0.add(functionInjector_Reference0);
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      assertEquals(1, arrayList0.size());
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Set<String> set0 = WhitelistWarningsGuard.loadWhitelistedJsWarnings(charSource0);
      assertEquals(1, set0.size());
      assertEquals(false, set0.isEmpty());
      assertNotNull(set0);
      
      // Undeclared exception!
      try {
        boolean boolean2 = functionInjector0.inliningLowersCost(jSModule0, node0, arrayList0, set0, boolean0, boolean1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      assertNotNull(nodeUtil_MatchShallowStatement0);
      
      boolean boolean0 = nodeUtil_MatchShallowStatement0.equals((Object) nodeUtil_MatchShallowStatement0);
      assertTrue(boolean0);
      
      String string0 = "AM#6(7`";
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(supplier0);
      
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, supplier0, boolean0, boolean0, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(functionInjector0);
      
      Node node0 = null;
      CharSource charSource0 = CharSource.wrap((CharSequence) string0);
      assertNotNull(charSource0);
      
      JSModule jSModule0 = new JSModule(string0);
      assertEquals("AM#6(7`", jSModule0.getName());
      assertEquals("AM#6(7`", jSModule0.toString());
      assertEquals(-1, jSModule0.getDepth());
      assertNotNull(jSModule0);
      
      ArrayList<FunctionInjector.Reference> arrayList0 = new ArrayList<FunctionInjector.Reference>();
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      assertNotNull(arrayList0);
      
      Set<String> set0 = WhitelistWarningsGuard.loadWhitelistedJsWarnings(charSource0);
      assertEquals(1, set0.size());
      assertEquals(false, set0.isEmpty());
      assertNotNull(set0);
      
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, jSModule0, functionInjector_InliningMode0);
      assertEquals("AM#6(7`", jSModule0.getName());
      assertEquals("AM#6(7`", jSModule0.toString());
      assertEquals(-1, jSModule0.getDepth());
      assertNotNull(functionInjector_Reference0);
      
      boolean boolean1 = arrayList0.add(functionInjector_Reference0);
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      assertEquals("AM#6(7`", jSModule0.getName());
      assertEquals("AM#6(7`", jSModule0.toString());
      assertEquals(-1, jSModule0.getDepth());
      assertEquals(1, arrayList0.size());
      assertEquals(false, arrayList0.isEmpty());
      
      boolean boolean2 = functionInjector0.inliningLowersCost(jSModule0, node0, arrayList0, set0, boolean1, boolean0);
      assertTrue(boolean2);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1 == boolean2);
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      assertTrue(boolean0 == boolean2);
      assertTrue(boolean0 == boolean1);
      assertEquals(1, set0.size());
      assertEquals(false, set0.isEmpty());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals("AM#6(7`", jSModule0.getName());
      assertEquals("AM#6(7`", jSModule0.toString());
      assertEquals(-1, jSModule0.getDepth());
      assertEquals(1, arrayList0.size());
      assertEquals(false, arrayList0.isEmpty());
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(supplier0);
      
      boolean boolean0 = true;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, supplier0, boolean0, boolean0, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(functionInjector0);
      
      String string0 = "0*";
      Node node0 = null;
      CharSource charSource0 = CharSource.wrap((CharSequence) string0);
      assertNotNull(charSource0);
      
      JSModule jSModule0 = new JSModule(string0);
      assertEquals("0*", jSModule0.getName());
      assertEquals("0*", jSModule0.toString());
      assertEquals(-1, jSModule0.getDepth());
      assertNotNull(jSModule0);
      
      ArrayList<FunctionInjector.Reference> arrayList0 = new ArrayList<FunctionInjector.Reference>();
      assertEquals("[]", arrayList0.toString());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertNotNull(arrayList0);
      
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, jSModule0, functionInjector_InliningMode0);
      assertEquals("0*", jSModule0.getName());
      assertEquals("0*", jSModule0.toString());
      assertEquals(-1, jSModule0.getDepth());
      assertNotNull(functionInjector_Reference0);
      
      boolean boolean1 = arrayList0.add(functionInjector_Reference0);
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertEquals("0*", jSModule0.getName());
      assertEquals("0*", jSModule0.toString());
      assertEquals(-1, jSModule0.getDepth());
      
      Set<String> set0 = WhitelistWarningsGuard.loadWhitelistedJsWarnings(charSource0);
      assertEquals(1, set0.size());
      assertEquals(false, set0.isEmpty());
      assertNotNull(set0);
      
      JSModule jSModule1 = null;
      // Undeclared exception!
      try {
        boolean boolean2 = functionInjector0.inliningLowersCost(jSModule1, node0, arrayList0, set0, boolean0, boolean1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(supplier0);
      
      boolean boolean0 = false;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, supplier0, boolean0, boolean0, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(functionInjector0);
      
      String string0 = "*";
      Node node0 = null;
      CharSource charSource0 = CharSource.wrap((CharSequence) string0);
      assertNotNull(charSource0);
      
      JSModule jSModule0 = new JSModule(string0);
      assertEquals("*", jSModule0.getName());
      assertEquals(-1, jSModule0.getDepth());
      assertEquals("*", jSModule0.toString());
      assertNotNull(jSModule0);
      
      ArrayList<FunctionInjector.Reference> arrayList0 = new ArrayList<FunctionInjector.Reference>();
      assertEquals("[]", arrayList0.toString());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertNotNull(arrayList0);
      
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, jSModule0, functionInjector_InliningMode0);
      assertEquals("*", jSModule0.getName());
      assertEquals(-1, jSModule0.getDepth());
      assertEquals("*", jSModule0.toString());
      assertNotNull(functionInjector_Reference0);
      
      boolean boolean1 = arrayList0.add(functionInjector_Reference0);
      assertTrue(boolean1);
      assertFalse(boolean1 == boolean0);
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertEquals("*", jSModule0.getName());
      assertEquals(-1, jSModule0.getDepth());
      assertEquals("*", jSModule0.toString());
      
      Set<String> set0 = WhitelistWarningsGuard.loadWhitelistedJsWarnings(charSource0);
      assertEquals(false, set0.isEmpty());
      assertEquals(1, set0.size());
      assertNotNull(set0);
      
      // Undeclared exception!
      try {
        boolean boolean2 = functionInjector0.inliningLowersCost(jSModule0, node0, arrayList0, set0, boolean0, boolean1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(supplier0);
      
      boolean boolean0 = false;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, supplier0, boolean0, boolean0, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(functionInjector0);
      
      String string0 = "04*";
      Node node0 = null;
      CharSource charSource0 = CharSource.wrap((CharSequence) string0);
      assertNotNull(charSource0);
      
      JSModule jSModule0 = new JSModule(string0);
      assertEquals("04*", jSModule0.getName());
      assertEquals(-1, jSModule0.getDepth());
      assertEquals("04*", jSModule0.toString());
      assertNotNull(jSModule0);
      
      ArrayList<FunctionInjector.Reference> arrayList0 = new ArrayList<FunctionInjector.Reference>();
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      assertNotNull(arrayList0);
      
      Set<String> set0 = WhitelistWarningsGuard.loadWhitelistedJsWarnings(charSource0);
      assertEquals(1, set0.size());
      assertEquals(false, set0.isEmpty());
      assertNotNull(set0);
      
      boolean boolean1 = functionInjector0.inliningLowersCost(jSModule0, node0, arrayList0, set0, boolean0, boolean0);
      assertTrue(boolean1);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertEquals("04*", jSModule0.getName());
      assertEquals(-1, jSModule0.getDepth());
      assertEquals("04*", jSModule0.toString());
      assertEquals(1, set0.size());
      assertEquals(false, set0.isEmpty());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
  }

  @Test
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Node node0 = compiler0.getJsRoot();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNull(node0);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(supplier0);
      
      boolean boolean0 = false;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, supplier0, boolean0, boolean0, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(functionInjector0);
      
      String string0 = "Y%*";
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      // Undeclared exception!
      try {
        Node node1 = functionInjector0.inline(node0, string0, node0, functionInjector_InliningMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(supplier0);
      
      boolean boolean0 = true;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, supplier0, boolean0, boolean0, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(functionInjector0);
      
      String string0 = "0*";
      Node node0 = null;
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      // Undeclared exception!
      try {
        Node node1 = functionInjector0.inline(node0, string0, node0, functionInjector_InliningMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}