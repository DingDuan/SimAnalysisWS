/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 13:37:43 GMT+08:00 2019
 */

package net.mooctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

import org.junit.Test;
import org.junit.runner.RunWith;

public class FibonacciQueueTest_{

  @Test(timeout = 4000)
  public void test_E00()  throws Throwable  {
      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
      fibonacciQueue0.add("");
      String string0 = fibonacciQueue0.poll();
      assertFalse(fibonacciQueue0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test_E01()  throws Throwable  {
      FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create();
      Integer integer0 = new Integer(0);
      fibonacciQueue0.offer(integer0);
      int int0 = fibonacciQueue0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_E02()  throws Throwable  {
      FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create();
      Iterator<Integer> iterator0 = fibonacciQueue0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_E04()  throws Throwable  {
      // Undeclared exception!
      try { 
        FibonacciQueue.create((Comparator<? super Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         
      }
  }

  @Test(timeout = 4000)
  public void test_E05()  throws Throwable  {
      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
      String string0 = fibonacciQueue0.peek();
      assertNull(string0);
  }


  @Test(timeout = 4000)
  public void test_E07()  throws Throwable  {
      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
      int int0 = fibonacciQueue0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_E08()  throws Throwable  {
      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
      fibonacciQueue0.add("");
      String string0 = fibonacciQueue0.peek();
      assertTrue(fibonacciQueue0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test_E09()  throws Throwable  {
      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
      Comparator<? super String> comparator0 = fibonacciQueue0.comparator();
      assertNotNull(comparator0);
  }
}
