package net.mooctest;


import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;


import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;

public class KBestArborescencesTest {

	@Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      Arborescence<ExclusiveEdge<String>> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<ExclusiveEdge<String>>> weighted0 = Weighted.weighted(arborescence0, 0.0);
	      LinkedHashSet<Edge<ExclusiveEdge<String>>> linkedHashSet0 = new LinkedHashSet<Edge<ExclusiveEdge<String>>>();
	      HashSet<Edge<ExclusiveEdge<String>>> hashSet0 = new HashSet<Edge<ExclusiveEdge<String>>>();
	      KBestArborescences.SubsetOfSolutions<ExclusiveEdge<String>> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<ExclusiveEdge<String>>((Edge<ExclusiveEdge<String>>) null, weighted0, linkedHashSet0, hashSet0);
	  }

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      ArrayDeque<Weighted<Edge<Integer>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Integer>>>(0);
	      SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Integer>>>) arrayDeque0);
	      TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>();
	      TreeSet<Edge<Integer>> treeSet1 = new TreeSet<Edge<Integer>>();
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<Integer>> weighted0 = new Weighted<Arborescence<Integer>>(arborescence0, 0);
	      Optional<Weighted<KBestArborescences.SubsetOfSolutions<Integer>>> optional0 = KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) sparseWeightedGraph0, (Set<Edge<Integer>>) treeSet0, (Set<Edge<Integer>>) treeSet1, weighted0);
	      assertNotNull(optional0);
	  }

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	      double[][] doubleArray0 = new double[1][8];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 3);
	      assertEquals(1, list0.size());
	  }


	

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      double[][] doubleArray0 = new double[7][9];
	      double[] doubleArray1 = new double[0];
	      doubleArray0[5] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      ArrayDeque<Edge<Integer>> arrayDeque0 = new ArrayDeque<Edge<Integer>>();
	      TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>(arrayDeque0);
	      // Undeclared exception!

	  }



	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      double[][] doubleArray0 = new double[9][5];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      // Undeclared exception!
	     
	  }

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      double[][] doubleArray0 = new double[1][8];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 2);
	      assertFalse(list0.isEmpty());
	  }

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {
	      double[][] doubleArray0 = new double[1][8];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 1);
	      assertEquals(1, list0.size());
	  }

	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {
	      KBestArborescences kBestArborescences0 = new KBestArborescences();
	  }

	  @Test(timeout = 4000)
	  public void test13()  throws Throwable  {
	      double[][] doubleArray0 = new double[1][8];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 0);
	      assertTrue(list0.isEmpty());
	  }


}
