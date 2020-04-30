package net.mooctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class PartitionTest {

	@Test
	public void test01() {
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add(2);
		Partition p1 = Partition.singletons(c1);
		assertEquals(1, p1.componentOf(1));
		assertEquals(2, p1.componentOf(2));
	}

	@Test(expected = NullPointerException.class)
	public void test02() {
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add(2);
		Partition p1 = Partition.singletons(c1);
		p1.componentOf(3);
	}
	
	@Test(timeout = 4000)
	public void test03() {
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		Partition p1 = Partition.singletons(c1);
		assertEquals(1, p1.merge(1, 3));
		assertEquals(1, p1.merge(2, 1));
		assertEquals(1, p1.merge(1, 1));
		// System.out.println(p1.merge(2,1));
	}

	@Test(timeout = 4000)
	public void test04() {
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		Partition p1 = Partition.singletons(c1);
		assertTrue(p1.sameComponent(1, 1));
		assertFalse(p1.sameComponent(1, 2));
	}

	@Test(timeout = 4000)
	public void test05() {
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		Partition p1 = Partition.singletons(c1);
		Map map = new HashMap();
		map.put(1,1);
		map.put(2,2);
		map.put(3,3);
		assertEquals(map.keySet(), p1.getNodes());
	}
	
	@Test(timeout = 4000)
	public void test06() {
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add(2);
		Partition p1 = Partition.singletons(c1);
		
	}
}
