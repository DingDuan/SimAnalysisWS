package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class PairTest {

	@Test
	public void testPair_1()
		throws Exception {

		Pair result = new Pair(null, null);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Pair{first=null, second=null}", result.toString());
	}

	
	@Test
	public void testEquals_1()
		throws Exception {
		Pair fixture = new Pair((Object) null, (Object) null);
		Object other = new Object();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}


	@Test
	public void testEquals_2()
		throws Exception {
		Pair fixture = new Pair((Object) null, (Object) null);
		Object other = new Pair((Object) null, (Object) null);

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	
	@Test
	public void testEquals_3()
		throws Exception {
		Pair fixture = new Pair((Object) null, (Object) null);
		Object other = new Pair((Object) null, (Object) null);

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	
	@Test
	public void testEquals_4()
		throws Exception {
		Pair fixture = new Pair((Object) null, (Object) null);
		Object other = new Pair((Object) null, (Object) null);

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	
	@Test
	public void testHashCode_1()
		throws Exception {
		Pair fixture = new Pair((Object) null, (Object) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(961, result);
	}

	
	@Test
	public void testOf_1()
		throws Exception {

		Pair<Object, Object> result = Pair.of(null, null);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Pair{first=null, second=null}", result.toString());
	}

	
	@Test
	public void testToString_1()
		throws Exception {
		Pair fixture = new Pair((Object) null, (Object) null);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Pair{first=null, second=null}", result);
	}

}
