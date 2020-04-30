package net.mooctest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.google.common.collect.Ordering;


public class TestFibonacciHeap {

	@Test(timeout=4000)
	public void test0() { // FibonacciHeap
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
		assertNotNull(heap.comparator());
		
		heap.clear();
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
		assertNotNull(heap.comparator());
		
		heap.pollOption();
		
		FibonacciHeap<Integer,Integer> heap0 = FibonacciHeap.create();
		assertEquals(new Integer(5), heap0.add(5, 1).get().value);
		assertEquals(new Integer(0), heap0.add(0, 0).get().value);
		assertEquals(new Integer(3), heap0.add(3, 6).get().value);
		assertEquals(new Integer(3), heap0.add(3, 6).get().value);
		assertEquals(new Integer(7), heap0.add(7, 3).get().value);
		assertEquals(new Integer(7), heap0.add(7, 3).get().value);
		assertEquals(6, heap0.size());
		
		
		heap0.decreasePriority(heap0.peekOption().get(), -2);
		
		assertFalse(heap0.isEmpty());
		assertEquals(new Integer(0), heap0.peekOption().get().value);
		try {
			heap0.decreasePriority(heap0.peekOption().get(), 3);
			fail();
		} catch (Exception e) {
			// TODO: handle exception
		}
		heap0.remove(heap0.peekOption().get());
		
		FibonacciHeap<Integer,Integer> heap1 = FibonacciHeap.create();
		heap1.add(4, 4);
		heap1.decreasePriority(heap1.peekOption().get(), 3);
		heap1.decreasePriority(heap1.peekOption().get(), 1);
		
		FibonacciHeap<Integer,Integer> heap2 = FibonacciHeap.create();
		heap2.merge(heap0, heap1);
		assertEquals(5, heap0.size());
		
		heap2.iterator();
		heap0.iterator();
		heap1.iterator();
		
		heap1.remove(heap1.peekOption().get());
	}

	@Test(timeout=4000)
	public void test1() { // FibonacciQueue
		FibonacciQueue<Integer> fibonacciQueue = FibonacciQueue.create();
		FibonacciHeap<Integer,Integer> heap0 = FibonacciHeap.create();
		assertEquals(new Integer(5), heap0.add(5, 1).get().value);
		assertEquals(new Integer(0), heap0.add(0, 0).get().value);
		assertEquals(new Integer(3), heap0.add(3, 6).get().value);
		assertEquals(new Integer(3), heap0.add(3, 6).get().value);
		
		
		assertTrue(fibonacciQueue.offer(3));
		assertTrue(fibonacciQueue.offer(0));
		assertTrue(fibonacciQueue.offer(1));
		
		assertNotNull(fibonacciQueue.comparator());
		assertEquals(new Integer(0), fibonacciQueue.peek());
		
		assertEquals(new Integer(0), fibonacciQueue.poll());
		assertEquals(2, fibonacciQueue.size());
		assertNotNull(fibonacciQueue.iterator());
		
		FibonacciQueue<Integer> fibonacciQueue1 = FibonacciQueue.create(Ordering.natural());
		assertNull(fibonacciQueue1.peek());
		
		assertNull(fibonacciQueue1.poll());
		assertEquals(0, fibonacciQueue1.size());
		assertNotNull(fibonacciQueue1.iterator());
	}
	
}
