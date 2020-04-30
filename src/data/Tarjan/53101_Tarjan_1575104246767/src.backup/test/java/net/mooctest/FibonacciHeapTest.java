package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

import net.mooctest.FibonacciHeap.Entry;

import org.junit.Test;

public class FibonacciHeapTest {

	@Test(timeout = 4000)
	public void test01() {
		FibonacciHeap f1 = FibonacciHeap.create();
		Comparator c1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};
		FibonacciHeap f2 = FibonacciHeap.create(c1);
		f2.comparator();
	}
	
	@Test(timeout = 4000)
	public void test02(){
		FibonacciHeap f1 = FibonacciHeap.create();
		f1.add(1, 1);
		f1.add(2, 2);
		f1.add(3, 3);
		assertEquals(3, f1.size());
		f1.clear();
		assertEquals(0, f1.size());
	}
	

	@Test(timeout = 4000)
	public void test03(){
		FibonacciHeap f1 = FibonacciHeap.create();
		f1.add(1, 1);
		f1.add(2, 2);
		f1.add(3, 3);
		assertEquals("Optional.of(1)", f1.pollOption().toString());
		assertEquals("Optional.of(2)", f1.pollOption().toString());
		assertEquals("Optional.of(3)", f1.pollOption().toString());
	}
	
	@Test(timeout = 4000)
	public void test04(){
		FibonacciHeap f1 = FibonacciHeap.create();
		f1.add(1, 1);
		assertEquals("Optional.of(1)", f1.pollOption().toString());
		assertEquals("Optional.absent()", f1.peekOption().toString());
	}
	
	@Test(timeout = 4000)
	public void test05(){
		FibonacciHeap f1 = FibonacciHeap.create();
		f1.add(1, 1);
		assertFalse(f1.isEmpty());
		FibonacciHeap f2 = FibonacciHeap.create();
		assertTrue(f2.isEmpty());
	}
	
	
	
}
