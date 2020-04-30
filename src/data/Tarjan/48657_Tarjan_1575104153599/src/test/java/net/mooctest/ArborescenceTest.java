package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class ArborescenceTest {

	@Test
	public void testHashCode() {
		
	}

	@Test
	public void testOf() {
		ImmutableMap<Integer, Integer> parents = new ImmutableMap.Builder<Integer,Integer>().build();
		Arborescence<Integer> arborescence = Arborescence.of(parents);
		assertSame(parents, arborescence.parents);
	}

	@Test
	public void testEmpty() {
		Arborescence<Integer> arborescence = Arborescence.empty();
		boolean condition = arborescence.parents.isEmpty();
		assertTrue(condition);
	}

	@Test
	public void testContains1() {
		ImmutableMap<Integer, Integer> parents = new ImmutableMap.Builder<Integer,Integer>().build();
		Arborescence<Integer> arborescence = Arborescence.of(parents);
		Edge<Integer> e = new Edge<Integer>(1, 1);
		boolean condition = arborescence.contains(e);
		assertFalse(condition);
	}
	
	@Test
	public void testContains2() {
		ImmutableMap<Integer, Integer> parents = new ImmutableMap.Builder<Integer,Integer>().build();
		parents = parents.of(1, 1);
		Arborescence<Integer> arborescence = Arborescence.of(parents);
		Edge<Integer> e = new Edge<Integer>(1, 1);
		boolean condition = arborescence.contains(e);
		assertTrue(condition);
	}
	
	@Test
	public void testContains3() {
		ImmutableMap<Integer, Integer> parents = new ImmutableMap.Builder<Integer,Integer>().build();
		parents = parents.of(1, 1);
		Arborescence<Integer> arborescence = Arborescence.of(parents);
		Edge<Integer> e = new Edge<Integer>(2, 1);
		boolean condition = arborescence.contains(e);
		assertFalse(condition);
	}
	
	@Test
	public void testContains4() {
		ImmutableMap<Integer, Integer> parents = new ImmutableMap.Builder<Integer,Integer>().build();
		parents = parents.of(1, 1);
		Arborescence<Integer> arborescence = Arborescence.of(parents);
		Edge<Integer> e = new Edge<Integer>(1, 2);
		boolean condition = arborescence.contains(e);
		assertFalse(condition);
	}

	@Test
	public void testToString() {
		ImmutableMap<Integer, Integer> parents = new ImmutableMap.Builder<Integer,Integer>().build();
		parents = parents.of(1, 1);
		Arborescence<Integer> arborescence = Arborescence.of(parents);
		String actual = arborescence.toString();
		assertEquals("Arborescence{1 -> 1}", actual);
	}

	@Test
	public void testEqualsObject1() {
		ImmutableMap<Integer, Integer> parents = new ImmutableMap.Builder<Integer,Integer>().build();
		parents = parents.of(1, 1);
		Arborescence<Integer> arborescence = Arborescence.of(parents);
		boolean condition = arborescence.equals(arborescence);
		assertTrue(condition);
	}

	@Test
	public void testEqualsObject2() {
		ImmutableMap<Integer, Integer> parents = new ImmutableMap.Builder<Integer,Integer>().build();
		parents = parents.of(1, 1);
		Arborescence<Integer> arborescence = Arborescence.of(parents);
		boolean condition = arborescence.equals(null);
		assertFalse(condition);
	}
	
	@Test
	public void testEqualsObject3() {
		ImmutableMap<Integer, Integer> parents = new ImmutableMap.Builder<Integer,Integer>().build();
		parents = parents.of(1, 1);
		Arborescence<Integer> arborescence = Arborescence.of(parents);
		boolean condition = arborescence.equals("null");
		assertFalse(condition);
	}
	
	@Test
	public void testEqualsObject4() {
		ImmutableMap<Integer, Integer> parents = new ImmutableMap.Builder<Integer,Integer>().build();
		parents = parents.of(1, 1);
		Arborescence<Integer> arborescence = Arborescence.of(parents);
		ImmutableMap<Integer, Integer> parents2 = new ImmutableMap.Builder<Integer,Integer>().build();
		Arborescence<Integer> arborescence2 = Arborescence.of(parents2);
		boolean condition = arborescence.equals(arborescence2);
		assertFalse(condition);
	}
	
	@Test
	public void testEqualsObject5() {
		ImmutableMap<Integer, Integer> parents = new ImmutableMap.Builder<Integer,Integer>().build();
		parents = parents.of(1, 1);
		Arborescence<Integer> arborescence = Arborescence.of(parents);
		ImmutableMap<Integer, Integer> parents2 = new ImmutableMap.Builder<Integer,Integer>().build();
		parents = parents.of(2, 1);
		Arborescence<Integer> arborescence2 = Arborescence.of(parents2);
		boolean condition = arborescence.equals(arborescence2);
		assertFalse(condition);
	}
	
	@Test
	public void testEqualsObject6() {
		ImmutableMap<Integer, Integer> parents = new ImmutableMap.Builder<Integer,Integer>().build();
		parents = parents.of(1, 1);
		Arborescence<Integer> arborescence = Arborescence.of(parents);
		ImmutableMap<Integer, Integer> parents2 = new ImmutableMap.Builder<Integer,Integer>().build();
		parents = parents.of(1, 2);
		Arborescence<Integer> arborescence2 = Arborescence.of(parents2);
		boolean condition = arborescence.equals(arborescence2);
		assertFalse(condition);
	}
	
	@Test
	public void testEqualsObject7() {
		ImmutableMap<Integer, Integer> parents = new ImmutableMap.Builder<Integer,Integer>().build();
		parents = parents.of(1, 1);
		Arborescence<Integer> arborescence = Arborescence.of(parents);
		Arborescence<Integer> arborescence2 = Arborescence.of(parents);
		boolean condition = arborescence.equals(arborescence2);
		assertTrue(condition);
	}
	
}
