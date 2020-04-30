package net.mooctest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static net.mooctest.Edge.*;
import java.util.Comparator;
import java.util.HashSet;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import net.mooctest.FibonacciHeap.Entry;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.junit.Test;
import static net.mooctest.FibonacciHeap.*;


public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		Comparator a=heap.comparator();
		FibonacciHeap<Integer,Integer> h = FibonacciHeap.create(a);
		assertTrue(h.isEmpty());
		h.add(new Integer(3),new Integer(4));
		h.add(new Integer(4),new Integer(5));
		h.add(new Integer(5),new Integer(6));
		Comparator a2=h.comparator();
		h.peekOption();
		h.pollOption();
		Iterator e2=h.iterator();
		assertEquals(2,h.size());
//		h.remove(null);
		h.clear();
//		h.decreasePriority(Entry(e2.next()), a);
//		FibonacciHeap.merge(h, a);
	}
	
	@Test
	public void test2() {
		Edge<Integer> e=new Edge<Integer>(new Integer(3),new Integer(4));
		Edge.EdgeBuilder<Integer> ed=Edge.from(new Integer(4));
		ed.to(new Integer(5));
		assertEquals(1058,e.hashCode());
		assertEquals("Edge{source=3, destination=4}",e.toString());
		assertFalse(e.equals(new Integer(3)));
		assertFalse(e.equals(null));
		Edge<Integer> e2=new Edge<Integer>(new Integer(4),new Integer(4));
		assertFalse(e.equals(e2));
		Edge<Integer> e3=new Edge<Integer>(new Integer(3),new Integer(6));
		assertFalse(e.equals(e3));
		Edge<Integer> e4=new Edge<Integer>(new Integer(3),new Integer(4));
		Edge<Integer> e5=new Edge<Integer>(new Integer(3),new Integer(4));
		assertFalse(e5.equals(e4));
		Object o=3;
		Object o2=4;
		Edge<Object> eo=new Edge<Object>(o,o2);
		Edge.isAutoCycle().apply(eo);
		Edge.hasDestination(e);
		Set<Edge<Integer>> set=new HashSet<Edge<Integer>>();
		set.add(e);
		Edge.competesWith(set).apply(e);
		Edge.isIn(set).apply(e);
	}

	
}
