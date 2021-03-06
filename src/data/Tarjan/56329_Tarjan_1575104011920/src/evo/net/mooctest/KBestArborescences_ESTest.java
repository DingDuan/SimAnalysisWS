/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:11:53 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import net.mooctest.Arborescence;
import net.mooctest.DenseWeightedGraph;
import net.mooctest.Edge;
import net.mooctest.EdgeQueueMap;
import net.mooctest.ExclusiveEdge;
import net.mooctest.KBestArborescences;
import net.mooctest.Pair;
import net.mooctest.Partition;
import net.mooctest.SparseWeightedGraph;
import net.mooctest.Weighted;
import net.mooctest.WeightedGraph;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KBestArborescences_ESTest extends KBestArborescences_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[14][0];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (-962.25724995);
      doubleArray1[1] = (-580.645203533468);
      doubleArray1[2] = 1214.10213468;
      doubleArray1[3] = 0.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = 0.0;
      doubleArray2[1] = (-962.25724995);
      doubleArray2[2] = (-962.25724995);
      doubleArray2[3] = 1214.10213468;
      doubleArray2[4] = (-580.645203533468);
      doubleArray2[5] = 0.0;
      doubleArray2[6] = (-580.645203533468);
      doubleArray0[1] = doubleArray2;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
      Arborescence<Integer> arborescence0 = Arborescence.empty();
      arborescence0.toString();
      Weighted<Arborescence<Integer>> weighted0 = Weighted.weighted(arborescence0, 0.0);
      // Undeclared exception!
      try { 
        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) hashSet0, weighted0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ServiceLoader<Locale.FilteringMode> serviceLoader0 = ServiceLoader.load(class0, classLoader0);
      double[][] doubleArray0 = new double[0][9];
      DenseWeightedGraph<Locale.FilteringMode> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.FilteringMode>) serviceLoader0, doubleArray0);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      int int0 = 1;
      KBestArborescences.getKBestArborescences((WeightedGraph<Locale.FilteringMode>) denseWeightedGraph0, locale_FilteringMode0, 1);
      ExclusiveEdge<KBestArborescences> exclusiveEdge0 = null;
      Arborescence.empty();
      KBestArborescences kBestArborescences0 = new KBestArborescences();
      // Undeclared exception!
      try { 
        Partition.singletons((Collection<KBestArborescences>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Partition", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[2][0];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (-962.25724995);
      doubleArray1[1] = (-580.645203533468);
      doubleArray1[2] = 1214.10213468;
      doubleArray1[3] = 0.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = 0.0;
      doubleArray2[1] = (-962.25724995);
      doubleArray2[2] = (-962.25724995);
      doubleArray2[3] = 1214.10213468;
      doubleArray2[4] = (-580.645203533468);
      doubleArray2[5] = 0.0;
      doubleArray2[6] = (-580.645203533468);
      doubleArray0[1] = doubleArray2;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
      Arborescence<Integer> arborescence0 = Arborescence.empty();
      Weighted<Arborescence<Integer>> weighted0 = Weighted.weighted(arborescence0, 0.0);
      // Undeclared exception!
      try { 
        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) hashSet0, weighted0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.KBestArborescences", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExclusiveEdge<KBestArborescences.SubsetOfSolutions<Double>> exclusiveEdge0 = ExclusiveEdge.of((Edge<KBestArborescences.SubsetOfSolutions<Double>>) null, 0.0);
      Arborescence<Double> arborescence0 = Arborescence.empty();
      Weighted<Arborescence<Double>> weighted0 = Weighted.weighted(arborescence0, 1713.13906);
      TreeSet<Edge<Double>> treeSet0 = new TreeSet<Edge<Double>>();
      HashSet<Edge<Double>> hashSet0 = new HashSet<Edge<Double>>();
      KBestArborescences.SubsetOfSolutions<Double> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Double>((Edge<Double>) null, weighted0, treeSet0, hashSet0);
      ArrayList<KBestArborescences.SubsetOfSolutions<Double>> arrayList0 = new ArrayList<KBestArborescences.SubsetOfSolutions<Double>>();
      Partition<KBestArborescences.SubsetOfSolutions<Double>> partition0 = Partition.singletons((Collection<KBestArborescences.SubsetOfSolutions<Double>>) arrayList0);
      EdgeQueueMap.EdgeQueue<KBestArborescences.SubsetOfSolutions<Double>> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(kBestArborescences_SubsetOfSolutions0, partition0);
      Optional<ExclusiveEdge<KBestArborescences.SubsetOfSolutions<Double>>> optional0 = KBestArborescences.seek(exclusiveEdge0, (Arborescence<KBestArborescences.SubsetOfSolutions<Double>>) null, (EdgeQueueMap.EdgeQueue<KBestArborescences.SubsetOfSolutions<Double>>) edgeQueueMap_EdgeQueue0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImmutableSortedMap<EdgeQueueMap.EdgeQueue<Double>, EdgeQueueMap.EdgeQueue<Double>> immutableSortedMap0 = ImmutableSortedMap.of();
      Arborescence<EdgeQueueMap.EdgeQueue<Double>> arborescence0 = Arborescence.of((ImmutableMap<EdgeQueueMap.EdgeQueue<Double>, EdgeQueueMap.EdgeQueue<Double>>) immutableSortedMap0);
      arborescence0.equals(immutableSortedMap0);
      Weighted<Arborescence<EdgeQueueMap.EdgeQueue<Double>>> weighted0 = Weighted.weighted(arborescence0, 1698.1083);
      LinkedHashSet<Edge<EdgeQueueMap.EdgeQueue<Double>>> linkedHashSet0 = new LinkedHashSet<Edge<EdgeQueueMap.EdgeQueue<Double>>>();
      linkedHashSet0.add((Edge<EdgeQueueMap.EdgeQueue<Double>>) null);
      KBestArborescences.SubsetOfSolutions<EdgeQueueMap.EdgeQueue<Double>> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<EdgeQueueMap.EdgeQueue<Double>>((Edge<EdgeQueueMap.EdgeQueue<Double>>) null, weighted0, linkedHashSet0, linkedHashSet0);
      LinkedList<Weighted<Edge<Double>>> linkedList0 = new LinkedList<Weighted<Edge<Double>>>();
      SparseWeightedGraph<Double> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Double>>>) linkedList0);
      LinkedHashSet<Edge<Double>> linkedHashSet1 = new LinkedHashSet<Edge<Double>>();
      Arborescence<Double> arborescence1 = Arborescence.empty();
      Weighted<Arborescence<Double>> weighted1 = Weighted.weighted(arborescence1, 1698.1083);
      Pair<Double, String> pair0 = Pair.of((Double) 1698.1083, "MB\"]");
      Weighted.weighted((Object) pair0, 1698.1083);
      Optional<Weighted<KBestArborescences.SubsetOfSolutions<Double>>> optional0 = KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Double>) sparseWeightedGraph0, (Set<Edge<Double>>) linkedHashSet1, (Set<Edge<Double>>) linkedHashSet1, weighted1);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayDeque<Weighted<Edge<Pair<Integer, Integer>>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Pair<Integer, Integer>>>>();
      SparseWeightedGraph<Pair<Integer, Integer>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Pair<Integer, Integer>>>>) arrayDeque0);
      Integer integer0 = new Integer((-732));
      Integer integer1 = new Integer((-732));
      Pair<Integer, Integer> pair0 = Pair.of(integer0, integer1);
      KBestArborescences.getKBestArborescences((WeightedGraph<Pair<Integer, Integer>>) sparseWeightedGraph0, pair0, (-1054));
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      ArrayDeque<String> arrayDeque1 = new ArrayDeque<String>(linkedHashSet0);
      double[][] doubleArray0 = new double[6][7];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (double) (-1054);
      doubleArray1[1] = (double) (-1054);
      doubleArray1[2] = (double) (-732);
      doubleArray1[3] = (double) (-732);
      doubleArray1[4] = (double) (-732);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = (double) (-1054);
      doubleArray2[1] = (double) (-1054);
      doubleArray2[2] = 1.0;
      doubleArray2[3] = (double) (-732);
      doubleArray2[4] = (-955.489);
      doubleArray2[5] = (double) (-732);
      doubleArray2[6] = (double) (-1054);
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[4];
      doubleArray3[0] = (double) (-1054);
      doubleArray3[1] = (double) (-1054);
      doubleArray3[2] = Double.POSITIVE_INFINITY;
      doubleArray3[3] = (double) (-732);
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[6];
      doubleArray4[0] = (double) (-732);
      doubleArray4[1] = 1.0;
      doubleArray4[2] = (double) (-1054);
      doubleArray4[3] = 1.0;
      doubleArray4[4] = 1.0;
      doubleArray4[5] = 0.0;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[0];
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[9];
      doubleArray6[0] = (-1400.0);
      doubleArray6[1] = (-955.489);
      doubleArray6[2] = (double) (-1054);
      doubleArray6[3] = (-955.489);
      doubleArray6[4] = Double.POSITIVE_INFINITY;
      doubleArray6[5] = Double.POSITIVE_INFINITY;
      doubleArray6[6] = 1.0;
      doubleArray6[7] = (double) (-732);
      doubleArray6[8] = Double.POSITIVE_INFINITY;
      doubleArray0[5] = doubleArray6;
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<String>) arrayDeque1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KBestArborescences kBestArborescences0 = new KBestArborescences();
      ArrayList<Weighted<Edge<EdgeQueueMap.EdgeQueue<String>>>> arrayList0 = new ArrayList<Weighted<Edge<EdgeQueueMap.EdgeQueue<String>>>>(4605);
      SparseWeightedGraph<EdgeQueueMap.EdgeQueue<String>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<EdgeQueueMap.EdgeQueue<String>>>>) arrayList0);
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      Partition<String> partition0 = Partition.singletons((Collection<String>) priorityQueue0);
      EdgeQueueMap.EdgeQueue<String> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create("BL{6S?QZ5bWC@e),Fo", partition0);
      KBestArborescences.getKBestArborescences((WeightedGraph<EdgeQueueMap.EdgeQueue<String>>) sparseWeightedGraph0, (EdgeQueueMap.EdgeQueue<String>) edgeQueueMap_EdgeQueue0, 4605);
      HashSet<Weighted<Edge<String>>> hashSet0 = new HashSet<Weighted<Edge<String>>>(784);
      SparseWeightedGraph<String> sparseWeightedGraph1 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) hashSet0);
      KBestArborescences.getKBestArborescences((WeightedGraph<String>) sparseWeightedGraph1, "[%e#", 631);
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      EnumSet<Locale.FilteringMode> enumSet0 = EnumSet.allOf(class0);
      double[][] doubleArray0 = new double[4][5];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) 4605;
      doubleArray1[1] = 0.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = 0.0;
      doubleArray2[1] = (double) 784;
      doubleArray2[2] = (double) 4605;
      doubleArray2[3] = (double) 631;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[6];
      doubleArray3[0] = (double) 4605;
      doubleArray3[1] = (double) 631;
      doubleArray3[2] = (double) 784;
      doubleArray3[3] = (double) 784;
      doubleArray3[4] = (double) 784;
      doubleArray3[5] = (double) 631;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[6];
      doubleArray4[0] = (double) 784;
      doubleArray4[1] = (-1851.28);
      doubleArray4[2] = (double) 784;
      doubleArray4[3] = (double) 784;
      doubleArray4[5] = (double) 784;
      doubleArray0[3] = doubleArray4;
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Locale.FilteringMode>) enumSet0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KBestArborescences kBestArborescences0 = new KBestArborescences();
      // Undeclared exception!
      try { 
        KBestArborescences.seek((ExclusiveEdge<Locale.FilteringMode>) null, (Arborescence<Locale.FilteringMode>) null, (EdgeQueueMap.EdgeQueue<Locale.FilteringMode>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.KBestArborescences", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector<Weighted<Edge<Arborescence<String>>>> vector0 = new Vector<Weighted<Edge<Arborescence<String>>>>(0, 6);
      SparseWeightedGraph<Arborescence<String>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Arborescence<String>>>>) vector0);
      Arborescence<String> arborescence0 = Arborescence.empty();
      List<Weighted<Arborescence<Arborescence<String>>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Arborescence<String>>) sparseWeightedGraph0, arborescence0, 2);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImmutableSortedMap<EdgeQueueMap.EdgeQueue<Double>, EdgeQueueMap.EdgeQueue<Double>> immutableSortedMap0 = ImmutableSortedMap.of();
      Arborescence<EdgeQueueMap.EdgeQueue<Double>> arborescence0 = Arborescence.of((ImmutableMap<EdgeQueueMap.EdgeQueue<Double>, EdgeQueueMap.EdgeQueue<Double>>) immutableSortedMap0);
      Weighted<Arborescence<EdgeQueueMap.EdgeQueue<Double>>> weighted0 = Weighted.weighted(arborescence0, 1698.1083);
      LinkedHashSet<Edge<EdgeQueueMap.EdgeQueue<Double>>> linkedHashSet0 = new LinkedHashSet<Edge<EdgeQueueMap.EdgeQueue<Double>>>();
      KBestArborescences.SubsetOfSolutions<EdgeQueueMap.EdgeQueue<Double>> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<EdgeQueueMap.EdgeQueue<Double>>((Edge<EdgeQueueMap.EdgeQueue<Double>>) null, weighted0, linkedHashSet0, linkedHashSet0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Arborescence<Integer> arborescence0 = Arborescence.empty();
      // Undeclared exception!
      try { 
        KBestArborescences.getKBestArborescences((WeightedGraph<Arborescence<Integer>>) null, arborescence0, 3042);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.KBestArborescences", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[3][0];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 0.7;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[5];
      doubleArray2[0] = 0.7;
      doubleArray2[1] = 0.7;
      doubleArray2[2] = 0.7;
      doubleArray2[3] = 0.7;
      doubleArray2[4] = 0.7;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[2];
      doubleArray3[0] = 0.7;
      doubleArray3[1] = 4215.586114;
      doubleArray0[2] = doubleArray3;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>();
      TreeSet<Edge<Integer>> treeSet1 = new TreeSet<Edge<Integer>>();
      Arborescence<Integer> arborescence0 = Arborescence.empty();
      Weighted<Arborescence<Integer>> weighted0 = new Weighted<Arborescence<Integer>>(arborescence0, 4215.586114);
      // Undeclared exception!
      try { 
        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) treeSet0, (Set<Edge<Integer>>) treeSet1, weighted0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // net.mooctest.Edge cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Arborescence<String> arborescence0 = Arborescence.empty();
      ArrayDeque<String> arrayDeque0 = new ArrayDeque<String>();
      Partition<String> partition0 = Partition.singletons((Collection<String>) arrayDeque0);
      EdgeQueueMap.EdgeQueue<String> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create("RTge^WAR}k3`*iG", partition0);
      Optional<ExclusiveEdge<String>> optional0 = KBestArborescences.seek((ExclusiveEdge<String>) null, arborescence0, (EdgeQueueMap.EdgeQueue<String>) edgeQueueMap_EdgeQueue0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector<Weighted<Edge<KBestArborescences>>> vector0 = new Vector<Weighted<Edge<KBestArborescences>>>(2048, 306654252);
      SparseWeightedGraph<KBestArborescences> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<KBestArborescences>>>) vector0);
      TreeSet<Edge<KBestArborescences>> treeSet0 = new TreeSet<Edge<KBestArborescences>>();
      Arborescence<KBestArborescences> arborescence0 = Arborescence.empty();
      Weighted<Arborescence<KBestArborescences>> weighted0 = new Weighted<Arborescence<KBestArborescences>>(arborescence0, 2048);
      KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<KBestArborescences>) sparseWeightedGraph0, (Set<Edge<KBestArborescences>>) treeSet0, (Set<Edge<KBestArborescences>>) treeSet0, weighted0);
      double[][] doubleArray0 = new double[6][5];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 2048;
      doubleArray1[1] = (double) 306654252;
      doubleArray1[2] = (-1276.385856061495);
      doubleArray1[3] = (double) 2048;
      doubleArray1[4] = (double) 306654252;
      doubleArray1[5] = (double) 306654252;
      doubleArray1[6] = (double) 2048;
      doubleArray1[7] = (double) 2048;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = (double) 306654252;
      doubleArray2[1] = (double) 306654252;
      doubleArray2[2] = (double) 306654252;
      doubleArray2[3] = 2048.0;
      doubleArray2[4] = (double) 2048;
      doubleArray2[5] = 2048.0;
      doubleArray2[6] = (double) 306654252;
      doubleArray2[7] = (double) 306654252;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[1];
      doubleArray3[0] = 2048.0;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[7];
      doubleArray4[0] = (double) 306654252;
      doubleArray4[1] = (double) 306654252;
      doubleArray4[2] = 2048.0;
      doubleArray4[3] = (double) 2048;
      doubleArray4[4] = 2048.0;
      doubleArray4[5] = (double) 2048;
      doubleArray4[6] = (double) 306654252;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[3];
      doubleArray5[0] = 2048.0;
      doubleArray5[1] = (-1276.385856061495);
      doubleArray5[2] = (double) 2048;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[6];
      doubleArray6[0] = (-1276.385856061495);
      doubleArray6[1] = (double) 306654252;
      doubleArray6[2] = (double) 306654252;
      doubleArray6[3] = (double) 2048;
      doubleArray6[4] = 2048.0;
      doubleArray6[5] = (double) 306654252;
      doubleArray0[5] = doubleArray6;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, (-5352));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KBestArborescences kBestArborescences0 = new KBestArborescences();
      int int0 = 1752;
      HashSet<ExclusiveEdge<Integer>> hashSet0 = new HashSet<ExclusiveEdge<Integer>>(1752);
      LinkedHashSet<Weighted<Edge<ExclusiveEdge<Integer>>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<ExclusiveEdge<Integer>>>>(1752);
      SparseWeightedGraph<ExclusiveEdge<Integer>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<ExclusiveEdge<Integer>>) hashSet0, (Iterable<Weighted<Edge<ExclusiveEdge<Integer>>>>) linkedHashSet0);
      TreeSet<Edge<ExclusiveEdge<Integer>>> treeSet0 = new TreeSet<Edge<ExclusiveEdge<Integer>>>();
      // Undeclared exception!
      try { 
        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<ExclusiveEdge<Integer>>) sparseWeightedGraph0, (Set<Edge<ExclusiveEdge<Integer>>>) treeSet0, (Set<Edge<ExclusiveEdge<Integer>>>) treeSet0, (Weighted<Arborescence<ExclusiveEdge<Integer>>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.KBestArborescences", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KBestArborescences kBestArborescences0 = new KBestArborescences();
      Stack<KBestArborescences> stack0 = new Stack<KBestArborescences>();
      stack0.add(kBestArborescences0);
      LinkedHashSet<Weighted<Edge<KBestArborescences>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<KBestArborescences>>>(31, 31);
      SparseWeightedGraph<KBestArborescences> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<KBestArborescences>) stack0, (Iterable<Weighted<Edge<KBestArborescences>>>) linkedHashSet0);
      SparseWeightedGraph.from((Iterable<KBestArborescences>) stack0, (Iterable<Weighted<Edge<KBestArborescences>>>) linkedHashSet0);
      KBestArborescences.getKBestArborescences((WeightedGraph<KBestArborescences>) sparseWeightedGraph0, kBestArborescences0, 31);
      TreeSet<Weighted<Edge<Object>>> treeSet0 = new TreeSet<Weighted<Edge<Object>>>();
      SparseWeightedGraph<Object> sparseWeightedGraph1 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) treeSet0);
      List<Weighted<Arborescence<Object>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Object>) sparseWeightedGraph1, (Object) treeSet0, (-1));
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashSet<Weighted<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<String>>>(1481);
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) linkedHashSet0);
      List<Weighted<Arborescence<String>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<String>) sparseWeightedGraph0, "net.mooctest.KBestArborescences", 1481);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[][] doubleArray0 = new double[2][0];
      double[] doubleArray1 = new double[4];
      doubleArray1[1] = (-580.645203533468);
      doubleArray1[3] = 0.0;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
      Arborescence<Integer> arborescence0 = Arborescence.empty();
      Weighted<Arborescence<Integer>> weighted0 = Weighted.weighted(arborescence0, (-580.645203533468));
      // Undeclared exception!
      try { 
        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) hashSet0, weighted0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.KBestArborescences", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      KBestArborescences kBestArborescences0 = new KBestArborescences();
      Stack<KBestArborescences> stack0 = new Stack<KBestArborescences>();
      stack0.add(kBestArborescences0);
      LinkedHashSet<Weighted<Edge<KBestArborescences>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<KBestArborescences>>>(31, 31);
      SparseWeightedGraph<KBestArborescences> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<KBestArborescences>) stack0, (Iterable<Weighted<Edge<KBestArborescences>>>) linkedHashSet0);
      KBestArborescences.getKBestArborescences((WeightedGraph<KBestArborescences>) sparseWeightedGraph0, kBestArborescences0, 31);
      TreeSet<Weighted<Edge<Object>>> treeSet0 = new TreeSet<Weighted<Edge<Object>>>();
      SparseWeightedGraph<Object> sparseWeightedGraph1 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) treeSet0);
      List<Weighted<Arborescence<Object>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Object>) sparseWeightedGraph1, (Object) treeSet0, (-1));
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector<Weighted<Edge<Arborescence<String>>>> vector0 = new Vector<Weighted<Edge<Arborescence<String>>>>(16, 6);
      SparseWeightedGraph<Arborescence<String>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Arborescence<String>>>>) vector0);
      Arborescence<String> arborescence0 = Arborescence.empty();
      KBestArborescences.getKBestArborescences((WeightedGraph<Arborescence<String>>) sparseWeightedGraph0, arborescence0, 2);
      double[][] doubleArray0 = new double[4][4];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (double) 16;
      doubleArray1[1] = (double) 16;
      doubleArray1[2] = (double) 2;
      doubleArray1[3] = (double) 2;
      doubleArray1[4] = (double) 16;
      doubleArray1[5] = (double) 6;
      doubleArray1[6] = (double) 16;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = (-168.09);
      doubleArray2[1] = (double) 6;
      doubleArray2[2] = (double) 2;
      doubleArray2[3] = (double) 16;
      doubleArray2[4] = (double) 2;
      doubleArray2[5] = (double) 16;
      doubleArray2[6] = (double) 6;
      doubleArray2[7] = (double) 2;
      doubleArray2[8] = (double) 2;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[8];
      doubleArray3[0] = (-168.09);
      doubleArray3[1] = (-168.09);
      doubleArray3[2] = 0.0;
      doubleArray3[3] = (-168.09);
      doubleArray3[4] = (-168.09);
      doubleArray3[5] = 5183.45914386;
      doubleArray3[6] = (double) 2;
      doubleArray3[7] = 0.0;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[5];
      doubleArray4[0] = (-1911.23);
      doubleArray4[1] = (-168.09);
      doubleArray4[2] = 5183.45914386;
      doubleArray4[3] = (-168.09);
      doubleArray4[4] = 1147.54;
      doubleArray0[3] = doubleArray4;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(253);
      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 837);
      assertEquals(1, list0.size());
  }
}
