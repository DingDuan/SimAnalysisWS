package net.mooctest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PairTest {

	@Test(timeout = 4000)
	public void test0() throws Throwable {
		Integer integer0 = new Integer(0);
		Pair<String, Integer> pair0 = new Pair<String, Integer>("", integer0);
		boolean boolean0 = pair0.equals(integer0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test1() throws Throwable {
		Pair<String, Object> pair0 = new Pair<String, Object>("end index", "end index");
		Pair<Object, Object> pair1 = new Pair<Object, Object>("end index", "end index");
		boolean boolean0 = pair0.equals(pair1);
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test2() throws Throwable {
		Object object0 = new Object();
		Integer integer0 = new Integer(0);
		Pair<String, Object> pair0 = new Pair<String, Object>("", object0);
		Pair<Object, Object> pair1 = new Pair<Object, Object>(object0, integer0);
		boolean boolean0 = pair0.equals(pair1);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test3() throws Throwable {
		Pair<Object, String> pair0 = Pair.of((Object) "", "");
		Pair<String, Pair<Object, String>> pair1 = new Pair<String, Pair<Object, String>>("", pair0);
		boolean boolean0 = pair1.equals(pair0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test4() throws Throwable {
		Pair<Object, String> pair0 = Pair.of((Object) "", "");
		Pair<String, Pair<Object, String>> pair1 = new Pair<String, Pair<Object, String>>("", pair0);
		pair1.hashCode();
	}

	@Test(timeout = 4000)
	public void test5() throws Throwable {
		Pair<Object, String> pair0 = Pair.of((Object) "", "");
		String string0 = pair0.toString();
		assertEquals("Pair{first=, second=}", string0);
	}

}
