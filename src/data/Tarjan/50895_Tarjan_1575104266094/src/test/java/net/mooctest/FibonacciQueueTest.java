package net.mooctest;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class FibonacciQueueTest {

	@Test
	public void test() {
		FibonacciQueue<String> fibonacciQueue = FibonacciQueue.create();
		fibonacciQueue.peek();
		fibonacciQueue.add("a");
		
		assertEquals(true, fibonacciQueue.contains("a"));
		
		Set<String> set = new HashSet<>();
		set.add("aa");
		set.add("aaa");
		set.add("aaaa");
		fibonacciQueue.addAll(set);
		assertEquals(fibonacciQueue.size(), 4);
		assertEquals(false, fibonacciQueue.isEmpty());
		fibonacciQueue.comparator();
		fibonacciQueue.clear();
		assertEquals(fibonacciQueue.isEmpty(), true);
		
	}

}
