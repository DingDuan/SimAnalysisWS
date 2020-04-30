package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeightedTest {
	@Test
	public void test01(){
		Weighted w = new Weighted(1,1);
		assertEquals(w,Weighted.weighted(1,1));
		assertEquals(0,w.compareTo(w));
		assertEquals(1,w.compareTo(new Weighted(1, 2)));
		assertEquals(1,w.compareTo(new Weighted(2, 1)));
		assertEquals(1,w.compareTo(new Weighted(2, 2)));
		assertEquals(-1,w.compareTo(new Weighted(0, 0)));
		assertEquals(true,w.equals(w));
		assertEquals(false,w.equals(null));
		assertEquals(false,w.equals(new Weighted(2, 2)));
		assertEquals(1072694240, w.hashCode());
		String s = "Weighted{val=1, weight=1.0}";
		assertEquals(s,w.toString());
	}
}
