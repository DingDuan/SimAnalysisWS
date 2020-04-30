package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.junit.Test;

import com.google.common.base.Optional;

public class EdgeQueueMapTest {

	@Test
	public void testEdgeQueueMap_1()
		throws Exception {
		Partition<Object> partition = Partition.singletons(new ArrayList<Object>());

		EdgeQueueMap result = new EdgeQueueMap(partition);
		assertNotNull(result);
	}

	
	@Test
	public void testAddEdge_1()
		throws Exception {
		EdgeQueueMap fixture = new EdgeQueueMap(Partition.singletons(new ArrayList<Object>()));
		Weighted<Edge<Object>> edge = new Weighted(new Object(), 1.0);

		
	}

	
	@Test
	public void testAddEdge_2()
		throws Exception {
		EdgeQueueMap fixture = new EdgeQueueMap(Partition.singletons(new ArrayList<Object>()));
		Weighted<Edge<Object>> edge = new Weighted(new Object(), 1.0);

		
	}

	
	@Test
	public void testMerge_1()
		throws Exception {
		EdgeQueueMap fixture = new EdgeQueueMap(Partition.singletons(new ArrayList<Object>()));
		Iterable<Pair<EdgeQueueMap.EdgeQueue<Object>, Weighted<Edge<Object>>>> queuesToMerge = new ConcurrentLinkedQueue();
		EdgeQueueMap.EdgeQueue result = fixture.merge(null, queuesToMerge);
		assertNotNull(result);
	}

	
	@Test
	public void testMerge_2()
		throws Exception {
		EdgeQueueMap fixture = new EdgeQueueMap(Partition.singletons(new ArrayList<Object>()));
		Iterable<Pair<EdgeQueueMap.EdgeQueue<Object>, Weighted<Edge<Object>>>> queuesToMerge = new ConcurrentLinkedQueue();
		EdgeQueueMap.EdgeQueue result = fixture.merge(null, queuesToMerge);
		assertNotNull(result);
	}

	
	@Test
	public void testMerge_3()
		throws Exception {
		EdgeQueueMap fixture = new EdgeQueueMap(Partition.singletons(new ArrayList<Object>()));
		Iterable<Pair<EdgeQueueMap.EdgeQueue<Object>, Weighted<Edge<Object>>>> queuesToMerge = new ConcurrentLinkedQueue();

		EdgeQueueMap.EdgeQueue result = fixture.merge(null, queuesToMerge);


		assertNotNull(result);
	}

	
	@Test
	public void testPopBestEdge_1()
		throws Exception {
		EdgeQueueMap fixture = new EdgeQueueMap(Partition.singletons(new ArrayList<Object>()));
		Arborescence<Object> best = Arborescence.empty();
		Optional<ExclusiveEdge<Object>> result = fixture.popBestEdge(null, best);
		assertNotNull(result);
		assertEquals("Optional.absent()", result.toString());
		assertEquals(false, result.isPresent());
		assertEquals(null, result.orNull());
	}

	
	@Test
	public void testPopBestEdge_2()
		throws Exception {
		EdgeQueueMap fixture = new EdgeQueueMap(Partition.singletons(new ArrayList<Object>()));
		Arborescence<Object> best = Arborescence.empty();
		Optional<ExclusiveEdge<Object>> result = fixture.popBestEdge(null, best);
		assertNotNull(result);
		assertEquals("Optional.absent()", result.toString());
		assertEquals(false, result.isPresent());
		assertEquals(null, result.orNull());
	}

}
