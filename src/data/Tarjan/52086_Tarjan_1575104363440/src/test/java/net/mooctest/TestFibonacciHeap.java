package net.mooctest;

import static java.lang.System.out;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

import com.google.common.base.Optional;

import net.mooctest.Edge.EdgeBuilder;
import net.mooctest.EdgeQueueMap.EdgeQueue;

public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer, Integer> heap = FibonacciHeap.create();

		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
		assertEquals("Ordering.natural().nullsFirst()", heap.comparator().toString());
		Optional<FibonacciHeap<Integer, Integer>.Entry> op = heap.add(2, 2);

		assertFalse(heap.isEmpty());
		heap.decreasePriority(op.get(), 1);

		heap.add(3, 4);
		heap.add(4, 5);
		heap.remove(op.get());

		Optional<FibonacciHeap<Integer, Integer>.Entry> oMinEntry = heap.peekOption();
		assertTrue(oMinEntry.isPresent());

		Optional<Integer> minEntry = heap.pollOption();
		assertEquals(Integer.valueOf(3), minEntry.get());

		FibonacciHeap<Integer, String> a = FibonacciHeap.create();
		FibonacciHeap<Integer, String> b = FibonacciHeap.create();
		a.add(2, "0");
		a.add(3, "0");
		a.add(4, "1");
		a.add(5, "1");
		a.add(6, "2");
		a.add(7, "3");
		a.add(8, "3");
		a.add(9, "4");

		b.add(12, "0");
		b.add(13, "0");
		b.add(14, "1");
		b.add(15, "1");

		FibonacciHeap<Integer, String> result = FibonacciHeap.merge(a, b);
		assertFalse(result.isEmpty());
		assertEquals(12, result.size());
		assertEquals(Integer.MAX_VALUE, FibonacciHeap.MAX_CAPACITY);
		assertEquals("Ordering.natural().nullsFirst()", result.comparator().toString());

		assertTrue(heap.iterator().hasNext());
		assertEquals(Integer.valueOf(4), heap.iterator().next().value);

		Optional<FibonacciHeap<Integer, String>.Entry> op2 = result.add(9, "5");

		try {
			result.decreasePriority(op2.get(), "8");
		} catch (IllegalArgumentException e) {
			assertEquals("Cannot increase priority", e.getMessage());
		}
		result.remove(result.peekOption().get());
		assertEquals(12, result.size());
		result.clear();
		assertEquals(0, result.size());
	}

	@Test(timeout = 4000)
	public void testWeighted() {
		Weighted<Integer> weighted = Weighted.weighted(1, 1);
		Weighted<Integer> weighted2 = Weighted.weighted(2, 2);

		assertEquals(1, weighted.compareTo(weighted2));
		assertEquals(-1, weighted2.compareTo(weighted));

		assertFalse(weighted.equals(Integer.valueOf(0)));
		assertFalse(weighted.equals(weighted2));
		assertTrue(weighted.equals(weighted));

		assertEquals(1072694240, weighted.hashCode());
		assertEquals(1073742847, weighted2.hashCode());
		assertFalse(weighted.hashCode() == weighted2.hashCode());
		assertFalse(weighted.toString().equals(weighted2.toString()));

	}

	@Test(timeout = 4000)
	public void testPartition() {
		Partition<Integer> partition = Partition.singletons(Arrays.asList(1, 2, 3));
		assertEquals(Integer.valueOf(2), partition.componentOf(2));
		assertEquals(Integer.valueOf(1), partition.merge(1, 2));
		assertTrue(partition.sameComponent(1, 1));
		assertTrue(partition.sameComponent(1, 2));
		assertFalse(partition.sameComponent(1, 3));
		assertEquals("[1, 2, 3]", partition.getNodes().toString());

		assertEquals(1, partition.merge(1, 3).intValue());

		EdgeQueueMap<Integer> map = new EdgeQueueMap<>(partition);
		EdgeQueue<Integer> queue = EdgeQueue.create(2, partition);
		assertEquals("[]", queue.edges.toString());
		assertEquals("{}", map.queueByDestination.toString());
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph() {
		double[][] weights = { { 1, 2 }, { 3, 4 } };
		DenseWeightedGraph<Integer> graph = DenseWeightedGraph.from(weights);
		assertEquals("-Infinity", String.valueOf(graph.getWeightOf(1, 2)));

		assertEquals("[0, 1]", graph.getNodes().toString());
		assertEquals("[]", graph.getIncomingEdges(2).toString());
	}

	@Test(timeout = 4000)
	public void testEdge() {
		Edge<Integer> e1 = new Edge<Integer>(1, 2);
		EdgeBuilder<Integer> builder = Edge.from(1);
		Edge<Integer> e2 = builder.to(2);
		assertEquals("Edge{source=1, destination=2}", e1.toString());
		assertEquals("Edge{source=1, destination=2}", e2.toString());
		assertFalse(e1.equals(null));
		assertFalse(e1.equals(Integer.valueOf(2)));
		assertTrue(e1.equals(e2));
		assertFalse(Edge.hasDestination(1).apply(e1));

		HashSet<Edge<Integer>> set = new HashSet<>();
		set.add(new Edge<Integer>(1, 2));
		set.add(new Edge<Integer>(2, 3));
		set.add(new Edge<Integer>(3, 4));

		assertFalse(Edge.competesWith(set).apply(e1));
		assertFalse(Edge.competesWith(set).apply(e2));
		assertFalse(Edge.isAutoCycle().apply(new Edge<Object>(1, 2)));
		assertTrue(Edge.isIn(set).apply(e1));
		assertTrue(Edge.isIn(set).apply(e2));
		assertFalse(Edge.isIn(set).apply(new Edge<Integer>(9, 9)));

	}

	@Test(timeout = 4000)
	public void testExclusiveEdge() {
		Edge<Integer> e1 = new Edge<Integer>(5, 6);
		Edge<Integer> e2 = new Edge<Integer>(7, 8);

		ExclusiveEdge<Integer> edge = ExclusiveEdge.of(e1, 5);
		ExclusiveEdge<Integer> edge2 = ExclusiveEdge.of(e1, Arrays.asList(e1, e2), 2);

		assertEquals(0, edge.compareTo(edge));
		assertEquals(0, edge.compareTo(edge));
		assertEquals(1, edge.compareTo(edge2));

	}

}
