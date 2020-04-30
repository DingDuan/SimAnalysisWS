/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 15:22:52 CST 2019
 */

package net.mooctest;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

public class Pair_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Pair<Object, Object> pair0 = new Pair<Object, Object>(integer0, integer0);
      Pair<Integer, Object> pair1 = new Pair<Integer, Object>(integer0, pair0);
      Pair<String, Integer> pair2 = new Pair<String, Integer>("", integer0);
      // Undeclared exception!
      try { 
        pair1.equals(pair2);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Objects
         //
         verifyException("net.mooctest.Pair", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Pair<Object, Integer> pair0 = new Pair<Object, Integer>((Object) null, integer0);
      boolean boolean0 = pair0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pair<Object, String> pair0 = Pair.of((Object) "", "");
      Pair<Object, Pair<Object, String>> pair1 = new Pair<Object, Pair<Object, String>>("", pair0);
      // Undeclared exception!
      try { 
        pair1.equals(pair0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Objects
         //
         verifyException("net.mooctest.Pair", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Pair<Object, Integer> pair0 = new Pair<Object, Integer>((Object) null, integer0);
      // Undeclared exception!
      try { 
        pair0.hashCode();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Objects
         //
         verifyException("net.mooctest.Pair", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Pair<Object, Object> pair0 = new Pair<Object, Object>((Object) null, (Object) null);
      Pair<Pair<Object, Object>, String> pair1 = Pair.of(pair0, (String) null);
      // Undeclared exception!
      try { 
        pair1.toString();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Objects
         //
         verifyException("net.mooctest.Pair", e);
      }
  }
}
