package net.mooctest;

import static org.junit.Assert.*;

import java.text.RuleBasedCollator;
import java.util.Comparator;
import java.util.Iterator;

import org.junit.Test;

public class FibonacciQueueTest {

	
	

	@Test
	public void testCreate_1()
		throws Exception {

		FibonacciQueue<Comparable> result = FibonacciQueue.create();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the FibonacciQueue<Object> create(Comparator<? super C>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 19-11-30 下午4:26
	 */
	
	
	
	 @Test(expected = java.lang.NullPointerException.class)
	public void testOffer_1()
		throws Exception {
		FibonacciQueue fixture = FibonacciQueue.create(null);

		boolean result = fixture.offer(null);

		
		assertTrue(result);
	}

	
	 @Test(expected = java.lang.NullPointerException.class)
	public void testOffer_2()
		throws Exception {
		FibonacciQueue fixture = FibonacciQueue.create(null);

		boolean result = fixture.offer(null);

		
		assertTrue(result);
	}

	
	
}
