/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:18:12 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import net.mooctest.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Pair_ESTest extends Pair_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Pair<Object, Object> pair0 = new Pair<Object, Object>((Object) null, integer0);
      String string0 = pair0.toString();
      assertEquals("Pair{first=null, second=-1}", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Pair<Object, Object> pair0 = new Pair<Object, Object>((Object) null, integer0);
      pair0.hashCode();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Pair<Object, Object> pair0 = new Pair<Object, Object>((Object) null, integer0);
      Pair<Object, String> pair1 = Pair.of((Object) null, "");
      boolean boolean0 = pair1.equals(pair0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer((-51));
      Pair<Integer, Object> pair0 = new Pair<Integer, Object>(integer0, integer0);
      Pair<Object, Integer> pair1 = Pair.of((Object) integer0, integer0);
      boolean boolean0 = pair0.equals(pair1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer((-51));
      Pair<Object, Integer> pair0 = Pair.of((Object) integer0, integer0);
      Pair<String, Object> pair1 = Pair.of(", ", (Object) ", ");
      boolean boolean0 = pair0.equals(pair1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Pair<Integer, Object> pair0 = new Pair<Integer, Object>(integer0, "sednh");
      boolean boolean0 = pair0.equals("sednh");
      assertFalse(boolean0);
  }
}
