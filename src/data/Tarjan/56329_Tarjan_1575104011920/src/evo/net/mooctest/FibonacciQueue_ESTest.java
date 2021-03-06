/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:18:43 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.Iterator;
import net.mooctest.FibonacciHeap;
import net.mooctest.FibonacciQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FibonacciQueue_ESTest extends FibonacciQueue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      FibonacciQueue<FibonacciHeap.Entry> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super FibonacciHeap.Entry>) comparator0);
      int int0 = fibonacciQueue0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create();
      Integer integer0 = new Integer((-369));
      fibonacciQueue0.offer(integer0);
      int int0 = fibonacciQueue0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
      fibonacciQueue0.offer("]6$h");
      Object object0 = fibonacciQueue0.poll();
      assertEquals("]6$h", object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Integer>) comparator0);
      Iterator<Integer> iterator0 = fibonacciQueue0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super String>) comparator0);
      // Undeclared exception!
      try { 
        fibonacciQueue0.offer((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        FibonacciQueue.create((Comparator<? super FibonacciHeap.Entry>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super String>) comparator0);
      String string0 = fibonacciQueue0.peek();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      FibonacciQueue<FibonacciHeap.Entry> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super FibonacciHeap.Entry>) comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      FibonacciQueue<Object> fibonacciQueue1 = FibonacciQueue.create((Comparator<? super Object>) comparator1);
      Object object0 = new Object();
      boolean boolean0 = fibonacciQueue1.offer(object0);
      boolean boolean1 = fibonacciQueue1.remove(fibonacciQueue0);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
      Comparator<? super Object> comparator1 = fibonacciQueue0.comparator();
      FibonacciQueue<Integer> fibonacciQueue1 = FibonacciQueue.create((Comparator<? super Integer>) comparator1);
      Integer integer0 = new Integer((-1849));
      fibonacciQueue1.offer(integer0);
      Integer integer1 = fibonacciQueue1.peek();
      assertEquals((-1849), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
      String string0 = fibonacciQueue0.poll();
      assertNull(string0);
  }
}
