/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:17:36 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Predicate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import net.mooctest.DenseWeightedGraph;
import net.mooctest.Edge;
import net.mooctest.SparseWeightedGraph;
import net.mooctest.Weighted;
import net.mooctest.WeightedGraph;
import org.junit.runner.RunWith;

public class WeightedGraph_ESTest {
 
  @Test(timeout = 1000)
  public void test76762b48_8b97_4bfc_a732_6c7a383d2fd80()  throws Throwable  {
      double[][] doubleArray0 = new double[3][7];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 1000)
  public void test9717df7a_3112_4e63_b08b_b26cc87b0c8e1()  throws Throwable  {
      LinkedHashSet<Weighted<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<String>>>();
      Edge<String> edge0 = new Edge<String>("", "net.mooctest.WeightedGraph");
      Weighted<Edge<String>> weighted0 = Weighted.weighted(edge0, 1270.9646);
      linkedHashSet0.add(weighted0);
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) linkedHashSet0);
      double double0 = sparseWeightedGraph0.getWeightOf("", "net.mooctest.WeightedGraph");
      assertEquals(1270.9646, double0, 0.01);
  }

  @Test(timeout = 1000)
  public void test124a8c0c_ae99_455d_832e_4aa38a51d9632()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      HashSet<Weighted<Edge<Object>>> hashSet0 = new HashSet<Weighted<Edge<Object>>>(0);
      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) arrayList0, (Iterable<Weighted<Edge<Object>>>) hashSet0);
      double double0 = sparseWeightedGraph0.getWeightOf(arrayList0, hashSet0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 1000)
  public void test49d646da_a0e8_4126_85e6_7bd392a8d4b53()  throws Throwable  {
      double[][] doubleArray0 = new double[0][9];
      ArrayList<Locale.LanguageRange> arrayList0 = new ArrayList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) arrayList0, (Collection<String>) null, locale_FilteringMode0);
      DenseWeightedGraph<String> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<String>) list0, doubleArray0);
      Collection<Weighted<Edge<String>>> collection0 = denseWeightedGraph0.getIncomingEdges("net.mooctest.WeightedGraph");
      assertNotNull(collection0);
  }

  @Test(timeout = 1000)
  public void test5c621fa2_5f14_4ae6_8a66_c30c12457f994()  throws Throwable  {
      double[][] doubleArray0 = new double[3][8];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        denseWeightedGraph0.getWeightOf(integer0, integer0);
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertTrue(e instanceof ArrayIndexOutOfBoundsException);
      }
  }

  @Test(timeout = 1000)
  public void test69954338_ea38_4f09_91f7_dbf2d06154ec5()  throws Throwable  {
      double[][] doubleArray0 = new double[4][0];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 
        denseWeightedGraph0.getIncomingEdges(integer0);
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertTrue(e instanceof ArrayIndexOutOfBoundsException);
      }
  }

  @Test(timeout = 1000)
  public void teste6035f21_a8d8_4cb0_afa7_b13644b549956()  throws Throwable  {
      LinkedHashSet<Weighted<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<String>>>();
      Edge<String> edge0 = new Edge<String>("", "p.>Y.,`c#V{0`yg8");
      Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, 257.27184545);
      linkedHashSet0.add(weighted0);
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) linkedHashSet0);
      // Undeclared exception!
      try { 
        sparseWeightedGraph0.filterEdges((Predicate<Edge<String>>) null);
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertTrue(e instanceof NullPointerException);
      }
  }

  @Test(timeout = 1000)
  public void teste5c0de8d_caa3_44cb_b0b0_04cc85b45a0e7()  throws Throwable  {
      LinkedHashSet<Weighted<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<String>>>();
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) linkedHashSet0);
      WeightedGraph<String> weightedGraph0 = sparseWeightedGraph0.filterEdges((Predicate<Edge<String>>) null);
      assertNotNull(weightedGraph0);
  }

  @Test(timeout = 1000)
  public void testaf306b0d_fb63_4227_8cb1_f6aa5851d8308()  throws Throwable  {
      ArrayDeque<Weighted<Edge<Object>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Object>>>();
      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) arrayDeque0);
      Collection<Object> collection0 = sparseWeightedGraph0.getNodes();
      assertNotNull(collection0);
  }
}
