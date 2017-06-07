/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:11:01 GMT 2014
 */

package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class LookupTranslatorEvoSuite_branch_Test extends LookupTranslatorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = (-36);
      String string0 = CharSequenceTranslator.hex(int0);
      assertEquals("FFFFFFDC", string0);
      assertNotNull(string0);
      
      CharSequence[][] charSequenceArray0 = new CharSequence[4][8];
      CharSequence[] charSequenceArray1 = new CharSequence[19];
      charSequenceArray1[0] = (CharSequence) string0;
      assertEquals("FFFFFFDC", charSequenceArray1[0].toString());
      assertEquals(8, charSequenceArray1[0].length());
      assertNotNull(charSequenceArray1[0]);
      
      charSequenceArray1[1] = (CharSequence) string0;
      assertEquals("FFFFFFDC", charSequenceArray1[1].toString());
      assertEquals(8, charSequenceArray1[1].length());
      assertNotNull(charSequenceArray1[1]);
      
      charSequenceArray0[0] = charSequenceArray1;
      assertNotNull(charSequenceArray0[0]);
      
      charSequenceArray0[1] = charSequenceArray0[0];
      assertNotNull(charSequenceArray0[1]);
      
      CharSequence[][] charSequenceArray2 = new CharSequence[2][8];
      assertFalse(charSequenceArray2.equals((Object)charSequenceArray0));
      assertNotSame(charSequenceArray2, charSequenceArray0);
      
      charSequenceArray2[0] = charSequenceArray0[1];
      assertNotNull(charSequenceArray2[0]);
      
      charSequenceArray2[1] = charSequenceArray0[1];
      assertNotNull(charSequenceArray2[1]);
      
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray2);
      assertFalse(charSequenceArray2.equals((Object)charSequenceArray0));
      assertNotSame(charSequenceArray2, charSequenceArray0);
      assertNotNull(lookupTranslator0);
      
      String string1 = lookupTranslator0.translate(charSequenceArray1[0]);
      assertEquals("FFFFFFDC", string1);
      assertFalse(charSequenceArray2.equals((Object)charSequenceArray0));
      assertTrue(string1.equals((Object)string0));
      assertNotSame(charSequenceArray2, charSequenceArray0);
      assertNotSame(string1, string0);
      assertNotNull(string1);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = (-36);
      String string0 = CharSequenceTranslator.hex(int0);
      assertEquals("FFFFFFDC", string0);
      assertNotNull(string0);
      
      CharSequence[][] charSequenceArray0 = new CharSequence[4][8];
      CharSequence[] charSequenceArray1 = new CharSequence[19];
      charSequenceArray1[0] = (CharSequence) string0;
      assertEquals(8, charSequenceArray1[0].length());
      assertEquals("FFFFFFDC", charSequenceArray1[0].toString());
      assertNotNull(charSequenceArray1[0]);
      
      charSequenceArray0[0] = charSequenceArray1;
      assertNotNull(charSequenceArray0[0]);
      
      charSequenceArray0[1] = charSequenceArray0[0];
      assertNotNull(charSequenceArray0[1]);
      
      CharSequence[][] charSequenceArray2 = new CharSequence[2][8];
      assertFalse(charSequenceArray2.equals((Object)charSequenceArray0));
      assertNotSame(charSequenceArray2, charSequenceArray0);
      
      charSequenceArray2[0] = charSequenceArray0[1];
      assertNotNull(charSequenceArray2[0]);
      
      charSequenceArray2[1] = charSequenceArray2[0];
      assertNotNull(charSequenceArray2[1]);
      
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray2);
      assertFalse(charSequenceArray2.equals((Object)charSequenceArray0));
      assertNotSame(charSequenceArray2, charSequenceArray0);
      assertNotNull(lookupTranslator0);
      
      String string1 = lookupTranslator0.translate(charSequenceArray1[0]);
      assertEquals("FFFFFFDC", string1);
      assertTrue(string1.equals((Object)string0));
      assertFalse(charSequenceArray2.equals((Object)charSequenceArray0));
      assertNotSame(string1, string0);
      assertNotSame(charSequenceArray2, charSequenceArray0);
      assertNotNull(string1);
  }

  @Test
  public void test2()  throws Throwable  {
      CharSequence[][] charSequenceArrayArray0 = null;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArrayArray0);
      assertNotNull(lookupTranslator0);
  }
}