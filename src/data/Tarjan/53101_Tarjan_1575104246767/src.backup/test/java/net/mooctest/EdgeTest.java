package net.mooctest;

import static org.junit.Assert.*;
import net.mooctest.Edge.EdgeBuilder;

import org.junit.Test;

public class EdgeTest {
	@Test(expected = NullPointerException.class)
	public void test01(){
		Edge e = new Edge(1, 1);
		assertEquals(993,e.hashCode());
		EdgeBuilder ee = e.from(1);
		assertEquals(e,ee.to(1));
		assertEquals("Edge{source=1, destination=1}",e.toString());
		assertEquals(false,e.equals(null));
		assertEquals(true,e.equals(e));
		assertEquals(false,e.equals(1));
		e.hasDestination(null);
		e.hasDestination(1);
		e.isIn(null);
		e.isAutoCycle();
		e.competesWith(null);
		
		
	}
}
