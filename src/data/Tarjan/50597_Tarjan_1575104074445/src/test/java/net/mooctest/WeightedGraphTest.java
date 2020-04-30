package net.mooctest;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.TreeSet;

import org.junit.Test;

import com.google.common.base.Predicate;

public class WeightedGraphTest {

	 @Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      TreeSet<Weighted<Edge<Integer>>> treeSet0 = new TreeSet<Weighted<Edge<Integer>>>();
	      Integer integer0 = new Integer(0);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
	      Weighted<Edge<Integer>> weighted0 = new Weighted<Edge<Integer>>(edge0, 0.0);
	      treeSet0.add(weighted0);
	      SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Integer>>>) treeSet0);
	      double double0 = sparseWeightedGraph0.getWeightOf(integer0, integer0);
	      assertEquals(0.0, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test1()  throws Throwable  {
	      double[][] doubleArray0 = new double[1][0];
	      double[] doubleArray1 = new double[9];
	      doubleArray1[0] = 0.505096923828125;
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
	      assertEquals(0.505096923828125, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test2()  throws Throwable  {
	      HashSet<Weighted<Edge<Object>>> hashSet0 = new HashSet<Weighted<Edge<Object>>>(0, 0.9217742F);
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) hashSet0);
	      double double0 = sparseWeightedGraph0.getWeightOf(hashSet0, hashSet0);
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test3()  throws Throwable  {
	      LinkedHashSet<Weighted<Edge<Weighted<Object>>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<Weighted<Object>>>>(0);
	      SparseWeightedGraph<Weighted<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Weighted<Object>>>>) linkedHashSet0);
	      Collection<Weighted<Object>> collection0 = sparseWeightedGraph0.getNodes();
	      assertNotNull(collection0);
	  }

	  @Test(timeout = 4000)
	  public void test4()  throws Throwable  {
	      HashSet<Weighted<Edge<Object>>> hashSet0 = new HashSet<Weighted<Edge<Object>>>(0, 0.9217742F);
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) hashSet0);
	      Collection<Weighted<Edge<Object>>> collection0 = sparseWeightedGraph0.getIncomingEdges(hashSet0);
	      assertNotNull(collection0);
	  }

	  @Test(timeout = 4000)
	  public void test5()  throws Throwable  {
	      double[][] doubleArray0 = new double[6][2];
	      double[] doubleArray1 = new double[0];
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!
	      try { 
	        denseWeightedGraph0.getIncomingEdges(integer0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void test6()  throws Throwable  {
	      double[][] doubleArray0 = new double[9][8];
	      double[] doubleArray1 = new double[0];
	      doubleArray0[5] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      // Undeclared exception!
	      try { 
	        denseWeightedGraph0.filterEdges((Predicate<Edge<Integer>>) null);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 0
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void test7()  throws Throwable  {
	      LinkedList<Weighted<Edge<Locale.Category>>> linkedList0 = new LinkedList<Weighted<Edge<Locale.Category>>>();
	      Locale.Category locale_Category0 = Locale.Category.FORMAT;
	      Locale.Category locale_Category1 = Locale.Category.DISPLAY;
	      Edge<Locale.Category> edge0 = new Edge<Locale.Category>(locale_Category0, locale_Category1);
	      Weighted<Edge<Locale.Category>> weighted0 = new Weighted<Edge<Locale.Category>>(edge0, 0.0);
	      linkedList0.add(weighted0);
	      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.Category>>>) linkedList0);
	      // Undeclared exception!
	      try { 
	        sparseWeightedGraph0.filterEdges((Predicate<Edge<Locale.Category>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	      
	      }
	  }

	  @Test(timeout = 4000)
	  public void test8()  throws Throwable  {
	      LinkedList<Weighted<Edge<Locale.Category>>> linkedList0 = new LinkedList<Weighted<Edge<Locale.Category>>>();
	      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.Category>>>) linkedList0);
	      WeightedGraph<Locale.Category> weightedGraph0 = sparseWeightedGraph0.filterEdges((Predicate<Edge<Locale.Category>>) null);
	      assertNotNull(weightedGraph0);
	  }
}
