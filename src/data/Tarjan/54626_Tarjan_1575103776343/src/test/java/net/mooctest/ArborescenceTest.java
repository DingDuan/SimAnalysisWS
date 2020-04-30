/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 13:23:19 GMT+08:00 2019
 */

package net.mooctest;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.AbstractMap;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ArborescenceTest{

  @Test(timeout = 4000)
  public void test_E00()  throws Throwable  {
      Arborescence<Object> arborescence0 = Arborescence.empty();
      ImmutableMap<Arborescence<Object>, Arborescence<Object>> immutableMap0 = ImmutableMap.of(arborescence0, arborescence0);
      Arborescence<Arborescence<Object>> arborescence1 = Arborescence.of(immutableMap0);
      Arborescence<Arborescence<Object>> arborescence2 = Arborescence.empty();
      boolean boolean0 = arborescence2.equals(arborescence1);
      assertFalse(arborescence1.equals((Object)arborescence2));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_E01()  throws Throwable  {
      Arborescence<Object> arborescence0 = Arborescence.of((ImmutableMap<Object, Object>) null);
      // Undeclared exception!
      try { 
        arborescence0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Arborescence", e);
      }
  }

  @Test(timeout = 4000)
  public void test_E02()  throws Throwable  {
      Arborescence<String> arborescence0 = Arborescence.empty();
      Arborescence<Integer> arborescence1 = Arborescence.of((ImmutableMap<Integer, Integer>) null);
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
  public void test_E03()  throws Throwable  {
      Arborescence<Arborescence<String>> arborescence0 = Arborescence.empty();
      // Undeclared exception!
      try { 
        arborescence0.contains((Edge<Arborescence<String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Arborescence", e);
      }
  }

  @Test(timeout = 4000)
  public void test_E04()  throws Throwable  {
      Arborescence<Object> arborescence0 = Arborescence.empty();
      Arborescence<Comparable<Object>> arborescence1 = Arborescence.empty();
      boolean boolean0 = arborescence0.equals(arborescence1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_E05()  throws Throwable  {
      Arborescence<Object> arborescence0 = Arborescence.empty();
      Arborescence<Object> arborescence1 = Arborescence.empty();
      ImmutableMap<Arborescence<Object>, Arborescence<Object>> immutableMap0 = ImmutableMap.of(arborescence0, arborescence1);
      Arborescence<Arborescence<Object>> arborescence2 = Arborescence.of(immutableMap0);
      Edge<Arborescence<Object>> edge0 = new Edge<Arborescence<Object>>(arborescence0, arborescence0);
      boolean boolean0 = arborescence2.contains(edge0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_E06()  throws Throwable  {
      Arborescence<Object> arborescence0 = Arborescence.empty();
      Arborescence<AbstractMap.SimpleEntry<Integer, Object>> arborescence1 = Arborescence.empty();
      ImmutableMap<Arborescence<Object>, Arborescence<Object>> immutableMap0 = ImmutableMap.of(arborescence0, arborescence0);
      Arborescence<Arborescence<Object>> arborescence2 = Arborescence.of(immutableMap0);
      boolean boolean0 = arborescence2.equals(arborescence1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_E07()  throws Throwable  {
      Arborescence<Object> arborescence0 = Arborescence.empty();
      ImmutableMap<Arborescence<Object>, Arborescence<Object>> immutableMap0 = ImmutableMap.of(arborescence0, arborescence0);
      Arborescence<Arborescence<Object>> arborescence1 = Arborescence.of(immutableMap0);
      boolean boolean0 = arborescence1.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_E08()  throws Throwable  {
      Arborescence<Object> arborescence0 = Arborescence.empty();
      ImmutableMap<Arborescence<Object>, Arborescence<Object>> immutableMap0 = ImmutableMap.of(arborescence0, arborescence0);
      Integer integer0 = new Integer(0);
      boolean boolean0 = immutableMap0.containsValue(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_E09()  throws Throwable  {
      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "", "U", "");
      Arborescence<String> arborescence0 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
      String string0 = arborescence0.toString();
      assertEquals("Arborescence{ -> ,  -> U}", string0);
  }

  @Test(timeout = 4000)
  public void test_E10()  throws Throwable  {
      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "", "Umy%:yK{(2un?^7", "");
      Arborescence<String> arborescence0 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
      Edge<String> edge0 = new Edge<String>("U", "Umy%:yK{(2un?^7");
      boolean boolean0 = arborescence0.contains(edge0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_E11()  throws Throwable  {
      Arborescence<Comparable<String>> arborescence0 = Arborescence.empty();
      Edge<Comparable<String>> edge0 = new Edge<Comparable<String>>((Comparable<String>) null, (Comparable<String>) null);
      boolean boolean0 = arborescence0.contains(edge0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_E12()  throws Throwable  {
      Arborescence<Object> arborescence0 = Arborescence.empty();
      arborescence0.hashCode();
  }
}
