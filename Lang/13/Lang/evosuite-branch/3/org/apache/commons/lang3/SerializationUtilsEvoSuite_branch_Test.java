/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:08:28 GMT 2014
 */

package org.apache.commons.lang3;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.ObjectStreamConstants;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.Serializable;
import java.util.Locale;
import org.apache.commons.lang3.SerializationException;
import org.apache.commons.lang3.SerializationUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SerializationUtilsEvoSuite_branch_Test extends SerializationUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      byte byte0 = ObjectStreamConstants.SC_EXTERNALIZABLE;
      assertEquals((byte)4, byte0);
      
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) byte0);
      assertArrayEquals(new byte[] {(byte) (-84), (byte) (-19), (byte)0, (byte)5, (byte)115, (byte)114, (byte)0, (byte)14, (byte)106, (byte)97, (byte)118, (byte)97, (byte)46, (byte)108, (byte)97, (byte)110, (byte)103, (byte)46, (byte)66, (byte)121, (byte)116, (byte)101, (byte) (-100), (byte)78, (byte)96, (byte) (-124), (byte) (-18), (byte)80, (byte) (-11), (byte)28, (byte)2, (byte)0, (byte)1, (byte)66, (byte)0, (byte)5, (byte)118, (byte)97, (byte)108, (byte)117, (byte)101, (byte)120, (byte)114, (byte)0, (byte)16, (byte)106, (byte)97, (byte)118, (byte)97, (byte)46, (byte)108, (byte)97, (byte)110, (byte)103, (byte)46, (byte)78, (byte)117, (byte)109, (byte)98, (byte)101, (byte)114, (byte) (-122), (byte) (-84), (byte) (-107), (byte)29, (byte)11, (byte) (-108), (byte) (-32), (byte) (-117), (byte)2, (byte)0, (byte)0, (byte)120, (byte)112, (byte)4}, byteArray0);
      assertNotNull(byteArray0);
      
      Byte byte1 = (Byte)SerializationUtils.deserialize(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-84), (byte) (-19), (byte)0, (byte)5, (byte)115, (byte)114, (byte)0, (byte)14, (byte)106, (byte)97, (byte)118, (byte)97, (byte)46, (byte)108, (byte)97, (byte)110, (byte)103, (byte)46, (byte)66, (byte)121, (byte)116, (byte)101, (byte) (-100), (byte)78, (byte)96, (byte) (-124), (byte) (-18), (byte)80, (byte) (-11), (byte)28, (byte)2, (byte)0, (byte)1, (byte)66, (byte)0, (byte)5, (byte)118, (byte)97, (byte)108, (byte)117, (byte)101, (byte)120, (byte)114, (byte)0, (byte)16, (byte)106, (byte)97, (byte)118, (byte)97, (byte)46, (byte)108, (byte)97, (byte)110, (byte)103, (byte)46, (byte)78, (byte)117, (byte)109, (byte)98, (byte)101, (byte)114, (byte) (-122), (byte) (-84), (byte) (-107), (byte)29, (byte)11, (byte) (-108), (byte) (-32), (byte) (-117), (byte)2, (byte)0, (byte)0, (byte)120, (byte)112, (byte)4}, byteArray0);
      assertEquals((byte)4, (byte)byte1);
      assertTrue(byte1.equals((Object)byte0));
  }

  @Test
  public void test1()  throws Throwable  {
      InputStream inputStream0 = null;
      // Undeclared exception!
      try {
        Object object0 = SerializationUtils.deserialize(inputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The InputStream must not be null
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try {
        Object object0 = SerializationUtils.deserialize(byteArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.EOFException
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      assertNotNull(locale0);
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      int int0 = 20;
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) pipedOutputStream0, int0);
      assertNotNull(bufferedOutputStream0);
      
      // Undeclared exception!
      try {
        SerializationUtils.serialize((Serializable) locale0, (OutputStream) bufferedOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      long long0 = (-274L);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      // Undeclared exception!
      try {
        SerializationUtils.serialize((Serializable) long0, (OutputStream) pipedOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      byte byte0 = (byte)34;
      OutputStream outputStream0 = null;
      // Undeclared exception!
      try {
        SerializationUtils.serialize((Serializable) byte0, outputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The OutputStream must not be null
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = null;
      String string1 = SerializationUtils.clone(string0);
      assertNull(string1);
  }

  @Test
  public void test7()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
      assertNotNull(serializationUtils0);
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 512;
      Integer integer0 = new Integer(int0);
      assertEquals(512, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      Integer integer1 = SerializationUtils.clone(integer0);
      assertEquals(512, (int)integer1);
      assertNotSame(integer1, integer0);
      assertNotSame(integer0, integer1);
      assertTrue(integer1.equals((Object)int0));
      assertTrue(integer1.equals((Object)integer0));
      assertTrue(integer0.equals((Object)int0));
      assertTrue(integer0.equals((Object)integer1));
  }
}