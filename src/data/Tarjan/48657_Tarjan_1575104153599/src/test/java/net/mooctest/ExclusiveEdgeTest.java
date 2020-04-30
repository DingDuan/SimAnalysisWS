package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ExclusiveEdgeTest {

	@Test
	public void testOfEdgeOfTListOfEdgeOfTDouble() {
		Edge<Integer> edge = new Edge<Integer>(0, 5);
		List<Edge<Integer>> excluded = new ArrayList<Edge<Integer>>();
		double weight = 5;
		ExclusiveEdge<Integer> exclusiveEdge = ExclusiveEdge.of(edge, excluded, weight);
		assertSame(edge, exclusiveEdge.edge);
		assertSame(excluded, exclusiveEdge.excluded);
		assertEquals(weight, exclusiveEdge.weight, 2);
	}

	@Test
	public void testOfEdgeOfTDouble() {
		Edge<Integer> edge = new Edge<Integer>(0, 5);
		double weight = 5;
		ExclusiveEdge<Integer> exclusiveEdge = ExclusiveEdge.of(edge, weight);
		assertSame(edge, exclusiveEdge.edge);
		assertNotNull(exclusiveEdge.excluded);
		assertEquals(weight, exclusiveEdge.weight, 2);
	}

	@Test
	public void testCompareTo() {
		Edge<Integer> edge = new Edge<Integer>(0, 5);
		List<Edge<Integer>> excluded = new ArrayList<Edge<Integer>>();
		double weight = 5;
		ExclusiveEdge<Integer> exclusiveEdge = ExclusiveEdge.of(edge, excluded, weight);
		int actual = exclusiveEdge.compareTo(exclusiveEdge);
		assertEquals(0, actual);
	}
	
	@Test
	public void testCompareTo2() {
		Edge<Integer> edge = new Edge<Integer>(0, 5);
		List<Edge<Integer>> excluded = new ArrayList<Edge<Integer>>();
		double weight = 5;
		ExclusiveEdge<Integer> exclusiveEdge = ExclusiveEdge.of(edge, excluded, weight);
		Edge<Integer> edge2 = new Edge<Integer>(0, 5);
		List<Edge<Integer>> excluded2 = new ArrayList<Edge<Integer>>();
		double weight2 = 6;
		ExclusiveEdge<Integer> exclusiveEdge2 = ExclusiveEdge.of(edge2, excluded2, weight2);
		int actual = exclusiveEdge.compareTo(exclusiveEdge2);
		assertEquals(-1, actual);
	}

}
