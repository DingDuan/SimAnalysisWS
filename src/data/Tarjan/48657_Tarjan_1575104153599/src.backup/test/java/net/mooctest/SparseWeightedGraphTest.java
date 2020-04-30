package net.mooctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.TreeSet;

import org.junit.Test;

public class SparseWeightedGraphTest {
	  @Test
	  public void test00(){
		  LinkedHashSet<Weighted<Edge<Object>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<Object>>>();
	      Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = Weighted.weighted(integer0, (double) 0);
	      Edge<Object> edge0 = new Edge<Object>(linkedHashSet0, weighted0);
	      Weighted<Edge<Object>> weighted1 = Weighted.weighted(edge0, 0.0);
	      linkedHashSet0.add(weighted1);
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) linkedHashSet0);
	        fail("Expecting exception: StackOverflowError");
	      
	      } catch(StackOverflowError e) {
	
	      }
	  }


	@Test
	  public void test01(){
		Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
	      EnumSet<Locale.FilteringMode> enumSet0 = EnumSet.of(locale_FilteringMode0, locale_FilteringMode0);
	      ArrayDeque<Weighted<Edge<Locale.FilteringMode>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Locale.FilteringMode>>>();
	      Edge<Locale.FilteringMode> edge0 = new Edge<Locale.FilteringMode>(locale_FilteringMode0, locale_FilteringMode0);
	      Weighted<Edge<Locale.FilteringMode>> weighted0 = new Weighted<Edge<Locale.FilteringMode>>(edge0, 0.0);
	      arrayDeque0.addFirst(weighted0);
	      arrayDeque0.offerLast(weighted0);
	      SparseWeightedGraph<Locale.FilteringMode> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.FilteringMode>) enumSet0, (Iterable<Weighted<Edge<Locale.FilteringMode>>>) arrayDeque0);
	      assertNotNull(sparseWeightedGraph0);
	  }

	  @Test
	  public void test02(){
		  TreeSet<String> treeSet0 = new TreeSet<String>();
	      PriorityQueue<Weighted<Edge<String>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<String>>>(1);
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) treeSet0, (Iterable<Weighted<Edge<String>>>) priorityQueue0);
	      double double0 = sparseWeightedGraph0.getWeightOf("", "");
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);

	  }

	  @Test
	  public void test03(){
		  
	  }

	  @Test
	  public void test04(){
		  
	  }

	  @Test
	  public void test05(){
		  
	  }

	  @Test
	  public void test06(){
		  
	  }

	  @Test
	  public void test07(){
		  
	  }
}
