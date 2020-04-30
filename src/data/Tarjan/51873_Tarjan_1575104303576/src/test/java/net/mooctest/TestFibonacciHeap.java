package net.mooctest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.ParagraphView;

import org.junit.Test;

import net.mooctest.EdgeQueueMap.EdgeQueue;
import net.mooctest.FibonacciHeap.Entry;

public class TestFibonacciHeap {
	FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();

	@Test(timeout = 4000)
	public void test1() throws NoSuchMethodException, SecurityException {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> heap2 = FibonacciHeap.create();

		assertNotEquals(null, heap.comparator().getClass());
		heap.clear();
		assertEquals(true, heap.isEmpty());
		heap.add(1, 2);
		heap.peekOption();
		heap.pollOption();
		assertEquals(0, heap.size());
		heap.merge(heap2, heap);
		assertNotEquals(null,heap.iterator());
		Class class1 = FibonacciHeap.class;
		Method method = class1.getDeclaredMethod("getCycle", Entry.class);
		
	}
	@Test(timeout = 4000)
	public void test2(){
		Edge edge = new Edge<Integer>(1, 2);
		Edge edge2 = new Edge<Integer>(2, 1);

		Edge.from(1);
		assertEquals(994, edge.hashCode());
		edge.toString();
		assertFalse(edge.equals(null));
		assertTrue(edge.equals(edge));
		assertFalse(edge.equals(new Integer(10)));
		edge.isAutoCycle();
		Set set = new HashSet();
		set.add(edge);
		edge.isIn(set);
		
	}
	@Test(timeout = 4000)
	public void test3() {
		Pair pair = new Pair(1, 2);
		Pair pair2 = Pair.of(1, 2);
		assertEquals(false, pair.equals(new Object()));
		assertTrue(pair.equals(pair));
		assertEquals(994, pair.hashCode());
		pair.toString();
	}
	@Test(timeout = 4000)
	public void test4() {
		Weighted weighted = new Weighted(1, 1.2);
		Weighted weighted2 = Weighted.weighted(1, 1.9);
		assertEquals(1, weighted.compareTo(weighted2));
		assertEquals(true,weighted.equals(weighted));
		assertFalse(weighted.equals(new Object()));
		assertEquals(213910496, weighted.hashCode());
		weighted.toString();
	}
	@Test(timeout = 4000)
	public void test5() {
		Comparator comparator = new Comparator<Entry>() {
			public int compare(Entry o1, Entry o2) {
				return 0;
				
			};
		};
		FibonacciQueue fibonacciQueue = FibonacciQueue.create(comparator);
		FibonacciQueue fibonacciQueue2 = FibonacciQueue.create();
		fibonacciQueue.comparator();
		assertEquals(null, fibonacciQueue.peek());
		assertEquals(true, fibonacciQueue.add(1));
		fibonacciQueue.clear();
		List list = new ArrayList();
		assertTrue(list.add(1));
		assertTrue(fibonacciQueue.addAll(list));
		assertEquals(1, fibonacciQueue.size());
		//fibonacciQueue.iterator();
		assertFalse(fibonacciQueue.isEmpty());
	}
	@Test(timeout = 4000)
	public void test6() {	
		List list = new ArrayList();
		assertTrue(list.add(1));
		list.add(2);
		Partition<Integer> partition = Partition.singletons(list);
		assertEquals(Integer.valueOf(1),partition.componentOf(1));
		///assertEquals(2, partition.componentOf(10));
		assertFalse(partition.sameComponent(1, 2));
		partition.getNodes();
		assertEquals(Integer.valueOf(1), partition.merge(1, 2));
		Object object = new Integer(1);
		EdgeQueue<Integer> edgeQueue = EdgeQueue.create(Integer.valueOf(1),partition);
		edgeQueue.hashCode();
		edgeQueue.toString();
		EdgeQueueMap<Integer> edgeQueueMap = new EdgeQueueMap<Integer>(partition);
	

	}
	@Test(timeout = 4000)
	public void test7() {
	}
	
}
