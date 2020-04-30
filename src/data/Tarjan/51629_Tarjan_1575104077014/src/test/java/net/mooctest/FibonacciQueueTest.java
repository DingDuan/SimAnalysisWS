package net.mooctest;

import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FibonacciQueueTest {

	@Test(timeout = 4000)
	public void test0() throws Throwable {
		FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
		int int0 = fibonacciQueue0.size();
		assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void test2() throws Throwable {
		try {
			FibonacciQueue.create((Comparator<? super Integer>) null);
			fail();

		} catch (Exception e) {

		}
	}

	@Test(timeout = 4000)
	public void test3() throws Throwable {
		FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
		fibonacciQueue0.add("");
		Object[] objectArray0 = fibonacciQueue0.toArray();
		assertEquals(1, objectArray0.length);
	}

	@Test(timeout = 4000)
	public void test4() throws Throwable {
		FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create();
		Integer integer0 = new Integer(0);
		fibonacciQueue0.offer(integer0);
		Integer integer1 = fibonacciQueue0.peek();
		assertEquals(0, (int) integer1);
	}

}
