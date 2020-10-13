/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 13:39:36 GMT+08:00 2019
 */

package net.mooctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

public class PairTest_{

  @Test(timeout = 4000)
  public void test_E0()  throws Throwable  {
      Object object0 = new Object();
      Pair<Object, String> pair0 = new Pair<Object, String>(object0, "");
      boolean boolean0 = pair0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_E1()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Pair<Integer, String> pair0 = new Pair<Integer, String>(integer0, (String) null);
      boolean boolean0 = pair0.equals(pair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_E2()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Pair<Integer, String> pair0 = new Pair<Integer, String>(integer0, (String) null);
      Pair<String, Object> pair1 = Pair.of((String) null, (Object) pair0);
      boolean boolean0 = pair1.equals(pair0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_E3()  throws Throwable  {
      Pair<Object, String> pair0 = Pair.of((Object) "", "");
      Pair<Object, Object> pair1 = new Pair<Object, Object>("", pair0);
      boolean boolean0 = pair1.equals(pair0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_E4()  throws Throwable  {
      Pair<Object, String> pair0 = Pair.of((Object) "", "");
      pair0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_E5()  throws Throwable  {
      Pair<Object, String> pair0 = Pair.of((Object) "", "");
      String string0 = pair0.toString();
      assertEquals("Pair{first=, second=}", string0);
  }
}