package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer, Integer> heap = FibonacciHeap.create();
		FibonacciHeap<Integer, Integer> heap1 = FibonacciHeap.create();
		try {
			heap.add(null, null);
			fail();
		} catch (Exception e) {
			// TODO: handle exception
		}
		heap.add(0, 0);
		heap1.add(0, 0);
		assertFalse(heap.isEmpty());
		assertNotSame(heap1, heap);
		heap.clear();
		assertNotNull(heap);
		FibonacciHeap.merge(heap1, heap);
		assertEquals(0, heap.size());

	}
	// @Test(timeout = 4000)
	// public void test00() throws Throwable {
	// Comparator<? super Integer> comparator0;
	// FibonacciHeap<Integer, Integer> fibonacciHeap0 =
	// FibonacciHeap.create((Comparator<? super Integer>) comparator0);
	// fibonacciHeap0.clear();
	// fibonacciHeap0.iterator();
	// fibonacciHeap0.isEmpty();
	// fibonacciHeap0.isEmpty();
	// Integer integer0 = new Integer(957692532);
	// Integer integer1 = Integer.getInteger("", 2689);
	// fibonacciHeap0.iterator();
	// Integer.toUnsignedString(0);
	// Integer.toUnsignedLong(0);
	// Integer.toUnsignedLong(1256);
	// fibonacciHeap0.add(integer0, integer0);
	// fibonacciHeap0.add(integer1, integer0);
	// Integer integer2 = new Integer(0);
	// fibonacciHeap0.add(integer2, integer2);
	// fibonacciHeap0.pollOption();
	// FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
	// assertEquals(2, fibonacciHeap0.size());
	//
	// FibonacciHeap.create()
	// int int0 = fibonacciHeap1.size();
	// assertEquals(0, int0);
	// }

	@Test(timeout = 4000)
	public void test01() throws Throwable {

	}

	@Test(timeout = 4000)
	public void test02() throws Throwable {
		FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create();
		Integer integer0 = new Integer(0);
		fibonacciHeap0.add("", integer0);
		fibonacciHeap0.add("", integer0);
		FibonacciHeap<String, Integer> fibonacciHeap1 = FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
		assertEquals(2, fibonacciHeap0.size());
		assertEquals(4, fibonacciHeap1.size());
	}

	@Test(timeout = 4000)
	public void test04() throws Throwable {
		FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
		fibonacciHeap0.add("", "");
		int int0 = fibonacciHeap0.size();
		assertEquals(1, int0);
	}

	@Test(timeout = 4000)
	public void test15() throws Throwable {
		FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create();
		Integer integer0 = new Integer(0);
		fibonacciHeap0.add("", integer0);
		boolean boolean0 = fibonacciHeap0.isEmpty();
		assertEquals(1, fibonacciHeap0.size());
		assertFalse(boolean0);
	}

}
