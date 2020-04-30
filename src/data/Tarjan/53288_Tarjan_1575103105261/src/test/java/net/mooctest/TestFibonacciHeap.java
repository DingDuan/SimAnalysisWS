package net.mooctest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Predicate;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import org.junit.Test;


public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
        assertEquals(true, heap.isEmpty());
        
	}

	@Test
	public void test1() {
		Edge<String> e = new Edge<String>("123", "234");
		
//        assertEquals(true, heap.isEmpty());

	}
	
	@Test
	public void test2() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
        heap.add(1, 2);
		assertEquals(false, heap.isEmpty());
		assertEquals(1, heap.size());

		heap.clear();
		assertEquals(true, heap.isEmpty());
		assertEquals(0, heap.size());

	}
	
	@Test
	public void test3() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> heap2 = FibonacciHeap.create();

        heap.add(1, 2);
        heap2.add(2, 3);
        heap2.add(3, 4);
        FibonacciHeap<Integer,Integer> heap3 = FibonacciHeap.merge(heap, heap2);
        
		assertEquals(false, heap3.isEmpty());
		assertEquals(3, heap3.size());

		heap.clear();
		assertEquals(true, heap.isEmpty());
		assertEquals(0, heap.size());

	}

	@Test
	public void test4() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		Optional p = heap.pollOption();
		assertEquals(1502476572, p.hashCode());
		Optional p2 = heap.pollOption();

		heap.add(2, 3);
		assertEquals(1502476572, p2.hashCode());


	}

	@Test
	public void test5() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		Optional p = heap.peekOption();
		assertEquals(1502476572, p.hashCode());

		heap.add(2, 3);
		Optional p2 = heap.peekOption();

//		assertEquals(-1620359178, p2.hashCode());

	}
	
	@Test(timeout = 4000)
	  public void test_edge_00()  throws Throwable  {
	      Edge.hasDestination((Object) "qb*.x~r/~%>/+)$1^");
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
	      Edge.isIn((Set<Edge<Object>>) linkedHashSet0);
	      LinkedHashSet<Edge<Edge<String>>> linkedHashSet1 = new LinkedHashSet<Edge<Edge<String>>>();
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("qb*.x~r/~%>/+)$1^");
	      Edge<String> edge0 = edge_EdgeBuilder0.to("6u$!%2d");
	      Edge<String> edge1 = edge_EdgeBuilder0.to("6u$!%2d");
	      Edge<Edge<String>> edge2 = new Edge<Edge<String>>(edge1, edge0);
	      linkedHashSet1.add(edge2);
	      Edge<Edge<String>> edge3 = new Edge<Edge<String>>(edge0, edge0);
	      linkedHashSet1.add(edge3);
	      // Undeclared exception!
	      try { 
	        Edge.competesWith((Set<Edge<Edge<String>>>) linkedHashSet1);
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // Multiple entries with same key: Edge{source=qb*.x~r/~%>/+)$1^, destination=6u$!%2d}=Edge{source=qb*.x~r/~%>/+)$1^, destination=6u$!%2d} and Edge{source=qb*.x~r/~%>/+)$1^, destination=6u$!%2d}=Edge{source=qb*.x~r/~%>/+)$1^, destination=6u$!%2d}
	         //
	      }
	  }


	  @Test(timeout = 4000)
	  public void test_edge_02()  throws Throwable  {
	      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("U>At0");
	      Edge<String> edge0 = edge_EdgeBuilder0.to("");
	      Edge.isAutoCycle();
	      LinkedList<Object> linkedList0 = new LinkedList<Object>();
	      linkedList0.stream();
	      linkedList0.add((Object) "");
	      linkedHashSet0.containsAll(linkedList0);
	      Edge<String> edge1 = new Edge<String>("U>At0", "");
	      linkedHashSet0.add(edge1);
	      linkedHashSet0.add(edge0);
	      Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
	      edge1.toString();
	      Edge.isAutoCycle();
	      LinkedHashSet<Edge<Integer>> linkedHashSet1 = new LinkedHashSet<Edge<Integer>>();
	      Edge.isIn((Set<Edge<Integer>>) linkedHashSet1);
	      Edge<Object> edge2 = new Edge<Object>(linkedHashSet1, "");
	      edge2.toString();
	      Edge.competesWith((Set<Edge<Integer>>) linkedHashSet1);
	      Integer integer0 = new Integer((-2236));
	      Edge.hasDestination(integer0);
	      Edge.EdgeBuilder<Integer> edge_EdgeBuilder1 = Edge.from(integer0);
	      Integer integer1 = new Integer((-2236));
	      edge_EdgeBuilder1.to(integer1);
	      edge1.toString();
	      LinkedHashSet<Edge<Edge<Object>>> linkedHashSet2 = new LinkedHashSet<Edge<Edge<Object>>>();
	      Edge.isIn((Set<Edge<Edge<Object>>>) linkedHashSet2);
	      edge1.hashCode();
	      Integer integer2 = new Integer(0);
	      edge2.equals(integer2);
	      edge2.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void test_edge_03()  throws Throwable  {
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      Integer integer0 = null;
	      Edge<Integer> edge0 = new Edge<Integer>((Integer) null, (Integer) null);
	      edge0.toString();
	      linkedHashSet0.add(edge0);
	      // Undeclared exception!
	      try { 
	        Edge.competesWith((Set<Edge<Integer>>) linkedHashSet0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // null key in entry: null=null
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_edge_04()  throws Throwable  {
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("net.mooctest_edge_.Edge$4");
	      Edge<String> edge0 = edge_EdgeBuilder0.to("net.mooctest_edge_.Edge$4");
	      Edge<String> edge1 = edge_EdgeBuilder0.to("net.mooctest_edge_.Edge$4");
	      boolean boolean0 = edge0.equals(edge1);
	      //  // Unstable assertion: assertFalse(boolean0);
	      
	      LinkedHashSet<Edge<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<String>>>();
	      Edge.competesWith((Set<Edge<Edge<String>>>) linkedHashSet0);
	      Edge<Object> edge2 = new Edge<Object>(edge1, "net.mooctest_edge_.Edge$4");
	      String string0 = edge2.toString();
	      //  // Unstable assertion: assertEquals("Edge{source=Edge{source=net.mooctest_edge_.Edge$4, destination=net.mooctest_edge_.Edge$4}, destination=net.mooctest_edge_.Edge$4}", string0);
	      
	      edge2.equals(edge1);
	      edge0.hashCode();
	      //  // Unstable assertion: assertFalse(edge0.equals((Object)edge1));
	  }




	  @Test(timeout = 4000)
	  public void test_edge_07()  throws Throwable  {
	      Integer integer0 = new Integer(336);
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) integer0);
	      edge_EdgeBuilder0.to(integer0);
	      Edge<String> edge0 = new Edge<String>((String) null, "FY[*");
	      boolean boolean0 = edge0.equals(integer0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_edge_08()  throws Throwable  {
	      Edge<Object> edge0 = new Edge<Object>((Object) null, "93t-&Y<8MW#ODCSC)");
	      edge0.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void test_edge_09()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Integer integer1 = new Integer(2);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer1);
	      String string0 = edge0.toString();
	      assertEquals("Edge{source=0, destination=2}", string0);
	  }

	  @Test(timeout = 4000)
	  public void test_edge_10()  throws Throwable  {
	      Object object0 = new Object();
	      Edge<Object> edge0 = new Edge<Object>(object0, object0);
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      Edge.isIn((Set<Edge<Integer>>) linkedHashSet0);
	      edge0.toString();
	      String string0 = "";
	      Edge<String> edge1 = new Edge<String>("", "");
	      // Undeclared exception!
	      try { 
	        Edge.competesWith((Set<Edge<Object>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }


	  @Test(timeout = 4000)
	  public void test_edge_12()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Integer integer1 = new Integer((-1869));
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer1);
	      Integer integer2 = new Integer(0);
	      Edge<Object> edge1 = new Edge<Object>(integer0, integer2);
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
	      Edge<String> edge2 = edge_EdgeBuilder0.to("");
	      boolean boolean0 = edge1.equals(edge2);
	      assertFalse(boolean0);
	  }




	  @Test(timeout = 4000)
	  public void test_edge_16()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
	      String string0 = edge0.toString();
	      assertEquals("Edge{source=0, destination=0}", string0);
	  }

	  @Test(timeout = 4000)
	  public void test_edge_17()  throws Throwable  {
	      Object object0 = new Object();
	      Edge<Object> edge0 = new Edge<Object>(object0, object0);
	      edge0.hashCode();
	  }



	  @Test(timeout = 4000)
	  public void test_edge_19()  throws Throwable  {
	      Integer integer0 = new Integer((-1965));
	      Edge<Integer> edge0 = new Edge<Integer>((Integer) null, integer0);
	      boolean boolean0 = edge0.equals((Object) null);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_edge_20()  throws Throwable  {
	      Integer integer0 = new Integer(2022);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
	      boolean boolean0 = edge0.equals(integer0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_edge_21()  throws Throwable  {
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
	      Edge<String> edge0 = edge_EdgeBuilder0.to("com.google.common.base.Objects");
	      assertNotNull(edge0);
	  }

	  @Test(timeout = 4000)
	  public void test_edge_22()  throws Throwable  {
	      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
	      Edge<Object> edge0 = new Edge<Object>(linkedHashSet0, linkedHashSet0);
	      Edge.hasDestination((Object) linkedHashSet0);
	      linkedHashSet0.remove(edge0);
	      LinkedHashSet<Edge<Object>> linkedHashSet1 = new LinkedHashSet<Edge<Object>>();
	      linkedHashSet1.add(edge0);
	      Edge.competesWith(linkedHashSet1);
	      Edge.competesWith( linkedHashSet1);
	      Integer integer0 = new Integer(0);
	      Edge.EdgeBuilder<Integer> edge_EdgeBuilder0 = Edge.from(integer0);
	      Integer integer1 = new Integer(0);
	      Edge<Integer> edge1 = edge_EdgeBuilder0.to(integer1);
	      LinkedHashSet<Edge<Integer>> linkedHashSet2 = new LinkedHashSet<Edge<Integer>>();
	      Edge.isIn(linkedHashSet2);
	      Edge.isAutoCycle();
	      Edge<Edge<Object>> edge2 = new Edge<Edge<Object>>(edge0, edge0);
	      Edge<String> edge3 = new Edge<String>(": ", ": ");
	      Edge.isAutoCycle();
	      String string0 = edge3.source;
	      boolean boolean0 = edge2.equals(": ");
	      assertFalse(boolean0);
	      
	      Edge.isIn( linkedHashSet1);
	      Integer integer2 = new Integer((-1973));
	      Edge<Object> edge4 = new Edge<Object>(linkedHashSet1, integer2);
	      Edge.from((Object) edge4);
	      Integer integer3 = new Integer(0);
	      Edge<Integer> edge5 = edge_EdgeBuilder0.to(integer3);
	      String string1 = edge2.toString();
	      assertEquals("Edge{source=Edge{source=[], destination=[]}, destination=Edge{source=[], destination=[]}}", string1);
	      
	      Edge.from("Edge{source=Edge{source=[], destination=[]}, destination=Edge{source=[], destination=[]}}");
	      Edge<String> edge6 = new Edge<String>(": ", "Edge{source=Edge{source=[], destination=[]}, destination=Edge{source=[], destination=[]}}");
	      Integer integer4 = edge1.destination;
	      Edge.hasDestination((Object) integer4);
	      assertFalse(edge1.equals((Object)edge5));
	  }

	  @Test(timeout = 4000)
	  public void test_edge_23()  throws Throwable  {
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
	      Edge<String> edge0 = edge_EdgeBuilder0.to((String) null);
	      String string0 = edge0.source;
	      assertNotNull(string0);
	      
	      String string1 = edge_EdgeBuilder0.source;
	      Edge<Object> edge1 = new Edge<Object>("", "");
	      Edge.hasDestination((Object) edge1);
	      Edge.isAutoCycle();
	      Edge.EdgeBuilder<Integer> edge_EdgeBuilder1 = Edge.from((Integer) null);
	      Edge<Integer> edge2 = edge_EdgeBuilder1.to((Integer) null);
	      Edge.EdgeBuilder<Edge<Integer>> edge_EdgeBuilder2 = Edge.from(edge2);
	      edge_EdgeBuilder2.to(edge2);
	      String string2 = edge0.destination;
	      assertNull(string2);
	      
	      boolean boolean0 = edge1.equals((Object) null);
	      assertFalse(boolean0);
	  }


	  @Test(timeout = 4000)
	  public void test_02_00()  throws Throwable  {
	      TreeSet<Edge<String>> treeSet0 = new TreeSet<Edge<String>>();
	      double[][] doubleArray0 = new double[0][8];
	      DenseWeightedGraph<Edge<String>> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Edge<String>>) treeSet0, doubleArray0);
	      HashSet<Edge<Edge<String>>> hashSet0 = new HashSet<Edge<Edge<String>>>();
	      TreeSet<Edge<Edge<String>>> treeSet1 = new TreeSet<Edge<Edge<String>>>();
	      Weighted<Arborescence<Edge<String>>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Edge<String>>) denseWeightedGraph0, (Set<Edge<Edge<String>>>) hashSet0, (Set<Edge<Edge<String>>>) treeSet1);
	      assertEquals(0.0, weighted0.weight, 0.01);
	  }

//	  @Test(timeout = 4000)
//	  public void test_02_01()  throws Throwable  {
//	      ArrayDeque<Weighted<Edge<Integer>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Integer>>>();
//	      SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Integer>>>) arrayDeque0);
//	      ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) sparseWeightedGraph0);
//	      Edge<Integer> edge0 = (Edge<Integer>) mock(Edge.class, new ViolatedAssumptionAnswer());
//	      ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of(edge0, (double) 868);
//	      // Undeclared exception!
//	      try { 
//	        chuLiuEdmonds_PartialSolution0.addEdge(exclusiveEdge0);
//	        fail("Expecting exception: NullPointerException");
//	      
//	      } catch(NullPointerException e) {
//	         //
//	         // no message in exception (getMessage() returned null)
//	         //
//	      }
//	  }

	  @Test(timeout = 4000)
	  public void test_02_02()  throws Throwable  {
	      HashSet<Weighted<Edge<Object>>> hashSet0 = new HashSet<Weighted<Edge<Object>>>(1696);
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) hashSet0);
	      Integer integer0 = new Integer(1696);
	      Weighted<Arborescence<Object>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) sparseWeightedGraph0, (Object) integer0);
	      assertEquals(0.0, weighted0.weight, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test_02_03()  throws Throwable  {
	      TreeSet<Edge<Object>> treeSet0 = new TreeSet<Edge<Object>>();
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) null, (Set<Edge<Object>>) treeSet0, (Set<Edge<Object>>) treeSet0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_02_04()  throws Throwable  {
	      double[][] doubleArray0 = new double[5][6];
	      double[] doubleArray1 = new double[1];
	      doubleArray0[1] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) hashSet0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 1
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_02_05()  throws Throwable  {
	      double[][] doubleArray0 = new double[4][0];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, integer0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 0
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_02_06()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_02_07()  throws Throwable  {
	      double[][] doubleArray0 = new double[2][1];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 1
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_02_08()  throws Throwable  {
	      double[][] doubleArray0 = new double[2][1];
	      double[] doubleArray1 = new double[9];
	      doubleArray0[0] = doubleArray1;
	      doubleArray0[1] = doubleArray0[0];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
	      assertEquals(0.0, weighted0.weight, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test_02_09()  throws Throwable  {
	      double[][] doubleArray0 = new double[1][6];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);
	      assertNotNull(chuLiuEdmonds_PartialSolution0);
	  }

	  @Test(timeout = 4000)
	  public void test_02_10()  throws Throwable  {
	      ArrayDeque<ExclusiveEdge<Object>> arrayDeque0 = new ArrayDeque<ExclusiveEdge<Object>>();
	      Stack<Weighted<Edge<ExclusiveEdge<Object>>>> stack0 = new Stack<Weighted<Edge<ExclusiveEdge<Object>>>>();
	      SparseWeightedGraph<ExclusiveEdge<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<ExclusiveEdge<Object>>) arrayDeque0, (Iterable<Weighted<Edge<ExclusiveEdge<Object>>>>) stack0);
	      ChuLiuEdmonds.PartialSolution<ExclusiveEdge<Object>> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<ExclusiveEdge<Object>>) sparseWeightedGraph0);
	      Set<ExclusiveEdge<Object>> set0 = chuLiuEdmonds_PartialSolution0.getNodes();
	      assertEquals(0, set0.size());
	  }

	  @Test(timeout = 4000)
	  public void test_02_11()  throws Throwable  {
	      TreeSet<Weighted<Edge<String>>> treeSet0 = new TreeSet<Weighted<Edge<String>>>();
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) treeSet0);
	      ChuLiuEdmonds.PartialSolution<String> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<String>) sparseWeightedGraph0);
	      Optional<ExclusiveEdge<String>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge("%s (%s) must be less than size (%s)");
	      assertNotNull(optional0);
	  }

	  @Test(timeout = 4000)
	  public void test_02_12()  throws Throwable  {
	      Locale.Category locale_Category0 = Locale.Category.FORMAT;
	      EnumSet<Locale.Category> enumSet0 = EnumSet.of(locale_Category0, locale_Category0, locale_Category0, locale_Category0, locale_Category0);
	      Vector<Locale.Category> vector0 = new Vector<Locale.Category>(enumSet0);
	      LinkedList<Weighted<Edge<Locale.Category>>> linkedList0 = new LinkedList<Weighted<Edge<Locale.Category>>>();
	      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.Category>) vector0, (Iterable<Weighted<Edge<Locale.Category>>>) linkedList0);
	      ChuLiuEdmonds.PartialSolution<Locale.Category> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Locale.Category>) sparseWeightedGraph0);
	      Arborescence<Locale.Category> arborescence0 = Arborescence.empty();
	      Optional<ExclusiveEdge<Locale.Category>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge(locale_Category0, arborescence0);
	      assertNotNull(optional0);
	  }

	  @Test(timeout = 4000)
	  public void test_02_13()  throws Throwable  {
	      double[][] doubleArray0 = new double[2][1];
	      double[] doubleArray1 = new double[9];
	      doubleArray1[0] = Double.NEGATIVE_INFINITY;
	      doubleArray0[0] = doubleArray1;
	      doubleArray0[1] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
	      assertEquals(0.0, weighted0.weight, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test_02_14()  throws Throwable  {
	      double[][] doubleArray0 = new double[5][6];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
	      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) hashSet0);
	      assertEquals(0.0, weighted0.weight, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test_02_15()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) null, (Object) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_02_16()  throws Throwable  {
	      ChuLiuEdmonds chuLiuEdmonds0 = new ChuLiuEdmonds();
	  }
//	  @Test(timeout = 4000)
//	  public void test_03_00()  throws Throwable  {
//	      Edge<Locale.Category> edge0 = (Edge<Locale.Category>) mock(Edge.class, new ViolatedAssumptionAnswer());
//	      ArrayList<Edge<Locale.Category>> arrayList0 = new ArrayList<Edge<Locale.Category>>();
//	      ExclusiveEdge<Locale.Category> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<Locale.Category>>) arrayList0, (-3135.4));
//	      Arborescence<Locale.Category> arborescence0 = Arborescence.empty();
//	      Weighted<Arborescence<Locale.Category>> weighted0 = Weighted.weighted(arborescence0, 320.84);
//	      TreeSet<Edge<Locale.Category>> treeSet0 = new TreeSet<Edge<Locale.Category>>();
//	      KBestArborescences.SubsetOfSolutions<Locale.Category> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Locale.Category>(exclusiveEdge0.edge, weighted0, treeSet0, (Set<Edge<Locale.Category>>) null);
//	  }

	  @Test(timeout = 4000)
	  public void test_03_01()  throws Throwable  {
//	      Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
	      Edge<Object> edge0  = new Edge("3", "4");

	      ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, (double) 1979);
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
	  public void test_03_02()  throws Throwable  {
	      HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
//	      Edge<Integer> edge0 = (Edge<Integer>) mock(Edge.class, new ViolatedAssumptionAnswer());
	      Edge<Integer> edge0  = new Edge(3, 4);

	      Weighted<Arborescence<Integer>> weighted0 = Weighted.weighted(arborescence0, 0.0);
	      KBestArborescences.SubsetOfSolutions<Integer> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Integer>(edge0, weighted0, hashSet0, hashSet0);
	      Edge<Integer> edge1 = kBestArborescences_SubsetOfSolutions0.edgeToBan;
	      ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of(edge1, (List<Edge<Integer>>) null, 99.029780982162);
	      hashSet0.add(exclusiveEdge0.edge);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) null, (Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) null, weighted0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // null key in entry: null=null
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_03_03()  throws Throwable  {
	      double[][] doubleArray0 = new double[2][1];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<Integer>> weighted0 = new Weighted<Arborescence<Integer>>(arborescence0, 0.0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) linkedHashSet0, (Set<Edge<Integer>>) linkedHashSet0, weighted0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 1
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_03_04()  throws Throwable  {
//	      Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
	      Edge<Object> edge0  = new Edge("3", "4");
	      ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, 262.5150966354);
	      ImmutableSortedMap<Object, Object> immutableSortedMap0 = ImmutableSortedMap.of();
	      Arborescence<Object> arborescence0 = Arborescence.of((ImmutableMap<Object, Object>) immutableSortedMap0);
	      TreeSet<Object> treeSet0 = new TreeSet<Object>();
	      Partition<Object> partition0 = Partition.singletons((Collection<Object>) treeSet0);
	      EdgeQueueMap.EdgeQueue<Object> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((Object) arborescence0, partition0);
	      Optional<ExclusiveEdge<Object>> optional0 = KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<Object>) edgeQueueMap_EdgeQueue0);
	      assertNotNull(optional0);
	  }

	  @Test(timeout = 4000)
	  public void test_03_05()  throws Throwable  {
	      double[][] doubleArray0 = new double[2][0];
	      double[] doubleArray1 = new double[7];
	      doubleArray0[0] = doubleArray1;
	      doubleArray0[1] = doubleArray0[0];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<Integer>> weighted0 = Weighted.weighted(arborescence0, 1244.1915763717916);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) linkedHashSet0, (Set<Edge<Integer>>) linkedHashSet0, weighted0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_03_06()  throws Throwable  {
	      Arborescence<Locale.Category> arborescence0 = Arborescence.empty();
		  Arborescence<Locale.Category> arborescence2 = Arborescence.empty();

		  Weighted<Arborescence<Locale.Category>> weighted0 = new Weighted<Arborescence<Locale.Category>>(arborescence0, 1.0);
	      HashSet<Edge<Locale.Category>> hashSet0 = new HashSet<Edge<Locale.Category>>();
	      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
	      TreeSet<Locale.Category> treeSet0 = new TreeSet<Locale.Category>();
	      treeSet0.add(locale_Category0);
	      PriorityQueue<Weighted<Edge<Locale.Category>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Locale.Category>>>();
	      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.Category>) treeSet0, (Iterable<Weighted<Edge<Locale.Category>>>) priorityQueue0);
	      Optional<Weighted<KBestArborescences.SubsetOfSolutions<Locale.Category>>> optional0 = KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Locale.Category>) sparseWeightedGraph0, (Set<Edge<Locale.Category>>) hashSet0, (Set<Edge<Locale.Category>>) hashSet0, weighted0);
	      assertNotNull(optional0);

	      assertEquals(true, arborescence0.equals(arborescence2));
		  assertEquals(31, arborescence0.hashCode());
		  assertEquals("Arborescence{}", arborescence0.toString());

	  }

	  @Test(timeout = 4000)
	  public void test_03_07()  throws Throwable  {
	      LinkedHashSet<EdgeQueueMap.EdgeQueue<KBestArborescences>> linkedHashSet0 = new LinkedHashSet<EdgeQueueMap.EdgeQueue<KBestArborescences>>();
	      HashSet<Weighted<Edge<EdgeQueueMap.EdgeQueue<KBestArborescences>>>> hashSet0 = new HashSet<Weighted<Edge<EdgeQueueMap.EdgeQueue<KBestArborescences>>>>(724, 724);
	      SparseWeightedGraph<EdgeQueueMap.EdgeQueue<KBestArborescences>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<EdgeQueueMap.EdgeQueue<KBestArborescences>>) linkedHashSet0, (Iterable<Weighted<Edge<EdgeQueueMap.EdgeQueue<KBestArborescences>>>>) hashSet0);
	      KBestArborescences kBestArborescences0 = new KBestArborescences();
	      LinkedHashSet<KBestArborescences> linkedHashSet1 = new LinkedHashSet<KBestArborescences>();
	      Partition<KBestArborescences> partition0 = Partition.singletons((Collection<KBestArborescences>) linkedHashSet1);
	      EdgeQueueMap.EdgeQueue<KBestArborescences> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(kBestArborescences0, partition0);
	      List<Weighted<Arborescence<EdgeQueueMap.EdgeQueue<KBestArborescences>>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<EdgeQueueMap.EdgeQueue<KBestArborescences>>) sparseWeightedGraph0, (EdgeQueueMap.EdgeQueue<KBestArborescences>) edgeQueueMap_EdgeQueue0, 1);
	      assertFalse(list0.isEmpty());
	  }

	  @Test(timeout = 4000)
	  public void test_03_08()  throws Throwable  {
	      ArrayList<Weighted<Edge<KBestArborescences>>> arrayList0 = new ArrayList<Weighted<Edge<KBestArborescences>>>(1979);
	      SparseWeightedGraph<KBestArborescences> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<KBestArborescences>>>) arrayList0);
	      KBestArborescences kBestArborescences0 = new KBestArborescences();
	      List<Weighted<Arborescence<KBestArborescences>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<KBestArborescences>) sparseWeightedGraph0, kBestArborescences0, (-633));
	      assertTrue(list0.isEmpty());
	  }

	  @Test(timeout = 4000)
	  public void test_03_09()  throws Throwable  {
	      KBestArborescences kBestArborescences0 = new KBestArborescences();
	      // Undeclared exception!
	      try { 
	        KBestArborescences.getKBestArborescences((WeightedGraph<KBestArborescences>) null, kBestArborescences0, (-1540));
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_03_10()  throws Throwable  {
	      Vector<Weighted<Edge<Object>>> vector0 = new Vector<Weighted<Edge<Object>>>(1513);
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) vector0);
	      List<Weighted<Arborescence<Object>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Object>) sparseWeightedGraph0, (Object) null, 1513);
	      assertEquals(1, list0.size());
	  }
	  
	  @Test(timeout = 4000)
	  public void test_p_01()  throws Throwable  {
	      Pair<String, Integer> p = new Pair<>("h", 1);
		  Pair<String, Integer> p2 = new Pair<>("h", 1);
		  assertEquals(true, p.equals(p2));
		  assertEquals("Pair{first=h, second=1}", p.toString());
		  assertEquals(4186, p.hashCode());

	  }
	  
	  @Test(timeout = 4000)
	  public void test_wei_01()  throws Throwable  {
		  Weighted<Integer> w = new Weighted<>(3, 2.3);
		  Weighted<Integer> w2 = new Weighted<>(3, 2.3);
		  assertEquals(0, w.compareTo(w2));
		  assertEquals(644088862, w.hashCode());
		  assertEquals("Weighted{val=3, weight=2.3}", w.toString());
		  assertEquals(true, w.equals(w2));

	  }
	  

}
