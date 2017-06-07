/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:13:29 GMT 2014
 */

package org.joda.time.field;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.joda.time.Chronology;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class UnsupportedDurationFieldEvoSuite_branch_Test extends UnsupportedDurationFieldEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      assertEquals("minutes", durationFieldType0.toString());
      assertEquals("minutes", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      DurationFieldType durationFieldType1 = DurationFieldType.hours();
      assertNotSame(durationFieldType1, durationFieldType0);
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      assertEquals("hours", durationFieldType1.toString());
      assertEquals("hours", durationFieldType1.getName());
      assertNotNull(durationFieldType1);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotSame(durationFieldType0, durationFieldType1);
      assertFalse(durationFieldType0.equals((Object)durationFieldType1));
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("minutes", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("minutes", durationFieldType0.toString());
      assertEquals("minutes", durationFieldType0.getName());
      assertNotNull(unsupportedDurationField0);
      
      UnsupportedDurationField unsupportedDurationField1 = UnsupportedDurationField.getInstance(durationFieldType1);
      assertNotSame(durationFieldType1, durationFieldType0);
      assertNotSame(unsupportedDurationField1, unsupportedDurationField0);
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      assertFalse(unsupportedDurationField1.equals((Object)unsupportedDurationField0));
      assertEquals("hours", durationFieldType1.toString());
      assertEquals("hours", durationFieldType1.getName());
      assertEquals(true, unsupportedDurationField1.isPrecise());
      assertEquals(0L, unsupportedDurationField1.getUnitMillis());
      assertEquals("hours", unsupportedDurationField1.getName());
      assertEquals(false, unsupportedDurationField1.isSupported());
      assertNotNull(unsupportedDurationField1);
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) unsupportedDurationField1);
      assertNotSame(unsupportedDurationField0, unsupportedDurationField1);
      assertNotSame(durationFieldType1, durationFieldType0);
      assertNotSame(unsupportedDurationField1, unsupportedDurationField0);
      assertNotSame(durationFieldType0, durationFieldType1);
      assertFalse(unsupportedDurationField0.equals((Object)unsupportedDurationField1));
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      assertFalse(unsupportedDurationField1.equals((Object)unsupportedDurationField0));
      assertFalse(durationFieldType0.equals((Object)durationFieldType1));
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("minutes", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("hours", durationFieldType1.toString());
      assertEquals("hours", durationFieldType1.getName());
      assertEquals(true, unsupportedDurationField1.isPrecise());
      assertEquals(0L, unsupportedDurationField1.getUnitMillis());
      assertEquals("hours", unsupportedDurationField1.getName());
      assertEquals(false, unsupportedDurationField1.isSupported());
      assertEquals("minutes", durationFieldType0.toString());
      assertEquals("minutes", durationFieldType0.getName());
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("days", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      assertNotNull(unsupportedDurationField0);
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) unsupportedDurationField0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("days", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      assertTrue(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      assertEquals("weekyears", durationFieldType0.toString());
      assertEquals("weekyears", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("weekyears", durationFieldType0.toString());
      assertEquals("weekyears", durationFieldType0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("weekyears", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertNotNull(unsupportedDurationField0);
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) durationFieldType0);
      assertEquals("weekyears", durationFieldType0.toString());
      assertEquals("weekyears", durationFieldType0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("weekyears", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertFalse(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      assertEquals("weekyears", durationFieldType0.toString());
      assertEquals("weekyears", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("weekyears", unsupportedDurationField0.getName());
      assertEquals("weekyears", durationFieldType0.toString());
      assertEquals("weekyears", durationFieldType0.getName());
      assertNotNull(unsupportedDurationField0);
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      assertNotNull(buddhistChronology0);
      
      StrictChronology strictChronology0 = StrictChronology.getInstance((Chronology) buddhistChronology0);
      assertNotNull(strictChronology0);
      
      DurationField durationField0 = strictChronology0.centuries();
      assertEquals(false, durationField0.isPrecise());
      assertEquals(true, durationField0.isSupported());
      assertEquals("centuries", durationField0.getName());
      assertNotNull(durationField0);
      
      int int0 = unsupportedDurationField0.compareTo(durationField0);
      assertEquals(false, durationField0.isPrecise());
      assertEquals(true, durationField0.isSupported());
      assertEquals("centuries", durationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("weekyears", unsupportedDurationField0.getName());
      assertEquals("weekyears", durationFieldType0.toString());
      assertEquals("weekyears", durationFieldType0.getName());
      assertEquals(1, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("weeks", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertNotNull(unsupportedDurationField0);
      
      UnsupportedDurationField unsupportedDurationField1 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertSame(unsupportedDurationField1, unsupportedDurationField0);
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals(false, unsupportedDurationField1.isSupported());
      assertEquals("weeks", unsupportedDurationField1.getName());
      assertEquals(true, unsupportedDurationField1.isPrecise());
      assertEquals(0L, unsupportedDurationField1.getUnitMillis());
      assertNotNull(unsupportedDurationField1);
  }

  @Test
  public void test05()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      assertEquals("weekyears", durationFieldType0.getName());
      assertEquals("weekyears", durationFieldType0.toString());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("weekyears", durationFieldType0.getName());
      assertEquals("weekyears", durationFieldType0.toString());
      assertEquals("weekyears", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertNotNull(unsupportedDurationField0);
      
      int int0 = unsupportedDurationField0.compareTo((DurationField) unsupportedDurationField0);
      assertEquals("weekyears", durationFieldType0.getName());
      assertEquals("weekyears", durationFieldType0.toString());
      assertEquals("weekyears", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(0, int0);
      
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getMillis(int0, (long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // weekyears field is unsupported
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("days", unsupportedDurationField0.getName());
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      assertNotNull(unsupportedDurationField0);
      
      boolean boolean0 = unsupportedDurationField0.isPrecise();
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("days", unsupportedDurationField0.getName());
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      assertTrue(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      assertEquals("millis", durationFieldType0.toString());
      assertEquals("millis", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("millis", durationFieldType0.toString());
      assertEquals("millis", durationFieldType0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("millis", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertNotNull(unsupportedDurationField0);
      
      long long0 = 4937L;
      // Undeclared exception!
      try {
        int int0 = unsupportedDurationField0.getDifference(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // millis field is unsupported
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertNotNull(unsupportedDurationField0);
      
      int int0 = (-11);
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getMillis(int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // seconds field is unsupported
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      long long0 = 2635L;
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals("weeks", durationFieldType0.toString());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertNotNull(unsupportedDurationField0);
      
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getMillis(long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // weeks field is unsupported
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      assertEquals("months", durationFieldType0.toString());
      assertEquals("months", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("months", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("months", durationFieldType0.toString());
      assertEquals("months", durationFieldType0.getName());
      assertNotNull(unsupportedDurationField0);
      
      long long0 = (-2795L);
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getValueAsLong(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // months field is unsupported
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      assertEquals("months", durationFieldType0.getName());
      assertEquals("months", durationFieldType0.toString());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("months", durationFieldType0.getName());
      assertEquals("months", durationFieldType0.toString());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("months", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertNotNull(unsupportedDurationField0);
      
      long long0 = 832L;
      int int0 = (-2);
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.subtract(long0, int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // months field is unsupported
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("days", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      assertNotNull(unsupportedDurationField0);
      
      long long0 = unsupportedDurationField0.getUnitMillis();
      assertEquals("days", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      assertEquals(0L, long0);
  }

  @Test
  public void test13()  throws Throwable  {
      long long0 = 1264L;
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      assertEquals("minutes", durationFieldType0.getName());
      assertEquals("minutes", durationFieldType0.toString());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("minutes", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("minutes", durationFieldType0.getName());
      assertEquals("minutes", durationFieldType0.toString());
      assertNotNull(unsupportedDurationField0);
      
      // Undeclared exception!
      try {
        int int0 = unsupportedDurationField0.getValue(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // minutes field is unsupported
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("days", unsupportedDurationField0.getName());
      assertNotNull(unsupportedDurationField0);
      
      long long0 = (-849L);
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.add(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // days field is unsupported
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      long long0 = 2373L;
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      assertEquals("minutes", durationFieldType0.toString());
      assertEquals("minutes", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("minutes", durationFieldType0.toString());
      assertEquals("minutes", durationFieldType0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("minutes", unsupportedDurationField0.getName());
      assertNotNull(unsupportedDurationField0);
      
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getValueAsLong(long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // minutes field is unsupported
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertNotNull(unsupportedDurationField0);
      
      int int0 = unsupportedDurationField0.hashCode();
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals(1970096767, int0);
      
      // Undeclared exception!
      try {
        int int1 = unsupportedDurationField0.getValue((long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // seconds field is unsupported
         //
      }
  }

  @Test
  public void test17() {}
//   @Test
//   public void test17()  throws Throwable  {
//       DurationFieldType durationFieldType0 = DurationFieldType.days();
//       assertEquals("days", durationFieldType0.getName());
//       assertEquals("days", durationFieldType0.toString());
//       assertNotNull(durationFieldType0);
//       
//       UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
//       assertEquals(false, unsupportedDurationField0.isSupported());
//       assertEquals(0L, unsupportedDurationField0.getUnitMillis());
//       assertEquals("days", unsupportedDurationField0.getName());
//       assertEquals(true, unsupportedDurationField0.isPrecise());
//       assertEquals("days", durationFieldType0.getName());
//       assertEquals("days", durationFieldType0.toString());
//       assertNotNull(unsupportedDurationField0);
//       
//       DurationFieldType durationFieldType1 = unsupportedDurationField0.getType();
//       assertSame(durationFieldType0, durationFieldType1);
//       assertSame(durationFieldType1, durationFieldType0);
//       assertEquals(false, unsupportedDurationField0.isSupported());
//       assertEquals(0L, unsupportedDurationField0.getUnitMillis());
//       assertEquals("days", unsupportedDurationField0.getName());
//       assertEquals(true, unsupportedDurationField0.isPrecise());
//       assertEquals("days", durationFieldType0.getName());
//       assertEquals("days", durationFieldType0.toString());
//       assertEquals("days", durationFieldType1.getName());
//       assertEquals("days", durationFieldType1.toString());
//       assertNotNull(durationFieldType1);
//   }

  @Test
  public void test18()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("days", unsupportedDurationField0.getName());
      assertNotNull(unsupportedDurationField0);
      
      int int0 = 10209370;
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getMillis((long) int0, (long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // days field is unsupported
         //
      }
  }

  @Test
  public void test19()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("days", unsupportedDurationField0.getName());
      assertNotNull(unsupportedDurationField0);
      
      String string0 = unsupportedDurationField0.toString();
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("days", unsupportedDurationField0.getName());
      assertNotNull(string0);
      assertEquals("UnsupportedDurationField[days]", string0);
  }

  @Test
  public void test20()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      assertEquals("halfdays", durationFieldType0.toString());
      assertEquals("halfdays", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("halfdays", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("halfdays", durationFieldType0.toString());
      assertEquals("halfdays", durationFieldType0.getName());
      assertNotNull(unsupportedDurationField0);
      
      long long0 = (-48L);
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getDifferenceAsLong(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // halfdays field is unsupported
         //
      }
  }
}