package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.ServiceLoader;
import java.util.TreeSet;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Predicate;

public class DenseWeightedGraphTest {

	@Test(timeout = 4000)
	public void test00() throws Throwable {
		double[][] doubleArray0 = new double[3][6];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		Integer integer1 = new Integer(0);
		double double0 = denseWeightedGraph0.getWeightOf(integer0, integer1);
		assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test01() throws Throwable {
		ArrayList<Locale.FilteringMode> arrayList0 = new ArrayList<Locale.FilteringMode>(0);
		Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
		arrayList0.add(locale_FilteringMode0);
		double[][] doubleArray0 = new double[0][2];
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((Iterable<Locale.FilteringMode>) arrayList0, doubleArray0);
			fail();

		} catch (IllegalArgumentException e) {

		}
	}

	@Test(timeout = 4000)
	public void test02() throws Throwable {
		double[][] doubleArray0 = new double[3][6];
		double[] doubleArray1 = new double[7];
		doubleArray1[0] = 0.965089;
		doubleArray0[0] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
		assertEquals(0.965089, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test03() throws Throwable {
		ArrayList<Locale.FilteringMode> arrayList0 = new ArrayList<Locale.FilteringMode>(0);
		double[][] doubleArray0 = new double[0][6];
		DenseWeightedGraph<Locale.FilteringMode> denseWeightedGraph0 = DenseWeightedGraph
				.from((Iterable<Locale.FilteringMode>) arrayList0, doubleArray0);
		Collection<Locale.FilteringMode> collection0 = denseWeightedGraph0.getNodes();
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void test04() throws Throwable {
		double[][] doubleArray0 = new double[7][0];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		// Undeclared exception!
		try {
			denseWeightedGraph0.getIncomingEdges(integer0);
			fail();

		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}

	@Test(timeout = 4000)
	public void test05() throws Throwable {
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((double[][]) null);
			fail();

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test06() throws Throwable {
		TreeSet<Object> treeSet0 = new TreeSet<Object>();
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((Iterable<Object>) treeSet0, (double[][]) null);
			fail();

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test07() throws Throwable {
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((Iterable<Object>) null, (double[][]) null);
			fail();

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test08() throws Throwable {
		TreeSet<Object> treeSet0 = new TreeSet<Object>();
		Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
		Weighted<String> weighted0 = Weighted.weighted("", 0.0);
		treeSet0.add(weighted0);
		NavigableSet<Object> navigableSet0 = treeSet0.headSet((Object) locale_FilteringMode0, false);
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((Iterable<Object>) navigableSet0, (double[][]) null);
			fail();

		} catch (ClassCastException e) {

		}
	}

	@Test(timeout = 4000)
	public void test09() throws Throwable {
		Vector<Locale.FilteringMode> vector0 = new Vector<Locale.FilteringMode>();
		TreeSet<Locale.FilteringMode> treeSet0 = new TreeSet<Locale.FilteringMode>(vector0);
		double[][] doubleArray0 = new double[1][8];
		Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
		treeSet0.add(locale_FilteringMode0);
		DenseWeightedGraph<Locale.FilteringMode> denseWeightedGraph0 = DenseWeightedGraph
				.from((Iterable<Locale.FilteringMode>) treeSet0, doubleArray0);
		assertNotNull(denseWeightedGraph0);
	}

	@Test(timeout = 4000)
	public void test10() throws Throwable {
		ArrayDeque<Object> arrayDeque0 = new ArrayDeque<Object>(0);
		double[][] doubleArray0 = new double[0][4];
		DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) arrayDeque0,
				doubleArray0);
		Collection<Weighted<Edge<Object>>> collection0 = denseWeightedGraph0.getIncomingEdges((Object) null);
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void test11() throws Throwable {
		double[][] doubleArray0 = new double[3][6];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		double double0 = denseWeightedGraph0.getWeightOf(integer0, (Integer) null);
		assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test12() throws Throwable {
		double[][] doubleArray0 = new double[0][4];
		LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
		DenseWeightedGraph<String> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<String>) linkedHashSet0,
				doubleArray0);
		double double0 = denseWeightedGraph0.getWeightOf((String) null, (String) null);
		assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test13() throws Throwable {
		double[][] doubleArray0 = new double[3][6];
		Class<Integer> class0 = Integer.class;
		ServiceLoader<Integer> serviceLoader0 = ServiceLoader.loadInstalled(class0);
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((Iterable<Integer>) serviceLoader0, doubleArray0);
			fail();

		} catch (IllegalArgumentException e) {

		}
	}

	@Test(timeout = 4000)
	public void test14() throws Throwable {
		double[][] doubleArray0 = new double[2][8];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		// Undeclared exception!
		try {
			denseWeightedGraph0.filterEdges((Predicate<Edge<Integer>>) null);
			fail();

		} catch (NullPointerException e) {

		}
	}

}
