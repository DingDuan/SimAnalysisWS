/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:54:21 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.javaparser.javadoc.JavadocBlockTag;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import net.mooctest.DenseWeightedGraph;
import net.mooctest.Edge;
import net.mooctest.Weighted;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DenseWeightedGraph_ESTest{

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[2][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      double double0 = denseWeightedGraph0.getWeightOf(integer1, integer0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavadocBlockTag.Type javadocBlockTag_Type0 = JavadocBlockTag.Type.VERSION;
      JavadocBlockTag.Type javadocBlockTag_Type1 = JavadocBlockTag.Type.THROWS;
      EnumSet<JavadocBlockTag.Type> enumSet0 = EnumSet.of(javadocBlockTag_Type0, javadocBlockTag_Type1, javadocBlockTag_Type1, javadocBlockTag_Type1);
      double[][] doubleArray0 = new double[1][9];
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<JavadocBlockTag.Type>) enumSet0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      PriorityQueue<Object> priorityQueue1 = new PriorityQueue<Object>(priorityQueue0);
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Object>) priorityQueue1, (double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[][] doubleArray0 = new double[0][4];
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<String>) null, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[2][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[][] doubleArray0 = new double[0][0];
      ArrayDeque<Weighted<String>> arrayDeque0 = new ArrayDeque<Weighted<String>>(457);
      DenseWeightedGraph<Weighted<String>> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Weighted<String>>) arrayDeque0, doubleArray0);
      Weighted<String> weighted0 = Weighted.weighted("", (-2496.0110417995));
      Collection<Weighted<Edge<Weighted<String>>>> collection0 = denseWeightedGraph0.getIncomingEdges(weighted0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[][] doubleArray0 = new double[0][1];
      LinkedList<JavadocBlockTag.Type> linkedList0 = new LinkedList<JavadocBlockTag.Type>();
      DenseWeightedGraph<JavadocBlockTag.Type> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<JavadocBlockTag.Type>) linkedList0, doubleArray0);
      JavadocBlockTag.Type javadocBlockTag_Type0 = JavadocBlockTag.Type.SEE;
      double double0 = denseWeightedGraph0.getWeightOf(javadocBlockTag_Type0, javadocBlockTag_Type0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>();
      ArrayList<Object> arrayList0 = new ArrayList<Object>(priorityQueue0);
      double[][] doubleArray0 = new double[1][4];
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Object>) arrayList0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>();
      ArrayList<Object> arrayList0 = new ArrayList<Object>(priorityQueue0);
      double[][] doubleArray0 = new double[1][4];
      arrayList0.add((Object) priorityQueue0);
      DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) arrayList0, doubleArray0);
      Collection<Object> collection0 = denseWeightedGraph0.getNodes();
      assertNotNull(collection0);
  }
}
