package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import net.mooctest.Edge;
import net.mooctest.SparseWeightedGraph;
import net.mooctest.Weighted;



public class TestSparseWeightedGraph {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>();
      LinkedList<Weighted<Edge<Object>>> linkedList0 = new LinkedList<Weighted<Edge<Object>>>();
      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) priorityQueue0, (Iterable<Weighted<Edge<Object>>>) linkedList0);
      double double0 = sparseWeightedGraph0.getWeightOf(integer0, integer1);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PriorityQueue<Weighted<Edge<Integer>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Integer>>>();
      // Undeclared exception!
      try { 
        SparseWeightedGraph.from((Iterable<Integer>) null, (Iterable<Weighted<Edge<Integer>>>) priorityQueue0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
      Vector<Weighted<Edge<Edge<Integer>>>> vector0 = new Vector<Weighted<Edge<Edge<Integer>>>>(0);
      hashSet0.add((Edge<Integer>) null);
      // Undeclared exception!
      try { 
        SparseWeightedGraph.from((Iterable<Edge<Integer>>) hashSet0, (Iterable<Weighted<Edge<Edge<Integer>>>>) vector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Stack<Weighted<Edge<Object>>> stack0 = new Stack<Weighted<Edge<Object>>>();
      Edge<Object> edge0 = new Edge<Object>("", stack0);
      Weighted<Edge<Object>> weighted0 = new Weighted<Edge<Object>>(edge0, 0.0);
      stack0.add(weighted0);
      // Undeclared exception!
      try { 
        SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) stack0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.SparseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TreeSet<Weighted<Edge<Object>>> treeSet0 = new TreeSet<Weighted<Edge<Object>>>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      Edge<Object> edge0 = new Edge<Object>((Object) null, locale_FilteringMode0);
      Weighted<Edge<Object>> weighted0 = Weighted.weighted(edge0, 0.0);
      treeSet0.add(weighted0);
      // Undeclared exception!
      try { 
        SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) treeSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // at index 0
         //
         verifyException("com.google.common.collect.ObjectArrays", e);
      }
  }

//  @Test(timeout = 4000)
//  public void test06()  throws Throwable  {
//      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
//      PriorityQueue<Weighted<Edge<String>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<String>>>(1, comparator0);
//      Edge<String> edge0 = new Edge<String>("", "Tm=JV8c|8{");
//      Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, 0.0);
//      priorityQueue0.add(weighted0);
//      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) priorityQueue0);
//      Collection<Weighted<Edge<String>>> collection0 = sparseWeightedGraph0.getIncomingEdges("Tm=JV8c|8{");
//      assertTrue(collection0.contains(weighted0));
//  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<Weighted<Edge<Integer>>> arrayList0 = new ArrayList<Weighted<Edge<Integer>>>(0);
      SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Integer>>>) arrayList0);
      Integer integer0 = new Integer(0);
      Collection<Weighted<Edge<Integer>>> collection0 = sparseWeightedGraph0.getIncomingEdges(integer0);
      assertNotNull(collection0);
  }

//  @Test(timeout = 4000)
//  public void test08()  throws Throwable  {
//      LinkedList<String> linkedList0 = new LinkedList<String>();
//      Vector<String> vector0 = new Vector<String>(linkedList0);
//      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
//      doReturn(0).when(comparator0).compare(any() , any());
//      TreeSet<Weighted<Edge<String>>> treeSet0 = new TreeSet<Weighted<Edge<String>>>(comparator0);
//      Edge<String> edge0 = new Edge<String>("p", "");
//      Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, 0);
//      treeSet0.add(weighted0);
//      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) vector0, (Iterable<Weighted<Edge<String>>>) treeSet0);
//      double double0 = sparseWeightedGraph0.getWeightOf("", "");
//      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
//  }

//  @Test(timeout = 4000)
//  public void test09()  throws Throwable  {
//      LinkedList<String> linkedList0 = new LinkedList<String>();
//      Vector<String> vector0 = new Vector<String>(linkedList0);
//      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
//      doReturn(0).when(comparator0).compare(any() , any());
//      TreeSet<Weighted<Edge<String>>> treeSet0 = new TreeSet<Weighted<Edge<String>>>(comparator0);
//      Edge<String> edge0 = new Edge<String>("", "");
//      Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, 0);
//      treeSet0.add(weighted0);
//      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) vector0, (Iterable<Weighted<Edge<String>>>) treeSet0);
//      double double0 = sparseWeightedGraph0.getWeightOf("", "");
//      assertEquals(0.0, double0, 0.01);
//  }

//  @Test(timeout = 4000)
//  public void test10()  throws Throwable  {
//      LinkedList<String> linkedList0 = new LinkedList<String>();
//      Vector<String> vector0 = new Vector<String>(linkedList0);
//      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
//      doReturn(0, 1).when(comparator0).compare(any() , any());
//      TreeSet<Weighted<Edge<String>>> treeSet0 = new TreeSet<Weighted<Edge<String>>>(comparator0);
//      Edge<String> edge0 = new Edge<String>("", "");
//      Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, 0);
//      treeSet0.add(weighted0);
//      treeSet0.add(weighted0);
//      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) vector0, (Iterable<Weighted<Edge<String>>>) treeSet0);
//      assertNotNull(sparseWeightedGraph0);
//  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>();
      LinkedList<Weighted<Edge<Object>>> linkedList0 = new LinkedList<Weighted<Edge<Object>>>();
      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) priorityQueue0, (Iterable<Weighted<Edge<Object>>>) linkedList0);
      Collection<Object> collection0 = sparseWeightedGraph0.getNodes();
      assertNotNull(collection0);
  }
}
