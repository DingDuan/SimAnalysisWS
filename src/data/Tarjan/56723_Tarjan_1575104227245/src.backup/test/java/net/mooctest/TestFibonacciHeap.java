package net.mooctest;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.annotation.Target;
import java.util.TreeSet;

import javax.swing.text.html.ParagraphView;

import org.junit.Assert;
import org.junit.Test;


public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		
		heap.add(1, 2);
		assertEquals(1, heap.size());
		heap.clear();
		assertEquals(0, heap.size());
		
		Edge<Integer> edge=new Edge<Integer>(1,2); 
		Assert.assertNotNull(edge);
		edge.equals(null);
		assertEquals(false, edge.equals(null));
		
		Weighted<Integer> weight=new Weighted<Integer>(1, 10);
		assertFalse(weight.equals(10));
		weight.equals(10);
		
		Arborescence<Integer> arborescence =Arborescence.empty();
		
		
		
	
		TreeSet<Integer> set = new TreeSet<>();
	    assertEquals(set.isEmpty(), heap.isEmpty());
	
		for (int src = 0; src < 30; src++) {
			set.add(src);
			heap.add(src, src);
		}
		assertEquals(set.size(), heap.size());
		set.clear();
		heap.clear();
		assertEquals(set.size(), heap.size());
	
	
		for (int src = 0 ,i=0; src < 200; ++src,++i) {
			assertEquals(set.size(), heap.size());
			
			assertEquals(set.size(), heap.size());
		}
		heap.add(2,3);
		Object[] firstChild= {2,3};
		Assert.assertNotEquals(firstChild, heap());
	}
	private Object[] heap() {
		// TODO Auto-generated method stub
		return null;
	}
	FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
	TreeSet<Integer> set = new TreeSet<>();
	
	public void before(){
		heap.clear();
		set.clear();
	}
}
