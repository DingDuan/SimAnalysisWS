/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 13:42:55 GMT+08:00 2019
 */

package net.mooctest;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class Weighted_ESTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Weighted<String> weighted0 = new Weighted<String>("", 0.0);
      Weighted<String> weighted1 = new Weighted<String>("", 0.6264540424417578);
      int int0 = weighted0.compareTo(weighted1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Weighted<Integer> weighted0 = Weighted.weighted(integer0, 0.0);
      Weighted<Integer> weighted1 = new Weighted<Integer>(integer0, (-0.6538507301078799));
      int int0 = weighted0.compareTo(weighted1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weighted.weighted((Object) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Weighted<Integer> weighted0 = Weighted.weighted(integer0, 0.0);
      // Undeclared exception!
      try { 
        weighted0.compareTo((Weighted<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Weighted", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Weighted<Object> weighted0 = null;
      try {
        weighted0 = new Weighted<Object>((Object) null, 0.0);
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
      Integer integer0 = new Integer(0);
      Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, 0);
      Weighted<Integer> weighted1 = new Weighted<Integer>(integer0, 0.8050911474609375);
      boolean boolean0 = weighted0.equals(weighted1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weighted<Object> weighted0 = Weighted.weighted((Object) "", 0.0);
      Integer integer0 = new Integer(0);
      Weighted<Integer> weighted1 = new Weighted<Integer>(integer0, 0);
      boolean boolean0 = weighted1.equals(weighted0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Weighted<Integer> weighted0 = Weighted.weighted(integer0, 0.0);
      boolean boolean0 = weighted0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weighted<String> weighted0 = new Weighted<String>("", 0.0);
      boolean boolean0 = weighted0.equals(weighted0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weighted<Object> weighted0 = Weighted.weighted((Object) "", 0.0);
      String string0 = weighted0.toString();
      assertEquals("Weighted{val=, weight=0.0}", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Weighted<Integer> weighted0 = Weighted.weighted(integer0, 0.0);
      weighted0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Weighted<String> weighted0 = new Weighted<String>("", 0.0);
      int int0 = weighted0.compareTo(weighted0);
      assertEquals(0, int0);
  }
}
