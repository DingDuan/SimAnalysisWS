package net.mooctest;
import static org.junit.Assert.assertEquals;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import net.mooctest.FibonacciHeap.Entry;


public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		
		heap.pollOption();
		Optional<Entry> oEntry = null;
//		oEntry.asSet();
		
		
		Iterator<FibonacciHeap<Integer, Integer>.Entry> a = heap.iterator();
		
		
	}

	@Test
	public void testArborescence() {
		
//		ImmutableMap<Integer, Integer> parents;
		ImmutableMap<Integer,Integer> parents = new ImmutableMap.Builder<Integer,Integer>().build();
		parents.of(1, 1);
		parents.of(2, 2);
		Arborescence<Integer> ab = Arborescence.of(parents);
		Arborescence<Integer> ab1 = Arborescence.of(parents);
		
		int a = 1;
		int b = 2;
		Edge e = new Edge(a, b);
		Edge e1 = new Edge(2, 2);
		Edge e2 = new Edge(3, 3);
		Edge e3 = new Edge(0, 0);
		
		assertEquals(ab.contains(e),false);
		assertEquals(ab.contains(e1),false);
		assertEquals(ab.contains(e2),false);
		assertEquals(ab.contains(e3),false);
		
		ab.toString();
		assertEquals(ab.equals(e1),false);
		assertEquals(ab.equals(null),false);
		assertEquals(ab.equals(ab1),true);
		assertEquals(ab.equals(ab),true);

	}
	
	
	@Test
	public void testPair() {
		int a = 1;
		int b = 2;
		Pair p = new Pair(a, b);
		Pair p1 = new Pair(a, b);
		
		Pair p2 = new Pair(a, 3);
		Pair p3 = new Pair(3, b);
		Pair p4 = new Pair(3, 3);
//		Pair p5 = new Pair(a, b);
		
		assertEquals(p.equals(1.2), false);
		assertEquals(p.equals(p1), true);
		assertEquals(p.equals(p2), false);
		assertEquals(p.equals(p3), false);
		assertEquals(p.equals(p4), false);
//		assertEquals(p.equals(p5), true);
		
	}
	
	
	@Test
	public void testWei() {
		int a = 1;
		double b = 2.0;
		Weighted w = new Weighted(a, b);
		Weighted w1 = new Weighted(a, b);
		
		Weighted w2 = new Weighted(2, b);
		Weighted w3 = new Weighted(a, 3.3);
		Weighted w4 = new Weighted(2, 3.3);
		
		
		
		assertEquals(w.equals(2.0), false);
		assertEquals(w.equals(w1), true);
		assertEquals(w.equals(w2), false);
		assertEquals(w.equals(w3), false);
		assertEquals(w.equals(w4), false);
		
		
	}
	
	
	
	@Test
	public void testEdge() {
		int a = 1;
		int b = 2;
		Edge e = new Edge(a, b);
		Edge e1 = new Edge(a, b);
		Pair p = new Pair(a, b);
		
		Edge e2 = new Edge(3, b);
		Edge e3 = new Edge(a, 3);
		Edge e4 = new Edge(3, 3);
		
		assertEquals(e.equals(null), false);
		assertEquals(e.equals(e1), true);
		assertEquals(e.equals(e2), false);
		assertEquals(e.equals(e3), false);
		assertEquals(e.equals(e4), false);
		
		assertEquals(e.equals(p), false);
		
		
		
	}
	
	
	@Test
	public void testEdge1() {
//		Collection<Integer> nodes = null;
		Collection<Integer>nodes=new ArrayList<Integer>(Arrays.asList(1,2,3));

		Partition<Integer> pa = Partition.singletons(nodes);
		EdgeQueueMap<Integer> e = new EdgeQueueMap(pa);
		
		int a = 1;
		double b = 2.0;
//		Edge e1 = new Edge(a, b);
		
//		Weighted w = new Weighted(e1);
//		Weighted w1 = new Weighted(e1);
//		e.addEdge(new Weighted<Edge<Integer>>(a,b));
//		e.addEdge(null);

		
		
	}
	
	
	@Test
	public void test1() {
//		int a = 1;
//		int b = 2;
//		Edge e = new Edge(a, b);
//		List<Integer> l = new List();
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		ExclusiveEdge<Integer> ex = new ExclusiveEdge(e,);
//		
		
	}
	
	
	
}
