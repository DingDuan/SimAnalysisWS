
package net.mooctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.ServiceLoader;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Test;

public class DenseWeightedGraph_ESTest2{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[1][8];
      Integer integer0 = new Integer(0);
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer1 = new Integer(0);
      double double0 = denseWeightedGraph0.getWeightOf(integer1, integer0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<String> class0 = String.class;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ServiceLoader<String> serviceLoader0 = ServiceLoader.load(class0, classLoader0);
      double[][] doubleArray0 = new double[0][3];
      DenseWeightedGraph<String> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<String>) serviceLoader0, doubleArray0);
      Collection<String> collection0 = denseWeightedGraph0.getNodes();
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>(collection0);
      linkedHashSet0.add(denseWeightedGraph0);
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Object>) linkedHashSet0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[5][8];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 0.6930322265625;
      doubleArray0[0] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
      assertEquals(0.6930322265625, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[2][5];
      double[] doubleArray1 = new double[0];
      doubleArray0[1] = doubleArray1;
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
  public void test04()  throws Throwable  {
      ArrayList<Edge<Object>> arrayList0 = new ArrayList<Edge<Object>>();
      LinkedList<Edge<Object>> linkedList0 = new LinkedList<Edge<Object>>(arrayList0);
      double[][] doubleArray0 = new double[2][4];
      Weighted<String> weighted0 = new Weighted<String>("", 0.0);
      Integer integer0 = new Integer(0);
      Weighted<Integer> weighted1 = new Weighted<Integer>(integer0, 0.0);
      Edge<Object> edge0 = new Edge<Object>(weighted0, weighted1);
      linkedList0.add(edge0);
      Object object0 = new Object();
      Edge<Object> edge1 = new Edge<Object>(object0, linkedList0);
      linkedList0.add(edge1);
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Edge<Object>>) linkedList0, doubleArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<String> class0 = String.class;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ServiceLoader<String> serviceLoader0 = ServiceLoader.load(class0, classLoader0);
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<String>) serviceLoader0, (double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
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
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[2][7];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(2);
      Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[1][8];
      Integer integer0 = new Integer(0);
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer1 = new Integer((-1));
      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer1);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>((SortedSet<?>) treeSet0);
      double[][] doubleArray0 = new double[1][7];
      Integer integer0 = new Integer(0);
      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
      priorityQueue0.add(edge0);
      DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) priorityQueue0, doubleArray0);
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      double double0 = denseWeightedGraph0.getWeightOf(locale_Category0, priorityQueue0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      ArrayList<Locale.Category> arrayList0 = new ArrayList<Locale.Category>(0);
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Locale.Category>) arrayList0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
}
