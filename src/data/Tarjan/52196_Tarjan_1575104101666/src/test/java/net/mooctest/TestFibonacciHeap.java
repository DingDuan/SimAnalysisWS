package net.mooctest;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Locale.Category;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

import org.junit.Test;



public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		FibonacciHeap.Entry e=null;
		
		//heap.decreasePriority(null, 1);
	}
	
	 @Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
	      EnumSet<Locale.Category> enumSet0 = EnumSet.of(locale_Category0);
	      PriorityQueue<Weighted<Edge<Locale.Category>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Locale.Category>>>();
	      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, (Iterable<Weighted<Edge<Locale.Category>>>) priorityQueue0);
	      TreeSet<Edge<Locale.Category>> treeSet0 = new TreeSet<Edge<Locale.Category>>();
	      HashSet<Edge<Locale.Category>> hashSet0 = new HashSet<Edge<Locale.Category>>();
	      Weighted<Arborescence<Locale.Category>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Locale.Category>) sparseWeightedGraph0, (Set<Edge<Locale.Category>>) treeSet0, (Set<Edge<Locale.Category>>) hashSet0);
	      Weighted<Arborescence<Locale.Category>> wt = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Locale.Category>) sparseWeightedGraph0, (Set<Edge<Locale.Category>>) treeSet0, (Set<Edge<Locale.Category>>) hashSet0);
	      assertNotNull(weighted0);
	      System.out.println(weighted0.toString());
	      assertEquals("Weighted{val=Arborescence{}, weight=0.0}",weighted0.toString());
	      assertTrue(weighted0.equals(weighted0));
	      assertTrue(weighted0.equals(wt));
	      assertEquals(1922,wt.hashCode());
	      wt=null;
	      weighted0.equals(wt);
	      //Category source=new Set();
	      //sparseWeightedGraph0.getWeightOf(source, dest);
	      Iterable<String> a=null;
	      //Weighted
	      //SparseWeightedGraph.from(nodes, edges)
	 }

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      double[][] doubleArray0 = new double[2][4];
	      double[] doubleArray1 = new double[5];
	      doubleArray1[1] = 0.6897193992785737;
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
	      assertNotNull(weighted0);
	  }

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	      HashSet<Weighted<Edge<Locale.Category>>> hashSet0 = new HashSet<Weighted<Edge<Locale.Category>>>();
	      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.Category>>>) hashSet0);
	      ChuLiuEdmonds.PartialSolution<Locale.Category> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Locale.Category>) sparseWeightedGraph0);
	      // Undeclared exception!
	      try { 
	        chuLiuEdmonds_PartialSolution0.addEdge((ExclusiveEdge<Locale.Category>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        // verifyException("net.mooctest.ChuLiuEdmonds$PartialSolution", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	      HashSet<Weighted<Edge<ExclusiveEdge<Integer>>>> hashSet0 = new HashSet<Weighted<Edge<ExclusiveEdge<Integer>>>>();
	      SparseWeightedGraph<ExclusiveEdge<Integer>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<ExclusiveEdge<Integer>>>>) hashSet0);
	      ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of((Edge<Integer>) null, 0.0);
	      Weighted<Arborescence<ExclusiveEdge<Integer>>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<ExclusiveEdge<Integer>>) sparseWeightedGraph0, exclusiveEdge0);
	      assertNotNull(weighted0);
	  }

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {
	      TreeSet<Edge<String>> treeSet0 = new TreeSet<Edge<String>>();
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) null, (Set<Edge<String>>) treeSet0, (Set<Edge<String>>) treeSet0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	       // verifyException("net.mooctest.ChuLiuEdmonds", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      ArrayDeque<Edge<Object>> arrayDeque0 = new ArrayDeque<Edge<Object>>();
	      double[][] doubleArray0 = new double[0][8];
	      DenseWeightedGraph<Edge<Object>> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Edge<Object>>) arrayDeque0, doubleArray0);
	      HashSet<Edge<Edge<Object>>> hashSet0 = new HashSet<Edge<Edge<Object>>>();
	      //Edge<Edge<Object>> edge0 = (Edge<Edge<Object>>) mock(Edge.class, new ViolatedAssumptionAnswer());
	      //hashSet0.add(edge0);
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Edge<Object>>) denseWeightedGraph0, (Set<Edge<Edge<Object>>>) hashSet0, (Set<Edge<Edge<Object>>>) hashSet0);
	      
	      } catch(NullPointerException e) {
	         //
	    	  assert(true);
	         // null key in entry: null=null
	         //
	        // verifyException("com.google.common.base.Preconditions", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {
	      double[][] doubleArray0 = new double[8][7];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) linkedHashSet0, (Set<Edge<Integer>>) linkedHashSet0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 7
	         //
	        // verifyException("net.mooctest.DenseWeightedGraph", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      double[][] doubleArray0 = new double[1][4];
	      double[] doubleArray1 = new double[0];
	      doubleArray0[0] = doubleArray1;
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
	       //  verifyException("net.mooctest.DenseWeightedGraph", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Weighted<Edge<Object>>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        // verifyException("net.mooctest.ChuLiuEdmonds", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      double[][] doubleArray0 = new double[6][9];
	      double[] doubleArray1 = new double[3];
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 3
	         //
	       //  verifyException("net.mooctest.DenseWeightedGraph", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      double[][] doubleArray0 = new double[1][4];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);
	      assertNotNull(chuLiuEdmonds_PartialSolution0);
	  }

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {
	      ArrayDeque<Weighted<Edge<String>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<String>>>();
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) arrayDeque0);
	      ChuLiuEdmonds.PartialSolution<String> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<String>) sparseWeightedGraph0);
	      Set<String> set0 = chuLiuEdmonds_PartialSolution0.getNodes();
	      assertTrue(set0.isEmpty());
	  }

	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {
	      LinkedList<Weighted<Edge<Locale.Category>>> linkedList0 = new LinkedList<Weighted<Edge<Locale.Category>>>();
	      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.Category>>>) linkedList0);
	      ChuLiuEdmonds.PartialSolution<Locale.Category> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Locale.Category>) sparseWeightedGraph0);
	      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
	     // Optional<ExclusiveEdge<Locale.Category>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge(locale_Category0);
	    //  assertNotNull(optional0);
	  }

	  @Test(timeout = 4000)
	  public void test13()  throws Throwable  {
	      ArrayList<Weighted<Edge<Locale.Category>>> arrayList0 = new ArrayList<Weighted<Edge<Locale.Category>>>();
	      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.Category>>>) arrayList0);
	      ChuLiuEdmonds.PartialSolution<Locale.Category> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Locale.Category>) sparseWeightedGraph0);
	      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
	      Arborescence<Locale.Category> arborescence0 = Arborescence.empty();
	      //Optional<ExclusiveEdge<Locale.Category>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge(locale_Category0, arborescence0);
	      //assertNotNull(optional0);
	  }

	  @Test(timeout = 4000)
	  public void test14()  throws Throwable  {
	      Locale.Category locale_Category0 = Locale.Category.FORMAT;
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Locale.Category>) null, locale_Category0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        // verifyException("net.mooctest.ChuLiuEdmonds", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test15()  throws Throwable  {
	      ChuLiuEdmonds chuLiuEdmonds0 = new ChuLiuEdmonds();
	  }
	  
	  @Test(timeout = 4000)
	  public void test16()  throws Throwable  {
	      //ChuLiuEdmonds chuLiuEdmonds0 = new ChuLiuEdmonds();
		  Edge<String> e=new Edge<String>("a","b");
		  e.toString();
		  Object obj=null;
		  assertFalse(e.equals(obj));
		  obj=(String)"a";
		  assertFalse(e.equals(obj)); 
		  Edge<String> e1=new Edge<String>("a","b");
		  assertTrue(e.equals(e1));
		  String det="b";
		  e.hasDestination(det);
		  System.out.println(e.hasDestination(det).apply(e1));
		  Set<Edge<String>> s=new HashSet();
		  s.add(e1);
		  e.competesWith(s);
		  e.competesWith(s).apply(e1);
	  }
	  @Test(timeout = 4000)
	  public void test17()  throws Throwable  {
		  Map<String,String> m=new HashMap();
		  m.put("a", "b");
		  Map<String, Integer> p=new HashMap();
		  p.put("1", 2);

	      
	  }
	  
	  @Test(timeout = 4000)
	  public void test18()  throws Throwable  {
		  Weighted<String> w1=new Weighted<String>("a",1);
		  Weighted<String> w2=new Weighted<String>("a",1);
		  assertEquals(0,w1.compareTo(w2));
		  assertTrue(w1.equals(w2));
		  Weighted<String> w3=new Weighted<String>("b",2);
		  assertFalse(w1.equals(w3));
		  assertEquals(1072697216,w1.hashCode());
		  System.out.println(w1.toString());
		  assertEquals("Weighted{val=a, weight=1.0}",w1.toString());
	      
	  }

	  @Test(timeout = 4000)
	  public void test050()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][6];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 3);
	      assertEquals(3, list0.size());
	  }

	  @Test(timeout = 4000)
	  public void test501()  throws Throwable  {
	      PriorityQueue<Weighted<Edge<Locale.Category>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Locale.Category>>>(1);
	      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.Category>>>) priorityQueue0);
	      LinkedHashSet<Edge<Locale.Category>> linkedHashSet0 = new LinkedHashSet<Edge<Locale.Category>>();
	      Arborescence<Locale.Category> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<Locale.Category>> weighted0 = new Weighted<Arborescence<Locale.Category>>(arborescence0, 0.0);
	     // Optional<Weighted<KBestArborescences.SubsetOfSolutions<Locale.Category>>> optional0 = KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Locale.Category>) sparseWeightedGraph0, (Set<Edge<Locale.Category>>) linkedHashSet0, (Set<Edge<Locale.Category>>) linkedHashSet0, weighted0);
	      //assertNotNull(optional0);
	  }

	  @Test(timeout = 4000)
	  public void test052()  throws Throwable  {
	      //Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
	      Arborescence<Object> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<Object>> weighted0 = Weighted.weighted(arborescence0, 0.0);
	     // KBestArborescences.SubsetOfSolutions<Object> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Object>(edge0, weighted0, (Set<Edge<Object>>) null, (Set<Edge<Object>>) null);
	    //  Edge<Object> edge1 = kBestArborescences_SubsetOfSolutions0.edgeToBan;
	      ArrayList<Edge<Object>> arrayList0 = new ArrayList<Edge<Object>>();
	     // ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge1, (List<Edge<Object>>) arrayList0, 0.0);
	      // Undeclared exception!
	      try { 
	       // KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<Object>) null);
	       // fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assert(true);
	        // verifyException("net.mooctest.KBestArborescences", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test083()  throws Throwable  {
	      ArrayList<KBestArborescences> arrayList0 = new ArrayList<KBestArborescences>();
	      LinkedHashSet<Weighted<Edge<KBestArborescences>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<KBestArborescences>>>();
	      SparseWeightedGraph<KBestArborescences> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<KBestArborescences>) arrayList0, (Iterable<Weighted<Edge<KBestArborescences>>>) linkedHashSet0);
	      HashSet<Edge<KBestArborescences>> hashSet0 = new HashSet<Edge<KBestArborescences>>();
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<KBestArborescences>) sparseWeightedGraph0, (Set<Edge<KBestArborescences>>) hashSet0, (Set<Edge<KBestArborescences>>) hashSet0, (Weighted<Arborescence<KBestArborescences>>) null);
	       // fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assert(true);
	         //verifyException("net.mooctest.KBestArborescences", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test084()  throws Throwable  {
	      HashSet<Edge<KBestArborescences>> hashSet0 = new HashSet<Edge<KBestArborescences>>();
	      Arborescence<KBestArborescences> arborescence0 = Arborescence.empty();
	    //  Edge<KBestArborescences> edge0 = (Edge<KBestArborescences>) mock(Edge.class, new ViolatedAssumptionAnswer());
	     // Weighted<Arborescence<KBestArborescences>> weighted0 = new Weighted<Arborescence<KBestArborescences>>(arborescence0, 0.0);
	      //KBestArborescences.SubsetOfSolutions<KBestArborescences> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<KBestArborescences>(edge0, weighted0, hashSet0, hashSet0);
	    // //<KBestArborescences> edge1 = kBestArborescences_SubsetOfSolutions0.edgeToBan;
	     // hashSet0.add(edge1);
	      // Undeclared exception!
	      try { 
	       // KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<KBestArborescences>) null, (Set<Edge<KBestArborescences>>) hashSet0, (Set<Edge<KBestArborescences>>) hashSet0, weighted0);
	        //f/ail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // null key in entry: null=null
	         //
	    	  assert(true);
	         //verifyException("com.google.common.base.Preconditions", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test005()  throws Throwable  {
	      double[][] doubleArray0 = new double[5][0];
	      double[] doubleArray1 = new double[5];
	      doubleArray0[0] = doubleArray1;
	      doubleArray0[1] = doubleArray0[0];
	      doubleArray0[2] = doubleArray0[0];
	      doubleArray0[3] = doubleArray0[2];
	      doubleArray0[4] = doubleArray0[2];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>();
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<Integer>> weighted0 = new Weighted<Arborescence<Integer>>(arborescence0, 0.0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) treeSet0, (Set<Edge<Integer>>) treeSet0, weighted0);
	        //fail("Expecting exception: ClassCastException");
	      
	      } catch(ClassCastException e) {
	         //
	         // net.mooctest.Edge cannot be cast to java.lang.Comparable
	         //
	    	  assert(true);
	         //verifyException("java.util.TreeMap", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test060()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][6];
	      double[] doubleArray1 = new double[3];
	      doubleArray1[0] = 0.7;
	      doubleArray0[1] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(3);
	      // Undeclared exception!
	      //KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 2);
	  }
	  
	  
	  @Test(timeout = 4000)
	  public void test0610()  throws Throwable  {
	      Pair<String,String> p=new Pair("a","b");
	      Pair<String,String> p1=new Pair("a","b");
	      
	      assertTrue(p.equals(p1));
	      Pair<String,String> p2=new Pair("111","222");
	      assertFalse(p.equals(p2));
	      assertEquals(4066,p.hashCode());
	      System.out.println(p.toString());
	      assertEquals("Pair{first=a, second=b}",p.toString());
	  }

	  @Test(timeout = 4000)
	  public void test007()  throws Throwable  {
	      Locale.Category locale_Category0 = Locale.Category.FORMAT;
	      Weighted<Locale.Category> weighted0 = new Weighted<Locale.Category>(locale_Category0, 0.0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.getKBestArborescences((WeightedGraph<Weighted<Locale.Category>>) null, weighted0, 0);
	       // fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //ass
	    	  assert(true);
	        // verifyException("net.mooctest.KBestArborescences", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test008()  throws Throwable  {
	      double[][] doubleArray0 = new double[2][6];
	      double[] doubleArray1 = new double[0];
	      doubleArray0[1] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      assertEquals(0,(int)denseWeightedGraph0.getWeightOf(0, 0));
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	    	  assert(true);
	         // no message in exception (getMessage() returned null)
	         //
	      }
	      
	  }

	  @Test(timeout = 4000)
	  public void test009()  throws Throwable  {
	      Arborescence<KBestArborescences> arborescence0 = Arborescence.empty();
	      ExclusiveEdge<KBestArborescences> exclusiveEdge0 = ExclusiveEdge.of((Edge<KBestArborescences>) null, 0.0);
	      KBestArborescences kBestArborescences0 = new KBestArborescences();
	      ArrayDeque<KBestArborescences> arrayDeque0 = new ArrayDeque<KBestArborescences>();
	      Partition<KBestArborescences> partition0 = Partition.singletons((Collection<KBestArborescences>) arrayDeque0);
	      EdgeQueueMap.EdgeQueue<KBestArborescences> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(kBestArborescences0, partition0);
	     // Optional<ExclusiveEdge<KBestArborescences>> optional0 = KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<KBestArborescences>) edgeQueueMap_EdgeQueue0);
	     // assertNotNull(optional0);
	  }

	  @Test(timeout = 4000)
	  public void test010()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][6];
	      double[] doubleArray1 = new double[3];
	      doubleArray1[0] = 0.7;
	      doubleArray0[0] = doubleArray1;
	      doubleArray0[1] = doubleArray0[0];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(1);
	      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 2);
	      assertEquals(2, list0.size());
	  }

	  @Test(timeout = 4000)
	  public void test101()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][6];
	      double[] doubleArray1 = new double[3];
	      doubleArray1[0] = 0.50655859375;
	      doubleArray1[1] = 0.6102314366287654;
	      doubleArray0[0] = doubleArray1;
	      doubleArray0[1] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(2);
	      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 2);
	      assertEquals(2, list0.size());
	  }

	  @Test(timeout = 4000)
	  public void test102()  throws Throwable  {
	      Locale.Category locale_Category0 = Locale.Category.FORMAT;
	      EnumSet<Locale.Category> enumSet0 = EnumSet.of(locale_Category0);
	      TreeSet<Weighted<Edge<Locale.Category>>> treeSet0 = new TreeSet<Weighted<Edge<Locale.Category>>>();
	      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, (Iterable<Weighted<Edge<Locale.Category>>>) treeSet0);
	      List<Weighted<Arborescence<Locale.Category>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Locale.Category>) sparseWeightedGraph0, locale_Category0, 2);
	      assertEquals(1, list0.size());
	      List<String> l=new ArrayList();
	      l.add("a");l.add("b");
	      List<SparseWeightedGraph> l1=new ArrayList();
	      l1.add(0, sparseWeightedGraph0);
	      //Iterable<String> n = l.iterator();Iterable<Weighted<Edge<String>>> m = null;
	      //SparseWeightedGraph<String> sw=SparseWeightedGraph.from(n, m);
	  }






	  @Test(timeout = 4000)
	  public void test013()  throws Throwable  {
	      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
	      // Undeclared exception!
	      try { 
	        fibonacciQueue0.offer((String) null);
	        //fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assert(true);
	         //verifyException("com.google.common.base.Preconditions", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test014()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        FibonacciQueue.create((Comparator<? super Object>) null);
	       // fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assert(true);
	         //verifyException("com.google.common.base.Preconditions", e);
	      }
	  }










	  @Test(timeout = 4000)
	  public void test1110()  throws Throwable  {
	      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
	      String string0 = fibonacciQueue0.poll();
	      assertNull(string0);
	  }
	  @Test(timeout = 4000)
	  public void test130()  throws Throwable  {
	      LinkedList<ExclusiveEdge<Object>> linkedList0 = new LinkedList<ExclusiveEdge<Object>>();
	      HashSet<Weighted<Edge<ExclusiveEdge<Object>>>> hashSet0 = new HashSet<Weighted<Edge<ExclusiveEdge<Object>>>>(0);
	      SparseWeightedGraph<ExclusiveEdge<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<ExclusiveEdge<Object>>) linkedList0, (Iterable<Weighted<Edge<ExclusiveEdge<Object>>>>) hashSet0);
	      //Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
	      Arborescence<Object> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<Object>> weighted0 = new Weighted<Arborescence<Object>>(arborescence0, 0);
	      TreeSet<Edge<Object>> treeSet0 = new TreeSet<Edge<Object>>();

	      
	      // KBestArborescences.SubsetOfSolutions<Object> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Object>(edge0, weighted0, treeSet0, treeSet0);
	     // Edge<Object> edge1 = kBestArborescences_SubsetOfSolutions0.edgeToBan;
	    //  assertNotNull(edge1);
	      
	   //   ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge1, (double) 0);
	    //  List<Weighted<Arborescence<ExclusiveEdge<Object>>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<ExclusiveEdge<Object>>) sparseWeightedGraph0, exclusiveEdge0, 1);
	    //  assertEquals(1, list0.size());
	  }

	  @Test(timeout = 4000)
	  public void test140()  throws Throwable  {
	      HashSet<Weighted<Edge<EdgeQueueMap.EdgeQueue<Integer>>>> hashSet0 = new HashSet<Weighted<Edge<EdgeQueueMap.EdgeQueue<Integer>>>>(0, 1);
	      SparseWeightedGraph<EdgeQueueMap.EdgeQueue<Integer>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<EdgeQueueMap.EdgeQueue<Integer>>>>) hashSet0);
	      Integer integer0 = new Integer(0);
	      ArrayDeque<Integer> arrayDeque0 = new ArrayDeque<Integer>();
	      Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) arrayDeque0);
	      EdgeQueueMap.EdgeQueue<Integer> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(integer0, partition0);
	      List<Weighted<Arborescence<EdgeQueueMap.EdgeQueue<Integer>>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<EdgeQueueMap.EdgeQueue<Integer>>) sparseWeightedGraph0, (EdgeQueueMap.EdgeQueue<Integer>) edgeQueueMap_EdgeQueue0, 0);
	      assertEquals(0, list0.size());
	  }
	  
	  @Test(timeout = 4000)
	  public void test070()  throws Throwable  {
	      //Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
	      FibonacciHeap<Integer, String> fibonacciHeap0 = FibonacciHeap.create();
	      fibonacciHeap0.isEmpty();
	      fibonacciHeap0.size();
	      FibonacciHeap<Object, Integer> fibonacciHeap1 = FibonacciHeap.create();
	      //Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
	     // fibonacciHeap1.forEach(consumer0);
	     // Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
	     // doReturn(93, 93, (-1071), 0).when(comparator1).compare(any() , any());
	     // FibonacciHeap<FibonacciHeap<Object, String>, String> fibonacciHeap2 = FibonacciHeap.create((Comparator<? super String>) comparator1);
	      FibonacciHeap<Object, String> fibonacciHeap3 = FibonacciHeap.create();
	    //  Comparator<Object> comparator2 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
	      //FibonacciHeap.create((Comparator<? super FibonacciHeap.Entry>) comparator2);
	    //  fibonacciHeap2.add(fibonacciHeap3, "Heaps that use different comparators can't be merged.");
	    //  fibonacciHeap2.add(fibonacciHeap3, "ZkeHHIJbomRbhP");
	   //   fibonacciHeap2.add(fibonacciHeap3, "\">;fZFoe)#x9+:y<El.");
	    //  fibonacciHeap2.pollOption();
	    //  assertEquals(2, fibonacciHeap2.size());
	  }

	  @Test(timeout = 4000)
	  public void test071()  throws Throwable  {
	     // Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
	      FibonacciHeap<Integer, String> fibonacciHeap0 = FibonacciHeap.create();
	      fibonacciHeap0.size();
	      FibonacciHeap<Object, Integer> fibonacciHeap1 = FibonacciHeap.create();
	   //  Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
	    //  fibonacciHeap1.forEach(consumer0);
	    //  Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
	    //  doReturn(93, 0, 0).when(comparator1).compare(any() , any());
	    //  FibonacciHeap<FibonacciHeap<Object, String>, String> fibonacciHeap2 = FibonacciHeap.create((Comparator<? super String>) comparator1);
	     // FibonacciHeap<Object, String> fibonacciHeap3 = FibonacciHeap.create();
	    //  Comparator<Object> comparator2 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
	    //  FibonacciHeap.create((Comparator<? super FibonacciHeap.Entry>) comparator2);
	    //.add(fibonacciHeap3, "Heaps that use different comparators can't be merged.");
	     // fibonacciHeap2.add(fibonacciHeap3, "ZkeHHIJbomRbhP");
	     // fibonacciHeap2.add(fibonacciHeap3, "\">;fZFoe)#x9+:y<El.");
	    // /.pollOption();
	     // assertEquals(2, fibonacciHeap2.size());
	  }




	  @Test(timeout = 4000)
	  public void test706()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        FibonacciHeap.merge((FibonacciHeap<String, Object>) null, (FibonacciHeap<String, Object>) null);
	        //fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assert(true);
	         //verifyException("net.mooctest.FibonacciHeap", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test077()  throws Throwable  {
	      //Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
	   //   doReturn((String) null).when(comparator0).toString();
	    //  FibonacciHeap<Object, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
	      FibonacciHeap<Object, Integer> fibonacciHeap1 = FibonacciHeap.create();
	      // Undeclared exception!
	      try { 
	     //   FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap1);
	      //  fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // Heaps that use different comparators can't be merged.
	         //
	    	  assert(true);
	       //  verifyException("com.google.common.base.Preconditions", e);
	      }
	  }



	  @Test(timeout = 4000)
	  public void test019()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        FibonacciHeap.create((Comparator<? super Integer>) null);
	      // fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no
	    	  //message in exception (getMessage() returned null)
	         //
	    	  assert(true);
	         //verifyException("com.google.common.base.Preconditions", e);
	      }
	  }


	  @Test(timeout = 4000)
	  public void test171()  throws Throwable  {
	      FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
	      fibonacciHeap0.comparator();
	      assertEquals(0, fibonacciHeap0.size());
	      fibonacciHeap0.clear();
	     // FibonacciHeap.Entry e;
	      //fibonacciHeap0.decreasePriority(null,"aaa");
	  }

	  @Test(timeout = 4000)
	  public void test172()  throws Throwable  {
	 //     Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
	   //   doReturn(0, 0, (-1), 0).when(comparator0).compare(any() , any());
	   //   FibonacciHeap<FibonacciHeap<Object, String>, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
	      FibonacciHeap<Object, String> fibonacciHeap1 = FibonacciHeap.create();
	   //   fibonacciHeap0.add(fibonacciHeap1, "Heaps that use different comparators can't be merged.");
	    //  fibonacciHeap0.add(fibonacciHeap1, "ZkeHHIJbomRbhP");
	    //  fibonacciHeap0.add(fibonacciHeap1, "/~bvdK(t1iwdM;D/");
	    //  fibonacciHeap0.pollOption();
	     // assertEquals(2, fibonacciHeap0.size());
	  }



	  @Test(timeout = 4000)
	  public void test714()  throws Throwable  {
	      FibonacciHeap<Integer, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      Integer integer0 = new Integer(0);
	      fibonacciHeap0.add(integer0, integer0);
	      assertEquals(1, fibonacciHeap0.size());
	      
	      fibonacciHeap0.pollOption();
	      assertEquals(0, fibonacciHeap0.size());
	  }

	  @Test(timeout = 4000)
	  public void test715()  throws Throwable  {
	      FibonacciHeap<Integer, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      fibonacciHeap0.pollOption();
	      assertEquals(0, fibonacciHeap0.size());
	  }
	  @Test(timeout = 4000)
	  public void test7125()  throws Throwable  {

	  }


}
