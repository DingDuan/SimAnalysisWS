package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Vector;
import net.mooctest.DenseWeightedGraph;
import net.mooctest.Edge;
import net.mooctest.Weighted;



public class TestDenseWeightedGraph {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[0][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) denseWeightedGraph0);
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Object>) arrayList0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(Exception e) {
         //
         
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      Locale.FilteringMode locale_FilteringMode1 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      EnumSet<Locale.FilteringMode> enumSet0 = EnumSet.of(locale_FilteringMode0, locale_FilteringMode1, locale_FilteringMode0, locale_FilteringMode1, locale_FilteringMode1);
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = 0.521464306640625;
      doubleArray0[0] = doubleArray1;
      DenseWeightedGraph<Locale.FilteringMode> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.FilteringMode>) enumSet0, doubleArray0);
      double double0 = denseWeightedGraph0.getWeightOf(locale_FilteringMode1, locale_FilteringMode0);
      assertEquals(0.521464306640625, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[9][7];
      double[] doubleArray1 = new double[0];
      doubleArray0[5] = doubleArray1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        denseWeightedGraph0.getIncomingEdges(integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(Exception e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>(0);
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<String>) vector0, (double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[5][2];
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Object>) null, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      Locale.FilteringMode locale_FilteringMode1 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      EnumSet<Locale.FilteringMode> enumSet0 = EnumSet.of(locale_FilteringMode0, locale_FilteringMode1, locale_FilteringMode0, locale_FilteringMode1, locale_FilteringMode1);
      double[][] doubleArray0 = new double[2][2];
      DenseWeightedGraph<Locale.FilteringMode> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.FilteringMode>) enumSet0, doubleArray0);
      Collection<Weighted<Edge<Locale.FilteringMode>>> collection0 = denseWeightedGraph0.getIncomingEdges(locale_FilteringMode0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges((Integer) null);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[5][3];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      double double0 = denseWeightedGraph0.getWeightOf(integer0, (Integer) null);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      double[][] doubleArray0 = new double[0][5];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Integer>) vector0, doubleArray0);
      double double0 = denseWeightedGraph0.getWeightOf((Integer) null, (Integer) null);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      PriorityQueue<Locale.FilteringMode> priorityQueue0 = new PriorityQueue<Locale.FilteringMode>();
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<Locale.FilteringMode>) priorityQueue0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(Exception e) {
         //
         
         
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[0][5];
      PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>(1);
      DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) priorityQueue0, doubleArray0);
      Collection<Object> collection0 = denseWeightedGraph0.getNodes();
      assertFalse(collection0.contains(1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[10][3];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
      assertEquals(0.0, double0, 0.01);
  }
}
