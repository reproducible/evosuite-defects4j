/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:31:37 GMT 2014
 */

package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class LocaleUtilsEvoSuite_branch_Test extends LocaleUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "8.3MB";
      List list0 = LocaleUtils.countriesByLanguage(string0);
      assertNotNull(list0);
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "8.3MB";
      List list0 = LocaleUtils.languagesByCountry(string0);
      assertNotNull(list0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      assertNotNull(locale0);
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertTrue(boolean0);
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = null;
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNull(locale0);
      
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertFalse(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      Set set0 = LocaleUtils.availableLocaleSet();
      assertNotNull(set0);
      assertEquals(156, set0.size());
      assertEquals(false, set0.isEmpty());
      
      Set set1 = LocaleUtils.availableLocaleSet();
      assertNotNull(set1);
      assertSame(set1, set0);
      assertEquals(156, set1.size());
      assertEquals(false, set1.isEmpty());
  }

  @Test
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      assertNotNull(locale0);
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja_JP", locale0.toString());
      
      Locale locale1 = Locale.ITALIAN;
      assertNotNull(locale1);
      assertNotSame(locale1, locale0);
      assertEquals("", locale1.getVariant());
      assertEquals("it", locale1.toString());
      assertEquals("", locale1.getCountry());
      assertEquals("", locale1.getISO3Country());
      assertEquals("ita", locale1.getISO3Language());
      assertEquals("it", locale1.getLanguage());
      assertFalse(locale1.equals((Object)locale0));
      
      List list0 = LocaleUtils.localeLookupList(locale1, locale0);
      assertNotNull(list0);
      assertNotSame(locale0, locale1);
      assertNotSame(locale1, locale0);
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("", locale1.getVariant());
      assertEquals("it", locale1.toString());
      assertEquals("", locale1.getCountry());
      assertEquals("", locale1.getISO3Country());
      assertEquals("ita", locale1.getISO3Language());
      assertEquals("it", locale1.getLanguage());
      assertEquals(false, list0.isEmpty());
      assertEquals(2, list0.size());
      assertFalse(locale0.equals((Object)locale1));
      assertFalse(locale1.equals((Object)locale0));
  }

  @Test
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      assertNotNull(locale0);
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertNotNull(list0);
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "oLn1";
      Locale locale0 = new Locale(string0, string0, string0);
      assertNotNull(locale0);
      assertEquals("oln1", locale0.getLanguage());
      assertEquals("oln1_OLN1_oLn1", locale0.toString());
      assertEquals("OLN1", locale0.getCountry());
      assertEquals("oLn1", locale0.getVariant());
      
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertNotNull(list0);
      assertEquals(3, list0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals("oln1", locale0.getLanguage());
      assertEquals("oln1_OLN1_oLn1", locale0.toString());
      assertEquals("OLN1", locale0.getCountry());
      assertEquals("oLn1", locale0.getVariant());
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = null;
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNull(locale0);
      
      List list0 = LocaleUtils.localeLookupList(locale0);
      assertNotNull(list0);
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "zy_MF\\hmc99ZE";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: zy_MF\\hmc99ZE
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "zd_FcVR7m|U";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: zd_FcVR7m|U
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "zy_M)Fmc>u97ZU";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: zy_M)Fmc>u97ZU
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "zd_\\MacReZ";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: zd_\\MacReZ
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "dk_.j0k@%Hr";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: dk_.j0k@%Hr
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = "yf.Jk\"c*|";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: yf.Jk\"c*|
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = "k}yc?^x8;:A@@";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: k}yc?^x8;:A@@
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "eY/Xs/jC~Q%)M+XN<E6";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: eY/Xs/jC~Q%)M+XN<E6
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = "~>CgdKa~ TFScy";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ~>CgdKa~ TFScy
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: 
         //
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      assertNotNull(locale0);
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      
      String string0 = locale0.toString();
      assertNotNull(string0);
      assertEquals("zh_CN", string0);
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      
      Locale locale1 = LocaleUtils.toLocale(string0);
      assertNotNull(locale1);
      assertNotSame(locale1, locale0);
      assertNotSame(locale0, locale1);
      assertEquals("CN", locale1.getCountry());
      assertEquals("CHN", locale1.getISO3Country());
      assertEquals("zh", locale1.getLanguage());
      assertEquals("zh_CN", locale1.toString());
      assertEquals("zho", locale1.getISO3Language());
      assertEquals("", locale1.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertTrue(locale1.equals((Object)locale0));
      assertTrue(locale0.equals((Object)locale1));
  }

  @Test
  public void test20()  throws Throwable  {
      String string0 = "A*Na9#x}";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: A*Na9#x}
         //
      }
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = "th";
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNotNull(locale0);
      assertEquals("th", locale0.getLanguage());
      assertEquals("th", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("tha", locale0.getISO3Language());
  }

  @Test
  public void test22()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      assertNotNull(localeUtils0);
  }
}