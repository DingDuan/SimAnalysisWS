package net.mooctest;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class ArborescenceTest {

	@Test
	public void test01() {
		ImmutableMap<String, String> immutableMap = new ImmutableMap.Builder<String, String>().put("k1", "v1")
				.put("k2", "v2").build();

		Arborescence<String> arborescence = Arborescence.of(immutableMap);
		String aString = "Arborescence{v1 -> k1, v2 -> k2}";
		assertEquals(aString, arborescence.toString());
	}

	@Test
	public void test02() {
		Arborescence<String> arborescence = Arborescence.empty();
		String aString = "Arborescence{}";
		assertEquals(aString, arborescence.toString());
	}

	@Test
	public void test03() {
		Arborescence<String> arborescence = Arborescence.empty();
		Edge e = new Edge(2, 1);
		boolean a = arborescence.contains(e);
		assertFalse(a);
	}
	
	@Test
	public void test04() {
		Arborescence<String> arborescence = Arborescence.empty();
		int a = arborescence.hashCode();
		assertEquals(31,a);
	}
	
	@Test
	public void test05() {
		Arborescence<String> arborescence = Arborescence.empty();
		String aString = "测试";
		boolean a = arborescence.equals(aString);
		assertFalse(a);
	}
	
	@Test
	public void test06() {
		ImmutableMap<Integer, Integer> immutableMap = new ImmutableMap.Builder<Integer, Integer>()
				.put(1, 2)
				.put(3, 4).build();

		Arborescence<Integer> arborescence = Arborescence.of(immutableMap);
		int aint = 2;
		boolean a = arborescence.equals(aint);
		assertFalse(a);
	}
	
	@Test
	public void test07() {
		ImmutableMap<Integer, Integer> immutableMap = new ImmutableMap.Builder<Integer, Integer>()
				.put(2, 2)
				.put(3, 3).build();

		Arborescence<Integer> arborescence = Arborescence.of(immutableMap);
		Edge e = new Edge(2, 2);
		boolean a = arborescence.contains(e);
		assertTrue(a);
	}
	

}
