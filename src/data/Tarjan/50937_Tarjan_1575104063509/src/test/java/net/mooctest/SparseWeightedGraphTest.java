package net.mooctest;



import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;


import org.junit.Test;

public class SparseWeightedGraphTest {

	@Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      Stack<Weighted<Edge<Vector<String>>>> stack0 = new Stack<Weighted<Edge<Vector<String>>>>();
	      Vector<String> vector0 = new Vector<String>();
	      Edge<Vector<String>> edge0 = new Edge<Vector<String>>(vector0, vector0);
	      Weighted<Edge<Vector<String>>> weighted0 = Weighted.weighted(edge0, 0.9666527711760801);
	      stack0.add(weighted0);
	      SparseWeightedGraph<Vector<String>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Vector<String>>>>) stack0);
	      double double0 = sparseWeightedGraph0.getWeightOf(vector0, vector0);
	      assertEquals(0.9666527711760801, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      TreeSet<Weighted<Edge<Locale.FilteringMode>>> treeSet0 = new TreeSet<Weighted<Edge<Locale.FilteringMode>>>();
	     
	  }

	

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	      Vector<Weighted<Edge<Object>>> vector0 = new Vector<Weighted<Edge<Object>>>(0);
	      Object object0 = new Object();
	      Integer integer0 = new Integer(0);
	      Edge<Object> edge0 = new Edge<Object>(object0, integer0);
	      Edge<Object> edge1 = new Edge<Object>(edge0, vector0);
	      Weighted<Edge<Object>> weighted0 = new Weighted<Edge<Object>>(edge1, 0);
	      vector0.add(weighted0);
	      // Undeclared exception!
	      
	  }

	


	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {
	      Vector<Weighted<Object>> vector0 = new Vector<Weighted<Object>>();
	      Stack<Weighted<Edge<Weighted<Object>>>> stack0 = new Stack<Weighted<Edge<Weighted<Object>>>>();
	      SparseWeightedGraph<Weighted<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Object>>) vector0, (Iterable<Weighted<Edge<Weighted<Object>>>>) stack0);
	      PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>(1);
	      ArrayList<Weighted<Edge<Object>>> arrayList0 = new ArrayList<Weighted<Edge<Object>>>();
	      Edge<Object> edge0 = new Edge<Object>(sparseWeightedGraph0, vector0);
	      Weighted<Edge<Object>> weighted0 = Weighted.weighted(edge0, 0.0);
	      arrayList0.add(weighted0);
	      arrayList0.add(weighted0);
	      SparseWeightedGraph<Object> sparseWeightedGraph1 = SparseWeightedGraph.from((Iterable<Object>) priorityQueue0, (Iterable<Weighted<Edge<Object>>>) arrayList0);
	      assertNotNull(sparseWeightedGraph1);
	  }

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      ArrayDeque<String> arrayDeque0 = new ArrayDeque<String>();
	      LinkedHashSet<Weighted<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<String>>>();
	      Edge<String> edge0 = new Edge<String>("", "");
	      Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, 0.0);
	      linkedHashSet0.add(weighted0);
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) arrayDeque0, (Iterable<Weighted<Edge<String>>>) linkedHashSet0);
	      Collection<Weighted<Edge<String>>> collection0 = sparseWeightedGraph0.getIncomingEdges("");
	      assertTrue(collection0.contains(weighted0));
	  }

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
	      Edge<Locale.FilteringMode> edge0 = new Edge<Locale.FilteringMode>(locale_FilteringMode0, locale_FilteringMode0);
	      PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>(1);
	      ArrayList<Weighted<Edge<Object>>> arrayList0 = new ArrayList<Weighted<Edge<Object>>>();
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) priorityQueue0, (Iterable<Weighted<Edge<Object>>>) arrayList0);
	      Collection<Weighted<Edge<Object>>> collection0 = sparseWeightedGraph0.getIncomingEdges(edge0);
	      assertNotNull(collection0);
	  }

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      HashSet<Weighted<Edge<Locale.FilteringMode>>> hashSet0 = new HashSet<Weighted<Edge<Locale.FilteringMode>>>();
	      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
	      Locale.FilteringMode locale_FilteringMode1 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
	      Edge<Locale.FilteringMode> edge0 = new Edge<Locale.FilteringMode>(locale_FilteringMode0, locale_FilteringMode1);
	      Weighted<Edge<Locale.FilteringMode>> weighted0 = new Weighted<Edge<Locale.FilteringMode>>(edge0, 0.0);
	      hashSet0.add(weighted0);
	      SparseWeightedGraph<Locale.FilteringMode> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.FilteringMode>>>) hashSet0);
	      double double0 = sparseWeightedGraph0.getWeightOf(locale_FilteringMode1, locale_FilteringMode1);
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      Stack<Weighted<Edge<Vector<String>>>> stack0 = new Stack<Weighted<Edge<Vector<String>>>>();
	      Vector<String> vector0 = new Vector<String>();
	      Edge<Vector<String>> edge0 = new Edge<Vector<String>>(vector0, vector0);
	      Weighted<Edge<Vector<String>>> weighted0 = Weighted.weighted(edge0, 0.0);
	      stack0.add(weighted0);
	      SparseWeightedGraph<Vector<String>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Vector<String>>>>) stack0);
	      double double0 = sparseWeightedGraph0.getWeightOf(vector0, vector0);
	      assertEquals(0.0, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {
	      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
	      Edge<Locale.FilteringMode> edge0 = new Edge<Locale.FilteringMode>(locale_FilteringMode0, locale_FilteringMode0);
	      PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>(1);
	      ArrayList<Weighted<Edge<Object>>> arrayList0 = new ArrayList<Weighted<Edge<Object>>>();
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) priorityQueue0, (Iterable<Weighted<Edge<Object>>>) arrayList0);
	      Weighted<Locale.FilteringMode> weighted0 = Weighted.weighted(locale_FilteringMode0, (double) 0);
	      double double0 = sparseWeightedGraph0.getWeightOf(edge0, weighted0);
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	  }

	 

}
