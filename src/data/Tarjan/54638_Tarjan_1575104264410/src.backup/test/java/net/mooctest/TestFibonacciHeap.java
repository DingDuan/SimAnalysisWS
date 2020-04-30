package net.mooctest;
import static org.junit.Assert.assertFalse;

import org.junit.Test;


public class TestFibonacciHeap {

	@Test(timeout=4000)
	public void test001() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> heap1 = FibonacciHeap.create();
		heap.comparator();
		heap.clear();
		//FibonacciHeap<Integer, Integer>.Entry entry = null;
		//heap.decreasePriority(entry, null);
		heap.add(2, 3);
		heap.add(Integer.MAX_VALUE, 4);
		assertFalse(heap.isEmpty());
		//heap.remove(entry);
		heap.peekOption();
		heap.pollOption();
		heap.size();
		heap.merge(heap, heap1);
		heap.iterator();
	}

	
}
