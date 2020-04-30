package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.Collection;

import java.util.HashMap;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Predicate;

public class WeightedGraphTest {

	@Test(timeout = 4000)
	public void test0() throws Throwable {
		double[][] doubleArray0 = new double[7][4];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
		assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test2() throws Throwable {
		HashMap<String, String> hashMap0 = new HashMap<String, String>();
		Collection<String> collection0 = hashMap0.values();
		TreeSet<Weighted<Edge<String>>> treeSet0 = new TreeSet<Weighted<Edge<String>>>();
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) collection0,
				(Iterable<Weighted<Edge<String>>>) treeSet0);
		double double0 = sparseWeightedGraph0.getWeightOf("", "");
		assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test3() throws Throwable {
		Locale locale0 = new Locale("", "", "");
		Set<String> set0 = locale0.getUnicodeLocaleKeys();
		ArrayDeque<Weighted<Edge<String>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<String>>>();
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) set0,
				(Iterable<Weighted<Edge<String>>>) arrayDeque0);
		Collection<String> collection0 = sparseWeightedGraph0.getNodes();
		assertFalse(collection0.contains(""));
	}

	@Test(timeout = 4000)
	public void test4() throws Throwable {
		double[][] doubleArray0 = new double[0][2];
		Integer integer0 = new Integer(0);
		ArrayDeque<Integer> arrayDeque0 = new ArrayDeque<Integer>();
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Integer>) arrayDeque0,
				doubleArray0);
		Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void test5() throws Throwable {
		double[][] doubleArray0 = new double[8][7];
		double[] doubleArray1 = new double[1];
		doubleArray0[3] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(1);
		try {
			denseWeightedGraph0.getIncomingEdges(integer0);
			fail();

		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}

	@Test(timeout = 4000)
	public void test6() throws Throwable {
		double[][] doubleArray0 = new double[8][0];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		// Undeclared exception!
		try {
			denseWeightedGraph0.filterEdges((Predicate<Edge<Integer>>) null);
			fail();

		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}

	@Test(timeout = 4000)
	public void test7() throws Throwable {
		TreeSet<String> treeSet0 = new TreeSet<String>();
		treeSet0.add("-\u221E");
		PriorityQueue<Weighted<Edge<String>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<String>>>();
		Edge<String> edge0 = new Edge<String>("", "-\u221E");
		Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, 0);
		priorityQueue0.add(weighted0);
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) treeSet0,
				(Iterable<Weighted<Edge<String>>>) priorityQueue0);
		try {
			sparseWeightedGraph0.filterEdges((Predicate<Edge<String>>) null);
			fail();

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test8() throws Throwable {
		TreeSet<String> treeSet0 = new TreeSet<String>();
		treeSet0.add("");
		PriorityQueue<Weighted<Edge<String>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<String>>>();
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) treeSet0,
				(Iterable<Weighted<Edge<String>>>) priorityQueue0);
		WeightedGraph<String> weightedGraph0 = sparseWeightedGraph0.filterEdges((Predicate<Edge<String>>) null);
		assertNotNull(weightedGraph0);
	}

}
