package net.mooctest;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;


public class TestFibonacciHeap {

	@Test(timeout=4000)
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		assertEquals(0, heap.size());
		assertEquals(true, heap.isEmpty());
		heap.peekOption();
		heap.pollOption();
		assertEquals(true, heap.equals(heap));
		heap.add(12, 1);
		assertEquals(1, heap.size());
		heap.peekOption();
		heap.pollOption();
		assertEquals(true, heap.equals(heap));
		assertEquals(false, heap.equals(null));
		heap.hashCode();
		heap.decreasePriority(heap.add(1, 3).get(), 2);
		assertEquals(1, heap.size());
		heap.clear();
		assertEquals(0, heap.size());
		heap.remove(heap.add(1, 5).get());
		heap.remove(heap.add(1, 3).get());
		heap.remove(heap.peekOption().or(heap.add(1, 5).get()));
		heap.remove(heap.add(1, 100).orNull());
		heap.add(1, 10);
		heap.add(2, 11);
		heap.add(3, 14);
		heap.pollOption();
		heap.peekOption();
		
		Edge<Integer> edge0 = new Edge<Integer>(1, 9);
		Edge<Integer> edge1 = new Edge<Integer>(1, 8);
		Edge<Integer> edge2 = new Edge<Integer>(2, 8);
		Edge<Integer> edge3 = new Edge<Integer>(2, 10);
		assertEquals(true, edge0.equals(edge0));
		assertEquals(false, edge0.equals(edge1));
		assertEquals(false, edge0.equals(null));
		assertEquals(false, edge0.equals(edge2));
		assertEquals(false, edge0.equals(heap));
		
		edge0.competesWith(new HashSet<>(Arrays.asList(edge1)));
		edge0.competesWith(new HashSet<>(Arrays.asList(edge0)));
		edge0.competesWith(new HashSet<>(Arrays.asList(edge0,edge1,edge3)));
		
		Pair<Integer, Integer> pair0 = new Pair<Integer, Integer>(1, 2);
		Pair<Integer, Integer> pair1 = new Pair<Integer, Integer>(1, 3);
		Pair<Integer, Integer> pair2 = new Pair<Integer, Integer>(5, 9);
		assertEquals(true, pair0.equals(pair0));
		assertEquals(false, pair0.equals(pair1));
		assertEquals(false, pair0.equals(pair2));
		assertEquals(false, pair0.equals(edge0));
		
		Weighted<Integer> weighted0 = new Weighted<Integer>(1, 2);
		Weighted<Integer> weighted1 = new Weighted<Integer>(1, 3);
		Weighted<Integer> weighted2 = new Weighted<Integer>(5, 9);
		assertEquals(true, weighted0.equals(weighted0));
		assertEquals(false, weighted0.equals(weighted1));
		assertEquals(false, weighted0.equals(weighted2));
		assertEquals(false, weighted0.equals(edge0));		
	}
	@Test(timeout=4000)
	public void test2() {
		ArrayList<Integer> nodeList = new ArrayList<>();
        nodeList.add(1);
        nodeList.add(2);
        nodeList.add(3);
        
        Edge<Integer> edges1 = new Edge<Integer>(1, 2);
        Weighted<Edge<Integer>> weighted1 = new Weighted<Edge<Integer>>(edges1, 2.0);
        Edge<Integer> edges2 = new Edge<Integer>(2, 1);
        Weighted<Edge<Integer>> weighted2 = new Weighted<Edge<Integer>>(edges2, 3.0);
        Edge<Integer> edges3 = new Edge<Integer>(2, 3);
        Weighted<Edge<Integer>> weighted3 = new Weighted<Edge<Integer>>(edges3, 3.0);
        
        ArrayList<Weighted<Edge<Integer>>> wArrayList = new ArrayList<>();
        wArrayList.add(weighted1);
        wArrayList.add(weighted2);
        wArrayList.add(weighted3);
        
        SparseWeightedGraph<Integer> sparseWeightedGraph = SparseWeightedGraph.from(nodeList, wArrayList);
        ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds = ChuLiuEdmonds.PartialSolution.initialize(sparseWeightedGraph);
        
        sparseWeightedGraph.equals(sparseWeightedGraph);
        assertEquals(2.0, sparseWeightedGraph.getWeightOf(1, 2), 0.001);
        sparseWeightedGraph.from(wArrayList);
	}
	
}
