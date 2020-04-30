package net.mooctest;

import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FibonacciQueueTest
{
    FibonacciQueue<Integer> queue = FibonacciQueue.create();

    private void setupEntity()
    {
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);

    }


    @Test(timeout = 4000)
    public void test0()
    {
        FibonacciQueue<Integer> queue1 = FibonacciQueue.create(Ordering.natural());
        FibonacciQueue<Integer> queue2 = FibonacciQueue.create();
        assertEquals(queue1.comparator(), queue2.comparator());
    }
    @Test(timeout = 4000)
    public void test1()
    {
        setupEntity();
        assertEquals(6,queue.size());
        Integer tmp;
        for (int i = 0; i <= 6; i++)
        {
            tmp = queue.peek();
            queue.poll();
            if(tmp == null)
                break;
            if (i < 6)
                assertEquals(i+1, (long)tmp);
        }

        queue.iterator();
    }

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
        fibonacciQueue0.offer("");
        int int0 = fibonacciQueue0.size();
        assertEquals(1, int0);
    }


    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
        fibonacciQueue0.offer("");
        String string0 = fibonacciQueue0.poll();
        assertEquals("", string0);
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
        }
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
        fibonacciQueue0.offer("@=K>@[=@m1i:It;%");
        String string0 = fibonacciQueue0.peek();
        assertEquals("@=K>@[=@m1i:It;%", string0);
    }
}
