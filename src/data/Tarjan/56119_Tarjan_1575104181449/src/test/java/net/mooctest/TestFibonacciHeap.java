package net.mooctest;
import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;


public class TestFibonacciHeap {

	FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
	FibonacciHeap.Entry entry1;
	FibonacciHeap.Entry entry2;
	FibonacciHeap.Entry entry3;
	FibonacciHeap.Entry entry4;
	FibonacciHeap.Entry entry5;
	FibonacciHeap.Entry entry6;
	List<FibonacciHeap.Entry> entrys = new ArrayList<>();

	private void setupEntity()
	{
		entry1 = (heap.add(1, 1)).get();
		entry2 = (heap.add(2, 3)).get();
		entry3 = (heap.add(3, 7)).get();
		entry4 = (heap.add(4, 2)).get();
		entry5 = (heap.add(5, 4)).get();
		entry6 = (heap.add(6, 1)).get();
		entrys.add(entry1);
		entrys.add(entry2);
		entrys.add(entry3);
		entrys.add(entry4);
		entrys.add(entry5);
		entrys.add(entry6);
	}

	@Test(timeout = 4000)
	public void test0()
	{
		FibonacciHeap<Integer,Integer> heap1 = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> heap2 = FibonacciHeap.create(Ordering.<Integer>natural());

		assertEquals(heap1.comparator(), heap2.comparator());
	}

	@Test(timeout = 4000)
	public void test1()
	{
		setupEntity();
		assertEquals(6, heap.size());

		int[] index = {1, 6, 4, 2, 5, 3};

		for (int i : index)
		{
			assertEquals(entrys.get(i-1).value, heap.peekOption().get().value);
			heap.pollOption(); //这里还有异常处理等，先放着
		}
	}

	@Test(timeout = 4000)
	public void test2()
	{
		try {
			heap.add(null, 1);
			fail("should be null point exception");
		} catch (NullPointerException e){

		}

		try {
			heap.add(1, null);
			fail("should be null point exception");
		} catch (NullPointerException e){

		}
	}

	@Test(timeout = 4000)
	public void test3()
	{
		setupEntity();

		try {
			heap.decreasePriority(heap.peekOption().get(), 10);
			fail("fail");
		} catch (IllegalArgumentException e){

		}

		for(int i = 0; i < 6; i++) {
			heap.decreasePriority(heap.peekOption().get(), -10);
			assertEquals(1L, (long)(heap.peekOption().get().value));
		}
	}

	@Test(timeout = 4000)
	public void test4()
	{
		setupEntity();
		heap.clear();
		assertEquals(0, heap.size());
	}

	@Test(timeout = 4000)
	public void test5()
	{
		setupEntity();
		heap.remove(heap.peekOption().get());
		assertEquals(heap.peekOption().get().value, entry6.value);
		heap.remove(heap.peekOption().get());
		assertEquals(heap.peekOption().get().value, entry4.value);

	}

	@Test(timeout = 4000)
	public void test6()
	{
		assertEquals(true, heap.isEmpty());
		setupEntity();
		assertEquals(false, heap.isEmpty());
	}

	@Test(timeout = 4000)
	public void test00()  throws Throwable  {
		FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
		fibonacciHeap0.add("", "");
		fibonacciHeap0.add("", "8+/>X]Y~r0Q[]Q7Nh");
		assertEquals(2, fibonacciHeap0.size());
	}
	
	@Test(timeout = 4000)
	public void test02()  throws Throwable  {
		FibonacciHeap<FibonacciHeap<Integer, String>, String> fibonacciHeap0 = FibonacciHeap.create();
		FibonacciHeap<FibonacciHeap<Integer, String>, String> fibonacciHeap1 = FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
		FibonacciHeap<FibonacciHeap<Integer, String>, String> fibonacciHeap2 = FibonacciHeap.merge(fibonacciHeap1, fibonacciHeap0);
		assertEquals(0, fibonacciHeap2.size());
		assertNotSame(fibonacciHeap2, fibonacciHeap0);
	}





	@Test(timeout = 4000)
	public void test06()  throws Throwable  {
		// Undeclared exception!
		try {
			FibonacciHeap.merge((FibonacciHeap<Object, Integer>) null, (FibonacciHeap<Object, Integer>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}



	@Test(timeout = 4000)
	public void test09()  throws Throwable  {
		// Undeclared exception!
		try {
			FibonacciHeap.create((Comparator<? super FibonacciHeap.Entry>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 4000)
	public void test10()  throws Throwable  {
		FibonacciHeap<Integer, String> fibonacciHeap0 = FibonacciHeap.create();
		// Undeclared exception!
		try {
			fibonacciHeap0.add((Integer) fibonacciHeap0.MAX_CAPACITY, (String) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 4000)
	public void test11()  throws Throwable  {
		FibonacciHeap<Integer, String> fibonacciHeap0 = FibonacciHeap.create();
		FibonacciHeap<String, String> fibonacciHeap1 = FibonacciHeap.create();
		fibonacciHeap0.add((Integer) fibonacciHeap1.MAX_CAPACITY, "Heaps that use different comparators can't be merged.");
		fibonacciHeap0.add((Integer) Integer.MAX_VALUE, "+}@'5]l*");
		assertEquals(2, fibonacciHeap0.size());
	}
}
