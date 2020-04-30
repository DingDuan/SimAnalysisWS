package net.mooctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class TestTarjan {

	@Test(timeout=4000)
	public void test0() { // Arborescence
		String sep = System.getProperty("line.separator");
		
		ImmutableMap.Builder<Integer,Integer> immutableMap = new ImmutableMap.Builder<Integer,Integer>();
		immutableMap.put(1, 2);
		immutableMap.put(6, 7);
		immutableMap.put(5, 4);
		ImmutableMap<Integer, Integer> immutableMap2 = immutableMap.build();
		
		Arborescence<Integer> arborescence = Arborescence.of(immutableMap2);
		assertEquals(3, arborescence.parents.size());
		
		assertEquals("Arborescence{2 -> 1, 7 -> 6, 4 -> 5}", arborescence.toString());
		assertEquals(36, arborescence.hashCode());
		
		Arborescence<Integer> empty = Arborescence.empty();
		assertFalse(arborescence.equals(null));
		assertFalse(arborescence.equals(new Integer(0)));
		assertFalse(arborescence.equals(empty));
		
		Arborescence<Integer> empty2 = Arborescence.of(immutableMap2);
		assertTrue(arborescence.equals(empty2));
		assertTrue(arborescence.equals(arborescence));
		
		Edge<Integer> dEdge = new Edge<Integer>(2, 5);
		Edge<Integer> dEdge2 = new Edge<Integer>(2, 1);
		Edge<Integer> dEdge3 = new Edge<Integer>(2, 5);
		Edge<Integer> dEdge4 = new Edge<Integer>(9, 9);
		assertFalse(arborescence.contains(dEdge));
		assertTrue(arborescence.contains(dEdge2));
		assertFalse(arborescence.contains(dEdge3));
		assertFalse(arborescence.contains(dEdge4));
		
	}

	@Test(timeout=4000)
	public void test4() { // Pair and Partition
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(1, 3);
		assertEquals(995, pair.hashCode());
		assertEquals("Pair{first=1, second=3}", pair.toString());
		assertFalse(pair.equals(new Integer(0)));
		
		Pair<Integer, Integer> of = Pair.of(1, 3);
		assertTrue(pair.equals(of));
		Pair<Integer, Integer> of2 = Pair.of(1, 4);
		assertFalse(pair.equals(of2));
		Pair<Integer, Integer> of3 = Pair.of(3, 3);
		assertFalse(pair.equals(of3));
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(5);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(4);
		Partition<Integer> singletons = Partition.singletons(arrayList);
		assertEquals(5, singletons.getNodes().size());
		
		assertEquals(new Integer(1), singletons.merge(1, 1));
		
		assertEquals(new Integer(4), singletons.componentOf(4));
		assertEquals(new Integer(2), singletons.componentOf(2));

		assertTrue(singletons.sameComponent(4, 4));
		assertFalse(singletons.sameComponent(1, 3));
		
		assertEquals(new Integer(1), singletons.merge(1, 3));
		assertEquals(new Integer(5), singletons.merge(5, 4));
		
		assertEquals(new Integer(1), singletons.componentOf(3));
		assertEquals(new Integer(5), singletons.merge(5, 2));
		assertEquals(new Integer(1), singletons.merge(1, 5));
	}
	
	@Test(timeout=4000)
	public void test5() { // DenseWeightedGraph
		
	}
	
	
	@Test(timeout=4000)
	public void test6() { // Weighted
		Weighted<Integer> weighted0 = new Weighted<Integer>(0, 1);
		assertEquals(1072694209, weighted0.hashCode());
		assertEquals("Weighted{val=0, weight=1.0}", weighted0.toString());
		
		assertFalse(weighted0.equals(new Integer(0)));
		
		Weighted<Integer> weighted1 = Weighted.weighted(0, 1);
		assertEquals(0, weighted0.compareTo(weighted1));
		assertTrue(weighted0.equals(weighted1));
		
		Weighted<Integer> weighted2 = Weighted.weighted(1, 1);
		Weighted<Integer> weighted3 = Weighted.weighted(0, 3);
		assertFalse(weighted0.equals(weighted2));
		assertFalse(weighted0.equals(weighted3));
	}
	
	@Test(timeout=4000)
	public void test7() { // DenseWeightedGraph
		
	}
}
