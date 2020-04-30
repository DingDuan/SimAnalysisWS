package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;

public class KBestArborescencesTest {

	@Test(timeout = 4000)
	public void test00() throws Throwable {
		Double double0 = new Double(0.0);
		Edge<Double> edge0 = new Edge<Double>(double0, double0);
		Arborescence<Double> arborescence0 = Arborescence.empty();
		Weighted<Arborescence<Double>> weighted0 = new Weighted<Arborescence<Double>>(arborescence0, 0.0);
		HashSet<Edge<Double>> hashSet0 = new HashSet<Edge<Double>>();
		HashSet<Edge<Double>> hashSet1 = new HashSet<Edge<Double>>();
		KBestArborescences.SubsetOfSolutions<Double> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Double>(
				edge0, weighted0, hashSet0, hashSet1);
		assertNotNull(kBestArborescences_SubsetOfSolutions0);
	}

	@Test(timeout = 4000)
	public void test01() throws Throwable {
		HashSet<Weighted<Edge<KBestArborescences.SubsetOfSolutions<Double>>>> hashSet0 = new HashSet<Weighted<Edge<KBestArborescences.SubsetOfSolutions<Double>>>>();
		SparseWeightedGraph<KBestArborescences.SubsetOfSolutions<Double>> sparseWeightedGraph0 = SparseWeightedGraph
				.from((Iterable<Weighted<Edge<KBestArborescences.SubsetOfSolutions<Double>>>>) hashSet0);
		HashSet<Edge<KBestArborescences.SubsetOfSolutions<Double>>> hashSet1 = new HashSet<Edge<KBestArborescences.SubsetOfSolutions<Double>>>();
		HashSet<Edge<KBestArborescences.SubsetOfSolutions<Double>>> hashSet2 = new HashSet<Edge<KBestArborescences.SubsetOfSolutions<Double>>>();
		Arborescence<KBestArborescences.SubsetOfSolutions<Double>> arborescence0 = Arborescence.empty();
		Weighted<Arborescence<KBestArborescences.SubsetOfSolutions<Double>>> weighted0 = Weighted
				.weighted(arborescence0, 0.0);
		Optional<Weighted<KBestArborescences.SubsetOfSolutions<KBestArborescences.SubsetOfSolutions<Double>>>> optional0 = KBestArborescences
				.scoreSubsetOfSolutions(
						(WeightedGraph<KBestArborescences.SubsetOfSolutions<Double>>) sparseWeightedGraph0,
						(Set<Edge<KBestArborescences.SubsetOfSolutions<Double>>>) hashSet1,
						(Set<Edge<KBestArborescences.SubsetOfSolutions<Double>>>) hashSet2, weighted0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void test02() throws Throwable {
		ArrayList<Weighted<Edge<Locale.FilteringMode>>> arrayList0 = new ArrayList<Weighted<Edge<Locale.FilteringMode>>>();
		SparseWeightedGraph<Locale.FilteringMode> sparseWeightedGraph0 = SparseWeightedGraph
				.from((Iterable<Weighted<Edge<Locale.FilteringMode>>>) arrayList0);
		Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
		List<Weighted<Arborescence<Locale.FilteringMode>>> list0 = KBestArborescences.getKBestArborescences(
				(WeightedGraph<Locale.FilteringMode>) sparseWeightedGraph0, locale_FilteringMode0, 3);
		assertFalse(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void test03() throws Throwable {
		Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
		Edge<Locale.FilteringMode> edge0 = new Edge<Locale.FilteringMode>(locale_FilteringMode0, locale_FilteringMode0);
		ArrayList<Edge<Locale.FilteringMode>> arrayList0 = new ArrayList<Edge<Locale.FilteringMode>>(0);
		ExclusiveEdge<Locale.FilteringMode> exclusiveEdge0 = ExclusiveEdge.of(edge0,
				(List<Edge<Locale.FilteringMode>>) arrayList0, (double) 0);
		Arborescence<Locale.FilteringMode> arborescence0 = Arborescence.empty();
		// Undeclared exception!
		try {
			KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<Locale.FilteringMode>) null);
			fail();

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test04() throws Throwable {
		LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
		Arborescence<String> arborescence0 = Arborescence.empty();
		Weighted<Arborescence<String>> weighted0 = new Weighted<Arborescence<String>>(arborescence0, 0.0);
		// Undeclared exception!
		try {
			KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<String>) null, (Set<Edge<String>>) linkedHashSet0,
					(Set<Edge<String>>) linkedHashSet0, weighted0);
			fail();

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test06() throws Throwable {
		double[][] doubleArray0 = new double[6][9];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>();
		Integer integer0 = new Integer(3);
		Integer integer1 = new Integer(0);
		Integer integer2 = new Integer(1);
		ImmutableSortedMap<Integer, Integer> immutableSortedMap0 = ImmutableSortedMap.of(integer0, integer0, integer1,
				integer2, integer2, integer2);
		Arborescence<Integer> arborescence0 = Arborescence.of((ImmutableMap<Integer, Integer>) immutableSortedMap0);
		Weighted<Arborescence<Integer>> weighted0 = Weighted.weighted(arborescence0, 0.0);
		// Undeclared exception!
		try {
			KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0,
					(Set<Edge<Integer>>) treeSet0, (Set<Edge<Integer>>) treeSet0, weighted0);
			fail();

		} catch (ClassCastException e) {

		}
	}

	@Test(timeout = 4000)
	public void test07() throws Throwable {
		double[][] doubleArray0 = new double[8][0];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
		Arborescence<Integer> arborescence0 = Arborescence.empty();
		Weighted<Arborescence<Integer>> weighted0 = Weighted.weighted(arborescence0, 0.0);
		// Undeclared exception!
		try {
			KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0,
					(Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) hashSet0, weighted0);
			fail();

		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}

	@Test(timeout = 4000)
	public void test08() throws Throwable {
		// Undeclared exception!
		try {
			KBestArborescences.getKBestArborescences((WeightedGraph<String>) null, "", 0);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test09() throws Throwable {
		Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
		Edge<Locale.FilteringMode> edge0 = new Edge<Locale.FilteringMode>(locale_FilteringMode0, locale_FilteringMode0);
		ExclusiveEdge<Locale.FilteringMode> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
		Arborescence<Locale.FilteringMode> arborescence0 = Arborescence.empty();
		ArrayDeque<Locale.FilteringMode> arrayDeque0 = new ArrayDeque<Locale.FilteringMode>();
		Partition<Locale.FilteringMode> partition0 = Partition
				.singletons((Collection<Locale.FilteringMode>) arrayDeque0);
		EdgeQueueMap.EdgeQueue<Locale.FilteringMode> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue
				.create(locale_FilteringMode0, partition0);
		Optional<ExclusiveEdge<Locale.FilteringMode>> optional0 = KBestArborescences.seek(exclusiveEdge0, arborescence0,
				(EdgeQueueMap.EdgeQueue<Locale.FilteringMode>) edgeQueueMap_EdgeQueue0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void test10() throws Throwable {
		Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
		EnumSet<Locale.FilteringMode> enumSet0 = EnumSet.of(locale_FilteringMode0, locale_FilteringMode0,
				locale_FilteringMode0, locale_FilteringMode0);
		Comparator<Object> comparator0 = null;
		TreeSet<Weighted<Edge<Locale.FilteringMode>>> treeSet0 = new TreeSet<Weighted<Edge<Locale.FilteringMode>>>(
				comparator0);
		SparseWeightedGraph<Locale.FilteringMode> sparseWeightedGraph0 = SparseWeightedGraph.from(
				(Iterable<Locale.FilteringMode>) enumSet0, (Iterable<Weighted<Edge<Locale.FilteringMode>>>) treeSet0);
		List<Weighted<Arborescence<Locale.FilteringMode>>> list0 = KBestArborescences.getKBestArborescences(
				(WeightedGraph<Locale.FilteringMode>) sparseWeightedGraph0, locale_FilteringMode0, 2);
		assertEquals(1, list0.size());
	}

	@Test(timeout = 4000)
	public void test11() throws Throwable {
		ArrayList<Weighted<Edge<Locale.FilteringMode>>> arrayList0 = new ArrayList<Weighted<Edge<Locale.FilteringMode>>>();
		SparseWeightedGraph<Locale.FilteringMode> sparseWeightedGraph0 = SparseWeightedGraph
				.from((Iterable<Weighted<Edge<Locale.FilteringMode>>>) arrayList0);
		Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
		List<Weighted<Arborescence<Locale.FilteringMode>>> list0 = KBestArborescences.getKBestArborescences(
				(WeightedGraph<Locale.FilteringMode>) sparseWeightedGraph0, locale_FilteringMode0, 1);
		assertFalse(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void test12() throws Throwable {
		KBestArborescences kBestArborescences0 = new KBestArborescences();
	}

	@Test(timeout = 4000)
	public void test13() throws Throwable {
		Vector<Weighted<Edge<Double>>> vector0 = new Vector<Weighted<Edge<Double>>>(0);
		SparseWeightedGraph<Double> sparseWeightedGraph0 = SparseWeightedGraph
				.from((Iterable<Weighted<Edge<Double>>>) vector0);
		Double double0 = new Double(0.0);
		List<Weighted<Arborescence<Double>>> list0 = KBestArborescences
				.getKBestArborescences((WeightedGraph<Double>) sparseWeightedGraph0, double0, 0);
		assertEquals(0, list0.size());
	}

}
