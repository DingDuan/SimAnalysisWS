package net.mooctest;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> fh1 = FibonacciHeap.create();
		assertTrue(fh1.isEmpty());
		fh1.add(1, 1);assertFalse(fh1.isEmpty());assertEquals(1,fh1.size());
		fh1.pollOption();
		fh1.add(2, 2);
		//System.out.println();
		fh1.pollOption();fh1.peekOption();
		fh1.clear();
		
		
		
		
		
		
		
		
		
		
		ChuLiuEdmonds cl1 = new ChuLiuEdmonds();
	}

	
}
