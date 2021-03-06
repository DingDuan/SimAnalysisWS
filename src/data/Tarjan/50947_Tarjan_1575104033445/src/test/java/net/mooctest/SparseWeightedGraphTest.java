/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:34:46 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import net.mooctest.Edge;
import net.mooctest.SparseWeightedGraph;
import net.mooctest.Weighted;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

public class SparseWeightedGraphTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<Integer> priorityQueue0 = new PriorityQueue<Integer>(comparator0);
      HashSet<Weighted<Edge<Integer>>> hashSet0 = new HashSet<Weighted<Edge<Integer>>>(3493);
      Integer integer0 = new Integer(3966);
      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
      Weighted<Edge<Integer>> weighted0 = Weighted.weighted(edge0, (double) 3493);
      hashSet0.add(weighted0);
      SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Integer>) priorityQueue0, (Iterable<Weighted<Edge<Integer>>>) hashSet0);
      Integer integer1 = new Integer(3966);
      double double0 = sparseWeightedGraph0.getWeightOf(integer0, integer1);
      assertEquals(3493.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Locale.Category> class0 = Locale.Category.class;
      EnumSet<Locale.Category> enumSet0 = EnumSet.noneOf(class0);
      ArrayList<Weighted<Edge<Locale.Category>>> arrayList0 = new ArrayList<Weighted<Edge<Locale.Category>>>(0);
      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, (Iterable<Weighted<Edge<Locale.Category>>>) arrayList0);
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      Locale.Category locale_Category1 = Locale.Category.FORMAT;
      double double0 = sparseWeightedGraph0.getWeightOf(locale_Category0, locale_Category1);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TreeSet<Weighted<Edge<PriorityQueue<String>>>> treeSet0 = new TreeSet<Weighted<Edge<PriorityQueue<String>>>>();
      // Undeclared exception!
      try { 
        SparseWeightedGraph.from((Iterable<PriorityQueue<String>>) null, (Iterable<Weighted<Edge<PriorityQueue<String>>>>) treeSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Stack<Weighted<Edge<Object>>> stack0 = new Stack<Weighted<Edge<Object>>>();
      Edge<Object> edge0 = new Edge<Object>(stack0, stack0);
      Weighted<Edge<Object>> weighted0 = Weighted.weighted(edge0, 1.0);
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
        SparseWeightedGraph.from((Iterable<Weighted<Edge<Class<Object>>>>) null);
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
      TreeSet<Weighted<Edge<Weighted<Object>>>> treeSet0 = new TreeSet<Weighted<Edge<Weighted<Object>>>>();
      Edge<Weighted<Object>> edge0 = new Edge<Weighted<Object>>((Weighted<Object>) null, (Weighted<Object>) null);
      Weighted<Edge<Weighted<Object>>> weighted0 = new Weighted<Edge<Weighted<Object>>>(edge0, 0.0);
      treeSet0.add(weighted0);
      // Undeclared exception!
      try { 
        SparseWeightedGraph.from((Iterable<Weighted<Edge<Weighted<Object>>>>) treeSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TreeSet<Weighted<Edge<Locale.Category>>> treeSet0 = new TreeSet<Weighted<Edge<Locale.Category>>>();
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      Edge<Locale.Category> edge0 = new Edge<Locale.Category>(locale_Category0, locale_Category0);
      Vector<Locale.Category> vector0 = new Vector<Locale.Category>();
      Weighted<Edge<Locale.Category>> weighted0 = new Weighted<Edge<Locale.Category>>(edge0, (-1240.55201));
      treeSet0.add(weighted0);
      Weighted<Edge<Locale.Category>> weighted1 = Weighted.weighted(edge0, 0.0);
      treeSet0.add(weighted1);
      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.Category>) vector0, (Iterable<Weighted<Edge<Locale.Category>>>) treeSet0);
      assertNotNull(sparseWeightedGraph0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Locale.Category> class0 = Locale.Category.class;
      EnumSet<Locale.Category> enumSet0 = EnumSet.noneOf(class0);
      ArrayList<Weighted<Edge<Locale.Category>>> arrayList0 = new ArrayList<Weighted<Edge<Locale.Category>>>(0);
      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, (Iterable<Weighted<Edge<Locale.Category>>>) arrayList0);
      Collection<Locale.Category> collection0 = sparseWeightedGraph0.getNodes();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Stack<Weighted<Edge<String>>> stack0 = new Stack<Weighted<Edge<String>>>();
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) stack0);
      Collection<Weighted<Edge<String>>> collection0 = sparseWeightedGraph0.getIncomingEdges("Edge{source=DISPLAY, destination=FORMAT}");
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Weighted<Edge<Locale.Category>>> arrayList0 = new ArrayList<Weighted<Edge<Locale.Category>>>(1332);
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      Locale.Category locale_Category1 = Locale.Category.FORMAT;
      Edge<Locale.Category> edge0 = new Edge<Locale.Category>(locale_Category0, locale_Category1);
      Weighted<Edge<Locale.Category>> weighted0 = new Weighted<Edge<Locale.Category>>(edge0, 1332);
      arrayList0.add(weighted0);
      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.Category>>>) arrayList0);
      double double0 = sparseWeightedGraph0.getWeightOf(locale_Category1, locale_Category1);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<Weighted<Edge<Locale.Category>>> arrayList0 = new ArrayList<Weighted<Edge<Locale.Category>>>(1332);
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Edge<Locale.Category> edge0 = new Edge<Locale.Category>(locale_Category0, locale_Category0);
      Weighted<Edge<Locale.Category>> weighted0 = new Weighted<Edge<Locale.Category>>(edge0, 1332);
      arrayList0.add(weighted0);
      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.Category>>>) arrayList0);
      Collection<Weighted<Edge<Locale.Category>>> collection0 = sparseWeightedGraph0.getIncomingEdges(locale_Category0);
      assertTrue(collection0.contains(weighted0));
  }
}
