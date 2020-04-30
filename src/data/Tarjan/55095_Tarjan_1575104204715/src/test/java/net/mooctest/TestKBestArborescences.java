package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
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
import net.mooctest.Partition;
import net.mooctest.SparseWeightedGraph;
import net.mooctest.Weighted;
import net.mooctest.WeightedGraph;



public class TestKBestArborescences {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PriorityQueue<Weighted<Edge<Weighted<Double>>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Weighted<Double>>>>(1);
      SparseWeightedGraph<Weighted<Double>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Weighted<Double>>>>) priorityQueue0);
      Double double0 = new Double(0.0);
      Weighted<Double> weighted0 = Weighted.weighted(double0, 0.0);
      List<Weighted<Arborescence<Weighted<Double>>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Weighted<Double>>) sparseWeightedGraph0, weighted0, 3);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayList<Locale.LanguageRange> arrayList0 = new ArrayList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) arrayList0, (Collection<String>) null, locale_FilteringMode0);
      ArrayDeque<Weighted<Edge<String>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<String>>>(0);
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) list0, (Iterable<Weighted<Edge<String>>>) arrayDeque0);
      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
      Arborescence<String> arborescence0 = Arborescence.empty();
      Weighted<Arborescence<String>> weighted0 = new Weighted<Arborescence<String>>(arborescence0, 0.0);
      Optional<Weighted<KBestArborescences.SubsetOfSolutions<String>>> optional0 = KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<String>) sparseWeightedGraph0, (Set<Edge<String>>) linkedHashSet0, (Set<Edge<String>>) linkedHashSet0, weighted0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Arborescence<Arborescence<Integer>> arborescence0 = Arborescence.empty();
      // Undeclared exception!
      try { 
        KBestArborescences.seek((ExclusiveEdge<Arborescence<Integer>>) null, arborescence0, (EdgeQueueMap.EdgeQueue<Arborescence<Integer>>) null);
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
      HashSet<Edge<Edge<Object>>> hashSet0 = new HashSet<Edge<Edge<Object>>>();
      Arborescence<Edge<Object>> arborescence0 = Arborescence.empty();
      Weighted<Arborescence<Edge<Object>>> weighted0 = new Weighted<Arborescence<Edge<Object>>>(arborescence0, 0.0);
      // Undeclared exception!
      try { 
        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Edge<Object>>) null, (Set<Edge<Edge<Object>>>) hashSet0, (Set<Edge<Edge<Object>>>) hashSet0, weighted0);
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
         
      }
  }

//  @Test(timeout = 4000)
//  public void test04()  throws Throwable  {
//      LinkedHashSet<Edge<Arborescence<Locale.Category>>> linkedHashSet0 = new LinkedHashSet<Edge<Arborescence<Locale.Category>>>();
//      Arborescence<Arborescence<Locale.Category>> arborescence0 = Arborescence.empty();
//      Edge<Arborescence<Locale.Category>> edge0 = (Edge<Arborescence<Locale.Category>>) mock(Edge.class, new ViolatedAssumptionAnswer());
//      linkedHashSet0.add(edge0);
//      Weighted<Arborescence<Arborescence<Locale.Category>>> weighted0 = new Weighted<Arborescence<Arborescence<Locale.Category>>>(arborescence0, 0.0);
//      // Undeclared exception!
//      try { 
//        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Arborescence<Locale.Category>>) null, (Set<Edge<Arborescence<Locale.Category>>>) linkedHashSet0, (Set<Edge<Arborescence<Locale.Category>>>) linkedHashSet0, weighted0);
//        fail("Expecting exception: NullPointerException");
//      
//      } catch(Exception e) {
//        
//      }
//  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(0);
      ImmutableBiMap<Integer, Integer> immutableBiMap0 = ImmutableBiMap.of(integer0, integer0);
      Arborescence<Integer> arborescence0 = Arborescence.of((ImmutableMap<Integer, Integer>) immutableBiMap0);
      Weighted<Arborescence<Integer>> weighted0 = new Weighted<Arborescence<Integer>>(arborescence0, 0);
      HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
      double[][] doubleArray0 = new double[4][6];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      // Undeclared exception!
      try { 
        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) hashSet0, weighted0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[3][6];
      double[] doubleArray1 = new double[21];
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[2] = (-0.9687669876398609);
      doubleArray1[1] = 0.5770545828719195;
      doubleArray0[1] = doubleArray2;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(3);
      // Undeclared exception!
      KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 2);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        KBestArborescences.getKBestArborescences((WeightedGraph<String>) null, "", 0);
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
      double[][] doubleArray0 = new double[9][2];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Weighted<Edge<Double>>> arrayList0 = new ArrayList<Weighted<Edge<Double>>>();
      Arborescence<Object> arborescence0 = Arborescence.empty();
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      Partition<Object> partition0 = Partition.singletons((Collection<Object>) treeSet0);
      EdgeQueueMap.EdgeQueue<Object> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((Object) arrayList0, partition0);
      Optional<ExclusiveEdge<Object>> optional0 = KBestArborescences.seek((ExclusiveEdge<Object>) null, arborescence0, (EdgeQueueMap.EdgeQueue<Object>) edgeQueueMap_EdgeQueue0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[3][6];
      double[] doubleArray1 = new double[21];
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[2] = (-0.9687669876398609);
      doubleArray1[1] = 0.5770545828719195;
      doubleArray0[1] = doubleArray2;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(2);
      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 2);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[3][6];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (-0.9687669876398609);
      doubleArray1[2] = (-0.9687669876398609);
      doubleArray0[1] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(1);
      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 2);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      Vector<Weighted<Edge<String>>> vector0 = new Vector<Weighted<Edge<String>>>(0, 0);
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) stack0, (Iterable<Weighted<Edge<String>>>) vector0);
      List<Weighted<Arborescence<String>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<String>) sparseWeightedGraph0, "", 1);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      KBestArborescences kBestArborescences0 = new KBestArborescences();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashSet<Weighted<Edge<Locale.Category>>> hashSet0 = new HashSet<Weighted<Edge<Locale.Category>>>();
      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.Category>>>) hashSet0);
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      List<Weighted<Arborescence<Locale.Category>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Locale.Category>) sparseWeightedGraph0, locale_Category0, 0);
      assertEquals(0, list0.size());
  }

//  @Test(timeout = 4000)
//  public void test15()  throws Throwable  {
//      Integer integer0 = new Integer(0);
//      ImmutableBiMap<Integer, Integer> immutableBiMap0 = ImmutableBiMap.of(integer0, integer0);
//      Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
//      ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<Object>>) null, 0.0);
//      Edge<Object> edge1 = exclusiveEdge0.edge;
//      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
//      ImmutableSortedMap<Object, Object> immutableSortedMap0 = ImmutableSortedMap.copyOf((Map<?, ?>) immutableBiMap0, (Comparator<? super Object>) comparator0);
//      Arborescence<Object> arborescence0 = Arborescence.of((ImmutableMap<Object, Object>) immutableSortedMap0);
//      Weighted<Arborescence<Object>> weighted0 = new Weighted<Arborescence<Object>>(arborescence0, 0.0);
//      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
//      KBestArborescences.SubsetOfSolutions<Object> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Object>(edge1, weighted0, linkedHashSet0, linkedHashSet0);
//  }
}
