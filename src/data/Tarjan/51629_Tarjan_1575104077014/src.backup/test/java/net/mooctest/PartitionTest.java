package net.mooctest;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PartitionTest {
	@Test(timeout = 4000)
	public void test00() throws Throwable {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("end index");
		linkedList0.add("");
		linkedList0.add("`w/WX&xG1H,E=RB");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.merge("`w/WX&xG1H,E=RB", "end index");
		assertEquals("`w/WX&xG1H,E=RB", string0);

		String string1 = partition0.merge("", "end index");
		assertEquals("`w/WX&xG1H,E=RB", string1);
	}

	@Test(timeout = 4000)
	public void test01() throws Throwable {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("HeZd idelx");
		linkedList0.add("");
		linkedList0.add("O4`PE #oUO");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.merge("", "HeZd idelx");
		assertEquals("", string0);

		String string1 = partition0.merge("HeZd idelx", "O4`PE #oUO");
		assertEquals("", string1);
	}

	@Test(timeout = 4000)
	public void test02() throws Throwable {
		Integer integer0 = new Integer(0);
		Integer integer1 = new Integer(0);
		LinkedList<Object> linkedList0 = new LinkedList<Object>();
		linkedList0.add((Object) integer1);
		Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
		Object object0 = partition0.merge(integer0, integer1);
		assertEquals(0, object0);
	}

	@Test(timeout = 4000)
	public void test03() throws Throwable {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("3S&4J-8DF}/dhQ^tp");
		linkedList0.add("");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.merge("3S&4J-8DF}/dhQ^tp", "");
		assertEquals("3S&4J-8DF}/dhQ^tp", string0);

		String string1 = partition0.merge("", "");
		assertEquals("3S&4J-8DF}/dhQ^tp", string1);
	}

	@Test(timeout = 4000)
	public void test04() throws Throwable {
		LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
		Integer integer0 = new Integer(0);
		linkedList0.add(integer0);
		Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) linkedList0);
		boolean boolean0 = partition0.sameComponent(integer0, integer0);
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test05() throws Throwable {
		try {
			Partition.singletons((Collection<String>) null);
			fail();

		} catch (Exception e) {

		}
	}

	@Test(timeout = 4000)
	public void test06() throws Throwable {
		LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
		Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) linkedList0);
		Integer integer0 = new Integer(0);
		// Undeclared exception!
		try {
			partition0.sameComponent(integer0, integer0);
			fail();

		} catch (NullPointerException e) {
		}
	}

	@Test(timeout = 4000)
	public void test07() throws Throwable {
		LinkedList<Object> linkedList0 = new LinkedList<Object>();
		Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
		Object object0 = new Object();
		// Undeclared exception!
		try {
			partition0.merge(object0, linkedList0);
			fail();

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test08() throws Throwable {
		LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
		Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) linkedList0);
		Integer integer0 = new Integer(0);

		try {
			partition0.componentOf(integer0);
			fail();

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test09() throws Throwable {
		LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
		Integer integer0 = new Integer(0);
		linkedList0.add(integer0);
		Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) linkedList0);
		Integer integer1 = partition0.componentOf(integer0);
		assertEquals(0, (int) integer1);
	}

	@Test(timeout = 4000)
	public void test10() throws Throwable {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("HeZd idelx");
		linkedList0.add("");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.merge("", "HeZd idelx");
		assertEquals("", string0);

		boolean boolean0 = partition0.sameComponent("", "HeZd idelx");
		// assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test11() throws Throwable {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("");
		linkedList0.add("O4`PE #oUO");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		boolean boolean0 = partition0.sameComponent("", "O4`PE #oUO");
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test12() throws Throwable {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("3S&4J-8DF}/dhQ^tp");
		linkedList0.add("");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.merge("3S&4J-8DF}/dhQ^tp", "");
		assertEquals("3S&4J-8DF}/dhQ^tp", string0);

		String string1 = partition0.componentOf("");
		assertEquals("3S&4J-8DF}/dhQ^tp", string1);
	}

	@Test(timeout = 4000)
	public void test13() throws Throwable {
		LinkedList<Object> linkedList0 = new LinkedList<Object>();
		Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
		Set<Object> set0 = partition0.getNodes();
		assertTrue(set0.isEmpty());
	}

}
