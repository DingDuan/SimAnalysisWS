package net.mooctest;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Comparator;
//import static org.evosuite.runtime.EvoAssertions.*;
import net.mooctest.Weighted;
//import org.evosuite.runtime.EvoRunner;
//import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
public class FibonacciQueue_Test {
	@Test(timeout = 4000)
	  public void test0()  throws Throwable  {
		FibonacciQueue<Integer> f = FibonacciQueue.create();
		Comparator comparator =f.comparator();
		FibonacciQueue<Integer> f1 = FibonacciQueue.create(comparator);
		f1.parallelStream();
		f1.peek();
		f1.poll();
		f1.isEmpty();
		f1.size();
		f1.iterator();
		f1.toArray();
		f1.offer(1);
		
	}
}
