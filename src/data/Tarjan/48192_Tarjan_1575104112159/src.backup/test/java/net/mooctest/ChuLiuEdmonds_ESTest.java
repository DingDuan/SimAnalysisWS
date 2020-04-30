/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:58:19 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.javaparser.ast.expr.NullLiteralExpr;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import javax.tools.Diagnostic;
import net.mooctest.Arborescence;
import net.mooctest.ChuLiuEdmonds;
import net.mooctest.DenseWeightedGraph;
import net.mooctest.Edge;
import net.mooctest.ExclusiveEdge;
import net.mooctest.SparseWeightedGraph;
import net.mooctest.Weighted;
import net.mooctest.WeightedGraph;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChuLiuEdmonds_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashSet<Edge<Arborescence<Integer>>> linkedHashSet0 = new LinkedHashSet<Edge<Arborescence<Integer>>>();
      LinkedHashSet<Edge<Arborescence<Integer>>> linkedHashSet1 = new LinkedHashSet<Edge<Arborescence<Integer>>>();
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Arborescence<Integer>>) null, (Set<Edge<Arborescence<Integer>>>) linkedHashSet0, (Set<Edge<Arborescence<Integer>>>) linkedHashSet1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.ChuLiuEdmonds", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[4][8];
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = (-596.596379636);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray2[3] = (-1503.746199);
      doubleArray0[1] = doubleArray2;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
      assertEquals(0.0, weighted0.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashSet<Weighted<Edge<String>>> hashSet0 = new HashSet<Weighted<Edge<String>>>(1386);
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) hashSet0);
      ChuLiuEdmonds.PartialSolution<String> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<String>) sparseWeightedGraph0);
      Edge<String> edge0 = new Edge<String>("", "");
      ArrayList<Edge<String>> arrayList0 = new ArrayList<Edge<String>>();
      ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<String>>) arrayList0, 3991.53);
      // Undeclared exception!
      try { 
        chuLiuEdmonds_PartialSolution0.addEdge(exclusiveEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Partition", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<Weighted<Edge<Weighted<Arborescence<NullLiteralExpr>>>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Weighted<Arborescence<NullLiteralExpr>>>>>(comparator0);
      SparseWeightedGraph<Weighted<Arborescence<NullLiteralExpr>>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Weighted<Arborescence<NullLiteralExpr>>>>>) priorityQueue0);
      TreeSet<Edge<Weighted<Arborescence<NullLiteralExpr>>>> treeSet0 = new TreeSet<Edge<Weighted<Arborescence<NullLiteralExpr>>>>();
      Weighted<Arborescence<Weighted<Arborescence<NullLiteralExpr>>>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Weighted<Arborescence<NullLiteralExpr>>>) sparseWeightedGraph0, (Set<Edge<Weighted<Arborescence<NullLiteralExpr>>>>) treeSet0, (Set<Edge<Weighted<Arborescence<NullLiteralExpr>>>>) treeSet0);
      assertEquals(0.0, weighted0.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Stack<Weighted<Edge<String>>> stack0 = new Stack<Weighted<Edge<String>>>();
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) stack0);
      Weighted<Arborescence<String>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) sparseWeightedGraph0, (String) null);
      assertEquals(0.0, weighted0.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashSet<Edge<Diagnostic.Kind>> linkedHashSet0 = new LinkedHashSet<Edge<Diagnostic.Kind>>();
      Edge<Diagnostic.Kind> edge0 = (Edge<Diagnostic.Kind>) mock(Edge.class, new ViolatedAssumptionAnswer());
      linkedHashSet0.add(edge0);
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Diagnostic.Kind>) null, (Set<Edge<Diagnostic.Kind>>) linkedHashSet0, (Set<Edge<Diagnostic.Kind>>) linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null key in entry: null=null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[3][0];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(3176);
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.ChuLiuEdmonds", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[5][5];
      double[] doubleArray1 = new double[4];
      doubleArray0[3] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("net.mooctest.DenseWeightedGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashSet<Weighted<Edge<String>>> hashSet0 = new HashSet<Weighted<Edge<String>>>(1283);
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) hashSet0);
      ChuLiuEdmonds.PartialSolution<String> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<String>) sparseWeightedGraph0);
      Set<String> set0 = chuLiuEdmonds_PartialSolution0.getNodes();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<Weighted<Edge<String>>> treeSet0 = new TreeSet<Weighted<Edge<String>>>(comparator0);
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) treeSet0);
      ChuLiuEdmonds.PartialSolution<String> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<String>) sparseWeightedGraph0);
      Optional<ExclusiveEdge<String>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge("%s (%s) must be less than size (%s)");
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashSet<Weighted<Edge<String>>> hashSet0 = new HashSet<Weighted<Edge<String>>>(1283);
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) hashSet0);
      ChuLiuEdmonds.PartialSolution<String> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<String>) sparseWeightedGraph0);
      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of();
      Arborescence<String> arborescence0 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
      Optional<ExclusiveEdge<String>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge("3't &^PS0/o)evYeD", arborescence0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[5][5];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = Double.NEGATIVE_INFINITY;
      doubleArray0[2] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);
      assertNotNull(chuLiuEdmonds_PartialSolution0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Edge<Weighted<Edge<Diagnostic.Kind>>> edge0 = (Edge<Weighted<Edge<Diagnostic.Kind>>>) mock(Edge.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Edge<Weighted<Edge<Diagnostic.Kind>>>>) null, edge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.ChuLiuEdmonds", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChuLiuEdmonds chuLiuEdmonds0 = new ChuLiuEdmonds();
  }
}
