/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:57:03 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import java.util.LinkedHashSet;
import java.util.Set;
import net.mooctest.Edge;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Edge_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Edge<String> edge0 = new Edge<String>("e&FV?XvvBW(", "YX3/TW{b5");
      boolean boolean0 = edge0.equals(edge0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-795));
      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer1);
      String string0 = edge0.toString();
      assertEquals("Edge{source=0, destination=-795}", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-795));
      Edge.EdgeBuilder<Integer> edge_EdgeBuilder0 = Edge.from(integer0);
      Edge<Integer> edge0 = edge_EdgeBuilder0.to(integer1);
      assertNotNull(edge0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Edge.EdgeBuilder<Integer> edge_EdgeBuilder0 = Edge.from((Integer) null);
      Edge<Object> edge0 = new Edge<Object>((Object) null, edge_EdgeBuilder0);
      edge0.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Edge.competesWith((Set<Edge<String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Edge", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashSet<Edge<Edge<Integer>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<Integer>>>();
      Edge<Edge<Integer>> edge0 = new Edge<Edge<Integer>>((Edge<Integer>) null, (Edge<Integer>) null);
      linkedHashSet0.add(edge0);
      // Undeclared exception!
      try { 
        Edge.competesWith((Set<Edge<Edge<Integer>>>) linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null key in entry: null=null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      Edge<Integer> edge0 = new Edge<Integer>(integer1, integer0);
      linkedHashSet0.add(edge0);
      Edge<Integer> edge1 = new Edge<Integer>(integer0, integer0);
      linkedHashSet0.add(edge1);
      // Undeclared exception!
      try { 
        Edge.competesWith((Set<Edge<Integer>>) linkedHashSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: 0
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
      Edge<String> edge0 = new Edge<String>("", "");
      linkedHashSet0.add(edge0);
      Predicate<Edge<String>> predicate0 = Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Edge<String> edge0 = new Edge<String>((String) null, "");
      Edge<Object> edge1 = new Edge<Object>((Object) null, (Object) null);
      boolean boolean0 = edge0.equals(edge1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer(1299);
      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
      Integer integer1 = new Integer(2);
      Edge<Integer> edge1 = new Edge<Integer>(integer1, integer1);
      boolean boolean0 = edge0.equals(edge1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Edge<String> edge0 = new Edge<String>("", (String) null);
      boolean boolean0 = edge0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Predicate<Edge<String>> predicate0 = Edge.isAutoCycle();
      Integer integer0 = new Integer(0);
      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
      boolean boolean0 = edge0.equals(predicate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashSet<Edge<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<String>>>();
      Predicate<Edge<Edge<String>>> predicate0 = Edge.isIn((Set<Edge<Edge<String>>>) linkedHashSet0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Edge<Object> edge0 = new Edge<Object>((Object) null, (Object) null);
      Predicate<Edge<Edge<Object>>> predicate0 = Edge.hasDestination(edge0);
      assertNotNull(predicate0);
  }
  
  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Edge<String> edge0 = new Edge<String>("1", "2");
      Predicate<Edge<Edge<String>>> predicate0 = Edge.hasDestination(edge0);
      String string1 = new String("2");
      //predicate0.apply(null);
      //predicate0.apply(string1);
  }
}
