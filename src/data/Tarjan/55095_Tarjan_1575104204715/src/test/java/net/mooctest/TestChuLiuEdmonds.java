package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;

import com.google.common.base.Optional;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import net.mooctest.Arborescence;
import net.mooctest.ChuLiuEdmonds;
import net.mooctest.DenseWeightedGraph;
import net.mooctest.Edge;
import net.mooctest.ExclusiveEdge;
import net.mooctest.SparseWeightedGraph;
import net.mooctest.Weighted;
import net.mooctest.WeightedGraph;



public class TestChuLiuEdmonds{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      double[] doubleArray1 = new double[9];
      doubleArray1[1] = 0.5;
      doubleArray0[0] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
      assertNotNull(weighted0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Stack<Weighted<Edge<Locale.Category>>> stack0 = new Stack<Weighted<Edge<Locale.Category>>>();
      ArrayDeque<Weighted<Edge<Locale.Category>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Locale.Category>>>(stack0);
      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.Category>>>) arrayDeque0);
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Edge<Locale.Category> edge0 = new Edge<Locale.Category>(locale_Category0, locale_Category0);
      ChuLiuEdmonds.PartialSolution<Locale.Category> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Locale.Category>) sparseWeightedGraph0);
      ExclusiveEdge<Locale.Category> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
      // Undeclared exception!
      try { 
        chuLiuEdmonds_PartialSolution0.addEdge(exclusiveEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashSet<Weighted<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<String>>>();
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) linkedHashSet0);
      Weighted<Arborescence<String>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) sparseWeightedGraph0, "");
      assertNotNull(weighted0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashSet<Edge<Weighted<Edge<Locale.Category>>>> hashSet0 = new HashSet<Edge<Weighted<Edge<Locale.Category>>>>();
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Weighted<Edge<Locale.Category>>>) null, (Set<Edge<Weighted<Edge<Locale.Category>>>>) hashSet0, (Set<Edge<Weighted<Edge<Locale.Category>>>>) hashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
         
      }
  }

//  @Test(timeout = 4000)
//  public void test04()  throws Throwable  {
//      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
//      
//      linkedHashSet0.add(edge0);
//      // Undeclared exception!
//      try { 
//        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) null, (Set<Edge<Object>>) linkedHashSet0, (Set<Edge<Object>>) linkedHashSet0);
//        fail("Expecting exception: NullPointerException");
//      
//      } catch(Exception e) {
//         
//      }
//  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      double[] doubleArray1 = new double[0];
      doubleArray0[2] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>();
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) treeSet0, (Set<Edge<Integer>>) treeSet0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(Exception e) {
         //
         
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(Exception e) {
         //
         
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
         //
         
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[6][3];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(Exception e) {
         //
        
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashSet<Weighted<Edge<Object>>> hashSet0 = new HashSet<Weighted<Edge<Object>>>();
      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) hashSet0);
      ChuLiuEdmonds.PartialSolution<Object> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Object>) sparseWeightedGraph0);
      Set<Object> set0 = chuLiuEdmonds_PartialSolution0.getNodes();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashSet<Weighted<Edge<Arborescence<Object>>>> hashSet0 = new HashSet<Weighted<Edge<Arborescence<Object>>>>();
      SparseWeightedGraph<Arborescence<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Arborescence<Object>>>>) hashSet0);
      ChuLiuEdmonds.PartialSolution<Arborescence<Object>> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Arborescence<Object>>) sparseWeightedGraph0);
      Arborescence<Object> arborescence0 = Arborescence.empty();
      Optional<ExclusiveEdge<Arborescence<Object>>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge(arborescence0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
      assertNotNull(weighted0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[2][1];
      double[] doubleArray1 = new double[4];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);
      Integer integer0 = new Integer(0);
      Arborescence<Integer> arborescence0 = Arborescence.empty();
      Optional<ExclusiveEdge<Integer>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge(integer0, arborescence0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      Stack<Weighted<Edge<String>>> stack0 = new Stack<Weighted<Edge<String>>>();
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) priorityQueue0, (Iterable<Weighted<Edge<String>>>) stack0);
      TreeSet<Edge<String>> treeSet0 = new TreeSet<Edge<String>>();
      HashSet<Edge<String>> hashSet0 = new HashSet<Edge<String>>();
      Weighted<Arborescence<String>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) sparseWeightedGraph0, (Set<Edge<String>>) treeSet0, (Set<Edge<String>>) hashSet0);
      assertNotNull(weighted0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ChuLiuEdmonds chuLiuEdmonds0 = new ChuLiuEdmonds();
  }
}
