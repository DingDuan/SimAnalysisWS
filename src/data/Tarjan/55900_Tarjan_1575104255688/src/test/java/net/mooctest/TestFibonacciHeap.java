package net.mooctest;

//import static org.evosuite.shaded.org.org.evosuite.shaded.org.mockito.Mockito.mockito.ArgumentMatchers.any;
//import static org.evosuite.shaded.org.org.evosuite.shaded.org.mockito.Mockito.mockito.Mockito.doReturn;
//import static org.evosuite.shaded.org.org.evosuite.shaded.org.mockito.Mockito.mockito.Mockito.org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

//import org.evosuite.runtime.org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;


public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
	}
	
	@Test(timeout = 4000)
	  public void test_SparseWeightedGraph00()  throws Throwable  {
	      ArrayList<Object> arrayList0 = new ArrayList<Object>();
	      HashSet<Weighted<Edge<Object>>> hashSet0 = new HashSet<Weighted<Edge<Object>>>(0, 0.5F);
	      Object object0 = new Object();
	      Edge<Object> edge0 = new Edge<Object>(hashSet0, object0);
	      Weighted<Edge<Object>> weighted0 = new Weighted<Edge<Object>>(edge0, 0.0);
	      hashSet0.add(weighted0);
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Object>) arrayList0, (Iterable<Weighted<Edge<Object>>>) hashSet0);
	        fail("Expecting exception: StackOverflowError");
	      
	      } catch(StackOverflowError e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_SparseWeightedGraph01()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Locale.Category>) null, (Iterable<Weighted<Edge<Locale.Category>>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("net.mooctest_SparseWeightedGraph.SparseWeightedGraph", e);
	      }
	  }

//	  @Test(timeout = 4000)
//	  public void test_SparseWeightedGraph02()  throws Throwable  {
//	      HashSet<String> hashSet0 = new HashSet<String>(0);
//	      Comparator<Object> comparator0 = (Comparator<Object>) org.evosuite.shaded.org.mockito.Mockito.mock(Comparator.class, new org.evosuite.runtime.ViolatedAssumptionAnswer());
//	      hashSet0.add((String) null);
//	      TreeSet<Weighted<Edge<String>>> treeSet0 = new TreeSet<Weighted<Edge<String>>>(comparator0);
//	      // Undeclared exception!
//	      try { 
//	        SparseWeightedGraph.from((Iterable<String>) hashSet0, (Iterable<Weighted<Edge<String>>>) treeSet0);
//	        fail("Expecting exception: NullPointerException");
//	      
//	      } catch(NullPointerException e) {
//	         //
//	         // no message in exception (getMessage() returned null)
//	         //
//	         //verifyException("com.google.common.base.Preconditions", e);
//	      }
//	  }

	  @Test(timeout = 4000)
	  public void test_SparseWeightedGraph03()  throws Throwable  {
	      HashSet<Weighted<Edge<Object>>> hashSet0 = new HashSet<Weighted<Edge<Object>>>(0);
	      Edge<Object> edge0 = new Edge<Object>(hashSet0, "");
	      Weighted<Edge<Object>> weighted0 = new Weighted<Edge<Object>>(edge0, 0.0);
	      hashSet0.add(weighted0);
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) hashSet0);
	        fail("Expecting exception: StackOverflowError");
	      
	      } catch(StackOverflowError e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_SparseWeightedGraph04()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Weighted<Edge<Edge<String>>>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("net.mooctest_SparseWeightedGraph.SparseWeightedGraph", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_SparseWeightedGraph05()  throws Throwable  {
	      HashSet<Weighted<Edge<Integer>>> hashSet0 = new HashSet<Weighted<Edge<Integer>>>();
	      Integer integer0 = new Integer(0);
	      Edge<Integer> edge0 = new Edge<Integer>((Integer) null, integer0);
	      Weighted<Edge<Integer>> weighted0 = Weighted.weighted(edge0, (double) 0);
	      hashSet0.add(weighted0);
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Weighted<Edge<Integer>>>) hashSet0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // at index 0
	         //
	         //verifyException("com.google.common.collect.ObjectArrays", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_SparseWeightedGraph06()  throws Throwable  {
	      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
	      PriorityQueue<Integer> priorityQueue0 = new PriorityQueue<Integer>((SortedSet<? extends Integer>) treeSet0);
	      TreeSet<Weighted<Edge<Integer>>> treeSet1 = new TreeSet<Weighted<Edge<Integer>>>();
	      Integer integer0 = new Integer(0);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
	      Weighted<Edge<Integer>> weighted0 = Weighted.weighted(edge0, 0.0);
	      treeSet1.add(weighted0);
	      Weighted<Edge<Integer>> weighted1 = Weighted.weighted(edge0, 0.672509765625);
	      treeSet1.add(weighted1);
	      SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Integer>) priorityQueue0, (Iterable<Weighted<Edge<Integer>>>) treeSet1);
	      assertNotNull(sparseWeightedGraph0);
	  }

//	  @Test(timeout = 4000)
//	  public void test_SparseWeightedGraph07()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) org.evosuite.shaded.org.mockito.Mockito.mock(Comparator.class, new org.evosuite.runtime.ViolatedAssumptionAnswer());
//	      PriorityQueue<Integer> priorityQueue0 = new PriorityQueue<Integer>(1, comparator0);
//	      LinkedHashSet<Weighted<Edge<Integer>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<Integer>>>();
//	      Integer integer0 = new Integer(0);
//	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
//	      Weighted<Edge<Integer>> weighted0 = new Weighted<Edge<Integer>>(edge0, 0);
//	      linkedHashSet0.add(weighted0);
//	      SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Integer>) priorityQueue0, (Iterable<Weighted<Edge<Integer>>>) linkedHashSet0);
//	      Collection<Weighted<Edge<Integer>>> collection0 = sparseWeightedGraph0.getIncomingEdges(integer0);
//	      assertTrue(collection0.contains(weighted0));
//	  }
//
//	  @Test(timeout = 4000)
//	  public void test_SparseWeightedGraph08()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) org.evosuite.shaded.org.mockito.Mockito.mock(Comparator.class, new org.evosuite.runtime.ViolatedAssumptionAnswer());
//	      TreeSet<Locale.Category> treeSet0 = new TreeSet<Locale.Category>(comparator0);
//	      PriorityQueue<Weighted<Edge<Locale.Category>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Locale.Category>>>();
//	      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.Category>) treeSet0, (Iterable<Weighted<Edge<Locale.Category>>>) priorityQueue0);
//	      Locale.Category locale_Category0 = Locale.Category.FORMAT;
//	      Collection<Weighted<Edge<Locale.Category>>> collection0 = sparseWeightedGraph0.getIncomingEdges(locale_Category0);
//	      assertNotNull(collection0);
//	  }

	  @Test(timeout = 4000)
	  public void test_SparseWeightedGraph09()  throws Throwable  {
	      TreeSet<Weighted<Edge<String>>> treeSet0 = new TreeSet<Weighted<Edge<String>>>((Comparator<? super Weighted<Edge<String>>>) null);
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) treeSet0);
	      double double0 = sparseWeightedGraph0.getWeightOf("", "");
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test_SparseWeightedGraph10()  throws Throwable  {
	      ArrayList<Weighted<Edge<String>>> arrayList0 = new ArrayList<Weighted<Edge<String>>>(0);
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) arrayList0);
	      Collection<String> collection0 = sparseWeightedGraph0.getNodes();
	      assertNotNull(collection0);
	  }
	
	@Test(timeout = 4000)
	  public void test_Weighted00()  throws Throwable  {
	      Object object0 = new Object();
	      Weighted<Object> weighted0 = new Weighted<Object>(object0, 0.0);
	      Weighted<Object> weighted1 = Weighted.weighted((Object) "", 0.0);
	      int int0 = weighted1.compareTo(weighted0);
	      assertEquals(1, int0);
	  }

	  @Test(timeout = 4000)
	  public void test_Weighted01()  throws Throwable  {
	      Weighted<String> weighted0 = new Weighted<String>("", 0.799002272578125);
	      Weighted<String> weighted1 = Weighted.weighted("", (double) 0);
	      int int0 = weighted0.compareTo(weighted1);
	      assertEquals((-1), int0);
	  }

	  @Test(timeout = 4000)
	  public void test_Weighted02()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        Weighted.weighted((Object) null, 0.0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("com.google.common.base.Preconditions", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_Weighted03()  throws Throwable  {
	      Weighted<String> weighted0 = new Weighted<String>("", 0.0);
	      // Undeclared exception!
	      try { 
	        weighted0.compareTo((Weighted<String>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("net.mooctest_Weighted.Weighted", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_Weighted04()  throws Throwable  {
	      Weighted<Weighted<String>> weighted0 = null;
	      try {
	        weighted0 = new Weighted<Weighted<String>>((Weighted<String>) null, 0.0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("com.google.common.base.Preconditions", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_Weighted05()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Object> weighted0 = new Weighted<Object>(integer0, 0);
	      Weighted<Integer> weighted1 = new Weighted<Integer>(integer0, 0.799002272578125);
	      boolean boolean0 = weighted0.equals(weighted1);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Weighted06()  throws Throwable  {
	      Object object0 = new Object();
	      Weighted<Object> weighted0 = new Weighted<Object>(object0, 0.0);
	      Weighted<Object> weighted1 = Weighted.weighted((Object) "", 0.0);
	      boolean boolean0 = weighted1.equals(weighted0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Weighted07()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Object> weighted0 = new Weighted<Object>(integer0, 0);
	      boolean boolean0 = weighted0.equals((Object) null);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Weighted08()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Object> weighted0 = new Weighted<Object>(integer0, 0);
	      Weighted<Integer> weighted1 = new Weighted<Integer>(integer0, 0.0);
	      boolean boolean0 = weighted0.equals(weighted1);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Weighted09()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, 0.0);
	      String string0 = weighted0.toString();
	      assertEquals("Weighted{val=0, weight=0.0}", string0);
	  }

	  @Test(timeout = 4000)
	  public void test_Weighted10()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Object> weighted0 = new Weighted<Object>(integer0, 0);
	      weighted0.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void test_Weighted11()  throws Throwable  {
	      Weighted<String> weighted0 = new Weighted<String>("", 0.0);
	      int int0 = weighted0.compareTo(weighted0);
	      assertEquals(0, int0);
	  }
	
	  @Test(timeout = 4000)
	  public void test_Pair0()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<Integer, String> pair0 = Pair.of(integer0, "");
	      assertNotNull(pair0);
	  }

	  @Test(timeout = 4000)
	  public void test_Pair1()  throws Throwable  {
	      Pair<String, String> pair0 = Pair.of("", "");
	      boolean boolean0 = pair0.equals("");
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Pair2()  throws Throwable  {
	      Pair<String, Object> pair0 = new Pair<String, Object>("", "");
	      Pair<Pair<String, Object>, String> pair1 = new Pair<Pair<String, Object>, String>(pair0, "");
	      Pair<Object, Object> pair2 = new Pair<Object, Object>(pair1, "");
	      Pair pair3 = (Pair)pair2.first;
	      boolean boolean0 = pair1.equals(pair3);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Pair3()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<String, Object> pair0 = new Pair<String, Object>("", integer0);
	      Pair<Integer, Object> pair1 = Pair.of(integer0, (Object) integer0);
	      Pair<Object, Object> pair2 = new Pair<Object, Object>(pair0, integer0);
	      boolean boolean0 = pair2.equals(pair1);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Pair4()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<Integer, String> pair0 = new Pair<Integer, String>(integer0, "");
	      pair0.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void test_Pair5()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<Integer, Object> pair0 = Pair.of(integer0, (Object) integer0);
	      Pair<Integer, String> pair1 = new Pair<Integer, String>(integer0, "");
	      boolean boolean0 = pair1.equals(pair0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Pair6()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<Integer, String> pair0 = new Pair<Integer, String>(integer0, "");
	      String string0 = pair0.toString();
	      assertEquals("Pair{first=0, second=}", string0);
	  }
	
//	 @Test(timeout = 4000)
//	  public void test_KBestArborescences00()  throws Throwable  {
//	      Edge<ExclusiveEdge<Object>> edge0 = (Edge<ExclusiveEdge<Object>>) org.evosuite.shaded.org.mockito.Mockito.mock(Edge.class, new org.evosuite.runtime.ViolatedAssumptionAnswer());
//	      Arborescence<ExclusiveEdge<Object>> arborescence0 = Arborescence.empty();
//	      Weighted<Arborescence<ExclusiveEdge<Object>>> weighted0 = Weighted.weighted(arborescence0, 0.0);
//	      HashSet<Edge<ExclusiveEdge<Object>>> hashSet0 = new HashSet<Edge<ExclusiveEdge<Object>>>();
//	      HashSet<Edge<ExclusiveEdge<Object>>> hashSet1 = new HashSet<Edge<ExclusiveEdge<Object>>>();
//	      KBestArborescences.SubsetOfSolutions<ExclusiveEdge<Object>> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<ExclusiveEdge<Object>>(edge0, weighted0, hashSet0, hashSet1);
//	  }

	  @Test(timeout = 4000)
	  public void test_KBestArborescences01()  throws Throwable  {
	      LinkedHashSet<Weighted<Edge<Arborescence<Object>>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<Arborescence<Object>>>>();
	      SparseWeightedGraph<Arborescence<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Arborescence<Object>>>>) linkedHashSet0);
	      LinkedHashSet<Edge<Arborescence<Object>>> linkedHashSet1 = new LinkedHashSet<Edge<Arborescence<Object>>>();
	      HashSet<Edge<Arborescence<Object>>> hashSet0 = new HashSet<Edge<Arborescence<Object>>>();
	      Arborescence<Arborescence<Object>> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<Arborescence<Object>>> weighted0 = Weighted.weighted(arborescence0, 0.0);
	      Optional<Weighted<KBestArborescences.SubsetOfSolutions<Arborescence<Object>>>> optional0 = KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Arborescence<Object>>) sparseWeightedGraph0, (Set<Edge<Arborescence<Object>>>) linkedHashSet1, (Set<Edge<Arborescence<Object>>>) hashSet0, weighted0);
	      assertNotNull(optional0);
	  }

	  @Test(timeout = 4000)
	  public void test_KBestArborescences02()  throws Throwable  {
	      HashSet<Edge<String>> hashSet0 = new HashSet<Edge<String>>();
	      Vector<Weighted<Edge<Edge<String>>>> vector0 = new Vector<Weighted<Edge<Edge<String>>>>(0, 0);
	      SparseWeightedGraph<Edge<String>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Edge<String>>) hashSet0, (Iterable<Weighted<Edge<Edge<String>>>>) vector0);
	      List<Weighted<Arborescence<Edge<String>>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Edge<String>>) sparseWeightedGraph0, (Edge<String>) null, 3);
	      assertFalse(list0.isEmpty());
	  }

	  @Test(timeout = 4000)
	  public void test_KBestArborescences03()  throws Throwable  {
	      ExclusiveEdge<Weighted<KBestArborescences>> exclusiveEdge0 = ExclusiveEdge.of((Edge<Weighted<KBestArborescences>>) null, 0.0);
	      Arborescence<Weighted<KBestArborescences>> arborescence0 = Arborescence.empty();
	      // Undeclared exception!
	      try { 
	        KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<Weighted<KBestArborescences>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("net.mooctest_KBestArborescences.KBestArborescences", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_KBestArborescences04()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Locale.FilteringMode>) null, (Set<Edge<Locale.FilteringMode>>) null, (Set<Edge<Locale.FilteringMode>>) null, (Weighted<Arborescence<Locale.FilteringMode>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("net.mooctest_KBestArborescences.Edge", e);
	      }
	  }

//	  @Test(timeout = 4000)
//	  public void test_KBestArborescences05()  throws Throwable  {
//	      LinkedHashSet<Edge<Double>> linkedHashSet0 = new LinkedHashSet<Edge<Double>>();
//	      Edge<Double> edge0 = (Edge<Double>) org.evosuite.shaded.org.mockito.Mockito.mock(Edge.class, new org.evosuite.runtime.ViolatedAssumptionAnswer());
//	      linkedHashSet0.add(edge0);
//	      Arborescence<Double> arborescence0 = Arborescence.empty();
//	      Weighted<Arborescence<Double>> weighted0 = Weighted.weighted(arborescence0, 0.0);
//	      // Undeclared exception!
//	      try { 
//	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Double>) null, (Set<Edge<Double>>) linkedHashSet0, (Set<Edge<Double>>) linkedHashSet0, weighted0);
//	        fail("Expecting exception: NullPointerException");
//	      
//	      } catch(NullPointerException e) {
//	         //
//	         // null key in entry: null=null
//	         //
//	         //verifyException("com.google.common.base.Preconditions", e);
//	      }
//	  }

	  @Test(timeout = 4000)
	  public void test_KBestArborescences06()  throws Throwable  {
	      double[][] doubleArray0 = new double[6][9];
	      double[] doubleArray1 = new double[3];
	      doubleArray0[1] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<Integer>> weighted0 = Weighted.weighted(arborescence0, 0.0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) linkedHashSet0, (Set<Edge<Integer>>) linkedHashSet0, weighted0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 3
	         //
	         //verifyException("net.mooctest_KBestArborescences.DenseWeightedGraph", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_KBestArborescences07()  throws Throwable  {
	      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
	      // Undeclared exception!
	      try { 
	        KBestArborescences.getKBestArborescences((WeightedGraph<Locale.FilteringMode>) null, locale_FilteringMode0, 0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("net.mooctest_KBestArborescences.KBestArborescences", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_KBestArborescences08()  throws Throwable  {
	      double[][] doubleArray0 = new double[6][2];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 2
	         //
	         //verifyException("net.mooctest_KBestArborescences.DenseWeightedGraph", e);
	      }
	  }
//
//	  @Test(timeout = 4000)
//	  public void test_KBestArborescences09()  throws Throwable  {
//	      Edge<Object> edge0 = (Edge<Object>) org.evosuite.shaded.org.mockito.Mockito.mock(Edge.class, new org.evosuite.runtime.ViolatedAssumptionAnswer());
//	      ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, (double) 0);
//	      Arborescence<Object> arborescence0 = Arborescence.empty();
//	      LinkedList<Object> linkedList0 = new LinkedList<Object>();
//	      Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
//	      EdgeQueueMap.EdgeQueue<Object> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((Object) exclusiveEdge0, partition0);
//	      Optional<ExclusiveEdge<Object>> optional0 = KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<Object>) edgeQueueMap_EdgeQueue0);
//	      assertNotNull(optional0);
//	  }

	  @Test(timeout = 4000)
	  public void test_KBestArborescences10()  throws Throwable  {
	      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
	      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
	      EnumSet<Locale.FilteringMode> enumSet0 = EnumSet.allOf(class0);
	      ArrayDeque<Weighted<Edge<Locale.FilteringMode>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Locale.FilteringMode>>>();
	      SparseWeightedGraph<Locale.FilteringMode> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.FilteringMode>) enumSet0, (Iterable<Weighted<Edge<Locale.FilteringMode>>>) arrayDeque0);
	      List<Weighted<Arborescence<Locale.FilteringMode>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Locale.FilteringMode>) sparseWeightedGraph0, locale_FilteringMode0, 2);
	      assertFalse(list0.isEmpty());
	  }

	  @Test(timeout = 4000)
	  public void test_KBestArborescences11()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      LinkedHashSet<Weighted<Integer>> linkedHashSet0 = new LinkedHashSet<Weighted<Integer>>();
	      HashSet<Weighted<Edge<Weighted<Integer>>>> hashSet0 = new HashSet<Weighted<Edge<Weighted<Integer>>>>();
	      SparseWeightedGraph<Weighted<Integer>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Integer>>) linkedHashSet0, (Iterable<Weighted<Edge<Weighted<Integer>>>>) hashSet0);
	      Weighted<Integer> weighted0 = Weighted.weighted(integer0, (double) 0);
	      List<Weighted<Arborescence<Weighted<Integer>>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Weighted<Integer>>) sparseWeightedGraph0, weighted0, 1);
	      assertEquals(1, list0.size());
	  }

	  @Test(timeout = 4000)
	  public void test_KBestArborescences12()  throws Throwable  {
	      KBestArborescences kBestArborescences0 = new KBestArborescences();
	  }

	  @Test(timeout = 4000)
	  public void test_KBestArborescences13()  throws Throwable  {
	      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
	      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
	      EnumSet<Locale.FilteringMode> enumSet0 = EnumSet.allOf(class0);
	      ArrayDeque<Weighted<Edge<Locale.FilteringMode>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Locale.FilteringMode>>>();
	      SparseWeightedGraph<Locale.FilteringMode> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.FilteringMode>) enumSet0, (Iterable<Weighted<Edge<Locale.FilteringMode>>>) arrayDeque0);
	      List<Weighted<Arborescence<Locale.FilteringMode>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Locale.FilteringMode>) sparseWeightedGraph0, locale_FilteringMode0, 0);
	      assertEquals(0, list0.size());
	  }
	

	  @Test(timeout = 4000)
	  public void test_FibonacciHeap03()  throws Throwable  {
	      FibonacciHeap<Integer, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      Integer integer0 = Integer.valueOf(0);
	      fibonacciHeap0.add(integer0, integer0);
	      int int0 = fibonacciHeap0.size();
	      assertEquals(1, int0);
	  }

//	  @Test(timeout = 4000)
//	  public void test_FibonacciHeap04()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) org.evosuite.shaded.org.mockito.Mockito.mock(Comparator.class, new org.evosuite.runtime.ViolatedAssumptionAnswer());
//	      FibonacciHeap<Object, FibonacciHeap<Object, Integer>> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super FibonacciHeap<Object, Integer>>) comparator0);
//	      fibonacciHeap0.iterator();
//	      assertEquals(0, fibonacciHeap0.size());
//	  }

	  @Test(timeout = 4000)
	  public void test_FibonacciHeap05()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        FibonacciHeap.merge((FibonacciHeap<Integer, FibonacciHeap.Entry>) null, (FibonacciHeap<Integer, FibonacciHeap.Entry>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("net.mooctest_FibonacciHeap.FibonacciHeap", e);
	      }
	  }



	  @Test(timeout = 4000)
	  public void test_FibonacciHeap07()  throws Throwable  {
	      FibonacciHeap<FibonacciHeap.Entry, String> fibonacciHeap0 = FibonacciHeap.create();
	      // Undeclared exception!
	      try { 
	        fibonacciHeap0.decreasePriority((FibonacciHeap.Entry) null, "");
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("net.mooctest_FibonacciHeap.FibonacciHeap$Entry", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_FibonacciHeap08()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        FibonacciHeap.create((Comparator<? super String>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("com.google.common.base.Preconditions", e);
	      }
	  }
//
//	  @Test(timeout = 4000)
//	  public void test_FibonacciHeap09()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) org.evosuite.shaded.org.mockito.Mockito.mock(Comparator.class, new org.evosuite.runtime.ViolatedAssumptionAnswer());
//	      FibonacciHeap<String, FibonacciHeap.Entry> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super FibonacciHeap.Entry>) comparator0);
//	      // Undeclared exception!
//	      try { 
//	        fibonacciHeap0.add("", (FibonacciHeap.Entry) null);
//	        fail("Expecting exception: NullPointerException");
//	      
//	      } catch(NullPointerException e) {
//	         //
//	         // no message in exception (getMessage() returned null)
//	         //
//	         //verifyException("com.google.common.base.Preconditions", e);
//	      }
//	  }

	  

//	  @Test(timeout = 4000)
//	  public void test_FibonacciHeap12()  throws Throwable  {
//	      FibonacciHeap<Object, Integer> fibonacciHeap0 = FibonacciHeap.create();
//	      Optional<Object> optional0 = fibonacciHeap0.pollOption();
//	      FibonacciHeap<Integer, String> fibonacciHeap1 = FibonacciHeap.create();
//	      Optional<Integer> optional1 = fibonacciHeap1.pollOption();
//	      Comparator<Object> comparator0 = (Comparator<Object>) org.evosuite.shaded.org.mockito.Mockito.mock(Comparator.class, new org.evosuite.runtime.ViolatedAssumptionAnswer());
//	      FibonacciHeap<Object, Object> fibonacciHeap2 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
//	      fibonacciHeap2.add(optional0, optional1);
//	      assertEquals(1, fibonacciHeap2.size());
//	      
//	      fibonacciHeap2.pollOption();
//	      assertEquals(0, fibonacciHeap2.size());
//	  }

	  @Test(timeout = 4000)
	  public void test_FibonacciHeap13()  throws Throwable  {
	      FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
	      fibonacciHeap0.add(fibonacciHeap0, "");
	      boolean boolean0 = fibonacciHeap0.isEmpty();
	      assertEquals(1, fibonacciHeap0.size());
	      assertFalse(boolean0);
	  }

//	  @Test(timeout = 4000)
//	  public void test_FibonacciHeap14()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) org.evosuite.shaded.org.mockito.Mockito.mock(Comparator.class, new org.evosuite.runtime.ViolatedAssumptionAnswer());
//	      FibonacciHeap<Integer, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
//	      boolean boolean0 = fibonacciHeap0.isEmpty();
//	      assertEquals(0, fibonacciHeap0.size());
//	      assertTrue(boolean0);
//	  }

//	  @Test(timeout = 4000)
//	  public void test_FibonacciHeap15()  throws Throwable  {
//	      FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create();
//	      Integer integer0 = new Integer(0);
//	      fibonacciHeap0.add("", integer0);
//	      Consumer<Object> consumer0 = (Consumer<Object>) org.evosuite.shaded.org.mockito.Mockito.mock(Consumer.class, new org.evosuite.runtime.ViolatedAssumptionAnswer());
//	      fibonacciHeap0.forEach(consumer0);
//	      assertEquals(1, fibonacciHeap0.size());
//	  }
//
//	  @Test(timeout = 4000)
//	  public void test_FibonacciHeap16()  throws Throwable  {
//	      Comparator<Integer> comparator0 = (Comparator<Integer>) org.evosuite.shaded.org.mockito.Mockito.mock(Comparator.class, new org.evosuite.runtime.ViolatedAssumptionAnswer());
//	      FibonacciHeap<FibonacciHeap.Entry, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
//	      int int0 = fibonacciHeap0.size();
//	      assertEquals(0, int0);
//	  }

//	  @Test(timeout = 4000)
//	  public void test_FibonacciHeap17()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) org.evosuite.shaded.org.mockito.Mockito.mock(Comparator.class, new org.evosuite.runtime.ViolatedAssumptionAnswer());
//	      FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
//	      fibonacciHeap0.peekOption();
//	      assertEquals(0, fibonacciHeap0.size());
//	  }

	  @Test(timeout = 4000)
	  public void test_FibonacciHeap18()  throws Throwable  {
	      FibonacciHeap<Integer, String> fibonacciHeap0 = FibonacciHeap.create();
	      // Undeclared exception!
	      try { 
	        fibonacciHeap0.remove((FibonacciHeap.Entry) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("net.mooctest_FibonacciHeap.FibonacciHeap$Entry", e);
	      }
	  }

//
//	  @Test(timeout = 4000)
//	  public void test_FibonacciHeap20()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) org.evosuite.shaded.org.mockito.Mockito.mock(Comparator.class, new org.evosuite.runtime.ViolatedAssumptionAnswer());
//	      FibonacciHeap<Object, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
//	      fibonacciHeap0.clear();
//	      assertEquals(0, fibonacciHeap0.size());
//	  }
//	
	@Test(timeout = 4000)
	  public void test_Edge00()  throws Throwable  {
	      Integer integer0 = new Integer(516);
	      Predicate<Edge<Integer>> predicate0 = Edge.hasDestination(integer0);
	      Predicate<Edge<Edge<String>>> predicate1 = Edge.isIn((Set<Edge<Edge<String>>>) null);
	      Edge<Object> edge0 = new Edge<Object>(predicate0, predicate1);
	      edge0.toString();
	      edge0.hashCode();
	      Edge.isAutoCycle();
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("M2Ld)F]<%^&ELQD}QZ#");
	      Edge<String> edge1 = edge_EdgeBuilder0.to("Edge{source=net.mooctest_Edge.Edge$1@3361ec16, destination=net.mooctest_Edge.Edge$4@11f8a00a}");
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
	      Edge.isIn((Set<Edge<Object>>) linkedHashSet0);
	      boolean boolean0 = edge1.equals(integer0);
	      assertFalse(boolean0);
	      
	      edge0.toString();
	      Integer integer1 = new Integer(1);
	      Edge<Integer> edge2 = new Edge<Integer>(integer1, integer0);
	      edge2.toString();
	      String string0 = edge2.toString();
	      assertEquals("Edge{source=1, destination=516}", string0);
	      
	      edge2.hashCode();
	      Edge.isAutoCycle();
	      Edge.from(edge0);
	      edge2.hashCode();
	      Edge.isAutoCycle();
	      Edge.EdgeBuilder<Edge<String>> edge_EdgeBuilder1 = Edge.from(edge1);
	      Edge<String> edge3 = edge_EdgeBuilder1.source;
	      boolean boolean1 = edge1.equals(edge3);
	      boolean boolean2 = edge0.equals((Object) null);
	      assertFalse(boolean2 == boolean1);
	      assertFalse(boolean2);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge01()  throws Throwable  {
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("yq9\"B");
	      Edge<String> edge0 = edge_EdgeBuilder0.to("yq9\"B");
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
	      Edge.isIn((Set<Edge<Object>>) linkedHashSet0);
	      Edge.isAutoCycle();
	      Predicate<Edge<String>> predicate0 = Edge.isAutoCycle();
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder1 = Edge.from((Object) predicate0);
	      String string0 = edge0.source;
	      Edge<Object> edge1 = new Edge<Object>(edge_EdgeBuilder1, "yq9\"B");
	      linkedHashSet0.add(edge1);
	      Edge<Object> edge2 = edge_EdgeBuilder1.to("yq9\"B");
	      LinkedHashSet<Edge<Integer>> linkedHashSet1 = new LinkedHashSet<Edge<Integer>>();
	      Edge.isIn((Set<Edge<Integer>>) linkedHashSet1);
	      linkedHashSet0.add(edge2);
	      Edge.hasDestination((Integer) null);
	      // Undeclared exception!
	      try { 
	        Edge.competesWith((Set<Edge<Object>>) linkedHashSet0);
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // duplicate key: yq9\"B
	         //
	         //verifyException("com.google.common.base.Preconditions", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_Edge02()  throws Throwable  {
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
	      Edge<String> edge0 = edge_EdgeBuilder0.to("");
	      Edge.from((Object) edge0);
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder1 = Edge.from((Object) "");
	      edge0.hashCode();
	      Integer integer0 = new Integer(3400);
	      Edge<Object> edge1 = new Edge<Object>(integer0, "");
	      boolean boolean0 = edge1.equals(edge_EdgeBuilder0);
	      Edge<String> edge2 = edge_EdgeBuilder0.to("");
	      //  // Unstable assertion: assertFalse(edge2.equals((Object)edge0));
	      
	      String string0 = edge2.destination;
	      edge_EdgeBuilder1.to("");
	      String string1 = edge1.toString();
	      //  // Unstable assertion: assertEquals("Edge{source=3400, destination=}", string1);
	      
	      Integer integer1 = new Integer(3400);
	      Edge<Integer> edge3 = new Edge<Integer>(integer1, (Integer) null);
	      Edge<Integer> edge4 = new Edge<Integer>(integer1, integer1);
	      boolean boolean1 = edge3.equals(edge4);
	      //  // Unstable assertion: assertFalse(edge4.equals((Object)edge3));
	      //  // Unstable assertion: assertTrue(boolean1 == boolean0);
	      //  // Unstable assertion: assertFalse(boolean1);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge03()  throws Throwable  {
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
	      Edge<String> edge0 = edge_EdgeBuilder0.to("");
	      Object object0 = new Object();
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder1 = Edge.from(object0);
	      Integer integer0 = new Integer((-1831));
	      Edge<Integer> edge1 = new Edge<Integer>(integer0, integer0);
	      Edge<Object> edge2 = new Edge<Object>(edge1, "");
	      String string0 = edge2.toString();
	      assertEquals("Edge{source=Edge{source=-1831, destination=-1831}, destination=}", string0);
	      
	      Edge.EdgeBuilder<Integer> edge_EdgeBuilder2 = Edge.from((Integer) null);
	      Integer integer1 = new Integer((-1831));
	      edge_EdgeBuilder2.to(integer1);
	      Edge.from(integer1);
	      Edge<Object> edge3 = edge_EdgeBuilder1.to("Edge{source=Edge{source=-1831, destination=-1831}, destination=}");
	      edge0.hashCode();
	      edge3.toString();
	      LinkedHashSet<Edge<Edge<Integer>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<Integer>>>();
	      Edge.competesWith((Set<Edge<Edge<Integer>>>) linkedHashSet0);
	      Edge<String> edge4 = edge_EdgeBuilder0.to("Edge{source=java.lang.Object@3c1cf450, destination=Edge{source=Edge{source=-1831, destination=-1831}, destination=}}");
	      boolean boolean0 = edge0.equals(edge4);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge04()  throws Throwable  {
	      Edge<String> edge0 = new Edge<String>("source", "");
	      String string0 = edge0.destination;
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) "");
	      edge_EdgeBuilder0.to("");
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      Edge<Integer> edge1 = new Edge<Integer>((Integer) null, (Integer) null);
	      linkedHashSet0.add(edge1);
	      // Undeclared exception!
	      try { 
	        Edge.competesWith((Set<Edge<Integer>>) linkedHashSet0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // null key in entry: null=null
	         //
	         //verifyException("com.google.common.base.Preconditions", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_Edge05()  throws Throwable  {
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
	      Edge<String> edge0 = edge_EdgeBuilder0.to("");
	      Edge.hasDestination("U?u");
	      edge0.hashCode();
	      Integer integer0 = new Integer(46);
	      Edge<Integer> edge1 = new Edge<Integer>(integer0, integer0);
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      LinkedHashSet<Edge<String>> linkedHashSet1 = new LinkedHashSet<Edge<String>>();
	      Edge.isIn((Set<Edge<String>>) linkedHashSet1);
	      Edge.competesWith((Set<Edge<Integer>>) linkedHashSet0);
	      edge1.hashCode();
	      LinkedHashSet<Edge<Edge<Integer>>> linkedHashSet2 = new LinkedHashSet<Edge<Edge<Integer>>>();
	      Edge<Edge<Integer>> edge2 = new Edge<Edge<Integer>>(edge1, edge1);
	      linkedHashSet2.add(edge2);
	      Edge<Edge<Integer>> edge3 = new Edge<Edge<Integer>>(edge1, edge1);
	      linkedHashSet0.add(edge1);
	      linkedHashSet2.add(edge3);
	      Edge.competesWith((Set<Edge<Edge<Integer>>>) linkedHashSet2);
	      Edge.competesWith((Set<Edge<Integer>>) linkedHashSet0);
	      Edge.hasDestination("U?u");
	      LinkedHashSet<Edge<Object>> linkedHashSet3 = new LinkedHashSet<Edge<Object>>();
	      Set<Edge<Object>> set0 = null;
	      // Undeclared exception!
	      try { 
	        Edge.competesWith((Set<Edge<Object>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("net.mooctest_Edge.Edge", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_Edge06()  throws Throwable  {
	      Integer integer0 = new Integer((-2551));
	      Edge.from(integer0);
	      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
	      Edge<String> edge0 = new Edge<String>("&p~y5ikajn", "null value in entry: %s=null");
	      linkedHashSet0.add(edge0);
	      Predicate<Edge<String>> predicate0 = Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge07()  throws Throwable  {
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("^}8i'R;6Hrz+G");
	      Edge<String> edge0 = edge_EdgeBuilder0.to("^}8i'R;6Hrz+G");
	      Edge<Object> edge1 = new Edge<Object>(edge0, edge_EdgeBuilder0);
	      edge0.toString();
	      Integer integer0 = new Integer(0);
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder1 = Edge.from((Object) integer0);
	      Edge<Object> edge2 = edge_EdgeBuilder1.to(integer0);
	      assertFalse(edge2.equals((Object)edge1));
	  }

	  @Test(timeout = 4000)
	  public void test_Edge08()  throws Throwable  {
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
	      Edge.isIn((Set<Edge<Object>>) linkedHashSet0);
	      LinkedHashSet<Edge<Object>> linkedHashSet1 = new LinkedHashSet<Edge<Object>>();
	      Predicate<Edge<Object>> predicate0 = Edge.competesWith((Set<Edge<Object>>) linkedHashSet1);
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) predicate0);
	      Edge<Object> edge0 = edge_EdgeBuilder0.to(linkedHashSet0);
	      assertFalse(linkedHashSet1.contains(edge0));
	  }

	  @Test(timeout = 4000)
	  public void test_Edge09()  throws Throwable  {
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
	      Edge<String> edge0 = edge_EdgeBuilder0.to("");
	      Edge<Object> edge1 = new Edge<Object>(edge0, edge_EdgeBuilder0);
	      boolean boolean0 = edge1.equals((Object) null);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge10()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Edge<Integer> edge0 = new Edge<Integer>((Integer) null, integer0);
	      Integer integer1 = new Integer(696);
	      Edge<Object> edge1 = new Edge<Object>(edge0, integer1);
	      Edge<Integer> edge2 = new Edge<Integer>(integer1, integer0);
	      Edge<Object> edge3 = new Edge<Object>(edge1, edge2);
	      boolean boolean0 = edge3.equals(edge1);
	      assertFalse(edge2.equals((Object)edge0));
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge11()  throws Throwable  {
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      Edge.competesWith((Set<Edge<Integer>>) linkedHashSet0);
	      Integer integer0 = new Integer(2);
	      Integer integer1 = new Integer(2);
	      Edge<Object> edge0 = new Edge<Object>(integer0, integer1);
	      String string0 = edge0.toString();
	      assertEquals("Edge{source=2, destination=2}", string0);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge12()  throws Throwable  {
	      Edge.isIn((Set<Edge<Object>>) null);
	      Predicate<Edge<String>> predicate0 = Edge.isIn((Set<Edge<String>>) null);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge13()  throws Throwable  {
	      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
	      Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
	      LinkedHashSet<Edge<Object>> linkedHashSet1 = new LinkedHashSet<Edge<Object>>();
	      Predicate<Edge<Object>> predicate0 = Edge.competesWith((Set<Edge<Object>>) linkedHashSet1);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge14()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        Edge.competesWith((Set<Edge<Object>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("net.mooctest_Edge.Edge", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_Edge15()  throws Throwable  {
	      Edge.hasDestination("");
	      Predicate<Edge<Integer>> predicate0 = Edge.isAutoCycle();
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge16()  throws Throwable  {
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("source");
	      Edge<String> edge0 = edge_EdgeBuilder0.to("*3geUJv*dMrNu!e$_n");
	      edge0.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void test_Edge17()  throws Throwable  {
	      Integer integer0 = new Integer(1);
	      Edge.EdgeBuilder<Integer> edge_EdgeBuilder0 = Edge.from(integer0);
	      assertNotNull(edge_EdgeBuilder0);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge18()  throws Throwable  {
	      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
	      linkedHashSet0.add((Edge<String>) null);
	      // Undeclared exception!
	      try { 
	        Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("net.mooctest_Edge.Edge", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_Edge19()  throws Throwable  {
	      Integer integer0 = new Integer(516);
	      Predicate<Edge<Integer>> predicate0 = Edge.hasDestination(integer0);
	      Predicate<Edge<Edge<String>>> predicate1 = Edge.isIn((Set<Edge<Edge<String>>>) null);
	      Edge<Object> edge0 = new Edge<Object>(predicate0, predicate1);
	      edge0.toString();
	      edge0.hashCode();
	      Edge.isAutoCycle();
	      Edge.from("M2Ld)F]<%^&ELQD}QZ#");
	      Edge<String> edge1 = new Edge<String>("Edge{source=net.mooctest_Edge.Edge$1@6e6aa4c2, destination=net.mooctest_Edge.Edge$4@36f1759}", "Edge{source=net.mooctest_Edge.Edge$1@6e6aa4c2, destination=net.mooctest_Edge.Edge$4@36f1759}");
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
	      edge0.toString();
	      Edge.isIn((Set<Edge<Object>>) linkedHashSet0);
	      boolean boolean0 = edge1.equals(integer0);
	      edge0.toString();
	      Integer integer1 = new Integer(1);
	      Edge.isAutoCycle();
	      Edge.from(edge0);
	      Edge.isAutoCycle();
	      Edge.EdgeBuilder<Edge<String>> edge_EdgeBuilder0 = Edge.from(edge1);
	      Edge<String> edge2 = edge_EdgeBuilder0.source;
	      LinkedHashSet<Edge<Integer>> linkedHashSet1 = new LinkedHashSet<Edge<Integer>>();
	      Edge.competesWith((Set<Edge<Integer>>) linkedHashSet1);
	      boolean boolean1 = edge1.equals(edge2);
	      assertFalse(boolean1 == boolean0);
	      
	      boolean boolean2 = edge0.equals((Object) null);
	      assertFalse(boolean2);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge20()  throws Throwable  {
	      LinkedHashSet<Edge<Edge<Object>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<Object>>>();
	      Edge.isIn((Set<Edge<Edge<Object>>>) linkedHashSet0);
	      Edge<String> edge0 = new Edge<String>("HVYkmoj1Hl5a&]", "HVYkmoj1Hl5a&]");
	      edge0.hashCode();
	      LinkedHashSet<Edge<Integer>> linkedHashSet1 = new LinkedHashSet<Edge<Integer>>();
	      Predicate<Edge<Integer>> predicate0 = Edge.competesWith((Set<Edge<Integer>>) linkedHashSet1);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge21()  throws Throwable  {
	      Edge<String> edge0 = new Edge<String>("Z3E'I>'", "Z3E'I>'");
	      boolean boolean0 = edge0.equals("Z3E'I>'");
	      Integer integer0 = new Integer(0);
	      Edge<Integer> edge1 = new Edge<Integer>(integer0, integer0);
	      boolean boolean1 = edge1.equals(edge0);
	      assertTrue(boolean1 == boolean0);
	      assertFalse(boolean1);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge22()  throws Throwable  {
	      Edge.hasDestination((Object) "");
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) "");
	      Object object0 = new Object();
	      Edge<Object> edge0 = edge_EdgeBuilder0.to(object0);
	      edge0.equals(edge_EdgeBuilder0);
	      Integer integer0 = new Integer((-3344));
	      Edge.hasDestination(integer0);
	      Edge<Object> edge1 = edge_EdgeBuilder0.to(edge0);
	      edge0.equals(edge1);
	      Edge<Edge<Object>> edge2 = new Edge<Edge<Object>>(edge0, edge0);
	      edge2.toString();
	      Predicate<Edge<Object>> predicate0 = Edge.isAutoCycle();
	      LinkedHashSet<Edge<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<String>>>();
	      Edge.isIn((Set<Edge<Edge<String>>>) linkedHashSet0);
	      Edge.EdgeBuilder<String> edge_EdgeBuilder1 = Edge.from((String) null);
	      Edge<String> edge3 = edge_EdgeBuilder1.to("");
	      edge3.equals(predicate0);
	      Edge<Edge<String>> edge4 = new Edge<Edge<String>>(edge3, edge3);
	      edge4.hashCode();
	      Edge<Integer> edge5 = new Edge<Integer>(integer0, integer0);
	  }

	  @Test(timeout = 4000)
	  public void test_Edge23()  throws Throwable  {
	      Predicate<Edge<Object>> predicate0 = Edge.isAutoCycle();
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("jRN+7|GR[");
	      String string0 = edge_EdgeBuilder0.source;
	      Edge<String> edge0 = edge_EdgeBuilder0.to("{CA@gM',QeaB2{(X");
	      edge0.hashCode();
	      Edge.isAutoCycle();
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
	      Edge.competesWith((Set<Edge<Object>>) linkedHashSet0);
	      Predicate<Edge<Object>> predicate1 = Edge.hasDestination((Object) "!mJKmWdv");
	      assertFalse(predicate1.equals((Object)predicate0));
	  }
	
	@Test(timeout = 4000)
	  public void test_DenseWeightedGraph00()  throws Throwable  {
	      ArrayDeque<Integer> arrayDeque0 = new ArrayDeque<Integer>(0);
	      Integer integer0 = new Integer(0);
	      arrayDeque0.add(integer0);
	      double[][] doubleArray0 = new double[0][0];
	      // Undeclared exception!
	      try { 
	        DenseWeightedGraph.from((Iterable<Integer>) arrayDeque0, doubleArray0);
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("com.google.common.base.Preconditions", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_DenseWeightedGraph01()  throws Throwable  {
	      HashSet<String> hashSet0 = new HashSet<String>(0, 0.8704199F);
	      hashSet0.add("");
	      double[][] doubleArray0 = new double[1][7];
	      double[] doubleArray1 = new double[7];
	      doubleArray1[0] = (double) 0.8704199F;
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<String> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<String>) hashSet0, doubleArray0);
	      double double0 = denseWeightedGraph0.getWeightOf("", "");
	      assertEquals(0.8704199194908142, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test_DenseWeightedGraph02()  throws Throwable  {
	      double[][] doubleArray0 = new double[7][6];
	      double[] doubleArray1 = new double[0];
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!
	      try { 
	        denseWeightedGraph0.getWeightOf(integer0, integer0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 0
	         //
	         //verifyException("net.mooctest_DenseWeightedGraph.DenseWeightedGraph", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_DenseWeightedGraph03()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        DenseWeightedGraph.from((double[][]) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("net.mooctest_DenseWeightedGraph.DenseWeightedGraph", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_DenseWeightedGraph04()  throws Throwable  {
	      ArrayDeque<String> arrayDeque0 = new ArrayDeque<String>();
	      // Undeclared exception!
	      try { 
	        DenseWeightedGraph.from((Iterable<String>) arrayDeque0, (double[][]) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("net.mooctest_DenseWeightedGraph.DenseWeightedGraph", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_DenseWeightedGraph05()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][9];
	      // Undeclared exception!
	      try { 
	        DenseWeightedGraph.from((Iterable<String>) null, doubleArray0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("com.google.common.base.Preconditions", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_DenseWeightedGraph06()  throws Throwable  {
	      HashSet<String> hashSet0 = new HashSet<String>(0, 0.8704199F);
	      hashSet0.add("");
	      double[][] doubleArray0 = new double[1][7];
	      DenseWeightedGraph<String> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<String>) hashSet0, doubleArray0);
	      Collection<Weighted<Edge<String>>> collection0 = denseWeightedGraph0.getIncomingEdges("");
	      assertNotNull(collection0);
	  }

	  @Test(timeout = 4000)
	  public void test_DenseWeightedGraph07()  throws Throwable  {
	      HashSet<Object> hashSet0 = new HashSet<Object>();
	      double[][] doubleArray0 = new double[0][6];
	      DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) hashSet0, doubleArray0);
	      Collection<Weighted<Edge<Object>>> collection0 = denseWeightedGraph0.getIncomingEdges(hashSet0);
	      assertNotNull(collection0);
	  }

	  @Test(timeout = 4000)
	  public void test_DenseWeightedGraph08()  throws Throwable  {
	      HashSet<String> hashSet0 = new HashSet<String>(0, 0.8704199F);
	      hashSet0.add("");
	      double[][] doubleArray0 = new double[1][7];
	      DenseWeightedGraph<String> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<String>) hashSet0, doubleArray0);
	      double double0 = denseWeightedGraph0.getWeightOf("", "Q");
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test_DenseWeightedGraph09()  throws Throwable  {
	      double[][] doubleArray0 = new double[0][6];
	      Class<Locale.Category> class0 = Locale.Category.class;
	      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
	      ServiceLoader<Locale.Category> serviceLoader0 = ServiceLoader.load(class0, classLoader0);
	      DenseWeightedGraph<Locale.Category> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.Category>) serviceLoader0, doubleArray0);
	      Locale.Category locale_Category0 = Locale.Category.FORMAT;
	      double double0 = denseWeightedGraph0.getWeightOf(locale_Category0, locale_Category0);
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test_DenseWeightedGraph10()  throws Throwable  {
	      double[][] doubleArray0 = new double[7][6];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
	      assertEquals(0.0, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test_DenseWeightedGraph11()  throws Throwable  {
	      ArrayList<String> arrayList0 = new ArrayList<String>();
	      LinkedList<String> linkedList0 = new LinkedList<String>(arrayList0);
	      double[][] doubleArray0 = new double[1][5];
	      // Undeclared exception!
	      try { 
	        DenseWeightedGraph.from((Iterable<String>) linkedList0, doubleArray0);
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         //verifyException("com.google.common.base.Preconditions", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_DenseWeightedGraph12()  throws Throwable  {
	      double[][] doubleArray0 = new double[0][6];
	      TreeSet<String> treeSet0 = new TreeSet<String>();
	      DenseWeightedGraph<String> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<String>) treeSet0, doubleArray0);
	      Collection<String> collection0 = denseWeightedGraph0.getNodes();
	      assertNotNull(collection0);
	  }
	
	  @Test(timeout = 4000)
	  public void test_ChuLiuEdmonds00()  throws Throwable  {
	      ArrayList<Weighted<Edge<Weighted<Locale.FilteringMode>>>> arrayList0 = new ArrayList<Weighted<Edge<Weighted<Locale.FilteringMode>>>>();
	      SparseWeightedGraph<Weighted<Locale.FilteringMode>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Weighted<Locale.FilteringMode>>>>) arrayList0);
	      LinkedHashSet<Edge<Weighted<Locale.FilteringMode>>> linkedHashSet0 = new LinkedHashSet<Edge<Weighted<Locale.FilteringMode>>>();
	      HashSet<Edge<Weighted<Locale.FilteringMode>>> hashSet0 = new HashSet<Edge<Weighted<Locale.FilteringMode>>>(0);
	      Weighted<Arborescence<Weighted<Locale.FilteringMode>>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Weighted<Locale.FilteringMode>>) sparseWeightedGraph0, (Set<Edge<Weighted<Locale.FilteringMode>>>) linkedHashSet0, (Set<Edge<Weighted<Locale.FilteringMode>>>) hashSet0);
	      assertNotNull(weighted0);
	  }

	  

	  


	  @Test(timeout = 4000)
	  public void test_ChuLiuEdmonds04()  throws Throwable  {
	      double[][] doubleArray0 = new double[7][7];
	      double[] doubleArray1 = new double[2];
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, integer0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 2
	         //
//	         verifyException("net.mooctest_ChuLiuEdmonds.DenseWeightedGraph", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_ChuLiuEdmonds05()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
//	         verifyException("net.mooctest_ChuLiuEdmonds.ChuLiuEdmonds", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_ChuLiuEdmonds06()  throws Throwable  {
	      double[][] doubleArray0 = new double[4][3];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 3
	         //
//	         verifyException("net.mooctest_ChuLiuEdmonds.DenseWeightedGraph", e);
	      }
	  }


	  @Test(timeout = 4000)
	  public void test_ChuLiuEdmonds08()  throws Throwable  {
	      ArrayList<Object> arrayList0 = new ArrayList<Object>();
	      double[][] doubleArray0 = new double[0][0];
	      DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) arrayList0, doubleArray0);
	      ChuLiuEdmonds.PartialSolution<Object> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Object>) denseWeightedGraph0);
	      Set<Object> set0 = chuLiuEdmonds_PartialSolution0.getNodes();
	      assertTrue(set0.isEmpty());
	  }

	  @Test(timeout = 4000)
	  public void test_ChuLiuEdmonds09()  throws Throwable  {
	      double[][] doubleArray0 = new double[8][2];
	      double[] doubleArray1 = new double[5];
	      doubleArray1[0] = Double.NEGATIVE_INFINITY;
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 2
	         //
//	         verifyException("net.mooctest_ChuLiuEdmonds.DenseWeightedGraph", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_ChuLiuEdmonds10()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][9];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, integer0);
	      assertNotNull(weighted0);
	  }

	  @Test(timeout = 4000)
	  public void test_ChuLiuEdmonds11()  throws Throwable  {
	      TreeSet<Weighted<Edge<String>>> treeSet0 = new TreeSet<Weighted<Edge<String>>>();
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) treeSet0);
	      ChuLiuEdmonds.PartialSolution<String> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<String>) sparseWeightedGraph0);
	      Optional<ExclusiveEdge<String>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge("");
	      assertNotNull(optional0);
	  }



	  @Test(timeout = 4000)
	  public void test_ChuLiuEdmonds13()  throws Throwable  {
	      HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) null, (Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) hashSet0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
//	         verifyException("net.mooctest_ChuLiuEdmonds.ChuLiuEdmonds", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_ChuLiuEdmonds14()  throws Throwable  {
	      ChuLiuEdmonds chuLiuEdmonds0 = new ChuLiuEdmonds();
	  }
	

	  @Test(timeout = 4000)
	  public void test_Arborescence0()  throws Throwable  {
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      // Undeclared exception!
	      try { 
	        arborescence0.contains((Edge<Integer>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
//	         verifyException("net.mooctest_Arborescence.Arborescence", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test_Arborescence1()  throws Throwable  {
	      Arborescence<Comparable<Arborescence<String>>> arborescence0 = Arborescence.empty();
	      Arborescence<AbstractMap.SimpleImmutableEntry<String, Object>> arborescence1 = Arborescence.empty();
	      boolean boolean0 = arborescence1.equals(arborescence0);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Arborescence2()  throws Throwable  {
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      boolean boolean0 = arborescence0.equals((Object) null);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Arborescence3()  throws Throwable  {
	      Arborescence<Comparable<Object>> arborescence0 = Arborescence.empty();
	      boolean boolean0 = arborescence0.equals("");
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Arborescence4()  throws Throwable  {
	      Arborescence<AbstractMap.SimpleImmutableEntry<String, Object>> arborescence0 = Arborescence.empty();
	      String string0 = arborescence0.toString();
	      assertEquals("Arborescence{}", string0);
	  }



	  @Test(timeout = 4000)
	  public void test_Arborescence6()  throws Throwable  {
	      Arborescence<String> arborescence0 = Arborescence.empty();
	      Edge<String> edge0 = new Edge<String>("", "");
	      boolean boolean0 = arborescence0.contains(edge0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test_Arborescence7()  throws Throwable  {
	      Arborescence<Arborescence<Integer>> arborescence0 = Arborescence.empty();
	      arborescence0.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void test_Arborescence8()  throws Throwable  {
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      Integer integer0 = new Integer(0);
	      ImmutableBiMap<Integer, Integer> immutableBiMap0 = ImmutableBiMap.of(integer0, integer0);
	      Arborescence<Integer> arborescence1 = Arborescence.of((ImmutableMap<Integer, Integer>) immutableBiMap0);
	      // Undeclared exception!
	      try { 
	        ImmutableBiMap.of(arborescence0, arborescence0, arborescence0, arborescence1);
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // Multiple entries with same key: Arborescence{}=Arborescence{0 -> 0} and Arborescence{}=Arborescence{}
	         //
//	         verifyException("com.google.common.collect.RegularImmutableBiMap", e);
	      }
	  }
	
}
