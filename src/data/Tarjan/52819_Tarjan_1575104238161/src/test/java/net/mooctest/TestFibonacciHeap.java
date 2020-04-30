package net.mooctest;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import net.mooctest.Edge.EdgeBuilder;
import net.mooctest.EdgeQueueMap.EdgeQueue;
import net.mooctest.FibonacciHeap.Entry;

import org.junit.Test;

import com.google.common.base.Predicates;


public class TestFibonacciHeap {

	@Test(timeout = 4000)
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> heap1 = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> heap2 = FibonacciHeap.create();
		assertEquals(true, heap.isEmpty());
		heap.add(1, 1);
		assertEquals(false, heap.isEmpty());
		heap.comparator();
		heap.clear();
		for (int i = 0; i < 10; i++) {
			heap.add(i, i);
			heap1.add(i+2, i*5);
			heap2.add(i*3, i+10);
		}
		heap.hashCode();
		heap.peekOption();
		heap.pollOption();
		assertEquals(9,heap.size());
		heap.merge(heap1,heap2);
		Iterator<FibonacciHeap<Integer,Integer>.Entry> eIterator = heap2.iterator();
		heap.remove(eIterator.next());
		for(int i = 0;i < 9; i++) {
			heap.decreasePriority(eIterator.next(), 1);
		}
		eIterator = heap.iterator();
		heap.remove(eIterator.next());
		
		Edge<Integer> edge = new Edge<Integer>(1, 2);
		EdgeBuilder<Integer> edgeBuilder = edge.from(1);
		edgeBuilder.to(3);
		assertEquals(994, edge.hashCode());
		edge.toString();
		Edge<Integer> edge2 = new Edge<Integer>(1, 2);
		assertTrue(edge.equals(edge2));
		edge2 = new Edge<Integer>(1, 3);
		assertFalse(edge.equals(null));
		assertFalse(edge.equals(1));
		assertFalse(edge.equals(edge2));
		edge2 = new Edge<Integer>(2, 2);
		assertFalse(edge.equals(edge2));
		
		edge.hasDestination(1).apply(edge2);
		
		Set<Edge<Integer>> set = new TreeSet<Edge<Integer>>();
		edge.competesWith(set).apply(edge2);
		edge.isAutoCycle();
		edge.isIn(set);
		
		Weighted<Integer> weighted = new Weighted<Integer>(1, 5);
		Weighted<Integer> weighted2 = new Weighted<Integer>(2, 8);
		assertEquals(weighted2, weighted.weighted(2, 8));
		assertEquals(1, weighted.compareTo(weighted2));
		weighted2 = new Weighted<Integer>(1, 8);
		assertFalse(weighted.equals(1));
		assertFalse(weighted.equals(weighted2));
		weighted2 = new Weighted<Integer>(2, 5);
		assertFalse(weighted.equals(weighted2));
		assertEquals(1075053536, weighted.hashCode());
		weighted.toString();
		
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(1, 2);
		Pair<Integer, Integer> pair2 = new Pair<Integer, Integer>(3, 2);
		assertEquals(pair2, pair.of(3, 2));
		pair2 = new Pair<Integer, Integer>(1, 3);
		assertFalse(pair.equals(1));
		assertFalse(pair.equals(pair2));
		pair2 = new Pair<Integer, Integer>(3, 1);
		assertFalse(pair.equals(pair2));
		assertEquals(994, pair.hashCode());
		pair.toString();
		
		EdgeQueueMap<Integer> edgeQueueMap = new EdgeQueueMap<Integer>(null);
		
		
		//SparseWeightedGraph<Integer> sparseWeightedGraph = new SparseWeightedGraph.from();
		ChuLiuEdmonds chuLiuEdmonds = new ChuLiuEdmonds();
		//chuLiuEdmonds.getMaxArborescence(null);
		 ArrayList<Integer> nodeList = new ArrayList<>();
         nodeList.add(1);
         nodeList.add(2);
         nodeList.add(3);
         
         Edge<Integer> edges1 = new Edge<Integer>(1, 2);
         Weighted<Edge<Integer>> weighted1 = new Weighted<Edge<Integer>>(edges1, 2.0);
         Edge<Integer> edges2 = new Edge<Integer>(2, 1);
         Weighted<Edge<Integer>> weighted21 = new Weighted<Edge<Integer>>(edges2, 3.0);
         Edge<Integer> edges3 = new Edge<Integer>(2, 3);
         Weighted<Edge<Integer>> weighted3 = new Weighted<Edge<Integer>>(edges3, 3.0);
         
         ArrayList<Weighted<Edge<Integer>>> wArrayList = new ArrayList<>();
         wArrayList.add(weighted1);
         wArrayList.add(weighted21);
         wArrayList.add(weighted3);
         
         SparseWeightedGraph<Integer> sparseWeightedGraph = SparseWeightedGraph.from(nodeList, wArrayList);
         ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds1 = ChuLiuEdmonds.PartialSolution.initialize(sparseWeightedGraph);
 
         try {
                 ChuLiuEdmonds.getMaxArborescence(sparseWeightedGraph);
         } catch (Exception e) {
                 e.printStackTrace();
         }
         
         ChuLiuEdmonds.getMaxArborescence(sparseWeightedGraph, 1);
 }
	
	
	
	
}
