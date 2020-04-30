package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class ArborescenceTest {

	@Test
	public void testContains_1()
		throws Exception {
		Arborescence fixture = Arborescence.empty();
		Edge<Object> e = new Edge((Object) null, (Object) null);

		boolean result = fixture.contains(e);

		// add additional test code here
		assertEquals(false, result);
	}

	
	@Test
	public void testContains_2()
		throws Exception {
		Arborescence fixture = Arborescence.empty();
		Edge<Object> e = new Edge((Object) null, (Object) null);

		boolean result = fixture.contains(e);

		// add additional test code here
		assertEquals(false, result);
	}

	
	@Test
	public void testContains_3()
		throws Exception {
		Arborescence fixture = Arborescence.empty();
		Edge<Object> e = new Edge((Object) null, (Object) null);

		boolean result = fixture.contains(e);

		// add additional test code here
		assertEquals(false, result);
	}

	
	@Test
	public void testEmpty_1()
		throws Exception {

		Arborescence<Object> result = Arborescence.empty();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Arborescence{}", result.toString());
	}

	
	@Test
	public void testEquals_1()
		throws Exception {
		Arborescence fixture = Arborescence.empty();
		Object other = Arborescence.empty();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	
	@Test
	public void testEquals_2()
		throws Exception {
		Arborescence fixture = Arborescence.empty();
		Object other = null;

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	
	@Test
	public void testEquals_3()
		throws Exception {
		Arborescence fixture = Arborescence.empty();
		Object other = new Object();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	
	@Test
	public void testEquals_4()
		throws Exception {
		Arborescence fixture = Arborescence.empty();
		Object other = Arborescence.empty();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	
	@Test
	public void testEquals_5()
		throws Exception {
		Arborescence fixture = Arborescence.empty();
		Object other = Arborescence.empty();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	
	@Test
	public void testEquals_6()
		throws Exception {
		Arborescence fixture = Arborescence.empty();
		Object other = Arborescence.empty();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	
	@Test
	public void testHashCode_1()
		throws Exception {
		Arborescence fixture = Arborescence.empty();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(31, result);
	}

	
	@Test
	public void testOf_1()
		throws Exception {
		ImmutableMap<Object, Object> parents = null;

		Arborescence<Object> result = Arborescence.of(parents);

		// add additional test code here
		assertNotNull(result);
	}

	
	@Test
	public void testToString_1()
		throws Exception {
		Arborescence fixture = Arborescence.empty();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Arborescence{}", result);
	}

	
	@Test
	public void testToString_2()
		throws Exception {
		Arborescence fixture = Arborescence.empty();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Arborescence{}", result);
	}

}
