package net.mooctest;

import static org.junit.Assert.*;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Predicate;

public class EdgeTest {

	@Test(timeout = 4000)
	public void test00() throws Throwable {
		Predicate<Edge<Object>> predicate0 = Edge.hasDestination((Object) "");
		LinkedHashSet<Edge<Edge<Object>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<Object>>>();
		Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) predicate0);
		Edge<Object> edge0 = edge_EdgeBuilder0.to("");
		Edge<Edge<Object>> edge1 = new Edge<Edge<Object>>(edge0, edge0);
		linkedHashSet0.add(edge1);
		Edge<Object> edge2 = edge_EdgeBuilder0.to(edge0);
		Edge<Edge<Object>> edge3 = new Edge<Edge<Object>>(edge2, edge0);
		linkedHashSet0.add(edge3);
		// Undeclared exception!
		try {
			Edge.competesWith((Set<Edge<Edge<Object>>>) linkedHashSet0);
			fail();

		} catch (IllegalArgumentException e) {

		}
	}

	@Test(timeout = 4000)
	public void test01() throws Throwable {
		Edge<String> edge0 = new Edge<String>("", "");
		edge0.hashCode();
	}

	@Test(timeout = 4000)
	public void test02() throws Throwable {
		Integer integer0 = new Integer(0);
		Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) integer0);
		Edge<Object> edge0 = edge_EdgeBuilder0.to(integer0);
		Edge<Integer> edge1 = new Edge<Integer>(integer0, integer0);
		boolean boolean0 = edge1.equals(edge0);
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test03() throws Throwable {
		// Undeclared exception!
		try {
			Edge.competesWith((Set<Edge<String>>) null);
			fail();

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test04() throws Throwable {
		LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
		Edge<Object> edge0 = new Edge<Object>((Object) null, (Object) null);
		linkedHashSet0.add(edge0);
		// Undeclared exception!
		try {
			Edge.competesWith((Set<Edge<Object>>) linkedHashSet0);
			fail();

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test05() throws Throwable {
		Predicate<Edge<Object>> predicate0 = Edge.hasDestination((Object) "");
		LinkedHashSet<Edge<Edge<Object>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<Object>>>();
		Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) predicate0);
		Edge<Object> edge0 = edge_EdgeBuilder0.to("");
		Edge<Edge<Object>> edge1 = new Edge<Edge<Object>>(edge0, edge0);
		linkedHashSet0.add(edge1);
		Predicate<Edge<Edge<Object>>> predicate1 = Edge.competesWith((Set<Edge<Edge<Object>>>) linkedHashSet0);
		assertNotNull(predicate1);
	}

	@Test(timeout = 4000)
	public void test06() throws Throwable {
		Edge<String> edge0 = new Edge<String>("", "");
		Edge<Object> edge1 = new Edge<Object>("", edge0);
		boolean boolean0 = edge1.equals(edge0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test07() throws Throwable {
		Edge<String> edge0 = new Edge<String>("", "");
		Integer integer0 = new Integer(0);
		Edge<Integer> edge1 = new Edge<Integer>(integer0, integer0);
		boolean boolean0 = edge1.equals(edge0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test08() throws Throwable {
		Edge<String> edge0 = new Edge<String>("", "");
		Integer integer0 = new Integer(0);
		LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
		Edge<Object> edge1 = new Edge<Object>(linkedHashSet0, integer0);
		Predicate<Edge<Edge<Object>>> predicate0 = Edge.hasDestination(edge1);
		boolean boolean0 = edge0.equals(predicate0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test09() throws Throwable {
		Integer integer0 = new Integer(0);
		LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
		Edge<Object> edge0 = new Edge<Object>(linkedHashSet0, integer0);
		boolean boolean0 = edge0.equals((Object) null);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test10() throws Throwable {
		Edge<String> edge0 = new Edge<String>("", "");
		String string0 = edge0.toString();
		assertEquals("Edge{source=, destination=}", string0);
	}

	@Test(timeout = 4000)
	public void test11() throws Throwable {
		Predicate<Edge<Object>> predicate0 = Edge.isAutoCycle();
		assertNotNull(predicate0);
	}

	@Test(timeout = 4000)
	public void test12() throws Throwable {
		LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
		Predicate<Edge<Object>> predicate0 = Edge.isIn((Set<Edge<Object>>) linkedHashSet0);
		assertNotNull(predicate0);
	}
}
