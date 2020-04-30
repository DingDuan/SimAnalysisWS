package net.mooctest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import net.mooctest.Edge.EdgeBuilder;
import static org.junit.Assert.*;

public class TestFibonacciHeap {

	@Test(timeout = 4000)
	public void test() {
		FibonacciHeap<Integer, Integer> heap = FibonacciHeap.create();

	}

	@Test(timeout = 4000)
	public void testEdge() {
		Edge<String> edge1 = new Edge<String>("1", "2");
		Edge<String> edge11 = new Edge<String>("1", "2");
		Edge<String> edge2 = new Edge<String>("2", "2");
		Edge<String> edge3 = new Edge<String>("1", "1");
		Edge<String> edge4 = new Edge<String>("2", "1");

		assertEquals("Edge{source=1, destination=2}", edge1.toString());
		assertTrue(edge1.equals(edge1));
		assertTrue(edge11.equals(edge1));
		assertFalse(edge1.equals(1));
		assertFalse(edge1.equals(null));
		assertFalse(edge1.equals(edge2));
		assertFalse(edge1.equals(edge3));
		assertEquals(2530, edge1.hashCode());
		edge1.hasDestination("1");
		edge1.hasDestination("2");
		Set<Edge<String>> edges = new HashSet<Edge<String>>();
		edge1 = new Edge<String>("1", "2");
		edge2 = new Edge<String>("2", "3");
		edge3 = new Edge<String>("3", "1");
		edges.add(edge1);
		edges.add(edge2);
		edges.add(edge3);
		Edge.competesWith(edges);
		Edge.isAutoCycle();
		Edge.isIn(edges);

		List<Edge<String>> list = new ArrayList<Edge<String>>();
		list.add(edge3);
		list.add(edge2);
		list.add(edge1);

		ExclusiveEdge<String> e1 = ExclusiveEdge.of(edge1, 1);
		ExclusiveEdge<String> e2 = ExclusiveEdge.of(edge1, 20);
		assertEquals(-1, e1.compareTo(e2));
		assertEquals(1, e2.compareTo(e1));

	}

	@Test(timeout = 4000)
	public void testExclusiveEdge() {
		Edge<String> edge1 = new Edge<String>("1", "2");
		Edge<String> edge2 = new Edge<String>("2", "3");
		Edge<String> edge3 = new Edge<String>("3", "1");

		Pair<Integer, Integer> p1 = new Pair<Integer, Integer>(1, 2);
		assertEquals(994, p1.hashCode());
		assertEquals("Pair{first=1, second=2}", p1.toString());
		Pair<Integer, Integer> p2 = Pair.of(1, 2);
		Pair<Integer, Integer> p22 = Pair.of(2, 2);
		Pair<Integer, Integer> p222 = Pair.of(1, 1);
		assertEquals((Integer) 1, p1.first);
		assertEquals((Integer) 2, p1.second);
		assertTrue(p1.equals(p2));
		assertFalse(p1.equals(1));
		assertFalse(p1.equals(p22));
		assertFalse(p1.equals(p222));
	}

	@Test(timeout = 4000)
	public void testPartition() {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(3);
		integers.add(2);
		integers.add(4);
		Partition<Integer> pi = Partition.singletons(integers);
		assertEquals((Integer) 1, pi.componentOf(1));
		assertEquals((Integer) 2, pi.componentOf(2));
		assertTrue(pi.sameComponent(1, 1));
		assertFalse(pi.sameComponent(1, 2));
		assertEquals(4, pi.getNodes().size());
		assertEquals((Integer) 1, pi.merge(1, 4));
		assertEquals((Integer) 1, pi.merge(2, 1));
		assertEquals((Integer) 1, pi.merge(2, 3));
		assertEquals((Integer) 1, pi.merge(2, 2));
	}

	@Test(timeout = 4000)
	public void testWeighted() {
		Weighted<Integer> wi1 = Weighted.weighted(123, 100.1);
		Weighted<Integer> wi11 = Weighted.weighted(123, 100.1);
		Weighted<Integer> wi21 = Weighted.weighted(123, 1010.1);
		Weighted<Integer> wi2 = Weighted.weighted(333, 121.1);
		assertEquals(1, wi1.compareTo(wi2));
		assertEquals(-1, wi2.compareTo(wi1));
		assertEquals(641692326, wi1.hashCode());
		assertEquals("Weighted{val=333, weight=121.1}", wi2.toString());
		assertTrue(wi1.equals(wi11));
		assertFalse(wi1.equals(wi2));
		assertFalse(wi1.equals(1));
		assertFalse(wi1.equals(wi21));
		
		Edge<Integer> edge0 = new Edge<Integer>(0,1);
		Edge<Integer> edge1 = new Edge<Integer>(1,2);
		Edge<Integer> edge2 = new Edge<Integer>(2,3);
		Edge<Integer> edge3 = new Edge<Integer>(3,1);
		Weighted<Edge<Integer>> w1 = Weighted.weighted(edge1, 1);
		Weighted<Edge<Integer>> w2 = Weighted.weighted(edge2, 4);
		Weighted<Edge<Integer>> w3 = Weighted.weighted(edge3, 2);
		Weighted<Edge<Integer>> w4 = Weighted.weighted(edge0, 6);
		Set<Weighted<Edge<Integer>>> set = new HashSet<Weighted<Edge<Integer>>>();
		set.add(w4);
		set.add(w3);
		set.add(w2);
		set.add(w1); 
				
		
	}

	@Test(timeout = 4000)
	public void testArborescence() {
		Edge<Integer> edge1 = new Edge<Integer>(2, 1);
		Edge<Integer> edge11 = new Edge<Integer>(1, 2);
		Edge<Integer> edge2 = new Edge<Integer>(2, 5);

		Map<Integer, Integer> map = new ImmutableMap.Builder<Integer, Integer>()
				.put(1, 2).put(2, 3).put(3, 1).build();
		;
		Map<Integer, Integer> map1 = new ImmutableMap.Builder<Integer, Integer>()
				.put(1, 2).put(2, 3).put(3, 1).build();
		;
		Map<Integer, Integer> map2 = new ImmutableMap.Builder<Integer, Integer>()
				.put(1, 2).put(2, 5).put(3, 1).build();
		;
		Map<Integer, Integer> map3 = new ImmutableMap.Builder<Integer, Integer>()
				.put(1, 2).put(2, 5).build();
		;
		Arborescence<Integer> ai = Arborescence
				.of((ImmutableMap<Integer, Integer>) map);
		Arborescence<Integer> ai1 = Arborescence
				.of((ImmutableMap<Integer, Integer>) map1);
		Arborescence<Integer> ai2 = Arborescence
				.of((ImmutableMap<Integer, Integer>) map2);
		Arborescence<Integer> ai3 = Arborescence
				.of((ImmutableMap<Integer, Integer>) map3);
		assertEquals("Arborescence{2 -> 1, 3 -> 2, 1 -> 3}", ai.toString());
		assertTrue(ai.contains(edge1));
		assertFalse(ai.contains(edge2));
		assertFalse(ai.contains(edge11));
		assertTrue(ai.equals(ai));
		assertTrue(ai.equals(ai1));
		assertFalse(ai.equals(null));
		assertFalse(ai.equals(123));
		assertFalse(ai.equals(ai2));
		assertFalse(ai.equals(ai3));
		assertEquals(37, ai.hashCode());
		assertEquals("Arborescence{}", ai.empty().toString());
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph() {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		Iterator<Integer> iterator = integers.iterator();
		double[][] values = { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 },
				{ 1, 0, 0, 0 } };
		DenseWeightedGraph<Integer> graph = DenseWeightedGraph.from(values);
		assertEquals(4,graph.getNodes().size());
		assertEquals(Double.NEGATIVE_INFINITY,graph.getWeightOf(100, 123),0.01);
		assertEquals(Double.NEGATIVE_INFINITY,graph.getWeightOf(4, 1),0.01);
		assertEquals(Double.NEGATIVE_INFINITY,graph.getWeightOf(1, -1),0.01);
		assertEquals(1.0,graph.getWeightOf(0, 1),0.01);
		assertEquals(1.0,graph.getWeightOf(1, 2),0.01);
		assertEquals(1.0,graph.getWeightOf(2, 3),0.01);
		assertEquals("[Weighted{val=Edge{source=0, destination=2}, weight=0.0}, Weighted{val=Edge{source=1, destination=2}, weight=1.0}, Weighted{val=Edge{source=2, destination=2}, weight=0.0}, Weighted{val=Edge{source=3, destination=2}, weight=0.0}]",graph.getIncomingEdges(2).toString());
		assertEquals("[]",graph.getIncomingEdges(4).toString());
		
		Set<Edge<String>> edges = new HashSet<Edge<String>>();
		Edge<String> edge0 = new Edge<String>("0", "1");
		Edge<String> edge1 = new Edge<String>("1", "2");
		Edge<String> edge2 = new Edge<String>("2", "3");
		Edge<String> edge3 = new Edge<String>("3", "1");
		edges.add(edge0);
		edges.add(edge1);
		edges.add(edge2);
		edges.add(edge3);
		graph.from(values);
		assertEquals(1.0,graph.getWeightOf(0, 1),0.1);
		assertEquals(Double.NEGATIVE_INFINITY,graph.getWeightOf(0, 10),0.1);
		assertEquals(Double.NEGATIVE_INFINITY,graph.getWeightOf(10, 0),0.1);
		assertEquals("Weighted{val=Arborescence{2 -> 3, 1 -> 2, 0 -> 1, 3 -> 0}, weight=4.0}",ChuLiuEdmonds.getMaxArborescence(graph).toString());
		assertEquals("Weighted{val=Arborescence{2 -> 3, 1 -> 2, 3 -> 0}, weight=3.0}",ChuLiuEdmonds.getMaxArborescence(graph,1).toString());
		KBestArborescences.getKBestArborescences(graph,0,1);
	}
}
