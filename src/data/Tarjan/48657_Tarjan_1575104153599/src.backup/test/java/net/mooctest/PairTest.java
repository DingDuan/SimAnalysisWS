package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class PairTest {

	@Test
	public void testHashCode() {
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(0, 1);
		int actual = pair.hashCode();
		assertEquals(962, actual);
	}

	@Test
	public void testPair() {
		Integer first = 0;
		Integer second = 0;
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(first, second);
		assertSame(first, pair.first);
		assertSame(second, pair.second);
	}

	@Test
	public void testOf() {
		Integer first = 5;
		Integer second = 6;
		Pair<Integer, Integer> of = Pair.of(5, 6);
		assertSame(first, of.first);
		assertSame(second, of.second);
	}

	@Test
	public void testEqualsObject1() {
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(0, 1);
		boolean condition = pair.equals(null);
		assertFalse(condition);
	}
	
	@Test
	public void testEqualsObject2() {
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(0, 1);
		boolean condition = pair.equals("null");
		assertFalse(condition);
	}

	@Test
	public void testEqualsObject3() {
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(0, 1);
		Pair<Integer, Integer> pair2 = new Pair<Integer, Integer>(0, 1);
		boolean condition = pair.equals(pair2);
		assertTrue(condition);
	}
	
	@Test
	public void testEqualsObject4() {
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(0, 1);
		Pair<Integer, Integer> pair2 = new Pair<Integer, Integer>(1, 1);
		boolean condition = pair.equals(pair2);
		assertFalse(condition);
	}
	
	@Test
	public void testEqualsObject5() {
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(0, 1);
		Pair<Integer, Integer> pair2 = new Pair<Integer, Integer>(0, 0);
		boolean condition = pair.equals(pair2);
		assertFalse(condition);
	}
	
	@Test
	public void testToString() {
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(0, 1);
		String actual = pair.toString();
		assertEquals("Pair{first=0, second=1}", actual);
	}

}
