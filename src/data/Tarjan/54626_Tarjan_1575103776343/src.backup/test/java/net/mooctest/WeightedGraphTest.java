/*
TestFibonacciHeap.javaTestFibonacciHeap.java * This file was automatically generated by EvoSuite
 * Sat Nov 30 13:43:53 GMT+08:00 2019
 */

package net.mooctest;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.TreeSet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.base.Predicate;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class WeightedGraphTest{

  @Test(timeout = 4000)
  public void test_E0()  throws Throwable  {
      HashSet<Weighted<Edge<Locale.FilteringMode>>> hashSet0 = new HashSet<Weighted<Edge<Locale.FilteringMode>>>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      Edge<Locale.FilteringMode> edge0 = new Edge<Locale.FilteringMode>(locale_FilteringMode0, locale_FilteringMode0);
      Weighted<Edge<Locale.FilteringMode>> weighted0 = Weighted.weighted(edge0, 0.0);
      hashSet0.add(weighted0);
      SparseWeightedGraph<Locale.FilteringMode> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.FilteringMode>>>) hashSet0);
      double double0 = sparseWeightedGraph0.getWeightOf(locale_FilteringMode0, locale_FilteringMode0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_E1()  throws Throwable  {
      double[][] doubleArray0 = new double[5][0];
      double[] doubleArray1 = new double[4];
      doubleArray1[1] = 0.35;
      doubleArray0[1] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(1);
      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
      assertEquals(0.35, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_E2()  throws Throwable  {
      Integer integer0 = new Integer(0);
      double[][] doubleArray0 = new double[7][7];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer1 = new Integer(7);
      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer1);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_E3()  throws Throwable  {
      ArrayDeque<Integer> arrayDeque0 = new ArrayDeque<Integer>(0);
      double[][] doubleArray0 = new double[0][3];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Integer>) arrayDeque0, doubleArray0);
      Collection<Integer> collection0 = denseWeightedGraph0.getNodes();
      assertFalse(collection0.contains(0));
  }

  @Test(timeout = 4000)
  public void test_E4()  throws Throwable  {
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      LinkedHashSet<Weighted<Edge<Integer>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<Integer>>>();
      SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Integer>) treeSet0, (Iterable<Weighted<Edge<Integer>>>) linkedHashSet0);
      Integer integer0 = new Integer(0);
      Collection<Weighted<Edge<Integer>>> collection0 = sparseWeightedGraph0.getIncomingEdges(integer0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test_E5()  throws Throwable  {
      double[][] doubleArray0 = new double[4][4];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        denseWeightedGraph0.getWeightOf(integer0, integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test_E6()  throws Throwable  {
      double[][] doubleArray0 = new double[6][2];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 
        denseWeightedGraph0.getIncomingEdges(integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test_E7()  throws Throwable  {
      HashSet<Weighted<Edge<String>>> hashSet0 = new HashSet<Weighted<Edge<String>>>();
      Edge<String> edge0 = new Edge<String>("D 0b", "z");
      Weighted<Edge<String>> weighted0 = Weighted.weighted(edge0, 0.0);
      hashSet0.add(weighted0);
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) hashSet0);
      // Undeclared exception!
      try { 
        sparseWeightedGraph0.filterEdges((Predicate<Edge<String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.WeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test_E8()  throws Throwable  {
      HashSet<Weighted<Edge<String>>> hashSet0 = new HashSet<Weighted<Edge<String>>>();
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) hashSet0);
      WeightedGraph<String> weightedGraph0 = sparseWeightedGraph0.filterEdges((Predicate<Edge<String>>) null);
      assertNotNull(weightedGraph0);
  }
}