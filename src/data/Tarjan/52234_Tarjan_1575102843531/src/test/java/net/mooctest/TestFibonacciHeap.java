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
import java.util.ConcurrentModificationException;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Locale.Category;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Consumer;

import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;

import net.mooctest.EdgeQueueMap.EdgeQueue;


public class TestFibonacciHeap {
	@Test(timeout = 4000)
	  public void Arbtest00()  throws Throwable  {
	      Arborescence<String> arborescence0 = Arborescence.empty();
	      // Undeclared exception!
	      try { 
	        ImmutableBiMap.of(arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0);
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	       
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Arbtest01()  throws Throwable  {
	      Arborescence<Arborescence<String>> arborescence0 = Arborescence.of((ImmutableMap<Arborescence<String>, Arborescence<String>>) null);
	      // Undeclared exception!
	      try { 
	        arborescence0.toString();
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void Arbtest02()  throws Throwable  {
	      Arborescence<Comparable<Integer>> arborescence0 = Arborescence.of((ImmutableMap<Comparable<Integer>, Comparable<Integer>>) null);
	      Arborescence<Comparable<Comparable>> arborescence1 = Arborescence.empty();
	      // Undeclared exception!
	      try { 
	        arborescence0.equals(arborescence1);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void Arbtest03()  throws Throwable  {
	      Arborescence<Comparable<Object>> arborescence0 = Arborescence.empty();
	      // Undeclared exception!
	      try { 
	        arborescence0.contains((Edge<Comparable<Object>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void Arbtest04()  throws Throwable  {
	      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "", " ", "", ",", "", "d", "");
	      Arborescence<String> arborescence0 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
	      Arborescence<Comparable<Object>> arborescence1 = Arborescence.empty();
	      boolean boolean0 = arborescence0.equals(arborescence1);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Arbtest05()  throws Throwable  {
	      Arborescence<String> arborescence0 = Arborescence.empty();
	      Object object0 = new Object();
	      ImmutableBiMap<Object, Object> immutableBiMap0 = ImmutableBiMap.of((Object) arborescence0, object0);
	      Arborescence<Object> arborescence1 = Arborescence.of((ImmutableMap<Object, Object>) immutableBiMap0);
	      Edge<Object> edge0 = new Edge<Object>(arborescence1, arborescence1);
	      boolean boolean0 = arborescence1.contains(edge0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Arbtest06()  throws Throwable  {
	      ImmutableMap<Object, Object> immutableMap0 = ImmutableMap.of();
	      Arborescence<Object> arborescence0 = Arborescence.of(immutableMap0);
	      boolean boolean0 = arborescence0.equals((Object) null);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Arbtest07()  throws Throwable  {
	      Arborescence<String> arborescence0 = Arborescence.empty();
	      Object object0 = new Object();
	      boolean boolean0 = arborescence0.equals(object0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Arbtest08()  throws Throwable  {
	      Arborescence<String> arborescence0 = Arborescence.empty();
	      Object object0 = new Object();
	      ImmutableBiMap<Object, Object> immutableBiMap0 = ImmutableBiMap.of((Object) arborescence0, object0);
	      Arborescence<Object> arborescence1 = Arborescence.of((ImmutableMap<Object, Object>) immutableBiMap0);
	      String string0 = arborescence1.toString();
	      assertNotNull(string0);
	  }

	  @Test(timeout = 4000)
	  public void Arbtest09()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      ImmutableBiMap<Integer, Integer> immutableBiMap0 = ImmutableBiMap.of(integer0, integer0);
	      Arborescence<Integer> arborescence0 = Arborescence.of((ImmutableMap<Integer, Integer>) immutableBiMap0);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
	      boolean boolean0 = arborescence0.contains(edge0);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Arbtest10()  throws Throwable  {
	      Arborescence<Object> arborescence0 = Arborescence.empty();
	      arborescence0.hashCode();
	  }
	  @Test(timeout = 4000)
	  public void Chutest00()  throws Throwable  {
	      HashSet<Weighted<Edge<String>>> hashSet0 = new HashSet<Weighted<Edge<String>>>(0);
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) hashSet0);
	      HashSet<Edge<String>> hashSet1 = new HashSet<Edge<String>>();
	      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
	      Weighted<Arborescence<String>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) sparseWeightedGraph0, (Set<Edge<String>>) hashSet1, (Set<Edge<String>>) linkedHashSet0);
	      assertNotNull(weighted0);
	  }

	  @Test(timeout = 4000)
	  public void Chutest01()  throws Throwable  {
	      ArrayList<Comparable<String>> arrayList0 = new ArrayList<Comparable<String>>(0);
	      LinkedHashSet<Weighted<Edge<Comparable<String>>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<Comparable<String>>>>(0);
	      SparseWeightedGraph<Comparable<String>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Comparable<String>>) arrayList0, (Iterable<Weighted<Edge<Comparable<String>>>>) linkedHashSet0);
	      ChuLiuEdmonds.PartialSolution<Comparable<String>> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Comparable<String>>) sparseWeightedGraph0);
	   
	      Stack<Edge<Comparable<String>>> stack0 = new Stack<Edge<Comparable<String>>>();
//	      ExclusiveEdge<Comparable<String>> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<Comparable<String>>>) stack0, 0.6);
	      // Undeclared exception!
	      try { 
	        chuLiuEdmonds_PartialSolution0.addEdge(null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }



	@Test(timeout = 4000)
	  public void Chutest02()  throws Throwable  {
	      HashSet<ExclusiveEdge<Object>> hashSet0 = new HashSet<ExclusiveEdge<Object>>(0);
	      LinkedHashSet<Weighted<Edge<ExclusiveEdge<Object>>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<ExclusiveEdge<Object>>>>();
	      SparseWeightedGraph<ExclusiveEdge<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<ExclusiveEdge<Object>>) hashSet0, (Iterable<Weighted<Edge<ExclusiveEdge<Object>>>>) linkedHashSet0);
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<ExclusiveEdge<Object>>) sparseWeightedGraph0, (Set<Edge<ExclusiveEdge<Object>>>) null, (Set<Edge<ExclusiveEdge<Object>>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

//	  @Test(timeout = 4000)
//	  public void Chutest03()  throws Throwable  {
//	      Vector<ExclusiveEdge<Locale.Category>> vector0 = new Vector<ExclusiveEdge<Locale.Category>>();
//	      TreeSet<Weighted<Edge<ExclusiveEdge<Locale.Category>>>> treeSet0 = new TreeSet<Weighted<Edge<ExclusiveEdge<Locale.Category>>>>();
//	      SparseWeightedGraph<ExclusiveEdge<Locale.Category>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<ExclusiveEdge<Locale.Category>>) vector0, (Iterable<Weighted<Edge<ExclusiveEdge<Locale.Category>>>>) treeSet0);
//	      HashSet<Edge<ExclusiveEdge<Locale.Category>>> hashSet0 = new HashSet<Edge<ExclusiveEdge<Locale.Category>>>();
//	      
//	      // Undeclared exception!
//	      try { 
//	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<ExclusiveEdge<Locale.Category>>) sparseWeightedGraph0, (Set<Edge<ExclusiveEdge<Locale.Category>>>) hashSet0, (Set<Edge<ExclusiveEdge<Locale.Category>>>) hashSet0);
//	        fail("Expecting exception: NullPointerException");
//	      
//	      } catch(NullPointerException e) {
//	         //
//	         // null key in entry: null=null
//	         //
//	        
//	      }
//	  }

	  @Test(timeout = 4000)
	  public void Chutest04()  throws Throwable  {
	      double[][] doubleArray0 = new double[5][2];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>();
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) treeSet0, (Set<Edge<Integer>>) treeSet0);
	        fail("Expecting exception: ClassCastException");
	      
	      } catch(ClassCastException e) {
	         //
	         // net.mooctest.Edge cannot be cast to java.lang.Comparable
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Chutest05()  throws Throwable  {
	      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Locale.Category>) null, locale_Category0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Chutest06()  throws Throwable  {
	      double[][] doubleArray0 = new double[2][8];
	      double[] doubleArray1 = new double[0];
	      doubleArray0[1] = doubleArray1;
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
	  public void Chutest07()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Chutest08()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][0];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 0
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Chutest09()  throws Throwable  {
	      Vector<Weighted<Edge<Edge<String>>>> vector0 = new Vector<Weighted<Edge<Edge<String>>>>(0);
	      Vector<Weighted<Edge<Weighted<Edge<Edge<String>>>>>> vector1 = new Vector<Weighted<Edge<Weighted<Edge<Edge<String>>>>>>(0, 0);
	      SparseWeightedGraph<Weighted<Edge<Edge<String>>>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Edge<String>>>>) vector0, (Iterable<Weighted<Edge<Weighted<Edge<Edge<String>>>>>>) vector1);
	      Weighted<Arborescence<Weighted<Edge<Edge<String>>>>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Weighted<Edge<Edge<String>>>>) sparseWeightedGraph0);
	      assertNotNull(weighted0);
	  }

	  @Test(timeout = 4000)
	  public void Chutest10()  throws Throwable  {
	      double[][] doubleArray0 = new double[6][8];
	      double[] doubleArray1 = new double[4];
	      doubleArray1[3] = Double.NEGATIVE_INFINITY;
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      // Undeclared exception!
	      try { 
	        ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 4
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Chutest11()  throws Throwable  {
	      LinkedList<Object> linkedList0 = new LinkedList<Object>();
	      double[][] doubleArray0 = new double[0][7];
	      DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) linkedList0, doubleArray0);
	      ChuLiuEdmonds.PartialSolution<Object> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Object>) denseWeightedGraph0);
	      Set<Object> set0 = chuLiuEdmonds_PartialSolution0.getNodes();
	      assertEquals(0, set0.size());
	  }

	  @Test(timeout = 4000)
	  public void Chutest12()  throws Throwable  {
	      HashSet<Weighted<Edge<Integer>>> hashSet0 = new HashSet<Weighted<Edge<Integer>>>();
	      SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Integer>>>) hashSet0);
	      ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) sparseWeightedGraph0);
	      Integer integer0 = new Integer(0);
	      Optional<ExclusiveEdge<Integer>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge(integer0);
	      assertNotNull(optional0);
	  }

	  @Test(timeout = 4000)
	  public void Chutest13()  throws Throwable  {
	      ArrayList<Object> arrayList0 = new ArrayList<Object>(0);
	      ArrayDeque<Weighted<Edge<Object>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Object>>>();
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) arrayList0, (Iterable<Weighted<Edge<Object>>>) arrayDeque0);
	      ChuLiuEdmonds.PartialSolution<Object> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Object>) sparseWeightedGraph0);
	      Integer integer0 = new Integer(0);
	      ImmutableMap<Object, Object> immutableMap0 = ImmutableMap.of();
	      Arborescence<Object> arborescence0 = Arborescence.of(immutableMap0);
	      Optional<ExclusiveEdge<Object>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge((Object) integer0, arborescence0);
	      assertNotNull(optional0);
	  }

	  @Test(timeout = 4000)
	  public void Chutest14()  throws Throwable  {
	      double[][] doubleArray0 = new double[2][3];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) linkedHashSet0, (Set<Edge<Integer>>) linkedHashSet0);
	      assertNotNull(weighted0);
	  }

	  @Test(timeout = 4000)
	  public void Chutest15()  throws Throwable  {
	      double[][] doubleArray0 = new double[2][8];
	      double[] doubleArray1 = new double[6];
	      doubleArray1[0] = Double.NEGATIVE_INFINITY;
	      doubleArray0[0] = doubleArray1;
	      doubleArray0[1] = doubleArray0[0];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(1);
	      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, integer0);
	      assertNotNull(weighted0);
	  }
	  @Test(timeout = 4000)
	  public void Dentest00()  throws Throwable  {
	      HashSet<Object> hashSet0 = new HashSet<Object>();
	      double[][] doubleArray0 = new double[0][7];
	      DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) hashSet0, doubleArray0);
	      hashSet0.add(denseWeightedGraph0);
	      // Undeclared exception!
	      try { 
	        DenseWeightedGraph.from((Iterable<Object>) hashSet0, doubleArray0);
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void Dentest01()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][1];
	      double[] doubleArray1 = new double[9];
	      doubleArray0[0] = doubleArray1;
	      doubleArray1[0] = 0.5539454707421875;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
	      assertEquals(0.5539454707421875, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void Dentest02()  throws Throwable  {
	      double[][] doubleArray0 = new double[8][1];
	      double[] doubleArray1 = new double[0];
	      doubleArray0[3] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!
	      try { 
	        denseWeightedGraph0.getIncomingEdges(integer0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 0
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Dentest03()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        DenseWeightedGraph.from((double[][]) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Dentest04()  throws Throwable  {
	      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
	      EnumSet<Locale.Category> enumSet0 = EnumSet.of(locale_Category0, locale_Category0, locale_Category0, locale_Category0, locale_Category0);
	      // Undeclared exception!
	      try { 
	        DenseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, (double[][]) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Dentest05()  throws Throwable  {
	      double[][] doubleArray0 = new double[1][5];
	      // Undeclared exception!
	      try { 
	        DenseWeightedGraph.from((Iterable<Object>) null, doubleArray0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void Dentest06()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][1];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer((-1));
	      Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
	      assertNotNull(collection0);
	  }

	  @Test(timeout = 4000)
	  public void Dentest07()  throws Throwable  {
	      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
	      EnumSet<Locale.Category> enumSet0 = EnumSet.of(locale_Category0, locale_Category0);
	      double[][] doubleArray0 = new double[1][8];
	      DenseWeightedGraph<Locale.Category> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, doubleArray0);
	      Locale.Category locale_Category1 = Locale.Category.FORMAT;
	      double double0 = denseWeightedGraph0.getWeightOf(locale_Category0, locale_Category1);
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void Dentest08()  throws Throwable  {
	      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
	      EnumSet<Locale.Category> enumSet0 = EnumSet.of(locale_Category0, locale_Category0);
	      double[][] doubleArray0 = new double[1][8];
	      DenseWeightedGraph<Locale.Category> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, doubleArray0);
	      double double0 = denseWeightedGraph0.getWeightOf(locale_Category0, locale_Category0);
	      assertEquals(0.0, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void Dentest09()  throws Throwable  {
	      HashSet<Object> hashSet0 = new HashSet<Object>();
	      double[][] doubleArray0 = new double[0][7];
	      DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) hashSet0, doubleArray0);
	      double double0 = denseWeightedGraph0.getWeightOf(hashSet0, hashSet0);
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void Dentest10()  throws Throwable  {
	      
	      TreeSet<Object> treeSet0 = new TreeSet<Object>();
	      double[][] doubleArray0 = new double[1][4];
	      // Undeclared exception!
	      try { 
	        DenseWeightedGraph.from((Iterable<Object>) treeSet0, doubleArray0);
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void Dentest11()  throws Throwable  {
	      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
	      EnumSet<Locale.Category> enumSet0 = EnumSet.of(locale_Category0, locale_Category0);
	      double[][] doubleArray0 = new double[1][8];
	      DenseWeightedGraph<Locale.Category> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, doubleArray0);
	      Collection<Locale.Category> collection0 = denseWeightedGraph0.getNodes();
	      assertTrue(collection0.contains(locale_Category0));
	  }

	  @Test(timeout = 4000)
	  public void Dentest12()  throws Throwable  {
	      double[][] doubleArray0 = new double[10][1];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
	      assertNotNull(collection0);
	  }
	  @Test(timeout = 4000)
	  public void Edgetest00()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Edge<Object> edge0 = new Edge<Object>(integer0, (Object) null);
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      Integer integer1 = new Integer(2);
	      Edge<Integer> edge1 = new Edge<Integer>(integer1, integer0);
	      linkedHashSet0.add(edge1);
	      Edge<Integer> edge2 = new Edge<Integer>(integer0, integer0);
	      LinkedHashSet<Edge<Object>> linkedHashSet1 = new LinkedHashSet<Edge<Object>>();
	      Integer integer2 = new Integer(0);
	      Integer integer3 = new Integer((-1796));
	      Edge<Integer> edge3 = new Edge<Integer>(integer2, integer3);
	      linkedHashSet0.add(edge3);
	      Edge.isIn((Set<Edge<Object>>) linkedHashSet1);
	      linkedHashSet0.add(edge2);
	      // Undeclared exception!
	      try { 
	        Edge.competesWith((Set<Edge<Integer>>) linkedHashSet0);
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // duplicate key: 0
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void Edgetest01()  throws Throwable  {
	      Edge.isAutoCycle();
	      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
	      Edge<String> edge0 = new Edge<String>((String) null, "source");
	      linkedHashSet0.add(edge0);
	      linkedHashSet0.parallelStream();
	      // Undeclared exception!
	      try { 
	        Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // null value in entry: source=null
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void Edgetest02()  throws Throwable  {
	      Edge<String> edge0 = new Edge<String>("QKW$g.n\"", "");
	      Edge<Object> edge1 = new Edge<Object>(edge0, edge0);
	      Integer integer0 = new Integer((-1095));
	      Edge.EdgeBuilder<Integer> edge_EdgeBuilder0 = Edge.from(integer0);
	      Edge edge2 = (Edge)edge1.destination;
	      edge0.equals(edge2);
	      Integer integer1 = new Integer(2227);
	      Edge.hasDestination(integer1);
	      Edge.isAutoCycle();
	      Edge<Edge<String>> edge3 = new Edge<Edge<String>>(edge0, edge0);
	      edge3.toString();
	      Edge<Integer> edge4 = edge_EdgeBuilder0.to(integer0);
	      Edge<String> edge5 = edge3.destination;
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
	      Edge.competesWith((Set<Edge<Object>>) linkedHashSet0);
	      edge1.equals(edge5);
	      edge1.hashCode();
	      Edge<String> edge6 = new Edge<String>("Edge{source=Edge{source=QKW$g.n\", destination=}, destination=Edge{source=QKW$g.n\", destination=}}", "");
	      edge1.equals(edge6);
	      edge0.equals("");
	      edge6.equals(edge4);
	      Edge.isIn((Set<Edge<Object>>) linkedHashSet0);
	      Object object0 = new Object();
	      Edge.hasDestination(object0);
	      Integer integer2 = new Integer(2227);
	      Edge.EdgeBuilder<Integer> edge_EdgeBuilder1 = Edge.from(integer2);
	      assertFalse(edge_EdgeBuilder1.equals((Object)edge_EdgeBuilder0));
	  }

	  @Test(timeout = 4000)
	  public void Edgetest03()  throws Throwable  {
	      Object object0 = new Object();
	      Edge<Object> edge0 = new Edge<Object>(object0, object0);
	      Edge.isAutoCycle();
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      Edge.isIn((Set<Edge<Integer>>) linkedHashSet0);
	      LinkedHashSet<Edge<Integer>> linkedHashSet1 = new LinkedHashSet<Edge<Integer>>();
	      Integer integer0 = new Integer(0);
	      Integer integer1 = new Integer((-3258));
	      Edge<Integer> edge1 = new Edge<Integer>(integer0, integer1);
	      linkedHashSet1.add(edge1);
	      Edge<Integer> edge2 = new Edge<Integer>(integer0, integer1);
	      linkedHashSet1.add(edge2);
	      Edge.isIn((Set<Edge<Integer>>) linkedHashSet1);
	      Edge.hasDestination(edge0);
	      Edge.hasDestination("");
	      Edge<String> edge3 = new Edge<String>("null value in entry: %s=null", "");
	      edge3.toString();
	      Edge.hasDestination(edge0);
	      LinkedHashSet<Edge<Object>> linkedHashSet2 = new LinkedHashSet<Edge<Object>>();
	      Edge.competesWith((Set<Edge<Object>>) linkedHashSet2);
	      Edge.isAutoCycle();
	      Edge.EdgeBuilder<Edge<Object>> edge_EdgeBuilder0 = Edge.from(edge0);
	      Edge<Edge<Object>> edge4 = edge_EdgeBuilder0.to(edge0);
	      assertNotNull(edge4);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest04()  throws Throwable  {
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
	      Edge.isIn((Set<Edge<Object>>) linkedHashSet0);
	      LinkedHashSet<Edge<Integer>> linkedHashSet1 = new LinkedHashSet<Edge<Integer>>();
	      linkedHashSet1.clone();
	      Edge.isIn((Set<Edge<Integer>>) linkedHashSet1);
	      Edge.isAutoCycle();
	      Integer integer0 = new Integer(1);
	      Integer integer1 = new Integer(1);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer1);
	      Edge<Object> edge1 = new Edge<Object>(edge0, linkedHashSet1);
	      Edge edge2 = (Edge)edge1.source;
	      Edge<Object> edge3 = new Edge<Object>(edge2, "");
	      boolean boolean0 = edge1.equals(edge3);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest05()  throws Throwable  {
	      Edge<String> edge0 = new Edge<String>("", "");
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) edge0);
	      edge_EdgeBuilder0.to("");
	      Integer integer0 = new Integer(1254);
	      Edge.from(integer0);
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
	      Edge.competesWith((Set<Edge<Object>>) linkedHashSet0);
	      Edge<String> edge1 = new Edge<String>("null value in entry: %s=null", "* oaes{");
	      Integer integer1 = new Integer(0);
	      Edge.hasDestination((Object) integer1);
	      boolean boolean0 = edge0.equals(edge1);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest06()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Integer integer1 = new Integer(1108);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer1);
	      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
	      Edge.isIn((Set<Edge<String>>) linkedHashSet0);
	      Integer integer2 = new Integer(0);
	      Edge<Integer> edge1 = new Edge<Integer>(integer2, integer1);
	      edge0.equals(edge1);
	      LinkedHashSet<Edge<Object>> linkedHashSet1 = new LinkedHashSet<Edge<Object>>();
	      Predicate<Edge<Object>> predicate0 = Edge.isIn((Set<Edge<Object>>) linkedHashSet1);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest07()  throws Throwable  {
	      Edge<String> edge0 = new Edge<String>("", "");
	      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
	      Predicate<Edge<String>> predicate0 = Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest08()  throws Throwable  {
	      Integer integer0 = new Integer((-514));
	      Predicate<Edge<Integer>> predicate0 = Edge.hasDestination(integer0);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest09()  throws Throwable  {
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>(4794, 4635.502F);
	      Predicate<Edge<Object>> predicate0 = Edge.isIn((Set<Edge<Object>>) linkedHashSet0);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest10()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Edge<Object> edge0 = new Edge<Object>(integer0, integer0);
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) edge0);
	      Edge<Integer> edge1 = new Edge<Integer>(integer0, integer0);
	      edge1.toString();
	      Edge.isAutoCycle();
	      Object object0 = new Object();
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder1 = Edge.from(object0);
	      assertFalse(edge_EdgeBuilder1.equals((Object)edge_EdgeBuilder0));
	  }

	  @Test(timeout = 4000)
	  public void Edgetest11()  throws Throwable  {
	      Edge<String> edge0 = new Edge<String>("N94n;wM", "");
	      Integer integer0 = new Integer((-863));
	      Edge<Object> edge1 = new Edge<Object>(integer0, edge0);
	      Integer integer1 = (Integer)edge1.source;
	      boolean boolean0 = edge0.equals(integer1);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest12()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
	      boolean boolean0 = edge0.equals(integer0);
	      boolean boolean1 = edge0.equals((Object) null);
	      assertTrue(boolean1 == boolean0);
	      assertFalse(boolean1);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest13()  throws Throwable  {
	      Predicate<Edge<Edge<Object>>> predicate0 = Edge.isAutoCycle();
	      Edge.isAutoCycle();
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) predicate0);
	      Edge<Object> edge0 = edge_EdgeBuilder0.to((Object) null);
	      assertNotNull(edge0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest14()  throws Throwable  {
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) linkedHashSet0);
	      LinkedHashSet linkedHashSet1 = (LinkedHashSet)edge_EdgeBuilder0.source;
	      Edge<Object> edge0 = new Edge<Object>(linkedHashSet1, edge_EdgeBuilder0);
	      edge0.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void Edgetest15()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        Edge.competesWith((Set<Edge<Edge<Object>>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void Edgetest16()  throws Throwable  {
	      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
	      Edge<String> edge0 = new Edge<String>("", "");
	      linkedHashSet0.add(edge0);
	      Predicate<Edge<String>> predicate0 = Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest17()  throws Throwable  {
	      Edge<Object> edge0 = new Edge<Object>("M}-n", "M}-n");
	      boolean boolean0 = edge0.equals("M}-n");
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest18()  throws Throwable  {
	      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
	      Predicate<Edge<String>> predicate0 = Edge.isIn((Set<Edge<String>>) linkedHashSet0);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest19()  throws Throwable  {
	      Predicate<Edge<Object>> predicate0 = Edge.isAutoCycle();
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest20()  throws Throwable  {
	      Integer integer0 = new Integer((-1284));
	      Predicate<Edge<Integer>> predicate0 = Edge.hasDestination(integer0);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest21()  throws Throwable  {
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
	      Predicate<Edge<Object>> predicate0 = Edge.competesWith((Set<Edge<Object>>) linkedHashSet0);
	      assertNotNull(predicate0);
	      
	      Edge<String> edge0 = new Edge<String>("&NB1ZVW", "&NB1ZVW");
	      String string0 = edge0.toString();
	      assertEquals("Edge{source=&NB1ZVW, destination=&NB1ZVW}", string0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest22()  throws Throwable  {
	      Edge<String> edge0 = new Edge<String>("", "");
	      edge0.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void Edgetest23()  throws Throwable  {
	      Edge<String> edge0 = new Edge<String>("", "");
	      Edge.EdgeBuilder<Edge<String>> edge_EdgeBuilder0 = Edge.from(edge0);
	      Edge<Edge<String>> edge1 = edge_EdgeBuilder0.to(edge0);
	      assertNotNull(edge1);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest24()  throws Throwable  {
	      Integer integer0 = new Integer((-1666));
	      Edge.EdgeBuilder<Integer> edge_EdgeBuilder0 = Edge.from(integer0);
	      assertNotNull(edge_EdgeBuilder0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest25()  throws Throwable  {
	      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
	      Edge<String> edge0 = new Edge<String>("fR`FlKcXdX.jaQ@h8", "fR`FlKcXdX.jaQ@h8");
	      Integer integer0 = new Integer(3696);
	      Edge.hasDestination((Object) integer0);
	      linkedHashSet0.add(edge0);
	      Edge<String> edge1 = new Edge<String>("3rf-[2", "3rf-[2");
	      edge1.toString();
	      linkedHashSet0.add(edge1);
	      Predicate<Edge<String>> predicate0 = Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest26()  throws Throwable  {
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
	      Edge.isIn((Set<Edge<Object>>) linkedHashSet0);
	      LinkedHashSet<Edge<Integer>> linkedHashSet1 = new LinkedHashSet<Edge<Integer>>();
	      linkedHashSet1.clone();
	      Edge.isIn((Set<Edge<Integer>>) linkedHashSet1);
	      Integer integer0 = new Integer(1);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
	      Edge<Object> edge1 = new Edge<Object>(edge0, linkedHashSet1);
	      Edge edge2 = (Edge)edge1.source;
	      assertNotNull(edge2);
	      
	      Edge<Object> edge3 = new Edge<Object>(edge2, "");
	      boolean boolean0 = edge1.equals(edge3);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Edgetest27()  throws Throwable  {
	      Object object0 = new Object();
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from(object0);
	      Integer integer0 = new Integer((-564));
	      Integer integer1 = new Integer(0);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer1);
	      Edge<Object> edge1 = new Edge<Object>(edge_EdgeBuilder0, integer1);
	      Edge.isAutoCycle();
	      Edge.isAutoCycle();
	      Edge.hasDestination((String) null);
	      edge0.equals(edge1);
	      Edge.hasDestination(edge1);
	      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
	      Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
	      LinkedHashSet<Edge<Object>> linkedHashSet1 = new LinkedHashSet<Edge<Object>>();
	      assertEquals(0, linkedHashSet1.size());
	  }

	  @Test(timeout = 4000)
	  public void Edgetest28()  throws Throwable  {
	      Integer integer0 = new Integer(36);
	      Edge.EdgeBuilder<Integer> edge_EdgeBuilder0 = Edge.from(integer0);
	      Edge.from(integer0);
	      Predicate<Edge<Object>> predicate0 = Edge.isIn((Set<Edge<Object>>) null);
	      Edge<Integer> edge0 = edge_EdgeBuilder0.to(integer0);
	      edge0.toString();
	      Edge.hasDestination("n^*R5se!U4OeSn1%@");
	      Edge.isAutoCycle();
	      Integer integer1 = new Integer(36);
	      Edge.isAutoCycle();
	      Edge.isAutoCycle();
	      Predicate<Edge<Object>> predicate1 = Edge.isAutoCycle();
	      assertFalse(predicate1.equals((Object)predicate0));
	  }

	  @Test(timeout = 4000)
	  public void Edgetest29()  throws Throwable  {
	      Edge<String> edge0 = new Edge<String>("", "n^*R5se!U4OeSn1%@");
	      String string0 = edge0.source;
	      Edge<Object> edge1 = new Edge<Object>("", (Object) null);
	      Edge.hasDestination((Object) "n^*R5se!U4OeSn1%@");
	      edge1.equals((Object) null);
	      Edge<Edge<String>> edge2 = new Edge<Edge<String>>(edge0, edge0);
	      Edge<String> edge3 = edge2.destination;
	      edge0.equals(edge3);
	      Edge.hasDestination((Object) "");
	      Edge.isIn((Set<Edge<Object>>) null);
	      Predicate<Edge<String>> predicate0 = Edge.hasDestination("n^*R5se!U4OeSn1%@");
	      Integer integer0 = new Integer((-1));
	      edge1.equals(integer0);
	      Edge.from(edge3);
	      edge0.hashCode();
	      Predicate<Edge<String>> predicate1 = Edge.isAutoCycle();
	      assertFalse(predicate1.equals((Object)predicate0));
	  }
	  @Test(timeout = 4000)
	  public void EdgeQutest0()  throws Throwable  {
	      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
	      PriorityQueue<Locale.FilteringMode> priorityQueue0 = new PriorityQueue<Locale.FilteringMode>();
	      Partition<Locale.FilteringMode> partition0 = Partition.singletons((Collection<Locale.FilteringMode>) priorityQueue0);
	      EdgeQueueMap.EdgeQueue<Locale.FilteringMode> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(locale_FilteringMode0, partition0);
	      Arborescence<Locale.FilteringMode> arborescence0 = Arborescence.empty();
	      Optional<ExclusiveEdge<Locale.FilteringMode>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge(arborescence0);
	      assertNotNull(optional0);
	  }

	  @Test(timeout = 4000)
	  public void EdgeQutest1()  throws Throwable  {
	      LinkedList<Pair<Object, String>> linkedList0 = new LinkedList<Pair<Object, String>>();
	      Partition<Pair<Object, String>> partition0 = Partition.singletons((Collection<Pair<Object, String>>) linkedList0);
	      EdgeQueueMap<Pair<Object, String>> edgeQueueMap0 = new EdgeQueueMap<Pair<Object, String>>(partition0);
	      Vector<Pair<EdgeQueueMap.EdgeQueue<Pair<Object, String>>, Weighted<Edge<Pair<Object, String>>>>> vector0 = new Vector<Pair<EdgeQueueMap.EdgeQueue<Pair<Object, String>>, Weighted<Edge<Pair<Object, String>>>>>(0, 0);
	      EdgeQueueMap.EdgeQueue edgeQueueMap_EdgeQueue0 = edgeQueueMap0.merge((Pair<Object, String>) null, vector0);
	      assertNotNull(edgeQueueMap_EdgeQueue0);
	  }

	  @Test(timeout = 4000)
	  public void EdgeQutest2()  throws Throwable  {
	      EdgeQueueMap<Locale.FilteringMode> edgeQueueMap0 = new EdgeQueueMap<Locale.FilteringMode>((Partition<Locale.FilteringMode>) null);
	      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
	      ArrayDeque<Pair<EdgeQueueMap.EdgeQueue<Locale.FilteringMode>, Weighted<Edge<Locale.FilteringMode>>>> arrayDeque0 = new ArrayDeque<Pair<EdgeQueueMap.EdgeQueue<Locale.FilteringMode>, Weighted<Edge<Locale.FilteringMode>>>>(0);
//	      Pair<EdgeQueueMap.EdgeQueue<Locale.FilteringMode>, Weighted<Edge<Locale.FilteringMode>>> pair0 = (Pair<EdgeQueueMap.EdgeQueue<Locale.FilteringMode>, Weighted<Edge<Locale.FilteringMode>>>) mock(Pair.class, new ViolatedAssumptionAnswer());
	      
	      // Undeclared exception!
	      try { 
	    	  arrayDeque0.add(null);
	        edgeQueueMap0.merge(locale_FilteringMode0, arrayDeque0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

		  
	      

//	      EdgeQueueMap<Object> edgeQueueMap0 = new EdgeQueueMap<Object>(partition0);
//	      Pair<Object, Object> pair0 = new Pair<Object, Object>((Object) null, fibonacciQueue0);
	      Arborescence<Object> arborescence0 = Arborescence.of((ImmutableMap<Object, Object>) null);
//	      Optional<ExclusiveEdge<Object>> optional0 = edgeQueueMap0.popBestEdge(pair0, arborescence0);
//	      assertNotNull(optional0);
	  

	

	  

	
	

	@Test(timeout = 4000)
	  public void EdgeQutest5()  throws Throwable  {
	      HashSet<Comparable<Integer>> hashSet0 = new HashSet<Comparable<Integer>>();
	      Partition<Comparable<Integer>> partition0 = Partition.singletons((Collection<Comparable<Integer>>) hashSet0);
	      EdgeQueueMap.EdgeQueue<Comparable<Integer>> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((Comparable<Integer>) null, partition0);
	      Optional<ExclusiveEdge<Comparable<Integer>>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge();
	      assertNotNull(optional0);
	  }

	
	  @Test(timeout = 4000)
	  public void Exclutest0()  throws Throwable  {
	      LinkedList<Edge<String>> linkedList0 = new LinkedList<Edge<String>>();
	      ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of((Edge<String>) null, (List<Edge<String>>) linkedList0, 0.0);
	      ExclusiveEdge<String> exclusiveEdge1 = ExclusiveEdge.of((Edge<String>) null, (-0.501421588334961));
	      int int0 = exclusiveEdge0.compareTo(exclusiveEdge1);
	      assertEquals(1, int0);
	  }

	  @Test(timeout = 4000)
	  public void Exclutest1()  throws Throwable  {
	      ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of((Edge<String>) null, 0.0);
	      ExclusiveEdge<String> exclusiveEdge1 = ExclusiveEdge.of((Edge<String>) null, 0.5);
	      int int0 = exclusiveEdge0.compareTo(exclusiveEdge1);
	      assertEquals((-1), int0);
	  }

	  @Test(timeout = 4000)
	  public void Exclutest2()  throws Throwable  {
	      ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of((Edge<String>) null, 0.0);
	      int int0 = exclusiveEdge0.compareTo(exclusiveEdge0);
	      assertEquals(0, int0);
	  }

//	  @Test(timeout = 4000)
//	  public void Exclutest3()  throws Throwable  {
//		  Edge<ExclusiveEdge<Integer>> edge0=(Edge<ExclusiveEdge<Integer>>) new Object();
//		
//	      LinkedList<Edge<Integer>> linkedList0 = new LinkedList<Edge<Integer>>();
////	      ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of(edge0,(List<Edge<Integer>>) linkedList0, 0.0);
//	      // Undeclared exception!
//	      try { 
////	        exclusiveEdge0.compareTo((ExclusiveEdge<Integer>) null);
//	        fail("Expecting exception: NullPointerException");
//	      
//	      } catch(NullPointerException e) {
//	         //
//	         // no message in exception (getMessage() returned null)
//	         //
//	         
//	      }
//	  }
	

//	@Test(timeout = 4000)
//	  public void Fibontest00()  throws Throwable  {
//	     
////	      doReturn(1).when(comparator0).compare(any() , any());
////	      FibonacciHeap<FibonacciHeap<String, Object>, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
////	      Comparator<Object> comparator1 = (Comparator<Object>) mock8(Comparator.class, new ViolatedAssumptionAnswer());
//	      FibonacciHeap<String, Object> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super Object>) comparator1);
//	      Object object0 = new Object();
//	      Object a=new Object();
//	      fibonacciHeap0.add(fibonacciHeap1, object0);
//	      fibonacciHeap0.add(fibonacciHeap1, a);
//	      assertEquals(2, fibonacciHeap0.size());
//	  }
	 

//	@Test(timeout = 4000)
//	  public void Fibontest01()  throws Throwable  {
//	      
//	     
//	      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) null);
//	      fibonacciHeap0.add("", "");
//	      fibonacciHeap0.add("", "");
//	      FibonacciHeap<String, String> fibonacciHeap1 = FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
//	      assertEquals(2, fibonacciHeap0.size());
//	      assertEquals(4, fibonacciHeap1.size());
//	  }

	

//	@Test(timeout = 4000)
//	  public void Fibontest02()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) mock11(Comparator.class, new ViolatedAssumptionAnswer());
////	      doReturn((String) null, (String) null, (String) null, (String) null).when(comparator0).toString();
//	      FibonacciHeap<String, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
//	      FibonacciHeap<String, Object> fibonacciHeap1 = FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
//	      FibonacciHeap<String, Object> fibonacciHeap2 = FibonacciHeap.merge(fibonacciHeap1, fibonacciHeap0);
//	      assertNotSame(fibonacciHeap2, fibonacciHeap0);
//	      assertEquals(0, fibonacciHeap2.size());
//	  }

	

//	@Test(timeout = 4000)
//	  public void Fibontest03()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) mock12(Comparator.class, new ViolatedAssumptionAnswer());
//
//	      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
//	      fibonacciHeap0.add("", "");
//	      fibonacciHeap0.add("", "");
//	      fibonacciHeap0.pollOption();
//	      assertEquals(1, fibonacciHeap0.size());
//	  }

	

//	@Test(timeout = 4000)
//	  public void Fibontest04()  throws Throwable  {
////	      Comparator<Object> comparator0 = (Comparator<Object>) mock13(Comparator.class, new ViolatedAssumptionAnswer());
////	      FibonacciHeap<String, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
//	      Integer integer0 = new Integer(0);
//	      fibonacciHeap0.add("", integer0);
//	      int int0 = fibonacciHeap0.size();
//	      assertEquals(1, int0);
//	  }

	

	@Test(timeout = 4000)
	  public void Fibontest05()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        FibonacciHeap.merge((FibonacciHeap<FibonacciHeap.Entry, FibonacciHeap<Integer, Object>>) null, (FibonacciHeap<FibonacciHeap.Entry, FibonacciHeap<Integer, Object>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

//	  @Test(timeout = 4000)
//	  public void Fibontest06()  throws Throwable  {
//	      FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
////	      Comparator<Object> comparator0 = (Comparator<Object>) mock14(Comparator.class,null);
////	      doReturn((String) null).when(comparator0).toString();
////	      FibonacciHeap<Object, String> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super String>) comparator0);
//	      // Undeclared exception!
//	      try { 
//	        FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
//	        fail("Expecting exception: IllegalArgumentException");
//	      
//	      } catch(IllegalArgumentException e) {
//	         //
//	         // Heaps that use different comparators can't be merged.
//	         //
//	        
//	      }
//	  }

	

	@Test(timeout = 4000)
	  public void Fibontest07()  throws Throwable  {
	      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
	      // Undeclared exception!
	      try { 
	        fibonacciHeap0.decreasePriority((FibonacciHeap.Entry) null, "");
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Fibontest08()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        FibonacciHeap.create((Comparator<? super Object>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void Fibontest09()  throws Throwable  {
	      FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
	      // Undeclared exception!
	      try { 
	        fibonacciHeap0.add((Object) null, "");
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

//	  @Test(timeout = 4000)
//	  public void Fibontest10()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) mock15(Comparator.class, new ViolatedAssumptionAnswer());
//	    
//	      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
//	      fibonacciHeap0.add("", "");
//	      fibonacciHeap0.add("", "");
//	      assertEquals(2, fibonacciHeap0.size());
//	  }

	

//	@Test(timeout = 4000)
//	  public void Fibontest11()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) mock16(Comparator.class, new ViolatedAssumptionAnswer());
//	     
//	      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
//	      fibonacciHeap0.add("", "");
//	      fibonacciHeap0.add("", "");
//	      Consumer<Object> consumer0 = (Consumer<Object>) mock17(Consumer.class, new ViolatedAssumptionAnswer());
//	      fibonacciHeap0.forEach(consumer0);
//	      assertEquals(2, fibonacciHeap0.size());
//	  }



//	@Test(timeout = 4000)
//	  public void Fibontest12()  throws Throwable  {
//	//      Comparator<Object> comparator0 = (Comparator<Object>) mock18(Comparator.class, new ViolatedAssumptionAnswer());
//	      FibonacciHeap<String, FibonacciHeap<Object, Integer>> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super FibonacciHeap<Object, Integer>>) comparator0);
//	      FibonacciHeap<Object, Integer> fibonacciHeap1 = FibonacciHeap.create();
//	      fibonacciHeap0.add("", fibonacciHeap1);
//	      assertEquals(1, fibonacciHeap0.size());
//	      
//	      fibonacciHeap0.pollOption();
//	      assertEquals(0, fibonacciHeap0.size());
//	  }

	

//	@Test(timeout = 4000)
//	  public void Fibontest13()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) mock19(Comparator.class, new ViolatedAssumptionAnswer());
//	      FibonacciHeap<Integer, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
//	      fibonacciHeap0.pollOption();
//	      assertEquals(0, fibonacciHeap0.size());
//	  }
//
//	
//	@Test(timeout = 4000)
//	  public void Fibontest14()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) mock20(Comparator.class, new ViolatedAssumptionAnswer());
//	      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
//	      fibonacciHeap0.add("", "");
//	      boolean boolean0 = fibonacciHeap0.isEmpty();
//	      assertEquals(1, fibonacciHeap0.size());
//	      assertFalse(boolean0);
//	  }
//
//	
//
//	@Test(timeout = 4000)
//	  public void Fibontest15()  throws Throwable  {
//	      FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
//	      boolean boolean0 = fibonacciHeap0.isEmpty();
//	      assertEquals(0, fibonacciHeap0.size());
//	      assertTrue(boolean0);
//	  }
//
//	  @Test(timeout = 4000)
//	  public void Fibontest16()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) mock21(Comparator.class, new ViolatedAssumptionAnswer());
//	      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
//	      fibonacciHeap0.add("", "");
//	      fibonacciHeap0.iterator();
//	      assertEquals(1, fibonacciHeap0.size());
//	  }
//
//	
//
//	@Test(timeout = 4000)
//	  public void Fibontest17()  throws Throwable  {
//	      Comparator<Integer> comparator0 = (Comparator<Integer>) mock22(Comparator.class, new ViolatedAssumptionAnswer());
//	      FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
//	      int int0 = fibonacciHeap0.size();
//	      assertEquals(0, int0);
//	  }
//
//	
//	@Test(timeout = 4000)
//	  public void Fibontest18()  throws Throwable  {
//	      FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
//	      fibonacciHeap0.peekOption();
//	      assertEquals(0, fibonacciHeap0.size());
//	  }

	  @Test(timeout = 4000)
	  public void Fibontest19()  throws Throwable  {
	      FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      // Undeclared exception!
	      try { 
	        fibonacciHeap0.remove((FibonacciHeap.Entry) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

//	  @Test(timeout = 4000)
//	  public void Fibontest20()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) mock23(Comparator.class, new ViolatedAssumptionAnswer());
////	      doReturn((String) null, "").when(comparator0).toString();
//	      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
//	      fibonacciHeap0.add("", "");
//	      FibonacciHeap<String, String> fibonacciHeap1 = FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
//	      fibonacciHeap1.pollOption();
//	      assertEquals(1, fibonacciHeap0.size());
//	  }

	

//	@Test(timeout = 4000)
//	  public void Fibontest21()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) mock24(Comparator.class, new ViolatedAssumptionAnswer());
//	      FibonacciHeap<Object, FibonacciHeap<Object, String>> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super FibonacciHeap<Object, String>>) comparator0);
//	      fibonacciHeap0.spliterator();
//	      assertEquals(0, fibonacciHeap0.size());
//	  }
//
//	 
//
//	@Test(timeout = 4000)
//	  public void Fibontest22()  throws Throwable  {
//	      Comparator<Integer> comparator0 = (Comparator<Integer>) mock25(Comparator.class, new ViolatedAssumptionAnswer());
//	      FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
//	      fibonacciHeap0.clear();
//	      assertEquals(0, fibonacciHeap0.size());
//	  }

//	@Test(timeout = 4000)
//	  public void Fibontest23()  throws Throwable  {
//	      Comparator<String> comparator0 = (Comparator<String>) mock26(Comparator.class, new ViolatedAssumptionAnswer());
////	      doReturn("").when(comparator0).toString();
//	      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
//	      fibonacciHeap0.comparator();
//	      assertEquals(0, fibonacciHeap0.size());
//	  }
	
	@Test(timeout = 4000)
	  public void FibonQtest0()  throws Throwable  {
	      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
	      fibonacciQueue0.add("");
	      int int0 = fibonacciQueue0.size();
	      assertEquals(1, int0);
	  }

//	  @Test(timeout = 4000)
//	  public void FibonQtest1()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) mock27(Comparator.class, new ViolatedAssumptionAnswer());
//	      FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
//	      fibonacciQueue0.offer("");
//	      Object object0 = fibonacciQueue0.poll();
//	      assertEquals("", object0);
//	  }
//
//	@Test(timeout = 4000)
//	  public void FibonQtest2()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) mock28(Comparator.class, new ViolatedAssumptionAnswer());
//	      FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
//	      Iterator<Object> iterator0 = fibonacciQueue0.iterator();
//	      assertNotNull(iterator0);
//	  }
//
//
//
//	@Test(timeout = 4000)
//	  public void FibonQtest3()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) mock29(Comparator.class, new ViolatedAssumptionAnswer());
//	      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
//	      // Undeclared exception!
//	      try { 
//	        fibonacciQueue0.offer((String) null);
//	        fail("Expecting exception: NullPointerException");
//	      
//	      } catch(NullPointerException e) {
//	         //
//	         // no message in exception (getMessage() returned null)
//	         //
//	        
//	      }
//	  }

	
	@Test(timeout = 4000)
	  public void FibonQtest4()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        FibonacciQueue.create((Comparator<? super Object>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void FibonQtest5()  throws Throwable  {
	      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
	      fibonacciQueue0.add("");
	      String string0 = fibonacciQueue0.peek();
	      assertEquals("", string0);
	  }

	  @Test(timeout = 4000)
	  public void FibonQtest6()  throws Throwable  {
	
	      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
	      Object object0 = fibonacciQueue0.peek();
	      assertNull(object0);
	  }

	

	@Test(timeout = 4000)
	  public void FibonQtest7()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) mock31(Comparator.class, new ViolatedAssumptionAnswer());
		Object comparator0 = null;
		try { 
			 FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	    
	   
	  }

	

//	@Test(timeout = 4000)
//	  public void FibonQtest8()  throws Throwable  {
////	      Comparator<Object> comparator0 = (Comparator<Object>) mock32(Comparator.class, new ViolatedAssumptionAnswer());
////	      doReturn("").when(comparator0).toString();
////	      FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
//	      Comparator<? super Object> comparator1 = fibonacciQueue0.comparator();
//	      FibonacciQueue<String> fibonacciQueue1 = FibonacciQueue.create((Comparator<? super String>) comparator1);
//	      boolean boolean0 = fibonacciQueue1.offer("");
//	      boolean boolean1 = fibonacciQueue0.containsAll(fibonacciQueue1);
//	      assertFalse(boolean1 == boolean0);
//	  }

	

//	@Test(timeout = 4000)
//	  public void FibonQtest9()  throws Throwable  {
//	      Comparator<Object> comparator0 = (Comparator<Object>) mock33(Comparator.class, new ViolatedAssumptionAnswer());
//	      FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
//	      Object object0 = fibonacciQueue0.poll();
//	      assertNull(object0);
//	  }
	

	@Test(timeout = 4000)
	  public void Kbesttest00()  throws Throwable  {
	      
	      Arborescence<Double> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<Double>> weighted0 = Weighted.weighted(arborescence0, 0.0);
	      TreeSet<Edge<Double>> treeSet0 = new TreeSet<Edge<Double>>();
	      KBestArborescences.SubsetOfSolutions<Double> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Double>(null, weighted0, treeSet0, treeSet0);
	      Edge<Double> edge1 = kBestArborescences_SubsetOfSolutions0.edgeToBan;
	      HashSet<Edge<Double>> hashSet0 = new HashSet<Edge<Double>>();
	      KBestArborescences.SubsetOfSolutions<Double> kBestArborescences_SubsetOfSolutions1 = new KBestArborescences.SubsetOfSolutions<Double>(edge1, weighted0, treeSet0, hashSet0);
	      assertFalse(kBestArborescences_SubsetOfSolutions1.equals((Object)kBestArborescences_SubsetOfSolutions0));
	     
	  }

//	  @Test(timeout = 4000)
//	  public void Kbesttest01()  throws Throwable  {
////	      Comparator<Object> comparator0 = (Comparator<Object>) mock9(Comparator.class, new ViolatedAssumptionAnswer());
////	      TreeSet<Edge<Arborescence<Object>>> treeSet0 = new TreeSet<Edge<Arborescence<Object>>>(comparator0);
//	      TreeSet<Edge<Arborescence<Object>>> treeSet1 = new TreeSet<Edge<Arborescence<Object>>>((SortedSet<Edge<Arborescence<Object>>>) null);
//	      Arborescence<Arborescence<Object>> arborescence0 = Arborescence.empty();
//	      Weighted<Arborescence<Arborescence<Object>>> weighted0 = new Weighted<Arborescence<Arborescence<Object>>>(arborescence0, 0.0);
//	      // Undeclared exception!
//	      try { 
//	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Arborescence<Object>>) null, (Set<Edge<Arborescence<Object>>>) treeSet1, (Set<Edge<Arborescence<Object>>>) null, weighted0);
//	        fail("Expecting exception: NullPointerException");
//	      
//	      } catch(NullPointerException e) {
//	         //
//	         // no message in exception (getMessage() returned null)
//	         //
//	         
//	      }
//	  }


	@Test(timeout = 4000)
	  public void Kbesttest02()  throws Throwable  {
	      PriorityQueue<Weighted<Edge<String>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<String>>>();
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) priorityQueue0);
	      List<Weighted<Arborescence<String>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<String>) sparseWeightedGraph0, "", 3);
	      assertFalse(list0.isEmpty());
	  }

	  @Test(timeout = 4000)
	  public void Kbesttest03()  throws Throwable  {
	      ExclusiveEdge<ExclusiveEdge<String>> exclusiveEdge0 = ExclusiveEdge.of((Edge<ExclusiveEdge<String>>) null, 0.0);
	      Arborescence<ExclusiveEdge<String>> arborescence0 = Arborescence.empty();
	      // Undeclared exception!
	      try { 
	        KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<ExclusiveEdge<String>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Kbesttest04()  throws Throwable  {
	      LinkedHashSet<Edge<Edge<Integer>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<Integer>>>();
	      Arborescence<Edge<Integer>> arborescence0 = Arborescence.empty();
	 
	      Weighted<Arborescence<Edge<Integer>>> weighted0 = new Weighted<Arborescence<Edge<Integer>>>(arborescence0, 0.0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Edge<Integer>>) null, (Set<Edge<Edge<Integer>>>) linkedHashSet0, (Set<Edge<Edge<Integer>>>) linkedHashSet0, weighted0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // null key in entry: null=null
	         //
	        
	      }
	  }

	

	@Test(timeout = 4000)
	  public void Kbesttest05()  throws Throwable  {
	      double[][] doubleArray0 = new double[1][4];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>();
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      Weighted<Arborescence<Integer>> weighted0 = Weighted.weighted(arborescence0, 0.0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) treeSet0, (Set<Edge<Integer>>) treeSet0, weighted0);
	        fail("Expecting exception: ClassCastException");
	      
	      } catch(ClassCastException e) {
	         //
	         // net.mooctest.Edge cannot be cast to java.lang.Comparable
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Kbesttest06()  throws Throwable  {
	      double[][] doubleArray0 = new double[5][7];
	      double[] doubleArray1 = new double[0];
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>();
	      Integer integer0 = new Integer(0);
	      Integer integer1 = new Integer((-1));
	      ImmutableSortedMap<Integer, Integer> immutableSortedMap0 = ImmutableSortedMap.of(integer0, integer1, integer1, integer1);
	      Arborescence<Integer> arborescence0 = Arborescence.of((ImmutableMap<Integer, Integer>) immutableSortedMap0);
	      Weighted<Arborescence<Integer>> weighted0 = new Weighted<Arborescence<Integer>>(arborescence0, 0.0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) treeSet0, (Set<Edge<Integer>>) treeSet0, weighted0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 0
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Kbesttest07()  throws Throwable  {
	      Double double0 = new Double(0.0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.getKBestArborescences((WeightedGraph<Double>) null, double0, 0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

//	  @Test(timeout = 4000)
//	  public void Kbesttest08()  throws Throwable  {
//	      Edge<Locale.Category> edge0 = (Edge<Category>) new Object ();
//	      ExclusiveEdge<Locale.Category> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
////	      Arborescence<Locale.Category> arborescence0 = Arborescence.of((ImmutableMap<Locale.Category, Locale.Category>) null);
//	      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
//	      TreeSet<Locale.Category> treeSet0 = new TreeSet<Locale.Category>();
//	      Partition<Locale.Category> partition0 = Partition.singletons((Collection<Locale.Category>) treeSet0);
//	      EdgeQueueMap.EdgeQueue<Locale.Category> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(locale_Category0, partition0);
////	      Optional<ExclusiveEdge<Locale.Category>> optional0 = KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<Locale.Category>) edgeQueueMap_EdgeQueue0);
////	      assertNotNull(optional0);
//	  }

	  @Test(timeout = 4000)
	  public void Kbesttest09()  throws Throwable  {
	      PriorityQueue<Weighted<Edge<String>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<String>>>();
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) priorityQueue0);
	      List<Weighted<Arborescence<String>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<String>) sparseWeightedGraph0, "", 2);
	      assertFalse(list0.isEmpty());
	  }

	  @Test(timeout = 4000)
	  public void Kbesttest10()  throws Throwable  {
	      double[][] doubleArray0 = new double[1][0];
	      double[] doubleArray1 = new double[6];
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 0);
	      assertEquals(0, list0.size());
	  }

	  @Test(timeout = 4000)
	  public void Kbesttest11()  throws Throwable  {
	      PriorityQueue<Weighted<Edge<String>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<String>>>();
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) priorityQueue0);
	      List<Weighted<Arborescence<String>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<String>) sparseWeightedGraph0, "", 1);
	      assertFalse(list0.isEmpty());
	  }

	  @Test(timeout = 4000)
	  public void Kbesttest12()  throws Throwable  {
	      KBestArborescences kBestArborescences0 = new KBestArborescences();
	      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>(0, 0.55859226F);
	      linkedHashSet0.add(kBestArborescences0);
	      LinkedHashSet<Weighted<Edge<Object>>> linkedHashSet1 = new LinkedHashSet<Weighted<Edge<Object>>>();
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) linkedHashSet0, (Iterable<Weighted<Edge<Object>>>) linkedHashSet1);
	      HashSet<Edge<Object>> hashSet0 = new HashSet<Edge<Object>>();
	      ImmutableBiMap<Object, Object> immutableBiMap0 = ImmutableBiMap.of();
	      Arborescence<Object> arborescence0 = Arborescence.of((ImmutableMap<Object, Object>) immutableBiMap0);
	      Weighted<Arborescence<Object>> weighted0 = Weighted.weighted(arborescence0, (double) 0.0F);
	      Optional<Weighted<KBestArborescences.SubsetOfSolutions<Object>>> optional0 = KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Object>) sparseWeightedGraph0, (Set<Edge<Object>>) hashSet0, (Set<Edge<Object>>) hashSet0, weighted0);
	      assertNotNull(optional0);
	  }

	  @Test(timeout = 4000)
	  public void Kbesttest13()  throws Throwable  {
	      double[][] doubleArray0 = new double[1][0];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 0
	         //
	         
	      }
	  }
	  
	  @Test(timeout = 4000)
	  public void Pairtest0()  throws Throwable  {
	      Pair<String, Object> pair0 = Pair.of("EV{<0<F,K59#u}E1 >", (Object) "");
	      Integer integer0 = new Integer(0);
	      Pair<Object, Integer> pair1 = new Pair<Object, Integer>("EV{<0<F,K59#u}E1 >", integer0);
	      boolean boolean0 = pair1.equals(pair0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Pairtest1()  throws Throwable  {
	      Pair<String, Object> pair0 = new Pair<String, Object>("", "");
	      Integer integer0 = new Integer(0);
	      Pair<Object, Integer> pair1 = new Pair<Object, Integer>(integer0, integer0);
	      boolean boolean0 = pair0.equals(pair1);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Pairtest2()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<Object, Integer> pair0 = new Pair<Object, Integer>("", integer0);
	      boolean boolean0 = pair0.equals(integer0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Pairtest3()  throws Throwable  {
	      Pair<String, String> pair0 = new Pair<String, String>("", "");
	      Pair<String, Object> pair1 = new Pair<String, Object>("", "");
	      boolean boolean0 = pair0.equals(pair1);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Pairtest4()  throws Throwable  {
	      Pair<String, String> pair0 = new Pair<String, String>("", "");
	      pair0.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void Pairtest5()  throws Throwable  {
	      Pair<String, String> pair0 = new Pair<String, String>("", "");
	      String string0 = pair0.toString();
	      assertEquals("Pair{first=, second=}", string0);
	  }
	  @Test(timeout = 4000)
	  public void Partititest00()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.add("");
	      linkedList0.offer("null>value in entry: %L=null");
	      linkedList0.add("XA7>AaSxef%(k");
	      linkedList0.add("y");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      partition0.merge("", "XA7>AaSxef%(k");
	      partition0.merge("y", "null>value in entry: %L=null");
	      String string0 = partition0.merge("null>value in entry: %L=null", "XA7>AaSxef%(k");
	      assertEquals("y", string0);
	  }

	  @Test(timeout = 4000)
	  public void Partititest01()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.add("%#.u}C1T(45A1EMe");
	      linkedList0.offer("null value in entry: %s=null");
	      linkedList0.add("]Y3$8Kron$+.]");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      String string0 = partition0.merge("null value in entry: %s=null", "]Y3$8Kron$+.]");
	      assertEquals("null value in entry: %s=null", string0);
	      
	      String string1 = partition0.merge("%#.u}C1T(45A1EMe", "]Y3$8Kron$+.]");
	      assertEquals("null value in entry: %s=null", string1);
	  }

	  @Test(timeout = 4000)
	  public void Partititest02()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.add("");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      String string0 = partition0.merge("", "");
	      assertEquals("", string0);
	  }

	  @Test(timeout = 4000)
	  public void Partititest03()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.offer("null value in entry: %s=null");
	      linkedList0.add("");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      String string0 = partition0.merge("null value in entry: %s=null", "");
	      assertEquals("null value in entry: %s=null", string0);
	      
	      String string1 = partition0.merge("", "");
	      assertEquals("null value in entry: %s=null", string1);
	  }

	  @Test(timeout = 4000)
	  public void Partititest04()  throws Throwable  {
	      LinkedList<Object> linkedList0 = new LinkedList<Object>();
	      List<Object> list0 = linkedList0.subList(0, 0);
	      linkedList0.add((Object) list0);
	      // Undeclared exception!
	      try { 
	        Partition.singletons((Collection<Object>) list0);
	        fail("Expecting exception: ConcurrentModificationException");
	      
	      } catch(ConcurrentModificationException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Partititest05()  throws Throwable  {
	      LinkedList<Object> linkedList0 = new LinkedList<Object>();
	      linkedList0.add((Object) linkedList0);
	      // Undeclared exception!
	      try { 
	        Partition.singletons((Collection<Object>) linkedList0);
	        fail("Expecting exception: StackOverflowError");
	      
	      } catch(StackOverflowError e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void Partititest06()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        Partition.singletons((Collection<Object>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Partititest07()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      // Undeclared exception!
	      try { 
	        partition0.sameComponent("", (String) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void Partititest08()  throws Throwable  {
	      LinkedList<Object> linkedList0 = new LinkedList<Object>();
	      List<Object> list0 = linkedList0.subList(0, 0);
	      Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
	      linkedList0.add((Object) list0);
	      // Undeclared exception!
	      try { 
	        partition0.merge(linkedList0, linkedList0);
	        fail("Expecting exception: ConcurrentModificationException");
	      
	      } catch(ConcurrentModificationException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void Partititest09()  throws Throwable  {
	      LinkedList<Object> linkedList0 = new LinkedList<Object>();
	      Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
	      // Undeclared exception!
	      try { 
	        partition0.componentOf("");
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void Partititest10()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.offer("null value in entry: %s=null");
	      linkedList0.add("");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      String string0 = partition0.merge("null value in entry: %s=null", "");
	      assertEquals("null value in entry: %s=null", string0);
	      
	      String string1 = partition0.componentOf("");
	      assertEquals("null value in entry: %s=null", string1);
	  }

	  @Test(timeout = 4000)
	  public void Partititest11()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.add("");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      String string0 = partition0.componentOf("");
	      assertEquals("", string0);
	  }

	  @Test(timeout = 4000)
	  public void Partititest12()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.offer("null vlu[in :n<ry s=n_l");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      boolean boolean0 = partition0.sameComponent("null vlu[in :n<ry s=n_l", "null vlu[in :n<ry s=n_l");
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Partititest13()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.offer("null vlu[in :n<ry s=n_l");
	      linkedList0.add("an't use .skiaNulls() with maps");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      boolean boolean0 = partition0.sameComponent("null vlu[in :n<ry s=n_l", "an't use .skiaNulls() with maps");
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Partititest14()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.offer("null value in entry: %s=null");
	      linkedList0.add("");
	      linkedList0.add("already specified useForNull");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      String string0 = partition0.merge("already specified useForNull", "null value in entry: %s=null");
	      assertEquals("already specified useForNull", string0);
	      
	      String string1 = partition0.merge("null value in entry: %s=null", "");
	      assertEquals("already specified useForNull", string1);
	  }

	  @Test(timeout = 4000)
	  public void Partititest15()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.offer("H.'wG*<6>|qsj|)");
	      linkedList0.add("4B");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      partition0.merge("4B", "H.'wG*<6>|qsj|)");
	      // Undeclared exception!
	      try { 
	        partition0.merge("H.'wG*<6>|qsj|)", "");
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void Partititest16()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      Set<String> set0 = partition0.getNodes();
	      assertEquals(0, set0.size());
	  }
	  @Test(timeout = 4000)
	  public void SparGtest0()  throws Throwable  {
	      HashSet<Object> hashSet0 = new HashSet<Object>();
	      ArrayList<Weighted<Edge<Object>>> arrayList0 = new ArrayList<Weighted<Edge<Object>>>();
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) hashSet0, (Iterable<Weighted<Edge<Object>>>) arrayList0);
	      Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, 0.0);
	      Weighted<Weighted<Integer>> weighted1 = Weighted.weighted(weighted0, 0.0);
	      double double0 = sparseWeightedGraph0.getWeightOf(weighted1, "");
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void SparGtest1()  throws Throwable  {
	      LinkedHashSet<Stack<Object>> linkedHashSet0 = new LinkedHashSet<Stack<Object>>();
	      ArrayDeque<Weighted<Edge<Stack<Object>>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Stack<Object>>>>();
	      Stack<Object> stack0 = new Stack<Object>();
	      Edge<Stack<Object>> edge0 = new Edge<Stack<Object>>(stack0, stack0);
	      Weighted<Edge<Stack<Object>>> weighted0 = new Weighted<Edge<Stack<Object>>>(edge0, 0);
	      arrayDeque0.add(weighted0);
	      stack0.add((Object) linkedHashSet0);
	      linkedHashSet0.add(stack0);
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Stack<Object>>) linkedHashSet0, (Iterable<Weighted<Edge<Stack<Object>>>>) arrayDeque0);
	        fail("Expecting exception: StackOverflowError");
	      
	      } catch(StackOverflowError e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void SparGtest2()  throws Throwable  {
	      Vector<Weighted<Edge<Integer>>> vector0 = new Vector<Weighted<Edge<Integer>>>(0, 0);
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Integer>) null, (Iterable<Weighted<Edge<Integer>>>) vector0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void SparGtest3()  throws Throwable  {
	      Vector<Weighted<Edge<Object>>> vector0 = new Vector<Weighted<Edge<Object>>>(0);
	      Edge<Object> edge0 = new Edge<Object>(vector0, vector0);
	      Weighted<Edge<Object>> weighted0 = new Weighted<Edge<Object>>(edge0, 0.0);
	      vector0.add(weighted0);
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) vector0);
	        fail("Expecting exception: StackOverflowError");
	      
	      } catch(StackOverflowError e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void SparGtest4()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Weighted<Edge<Integer>>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void SparGtest5()  throws Throwable  {
	      ArrayList<Weighted<Edge<String>>> arrayList0 = new ArrayList<Weighted<Edge<String>>>(0);
	      Edge<String> edge0 = new Edge<String>("", "&Bjq'{<_7E;&");
	      Weighted<Edge<String>> weighted0 = Weighted.weighted(edge0, 0.0);
	      arrayList0.add(weighted0);
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) arrayList0);
	      Collection<Weighted<Edge<String>>> collection0 = sparseWeightedGraph0.getIncomingEdges("&Bjq'{<_7E;&");
	      assertTrue(collection0.contains(weighted0));
	  }

	  @Test(timeout = 4000)
	  public void SparGtest6()  throws Throwable  {
	      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
	      EnumSet<Locale.FilteringMode> enumSet0 = EnumSet.of(locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0);
	      PriorityQueue<Weighted<Edge<Locale.FilteringMode>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Locale.FilteringMode>>>(1);
	      SparseWeightedGraph<Locale.FilteringMode> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.FilteringMode>) enumSet0, (Iterable<Weighted<Edge<Locale.FilteringMode>>>) priorityQueue0);
	      Collection<Weighted<Edge<Locale.FilteringMode>>> collection0 = sparseWeightedGraph0.getIncomingEdges(locale_FilteringMode0);
	      assertNotNull(collection0);
	  }

	  @Test(timeout = 4000)
	  public void SparGtest7()  throws Throwable  {
	      ArrayDeque<Weighted<Edge<Object>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Object>>>();
	      Edge<Object> edge0 = new Edge<Object>(arrayDeque0, (Object) null);
	      Weighted<Edge<Object>> weighted0 = Weighted.weighted(edge0, 0.0);
	      arrayDeque0.add(weighted0);
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) arrayDeque0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // at index 0
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void SparGtest8()  throws Throwable  {
	      LinkedHashSet<Stack<Object>> linkedHashSet0 = new LinkedHashSet<Stack<Object>>();
	      ArrayDeque<Weighted<Edge<Stack<Object>>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Stack<Object>>>>();
	      Stack<Object> stack0 = new Stack<Object>();
	      Edge<Stack<Object>> edge0 = new Edge<Stack<Object>>(stack0, stack0);
	      Weighted<Edge<Stack<Object>>> weighted0 = new Weighted<Edge<Stack<Object>>>(edge0, 0);
	      arrayDeque0.add(weighted0);
	      arrayDeque0.add(weighted0);
	      SparseWeightedGraph<Stack<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Stack<Object>>) linkedHashSet0, (Iterable<Weighted<Edge<Stack<Object>>>>) arrayDeque0);
	      assertNotNull(sparseWeightedGraph0);
	  }

	  @Test(timeout = 4000)
	  public void SparGtest9()  throws Throwable  {
	      ArrayDeque<Weighted<Edge<Object>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Object>>>();
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) arrayDeque0);
	      Collection<Object> collection0 = sparseWeightedGraph0.getNodes();
	      assertNotNull(collection0);
	  }
	  @Test(timeout = 4000)
	  public void Weighttest00()  throws Throwable  {
	      Object object0 = new Object();
	      Weighted<Object> weighted0 = Weighted.weighted(object0, 0.0);
	      Weighted<Weighted<Object>> weighted1 = new Weighted<Weighted<Object>>(weighted0, 0.0);
	      Weighted<Weighted<Object>> weighted2 = new Weighted<Weighted<Object>>(weighted0, 0.734396232559375);
	      int int0 = weighted1.compareTo(weighted2);
	      assertEquals(1, int0);
	  }

	  @Test(timeout = 4000)
	  public void Weighttest01()  throws Throwable  {
	      Weighted<String> weighted0 = new Weighted<String>("", 0.0);
	      Weighted<String> weighted1 = new Weighted<String>("weight", 0.0);
	      int int0 = weighted0.compareTo(weighted1);
	      assertEquals((-1), int0);
	  }

	  @Test(timeout = 4000)
	  public void Weighttest02()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        Weighted.weighted((Integer) null, 0.0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void Weighttest03()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = Weighted.weighted(integer0, 0.0);
	      // Undeclared exception!
	      try { 
	        weighted0.compareTo((Weighted<Integer>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void Weighttest04()  throws Throwable  {
	      Weighted<Object> weighted0 = null;
	      try {
	        weighted0 = new Weighted<Object>((Object) null, 0.0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void Weighttest05()  throws Throwable  {
	      Weighted<String> weighted0 = new Weighted<String>("", 0.0);
	      weighted0.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void Weighttest06()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = Weighted.weighted(integer0, (double) 0);
	      Weighted<Object> weighted1 = new Weighted<Object>(weighted0, 0);
	      Weighted<Weighted<Object>> weighted2 = new Weighted<Weighted<Object>>(weighted1, 0);
	      Weighted<Weighted<Object>> weighted3 = new Weighted<Weighted<Object>>(weighted1, (-0.6056640625));
	      boolean boolean0 = weighted3.equals(weighted2);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Weighttest07()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = Weighted.weighted(integer0, (double) 0);
	      Weighted<Object> weighted1 = new Weighted<Object>(weighted0, 0);
	      Weighted<Weighted<Object>> weighted2 = new Weighted<Weighted<Object>>(weighted1, 0);
	      boolean boolean0 = weighted0.equals(weighted2);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Weighttest08()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = Weighted.weighted(integer0, (double) 0);
	      Weighted<Object> weighted1 = new Weighted<Object>(weighted0, 0);
	      boolean boolean0 = weighted1.equals(integer0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Weighttest09()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = Weighted.weighted(integer0, (double) 0);
	      boolean boolean0 = weighted0.equals(weighted0);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void Weighttest10()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = Weighted.weighted(integer0, (double) 0);
	      Weighted<Object> weighted1 = new Weighted<Object>(weighted0, 0);
	      Weighted<Weighted<Object>> weighted2 = new Weighted<Weighted<Object>>(weighted1, 0);
	      String string0 = weighted2.toString();
	      assertEquals("Weighted{val=Weighted{val=Weighted{val=0, weight=0.0}, weight=0.0}, weight=0.0}", string0);
	  }

	  @Test(timeout = 4000)
	  public void Weighttest11()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = Weighted.weighted(integer0, (double) 0);
	      Weighted<Object> weighted1 = new Weighted<Object>(weighted0, 0);
	      Weighted<Weighted<Object>> weighted2 = new Weighted<Weighted<Object>>(weighted1, 0);
	      int int0 = weighted2.compareTo(weighted2);
	      assertEquals(0, int0);
	  }
	  @Test(timeout = 4000)
	  public void WGtest00()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][5];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
	      assertEquals(0.0, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void WGtest01()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][5];
	      double[] doubleArray1 = new double[1];
	      doubleArray1[0] = 0.9123003525390625;
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
	      assertEquals(0.9123003525390625, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void WGtest02()  throws Throwable  {
	      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
	      double[][] doubleArray0 = new double[0][7];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Integer>) linkedHashSet0, doubleArray0);
	      Integer integer0 = new Integer(0);
	      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void WGtest03()  throws Throwable  {
	      Stack<Weighted<Edge<Integer>>> stack0 = new Stack<Weighted<Edge<Integer>>>();
	      SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Integer>>>) stack0);
	      Collection<Integer> collection0 = sparseWeightedGraph0.getNodes();
	      assertNotNull(collection0);
	  }

	  @Test(timeout = 4000)
	  public void WGtest04()  throws Throwable  {
	      ArrayList<Object> arrayList0 = new ArrayList<Object>();
	      PriorityQueue<Weighted<Edge<Object>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Object>>>();
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) arrayList0, (Iterable<Weighted<Edge<Object>>>) priorityQueue0);
	      Collection<Weighted<Edge<Object>>> collection0 = sparseWeightedGraph0.getIncomingEdges(sparseWeightedGraph0);
	      assertNotNull(collection0);
	  }

	  @Test(timeout = 4000)
	  public void WGtest05()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][1];
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
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void WGtest06()  throws Throwable  {
	      double[][] doubleArray0 = new double[5][4];
	      double[] doubleArray1 = new double[0];
	      doubleArray0[4] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!
	      try { 
	        denseWeightedGraph0.getIncomingEdges(integer0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 0
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void WGtest07()  throws Throwable  {
	      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>(0);
	      double[][] doubleArray0 = new double[1][8];
	      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
	      Integer integer0 = new Integer(0);
	      arrayList0.add(integer0);
	      linkedHashSet0.addAll(arrayList0);
	      double[] doubleArray1 = new double[0];
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) linkedHashSet0, doubleArray0);
	      // Undeclared exception!
	      try { 
	        denseWeightedGraph0.filterEdges((Predicate<Edge<Object>>) null);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 0
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void WGtest08()  throws Throwable  {
	      ArrayList<Object> arrayList0 = new ArrayList<Object>();
	      PriorityQueue<Weighted<Edge<Object>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Object>>>();
	      Object object0 = new Object();
	      arrayList0.add(object0);
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) arrayList0, (Iterable<Weighted<Edge<Object>>>) priorityQueue0);
	      WeightedGraph<Object> weightedGraph0 = sparseWeightedGraph0.filterEdges((Predicate<Edge<Object>>) null);
	      assertNotNull(weightedGraph0);
	  }

	  @Test(timeout = 4000)
	  public void WGtest09()  throws Throwable  {
	      ArrayList<Object> arrayList0 = new ArrayList<Object>();
	      PriorityQueue<Weighted<Edge<Object>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Object>>>();
	      Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, 0);
	      Edge<Object> edge0 = new Edge<Object>(priorityQueue0, weighted0);
	      Weighted<Edge<Object>> weighted1 = new Weighted<Edge<Object>>(edge0, 0);
	      priorityQueue0.add(weighted1);
	      arrayList0.add((Object) weighted0);
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) arrayList0, (Iterable<Weighted<Edge<Object>>>) priorityQueue0);
	      // Undeclared exception!
	      try { 
	        sparseWeightedGraph0.filterEdges((Predicate<Edge<Object>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void WGtest10()  throws Throwable  {
	      ArrayList<Object> arrayList0 = new ArrayList<Object>();
	      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
	      Edge<Object> edge0 = new Edge<Object>(locale_FilteringMode0, arrayList0);
	      arrayList0.add((Object) edge0);
	      PriorityQueue<Weighted<Edge<Object>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Object>>>();
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) arrayList0, (Iterable<Weighted<Edge<Object>>>) priorityQueue0);
	      // Undeclared exception!
	      try { 
	        sparseWeightedGraph0.filterEdges((Predicate<Edge<Object>>) null);
	        fail("Expecting exception: StackOverflowError");
	      
	      } catch(StackOverflowError e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }
	
	
}
