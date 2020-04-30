package net.mooctest;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class EdgeTest {

	@Test
	public void test() {
		Edge<String> edge  = new Edge<String>("a","b");
		Edge<String> edge2  = new Edge<String>("b","a");
		Edge<String> edge3  = new Edge<String>("a","a");
		System.out.println(edge.hashCode());
		assertEquals(4066, edge.hashCode());
		System.out.println(edge.toString());
		assertEquals("Edge{source=a, destination=b}", edge.toString());
		assertEquals(false,edge.equals(null));
		assertEquals(true,edge.equals(edge));
		assertEquals(false,edge2.equals(edge3));
		assertEquals(false,edge3.equals(edge));
		assertEquals(false,edge2.equals(new String()));
		edge2.hasDestination("a");
		assertEquals(false,edge2.hasDestination("b").apply(edge3));
	}
	
	@Test
	public void test1() {
		Edge<Object> edge  = new Edge<Object>("a","b");
		Edge<String> edge2  = new Edge<String>("b","a");
		Edge<String> edge3  = new Edge<String>("a","c");
		Set<Edge<String>> set = new HashSet<>();
		
		set.add(edge2);
		set.add(edge3);
		Edge.competesWith(set);
		Edge.isAutoCycle().apply(edge);
		
		}

}
