package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;

import com.google.common.base.Predicate;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.TreeSet;
import java.util.Vector;
import net.mooctest.DenseWeightedGraph;
import net.mooctest.Edge;
import net.mooctest.SparseWeightedGraph;
import net.mooctest.Weighted;
import net.mooctest.WeightedGraph;



public class TestWeightedGraph {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[4][1];
      double[] doubleArray1 = new double[6];
      doubleArray0[1] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[4][1];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.5211419692382813;
      doubleArray0[0] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
      assertEquals(0.5211419692382813, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayDeque<Weighted<Edge<Locale.Category>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Locale.Category>>>();
      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.Category>>>) arrayDeque0);
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      double double0 = sparseWeightedGraph0.getWeightOf(locale_Category0, locale_Category0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>(0, 1);
      Vector<Weighted<Edge<Edge<Integer>>>> vector0 = new Vector<Weighted<Edge<Edge<Integer>>>>(0);
      SparseWeightedGraph<Edge<Integer>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Edge<Integer>>) linkedHashSet0, (Iterable<Weighted<Edge<Edge<Integer>>>>) vector0);
      Collection<Edge<Integer>> collection0 = sparseWeightedGraph0.getNodes();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>(0, 1);
      Vector<Weighted<Edge<Edge<Integer>>>> vector0 = new Vector<Weighted<Edge<Edge<Integer>>>>(0);
      SparseWeightedGraph<Edge<Integer>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Edge<Integer>>) linkedHashSet0, (Iterable<Weighted<Edge<Edge<Integer>>>>) vector0);
      Integer integer0 = new Integer(0);
      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
      Collection<Weighted<Edge<Edge<Integer>>>> collection0 = sparseWeightedGraph0.getIncomingEdges(edge0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[4][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 
        denseWeightedGraph0.getWeightOf(integer0, integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(Exception e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[4][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 
        denseWeightedGraph0.getIncomingEdges(integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(Exception e) {
         //
         
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[9][0];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      // Undeclared exception!
      try { 
        denseWeightedGraph0.filterEdges((Predicate<Edge<Integer>>) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(Exception e) {
         //
        
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      // Undeclared exception!
      try { 
        denseWeightedGraph0.filterEdges((Predicate<Edge<Integer>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
        
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      EnumSet<Locale.Category> enumSet0 = EnumSet.of(locale_Category0, locale_Category0, locale_Category0);
      TreeSet<Weighted<Edge<Locale.Category>>> treeSet0 = new TreeSet<Weighted<Edge<Locale.Category>>>();
      SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, (Iterable<Weighted<Edge<Locale.Category>>>) treeSet0);
      WeightedGraph<Locale.Category> weightedGraph0 = sparseWeightedGraph0.filterEdges((Predicate<Edge<Locale.Category>>) null);
      assertNotNull(weightedGraph0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashSet<Weighted<Edge<Object>>> hashSet0 = new HashSet<Weighted<Edge<Object>>>();
      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) hashSet0);
      Edge<Object> edge0 = new Edge<Object>(hashSet0, hashSet0);
      Weighted<Edge<Object>> weighted0 = Weighted.weighted(edge0, 0.0);
      hashSet0.add(weighted0);
      // Undeclared exception!
      try { 
        sparseWeightedGraph0.getWeightOf(hashSet0, hashSet0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
