package net.mooctest;
import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import net.mooctest.FibonacciHeap.Entry;



public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
	}
	
	@Test(timeout = 4000)
	public void test1() {
		List<Integer> nodes = new ArrayList();
		Map<Integer, Integer> indexOf = new HashMap();
		double[][] weights = new double[4][4];
		
		nodes.add(10);
		nodes.add(11);
		nodes.add(12);
		nodes.add(13);
		indexOf.put(10, 0);
		indexOf.put(11, 3);
		indexOf.put(12, 2);
		indexOf.put(13, 3);
		weights[0][0] = 3;
		weights[0][1] = 4;
		Integer root = 10;
		
		// 构造ac
		WeightedGraph<Integer> graph = DenseWeightedGraph.from(nodes, weights);
		ImmutableMap<Integer, Integer> immutableMap = ImmutableMap.of(13, 11, 12, 11, 11, 10);
		Arborescence<Integer> arborescence = Arborescence.of(immutableMap);
//		List<Weighted<Arborescence<V>>>
		Weighted<Arborescence<Integer>> acWeighted = new Weighted(arborescence, 4.0);
		List<Weighted<Arborescence<Integer>>> acList = new ArrayList<>();
		acList.add(acWeighted);
		
		assertEquals(acList, KBestArborescences.getKBestArborescences(graph, root, 1));
		assertEquals(Lists.newArrayList(), KBestArborescences.getKBestArborescences(graph, root, 0));
		
		acWeighted = new Weighted(Arborescence.of(ImmutableMap.of(13, 11, 12, 13, 11, 10)), 4.0);
		acList.add(acWeighted);
		assertEquals(acList, KBestArborescences.getKBestArborescences(graph, root, 2));
	}

	@Test(timeout = 4000, expected = IllegalArgumentException.class)
	public void test2() {
		List<Integer> nodes = new ArrayList();
		Map<Integer, Integer> indexOf = new HashMap();
		double[][] weights = new double[3][2];
		
		nodes.add(10);
		nodes.add(12);
		indexOf.put(10, 1);
		indexOf.put(12, 2);
		
		// 构造ac
		WeightedGraph<Integer> graph = DenseWeightedGraph.from(nodes, weights);
	}
	
	@Test(timeout = 4000)
	public void test3() {
		Pair<Integer, Integer> pair = Pair.of(10, 10);
		Pair<Integer, Integer> pair2 = Pair.of(10, 10);
		assertTrue(pair.equals(pair2));
		pair2 = Pair.of(11, 10);
		assertFalse(pair.equals(pair2));
		pair2 = Pair.of(10, 11);
		assertFalse(pair.equals(pair2));
		assertFalse(pair.equals(null));
		assertEquals(1281, pair.hashCode());
		assertEquals("Pair{first=10, second=10}", pair.toString());
	}
	
	@Test(timeout = 4000)
	public void test4() {
		double[][] weights = new double[2][2];
		weights[0][1] = 10.0;
		weights[1][0] = 2.0;
		DenseWeightedGraph<Integer> denseWeightedGraph = DenseWeightedGraph.from(weights);
	}
	
	@Test(timeout = 4000)
	public void test5() {
		List<Integer> nodes = new ArrayList();
		Map<Integer, Integer> indexOf = new HashMap();
		double[][] weights = new double[1][2];
		
		nodes.add(12);
		indexOf.put(10, 0);
		indexOf.put(11, 1);
		
		WeightedGraph<Integer> graph = DenseWeightedGraph.from(nodes, weights);
		assertEquals(Double.NEGATIVE_INFINITY, graph.getWeightOf(10, 11), 0.001);
		
		weights = new double[2][2];
		nodes.add(10);
		graph = DenseWeightedGraph.from(nodes, weights);
		assertEquals(Double.NEGATIVE_INFINITY, graph.getWeightOf(10, 11), 0.001);
		nodes.add(11);
		weights = new double[3][3];
		graph = DenseWeightedGraph.from(nodes, weights);
		assertEquals(0.0, graph.getWeightOf(10, 11), 0.001);
		
		assertEquals(Collections.emptySet(), graph.getIncomingEdges(14));
	}
	
	@Test(timeout = 4000)
	public void test6() {
		
		Weighted<Edge<Integer>> acWeighted = new Weighted(Edge.from(10).to(11), 10.0);
		List<Weighted<Edge<Integer>>> edges = new ArrayList();
		edges.add(acWeighted);
		SparseWeightedGraph<Integer> graph = SparseWeightedGraph.from(edges);
		
		assertEquals(10.0, graph.getWeightOf(10, 11), 0.01);
		assertEquals(Double.NEGATIVE_INFINITY, graph.getWeightOf(10, 10), 0.01);
		assertEquals(Double.NEGATIVE_INFINITY, graph.getWeightOf(11, 11), 0.01);
	}
	
	@Test(timeout = 4000)
	public void test7() {
		Edge<Integer> edge = new Edge<Integer>(10, 11);
		assertFalse(edge.equals(null));
		assertFalse(edge.equals(new ArrayList()));
		assertEquals("Edge{source=10, destination=11}", edge.toString());
	}
	
	@Test(timeout = 4000)
	public void test8() {
		Weighted<Integer> weighted = new Weighted(10, 10.0);
		assertFalse(weighted.equals(null));
		Weighted<Integer> weighted2 = new Weighted(11, 10.0);
		assertFalse(weighted.equals(weighted2));
		weighted2 = new Weighted(10, 10.1);
		assertFalse(weighted.equals(weighted2));
		assertEquals(1076102391, weighted.hashCode());
		assertEquals("Weighted{val=10, weight=10.0}", weighted.toString());
	}
	
	@Test(timeout = 4000)
	public void test9() {
		FibonacciHeap<Integer, Integer> fibonacciHeap = FibonacciHeap.create();
		fibonacciHeap.add(10, 10);
		fibonacciHeap.clear();
		fibonacciHeap.add(10, 10);
		fibonacciHeap.add(11, 11);
		Entry entry = fibonacciHeap.peekOption().get();
		fibonacciHeap.decreasePriority(entry, 9);
		assertTrue(entry.equals(fibonacciHeap.peekOption().get()));
		fibonacciHeap.clear();
		
		fibonacciHeap.add(10, 11);
		entry = fibonacciHeap.peekOption().get();
		fibonacciHeap.add(11, 12);
		fibonacciHeap.add(9, 10);
		fibonacciHeap.decreasePriority(entry, 8);
		fibonacciHeap.remove(entry);
		assertFalse(entry.equals(fibonacciHeap.peekOption().get()));
		assertFalse(fibonacciHeap.isEmpty());;
	}
	
	@Test(timeout = 4000, expected = IllegalArgumentException.class)
	public void test10() {
		FibonacciHeap<Integer, Integer> fibonacciHeap = FibonacciHeap.create();
		fibonacciHeap.add(10, 10);
		Entry entry = fibonacciHeap.peekOption().get();
		fibonacciHeap.decreasePriority(entry, 11);
	}
	
	@Test(timeout = 4000, expected = AssertionError.class)
	public void test11() {
		FibonacciHeap<Integer, Integer> fibonacciHeap = FibonacciHeap.create();
		
		fibonacciHeap.add(10, 10);
		fibonacciHeap.add(11, 11);
		Entry entry = fibonacciHeap.peekOption().get();
		fibonacciHeap.decreasePriority(entry, 9);
		fibonacciHeap.clear();
		fibonacciHeap.decreasePriority(entry, 8);
	}
	
	@Test(timeout = 4000)
	public void test12() {
		FibonacciHeap<Integer, Integer> fibonacciHeap = FibonacciHeap.create();
		fibonacciHeap.add(10, 10);
		FibonacciHeap<Integer, Integer> fibonacciHeap1 = FibonacciHeap.create();
		fibonacciHeap1.add(10, 10);
		FibonacciHeap<Integer, Integer> fibonacciHeap2 = FibonacciHeap.merge(fibonacciHeap, fibonacciHeap1);
		FibonacciHeap<Integer, Integer> fibonacciHeap3 = FibonacciHeap.create();
		fibonacciHeap3.add(10, 10);
		fibonacciHeap3.add(10, 10);
		
		assertEquals(fibonacciHeap.size() + fibonacciHeap1.size(), fibonacciHeap2.size());
		Iterator<FibonacciHeap<Integer, Integer>.Entry> iterator = fibonacciHeap2.iterator();
		
		
	}
	
	@Test(timeout = 4000)
	public void test13() {
		ImmutableMap<Integer, Integer> immutableMap = ImmutableMap.of(13, 11, 12, 11, 11, 10);
		Arborescence<Integer> arborescence = Arborescence.of(immutableMap);
		immutableMap = ImmutableMap.of(13, 11);
		Arborescence<Integer> arborescence2 = Arborescence.of(immutableMap);
		assertEquals("Arborescence{11 -> 13, 11 -> 12, 10 -> 11}", arborescence.toString());
		assertTrue(arborescence.equals(arborescence));
		assertFalse(arborescence.equals(null));
		assertFalse(arborescence.equals(new ArrayList()));
		assertFalse(arborescence.equals(arborescence2));
		immutableMap = ImmutableMap.of(13, 11, 32, 42, 31, 23);
		arborescence2 = Arborescence.of(immutableMap);
		assertFalse(arborescence.equals(arborescence2));
		
		assertEquals(45, arborescence.hashCode());
		assertFalse(arborescence.contains(new Edge<Integer>(333, 11)));
		assertFalse(arborescence.contains(new Edge<Integer>(13, 12)));
	}
	
	/*@Test(timeout = 4000)
	public void test14() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException {
		Class cls = Class.forName(new ChuLiuEdmonds().getClass().getName());
		ChuLiuEdmonds hotel = (ChuLiuEdmonds) cls.newInstance();
		   Method method = cls.getDeclaredMethod("merge", new Class[] {Weighted.class, EdgeQueueMap.class});
		   method.setAccessible(true);
		   Weighted<Edge<Integer>> acWeighted = new Weighted(new Edge<Integer>(10, 10), 4.0);
		   List<Integer> nodes = new ArrayList();
			
			nodes.add(10);
			nodes.add(11);
			nodes.add(12);
			nodes.add(13);
		   EdgeQueueMap map = new EdgeQueueMap<>(Partition.singletons(nodes));
		   Object result = method.invoke(hotel, acWeighted, map);
		   assertEquals(31010105, result);
	}*/
}
