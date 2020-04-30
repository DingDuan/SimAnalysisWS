package net.mooctest;
import java.util.Iterator;

import org.junit.Test;


public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		
		heap.clear();
		heap.isEmpty();
		heap.add(5, 26);
		heap.isEmpty();
		heap.add(4, 26);
		heap.add(3, 26);
		heap.add(2, 26);
		heap.add(1, 26);
		heap.remove(heap.add(6, 26).get());
		heap.comparator();
		Iterator<FibonacciHeap<Integer, Integer>.Entry> iterator = heap.iterator();
		
		heap.peekOption();
		heap.pollOption();
		heap.size();
		FibonacciHeap.merge(heap,heap);
	}

	
}
