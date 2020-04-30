/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 13:39:02 GMT+08:00 2019
 */

package net.mooctest;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class KBestArborescencesTest{

  @Test(timeout = 4000)
  public void test_E00()  throws Throwable  {
      Arborescence<Locale.Category> arborescence0 = Arborescence.empty();
      Weighted<Arborescence<Locale.Category>> weighted0 = Weighted.weighted(arborescence0, 0.0);
      HashSet<Edge<Locale.Category>> hashSet0 = new HashSet<Edge<Locale.Category>>();
      TreeSet<Edge<Locale.Category>> treeSet0 = new TreeSet<Edge<Locale.Category>>();
      KBestArborescences.SubsetOfSolutions<Locale.Category> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Locale.Category>((Edge<Locale.Category>) null, weighted0, hashSet0, treeSet0);
  }

  @Test(timeout = 4000)
  public void test_E01()  throws Throwable  {
      TreeSet<Weighted<Edge<Comparable<EdgeQueueMap.EdgeQueue<String>>>>> treeSet0 = new TreeSet<Weighted<Edge<Comparable<EdgeQueueMap.EdgeQueue<String>>>>>();
      SparseWeightedGraph<Comparable<EdgeQueueMap.EdgeQueue<String>>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Comparable<EdgeQueueMap.EdgeQueue<String>>>>>) treeSet0);
      Comparable<EdgeQueueMap.EdgeQueue<String>> comparable0 = (Comparable<EdgeQueueMap.EdgeQueue<String>>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      List<Weighted<Arborescence<Comparable<EdgeQueueMap.EdgeQueue<String>>>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Comparable<EdgeQueueMap.EdgeQueue<String>>>) sparseWeightedGraph0, comparable0, 3);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_E02()  throws Throwable  {
      HashSet<Weighted<Edge<KBestArborescences>>> hashSet0 = new HashSet<Weighted<Edge<KBestArborescences>>>();
      SparseWeightedGraph<KBestArborescences> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<KBestArborescences>>>) hashSet0);
      TreeSet<Edge<KBestArborescences>> treeSet0 = new TreeSet<Edge<KBestArborescences>>();
      HashSet<Edge<KBestArborescences>> hashSet1 = new HashSet<Edge<KBestArborescences>>();
      Arborescence<KBestArborescences> arborescence0 = Arborescence.empty();
      Weighted<Arborescence<KBestArborescences>> weighted0 = new Weighted<Arborescence<KBestArborescences>>(arborescence0, 0.0);
      Optional<Weighted<KBestArborescences.SubsetOfSolutions<KBestArborescences>>> optional0 = KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<KBestArborescences>) sparseWeightedGraph0, (Set<Edge<KBestArborescences>>) treeSet0, (Set<Edge<KBestArborescences>>) hashSet1, weighted0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test_E03()  throws Throwable  {
      Edge<String> edge0 = (Edge<String>) mock(Edge.class, new ViolatedAssumptionAnswer());
      ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of();
      Arborescence<String> arborescence0 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
      // Undeclared exception!
      try { 
        KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.KBestArborescences", e);
      }
  }

  @Test(timeout = 4000)
  public void test_E04()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<Weighted<Edge<Edge<Object>>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Edge<Object>>>>(comparator0);
      SparseWeightedGraph<Edge<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Edge<Object>>>>) priorityQueue0);
      Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
      ImmutableBiMap<Edge<Object>, Edge<Object>> immutableBiMap0 = ImmutableBiMap.of(edge0, edge0);
      Arborescence<Edge<Object>> arborescence0 = Arborescence.of((ImmutableMap<Edge<Object>, Edge<Object>>) immutableBiMap0);
      Weighted<Arborescence<Edge<Object>>> weighted0 = new Weighted<Arborescence<Edge<Object>>>(arborescence0, 0.0);
      // Undeclared exception!
      try { 
        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Edge<Object>>) sparseWeightedGraph0, (Set<Edge<Edge<Object>>>) null, (Set<Edge<Edge<Object>>>) null, weighted0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Edge", e);
      }
  }

  @Test(timeout = 4000)
  public void test_E05()  throws Throwable  {
      HashSet<Edge<Weighted<String>>> hashSet0 = new HashSet<Edge<Weighted<String>>>();
      Arborescence<Weighted<String>> arborescence0 = Arborescence.empty();
      Edge<Weighted<String>> edge0 = (Edge<Weighted<String>>) mock(Edge.class, new ViolatedAssumptionAnswer());
      hashSet0.add(edge0);
      Weighted<Arborescence<Weighted<String>>> weighted0 = new Weighted<Arborescence<Weighted<String>>>(arborescence0, 0.0);
      // Undeclared exception!
      try { 
        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Weighted<String>>) null, (Set<Edge<Weighted<String>>>) hashSet0, (Set<Edge<Weighted<String>>>) hashSet0, weighted0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null key in entry: null=null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test_E06()  throws Throwable  {
      double[][] doubleArray0 = new double[6][8];
      double[] doubleArray1 = new double[0];
      doubleArray0[2] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>();
      Arborescence<Integer> arborescence0 = Arborescence.empty();
      Weighted<Arborescence<Integer>> weighted0 = new Weighted<Arborescence<Integer>>(arborescence0, 0.0);
      // Undeclared exception!
      try { 
        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) treeSet0, (Set<Edge<Integer>>) treeSet0, weighted0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test_E07()  throws Throwable  {
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) null, integer0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.KBestArborescences", e);
      }
  }

  @Test(timeout = 4000)
  public void test_E08()  throws Throwable  {
      double[][] doubleArray0 = new double[6][5];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = Integer.getInteger("", 0);
      // Undeclared exception!
      try { 
        KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test_E09()  throws Throwable  {
      Edge<String> edge0 = (Edge<String>) mock(Edge.class, new ViolatedAssumptionAnswer());
      ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
      Arborescence<String> arborescence0 = Arborescence.empty();
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      Partition<String> partition0 = Partition.singletons((Collection<String>) priorityQueue0);
      EdgeQueueMap.EdgeQueue<String> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create("", partition0);
      Optional<ExclusiveEdge<String>> optional0 = KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<String>) edgeQueueMap_EdgeQueue0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test_E11()  throws Throwable  {
      double[][] doubleArray0 = new double[3][7];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.59423828125;
      doubleArray1[1] = 0.769927001953125;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, (Integer) null, 2);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_E12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<Weighted<Edge<Object>>> treeSet0 = new TreeSet<Weighted<Edge<Object>>>(comparator0);
      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) treeSet0);
      Object object0 = new Object();
      List<Weighted<Arborescence<Object>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Object>) sparseWeightedGraph0, object0, 1);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_E13()  throws Throwable  {
      KBestArborescences kBestArborescences0 = new KBestArborescences();
  }

  @Test(timeout = 4000)
  public void test_E14()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<Weighted<Edge<Object>>> treeSet0 = new TreeSet<Weighted<Edge<Object>>>(comparator0);
      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) treeSet0);
      Object object0 = new Object();
      List<Weighted<Arborescence<Object>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Object>) sparseWeightedGraph0, object0, 0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_E15()  throws Throwable  {
      Edge<Double> edge0 = (Edge<Double>) mock(Edge.class, new ViolatedAssumptionAnswer());
      ExclusiveEdge<Double> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
      Edge<Double> edge1 = exclusiveEdge0.edge;
      Arborescence<Double> arborescence0 = Arborescence.empty();
      Weighted<Arborescence<Double>> weighted0 = new Weighted<Arborescence<Double>>(arborescence0, 0.0);
      TreeSet<Edge<Double>> treeSet0 = new TreeSet<Edge<Double>>();
      KBestArborescences.SubsetOfSolutions<Double> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Double>(edge1, weighted0, treeSet0, treeSet0);
  }
}
