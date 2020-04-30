package net.mooctest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Locale;

import org.junit.Test;

public class DenseWeightedGraphTest {
	public void test() {
		 double[][] doubleArray0 = new double[7][6];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
	      assertNotNull(collection0);
	}
	@Test
	public void test01() {
		double[][] doubleArray0 = new double[9][1];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      Integer integer1 = new Integer(0);
	      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer1);
	      assertEquals(0.0, double0, 0.01);
	}
	@Test
	public void test02() {
		double[][] doubleArray0 = new double[9][1];
	      double[] doubleArray1 = new double[7];
	      doubleArray1[1] = 0.5;
	      doubleArray0[1] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(1);
	      double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
	      assertEquals(0.5, double0, 0.01);
	}
	@Test
	public void test03() {
		ArrayList<Edge<Object>> arrayList0 = new ArrayList<Edge<Object>>();
	      double[][] doubleArray0 = new double[2][5];
	      double[] doubleArray1 = new double[5];
	      Edge<Object> edge0 = new Edge<Object>(doubleArray1, arrayList0);
	      arrayList0.add(edge0);
	      arrayList0.add(edge0);
	      // Undeclared exception!
	      try { 
	        DenseWeightedGraph.from((Iterable<Edge<Object>>) arrayList0, doubleArray0);
	        fail("Expecting exception: StackOverflowError");
	      
	      } catch(StackOverflowError e) {
	         
	      }
	}
	@Test
	public void test04() {
		double[][] doubleArray0 = new double[5][9];
	      // Undeclared exception!
	      try { 
	        DenseWeightedGraph.from((Iterable<Weighted<Locale.Category>>) null, doubleArray0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {

	      }
	}
	@Test
	public void test05() {
		 Locale.Category locale_Category0 = Locale.Category.DISPLAY;
	      EnumSet<Locale.Category> enumSet0 = EnumSet.of(locale_Category0);
	      double[][] doubleArray0 = new double[1][5];
	      DenseWeightedGraph<Locale.Category> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, doubleArray0);
	      double double0 = denseWeightedGraph0.getWeightOf(locale_Category0, (Locale.Category) null);
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}
	
	@Test
	public void test06() {
		Locale.Category locale_Category0 = Locale.Category.DISPLAY;
	      EnumSet<Locale.Category> enumSet0 = EnumSet.of(locale_Category0);
	      double[][] doubleArray0 = new double[1][5];
	      DenseWeightedGraph<Locale.Category> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, doubleArray0);
	      Locale.Category locale_Category1 = Locale.Category.FORMAT;
	      double double0 = denseWeightedGraph0.getWeightOf(locale_Category1, locale_Category0);
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}
	@Test
	public void test07() {
	Locale.Category locale_Category0 = Locale.Category.DISPLAY;
   EnumSet<Locale.Category> enumSet0 = EnumSet.of(locale_Category0);
   double[][] doubleArray0 = new double[1][5];
   DenseWeightedGraph<Locale.Category> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, doubleArray0);
   Collection<Locale.Category> collection0 = denseWeightedGraph0.getNodes();
   assertTrue(collection0.contains(locale_Category0));
	}
	@Test
	public void test08() {
	  double[][] doubleArray0 = new double[1][5];
     DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
     Integer integer0 = new Integer(1);
     Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
     assertNotNull(collection0);
	}
	
}
