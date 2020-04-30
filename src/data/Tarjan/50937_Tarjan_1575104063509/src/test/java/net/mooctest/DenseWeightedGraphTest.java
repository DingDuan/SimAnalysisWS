package net.mooctest;


import static org.junit.Assert.*;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.Stack;

import org.junit.Test;

public class DenseWeightedGraphTest {


	  @Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][8];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
	      assertNotNull(collection0);
	  }

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][3];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      Integer integer1 = new Integer(0);
	      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer1);
	      assertEquals(0.0, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	      double[][] doubleArray0 = new double[0][1];
	      HashSet<Object> hashSet0 = new HashSet<Object>();
	      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
	      hashSet0.add(locale_FilteringMode0);
	      // Undeclared exception!
	
	  }

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	      double[][] doubleArray0 = new double[5][0];
	      double[] doubleArray1 = new double[2];
	      doubleArray1[0] = 0.919775;
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
	      assertEquals(0.919775, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][3];
	      double[] doubleArray1 = new double[0];
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!

	  }

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      double[][] doubleArray0 = new double[1][1];
	      double[] doubleArray1 = new double[0];
	      doubleArray0[0] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!

	  }

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {
	      LinkedHashSet<Weighted<String>> linkedHashSet0 = new LinkedHashSet<Weighted<String>>();
	      // Undeclared exception!
	 
	  }

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      double[][] doubleArray0 = new double[0][9];
	      // Undeclared exception!
	 
	  }

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
	      EnumSet<Locale.FilteringMode> enumSet0 = EnumSet.of(locale_FilteringMode0, locale_FilteringMode0);
	      double[][] doubleArray0 = new double[1][6];
	      DenseWeightedGraph<Locale.FilteringMode> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.FilteringMode>) enumSet0, doubleArray0);
	      assertNotNull(denseWeightedGraph0);
	  }

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      double[][] doubleArray0 = new double[0][0];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges((Integer) null);
	      assertNotNull(collection0);
	  }

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][3];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      Integer integer1 = new Integer((-1));
	      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer1);
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {
	      double[][] doubleArray0 = new double[0][0];
	      Stack<Locale.FilteringMode> stack0 = new Stack<Locale.FilteringMode>();
	      LinkedHashSet<Locale.FilteringMode> linkedHashSet0 = new LinkedHashSet<Locale.FilteringMode>(stack0);
	      DenseWeightedGraph<Locale.FilteringMode> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.FilteringMode>) linkedHashSet0, doubleArray0);
	      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
	      double double0 = denseWeightedGraph0.getWeightOf(locale_FilteringMode0, locale_FilteringMode0);
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {
	      double[][] doubleArray0 = new double[3][3];
	      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
	      ServiceLoader<Locale.FilteringMode> serviceLoader0 = ServiceLoader.loadInstalled(class0);
	      // Undeclared exception!
	   
	  }

	  @Test(timeout = 4000)
	  public void test13()  throws Throwable  {
	      double[][] doubleArray0 = new double[0][0];
	      Stack<Locale.FilteringMode> stack0 = new Stack<Locale.FilteringMode>();
	      LinkedHashSet<Locale.FilteringMode> linkedHashSet0 = new LinkedHashSet<Locale.FilteringMode>(stack0);
	      DenseWeightedGraph<Locale.FilteringMode> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.FilteringMode>) linkedHashSet0, doubleArray0);
	      Collection<Locale.FilteringMode> collection0 = denseWeightedGraph0.getNodes();
	      assertNotNull(collection0);
	  }

	  

}
