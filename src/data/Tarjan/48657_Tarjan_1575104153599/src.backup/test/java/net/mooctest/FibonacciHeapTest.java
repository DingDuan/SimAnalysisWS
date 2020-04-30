package net.mooctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.Comparator;

import org.junit.Test;

public class FibonacciHeapTest {
	 @Test
	  public void test00(){
		  FibonacciHeap<FibonacciHeap.Entry, String> fibonacciHeap0 = FibonacciHeap.create();
	      FibonacciHeap<FibonacciHeap.Entry, String> fibonacciHeap1 = FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
	      FibonacciHeap<FibonacciHeap.Entry, String> fibonacciHeap2 = FibonacciHeap.merge(fibonacciHeap1, fibonacciHeap0);
	      assertEquals(0, fibonacciHeap2.size());
	      assertNotSame(fibonacciHeap2, fibonacciHeap1);
	  }


	@Test
	  public void test01(){
		FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
	      fibonacciHeap0.iterator();
	      assertEquals(0, fibonacciHeap0.size());
}
}
