package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class t {

	@Test
	public void testHashCode() {
		Integer val = 0;
		double weight = 5;
		Weighted<Integer> weighted = new Weighted<Integer>(val, weight);
		int actual = weighted.hashCode();
		assertEquals(1075053505, actual);
	}

	@Test
	public void testWeighted() {
		Integer val = 0;
		double weight = 5;
		Weighted<Integer> weighted = new Weighted<Integer>(val, weight);
		assertSame(val, weighted.val);
		assertEquals(weight, weighted.weight, 2);
	}

	@Test
	public void testWeighted1() {
		Integer value = 0;
		double weight = 5;
		Weighted<Integer> weighted = Weighted.weighted(value, weight);
		assertSame(value, weighted.val);
		assertEquals(weight, weighted.weight, 2);
	}

	@Test
	public void testCompareTo1() {
		Integer val = 0;
		double weight = 5;
		Weighted<Integer> weighted = new Weighted<Integer>(val, weight);
		int actual = weighted.compareTo(weighted);
		assertEquals(0, actual);
	}
	
	@Test
	public void testCompareTo2() {
		Integer val = 0;
		double weight = 5;
		Weighted<Integer> weighted = new Weighted<Integer>(val, weight);
		Integer val2 = 0;
		double weight2 = 6;
		Weighted<Integer> weighted2 = new Weighted<Integer>(val2, weight2);
		int actual = weighted.compareTo(weighted2);
		assertEquals(1, actual);
	}
	
	@Test
	public void testCompareTo3() {
		Integer val = 0;
		double weight = 5;
		Weighted<Integer> weighted = new Weighted<Integer>(val, weight);
		Integer val2 = 1;
		double weight2 = 5;
		Weighted<Integer> weighted2 = new Weighted<Integer>(val2, weight2);
		int actual = weighted.compareTo(weighted2);
		assertEquals(1, actual);
	}

	@Test
	public void testEqualsObject1() {
		Integer val = 0;
		double weight = 5;
		Weighted<Integer> weighted = new Weighted<Integer>(val, weight);
		boolean condition = weighted.equals(null);
		assertFalse(condition);
	}
	
	@Test
	public void testEqualsObject2() {
		Integer val = 0;
		double weight = 5;
		Weighted<Integer> weighted = new Weighted<Integer>(val, weight);
		boolean condition = weighted.equals("null");
		assertFalse(condition);
	}
	
	@Test
	public void testEqualsObject3() {
		Integer val = 0;
		double weight = 5;
		Weighted<Integer> weighted = new Weighted<Integer>(val, weight);
		boolean condition = weighted.equals(weighted);
		assertTrue(condition);
	}

	@Test
	public void testEqualsObject4() {
		Integer val = 0;
		double weight = 5;
		Weighted<Integer> weighted = new Weighted<Integer>(val, weight);
		Integer val2 = 1;
		double weight2 = 5;
		Weighted<Integer> weighted2 = new Weighted<Integer>(val2, weight2);
		boolean condition = weighted.equals(weighted2);
		assertFalse(condition);
	}
	
	@Test
	public void testEqualsObject5() {
		Integer val = 0;
		double weight = 5;
		Weighted<Integer> weighted = new Weighted<Integer>(val, weight);
		Integer val2 = 0;
		double weight2 = 6;
		Weighted<Integer> weighted2 = new Weighted<Integer>(val2, weight2);
		boolean condition = weighted.equals(weighted2);
		assertFalse(condition);
	}
	
	@Test
	public void testToString() {
		Integer val = 0;
		double weight = 5;
		Weighted<Integer> weighted = new Weighted<Integer>(val, weight);
		String actual = weighted.toString();
		assertEquals("Weighted{val=0, weight=5.0}", actual);
	}

}
