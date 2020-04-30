package net.mooctest;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.junit.Test;
import com.google.common.collect.*;

import com.google.common.base.Optional;
import static com.google.common.collect.DiscreteDomain.integers;
import static com.google.common.collect.Range.closedOpen;


import static  net.mooctest.Weighted.weighted;
import static org.junit.Assert.*;

public class TestFibonacciHeap {

	final static double DELTA = 0.001;
	final static double NINF = Double.NEGATIVE_INFINITY;
	final static WeightedGraph<Integer> graph = SparseWeightedGraph.from(ImmutableList.of(
			weighted(Edge.from(0).to(1), 5),
			weighted(Edge.from(0).to(2), 1),
			weighted(Edge.from(0).to(3), 1),
			weighted(Edge.from(1).to(2), 11),
			weighted(Edge.from(1).to(3), 4),
			weighted(Edge.from(2).to(1), 10),
			weighted(Edge.from(2).to(3), 5),
			weighted(Edge.from(3).to(1), 9),
			weighted(Edge.from(3).to(2), 8)
	));

	static <V> void assertEdgesSumToScore(WeightedGraph<V> originalEdgeWeights, Weighted<Arborescence<V>> bestTree) {
		final Map<V, V> parentsMap = bestTree.val.parents;
		double sumOfWeights = 0.0;
		for (V dest : parentsMap.keySet()) {
			final V source = parentsMap.get(dest);
			sumOfWeights += originalEdgeWeights.getWeightOf(source, dest);
		}
		assertEquals(sumOfWeights, bestTree.weight, DELTA);
	}
	
	

	@Test
	public void testGetMaxSpanningTree() {
		/*
		root    10
		(0) -------> (1) \
		 |  \       /  ^  \
		 |   \30   |   |20 \
		 |10  \    |10 |    \10
		 |     \   |  /      \
		 V  15  V  V /   20   V
		(3)<----- (2) -----> (4)
		  \-------^
		     40
		 */
		double[][] weights = {
				{NINF, 10, 30, 10, NINF},
				{NINF, NINF, 10, NINF, 10 },
				{NINF,  20, NINF,  7, 20 },
				{NINF, NINF, 40, NINF, NINF},
				{NINF, NINF, NINF, NINF, NINF},
		};
		final DenseWeightedGraph<Integer> graph = DenseWeightedGraph.from(weights);
		final Weighted<Arborescence<Integer>> weightedSpanningTree = ChuLiuEdmonds.getMaxArborescence(graph, 0);
		/*
		root
		(0)           (1)
		 |             ^
		 |             |
		 |             |
		 |            /
		 V           /
		(3)       (2) ------> (4)
		  \-------^
		 */
		final Map<Integer, Integer> maxBranching = weightedSpanningTree.val.parents;
		assertEquals(2, maxBranching.get(1).intValue());
		assertEquals(3, maxBranching.get(2).intValue());
		assertEquals(0, maxBranching.get(3).intValue());
		assertEquals(2, maxBranching.get(4).intValue());
		assertEquals(90.0, weightedSpanningTree.weight, DELTA);
		assertEdgesSumToScore(graph, weightedSpanningTree);
		assertEquals(false, maxBranching.equals(0));
	}

	@Test
	public void testRequiredAndBannedEdges() {
		final Weighted<Arborescence<Integer>> weightedSpanningTree = ChuLiuEdmonds.getMaxArborescence(
				graph,
				ImmutableSet.of(Edge.from(0).to(1)),
				ImmutableSet.of(Edge.from(2).to(3)));
		final Map<Integer, Integer> maxBranching = weightedSpanningTree.val.parents;
		assertEquals(0, maxBranching.get(1).intValue());
		assertEquals(1, maxBranching.get(2).intValue());
		assertEquals(1, maxBranching.get(3).intValue());
		assertEquals(20.0, weightedSpanningTree.weight, DELTA);
		assertEdgesSumToScore(graph, weightedSpanningTree);
		assertEquals("Weighted{val=Arborescence{1 -> 3, 1 -> 2, 0 -> 1}, weight=20.0}", weightedSpanningTree.toString());

	}

	@Test
	public void testRequiredAndBannedEdges2() {
		final Weighted<Arborescence<Integer>> weightedSpanningTree = ChuLiuEdmonds.getMaxArborescence(
				graph,
				ImmutableSet.of(Edge.from(0).to(3), Edge.from(3).to(1)),
				ImmutableSet.of(Edge.from(1).to(2))
		);
		final Map<Integer, Integer> maxBranching = weightedSpanningTree.val.parents;
		assertEquals(3, maxBranching.get(1).intValue());
		assertEquals(3, maxBranching.get(2).intValue());
		assertEquals(0, maxBranching.get(3).intValue());
		assertEquals(18.0, weightedSpanningTree.weight, DELTA);
		assertEdgesSumToScore(graph, weightedSpanningTree);

	}

	@Test
	public void testElevenNodeGraph() {
		// make a graph with a bunch of nested cycles so we can exercise the recursive part of the algorithm.
		final WeightedGraph<Integer> graph = SparseWeightedGraph.from(ImmutableList.of(
				weighted(Edge.from(0).to(8), 0),
				weighted(Edge.from(1).to(2), 10),
				weighted(Edge.from(1).to(4), 5),
				weighted(Edge.from(2).to(3), 9),
				weighted(Edge.from(3).to(1), 8),
				weighted(Edge.from(4).to(5), 9),
				weighted(Edge.from(5).to(6), 10),
				weighted(Edge.from(6).to(4), 8),
				weighted(Edge.from(6).to(7), 5),
				weighted(Edge.from(7).to(8), 10),
				weighted(Edge.from(8).to(2), 5),
				weighted(Edge.from(8).to(9), 8),
				weighted(Edge.from(8).to(10), 1),
				weighted(Edge.from(9).to(7), 9),
				weighted(Edge.from(10).to(3), 3)
		));
		final Weighted<Arborescence<Integer>> weightedSpanningTree = ChuLiuEdmonds.getMaxArborescence(graph, 0);

		final Map<Integer, Integer> maxBranching = weightedSpanningTree.val.parents;
		assertEdgesSumToScore(graph, weightedSpanningTree);
		assertEquals(3, maxBranching.get(1).intValue());
		assertEquals(8, maxBranching.get(2).intValue());
		assertEquals(2, maxBranching.get(3).intValue());
		assertEquals(1, maxBranching.get(4).intValue());
		assertEquals(4, maxBranching.get(5).intValue());
		assertEquals(5, maxBranching.get(6).intValue());
		assertEquals(9, maxBranching.get(7).intValue());
		assertEquals(0, maxBranching.get(8).intValue());
		assertEquals(8, maxBranching.get(9).intValue());
		assertEquals(8, maxBranching.get(10).intValue());
		
		assertEquals(10, graph.getWeightOf(1, 2),0);
		
	}
	
	private final static ImmutableSet<Edge<Integer>> empty = ImmutableSet.of();
	// tied for first, can appear in either order
	private final static Weighted<Arborescence<Integer>> bestA = weighted(Arborescence.of(ImmutableMap.of(
			1, 0,
			2, 1,
			3, 2
	)), 21);
	private final static Weighted<Arborescence<Integer>> bestB = weighted(Arborescence.of(ImmutableMap.of(
			1, 3,
			2, 1,
			3, 0
	)), 21);
	final static Set<Weighted<Arborescence<Integer>>> expectedFirstAndSecond = ImmutableSet.of(bestA, bestB);

	@Test
	public void testGetKBestArborescences() {
		final List<Weighted<Arborescence<Integer>>> weightedSpanningTrees =
				KBestArborescences.getKBestArborescences(graph, 0, 4);

		assertEquals(4, ImmutableSet.copyOf(weightedSpanningTrees).size());

		Weighted<Arborescence<Integer>> weightedSpanningTree = weightedSpanningTrees.get(0);
		assertTrue(expectedFirstAndSecond.contains(weightedSpanningTree));
		assertEdgesSumToScore(graph, weightedSpanningTree);

		weightedSpanningTree = weightedSpanningTrees.get(1);
		assertTrue(expectedFirstAndSecond.contains(weightedSpanningTree));
		assertEdgesSumToScore(graph, weightedSpanningTree);

		weightedSpanningTree = weightedSpanningTrees.get(2);
		final Arborescence<Integer> expectedThird = Arborescence.of(ImmutableMap.of(
				1, 0,
				2, 1,
				3, 1));
		assertEquals(weighted(expectedThird, 20), weightedSpanningTree);
		assertEdgesSumToScore(graph, weightedSpanningTree);

		weightedSpanningTree = weightedSpanningTrees.get(3);
		final Arborescence<Integer> expectedFourth = Arborescence.of(ImmutableMap.of(
				1, 2,
				2, 3,
				3, 0));
		assertEquals(weighted(expectedFourth, 19.0), weightedSpanningTree);
		assertEdgesSumToScore(graph, weightedSpanningTree);
	}

	@Test
	public void testGetLotsOfKBest() {
		final int k = 100;
		final List<Weighted<Arborescence<Integer>>> kBestSpanningTrees =
				KBestArborescences.getKBestArborescences(graph, 0, k);
		final int size = kBestSpanningTrees.size();
		// make sure there are no more than k of them
		assertTrue(size <= k);
		// make sure they are in descending order
		for (int i = 0; i + 1 < size; i++) {
			assertTrue(kBestSpanningTrees.get(i).weight >= kBestSpanningTrees.get(i+1).weight);
		}
		for (Weighted<Arborescence<Integer>> spanningTree : kBestSpanningTrees) {
			assertEdgesSumToScore(graph, spanningTree);
		}
		// make sure they're all unique
		assertEquals(size, ImmutableSet.copyOf(kBestSpanningTrees).size());
	}

	@Test
	public void testSeekDoesntReturnAncestor() {
		final Weighted<Arborescence<Integer>> bestArborescence = bestA;
		final ExclusiveEdge<Integer> maxInEdge = ExclusiveEdge.of(Edge.from(1).to(2), 11.0);
		final EdgeQueueMap.EdgeQueue<Integer> edgeQueue =
				EdgeQueueMap.EdgeQueue.create(maxInEdge.edge.destination, Partition.singletons(graph.getNodes()));
		edgeQueue.addEdge(ExclusiveEdge.of(Edge.from(0).to(2), 1.0));
		edgeQueue.addEdge(ExclusiveEdge.of(Edge.from(3).to(2), 8.0));
		final Optional<ExclusiveEdge<Integer>> nextBestEdge =
				KBestArborescences.seek(maxInEdge, bestArborescence.val, edgeQueue);
		assertTrue(nextBestEdge.isPresent());
		// 3 -> 2 is an ancestor in bestArborescence, so seek should not return it
		assertNotEquals(Edge.from(3).to(2), nextBestEdge.get().edge);
		assertEquals(Edge.from(0).to(2), nextBestEdge.get().edge);
	}

	@Test
	public void testSeek() {
		final Arborescence<Integer> best = Arborescence.of(ImmutableMap.of(
				2, 0,
				1, 2,
				3, 2
		));
		final ExclusiveEdge<Integer> maxInEdge = ExclusiveEdge.of(Edge.from(2).to(1), 10.0);
		final EdgeQueueMap.EdgeQueue<Integer> edgeQueue =
				EdgeQueueMap.EdgeQueue.create(maxInEdge.edge.destination, Partition.singletons(graph.getNodes()));
		edgeQueue.addEdge(ExclusiveEdge.of(Edge.from(0).to(1), 5.0));
		edgeQueue.addEdge(ExclusiveEdge.of(Edge.from(3).to(1), 9.0));
		final Optional<ExclusiveEdge<Integer>> nextBestEdge = KBestArborescences.seek(maxInEdge, best, edgeQueue);
		assertTrue(nextBestEdge.isPresent());
		assertEquals(Edge.from(3).to(1), nextBestEdge.get().edge);
		assertEquals(9.0, nextBestEdge.get().weight, DELTA);
	}

	@Test
	public void testNext() {
		final Optional<Weighted<KBestArborescences.SubsetOfSolutions<Integer>>> oItem =
				KBestArborescences.scoreSubsetOfSolutions(graph, empty, empty, bestA);
		assertTrue(oItem.isPresent());
		final KBestArborescences.SubsetOfSolutions<Integer> item = oItem.get().val;
		assertEquals(Edge.from(0).to(1), item.edgeToBan);
		assertEquals(0.0, item.bestArborescence.weight - oItem.get().weight, DELTA);
	}

	@Test
	public void testNextWithRequiredEdges() {
		final Optional<Weighted<KBestArborescences.SubsetOfSolutions<Integer>>> oItem =
				KBestArborescences.scoreSubsetOfSolutions(graph, ImmutableSet.of(Edge.from(0).to(1)), empty, bestA);
		assertTrue(oItem.isPresent());
		final KBestArborescences.SubsetOfSolutions<Integer> item = oItem.get().val;
		assertEquals(Edge.from(2).to(3), item.edgeToBan);
		assertEquals(1.0, item.bestArborescence.weight - oItem.get().weight, DELTA);
	}

	@Test
	public void testNextReturnsAbsentWhenTreesAreExhausted() {
		final WeightedGraph<Integer> oneTreeGraph = SparseWeightedGraph.from(
				ImmutableSet.of(weighted(Edge.from(0).to(1), 1.0))
		);
		final Weighted<Arborescence<Integer>> best = ChuLiuEdmonds.getMaxArborescence(oneTreeGraph, 0);
		final Optional<Weighted<KBestArborescences.SubsetOfSolutions<Integer>>> pair =
				KBestArborescences.scoreSubsetOfSolutions(oneTreeGraph, empty, empty, best);
		assertFalse(pair.isPresent());
		assertEquals(false,pair.equals(0));
		assertEquals(true,pair.equals(pair));

	}
	
	@Test
	public void testEdge() {
		Edge<String> e1 = new Edge<String>(null, null);
		assertEquals("Edge{source=null, destination=null}", e1.toString());
		e1 = new Edge<String>("a", "b");
		Edge<String> e2 = new Edge<String>("a", "e");
		Edge<String> e3 = new Edge<String>("b", "b");
		Edge<Integer> e4 = new Edge<Integer>(2,3);
		assertEquals(false, e1.equals(null));
		assertEquals(false, e1.equals(0));
		assertEquals(true, e1.equals(e1));
		assertEquals(false, e1.equals(e2));
		assertEquals(false, e1.equals(e3));
		assertEquals(false, e1.equals(e4));
		assertEquals("Edge{source=a, destination=b}", e1.toString());

	}
	
	@Test
	public void testDecreasePriority() {
		// Inserts a set of elements, decreases some of their priorities, then
		// extracts them by key order and ensures everything comes out
		// in the order expected.
		final FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
		// keep references to entries as we add them so we can decreasePriority and remove
		final Map<Integer, FibonacciHeap<Integer,Integer>.Entry> entries = Maps.newHashMap();
		for (int i = 100; i < 200; i++) {
			entries.put(i, heap.add(i, i).get());
		}
		assertFalse(heap.isEmpty());
		assertEquals(100, heap.size());
		heap.decreasePriority(entries.get(110), 50);
		heap.decreasePriority(entries.get(140), 25);
		heap.decreasePriority(entries.get(160), 15);
		// Last one should be the min value.
		assertEquals(heap.peekOption().get(), entries.get(160));
		assertEquals(160, heap.pollOption().get().intValue());
		// Second last should now be the min value.
		assertEquals(heap.peekOption().get(), entries.get(140));
		heap.remove(entries.get(140));
		// Remove the third smallest entry.
		heap.remove(entries.get(110));
		// Original min value should now be the min.
		assertEquals(heap.peekOption().get(), entries.get(100));
		heap.clear();
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
	}

	@Test
	public void testDuplicates() {
		final FibonacciHeap<Integer,Double> heap = FibonacciHeap.create();
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
		// Insert entries with duplicate priorities.
		final double priority = Double.MIN_NORMAL;
		for (int i = 1; i < 1001; i++) {
			heap.add(i, priority);
		}
		assertFalse(heap.isEmpty());
		assertEquals(1000, heap.size());
		heap.pollOption();
		assertFalse(heap.isEmpty());
		assertEquals(999, heap.size());
		heap.clear();
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
	}

	@Test
	public void testDuplicatesLarger() {
		// Test a heap consisting of all duplicate priorities, except for one
		// whose value is greater than the others.
		final FibonacciHeap<Integer,Double> heap = FibonacciHeap.create();
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
		// Insert entries with duplicate priorities.
		final double priority = 0.0;
		for (int i = 1; i < 1000; i++) {
			heap.add(i, priority);
		}
		heap.add(1001, Double.MIN_NORMAL);
		assertFalse(heap.isEmpty());
		assertEquals(1000, heap.size());
		assertTrue(heap.pollOption().get() < 1001);
		assertFalse(heap.isEmpty());
		assertEquals(999, heap.size());
		heap.clear();
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
	}

	@Test
	public void testDuplicatesSmaller() {
		// Test a heap consisting of all duplicate priorities, except for one
		// whose value is less than the others.
		final FibonacciHeap<Integer,Double> heap = FibonacciHeap.create();
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
		// Insert entries with duplicate priorities.
		final double priority = Double.MIN_NORMAL;
		for (int i = 1; i < 1000; i++) {
			heap.add(i, priority);
		}
		heap.add(1001, 0.0);
		assertFalse(heap.isEmpty());
		assertEquals(1000, heap.size());
		assertEquals(1001, heap.pollOption().get().intValue());
		assertFalse(heap.isEmpty());
		assertEquals(999, heap.size());
		heap.clear();
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
	}

	@Test
	public void testUnion() {
		final FibonacciHeap<Integer,Integer> heap1 = FibonacciHeap.create();
		assertTrue(heap1.isEmpty());
		assertEquals(0, heap1.size());
		heap1.add(1, 1);
		heap1.add(2, 2);
		heap1.add(3, 3);
		heap1.add(4, 4);
		heap1.add(5, 5);
		assertFalse(heap1.isEmpty());
		assertEquals(5, heap1.size());
		final FibonacciHeap<Integer,Integer> heap2 = FibonacciHeap.create();
		assertTrue(heap2.isEmpty());
		assertEquals(0, heap2.size());
		heap2.add(6, 6);
		heap2.add(7, 7);
		heap2.add(8, 8);
		heap2.add(9, 9);
		heap2.add(10, 10);
		assertFalse(heap2.isEmpty());
		assertEquals(5, heap2.size());
		final FibonacciHeap<Integer,Integer> joined = FibonacciHeap.merge(heap1, heap2);
		assertFalse(joined.isEmpty());
		assertEquals(10, joined.size());
		Optional<Integer> oVal = joined.pollOption();
		int i = 1;
		assertTrue(oVal.get() == i);
		while (!joined.isEmpty()) {
			oVal = joined.pollOption();
			assertTrue(oVal.get() > i);
			i = oVal.get();
		}
		assertTrue(joined.isEmpty());
		assertEquals(0, joined.size());
	}

	@Test
	public void testMinComparison() {
		// Test case contributed by Travis Wheeler which exposed a problem
		// when the min pointer had not been adjusted even though the start
		// pointer had been moved during consolidate.
		final double[] values = {
				0.0834, 0.01187, 0.10279, 0.09835, 0.09883,
				0.1001, 0.1129, 0.09599, 0.09468, 0.09063,
				0.09083, 0.08194, 0.10182, 0.09323, 0.08796,
				0.09972, 0.09429, 0.08069, 0.09008, 0.10346,
				0.10594, 0.09416, 0.06915, 0.08638, 0.0886,
				0.09538, 0.08546, 0.09271, 0.0936, 0.09941,
				0.08026, 0.0952, 0.09446, 0.09309, 0.09855,
				0.08682, 0.09464, 0.0857, 0.09154, 0.08024,
				0.08824, 0.09442, 0.09495, 0.08731, 0.08428,
				0.08959, 0.07994, 0.08034, 0.09095, 0.09659,
				0.10066, 0.0821, 0.09606, 0.12346, 0.07866,
				0.07723, 0.08642, 0.08076, 0.07455, 0.07961,
				0.07364, 0.08911, 0.06946, 0.07509, 0.087,
				0.071, 0.08653, 0.07899, 0.09512, 0.09456,
				0.09161, 0.08412, 0.09649, 0.09994, 0.10151,
				0.09751, 0.1019, 0.10499, 0.0873, 0.1085,
				0.10189, 0.09987, 0.08912, 0.10606, 0.09552,
				0.08902, 0.09158, 0.08046, 0.10687, 0.0906,
				0.09937, 0.09737, 0.09825, 0.10234, 0.09926,
				0.09147, 0.09071, 0.09659, 0.09472, 0.09327,
				0.0949, 0.09316, 0.09393, 0.09328, 0.01187,
				0.00848, 0.02284, 0.03053, 0.08393, 0.08167,
				0.10191, 0.06527, 0.06613, 0.06863, 0.0652,
				0.06848, 0.06681, 0.07466, 0.06444, 0.05991,
				0.07031, 0.06612, 0.06873, 0.06598, 0.07283,
				0.06862, 0.06437, 0.06599, 0.07291, 0.06355,
				0.0685, 0.06599, 0.06593, 0.0869, 0.07364,
				0.08118, 0.07693, 0.06779, 0.06605, 0.07286,
				0.05655, 0.06352, 0.06105, 0.09177, 0.08312,
				0.0978, 0.07464, 0.07977, 0.06241, 0.07227,
				0.06255, 0.0675, 0.07953, 0.07806, 0.06702,
				0.08429, 0.08567, 0.0933, 0.087, 0.08809,
				0.07888, 0.06351, 0.08651, 0.08294, 0.07282,
				0.11102, 0.08711, 0.06192, 0.0652, 0.06957,
				0.06763, 0.07123, 0.0687, 0.06773, 0.06338,
				0.06694, 0.09871, 0.09221, 0.08962, 0.0879,
				0.09625, 0.09953, 0.09532, 0.09903, 0.0946,
				0.09406, 0.09704, 0.09877, 0.07257, 0.1001,
				0.09458, 0.10141, 0.10581, 0.09824, 0.10668,
				0.09835, 0.10816, 0.09667, 0.08962, 0.08486,
				0.08572, 0.08324, 0.08826, 0.08801, 0.09744,
				0.09916, 0.09996, 0.10054, 0.10761, 0.105,
				0.10604, 0.10161, 0.09155, 0.10162, 0.08549,
				0.10342, 0.09419, 0.11429, 0.09764, 0.09505,
				0.09394, 0.10411, 0.08792, 0.08887, 0.08648,
				0.07637, 0.08544, 0.08034, 0.12373, 0.12963,
				0.13817, 0.13904, 0.12648, 0.13207, 0.10788,
				0.09605, 0.12674, 0.08139, 0.08326, 0.08835,
				0.10922, 0.103, 0.12225, 0.09854, 0.09326,
				0.11181, 0.089, 0.12674, 0.11631, 0.0879,
				0.09866, 0.11393, 0.09839, 0.09738, 0.09922,
				0.1145, 0.09967, 0.1032, 0.11624, 0.10472,
				0.09999, 0.09762, 0.1075, 0.11558, 0.10482,
				0.10237, 0.10776, 0.08781, 0.08771, 0.09751,
				0.09025, 0.09201, 0.08731, 0.08537, 0.0887,
				0.0844, 0.0804, 0.08217, 0.10216, 0.07789,
				0.08693, 0.0833, 0.08542, 0.09729, 0.0937,
				0.09886, 0.092, 0.08392, 0.09668, 0.09444,
				0.09401, 0.08657, 0.09659, 0.08553, 0.0834,
				0.0846, 0.10167, 0.10447, 0.09838, 0.09545,
				0.09163, 0.10475, 0.09761, 0.09475, 0.09769,
				0.09873, 0.09033, 0.09202, 0.08637, 0.0914,
				0.09146, 0.09437, 0.08454, 0.09009, 0.08888,
				0.0811, 0.12672, 0.10517, 0.11959, 0.10941,
				0.10319, 0.10544, 0.10717, 0.11218, 0.12347,
				0.10637, 0.11558, 0.1198, 0.10133, 0.09795,
				0.10818, 0.11657, 0.10836, 0.11127, 0.09611,
				0.08462, 0.1056, 0.09537, 0.09815, 0.10385,
				0.10246, 0.11299, 0.11926, 0.104, 0.10309,
				0.09494, 0.10078, 0.09966, 0.08215, 0.09136,
				0.10058, 0.10078, 0.10121, 0.09711, 0.10072,
				0.10881, 0.09396, 0.09925, 0.09221, 0.0939,
				0.08804, 0.09234, 0.09647, 0.07966, 0.09939,
				0.09651, 0.10765, 0.10154, 0.07889, 0.10452,
				0.1023, 0.10275, 0.08817, 0.0923, 0.09237,
				0.09481, 0.09309, 0.08683, 0.09903, 0.08784,
				0.09309, 0.08876, 0.08442, 0.097, 0.10054,
				0.09463, 0.10038, 0.08208, 0.10209, 0.10181,
				0.10416, 0.08065, 0.09581, 0.08961, 0.08553,
				0.10272, 0.08432, 0.08437, 0.08946, 0.07594,
				0.07751, 0.07935, 0.07751, 0.07714, 0.09572,
				0.09626, 0.08606, 0.08031, 0.08196, 0.09758,
				0.0754, 0.08671, 0.10245, 0.07644, 0.07965,
				0.09553, 0.08362, 0.07587, 0.08234, 0.08611,
				0.09835, 0.09917, 0.09264, 0.09656, 0.0992,
				0.10802, 0.10905, 0.09726, 0.09911, 0.11056,
				0.08599, 0.09095, 0.10547, 0.08824, 0.09831,
				0.08445, 0.09562, 0.09378, 0.08482, 0.08686,
				0.09192, 0.09617, 0.09142, 0.1024, 0.10415,
				0.10673, 0.08337, 0.10091, 0.08162, 0.08284,
				0.08472, 0.1021, 0.09073, 0.10521, 0.09252,
				0.08545, 0.09849, 0.0891, 0.10849, 0.08897,
				0.08306, 0.10775, 0.10054, 0.09952, 0.10851,
				0.10823, 0.10827, 0.11254, 0.11344, 0.10478,
				0.11348, 0.10646, 0.12112, 0.10183, 0.1197,
				0.12399, 0.11847, 0.11572, 0.14614, 0.13348,
				0.12449, 0.12358, 0.12792, 0.12525, 0.12265,
				0.1305, 0.13037, 0.12684, 0.12374, 0.12907,
				0.12858, 0.1285, 0.12857, 0.15825, 0.15937,
				0.1467, 0.128305, 0.118165, 0.119619995, 0.117565,
				0.12769, 0.11013
		};
		final FibonacciHeap<Double,Double> heap = FibonacciHeap.create();
		for (double d : values) {
			heap.add(d, d);
		}
		Arrays.sort(values);
		int i = 0;
		while (!heap.isEmpty()) {
			assertEquals(values[i], heap.pollOption().get(), 0.0001);
			i++;
		}
	}
	
	@Test
	public void testIterator() {
		// insert lots of numbers in order
		final Set<Integer> values = ContiguousSet.create(closedOpen(0, 1000), integers());
		final FibonacciQueue<Integer> queue = FibonacciQueue.create();
		assertTrue(queue.addAll(values));
		assertEquals(values, ImmutableSet.copyOf(queue.iterator()));
		assertEquals(values, ImmutableSet.copyOf(queue));
	}

	@Test
	public void testLotsOfRandomInserts() {
		int lots = 50000;
		final FibonacciQueue<Integer> queue = FibonacciQueue.create();
		// Insert lots of random numbers.
		final ImmutableMultiset.Builder<Integer> insertedBuilder = ImmutableMultiset.builder();
		final Random random = new Random();
		for (int i = 0; i < lots; i++) {
			int r = random.nextInt();
			insertedBuilder.add(r);
			queue.add(r);
		}
		final Multiset<Integer> inserted = insertedBuilder.build();
		assertEquals(lots, queue.size());
		// Ensure it contains the same multiset of values that we put in
		assertEquals(inserted, ImmutableMultiset.copyOf(queue));
		// Ensure the numbers come out in increasing order.
		final List<Integer> polled = Lists.newLinkedList();
		while (!queue.isEmpty()) {
			polled.add(queue.poll());
		}
		assertTrue(Ordering.<Integer>natural().isOrdered(polled));
		// Ensure the same multiset of values came out that we put in
		assertEquals(inserted, ImmutableMultiset.copyOf(polled));
		assertEquals(0, queue.size());
	}
	
	@Test
	public void testPairequals() {
		Pair<String, String> aPair1 = new Pair<String, String>("a", "b");
		Pair<String, String> aPair2 = new Pair<String, String>("a", "d");
		Pair<Integer, Integer> aPair3 = new Pair<Integer, Integer>(1,2);
		assertEquals(false, aPair1.equals(1));
		assertEquals(true, aPair1.equals(aPair1));
		assertEquals(false, aPair1.equals(aPair2));
		assertEquals(false, aPair1.equals(aPair3));

		assertEquals("Pair{first=a, second=b}", aPair1.toString());
		assertEquals(4066, aPair1.hashCode());
	}
	
	
	@Test
	public void testWeightequals() {
		Weighted<String> w1 = new Weighted<String>("a", 1);
		Weighted<String> w2 = new Weighted<String>("a", 5);
		Weighted<Integer> w3 = new Weighted<Integer>(1, 1);

		
		assertEquals(false, w1.equals(1));
		assertEquals(true, w1.equals(w1));
		assertEquals(false, w1.equals(w2));
		assertEquals(false, w1.equals(w3));

		assertEquals("Weighted{val=a, weight=1.0}", w1.toString());
		assertEquals(1072697216, w1.hashCode());
	}
	
	@Test
	public void testEdgeequals() {

	}
}
