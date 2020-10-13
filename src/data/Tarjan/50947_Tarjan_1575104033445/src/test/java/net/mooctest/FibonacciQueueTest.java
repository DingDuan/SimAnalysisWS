/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:46:11 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.Iterator;
import net.mooctest.FibonacciQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

public class FibonacciQueueTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Integer>) comparator0);
      Integer integer0 = new Integer((-1972));
      fibonacciQueue0.offer(integer0);
      int int0 = fibonacciQueue0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
      Object object0 = fibonacciQueue0.poll();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create();
      Integer integer0 = new Integer(1);
      fibonacciQueue0.add(integer0);
      Integer integer1 = fibonacciQueue0.poll();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create();
      Iterator<Integer> iterator0 = fibonacciQueue0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
      // Undeclared exception!
      try { 
        fibonacciQueue0.offer((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        FibonacciQueue.create((Comparator<? super Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
      Object object0 = new Object();
      fibonacciQueue0.offer(object0);
      Object object1 = fibonacciQueue0.peek();
      assertTrue(fibonacciQueue0.contains(object1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
      int int0 = fibonacciQueue0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create();
      Integer integer0 = new Integer((-1782));
      boolean boolean0 = fibonacciQueue0.offer(integer0);
      boolean boolean1 = fibonacciQueue0.contains(integer0);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create();
      Comparator<? super Integer> comparator0 = fibonacciQueue0.comparator();
      assertNotNull(comparator0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
      Object object0 = fibonacciQueue0.peek();
      assertNull(object0);
  }
}