package net.mooctest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		heap.add(1, 1);
		assertEquals(1, heap.size());
		heap.add(2, 2);
		
		
		
		
	}

	
}
