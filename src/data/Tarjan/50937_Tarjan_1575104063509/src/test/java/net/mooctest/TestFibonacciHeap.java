package net.mooctest;


import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.function.Consumer;


import org.junit.Test;

public class TestFibonacciHeap {

	 @Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
	      FibonacciHeap<Object, String> fibonacciHeap1 = FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
	      FibonacciHeap<Object, String> fibonacciHeap2 = FibonacciHeap.merge(fibonacciHeap1, fibonacciHeap0);
	      assertNotSame(fibonacciHeap2, fibonacciHeap1);
	      assertEquals(0, fibonacciHeap2.size());
	  }

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      FibonacciHeap<Object, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      Integer integer0 = new Integer(0);
	      fibonacciHeap0.add(integer0, integer0);
	      int int0 = fibonacciHeap0.size();
	      assertEquals(1, int0);
	  }

	


	
	

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      FibonacciHeap<Integer, String> fibonacciHeap0 = FibonacciHeap.create();
	      fibonacciHeap0.comparator();
	      assertEquals(0, fibonacciHeap0.size());
	  }

	


	
	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {
	      FibonacciHeap<FibonacciHeap<String, String>, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      FibonacciHeap<String, String> fibonacciHeap1 = FibonacciHeap.create();
	      Integer integer0 = new Integer(0);
	      fibonacciHeap0.add(fibonacciHeap1, integer0);
	      boolean boolean0 = fibonacciHeap0.isEmpty();
	      assertEquals(1, fibonacciHeap0.size());
	      assertFalse(boolean0);
	  }




	  @Test(timeout = 4000)
	  public void test15()  throws Throwable  {
	      FibonacciHeap<FibonacciHeap<String, String>, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      FibonacciHeap<String, String> fibonacciHeap1 = FibonacciHeap.create();
	      Integer integer0 = new Integer(0);
	      fibonacciHeap0.add(fibonacciHeap1, integer0);
	      fibonacciHeap0.iterator();
	      assertEquals(1, fibonacciHeap0.size());
	  }

	  @Test(timeout = 4000)
	  public void test16()  throws Throwable  {
	      FibonacciHeap<Object, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      int int0 = fibonacciHeap0.size();
	      assertEquals(0, int0);
	  }

	  @Test(timeout = 4000)
	  public void test18()  throws Throwable  {
	      FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
	      // Undeclared exception!
	      
	  }




	  @Test(timeout = 4000)
	  public void test28()  throws Throwable  {
	      FibonacciHeap<Integer, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      Integer integer0 = new Integer(0);
	      fibonacciHeap0.add(integer0, integer0);
	      fibonacciHeap0.add(integer0, integer0);
	      fibonacciHeap0.pollOption();
	      assertEquals(1, fibonacciHeap0.size());
	  }

	  @Test(timeout = 4000)
	  public void test29()  throws Throwable  {
	      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
	      fibonacciHeap0.add("", "");
	      int int0 = fibonacciHeap0.size();
	      assertEquals(1, int0);
	  }

	 



	 

	  @Test(timeout = 4000)
	  public void test32()  throws Throwable  {
	      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
	      // Undeclared exception!
	     
	  }

	

	 
	 
	  @Test(timeout = 4000)
	  public void test39()  throws Throwable  {
	      FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      boolean boolean0 = fibonacciHeap0.isEmpty();
	      assertTrue(boolean0);
	      assertEquals(0, fibonacciHeap0.size());
	  }

	
	  @Test(timeout = 4000)
	  public void test41()  throws Throwable  {
	      FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
	      int int0 = fibonacciHeap0.size();
	      assertEquals(0, int0);
	  }


	  @Test(timeout = 4000)
	  public void test21()  throws Throwable  {
	      FibonacciHeap<Integer, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      Integer integer0 = new Integer(0);
	      fibonacciHeap0.add(integer0, integer0);
	      FibonacciHeap<Integer, Integer> fibonacciHeap1 = FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
	      fibonacciHeap1.pollOption();
	      assertEquals(1, fibonacciHeap0.size());
	      assertEquals(1, fibonacciHeap1.size());
	  }

	


	  @Test(timeout = 4000)
	  public void test24()  throws Throwable  {
	      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
	      FibonacciHeap<String, String> fibonacciHeap1 = FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
	      fibonacciHeap0.add("", "");
	      FibonacciHeap.merge(fibonacciHeap1, fibonacciHeap0);
	      assertEquals(1, fibonacciHeap0.size());
	  }
}
