package net.mooctest;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Multiset.Entry;


public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		heap.add(1, 2);
		assertEquals(heap.size(), 1);
		heap.add(100, 2);
		assertEquals(heap.size(), 2);
		heap.add(-103, 201);
//		System.out.println(heap.pollOption());
		heap.pollOption();
		heap.comparator();
//		System.out.println(heap.size());
		heap.size();
		FibonacciHeap.Entry entry = null;
//		System.out.println(heap.pollOption());
		heap.pollOption();
		assertNotEquals(heap.pollOption(), Optional.of(100));
		try {
			heap.remove(entry);
		} catch (Exception e) {
		}
		assertTrue(heap.isEmpty());
		heap.add(-103, 2010);
		heap.add(-1003, 2012);
		assertFalse(heap.isEmpty());
		heap.add(-1031, 2015);
		Iterator<FibonacciHeap<Integer, Integer>.Entry> it = heap.iterator();
		while (it.hasNext()) {
			if (it.next().value == -103) {
				heap.remove(it.next());
			}
			heap.decreasePriority(it.next(),1003);
		}
		FibonacciHeap<Integer,Integer> heap1 = FibonacciHeap.create();
		heap1.add(-1003, 2012);
		assertFalse(heap.isEmpty());
		heap1.add(-1031, 2015);
		FibonacciHeap<Integer,Integer> heap2 = heap1.merge(heap, heap1);
		assertEquals(heap.size(), 2);
		heap.peekOption();
		heap.clear();
		
		
	}
	@Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      Comparator<Object> comparator0 = new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	      FibonacciHeap<Object, FibonacciHeap.Entry> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super FibonacciHeap.Entry>) comparator0);
	      fibonacciHeap0.comparator();
	      assertEquals(0, fibonacciHeap0.size());
	  }
	@Test(timeout = 4000)
	  public void test20()  throws Throwable  {
	      FibonacciHeap<FibonacciHeap<String, Object>, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      fibonacciHeap0.clear();
	      assertEquals(0, fibonacciHeap0.size());
	      FibonacciHeap<String, Integer> fibonacciHeap1 = FibonacciHeap.create();
	      Integer integer0 = new Integer(0);
	      fibonacciHeap1.add("", integer0);
	      fibonacciHeap1.add("", integer0);
	      FibonacciHeap.merge(fibonacciHeap1, fibonacciHeap1);
	      assertEquals(2, fibonacciHeap1.size());
	      
	      Comparator<Object> comparator0 = new Comparator<Object>() {
				@Override
				public int compare(Object o1, Object o2) {
					return 0;
				}
			};
	      FibonacciHeap<Object, Integer> fibonacciHeap01 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
	      Integer integer01 = new Integer(0);
	      try { 
	    	  fibonacciHeap01.decreasePriority((FibonacciHeap.Entry) null, integer01);
	      } catch(NullPointerException e) {
	      }
	  }
	@Test(timeout = 4000)
	  public void test009()  throws Throwable  {
	     ChuLiuEdmonds chuLiuEdmonds = new ChuLiuEdmonds();
	     Weighted<Integer> weighted = new Weighted<Integer>(10, 5.1);
	     Vector<Weighted<Edge<Weighted<Edge<Object>>>>> vector0 = new Vector<Weighted<Edge<Weighted<Edge<Object>>>>>();
	      SparseWeightedGraph<Weighted<Edge<Object>>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Weighted<Edge<Object>>>>>) vector0);
	     
	      LinkedHashSet<Edge<Weighted<Edge<Object>>>> linkedHashSet0 = new LinkedHashSet<Edge<Weighted<Edge<Object>>>>();
	      LinkedHashSet<Edge<Weighted<Edge<Object>>>> linkedHashSet1 = new LinkedHashSet<Edge<Weighted<Edge<Object>>>>();
//	      System.out.println(linkedHashSet0.size());
	      assertEquals(linkedHashSet0.size(), 0);
	      Edge<Object> edge = new Edge<Object>(10, 20);
	      Weighted<Edge<Object>> weighted1 = new Weighted<Edge<Object>>(edge, 10.1);
	      
	      Edge<Object> edge12 = new Edge<Object>(1, 1);
	      Weighted<Edge<Object>> weighted112 = new Weighted<Edge<Object>>(edge12, 1.0);
//	      System.out.println(sparseWeightedGraph0.getWeightOf(weighted112,weighted112));
	      sparseWeightedGraph0.getWeightOf(weighted112,weighted112);
	      Edge<Weighted<Edge<Object>>> edge1 = new Edge<Weighted<Edge<Object>>>(weighted1, weighted1);
	      Edge<Object> edge10 = new Edge<Object>(10, 20);
	      Weighted<Edge<Object>> weighted10 = new Weighted<Edge<Object>>(edge10, 10.1);
	      Edge<Weighted<Edge<Object>>> edge100 = new Edge<Weighted<Edge<Object>>>(weighted10, weighted1);
	      linkedHashSet0.add(edge100);
	      assertEquals(linkedHashSet0.size(), 1);
	      assertEquals(linkedHashSet0.hashCode(), 1660159617);
	      assertFalse(linkedHashSet0.isEmpty());
	      assertFalse(linkedHashSet0.remove(1));
	      assertTrue(linkedHashSet0.remove(edge100));
	      linkedHashSet0.add(edge100);
	      assertTrue(linkedHashSet0.contains(edge100));
	      assertFalse(linkedHashSet0.equals(edge100));
//	      System.out.println(linkedHashSet0.equals(edge100));
	      double[][] doubleArray0 = new double[3][5];
	      double[] doubleArray1 = new double[5];
	      doubleArray1[1] = 0.9978359755859375;
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      List<Integer> is = new ArrayList<Integer>();
	      is.add(0);
	      is.add(1);
	      is.add(2);
	      assertEquals(is, denseWeightedGraph0.getNodes());
//	      System.out.println(denseWeightedGraph0.getNodes());
	      Integer integer0 = new Integer((-1));
	      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, integer0);
	      doubleArray0 = new double[30][51];
	      doubleArray1 = new double[5];
	      doubleArray1[1] = 0.9978359755859375;
	      doubleArray0[0] = doubleArray1;
	      denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      List<Integer> is1 = new ArrayList<Integer>();
	      for(int i=0;i<30;i++) {
	    	  is1.add(i);
	      }
	      assertEquals(is1, denseWeightedGraph0.getNodes());
	      integer0 = new Integer((-1));
	      doubleArray0 = new double[30][51];
	      doubleArray1 = new double[5];
	      doubleArray1[1] = 0.9978359755859375;
	      doubleArray0[0] = doubleArray1;
	      denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      integer0 = new Integer((-1));doubleArray0 = new double[30][51];
	      doubleArray1 = new double[5];
	      doubleArray1[1] = 0.9978359755859375;
	      doubleArray0[0] = doubleArray1;
	      doubleArray1[2] = 0.122;
	      denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      integer0 = new Integer((-1));  
//	      System.out.println(denseWeightedGraph0.getWeightOf(10, 20));
	      assertEquals(denseWeightedGraph0.getWeightOf(10, 20), 0, 0.0001);
	      Edge.isIn(linkedHashSet0).hashCode();
//	      System.out.println(Edge.isIn(linkedHashSet0));
	  }
	@Test(timeout = 4000)
	  public void test002()  throws Throwable  {
	      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
	      Stack<Weighted<Edge<Integer>>> stack0 = new Stack<Weighted<Edge<Integer>>>();
	      Integer integer0 = new Integer(31);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
	      Integer integer1 = new Integer(31);
	      Weighted<Edge<Integer>> weighted0 = Weighted.weighted(edge0, (double) 0);
	      stack0.add(weighted0);
	      SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Integer>) arrayList0, (Iterable<Weighted<Edge<Integer>>>) stack0);
	      double double0 = sparseWeightedGraph0.getWeightOf(integer1, integer0);
	      assertEquals(0.0, double0, 0.01);
	      HashSet<Weighted<Edge<HashMap<String, Object>>>> hashSet0 = new HashSet<Weighted<Edge<HashMap<String, Object>>>>();
	      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
	      hashMap0.put("", hashSet0);
	  }
	
	@Test(timeout = 4000)
	  public void test00222()  throws Throwable  {
	      Pair<Integer, Integer> pair = new Pair<Integer, Integer>(10, 20);
	      Pair<Integer, Integer> pair1 = new Pair<Integer, Integer>(100, 20);
	      assertEquals(1291, pair.hashCode());
	      assertEquals((Integer)10, pair.first);
	      assertTrue(pair.equals(pair));
	      assertFalse(pair.equals(pair1));
	      String aString = "Pair{first=10, second=20}";
	      assertEquals(aString, pair.toString());
	      Pair<String, Object> pair0 = new Pair<String, Object>("", "");
	      boolean boolean0 = pair0.equals("");
	      assertFalse(boolean0);
//	      System.out.println(pair.toString());
	      Pair<Object, Object> pair00 = Pair.of((Object) "", (Object) "");
	      Pair<String, Object> pair10 = new Pair<String, Object>("", pair00);
	      Pair<String, String> pair20 = new Pair<String, String>("", "");
	      Pair<Pair<String, String>, Object> pair30 = Pair.of(pair20, (Object) pair10);
	      boolean boolean00 = pair30.equals(pair0);
	      assertFalse(boolean00);
	  }
	@Test(timeout = 4000)
	  public void test00221()  throws Throwable  {
	    Weighted<Integer> weighted = new Weighted<Integer>(10, 10.1);
	    Weighted<Integer> weighted12 = new Weighted<Integer>(10, 10.2);
	    String iString = "Weighted{val=10, weight=10.1}";
	    assertEquals(iString, weighted.toString());
	    assertTrue(weighted.equals(weighted));
	    assertFalse(weighted.equals(weighted12));
	    assertFalse(weighted.equals(1));
	    assertFalse(weighted.equals(null));
	    
	    
	    Weighted<String> weighted0 = Weighted.weighted("", 0.0);
	      Weighted<String> weighted1 = new Weighted<String>("", 0.95953857421875);
	      int int0 = weighted1.compareTo(weighted0);
	      assertEquals((-1), int0);
	  }
	
	@Test(timeout = 4000)
	  public void test00201()  throws Throwable  {
	    Edge<Integer> edge = new Edge<Integer>(10, 11);
	    Edge<Integer> edge1 = new Edge<Integer>(10, 111);
	    String iString = "Edge{source=10, destination=11}";
	    assertEquals(iString, edge.toString());
	    assertTrue(edge.equals(edge));
	    assertFalse(edge.equals(edge1));
	    assertFalse(edge.equals(1));
	    assertFalse(edge.equals(null));
	    
	  }
	 @Test(timeout = 4000)
	  public void test003()  throws Throwable  {
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
	      Edge<Object> edge0 = new Edge<Object>(linkedHashSet0, linkedHashSet0);
	      linkedHashSet0.add(edge0);
	      Edge.competesWith((Set<Edge<Object>>) linkedHashSet0);
	      Edge.competesWith((Set<Edge<Object>>) linkedHashSet0);
	      Edge.isAutoCycle();

	  }

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {
		  Comparator<Object> comparator0 = null;
	      PriorityQueue<Weighted<Edge<Pair<Double, Object>>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Pair<Double, Object>>>>(1, comparator0);
	      SparseWeightedGraph<Pair<Double, Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Pair<Double, Object>>>>) priorityQueue0);
	      Double double0 = new Double(0);
	      Locale.Category locale_Category0 = Locale.Category.FORMAT;
	      Pair<Double, Object> pair0 = new Pair<Double, Object>(double0, locale_Category0);
	      List<Weighted<Arborescence<Pair<Double, Object>>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Pair<Double, Object>>) sparseWeightedGraph0, pair0, 2);
	      assertEquals(1, list0.size());
	      try {
	    	  WeightedGraph<Integer> iGraph = new WeightedGraph<Integer>() {

	  			@Override
	  			public Collection<Integer> getNodes() {
	  				// TODO Auto-generated method stub
	  				return null;
	  			}

	  			@Override
	  			public double getWeightOf(Integer source, Integer dest) {
	  				// TODO Auto-generated method stub
	  				return 0;
	  			}

	  			@Override
	  			public Collection<Weighted<Edge<Integer>>> getIncomingEdges(Integer destinationNode) {
	  				// TODO Auto-generated method stub
	  				return null;
	  			}};
	  			Predicate<Edge<Integer>> predicate = new Predicate<Edge<Integer>>() {

	  				@Override
	  				public boolean apply(Edge<Integer> arg0) {
	  					// TODO Auto-generated method stub
	  					return false;
	  				}};
	  			iGraph.filterEdges(predicate);
	  		  KBestArborescences.getKBestArborescences(iGraph, (Integer)10, 10);
		} catch (Exception e) {
			// TODO: handle exception
		}
	    
	  }

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      ArrayDeque<Pair<String, String>> arrayDeque0 = new ArrayDeque<Pair<String, String>>();
	      TreeSet<Weighted<Edge<Pair<String, String>>>> treeSet0 = new TreeSet<Weighted<Edge<Pair<String, String>>>>();
	      Pair<String, String> pair0 = new Pair<String, String>("", (String) null);
	      Edge<Pair<String, String>> edge0 = new Edge<Pair<String, String>>(pair0, pair0);
	      Weighted<Edge<Pair<String, String>>> weighted0 = Weighted.weighted(edge0, 0.0);
	      treeSet0.add(weighted0);
	      arrayDeque0.add(pair0);
	      SparseWeightedGraph<Pair<String, String>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Pair<String, String>>) arrayDeque0, (Iterable<Weighted<Edge<Pair<String, String>>>>) treeSet0);
	      TreeSet<Edge<Pair<String, String>>> treeSet1 = new TreeSet<Edge<Pair<String, String>>>();
	      Arborescence<Pair<String, String>> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<Pair<String, String>>> weighted1 = Weighted.weighted(arborescence0, 0.0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Pair<String, String>>) sparseWeightedGraph0, (Set<Edge<Pair<String, String>>>) treeSet1, (Set<Edge<Pair<String, String>>>) treeSet1, weighted1);
	      } catch(ClassCastException e) {
	      }
	  }
	  
}
