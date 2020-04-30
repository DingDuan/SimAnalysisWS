package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;

import java.util.Locale;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;

public class EdgeQueueMapTest {

	@Test(timeout = 4000)
	public void test0() throws Throwable {
		EdgeQueueMap<Object> edgeQueueMap0 = new EdgeQueueMap<Object>((Partition<Object>) null);
		Vector<Pair<EdgeQueueMap.EdgeQueue<Object>, Weighted<Edge<Object>>>> vector0 = new Vector<Pair<EdgeQueueMap.EdgeQueue<Object>, Weighted<Edge<Object>>>>();
		EdgeQueueMap.EdgeQueue<String> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((String) null,
				(Partition<String>) null);
		Arborescence<String> arborescence0 = Arborescence.empty();
		Optional<ExclusiveEdge<String>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge(arborescence0);
		Edge<Object> edge0 = new Edge<Object>(optional0, vector0);
		Weighted<Edge<Object>> weighted0 = Weighted.weighted(edge0, 0.0);
		// Undeclared exception!
		try {
			edgeQueueMap0.addEdge(weighted0);
			fail();

		} catch (NullPointerException e) {

		}
	}

	@Test(timeout = 4000)
	public void test1() throws Throwable {
		EdgeQueueMap<Object> edgeQueueMap0 = new EdgeQueueMap<Object>((Partition<Object>) null);
		Vector<Pair<EdgeQueueMap.EdgeQueue<Object>, Weighted<Edge<Object>>>> vector0 = new Vector<Pair<EdgeQueueMap.EdgeQueue<Object>, Weighted<Edge<Object>>>>();
		EdgeQueueMap.EdgeQueue edgeQueueMap_EdgeQueue0 = edgeQueueMap0.merge((Object) null, vector0);
		assertNotNull(edgeQueueMap_EdgeQueue0);
	}

	@Test(timeout = 4000)
	public void test3() throws Throwable {
		EdgeQueueMap<Object> edgeQueueMap0 = new EdgeQueueMap<Object>((Partition<Object>) null);
		ImmutableBiMap<Object, Object> immutableBiMap0 = ImmutableBiMap.of();
		Arborescence<Object> arborescence0 = Arborescence.of((ImmutableMap<Object, Object>) immutableBiMap0);
		Optional<ExclusiveEdge<Object>> optional0 = edgeQueueMap0.popBestEdge((Object) null, arborescence0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void test4() throws Throwable {
		EdgeQueueMap.EdgeQueue<String> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((String) null,
				(Partition<String>) null);
		Optional<ExclusiveEdge<String>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge();
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void test5() throws Throwable {
		ArrayDeque<Weighted<Locale.FilteringMode>> arrayDeque0 = new ArrayDeque<Weighted<Locale.FilteringMode>>();
		Partition<Weighted<Locale.FilteringMode>> partition0 = Partition
				.singletons((Collection<Weighted<Locale.FilteringMode>>) arrayDeque0);
		HashSet<Object> hashSet0 = new HashSet<Object>(arrayDeque0);
		Partition<Object> partition1 = Partition.singletons((Collection<Object>) hashSet0);
		EdgeQueueMap.EdgeQueue<Object> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((Object) partition0,
				partition1);
		Edge<Object> edge0 = new Edge<Object>(partition1, "");
		ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
		try {
			edgeQueueMap_EdgeQueue0.addEdge(exclusiveEdge0);
			fail();

		} catch (NullPointerException e) {

		}
	}

}
