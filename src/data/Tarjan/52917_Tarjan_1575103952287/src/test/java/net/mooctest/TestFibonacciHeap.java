package net.mooctest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestFibonacciHeap {

	@Test(timeout=4000)
	public void test_FibonacciHeap() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		
		assertEquals(true, heap.isEmpty());
		heap.add(1, 1);
		assertEquals(false, heap.isEmpty());
		assertEquals(1, heap.size());
		heap.clear();
		
		FibonacciHeap<Integer,Integer> heap2 = FibonacciHeap.create();
		heap.add(2, 2);
		FibonacciHeap.merge(heap, heap2);
	}
	
	@Test(timeout=4000)
	public void test_FibonacciQueue() {
		FibonacciQueue queue = FibonacciQueue.create();
		
		assertEquals(null, queue.peek());
		assertEquals(true, queue.isEmpty());
		queue.add(1);
		assertEquals(false, queue.isEmpty());
		assertEquals(1, queue.size());
		queue.clear();
		
		queue.peek();
	}
}
