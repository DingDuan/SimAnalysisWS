package net.mooctest;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.junit.Test;

public class DenseWeightedGraphTest {

	@Test
	public void testFrom_1()
		throws Exception {
		double[][] weights = new double[][] {};

		DenseWeightedGraph<Integer> result = DenseWeightedGraph.from(weights);

		
		assertNotNull(result);
	}

	
	@Test
	public void testFrom_2()
		throws Exception {
		Iterable<Object> nodes = new ConcurrentLinkedQueue();
		double[][] weights = new double[][] {};

		DenseWeightedGraph<Object> result = DenseWeightedGraph.from(nodes, weights);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	
	@Test
	public void testFrom_3()
		throws Exception {
		Iterable<Object> nodes = new ConcurrentLinkedQueue();
		double[][] weights = new double[][] {};

		DenseWeightedGraph<Object> result = DenseWeightedGraph.from(nodes, weights);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	
//	@Test
//	public void testGetIncomingEdges_1()
//		throws Exception {
//		DenseWeightedGraph fixture = DenseWeightedGraph.from(null, new double[][] {{-1.0, 0.0, 1.0, -0.5, 0.5, Double.MAX_VALUE, Double.MIN_VALUE}});
//
//		Collection<Weighted<Edge<Object>>> result = fixture.getIncomingEdges(null);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NullPointerException
//		//       at com.google.common.base.Preconditions.checkNotNull(Preconditions.java:191)
//		//       at com.google.common.collect.Lists.newArrayList(Lists.java:123)
//		//       at net.mooctest.DenseWeightedGraph.from(DenseWeightedGraph.java:28)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the Collection<Weighted<Edge<Object>>> getIncomingEdges(V) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 19-11-30 下午1:23
//	 */
//	@Test
//	public void testGetIncomingEdges_2()
//		throws Exception {
//		DenseWeightedGraph fixture = DenseWeightedGraph.from(null, new double[][] {{-1.0, 0.0, 1.0, -0.5, 0.5, Double.MAX_VALUE, Double.MIN_VALUE}});
//
//		Collection<Weighted<Edge<Object>>> result = fixture.getIncomingEdges(null);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NullPointerException
//		//       at com.google.common.base.Preconditions.checkNotNull(Preconditions.java:191)
//		//       at com.google.common.collect.Lists.newArrayList(Lists.java:123)
//		//       at net.mooctest.DenseWeightedGraph.from(DenseWeightedGraph.java:28)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the Collection<Weighted<Edge<Object>>> getIncomingEdges(V) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 19-11-30 下午1:23
//	 */
//	@Test
//	public void testGetIncomingEdges_3()
//		throws Exception {
//		DenseWeightedGraph fixture = DenseWeightedGraph.from(null, new double[][] {{-1.0, 0.0, 1.0, -0.5, 0.5, Double.MAX_VALUE, Double.MIN_VALUE}});
//
//		Collection<Weighted<Edge<Object>>> result = fixture.getIncomingEdges(null);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NullPointerException
//		//       at com.google.common.base.Preconditions.checkNotNull(Preconditions.java:191)
//		//       at com.google.common.collect.Lists.newArrayList(Lists.java:123)
//		//       at net.mooctest.DenseWeightedGraph.from(DenseWeightedGraph.java:28)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the Collection<Object> getNodes() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 19-11-30 下午1:23
//	 */
//	@Test
//	public void testGetNodes_1()
//		throws Exception {
//		DenseWeightedGraph fixture = DenseWeightedGraph.from(null, new double[][] {{-1.0, 0.0, 1.0, -0.5, 0.5, Double.MAX_VALUE, Double.MIN_VALUE}});
//
//		Collection<Object> result = fixture.getNodes();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NullPointerException
//		//       at com.google.common.base.Preconditions.checkNotNull(Preconditions.java:191)
//		//       at com.google.common.collect.Lists.newArrayList(Lists.java:123)
//		//       at net.mooctest.DenseWeightedGraph.from(DenseWeightedGraph.java:28)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the double getWeightOf(V,V) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 19-11-30 下午1:23
//	 */
//	@Test
//	public void testGetWeightOf_1()
//		throws Exception {
//		DenseWeightedGraph fixture = DenseWeightedGraph.from(null, new double[][] {{-1.0, 0.0, 1.0, -0.5, 0.5, Double.MAX_VALUE, Double.MIN_VALUE}});
//
//		double result = fixture.getWeightOf(null, null);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NullPointerException
//		//       at com.google.common.base.Preconditions.checkNotNull(Preconditions.java:191)
//		//       at com.google.common.collect.Lists.newArrayList(Lists.java:123)
//		//       at net.mooctest.DenseWeightedGraph.from(DenseWeightedGraph.java:28)
//		assertEquals(0.0, result, 0.1);
//	}
//
//	/**
//	 * Run the double getWeightOf(V,V) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 19-11-30 下午1:23
//	 */
//	@Test
//	public void testGetWeightOf_2()
//		throws Exception {
//		DenseWeightedGraph fixture = DenseWeightedGraph.from(null, new double[][] {{-1.0, 0.0, 1.0, -0.5, 0.5, Double.MAX_VALUE, Double.MIN_VALUE}});
//
//		double result = fixture.getWeightOf(null, null);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NullPointerException
//		//       at com.google.common.base.Preconditions.checkNotNull(Preconditions.java:191)
//		//       at com.google.common.collect.Lists.newArrayList(Lists.java:123)
//		//       at net.mooctest.DenseWeightedGraph.from(DenseWeightedGraph.java:28)
//		assertEquals(0.0, result, 0.1);
//	}
//
//	/**
//	 * Run the double getWeightOf(V,V) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 19-11-30 下午1:23
//	 */
//	@Test
//	public void testGetWeightOf_3()
//		throws Exception {
//		DenseWeightedGraph fixture = DenseWeightedGraph.from(null, new double[][] {{-1.0, 0.0, 1.0, -0.5, 0.5, Double.MAX_VALUE, Double.MIN_VALUE}});
//
//		double result = fixture.getWeightOf(null, null);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NullPointerException
//		//       at com.google.common.base.Preconditions.checkNotNull(Preconditions.java:191)
//		//       at com.google.common.collect.Lists.newArrayList(Lists.java:123)
//		//       at net.mooctest.DenseWeightedGraph.from(DenseWeightedGraph.java:28)
//		assertEquals(0.0, result, 0.1);
//	}

}
