package net.mooctest;

import static org.junit.Assert.*;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import org.junit.Test;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
public class KBestArborescencesTest {

	

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      ArrayDeque<Weighted<Edge<Integer>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Integer>>>();
	      SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Integer>>>) arrayDeque0);
	      Integer integer0 = new Integer(0);
	      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) sparseWeightedGraph0, integer0, 3);
	      assertFalse(list0.isEmpty());
	  }

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	      Arborescence<KBestArborescences> arborescence0 = Arborescence.of((ImmutableMap<KBestArborescences, KBestArborescences>) null);
	      Weighted<Arborescence<KBestArborescences>> weighted0 = Weighted.weighted(arborescence0, 0.0);
	      TreeSet<Edge<KBestArborescences>> treeSet0 = new TreeSet<Edge<KBestArborescences>>();
	      TreeSet<KBestArborescences> treeSet1 = new TreeSet<KBestArborescences>();
	      PriorityQueue<KBestArborescences> priorityQueue0 = new PriorityQueue<KBestArborescences>((SortedSet<? extends KBestArborescences>) treeSet1);
	      PriorityQueue<Weighted<Edge<KBestArborescences>>> priorityQueue1 = new PriorityQueue<Weighted<Edge<KBestArborescences>>>();
	      SparseWeightedGraph<KBestArborescences> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<KBestArborescences>) priorityQueue0, (Iterable<Weighted<Edge<KBestArborescences>>>) priorityQueue1);
	      LinkedHashSet<Edge<KBestArborescences>> linkedHashSet0 = new LinkedHashSet<Edge<KBestArborescences>>(treeSet0);
	      Optional<Weighted<KBestArborescences.SubsetOfSolutions<KBestArborescences>>> optional0 = KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<KBestArborescences>) sparseWeightedGraph0, (Set<Edge<KBestArborescences>>) treeSet0, (Set<Edge<KBestArborescences>>) linkedHashSet0, weighted0);
	      assertNotNull(optional0);
	  }

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	      ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of((Edge<Object>) null, (List<Edge<Object>>) null, 0.0);
	      Arborescence<Object> arborescence0 = Arborescence.empty();
	      // Undeclared exception!
	      try { 
	        KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<Object>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	 
	  

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      double[][] doubleArray0 = new double[6][8];
	      double[] doubleArray1 = new double[3];
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<Integer>> weighted0 = new Weighted<Arborescence<Integer>>(arborescence0, 0.0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) hashSet0, weighted0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 3
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) null, integer0, 0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      double[][] doubleArray0 = new double[6][6];
	      double[] doubleArray1 = new double[5];
	      doubleArray0[2] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 5
	         //
	        
	      }
	  }

	 

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      double[][] doubleArray0 = new double[2][4];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<Integer>> weighted0 = Weighted.weighted(arborescence0, (double) 0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) hashSet0, weighted0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	       
	      }
	  }

	 

	 

	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {
	      KBestArborescences kBestArborescences0 = new KBestArborescences();
	  }

	  @Test(timeout = 4000)
	  public void test13()  throws Throwable  {
	      TreeSet<Weighted<Edge<Object>>> treeSet0 = new TreeSet<Weighted<Edge<Object>>>();
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) treeSet0);
	      Locale.Category locale_Category0 = Locale.Category.FORMAT;
	      List<Weighted<Arborescence<Object>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Object>) sparseWeightedGraph0, (Object) locale_Category0, 0);
	      assertEquals(0, list0.size());
	  }

}
