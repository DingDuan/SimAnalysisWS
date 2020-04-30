/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 13:25:34 GMT+08:00 2019
 */

package net.mooctest;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.fail;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class DenseWeightedGraph_ESTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[3][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>(0);
      Integer integer0 = new Integer(0);
      linkedHashSet0.add(integer0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>(linkedHashSet0);
      double[][] doubleArray0 = new double[0][4];
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Object>) linkedList0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[5][9];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 0.627783203125;
      doubleArray0[0] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
      assertEquals(0.627783203125, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[3][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 
        denseWeightedGraph0.getWeightOf(integer0, integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TreeSet<Weighted<Object>> treeSet0 = new TreeSet<Weighted<Object>>();
      Weighted<Object> weighted0 = new Weighted<Object>(treeSet0, 0.0);
      treeSet0.add(weighted0);
      double[][] doubleArray0 = new double[1][2];
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Weighted<Object>>) treeSet0, doubleArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayDeque<Integer> arrayDeque0 = new ArrayDeque<Integer>();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>(arrayDeque0);
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Integer>) arrayList0, (double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[5][1];
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<String>) null, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[3][0];
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      Integer integer0 = new Integer(0);
      Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, 0.0);
      SortedSet<Object> sortedSet0 = treeSet0.tailSet((Object) weighted0);
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      treeSet0.add(locale_Category0);
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Object>) sortedSet0, doubleArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Locale$Category cannot be cast to net.mooctest.Weighted
         //
         verifyException("net.mooctest.Weighted", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[5][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[2][0];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        denseWeightedGraph0.getIncomingEdges(integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      double[][] doubleArray0 = new double[0][7];
      DenseWeightedGraph<String> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<String>) priorityQueue0, doubleArray0);
      Collection<Weighted<Edge<String>>> collection0 = denseWeightedGraph0.getIncomingEdges("");
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[3][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(3);
      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer1);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      double[][] doubleArray0 = new double[0][7];
      DenseWeightedGraph<String> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<String>) priorityQueue0, doubleArray0);
      double double0 = denseWeightedGraph0.getWeightOf("", "");
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Collection<Integer> collection0 = denseWeightedGraph0.getNodes();
      DenseWeightedGraph<Integer> denseWeightedGraph1 = DenseWeightedGraph.from((Iterable<Integer>) collection0, doubleArray0);
      assertNotSame(denseWeightedGraph0, denseWeightedGraph1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      ArrayDeque<ArrayList<Object>> arrayDeque0 = new ArrayDeque<ArrayList<Object>>();
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<ArrayList<Object>>) arrayDeque0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }
}
