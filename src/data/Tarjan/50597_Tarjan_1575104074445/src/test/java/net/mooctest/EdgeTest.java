package net.mooctest;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.google.common.base.Predicate;

public class EdgeTest {

	@Test
	public void testEdge_1()
		throws Exception {

		Edge result = new Edge(null, null);

		
		assertNotNull(result);
		assertEquals("Edge{source=null, destination=null}", result.toString());
	}

	
	@Test
	public void testCompetesWith_1()
		throws Exception {
		Set<Edge<Object>> required = new HashSet();

		Predicate<Edge<Object>> result = Edge.competesWith(required);

		
		assertNotNull(result);
	}

	/**
	 * Run the Predicate<Edge<Object>> competesWith(Set<Edge<T>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 19-11-30 下午1:25
	 */
	@Test
	public void testCompetesWith_2()
		throws Exception {
		Set<Edge<Object>> required = new HashSet();

		Predicate<Edge<Object>> result = Edge.competesWith(required);

		// add additional test code here
		assertNotNull(result);
	}

	
	@Test
	public void testEquals_1()
		throws Exception {
		Edge fixture = new Edge((Object) null, (Object) null);
		Object obj = null;

		boolean result = fixture.equals(obj);

		
		assertEquals(false, result);
	}

	
	@Test
	public void testEquals_2()
		throws Exception {
		Edge fixture = new Edge((Object) null, (Object) null);
		Object obj = new Object();

		boolean result = fixture.equals(obj);

	
		assertEquals(false, result);
	}

	
	@Test
	public void testEquals_3()
		throws Exception {
		Edge fixture = new Edge((Object) null, (Object) null);
		Object obj = new Edge((Object) null, (Object) null);

		boolean result = fixture.equals(obj);

		
		assertEquals(true, result);
	}

	
	@Test
	public void testEquals_4()
		throws Exception {
		Edge fixture = new Edge((Object) null, (Object) null);
		Object obj = new Edge((Object) null, (Object) null);

		boolean result = fixture.equals(obj);

		
		assertEquals(true, result);
	}

	
	@Test
	public void testEquals_5()
		throws Exception {
		Edge fixture = new Edge((Object) null, (Object) null);
		Object obj = new Edge((Object) null, (Object) null);

		boolean result = fixture.equals(obj);

		
		assertEquals(true, result);
	}

	
	@Test
	public void testFrom_1()
		throws Exception {

		Edge.EdgeBuilder<Object> result = Edge.from(null);

	
		assertNotNull(result);
	}

	
	@Test
	public void testHasDestination_1()
		throws Exception {

		Predicate<Edge<Object>> result = Edge.hasDestination(null);

		
		assertNotNull(result);
	}

	
	@Test
	public void testHashCode_1()
		throws Exception {
		Edge fixture = new Edge((Object) null, (Object) null);

		int result = fixture.hashCode();

		
		assertEquals(961, result);
	}

	@Test
	public void testIsAutoCycle_1()
		throws Exception {

		Predicate<Edge<Object>> result = Edge.isAutoCycle();

		
		assertNotNull(result);
	}

	
	@Test
	public void testIsIn_1()
		throws Exception {
		Set<Edge<Object>> banned = new HashSet();

		Predicate<Edge<Object>> result = Edge.isIn(banned);

		
		assertNotNull(result);
	}

	
	@Test
	public void testToString_1()
		throws Exception {
		Edge fixture = new Edge((Object) null, (Object) null);

		String result = fixture.toString();

		
		assertEquals("Edge{source=null, destination=null}", result);
	}

}
