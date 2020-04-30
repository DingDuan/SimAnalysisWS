package net.mooctest;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> heap2 = FibonacciHeap.create();
		assertNotNull(heap.comparator());
		heap.clear();
		assertEquals(true, heap.isEmpty());
		Integer[] in01 = {2,3,6,5,8};
		Integer[] in02 = {5,8,6,10,5};
		for(int i = 0; i < in01.length; i++) {
			heap.add(in01[i], in02[i]);
			heap.add(in01[i]+1, in02[i]+2);
		}
		assertNotNull(heap.peekOption());
		assertNotNull(heap.pollOption());
		assertNotNull(FibonacciHeap.merge(heap, heap2));
		
		
		FibonacciQueue<Integer> queue01 = FibonacciQueue.create();
		Comparator<Integer> com01 = (Comparator<Integer>) queue01.comparator();
		FibonacciQueue<Integer> queue02 = FibonacciQueue.create(com01);
		
		Map<Integer, Integer> m1 = new HashMap();
		Map<Integer, Integer> m2 = new HashMap();
		Collection<Integer> coll01 = new ArrayList();
		for(int i = 0; i < in01.length; i++) {
			coll01.add(in02[i]);
			coll01.add(in02[i]+2);
		}
		Partition<Integer> par01 = Partition.singletons(coll01);
		int a = par01.componentOf(5);
		//int a1 = par01.merge(2, 3);
		assertEquals(5,a);
		//assertEquals(5,a1);
		ChuLiuEdmonds cle01 = new ChuLiuEdmonds();
		
		assertEquals(true, queue01.offer(1));
		int a22 = queue01.poll();
		assertEquals(1, a22);
		assertEquals(0, queue01.size());
		queue01.iterator();
		
		Weighted<Integer> we01 = new Weighted(2, 2.0);
		Weighted<Integer> we02 = Weighted.weighted(3, 3.0);
		Weighted<Integer> we03 = Weighted.weighted(1, 1.0);
		assertEquals(false, we01.equals(we02));
		assertEquals(false, we01.equals(we03));
		assertEquals(true, we01.equals(we01));
		assertEquals(false, we01.equals(coll01));
		assertEquals(false, we01.equals(null));
		assertEquals(1073742847, we01.hashCode());
		assertEquals("Weighted{val=2, weight=2.0}", we01.toString());
		assertEquals(1,we01.compareTo(we02));
		assertEquals(-1,we01.compareTo(we03));
		assertEquals(0,we01.compareTo(we01));
		
		Edge<Integer> e01 = new Edge(1,2);
		Edge.EdgeBuilder<Integer> eb01 = Edge.from(5);
		Edge<Integer> e02 = eb01.to(5);
		e02.hasDestination(1);
		
		Weighted<Edge<Integer>> we04 = new Weighted(e01, 2.0);
		
		Set<Edge<Integer>> set01 = new HashSet();
		set01.add(e02);
		set01.add(e01);
		e02.competesWith(set01);
		e02.isAutoCycle();
		
		Map<Integer, Weighted<Edge<Integer>>> Weighm1 = new HashMap();
		Weighm1.put(1, we04);
		
		LinkedList<ExclusiveEdge<Integer>> ll01 = new LinkedList();
		ExclusiveEdge<Integer> ece01 = ExclusiveEdge.of(e01, 2.0);
		ll01.add(ece01);
		
		EdgeQueueMap<Integer> eqm01 = new EdgeQueueMap<Integer>(par01);
		
		
		Map<Integer, Weighted<Edge<Integer>>> Weighm2 = new HashMap();
		
		double[][] wei01 = {{2}, {3},{4}, {5},{10}};
		
		DenseWeightedGraph<Integer> den01 = DenseWeightedGraph.from(wei01);
		assertNotNull(den01.getIncomingEdges(0));
		
		// ChuLiuEdmonds.PartialSolution<Integer> cle02 = new ChuLiuEdmonds(par01, par01, Weighm1, ll01, eqm01);
	
		Pair<Integer, Integer> p01 = new Pair(2,3);
		Pair<Integer, Integer> p02 = Pair.of(1, 2);
		assertEquals(true,p01.equals(p01));
		assertEquals(false,p01.equals(p02));
		assertEquals(false,p01.equals(we01));
		assertEquals(1026,p01.hashCode());
		assertEquals("Pair{first=2, second=3}",p01.toString());
		
		KBestArborescences kba01 = new KBestArborescences();
		// KBestArborescences.getKBestArborescences(den01, 0, 0);
		
		// ChuLiuEdmonds.PartialSolution<Integer> cle02 = ChuLiuEdmonds.PartialSolution.initialize(den01);
	}

	
}
