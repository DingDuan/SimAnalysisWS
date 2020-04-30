package net.mooctest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.internal.SpecificDataPointsSupplier;

import com.google.common.base.Optional;

import net.mooctest.Edge.EdgeBuilder;
import net.mooctest.FibonacciHeap.Entry;


public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		assertTrue(heap.isEmpty());
	}

	@Test
	public void testFibonacciHeapisEmpty() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		heap.add(1, 3);
		assertTrue(!heap.isEmpty());
	}
	@Test
	public void testFibonacciHeapadd() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		for(int i =0;i<50;i++) {
			heap.add(i, i);
		}
	}
	@Test
	public void testFibonacciHeapclear() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		heap.add(1, 3);
		assertEquals(heap.size(), 1);
		assertTrue(!heap.isEmpty());
		heap.clear();
		assertEquals(heap.size(), 0);
		assertTrue(heap.isEmpty());
	}
	@Test
	public void testFibonacciHeapremove() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		heap.add(1, 3);
		//heap.remove(1);
	}
	
	@Test
	public void testFibonacciHeapcomparator() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		heap.add(1, 1);
		heap.comparator();
		try {
			//assertEquals(1, heap.comparator());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	@Test
	public void testFibonacciHeappeekOption() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		
		
	}
	
	@Test
	public void testFibonacciHeappeekWeighted() {
		//Weighted<Integer>.Weighted<Integer> name = new Weighted<Integer>();
		//Weighted<Integer> weighted5 = Weighted<Integer>.Instance();
		Weighted<Integer> weighted = new Weighted<Integer>(1, 1);
		Weighted<Integer> weighted1 = new Weighted<Integer>(1, 1);
		Weighted<Integer> weighted3 = new Weighted<Integer>(2,2);
		Weighted<Integer> weighted4 = new Weighted<Integer>(1,2);
		//assertTrue(weighted.compareTo(weighted1));
		//System.out.println(weighted.toString());
		weighted.compareTo(weighted1);
		weighted.hashCode();
		assertEquals(0, weighted.compareTo(weighted1));
		assertEquals(1, weighted.compareTo(weighted3));
		weighted.equals(weighted);
		String string1="Weighted{val=1, weight=1.0}";
		assertTrue(weighted.equals(weighted));
		assertTrue(!weighted.equals(weighted3));
		assertFalse(weighted.equals(string1));
		assertTrue(!weighted.equals(weighted4));
		assertEquals(1072694240, weighted.hashCode());
		assertEquals(weighted.toString(), string1);
	}

	@Test
	public void testSparseWeightedGraph() {
	SparseWeightedGraph<Integer> sparseWeightedGraph;
	
		
	}
	@Test
	public void testPair() {
		//Pair<T, V>.Pair
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(1, 2);
		Pair<Integer, Integer> pair1 = new Pair<Integer, Integer>(1, 2);
		Pair<Integer, Integer> pair2 = new Pair<Integer, Integer>(1, 3);
		Pair<Integer, Integer> pair3 = new Pair<Integer, Integer>(3, 2);
		String string = "Pair{first=1, second=2}";
		//System.out.println(pair.toString());
		assertTrue(pair.equals(pair1));
		assertFalse(pair.equals(pair2));
		assertFalse(pair.equals(string));
		assertFalse(pair.equals(pair3));
		assertEquals(994, pair.hashCode());
		assertEquals(string, pair.toString());
		
	}
	@Test
	public void testKBestArborescences() {
		try {
			KBestArborescences.getKBestArborescences(null, null, 1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	@Test
	public void testFibonacciQueue() {
		FibonacciHeap<Integer, Integer> fibonacciHeap;
		
	}
	@Test
	public void testExclusiveEdge() {
		ExclusiveEdge<Integer> edge ;
		
	}
	@Test
	public void testEdge() {
		
		Edge<Integer> edge = new Edge<Integer>(1, 1);
		Edge<Integer> edge1 = new Edge<Integer>(1, 1);
		//System.out.println(edge.toString());
		
		String string = "Edge{source=1, destination=1}";
		assertEquals(993, edge.hashCode());
		assertEquals(string, edge.toString());
		assertFalse(edge.equals(null));
		assertFalse(edge.equals(string));
		assertTrue(edge.equals(edge1));
	}
	@Test
	public void testDenseWeightedGraph() {
		
	}
	@Test
	public void testChuLiuEdmonds() {
		ChuLiuEdmonds chuLiuEdmonds = new ChuLiuEdmonds();
		WeightedGraph<Integer> weightedGraph;
		//chuLiuEdmonds.getMaxArborescence(null);
		
	}
	@Test
	public void testArborescence() {
		Arborescence arborescence;
		
	}
	@Test
	public void testdecreasePriority() {
		FibonacciHeap<Integer, Integer> fibonacciHeap =FibonacciHeap.create();
		fibonacciHeap.clear();
		Optional<Entry> enOptional=null;
		for(int i =0;i<50;i++) 
			fibonacciHeap.add(i, i);
		
			for(int j =50;j>0;j--) { 
				fibonacciHeap.add(j, j);
				//enOptional.asSet();
				}
		//fibonacciHeap.remove();
		fibonacciHeap.peekOption();
		fibonacciHeap.pollOption();
		FibonacciHeap<Integer, Integer> fibonacciHeap1 =FibonacciHeap.create();
		for(int j =50;j>0;j--) 
			fibonacciHeap1.add(j, j);
		FibonacciHeap<Integer, Integer> fibonacciHeap2 =FibonacciHeap.create();
		fibonacciHeap.merge(fibonacciHeap1, fibonacciHeap2);
	
	}
	
	@Test
	public void testArborescence1() {
		Weighted<Integer> weighted4 = Weighted.weighted(1, 1);
        List<Weighted<Edge>>list=new ArrayList<>();
        Edge<Integer> edge = new Edge<Integer>(1, 1);
		Weighted<Edge> weighted = new Weighted<Edge>(edge,1);
		list.add(weighted);
		list.add(weighted);
		list.add(weighted);
		Iterable iter=list;
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(1);
		list2.add(1);
		Iterable iter2=list2;
		
		Weighted<Edge> weighted2 = new Weighted<Edge>(edge,1);
		SparseWeightedGraph<Integer> sparseWeightedGraph = SparseWeightedGraph.from(iter);
		Collection<Integer> collection = sparseWeightedGraph.getNodes();
		sparseWeightedGraph.getWeightOf(1, 1);
		sparseWeightedGraph.getWeightOf(0, 0);
		sparseWeightedGraph.getIncomingEdges(2);
	}
	@Test
	public void testEdgeQueue() {
		//EdgeQueueMap<Integer> edgeQueueMap = EdgeQueueMap.create()
		  Edge<Integer> edge = new Edge<Integer>(1, 1);
		  List<Edge<Integer>> list = new ArrayList<Edge<Integer>>();
		  list.add(edge);
		ExclusiveEdge<Integer> exclusiveEdge = ExclusiveEdge.of(edge,list,1);
		ExclusiveEdge<Integer> exclusiveEdge1 = ExclusiveEdge.of(edge,1);
		exclusiveEdge.compareTo(exclusiveEdge);
	}
	@Test
	public void testFibonacciQueue1() {
		FibonacciQueue<Integer> fibonacciQueue = FibonacciQueue.create();
		fibonacciQueue.clear();
		fibonacciQueue.add(1);
		fibonacciQueue.comparator();
		int a = fibonacciQueue.peek();
		//System.out.println(fibonacciQueue.size());
		int b = fibonacciQueue.size();
		assertEquals(1,a);
		assertEquals(1,b);
		Collection c=new ArrayList();
	
		c.add(1);
		c.add(1);
		c.add(1);
		c.add(1);
		Partition<Integer> partition =Partition.singletons(c);
		partition.componentOf(1);
		partition.getNodes();
		partition.merge(1, 1);
	}
	}

