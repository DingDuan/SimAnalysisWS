package net.mooctest;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;



public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> heap1 = FibonacciHeap.create();
		heap.merge(heap, heap1).iterator();
		heap.add(1, 2);
		heap.merge(heap, heap1).pollOption();
	
		heap.add(3, 1);
		heap.add(8, 0);
		heap1.add(8, 0);
		heap1.add(8, 2);
		heap.equals(null);
		
		heap.merge(heap, heap1).pollOption();
		heap.merge(heap, heap1).iterator();
		heap.pollOption();
		heap.peekOption();
		heap.comparator();
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		/*m.put(1, 2);
		m.put(3, 1);
		m.put(0, 1);
		m.put(-2, 0);
		Partition<Integer> p = new Partition<Integer>(m,m);*/
		Edge<Integer> e =new Edge<Integer>(1,3);
		Edge<Integer> e1 =new Edge<Integer>(1,3);
		Edge<Integer> e4 =new Edge<Integer>(3,1);
		Edge<Integer> e5 =new Edge<Integer>(-3,1);
		Edge<Integer> e3 =null;
		assertEquals(true,e.equals(e1));
		assertEquals(false,e.equals(e3));
		assertEquals(false,e.equals(new Integer(1)));
		assertEquals(false,e.equals(e4));
		e4 =new Edge<Integer>(1,0);
		assertEquals(false,e.equals(e4));
		e.hasDestination(1).apply(e1);
		HashSet<Edge<Integer>> hs = new HashSet<>();
		hs.add(e1);
		hs.add(e5);
		hs.add(e4);
		e1.competesWith(hs).apply(e1);
		e1.competesWith(hs).apply(e);
		e1.isAutoCycle();
		ChuLiuEdmonds c = new ChuLiuEdmonds();
		HashMap<Integer,Integer> m12 = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> m1 = new HashMap<Integer,Integer>();
		m12.put(1, 2);
		m1.put(2, 1);
		KBestArborescences kb =new KBestArborescences();
		heap1.decreasePriority(heap.iterator().next(), -1);
		assertEquals(false,heap.isEmpty());
		heap.clear();
		assertEquals(true,heap.isEmpty());
		heap.add(3, 1);
		heap.add(8, 0);
		heap1.add(-5, -6);
		heap1.add(8, 2);
		FibonacciHeap<Integer,Integer> heap3 = heap.merge(heap, heap1);
		heap3.remove(heap1.iterator().next());
		heap.remove(heap1.iterator().next());
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void t() {
		
		FibonacciHeap<Integer, Integer> heap1 = FibonacciHeap.create();
		FibonacciHeap<Integer, Integer> heap= FibonacciHeap.create();
		heap.add(1, 2);
		heap1.add(1, 2);
		heap.decreasePriority(heap1.peekOption().get(),10);
	}	
}
