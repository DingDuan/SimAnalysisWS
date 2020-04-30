package net.mooctest;
import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;


public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		heap.comparator();
		heap.clear();
		//heap.remove(entry);
		//Arborescence<Integer> a = new Arborescence<Integer>();
		ChuLiuEdmonds c = new ChuLiuEdmonds();
		Edge e1 = new Edge(1, 2);
		Edge e2 = new Edge(1, 2);
		Edge e3 = new Edge(1, 3);
		Edge e4 = new Edge(2, 3);
		e1.hashCode();
		e1.toString();
		assertEquals(true, e1.equals(e2));
		assertEquals(false, e1.equals(e3));
		assertEquals(false, e1.equals(e4));
		assertEquals(false, e1.equals(null));
		//ExclusiveEdge<Integer> a1 = new Exclusive
		KBestArborescences a2 = new KBestArborescences();
		Pair<Integer,Integer> p1= new Pair(1,2);
		Pair<Integer,Integer> p3= new Pair(1,2);
		p1.toString();
		p1.hashCode();
		Pair<Integer,Integer> p2= new Pair(2,3);
		assertEquals(false, p1.equals(1));
		assertEquals(false, p1.equals(p2));
		assertEquals(true, p1.equals(p3));
		Weighted w1 = new Weighted<Integer>(1, 2.3);
		Weighted w2 = new Weighted<Integer>(1, 2.3);
		Weighted w3 = new Weighted<Integer>(1, 3.3);
		Weighted w4 = new Weighted<Integer>(2, 2.3);
		w1.compareTo(w2);
		assertEquals(false, w1.equals(3));
		assertEquals(true, w1.equals(w2));
		assertEquals(false, w1.equals(w3));
		assertEquals(false, w1.equals(w4));
		w1.hashCode();
		w1.toString();
	}
	
	
}
