/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:17:33 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.mooctest.Weighted;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Weighted_ESTest extends Weighted_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Weighted<String> weighted0 = Weighted.weighted("0f\"w)", 965.5418077);
      int int0 = weighted0.compareTo(weighted0);
      assertEquals(0, int0);
      assertEquals(965.5418077, weighted0.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Weighted<Object> weighted0 = Weighted.weighted((Object) "#.*,L&mkl[ZVP|NU1", (-2824.519230994627));
      Weighted<Object> weighted1 = Weighted.weighted((Object) "#.*,L&mkl[ZVP|NU1", (-1871.708826));
      int int0 = weighted0.compareTo(weighted1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weighted<Object> weighted0 = new Weighted<Object>("", 0.0);
      Weighted<Object> weighted1 = new Weighted<Object>(weighted0, 0.0);
      int int0 = weighted1.compareTo(weighted0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weighted.weighted((Integer) null, (-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Weighted<Object> weighted0 = null;
      try {
        weighted0 = new Weighted<Object>((Object) null, (-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weighted<Object> weighted0 = Weighted.weighted((Object) "#.*,L&mkl[ZVP|NU1", (-2824.519230994627));
      Weighted<Object> weighted1 = Weighted.weighted((Object) "#.*,L&mkl[ZVP|NU1", (-1871.708826));
      boolean boolean0 = weighted0.equals(weighted1);
      assertFalse(boolean0);
      assertEquals((-1871.708826), weighted1.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(35);
      Weighted<Integer> weighted0 = Weighted.weighted(integer0, (double) 35);
      Weighted<Object> weighted1 = Weighted.weighted((Object) weighted0, 35.0);
      boolean boolean0 = weighted1.equals(weighted0);
      assertEquals(35.0, weighted1.weight, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weighted<String> weighted0 = Weighted.weighted("", 0.0);
      boolean boolean0 = weighted0.equals("");
      assertFalse(boolean0);
      assertEquals(0.0, weighted0.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weighted<Object> weighted0 = Weighted.weighted((Object) "#.*,L&mkl[ZVP|NU1", (-2824.519230994627));
      boolean boolean0 = weighted0.equals(weighted0);
      assertEquals((-2824.519230994627), weighted0.weight, 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weighted<Object> weighted0 = new Weighted<Object>("", 0.0);
      String string0 = weighted0.toString();
      assertEquals("Weighted{val=, weight=0.0}", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Weighted<Object> weighted0 = Weighted.weighted((Object) "#.*,L&mkl[ZVP|NU1", (-2824.519230994627));
      weighted0.hashCode();
      assertEquals((-2824.519230994627), weighted0.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Weighted<Object> weighted0 = Weighted.weighted((Object) integer0, (double) (-1));
      // Undeclared exception!
      try { 
        weighted0.compareTo((Weighted<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Weighted", e);
      }
  }
}