package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class EdgeTest {

	@Test
	public void test01() {
		Edge<Integer> edge0=new Edge<Integer>(3,5);
		Edge.from(1);
		Edge.from(1).to(3);
		edge0.hashCode();
		edge0.toString();
		assertTrue(edge0.equals(edge0));
		assertFalse(edge0.equals(1));
		assertFalse(edge0.equals(null));
		assertFalse(edge0.equals(new Edge<Integer>(4,5)));
		assertFalse(edge0.equals(new Edge<Integer>(3,6)));
		edge0.hasDestination(2);
		
		//Set<Edge<Integer>> set=new Set<Edge<Integer>>();
		Edge.isAutoCycle();
		//edge0.competesWith(null);
		
	}

}
