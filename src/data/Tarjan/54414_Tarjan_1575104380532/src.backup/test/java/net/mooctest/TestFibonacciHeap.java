package net.mooctest;
import org.junit.Test;

import net.mooctest.FibonacciHeap.Entry;

import static org.junit.Assert.*;

public class TestFibonacciHeap {

	@Test
	public void test() {

		
		Integer a=1;
		Integer b=1;
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> heap1 = FibonacciHeap.create();
		
		heap.add(a,1);
		heap.add(2,2);
		heap.add(3,3);
		heap.clear();
		assertEquals(false,heap.equals(heap1));
	}

	
	
}
