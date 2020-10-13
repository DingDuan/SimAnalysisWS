/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 06:36:58 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;
import net.mooctest.DenseWeightedGraph;
import net.mooctest.Edge;
import net.mooctest.Weighted;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

public class DenseWeightedGraph_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      double[][] doubleArray0 = new double[1][9];
      linkedHashSet0.add((String) null);
      linkedHashSet0.add("!M0r>Qu}");
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<String>) linkedHashSet0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[8][0];
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
  public void test02()  throws Throwable  {
      LinkedList<Weighted<Object>> linkedList0 = new LinkedList<Weighted<Object>>();
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Weighted<Object>>) linkedList0, (double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[0][4];
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Locale.LanguageRange>) null, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<Locale.FilteringMode> priorityQueue0 = new PriorityQueue<Locale.FilteringMode>(comparator0);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      priorityQueue0.add(locale_FilteringMode0);
      ArrayDeque<Locale.FilteringMode> arrayDeque0 = new ArrayDeque<Locale.FilteringMode>(priorityQueue0);
      DenseWeightedGraph<Locale.FilteringMode> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.FilteringMode>) arrayDeque0, doubleArray0);
      assertNotNull(denseWeightedGraph0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PriorityQueue<Weighted<Locale.FilteringMode>> priorityQueue0 = new PriorityQueue<Weighted<Locale.FilteringMode>>();
      double[][] doubleArray0 = new double[0][4];
      DenseWeightedGraph<Weighted<Locale.FilteringMode>> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Weighted<Locale.FilteringMode>>) priorityQueue0, doubleArray0);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      Weighted<Locale.FilteringMode> weighted0 = Weighted.weighted(locale_FilteringMode0, 6010.0);
      Collection<Weighted<Edge<Weighted<Locale.FilteringMode>>>> collection0 = denseWeightedGraph0.getIncomingEdges(weighted0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[3][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      double double0 = denseWeightedGraph0.getWeightOf(integer0, (Integer) null);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[3][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>((SortedSet<? extends String>) treeSet0);
      double[][] doubleArray0 = new double[0][2];
      DenseWeightedGraph<String> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<String>) priorityQueue0, doubleArray0);
      double double0 = denseWeightedGraph0.getWeightOf("[kZ|", "net.mooctest.DenseWeightedGraph");
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<Weighted<Object>> treeSet0 = new TreeSet<Weighted<Object>>(comparator0);
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Weighted<Object>>) treeSet0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[0][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Collection<Integer> collection0 = denseWeightedGraph0.getNodes();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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