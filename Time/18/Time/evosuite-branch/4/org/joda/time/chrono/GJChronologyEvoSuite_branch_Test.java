/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:20:06 GMT 2014
 */

package org.joda.time.chrono;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.TimeOfDay;
import org.joda.time.Weeks;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class GJChronologyEvoSuite_branch_Test extends GJChronologyEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      long long0 = 0L;
      long long1 = gJChronology0.julianToGregorianByYear(long0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertEquals((-1123200000L), long1);
      
      Months months0 = Months.TEN;
      assertEquals(1, months0.size());
      assertNotNull(months0);
      
      int int0 = 102;
      long long2 = gJChronology0.add((ReadablePeriod) months0, long1, int0);
      assertEquals(1, months0.size());
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      assertFalse(long1 == long2);
      assertFalse(long1 == long0);
      assertFalse(long2 == long1);
      assertFalse(long2 == long0);
      assertEquals(2681251200000L, long2);
  }

  @Test
  public void test01()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertNotNull(gJChronology0);
      
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) gJChronology0);
      assertEquals(3, yearMonthDay0.size());
      assertNotNull(yearMonthDay0);
      
      int int0 = (-2881);
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusYears(int0);
      assertEquals(3, yearMonthDay1.size());
      assertEquals(3, yearMonthDay0.size());
      assertFalse(yearMonthDay1.equals((Object)yearMonthDay0));
      assertFalse(yearMonthDay0.equals((Object)yearMonthDay1));
      assertNotNull(yearMonthDay1);
      assertNotSame(yearMonthDay1, yearMonthDay0);
      assertNotSame(yearMonthDay0, yearMonthDay1);
  }

  @Test
  public void test02()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertNotNull(gJChronology0);
      
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) gJChronology0);
      assertEquals(3, yearMonthDay0.size());
      assertNotNull(yearMonthDay0);
      
      int int0 = (-2881);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withYear(int0);
      assertEquals(3, yearMonthDay1.size());
      assertEquals(3, yearMonthDay0.size());
      assertFalse(yearMonthDay1.equals((Object)yearMonthDay0));
      assertFalse(yearMonthDay0.equals((Object)yearMonthDay1));
      assertNotNull(yearMonthDay1);
      assertNotSame(yearMonthDay1, yearMonthDay0);
      assertNotSame(yearMonthDay0, yearMonthDay1);
      
      YearMonthDay yearMonthDay2 = yearMonthDay1.plusMonths(int0);
      assertEquals(3, yearMonthDay1.size());
      assertEquals(3, yearMonthDay0.size());
      assertEquals(3, yearMonthDay2.size());
      assertFalse(yearMonthDay1.equals((Object)yearMonthDay0));
      assertFalse(yearMonthDay1.equals((Object)yearMonthDay2));
      assertFalse(yearMonthDay0.equals((Object)yearMonthDay1));
      assertFalse(yearMonthDay0.equals((Object)yearMonthDay2));
      assertFalse(yearMonthDay2.equals((Object)yearMonthDay1));
      assertFalse(yearMonthDay2.equals((Object)yearMonthDay0));
      assertNotNull(yearMonthDay2);
      assertNotSame(yearMonthDay1, yearMonthDay0);
      assertNotSame(yearMonthDay1, yearMonthDay2);
      assertNotSame(yearMonthDay0, yearMonthDay1);
      assertNotSame(yearMonthDay0, yearMonthDay2);
      assertNotSame(yearMonthDay2, yearMonthDay1);
      assertNotSame(yearMonthDay2, yearMonthDay0);
  }

  @Test
  public void test03()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      Weeks weeks0 = Weeks.ONE;
      assertEquals(1, weeks0.size());
      assertNotNull(weeks0);
      
      Period period0 = weeks0.toPeriod();
      assertEquals(1, weeks0.size());
      assertNotNull(period0);
      
      int int0 = 48;
      long long0 = (-12219292800013L);
      int[] intArray0 = gJChronology0.get((ReadablePeriod) period0, (long) int0, long0);
      assertEquals(1, weeks0.size());
      assertArrayEquals(new int[] {(-387), (-2), (-2), (-3), 0, 0, 0, (-61)}, intArray0);
      assertNotNull(intArray0);
  }

  @Test
  public void test04()  throws Throwable  {
      long long0 = (-12219292800000L);
      System.setCurrentTimeMillis(long0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertNotNull(gJChronology0);
      
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) gJChronology0);
      assertEquals(3, yearMonthDay0.size());
      assertNotNull(yearMonthDay0);
      
      int int0 = (-2881);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withYear(int0);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(3, yearMonthDay1.size());
      assertFalse(yearMonthDay0.equals((Object)yearMonthDay1));
      assertFalse(yearMonthDay1.equals((Object)yearMonthDay0));
      assertNotNull(yearMonthDay1);
      assertNotSame(yearMonthDay0, yearMonthDay1);
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test
  public void test05()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(cachedDateTimeZone0);
      
      int int0 = 3;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) cachedDateTimeZone0, (long) int0, int0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(gJChronology0);
      
      String string0 = gJChronology0.toString();
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("GJChronology[Europe/London,cutover=1970-01-01T00:00:00.003Z,mdfw=3]", string0);
      assertNotNull(string0);
  }

  @Test
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      assertNotNull(buddhistChronology0);
      
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)buddhistChronology0.getZone();
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(cachedDateTimeZone0);
      
      long long0 = 0L;
      DateTime dateTime0 = new DateTime(long0, (Chronology) buddhistChronology0);
      assertEquals(0L, dateTime0.getMillis());
      assertNotNull(dateTime0);
      
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) cachedDateTimeZone0, (ReadableInstant) dateTime0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(0L, dateTime0.getMillis());
      assertNotNull(gJChronology0);
      
      String string0 = gJChronology0.toString();
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(0L, dateTime0.getMillis());
      assertEquals("GJChronology[Europe/London,cutover=1970-01-01]", string0);
      assertNotNull(string0);
  }

  @Test
  public void test07()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertNotNull(fixedDateTimeZone0);
      
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertNotNull(gJChronology0);
      
      String string0 = gJChronology0.toString();
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("GJChronology[UTC]", string0);
      assertNotNull(string0);
  }

  @Test
  public void test08()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertNotNull(gJChronology0);
      
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) gJChronology0);
      assertEquals(3, yearMonthDay0.size());
      assertNotNull(yearMonthDay0);
      
      int int0 = (-2881);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withYear(int0);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(3, yearMonthDay1.size());
      assertFalse(yearMonthDay0.equals((Object)yearMonthDay1));
      assertFalse(yearMonthDay1.equals((Object)yearMonthDay0));
      assertNotNull(yearMonthDay1);
      assertNotSame(yearMonthDay0, yearMonthDay1);
      assertNotSame(yearMonthDay1, yearMonthDay0);
      
      DateMidnight dateMidnight0 = yearMonthDay1.toDateMidnight();
      assertEquals(3, yearMonthDay0.size());
      assertEquals(3, yearMonthDay1.size());
      assertEquals((-153049478325000L), dateMidnight0.getMillis());
      assertFalse(yearMonthDay0.equals((Object)yearMonthDay1));
      assertFalse(yearMonthDay1.equals((Object)yearMonthDay0));
      assertNotNull(dateMidnight0);
      assertNotSame(yearMonthDay0, yearMonthDay1);
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test
  public void test09()  throws Throwable  {
      Instant instant0 = new Instant();
      assertEquals(1392409281320L, instant0.getMillis());
      assertNotNull(instant0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)instant0.getZone();
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(fixedDateTimeZone0);
      
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(gJChronology0);
      
      int int0 = 2;
      int int1 = 12740619;
      try {
        long long0 = gJChronology0.getDateTimeMillis(int0, int0, int1, int0, int0, int1, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 12740619 for secondOfMinute must be in the range [0,59]
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      int int0 = 2597;
      try {
        long long0 = gJChronology0.getDateTimeMillis(int0, int0, int0, int0, int0, int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2597 for hourOfDay must be in the range [0,23]
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      Chronology chronology0 = gJChronology0.getBase();
      assertNull(chronology0);
      
      LocalDateTime localDateTime0 = new LocalDateTime((Object) chronology0, (Chronology) gJChronology0);
      assertEquals(4, localDateTime0.size());
      assertNotNull(localDateTime0);
  }

  @Test
  public void test12()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertNotNull(cachedDateTimeZone0);
      
      int int0 = 3;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) cachedDateTimeZone0, (long) int0, int0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertNotNull(gJChronology0);
      
      long long0 = gJChronology0.getDateTimeMillis(int0, int0, int0, int0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals((-62067427124997L), long0);
  }

  @Test
  public void test13()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertNotNull(gJChronology0);
      
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) gJChronology0);
      assertEquals(3, yearMonthDay0.size());
      assertNotNull(yearMonthDay0);
      
      DateMidnight dateMidnight0 = yearMonthDay0.toDateMidnight();
      assertEquals(1392336000000L, dateMidnight0.getMillis());
      assertEquals(3, yearMonthDay0.size());
      assertNotNull(dateMidnight0);
  }

  @Test
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = null;
      long long0 = (-12219292800000L);
      int int0 = 1964;
      // Undeclared exception!
      try {
        GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, long0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 1964
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = 1240;
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      long long0 = 1945L;
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0);
      assertNotNull(mutablePeriod0);
      
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
      
      int[] intArray0 = gJChronology0.get((ReadablePeriod) period0, (long) int0, long0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 705}, intArray0);
      assertNotNull(intArray0);
  }

  @Test
  public void test16()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      boolean boolean0 = gJChronology0.equals((Object) gJChronology0);
      assertTrue(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      long long0 = 0L;
      long long1 = gJChronology0.julianToGregorianByYear(long0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertEquals((-1123200000L), long1);
      
      long long2 = gJChronology0.julianToGregorianByWeekyear(long1);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      assertFalse(long1 == long0);
      assertFalse(long1 == long2);
      assertFalse(long2 == long1);
      assertFalse(long2 == long0);
      assertEquals((-2332800000L), long2);
  }

  @Test
  public void test18()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      int int0 = gJChronology0.hashCode();
      assertEquals(302621037, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      assertNotNull(assembledChronology_Fields0);
      
      gJChronology0.assemble(assembledChronology_Fields0);
  }

  @Test
  public void test20()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertNotNull(gJChronology0);
      
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) gJChronology0);
      assertEquals(3, yearMonthDay0.size());
      assertNotNull(yearMonthDay0);
      
      Days days0 = Days.TWO;
      assertEquals(1, days0.size());
      assertNotNull(days0);
      
      YearMonthDay yearMonthDay1 = yearMonthDay0.minus((ReadablePeriod) days0);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(3, yearMonthDay1.size());
      assertEquals(1, days0.size());
      assertFalse(yearMonthDay0.equals((Object)yearMonthDay1));
      assertFalse(yearMonthDay1.equals((Object)yearMonthDay0));
      assertNotNull(yearMonthDay1);
      assertNotSame(yearMonthDay0, yearMonthDay1);
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      assertNotNull(buddhistChronology0);
      
      LenientChronology lenientChronology0 = LenientChronology.getInstance((Chronology) buddhistChronology0);
      assertNotNull(lenientChronology0);
      
      int int0 = 1240;
      MutableDateTime mutableDateTime0 = new MutableDateTime(int0, int0, int0, int0, int0, int0, int0, (Chronology) lenientChronology0);
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals((-36801860283760L), mutableDateTime0.getMillis());
      assertNotNull(mutableDateTime0);
  }

  @Test
  public void test22()  throws Throwable  {
      int int0 = 20;
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      TimeOfDay timeOfDay0 = new TimeOfDay(int0, int0, int0, (Chronology) gJChronology0);
      assertEquals(4, timeOfDay0.size());
      assertNotNull(timeOfDay0);
  }

  @Test
  public void test23()  throws Throwable  {
      String string0 = "BlT]CvUL)7W|{<";
      UTCProvider uTCProvider0 = new UTCProvider();
      assertNotNull(uTCProvider0);
      
      DateTimeZone dateTimeZone0 = uTCProvider0.getZone(string0);
      assertNull(dateTimeZone0);
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      assertNotNull(buddhistChronology0);
      
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) buddhistChronology0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertNotNull(mutableDateTime0);
      
      DateTime dateTime0 = mutableDateTime0.toDateTime(dateTimeZone0);
      assertEquals(1392409281320L, dateTime0.getMillis());
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertNotNull(dateTime0);
      
      int int0 = 194;
      DateTime dateTime1 = dateTime0.withWeekyear(int0);
      assertEquals((-73177011443680L), dateTime1.getMillis());
      assertEquals(1392409281320L, dateTime0.getMillis());
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertFalse(dateTime1.equals((Object)dateTime0));
      assertFalse(dateTime0.equals((Object)dateTime1));
      assertNotNull(dateTime1);
      assertNotSame(dateTime1, dateTime0);
      assertNotSame(dateTime0, dateTime1);
  }
}