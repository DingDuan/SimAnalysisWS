package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.*;

import com.google.common.base.Predicate;
import com.sun.org.apache.bcel.internal.generic.NEW;

import sun.security.x509.OIDMap;

public class TestFibonacciHeap 
{
	@Test
	public void test1()
	{
		{
			Arborescence<Integer> a1 = Arborescence.of(null);
			a1.empty();
			
			
		}
	}
	
	@Test
	public void testE()
	{
		{
			Edge<Integer> e1 = new Edge<Integer>(1, 2);
			Edge.EdgeBuilder<Integer> b1 = Edge.from(1);
			b1.to(1);
			e1.hashCode();
			e1.toString();
		}
		{
			Edge<Integer> e1 = new Edge<Integer>(1, 2);
			Edge<Integer> e2 = new Edge<Integer>(1, 2);
			assertTrue(e1.equals(e1));
		}
		{
			Edge<Integer> e1 = new Edge<Integer>(1, 2);
			Edge<Integer> e2 = new Edge<Integer>(1, 2);
			assertTrue(e1.equals(e2));
		}
		{
			Edge<Integer> e1 = new Edge<Integer>(1, 2);
			Edge<Integer> e2 = new Edge<Integer>(1, 2);
			assertFalse(e1.equals(new Object()));
		}
		{
			Edge<Integer> e1 = new Edge<Integer>(1, 2);
			Edge<Integer> e2 = new Edge<Integer>(1, 3);
			assertFalse(e1.equals(e2));
		}
		{
			Edge<Integer> e1 = new Edge<Integer>(1, 2);
			Edge<Integer> e2 = new Edge<Integer>(2, 2);
			assertFalse(e1.equals(e2));
		}
		{
			Edge<Integer> e1 = new Edge<Integer>(1, 2);
			Edge<Integer> e2 = new Edge<Integer>(1, 2);
			assertFalse(e1.equals(null));
		}
		{
			Predicate<Edge<Integer>> p1 = Edge.hasDestination(1);
			
		}
		{
			HashSet<Edge<Integer>> h1 =  new HashSet<Edge<Integer>>();
			h1.add(new Edge<Integer>(1,2));
			h1.add(new Edge<Integer>(2,3));
			h1.add(new Edge<Integer>(5,8));
			Predicate<Edge<Integer>> p1 = Edge.competesWith(h1);
			assertFalse(p1.apply(new Edge<Integer>(1,2)));
			assertTrue(p1.apply(new Edge<Integer>(5,2)));
			assertFalse(p1.apply(new Edge<Integer>(10,100)));	
		}
		{
			Predicate<Edge<Integer>> p1 = Edge.isAutoCycle();
			assertFalse(p1.apply(new Edge<Integer>(1,2)));
		}
		{
			HashSet<Edge<Integer>> h1 =  new HashSet<Edge<Integer>>();
			h1.add(new Edge<Integer>(1,2));
			h1.add(new Edge<Integer>(2,3));
			h1.add(new Edge<Integer>(5,8));
			Predicate<Edge<Integer>> p1 = Edge.isIn(h1);
			assertFalse(p1.apply(new Edge<Integer>(22,2)));
			assertTrue(p1.apply(new Edge<Integer>(1,2)));
		}
	}
	
	@Test
	public void testP()
	{
		{
			Pair<Integer, Integer> p1 = new Pair<Integer, Integer>(1, 2);
		}
		{
			Pair<Integer, Integer> p1 = Pair.of(1, 2);
		}
		{
			Pair<Integer, Integer> p1 = Pair.of(1, 2);
			Pair<Integer, Integer> p2 = Pair.of(1, 2);
			assertTrue(p1.equals(p1));
		}
		{
			Pair<Integer, Integer> p1 = Pair.of(1, 2);
			Pair<Integer, Integer> p2 = Pair.of(1, 2);
			assertTrue(p1.equals(p2));
		}
		{
			Pair<Integer, Integer> p1 = Pair.of(1, 2);
			Pair<Integer, Integer> p2 = Pair.of(1, 2);
			assertFalse(p1.equals(null));
		}
		{
			Pair<Integer, Integer> p1 = Pair.of(1, 2);
			Pair<Integer, Integer> p2 = Pair.of(1, 2);
			assertFalse(p1.equals(new Object()));
		}
		{
			Pair<Integer, Integer> p1 = Pair.of(1, 2);
			Pair<Integer, Integer> p2 = Pair.of(1, 3);
			assertFalse(p1.equals(p2));
		}
		{
			Pair<Integer, Integer> p1 = Pair.of(1, 2);
			Pair<Integer, Integer> p2 = Pair.of(3, 2);
			assertFalse(p1.equals(p2));
		}
		{
			Pair<Integer, Integer> p1 = Pair.of(1, 2);
			assertEquals(994,p1.hashCode());
		}
		{
			Pair<Integer, Integer> p1 = Pair.of(1, 2);
			assertEquals("Pair{first=1, second=2}",p1.toString());
		}

	}
	
	@Test
	public void testW()
	{
		{
			Weighted<Integer> w1 = new Weighted<Integer>(1, 1);
			
		}
		{
			Weighted<Integer> w1 = Weighted.weighted(1, 1);
			Weighted<Integer> w2 = Weighted.weighted(1, 1);
			assertEquals(0,w1.compareTo(w2));
		}
		{
			Weighted<Integer> w1 = Weighted.weighted(1, 1);
			Weighted<Integer> w2 = Weighted.weighted(1, 2);
			assertEquals(1,w1.compareTo(w2));
		}
		{
			Weighted<Integer> w1 = Weighted.weighted(1, 1);
			Weighted<Integer> w2 = Weighted.weighted(1, 0.5);
			assertEquals(-1,w1.compareTo(w2));
		}
		{
			Weighted<Integer> w1 = Weighted.weighted(1, 1);
			Weighted<Integer> w2 = Weighted.weighted(1, 1);
			assertTrue(w1.equals(w2));
		}
		{
			Weighted<Integer> w1 = Weighted.weighted(1, 1);
			Weighted<Integer> w2 = Weighted.weighted(1, 0.5);
			assertTrue(w1.equals(w1));
		}
		{
			Weighted<Integer> w1 = Weighted.weighted(1, 1);
			Weighted<Integer> w2 = Weighted.weighted(1, 0.5);
			assertFalse(w1.equals(w2));
		}
		{
			Weighted<Integer> w1 = Weighted.weighted(1, 1);
			Weighted<Integer> w2 = Weighted.weighted(1, 0.5);
			assertFalse(w1.equals(w2));
		}
		{
			Weighted<Integer> w1 = Weighted.weighted(1, 1);
			Weighted<Integer> w2 = Weighted.weighted(2, 1);
			assertFalse(w1.equals(w2));
		}
		{
			Weighted<Integer> w1 = Weighted.weighted(1, 1);
			Weighted<Integer> w2 = Weighted.weighted(1, 1);
			assertFalse(w1.equals(new Object()));
		}
		{
			Weighted<Integer> w1 = Weighted.weighted(1, 1);
			Weighted<Integer> w2 = Weighted.weighted(1, 0.5);
			assertFalse(w1.equals(null));
		}
		{
			Weighted<Integer> w1 = Weighted.weighted(1, 1);
			w1.hashCode();
			w1.toString();
		}
	}
	
	@Test
	public void testPT()
	{
		{
			List<Integer> lst = new ArrayList<Integer>();
			lst.add(12);
			lst.add(1);
			lst.add(2);
			lst.add(100);
			
			Partition<Integer> p1 = Partition.singletons(lst);
			p1.componentOf(1);
			p1.merge(1, 2);
			p1.sameComponent(1,2);
			p1.getNodes();
		}
	}
	
	@Test
	public void testSWG()
	{
		{
			List<Integer> lst = new ArrayList<Integer>();
			lst.add(12);
			lst.add(1);
			lst.add(2);
			lst.add(100);
			List<Object> lst2 = new ArrayList<>();
			lst2.add(new Weighted<Edge<Integer>>(new Edge<Integer>(1, 2),1));
			lst2.add(new Weighted<Edge<Integer>>(new Edge<Integer>(3, 4),1));
			lst2.add(new Weighted<Edge<Integer>>(new Edge<Integer>(10, 20),1));
		}
		{
			Set<Integer> lst = new HashSet<Integer>();
			lst.add(1);
			lst.add(2);
			lst.add(3);
			Map<Integer,Weighted<Edge<Integer>>> m = new HashMap<>();
			m.put(1, new Weighted<Edge<Integer>>(new Edge<Integer>(1, 2), 100));
			m.put(2, new Weighted<Edge<Integer>>(new Edge<Integer>(2, 2), 1));
			m.put(3, new Weighted<Edge<Integer>>(new Edge<Integer>(3, 2), 10));	
		}
	}
	
	@Test
	public void testFH()
	{
		{
			FibonacciHeap<Integer, Integer> f1  = null;
			f1 = FibonacciHeap.create((a,b)->{return a-b;});
			f1.add(1, 1);
			f1.add(3, 5);
			f1.add(2, 2);
			f1.add(13, 3);
			f1.add(100, 100);
			f1.add(15, 12);
			assertFalse(f1.isEmpty());
			f1.peekOption();
			f1.pollOption();
			f1.size();
			
			f1.clear();
			assertTrue(f1.isEmpty());
		
		}
		{
			FibonacciHeap<Integer, Integer> f1 = FibonacciHeap.create((a,b)->{return a-b;});
			FibonacciHeap<Integer, Integer> f2 = FibonacciHeap.create((a,b)->{return a-b;});
			f1.add(1, 1);
			f1.add(3, 5);
			f2.add(2, 2);
			f2.add(13, 3);
			f1.add(100, 100);
			f2.add(15, 12);
			FibonacciHeap.create();
			
//			f1.merge(f1, f2);
		}
	}
	
	@Test
	public void testFQ()
	{
		{
			FibonacciQueue f1 = FibonacciQueue.create();
			f1.add(1);
			f1.add(100);
			f1.add(5);
			f1.add(2);
			f1.add(15);
			f1.element();
			f1.comparator();
			f1.offer(1);
			f1.peek();
			f1.poll();
			f1.clear();
		}
	}
}
