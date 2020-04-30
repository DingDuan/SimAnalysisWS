/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:12:14 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import net.mooctest.Arborescence;
import net.mooctest.Edge;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Arborescence_ESTest extends Arborescence_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Arborescence<Object> arborescence0 = Arborescence.empty();
      // Undeclared exception!
      try { 
        ImmutableMap.of(arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: Arborescence{}
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Arborescence<Integer> arborescence0 = Arborescence.of((ImmutableMap<Integer, Integer>) null);
      Arborescence<Arborescence<String>> arborescence1 = Arborescence.of((ImmutableMap<Arborescence<String>, Arborescence<String>>) null);
      // Undeclared exception!
      try { 
        arborescence1.equals(arborescence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Arborescence", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Arborescence<String> arborescence0 = Arborescence.of((ImmutableMap<String, String>) null);
      boolean boolean0 = arborescence0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ImmutableSortedMap<Integer, Integer> immutableSortedMap0 = ImmutableSortedMap.of();
      Arborescence<Integer> arborescence0 = Arborescence.of((ImmutableMap<Integer, Integer>) immutableSortedMap0);
      Arborescence<String> arborescence1 = Arborescence.empty();
      boolean boolean0 = arborescence1.equals(arborescence0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ImmutableSortedMap<Integer, Integer> immutableSortedMap0 = ImmutableSortedMap.of();
      Arborescence<Integer> arborescence0 = Arborescence.of((ImmutableMap<Integer, Integer>) immutableSortedMap0);
      Object object0 = new Object();
      boolean boolean0 = arborescence0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Integer integer0 = new Integer((-5434));
      ImmutableBiMap<Integer, Integer> immutableBiMap0 = ImmutableBiMap.of(integer0, integer0);
      Arborescence<Integer> arborescence0 = Arborescence.of((ImmutableMap<Integer, Integer>) immutableBiMap0);
      String string0 = arborescence0.toString();
      assertEquals("Arborescence{-5434 -> -5434}", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Arborescence<String> arborescence0 = Arborescence.empty();
      Edge<String> edge0 = new Edge<String>("", "");
      boolean boolean0 = arborescence0.contains(edge0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Arborescence<String> arborescence0 = Arborescence.empty();
      arborescence0.hashCode();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Arborescence<Object> arborescence0 = Arborescence.empty();
      // Undeclared exception!
      try { 
        arborescence0.contains((Edge<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Arborescence", e);
      }
  }
}
