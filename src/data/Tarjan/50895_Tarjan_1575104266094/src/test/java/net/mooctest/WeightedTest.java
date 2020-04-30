package net.mooctest;

import static org.junit.Assert.*;



import org.junit.Test;

public class WeightedTest {

	@Test
	public void test() {
		Weighted<String> weighted = new Weighted<String>("wangyunxiao", 100);
		Weighted<String> weighted2 = weighted.weighted("wangyunxiao", 100);
		Weighted<String> weighted3 = new Weighted<String>("wangyunxiao", 101);
		Weighted<String> weighted4 = new Weighted<String>("wangyunxiao", 99);
		Weighted<String> weighted5 = new Weighted<String>("wangyunx", 99);
		weighted.compareTo(weighted2);
		assertEquals(weighted.compareTo(weighted2), 0);
		System.out.println(weighted3.compareTo(weighted4));
		assertEquals(weighted2.compareTo(weighted3), 1);
		assertEquals(weighted3.compareTo(weighted4), -1);
		assertEquals(true, weighted.equals(weighted2));
		assertEquals(false, weighted.equals(weighted3));
		assertEquals(false, weighted.equals(new String()));
		System.out.println(weighted.hashCode());
		assertEquals(-422282701, weighted.hashCode());
		System.out.println(weighted.toString());
		
		assertEquals(false, weighted5.equals(weighted3));
		assertEquals("Weighted{val=wangyunxiao, weight=100.0}", weighted.toString());
	}

}
