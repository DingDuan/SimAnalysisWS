/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:44:31 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Vector;
import net.mooctest.DenseWeightedGraph;
import net.mooctest.Edge;
import net.mooctest.SparseWeightedGraph;
import net.mooctest.Weighted;
import net.mooctest.WeightedGraph;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class WeightedGraphTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PriorityQueue<Weighted<Edge<Locale.FilteringMode>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Locale.FilteringMode>>>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      Edge<Locale.FilteringMode> edge0 = new Edge<Locale.FilteringMode>(locale_FilteringMode0, locale_FilteringMode0);
      Weighted<Edge<Locale.FilteringMode>> weighted0 = new Weighted<Edge<Locale.FilteringMode>>(edge0, 0.0);
      priorityQueue0.add(weighted0);
      SparseWeightedGraph<Locale.FilteringMode> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.FilteringMode>>>) priorityQueue0);
      double double0 = sparseWeightedGraph0.getWeightOf(locale_FilteringMode0, locale_FilteringMode0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1733.5121402;
      doubleArray0[0] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
      assertEquals(1733.5121402, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = new Locale("TLPEYBLg!2=@4|F");
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Vector<Weighted<Edge<String>>> vector0 = new Vector<Weighted<Edge<String>>>(0, 0);
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) set0, (Iterable<Weighted<Edge<String>>>) vector0);
      double double0 = sparseWeightedGraph0.getWeightOf("f!", "f!");
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      ArrayDeque<Weighted<Edge<Object>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Object>>>();
      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) vector0, (Iterable<Weighted<Edge<Object>>>) arrayDeque0);
      Collection<Object> collection0 = sparseWeightedGraph0.getNodes();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Weighted<Edge<Edge<String>>>> linkedList0 = new LinkedList<Weighted<Edge<Edge<String>>>>();
      SparseWeightedGraph<Edge<String>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Edge<String>>>>) linkedList0);
      Edge<String> edge0 = new Edge<String>("QC", "QC");
      Collection<Weighted<Edge<Edge<String>>>> collection0 = sparseWeightedGraph0.getIncomingEdges(edge0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[2][1];
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
  public void test6()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[1] = doubleArray1;
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
  public void test7()  throws Throwable  {
      double[][] doubleArray0 = new double[4][7];
      double[] doubleArray1 = new double[0];
      doubleArray0[3] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      // Undeclared exception!
      try { 
        denseWeightedGraph0.filterEdges((Predicate<Edge<Integer>>) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PriorityQueue<Weighted<Edge<Locale.FilteringMode>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Locale.FilteringMode>>>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      Locale.FilteringMode locale_FilteringMode1 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      Edge<Locale.FilteringMode> edge0 = new Edge<Locale.FilteringMode>(locale_FilteringMode0, locale_FilteringMode1);
      Weighted<Edge<Locale.FilteringMode>> weighted0 = new Weighted<Edge<Locale.FilteringMode>>(edge0, (-862.0));
      priorityQueue0.add(weighted0);
      SparseWeightedGraph<Locale.FilteringMode> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.FilteringMode>>>) priorityQueue0);
      // Undeclared exception!
      try { 
        sparseWeightedGraph0.filterEdges((Predicate<Edge<Locale.FilteringMode>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.WeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LinkedHashSet<Locale.FilteringMode> linkedHashSet0 = new LinkedHashSet<Locale.FilteringMode>();
      ArrayList<Weighted<Edge<Locale.FilteringMode>>> arrayList0 = new ArrayList<Weighted<Edge<Locale.FilteringMode>>>();
      SparseWeightedGraph<Locale.FilteringMode> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.FilteringMode>) linkedHashSet0, (Iterable<Weighted<Edge<Locale.FilteringMode>>>) arrayList0);
      WeightedGraph<Locale.FilteringMode> weightedGraph0 = sparseWeightedGraph0.filterEdges((Predicate<Edge<Locale.FilteringMode>>) null);
      assertNotNull(weightedGraph0);
  }
}
