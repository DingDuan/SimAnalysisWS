/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:42:36 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Optional;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import net.mooctest.Arborescence;
import net.mooctest.ChuLiuEdmonds;
import net.mooctest.DenseWeightedGraph;
import net.mooctest.Edge;
import net.mooctest.ExclusiveEdge;
import net.mooctest.SparseWeightedGraph;
import net.mooctest.Weighted;
import net.mooctest.WeightedGraph;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

public class ChuLiuEdmondsTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
      LinkedHashSet<Edge<Object>> linkedHashSet1 = new LinkedHashSet<Edge<Object>>();
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) null, (Set<Edge<Object>>) linkedHashSet0, (Set<Edge<Object>>) linkedHashSet1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.ChuLiuEdmonds", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[3][6];
      double[] doubleArray1 = new double[9];
      doubleArray1[1] = 949.16;
      doubleArray0[0] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) linkedHashSet0, (Set<Edge<Integer>>) linkedHashSet0);
      assertEquals(949.16, weighted0.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayDeque<Weighted<Edge<ExclusiveEdge<String>>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<ExclusiveEdge<String>>>>();
      SparseWeightedGraph<ExclusiveEdge<String>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<ExclusiveEdge<String>>>>) arrayDeque0);
      ChuLiuEdmonds.PartialSolution<ExclusiveEdge<String>> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<ExclusiveEdge<String>>) sparseWeightedGraph0);
      // Undeclared exception!
      try { 
        chuLiuEdmonds_PartialSolution0.addEdge((ExclusiveEdge<ExclusiveEdge<String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.ChuLiuEdmonds$PartialSolution", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashSet<Edge<Arborescence<String>>> hashSet0 = new HashSet<Edge<Arborescence<String>>>();
      Edge<Arborescence<String>> edge0 = (Edge<Arborescence<String>>) mock(Edge.class, new ViolatedAssumptionAnswer());
      hashSet0.add(edge0);
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Arborescence<String>>) null, (Set<Edge<Arborescence<String>>>) hashSet0, (Set<Edge<Arborescence<String>>>) hashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null key in entry: null=null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[5][3];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>();
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) treeSet0, (Set<Edge<Integer>>) treeSet0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // net.mooctest.Edge cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[5][3];
      double[] doubleArray1 = new double[0];
      doubleArray0[4] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>();
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) treeSet0, (Set<Edge<Integer>>) treeSet0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Edge<Arborescence<Object>> edge0 = (Edge<Arborescence<Object>>) mock(Edge.class, new ViolatedAssumptionAnswer());
      Weighted<Edge<Arborescence<Object>>> weighted0 = Weighted.weighted(edge0, 0.0);
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Weighted<Edge<Arborescence<Object>>>>) null, weighted0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.ChuLiuEdmonds", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[6][8];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(4723);
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Arborescence<Weighted<Edge<Arborescence<Object>>>>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.ChuLiuEdmonds", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      EnumSet<Locale.FilteringMode> enumSet0 = EnumSet.of(locale_FilteringMode0, locale_FilteringMode0);
      ArrayDeque<Weighted<Edge<Locale.FilteringMode>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Locale.FilteringMode>>>(0);
      SparseWeightedGraph<Locale.FilteringMode> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.FilteringMode>) enumSet0, (Iterable<Weighted<Edge<Locale.FilteringMode>>>) arrayDeque0);
      Weighted<Arborescence<Locale.FilteringMode>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Locale.FilteringMode>) sparseWeightedGraph0);
      assertEquals(0.0, weighted0.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[3][8];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);
      assertNotNull(chuLiuEdmonds_PartialSolution0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayDeque<Weighted<Edge<ExclusiveEdge<String>>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<ExclusiveEdge<String>>>>();
      SparseWeightedGraph<ExclusiveEdge<String>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<ExclusiveEdge<String>>>>) arrayDeque0);
      ChuLiuEdmonds.PartialSolution<ExclusiveEdge<String>> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<ExclusiveEdge<String>>) sparseWeightedGraph0);
      Set<ExclusiveEdge<String>> set0 = chuLiuEdmonds_PartialSolution0.getNodes();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayList<Weighted<Edge<Object>>> arrayList0 = new ArrayList<Weighted<Edge<Object>>>();
      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) arrayList0);
      ChuLiuEdmonds.PartialSolution<Object> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Object>) sparseWeightedGraph0);
      Optional<ExclusiveEdge<Object>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge((Object) "`rns=E:l");
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PriorityQueue<Comparable<Locale.FilteringMode>> priorityQueue0 = new PriorityQueue<Comparable<Locale.FilteringMode>>(1561);
      PriorityQueue<Weighted<Edge<Comparable<Locale.FilteringMode>>>> priorityQueue1 = new PriorityQueue<Weighted<Edge<Comparable<Locale.FilteringMode>>>>();
      SparseWeightedGraph<Comparable<Locale.FilteringMode>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Comparable<Locale.FilteringMode>>) priorityQueue0, (Iterable<Weighted<Edge<Comparable<Locale.FilteringMode>>>>) priorityQueue1);
      ChuLiuEdmonds.PartialSolution<Comparable<Locale.FilteringMode>> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Comparable<Locale.FilteringMode>>) sparseWeightedGraph0);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      Optional<ExclusiveEdge<Comparable<Locale.FilteringMode>>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge((Comparable<Locale.FilteringMode>) locale_FilteringMode0, (Arborescence<Comparable<Locale.FilteringMode>>) null);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[][] doubleArray0 = new double[3][6];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) linkedHashSet0, (Set<Edge<Integer>>) linkedHashSet0);
      assertEquals(0.0, weighted0.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[][] doubleArray0 = new double[6][8];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(4723);
      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, integer0);
      assertEquals(0.0, weighted0.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ChuLiuEdmonds chuLiuEdmonds0 = new ChuLiuEdmonds();
  }
}