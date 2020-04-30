package net.mooctest;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.concurrent.ConcurrentSkipListSet;

import org.junit.Test;

public class SparseWeightedGraphTest {

	@Test
	public void testFrom_1()
		throws Exception {
		Iterable<Weighted<Edge<Object>>> edges = new ConcurrentSkipListSet();

		SparseWeightedGraph<Object> result = SparseWeightedGraph.from(edges);

	
		assertNotNull(result);
	}

	
	@Test
	public void testFrom_2()
		throws Exception {
		Iterable<Weighted<Edge<Object>>> edges = new ConcurrentSkipListSet();

		SparseWeightedGraph<Object> result = SparseWeightedGraph.from(edges);

		// add additional test code here
		assertNotNull(result);
	}

	
	@Test
	public void testFrom_3()
		throws Exception {
		Iterable<Object> nodes = new ConcurrentSkipListSet();
		Iterable<Weighted<Edge<Object>>> edges = new ConcurrentSkipListSet();

		SparseWeightedGraph<Object> result = SparseWeightedGraph.from(nodes, edges);

		// add additional test code here
		assertNotNull(result);
	}

	@Test
	public void testFrom_4()
		throws Exception {
		Iterable<Object> nodes = new ConcurrentSkipListSet();
		Iterable<Weighted<Edge<Object>>> edges = new ConcurrentSkipListSet();

		SparseWeightedGraph<Object> result = SparseWeightedGraph.from(nodes, edges);


		assertNotNull(result);
	}


	@Test
	public void testFrom_5()
		throws Exception {
		Iterable<Object> nodes = new ConcurrentSkipListSet();
		Iterable<Weighted<Edge<Object>>> edges = new ConcurrentSkipListSet();

		SparseWeightedGraph<Object> result = SparseWeightedGraph.from(nodes, edges);

	
		assertNotNull(result);
	}

	
	


}
