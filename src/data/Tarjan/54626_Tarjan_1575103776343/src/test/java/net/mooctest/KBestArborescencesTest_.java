/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 13:39:02 GMT+08:00 2019
 */

package net.mooctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;

public class KBestArborescencesTest_{

  @Test(timeout = 4000)
  public void test_E00()  throws Throwable  {
      Arborescence<Locale.Category> arborescence0 = Arborescence.empty();
      Weighted<Arborescence<Locale.Category>> weighted0 = Weighted.weighted(arborescence0, 0.0);
      HashSet<Edge<Locale.Category>> hashSet0 = new HashSet<Edge<Locale.Category>>();
      TreeSet<Edge<Locale.Category>> treeSet0 = new TreeSet<Edge<Locale.Category>>();
      KBestArborescences.SubsetOfSolutions<Locale.Category> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Locale.Category>((Edge<Locale.Category>) null, weighted0, hashSet0, treeSet0);
  }

  @Test(timeout = 4000)
  public void test_E02()  throws Throwable  {
      HashSet<Weighted<Edge<KBestArborescences>>> hashSet0 = new HashSet<Weighted<Edge<KBestArborescences>>>();
      SparseWeightedGraph<KBestArborescences> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<KBestArborescences>>>) hashSet0);
      TreeSet<Edge<KBestArborescences>> treeSet0 = new TreeSet<Edge<KBestArborescences>>();
      HashSet<Edge<KBestArborescences>> hashSet1 = new HashSet<Edge<KBestArborescences>>();
      Arborescence<KBestArborescences> arborescence0 = Arborescence.empty();
      Weighted<Arborescence<KBestArborescences>> weighted0 = new Weighted<Arborescence<KBestArborescences>>(arborescence0, 0.0);
      Optional<Weighted<KBestArborescences.SubsetOfSolutions<KBestArborescences>>> optional0 = KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<KBestArborescences>) sparseWeightedGraph0, (Set<Edge<KBestArborescences>>) treeSet0, (Set<Edge<KBestArborescences>>) hashSet1, weighted0);
      assertNotNull(optional0);
  }


  @Test(timeout = 4000)
  public void test_E07()  throws Throwable  {
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) null, integer0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         
      }
  }

  @Test(timeout = 4000)
  public void test_E08()  throws Throwable  {
      double[][] doubleArray0 = new double[6][5];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = Integer.getInteger("", 0);
      // Undeclared exception!
      try { 
        KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         
      }
  }

  @Test(timeout = 4000)
  public void test_E11()  throws Throwable  {
      double[][] doubleArray0 = new double[3][7];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.59423828125;
      doubleArray1[1] = 0.769927001953125;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, (Integer) null, 2);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_E13()  throws Throwable  {
      KBestArborescences kBestArborescences0 = new KBestArborescences();
  }
}
