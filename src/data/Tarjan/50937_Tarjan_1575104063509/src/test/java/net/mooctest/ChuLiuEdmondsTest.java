package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;


import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;

public class ChuLiuEdmondsTest {

	 @Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      LinkedHashSet<Locale.Category> linkedHashSet0 = new LinkedHashSet<Locale.Category>();
	      Vector<Locale.Category> vector0 = new Vector<Locale.Category>(linkedHashSet0);
	      HashSet<Weighted<Edge<Locale.Category>>> hashSet0 = new HashSet<Weighted<Edge<Locale.Category>>>(0);
	      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.Category>) vector0, (Iterable<Weighted<Edge<Locale.Category>>>) hashSet0);
	      HashSet<Edge<Locale.Category>> hashSet1 = new HashSet<Edge<Locale.Category>>();
	      TreeSet<Edge<Locale.Category>> treeSet0 = new TreeSet<Edge<Locale.Category>>();
	      Weighted<Arborescence<Locale.Category>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Locale.Category>) sparseWeightedGraph0, (Set<Edge<Locale.Category>>) hashSet1, (Set<Edge<Locale.Category>>) treeSet0);
	      assertNotNull(weighted0);
	  }

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      double[][] doubleArray0 = new double[4][9];
	      double[] doubleArray1 = new double[8];
	      doubleArray1[3] = 0.7717746453258231;
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
	      assertNotNull(weighted0);
	  }

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	      LinkedHashSet<Weighted<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<String>>>();
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) linkedHashSet0);
	      ChuLiuEdmonds.PartialSolution<String> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<String>) sparseWeightedGraph0);
	      Edge<String> edge0 = new Edge<String>("", "");
	      LinkedList<Edge<String>> linkedList0 = new LinkedList<Edge<String>>();
	      ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<String>>) linkedList0, 0.0);
	      // Undeclared exception!
	      try { 
	        chuLiuEdmonds_PartialSolution0.addEdge(exclusiveEdge0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	      Stack<String> stack0 = new Stack<String>();
	      ArrayList<String> arrayList0 = new ArrayList<String>(stack0);
	      HashSet<Weighted<Edge<String>>> hashSet0 = new HashSet<Weighted<Edge<String>>>();
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) arrayList0, (Iterable<Weighted<Edge<String>>>) hashSet0);
	      Weighted<Arborescence<String>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) sparseWeightedGraph0, "");
	      assertNotNull(weighted0);
	  }

	

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      double[][] doubleArray0 = new double[4][1];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      // Undeclared exception!
	     
	  }

	 

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      ArrayList<Arborescence<Locale.Category>> arrayList0 = new ArrayList<Arborescence<Locale.Category>>(0);
	      double[][] doubleArray0 = new double[1][6];
	      Arborescence<Locale.Category> arborescence0 = Arborescence.of((ImmutableMap<Locale.Category, Locale.Category>) null);
	      arrayList0.add(arborescence0);
	      double[] doubleArray1 = new double[0];
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Arborescence<Locale.Category>> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Arborescence<Locale.Category>>) arrayList0, doubleArray0);
	      // Undeclared exception!
	    
	  }

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      double[][] doubleArray0 = new double[5][3];
	      double[] doubleArray1 = new double[2];
	      doubleArray1[1] = Double.NEGATIVE_INFINITY;
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      // Undeclared exception!
	    
	  }

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      Vector<Arborescence<String>> vector0 = new Vector<Arborescence<String>>();
	      HashSet<Weighted<Edge<Arborescence<String>>>> hashSet0 = new HashSet<Weighted<Edge<Arborescence<String>>>>();
	      SparseWeightedGraph<Arborescence<String>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Arborescence<String>>) vector0, (Iterable<Weighted<Edge<Arborescence<String>>>>) hashSet0);
	      ChuLiuEdmonds.PartialSolution<Arborescence<String>> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Arborescence<String>>) sparseWeightedGraph0);
	      Optional<ExclusiveEdge<Arborescence<String>>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge((Arborescence<String>) null);
	      assertNotNull(optional0);
	  }

	

	 

	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {
	      LinkedHashSet<Edge<ExclusiveEdge<Weighted<Edge<Object>>>>> linkedHashSet0 = new LinkedHashSet<Edge<ExclusiveEdge<Weighted<Edge<Object>>>>>();
	      // Undeclared exception!
	     
	  }

	

	  @Test(timeout = 4000)
	  public void test14()  throws Throwable  {
	      ChuLiuEdmonds chuLiuEdmonds0 = new ChuLiuEdmonds();
	  }

}
