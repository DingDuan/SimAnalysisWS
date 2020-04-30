package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedSet;

public class ChuLiuEdmondsTest {

	@Test(timeout = 4000)
	public void test00() throws Throwable {
		double[][] doubleArray0 = new double[2][2];
		double[] doubleArray1 = new double[7];
		doubleArray1[1] = (-0.5);
		doubleArray0[0] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds
				.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
		assertNotNull(weighted0);
	}

	@Test(timeout = 4000)
	public void test02() throws Throwable {
		HashSet<Edge<Object>> hashSet0 = new HashSet<Edge<Object>>();
		LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) null, (Set<Edge<Object>>) hashSet0,
					(Set<Edge<Object>>) linkedHashSet0);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test03() throws Throwable {
		ArrayDeque<Weighted<Edge<String>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<String>>>();
		LinkedList<Weighted<Edge<String>>> linkedList0 = new LinkedList<Weighted<Edge<String>>>(arrayDeque0);
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph
				.from((Iterable<Weighted<Edge<String>>>) linkedList0);
		LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
		Edge<String> edge0 = null;
		linkedHashSet0.add(edge0);
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) sparseWeightedGraph0,
					(Set<Edge<String>>) linkedHashSet0, (Set<Edge<String>>) linkedHashSet0);
			fail();

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test04() throws Throwable {
		double[][] doubleArray0 = new double[7][8];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		TreeMap<Edge<Integer>, ExclusiveEdge<Object>> treeMap0 = new TreeMap<Edge<Integer>, ExclusiveEdge<Object>>();
		Set<Edge<Integer>> set0 = treeMap0.keySet();
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, set0, set0);
			fail();

		} catch (ClassCastException e) {

		}
	}

	@Test(timeout = 4000)
	public void test05() throws Throwable {
		double[][] doubleArray0 = new double[2][1];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0,
					(Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) hashSet0);
			fail();

		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}

	@Test(timeout = 4000)
	public void test07() throws Throwable {
		double[][] doubleArray0 = new double[7][1];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, integer0);
			fail();

		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}

	@Test(timeout = 4000)
	public void test08() throws Throwable {
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Edge<Weighted<Edge<String>>>>) null);
			fail();

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test09() throws Throwable {
		double[][] doubleArray0 = new double[6][3];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
			fail();

		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}

	@Test(timeout = 4000)
	public void test10() throws Throwable {
		ArrayDeque<Weighted<Edge<Edge<Locale.Category>>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Edge<Locale.Category>>>>();
		SparseWeightedGraph<Edge<Locale.Category>> sparseWeightedGraph0 = SparseWeightedGraph
				.from((Iterable<Weighted<Edge<Edge<Locale.Category>>>>) arrayDeque0);
		ChuLiuEdmonds.PartialSolution<Edge<Locale.Category>> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution
				.initialize((WeightedGraph<Edge<Locale.Category>>) sparseWeightedGraph0);
		Set<Edge<Locale.Category>> set0 = chuLiuEdmonds_PartialSolution0.getNodes();
		assertTrue(set0.isEmpty());
	}

	@Test(timeout = 4000)
	public void test11() throws Throwable {
		ArrayList<String> arrayList0 = new ArrayList<String>(0);
		Comparator<Object> comparator0 = null;
		TreeSet<Weighted<Edge<String>>> treeSet0 = new TreeSet<Weighted<Edge<String>>>(comparator0);
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) arrayList0,
				(Iterable<Weighted<Edge<String>>>) treeSet0);
		ChuLiuEdmonds.PartialSolution<String> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution
				.initialize((WeightedGraph<String>) sparseWeightedGraph0);
		Optional<ExclusiveEdge<String>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge("");
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void test12() throws Throwable {
		ArrayList<String> arrayList0 = new ArrayList<String>(0);
		Comparator<Object> comparator0 = null;
		TreeSet<Weighted<Edge<String>>> treeSet0 = new TreeSet<Weighted<Edge<String>>>(comparator0);
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) arrayList0,
				(Iterable<Weighted<Edge<String>>>) treeSet0);
		ChuLiuEdmonds.PartialSolution<String> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution
				.initialize((WeightedGraph<String>) sparseWeightedGraph0);
		Arborescence<String> arborescence0 = Arborescence.empty();
		Optional<ExclusiveEdge<String>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge("", arborescence0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void test13() throws Throwable {
		double[][] doubleArray0 = new double[8][6];
		double[] doubleArray1 = new double[9];
		doubleArray1[0] = Double.NEGATIVE_INFINITY;
		doubleArray0[0] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		// Undeclared exception!
		try {
			ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);
			fail();

		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}

	@Test(timeout = 4000)
	public void test14() throws Throwable {
		Stack<Weighted<Edge<Locale.Category>>> stack0 = new Stack<Weighted<Edge<Locale.Category>>>();
		SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph
				.from((Iterable<Weighted<Edge<Locale.Category>>>) stack0);
		HashSet<Edge<Locale.Category>> hashSet0 = new HashSet<Edge<Locale.Category>>();
		Weighted<Arborescence<Locale.Category>> weighted0 = ChuLiuEdmonds.getMaxArborescence(
				(WeightedGraph<Locale.Category>) sparseWeightedGraph0, (Set<Edge<Locale.Category>>) hashSet0,
				(Set<Edge<Locale.Category>>) hashSet0);
		assertNotNull(weighted0);
	}

	@Test(timeout = 4000)
	public void test15() throws Throwable {
		Integer integer0 = new Integer(0);
		ImmutableSortedMap<Integer, String> immutableSortedMap0 = ImmutableSortedMap.of(integer0, "");
		ImmutableSortedSet<Integer> immutableSortedSet0 = immutableSortedMap0.keySet();
		TreeSet<Integer> treeSet0 = new TreeSet<Integer>((SortedSet<Integer>) immutableSortedSet0);
		Vector<Weighted<Edge<Integer>>> vector0 = new Vector<Weighted<Edge<Integer>>>(0, 0);
		SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Integer>) treeSet0,
				(Iterable<Weighted<Edge<Integer>>>) vector0);
		Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds
				.getMaxArborescence((WeightedGraph<Integer>) sparseWeightedGraph0, integer0);
		assertNotNull(weighted0);
	}

	@Test(timeout = 4000)
	public void test16() throws Throwable {
		ChuLiuEdmonds chuLiuEdmonds0 = new ChuLiuEdmonds();
	}

}
