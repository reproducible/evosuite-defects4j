/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 05:36:57 GMT 2014
 */

package com.google.javascript.jscomp.deps;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.deps.SimpleDependencyInfo;
import com.google.javascript.jscomp.deps.SortedDependencies;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SortedDependenciesEvoSuite_branch_Test extends SortedDependenciesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Vector<SimpleDependencyInfo> vector0 = new Vector<SimpleDependencyInfo>();
      assertEquals(0, vector0.size());
      assertEquals("[]", vector0.toString());
      assertEquals(true, vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertNotNull(vector0);
      
      String string0 = "4rE.1Zqrk";
      Vector<String> vector1 = new Vector<String>();
      assertEquals(10, vector1.capacity());
      assertEquals(0, vector1.size());
      assertEquals(true, vector1.isEmpty());
      assertEquals("[]", vector1.toString());
      assertNotNull(vector1);
      
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo(string0, string0, (List<String>) vector1, (List<String>) vector1);
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getName());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals(10, vector1.capacity());
      assertEquals(0, vector1.size());
      assertEquals(true, vector1.isEmpty());
      assertEquals("[]", vector1.toString());
      assertNotNull(simpleDependencyInfo0);
      
      boolean boolean0 = vector0.add(simpleDependencyInfo0);
      assertTrue(boolean0);
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getName());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals(10, vector1.capacity());
      assertEquals(0, vector1.size());
      assertEquals(true, vector1.isEmpty());
      assertEquals("[]", vector1.toString());
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      assertEquals(false, vector0.isEmpty());
      assertEquals(1, vector0.size());
      assertEquals(10, vector0.capacity());
      
      SortedDependencies<SimpleDependencyInfo> sortedDependencies0 = new SortedDependencies<SimpleDependencyInfo>((List<SimpleDependencyInfo>) vector0);
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      assertEquals(false, vector0.isEmpty());
      assertEquals(1, vector0.size());
      assertEquals(10, vector0.capacity());
      assertNotNull(sortedDependencies0);
      
      Stack<SimpleDependencyInfo> stack0 = new Stack<SimpleDependencyInfo>();
      assertEquals(10, stack0.capacity());
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.empty());
      assertEquals(0, stack0.size());
      assertEquals(true, stack0.isEmpty());
      assertNotNull(stack0);
      
      List<SimpleDependencyInfo> list0 = sortedDependencies0.getSortedDependenciesOf((List<SimpleDependencyInfo>) stack0);
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      assertEquals(false, vector0.isEmpty());
      assertEquals(1, vector0.size());
      assertEquals(10, vector0.capacity());
      assertEquals(10, stack0.capacity());
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.empty());
      assertEquals(0, stack0.size());
      assertEquals(true, stack0.isEmpty());
      assertNotNull(list0);
  }

  @Test
  public void test1()  throws Throwable  {
      Vector<SimpleDependencyInfo> vector0 = new Vector<SimpleDependencyInfo>();
      assertEquals(true, vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertNotNull(vector0);
      
      String string0 = "\"k_[";
      Stack<String> stack0 = new Stack<String>();
      assertEquals(10, stack0.capacity());
      assertEquals(true, stack0.isEmpty());
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.empty());
      assertEquals(0, stack0.size());
      assertNotNull(stack0);
      
      ImmutableList.Builder<String> immutableList_Builder0 = new ImmutableList.Builder<String>();
      assertNotNull(immutableList_Builder0);
      
      String string1 = "mh5";
      assertNotSame(string1, string0);
      
      boolean boolean0 = stack0.add(string0);
      assertFalse(string0.equals((Object)string1));
      assertTrue(boolean0);
      assertEquals(10, stack0.capacity());
      assertEquals(false, stack0.isEmpty());
      assertEquals(false, stack0.empty());
      assertEquals("[\"k_[]", stack0.toString());
      assertEquals(1, stack0.size());
      assertNotSame(string0, string1);
      
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo(string1, string1, (List<String>) stack0, (List<String>) stack0);
      assertFalse(string1.equals((Object)string0));
      assertEquals(10, stack0.capacity());
      assertEquals(false, stack0.isEmpty());
      assertEquals(false, stack0.empty());
      assertEquals("[\"k_[]", stack0.toString());
      assertEquals(1, stack0.size());
      assertEquals("mh5", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("mh5", simpleDependencyInfo0.getName());
      assertNotNull(simpleDependencyInfo0);
      assertNotSame(string1, string0);
      
      boolean boolean1 = vector0.add(simpleDependencyInfo0);
      assertFalse(string1.equals((Object)string0));
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      assertEquals(10, stack0.capacity());
      assertEquals(false, stack0.isEmpty());
      assertEquals(false, stack0.empty());
      assertEquals("[\"k_[]", stack0.toString());
      assertEquals(1, stack0.size());
      assertEquals("mh5", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("mh5", simpleDependencyInfo0.getName());
      assertEquals(1, vector0.size());
      assertEquals(false, vector0.isEmpty());
      assertEquals("[DependencyInfo(relativePath='mh5', path='mh5', provides=[\"k_[], requires=[\"k_[])]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertNotSame(string1, string0);
      
      ImmutableList.Builder<String> immutableList_Builder1 = immutableList_Builder0.add(string1);
      assertFalse(string1.equals((Object)string0));
      assertNotNull(immutableList_Builder1);
      assertNotSame(string1, string0);
      
      ImmutableList<String> immutableList0 = immutableList_Builder0.build();
      assertEquals(1, immutableList0.size());
      assertNotNull(immutableList0);
      
      SimpleDependencyInfo simpleDependencyInfo1 = new SimpleDependencyInfo(string0, string0, (List<String>) stack0, (List<String>) immutableList0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(simpleDependencyInfo1.equals((Object)simpleDependencyInfo0));
      assertEquals(10, stack0.capacity());
      assertEquals(false, stack0.isEmpty());
      assertEquals(false, stack0.empty());
      assertEquals("[\"k_[]", stack0.toString());
      assertEquals(1, stack0.size());
      assertEquals(1, immutableList0.size());
      assertEquals("\"k_[", simpleDependencyInfo1.getName());
      assertEquals("\"k_[", simpleDependencyInfo1.getPathRelativeToClosureBase());
      assertNotNull(simpleDependencyInfo1);
      assertNotSame(string0, string1);
      assertNotSame(simpleDependencyInfo1, simpleDependencyInfo0);
      
      boolean boolean2 = vector0.add(simpleDependencyInfo1);
      assertFalse(string0.equals((Object)string1));
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      assertFalse(simpleDependencyInfo1.equals((Object)simpleDependencyInfo0));
      assertTrue(boolean2);
      assertEquals(10, stack0.capacity());
      assertEquals(false, stack0.isEmpty());
      assertEquals(false, stack0.empty());
      assertEquals("[\"k_[]", stack0.toString());
      assertEquals(1, stack0.size());
      assertEquals(1, immutableList0.size());
      assertEquals(2, vector0.size());
      assertEquals("[DependencyInfo(relativePath='mh5', path='mh5', provides=[\"k_[], requires=[\"k_[]), DependencyInfo(relativePath='\"k_[', path='\"k_[', provides=[\"k_[], requires=[mh5])]", vector0.toString());
      assertEquals(false, vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertEquals("\"k_[", simpleDependencyInfo1.getName());
      assertEquals("\"k_[", simpleDependencyInfo1.getPathRelativeToClosureBase());
      assertNotSame(string0, string1);
      assertNotSame(simpleDependencyInfo1, simpleDependencyInfo0);
      
      SortedDependencies<SimpleDependencyInfo> sortedDependencies0 = new SortedDependencies<SimpleDependencyInfo>((List<SimpleDependencyInfo>) vector0);
      assertEquals(2, vector0.size());
      assertEquals("[DependencyInfo(relativePath='mh5', path='mh5', provides=[\"k_[], requires=[\"k_[]), DependencyInfo(relativePath='\"k_[', path='\"k_[', provides=[\"k_[], requires=[mh5])]", vector0.toString());
      assertEquals(false, vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertNotNull(sortedDependencies0);
      
      List<SimpleDependencyInfo> list0 = sortedDependencies0.getSortedDependenciesOf((List<SimpleDependencyInfo>) vector0);
      assertEquals(false, list0.isEmpty());
      assertEquals(2, list0.size());
      assertEquals(2, vector0.size());
      assertEquals("[DependencyInfo(relativePath='mh5', path='mh5', provides=[\"k_[], requires=[\"k_[]), DependencyInfo(relativePath='\"k_[', path='\"k_[', provides=[\"k_[], requires=[mh5])]", vector0.toString());
      assertEquals(false, vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertNotNull(list0);
  }

  @Test
  public void test2()  throws Throwable  {
      Vector<SimpleDependencyInfo> vector0 = new Vector<SimpleDependencyInfo>();
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(true, vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertNotNull(vector0);
      
      String string0 = "4rE.1Zqrk";
      Vector<String> vector1 = new Vector<String>();
      assertEquals(true, vector1.isEmpty());
      assertEquals(10, vector1.capacity());
      assertEquals("[]", vector1.toString());
      assertEquals(0, vector1.size());
      assertNotNull(vector1);
      
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo(string0, string0, (List<String>) vector1, (List<String>) vector1);
      assertEquals(true, vector1.isEmpty());
      assertEquals(10, vector1.capacity());
      assertEquals("[]", vector1.toString());
      assertEquals(0, vector1.size());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getName());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertNotNull(simpleDependencyInfo0);
      
      boolean boolean0 = vector0.add(simpleDependencyInfo0);
      assertTrue(boolean0);
      assertEquals(10, vector0.capacity());
      assertEquals(false, vector0.isEmpty());
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      assertEquals(1, vector0.size());
      assertEquals(true, vector1.isEmpty());
      assertEquals(10, vector1.capacity());
      assertEquals("[]", vector1.toString());
      assertEquals(0, vector1.size());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getName());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getPathRelativeToClosureBase());
      
      ArrayList<String> arrayList0 = new ArrayList<String>();
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      assertNotNull(arrayList0);
      
      SortedDependencies<SimpleDependencyInfo> sortedDependencies0 = new SortedDependencies<SimpleDependencyInfo>((List<SimpleDependencyInfo>) vector0);
      assertEquals(10, vector0.capacity());
      assertEquals(false, vector0.isEmpty());
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      assertEquals(1, vector0.size());
      assertNotNull(sortedDependencies0);
      
      SimpleDependencyInfo simpleDependencyInfo1 = new SimpleDependencyInfo(string0, string0, (List<String>) arrayList0, (List<String>) arrayList0);
      assertTrue(simpleDependencyInfo1.equals((Object)simpleDependencyInfo0));
      assertEquals("4rE.1Zqrk", simpleDependencyInfo1.getName());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo1.getPathRelativeToClosureBase());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      assertNotNull(simpleDependencyInfo1);
      assertNotSame(simpleDependencyInfo1, simpleDependencyInfo0);
      
      boolean boolean1 = vector0.add(simpleDependencyInfo1);
      assertTrue(boolean1 == boolean0);
      assertTrue(simpleDependencyInfo1.equals((Object)simpleDependencyInfo0));
      assertTrue(boolean1);
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[]), DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(false, vector0.isEmpty());
      assertEquals(2, vector0.size());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo1.getName());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo1.getPathRelativeToClosureBase());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      assertNotSame(simpleDependencyInfo1, simpleDependencyInfo0);
      
      boolean boolean2 = arrayList0.add(string0);
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      assertTrue(boolean2);
      assertEquals(false, arrayList0.isEmpty());
      assertEquals("[4rE.1Zqrk]", arrayList0.toString());
      assertEquals(1, arrayList0.size());
      
      // Undeclared exception!
      try {
        List<SimpleDependencyInfo> list0 = sortedDependencies0.getSortedDependenciesOf((List<SimpleDependencyInfo>) vector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Vector<SimpleDependencyInfo> vector0 = new Vector<SimpleDependencyInfo>();
      assertEquals(10, vector0.capacity());
      assertEquals(true, vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      assertNotNull(vector0);
      
      String string0 = "no require found in subgH+Fh";
      Stack<String> stack0 = new Stack<String>();
      assertEquals(0, stack0.size());
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.empty());
      assertEquals(10, stack0.capacity());
      assertEquals(true, stack0.isEmpty());
      assertNotNull(stack0);
      
      ImmutableList.Builder<String> immutableList_Builder0 = new ImmutableList.Builder<String>();
      assertNotNull(immutableList_Builder0);
      
      String string1 = "x_B_/eE_0";
      assertNotSame(string1, string0);
      
      boolean boolean0 = stack0.add(string0);
      assertFalse(string0.equals((Object)string1));
      assertTrue(boolean0);
      assertEquals("[no require found in subgH+Fh]", stack0.toString());
      assertEquals(1, stack0.size());
      assertEquals(10, stack0.capacity());
      assertEquals(false, stack0.empty());
      assertEquals(false, stack0.isEmpty());
      assertNotSame(string0, string1);
      
      ImmutableList.Builder<String> immutableList_Builder1 = immutableList_Builder0.add(string1);
      assertFalse(string1.equals((Object)string0));
      assertNotNull(immutableList_Builder1);
      assertNotSame(string1, string0);
      
      ImmutableList.Builder<String> immutableList_Builder2 = immutableList_Builder0.addAll((Iterable<? extends String>) stack0);
      assertEquals("[no require found in subgH+Fh]", stack0.toString());
      assertEquals(1, stack0.size());
      assertEquals(10, stack0.capacity());
      assertEquals(false, stack0.empty());
      assertEquals(false, stack0.isEmpty());
      assertNotNull(immutableList_Builder2);
      assertSame(immutableList_Builder2, immutableList_Builder1);
      
      ImmutableList<String> immutableList0 = immutableList_Builder0.build();
      assertEquals(2, immutableList0.size());
      assertNotNull(immutableList0);
      
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo(string0, string0, (List<String>) stack0, (List<String>) immutableList0);
      assertFalse(string0.equals((Object)string1));
      assertEquals(2, immutableList0.size());
      assertEquals("no require found in subgH+Fh", simpleDependencyInfo0.getName());
      assertEquals("no require found in subgH+Fh", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("[no require found in subgH+Fh]", stack0.toString());
      assertEquals(1, stack0.size());
      assertEquals(10, stack0.capacity());
      assertEquals(false, stack0.empty());
      assertEquals(false, stack0.isEmpty());
      assertNotNull(simpleDependencyInfo0);
      assertNotSame(string0, string1);
      
      boolean boolean1 = vector0.add(simpleDependencyInfo0);
      assertTrue(boolean1 == boolean0);
      assertFalse(string0.equals((Object)string1));
      assertTrue(boolean1);
      assertEquals(2, immutableList0.size());
      assertEquals("no require found in subgH+Fh", simpleDependencyInfo0.getName());
      assertEquals("no require found in subgH+Fh", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("[DependencyInfo(relativePath='no require found in subgH+Fh', path='no require found in subgH+Fh', provides=[no require found in subgH+Fh], requires=[x_B_/eE_0, no require found in subgH+Fh])]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(1, vector0.size());
      assertEquals(false, vector0.isEmpty());
      assertEquals("[no require found in subgH+Fh]", stack0.toString());
      assertEquals(1, stack0.size());
      assertEquals(10, stack0.capacity());
      assertEquals(false, stack0.empty());
      assertEquals(false, stack0.isEmpty());
      assertNotSame(string0, string1);
      
      SortedDependencies<SimpleDependencyInfo> sortedDependencies0 = null;
      try {
        sortedDependencies0 = new SortedDependencies<SimpleDependencyInfo>((List<SimpleDependencyInfo>) vector0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no require found in subgH+Fh -> no require found in subgH+Fh
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Vector<SimpleDependencyInfo> vector0 = new Vector<SimpleDependencyInfo>();
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      assertEquals(true, vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertNotNull(vector0);
      
      String string0 = "4rE.1Zqrk";
      Vector<String> vector1 = new Vector<String>();
      assertEquals(10, vector1.capacity());
      assertEquals(0, vector1.size());
      assertEquals(true, vector1.isEmpty());
      assertEquals("[]", vector1.toString());
      assertNotNull(vector1);
      
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo(string0, string0, (List<String>) vector1, (List<String>) vector1);
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getName());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals(10, vector1.capacity());
      assertEquals(0, vector1.size());
      assertEquals(true, vector1.isEmpty());
      assertEquals("[]", vector1.toString());
      assertNotNull(simpleDependencyInfo0);
      
      boolean boolean0 = vector0.add(simpleDependencyInfo0);
      assertTrue(boolean0);
      assertEquals(1, vector0.size());
      assertEquals(false, vector0.isEmpty());
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getName());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals(10, vector1.capacity());
      assertEquals(0, vector1.size());
      assertEquals(true, vector1.isEmpty());
      assertEquals("[]", vector1.toString());
      
      SortedDependencies<SimpleDependencyInfo> sortedDependencies0 = new SortedDependencies<SimpleDependencyInfo>((List<SimpleDependencyInfo>) vector0);
      assertEquals(1, vector0.size());
      assertEquals(false, vector0.isEmpty());
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertNotNull(sortedDependencies0);
      
      List<SimpleDependencyInfo> list0 = sortedDependencies0.getSortedList();
      assertEquals(1, vector0.size());
      assertEquals(false, vector0.isEmpty());
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(1, list0.size());
      assertEquals(false, list0.isEmpty());
      assertNotNull(list0);
  }

  @Test
  public void test5()  throws Throwable  {
      Vector<SimpleDependencyInfo> vector0 = new Vector<SimpleDependencyInfo>();
      assertEquals(10, vector0.capacity());
      assertEquals(true, vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      assertNotNull(vector0);
      
      String string0 = "4rE.1Zqrk";
      Vector<String> vector1 = new Vector<String>();
      assertEquals(true, vector1.isEmpty());
      assertEquals(10, vector1.capacity());
      assertEquals(0, vector1.size());
      assertEquals("[]", vector1.toString());
      assertNotNull(vector1);
      
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo(string0, string0, (List<String>) vector1, (List<String>) vector1);
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getName());
      assertEquals(true, vector1.isEmpty());
      assertEquals(10, vector1.capacity());
      assertEquals(0, vector1.size());
      assertEquals("[]", vector1.toString());
      assertNotNull(simpleDependencyInfo0);
      
      boolean boolean0 = vector0.add(simpleDependencyInfo0);
      assertTrue(boolean0);
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getName());
      assertEquals(true, vector1.isEmpty());
      assertEquals(10, vector1.capacity());
      assertEquals(0, vector1.size());
      assertEquals("[]", vector1.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(false, vector0.isEmpty());
      assertEquals(1, vector0.size());
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      
      SortedDependencies<SimpleDependencyInfo> sortedDependencies0 = new SortedDependencies<SimpleDependencyInfo>((List<SimpleDependencyInfo>) vector0);
      assertEquals(10, vector0.capacity());
      assertEquals(false, vector0.isEmpty());
      assertEquals(1, vector0.size());
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      assertNotNull(sortedDependencies0);
      
      List<SimpleDependencyInfo> list0 = sortedDependencies0.getInputsWithoutProvides();
      assertEquals(1, list0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertEquals(false, vector0.isEmpty());
      assertEquals(1, vector0.size());
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      assertNotNull(list0);
  }

  @Test
  public void test6()  throws Throwable  {
      Vector<SimpleDependencyInfo> vector0 = new Vector<SimpleDependencyInfo>();
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      assertEquals(true, vector0.isEmpty());
      assertNotNull(vector0);
      
      String string0 = "4rE.1Zqrk";
      Vector<String> vector1 = new Vector<String>();
      assertEquals(0, vector1.size());
      assertEquals("[]", vector1.toString());
      assertEquals(true, vector1.isEmpty());
      assertEquals(10, vector1.capacity());
      assertNotNull(vector1);
      
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo(string0, string0, (List<String>) vector1, (List<String>) vector1);
      assertEquals(0, vector1.size());
      assertEquals("[]", vector1.toString());
      assertEquals(true, vector1.isEmpty());
      assertEquals(10, vector1.capacity());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getName());
      assertNotNull(simpleDependencyInfo0);
      
      boolean boolean0 = vector0.add(simpleDependencyInfo0);
      assertTrue(boolean0);
      assertEquals(0, vector1.size());
      assertEquals("[]", vector1.toString());
      assertEquals(true, vector1.isEmpty());
      assertEquals(10, vector1.capacity());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getName());
      assertEquals(10, vector0.capacity());
      assertEquals(1, vector0.size());
      assertEquals(false, vector0.isEmpty());
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      
      boolean boolean1 = vector0.add(simpleDependencyInfo0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      assertEquals(0, vector1.size());
      assertEquals("[]", vector1.toString());
      assertEquals(true, vector1.isEmpty());
      assertEquals(10, vector1.capacity());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("4rE.1Zqrk", simpleDependencyInfo0.getName());
      assertEquals(10, vector0.capacity());
      assertEquals(2, vector0.size());
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[]), DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      assertEquals(false, vector0.isEmpty());
      
      SortedDependencies<SimpleDependencyInfo> sortedDependencies0 = new SortedDependencies<SimpleDependencyInfo>((List<SimpleDependencyInfo>) vector0);
      assertEquals(10, vector0.capacity());
      assertEquals(2, vector0.size());
      assertEquals("[DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[]), DependencyInfo(relativePath='4rE.1Zqrk', path='4rE.1Zqrk', provides=[], requires=[])]", vector0.toString());
      assertEquals(false, vector0.isEmpty());
      assertNotNull(sortedDependencies0);
  }
}