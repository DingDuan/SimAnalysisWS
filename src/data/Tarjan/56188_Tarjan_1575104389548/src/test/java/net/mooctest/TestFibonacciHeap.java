package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import net.mooctest.FibonacciHeap.Entry;

public class TestFibonacciHeap {

	@Test
	public void testEdge() {
		Edge<String> edge = new Edge<String>("a", "b");
		Edge<String> edge2 = new Edge<String>("a", "b");
		Edge.EdgeBuilder<String> eb =Edge.from("a");
		eb.to("b");
		assertEquals(4066, edge.hashCode());
		assertNotNull(edge.toString());
		
		assertFalse(edge.equals(null));
		assertFalse(edge.equals(new String()));
		assertTrue(edge.equals(edge2));
		edge2 = new Edge<String>("a", "c");
		assertFalse(edge.equals(edge2));
		edge2 = new Edge<String>("b", "c");
		assertFalse(edge.equals(edge2));
		
		Edge.hasDestination("test");
		Edge.hasDestination(edge);
		List<Edge<String>> elist = new ArrayList<>();
		elist.add(edge);
		elist.add(edge2);
		Set<Edge<String>> eset = new HashSet<>();
		Edge.isIn(eset);
		Edge.competesWith(eset);
		eset.add(edge);
		Edge.competesWith(eset);
		eset.add(edge2);
		Edge.competesWith(eset);
		
		Edge.isAutoCycle();
		Edge.isIn(eset);
	}
	
	@Test
	public void testEdgeQueueMap() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		Partition<String> partition = Partition.singletons(list);
		String s = new String("test");
		EdgeQueueMap<String> edgeQueueMap;
//		edgeQueueMap = EdgeQueueMap.create(s ,partition);
//		edgeQueueMap = EdgeQueueMap.create("T", partition);
	}
	
	@Test
	public void testPair() {
		Pair<String, Integer> pair = new Pair<String, Integer>("a", 1);
		Pair<String, Integer> pair2 = new Pair<String, Integer>("a", 1);
		assertTrue(pair.equals(pair2));
		pair2 = new Pair<String, Integer>("c", 1);
		assertFalse(pair.equals(pair2));
		pair2 = new Pair<String, Integer>("a", 2);
		assertFalse(pair.equals(pair2));
		pair2 = Pair.of("b", 2);
		assertFalse(pair.equals(new String()));
		
		assertEquals(3969, pair.hashCode());
		assertEquals("Pair{first=a, second=1}", pair.toString().trim());
		
		Partition<String> partition;
		Map<String,Integer> parents = new HashMap<>();
		Map<String,Integer> ranks = new HashMap<>();
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		partition = Partition.singletons(list);
		
		assertEquals("a", partition.componentOf("a"));
		partition.componentOf("b");
//		System.out.println(partition.componentOf("d"));
		assertEquals("a", partition.merge("a", "c"));
		assertEquals("a", partition.merge("a", "b"));
		assertEquals("a", partition.merge("b", "a"));
		assertEquals("a", partition.merge("b", "c"));
		assertEquals("a", partition.merge("b", "b"));
		
		assertTrue(partition.sameComponent("a", "b"));
		assertTrue(partition.sameComponent("b", "b"));
		
		Set<String> set = partition.getNodes();
		assertEquals(3, set.size());
	}
	
	@Test
	public void testArborescence() {
		Arborescence<String> ab;
		Arborescence<String> ab2;
		ImmutableMap<String,Object> immutableMap = new ImmutableMap.Builder<String,Object>()
			    .put("a","1")
			    .put("b","2")
			    .put("c",3)
			    .build();
		ab = Arborescence.empty();
		ab2 =  Arborescence.empty();
		Edge<String> edge = new Edge<String>("a", "b");
		Edge<String> edge2 = new Edge<String>("a", "b");
		assertFalse(ab.contains(edge2));
		assertNotNull(ab.toString());
		
		ab = Arborescence.of(ImmutableMap.<String, String>of("a","1"));
		ab.toString();
		assertFalse(ab.equals(null));
		assertFalse(ab.equals(new String()));
		assertFalse(ab.equals(ab2));
		assertTrue(ab.equals(ab));
		
		ab.hashCode();
	}
	
	@Test
	public void testW() {
		Weighted<String> weight = new Weighted<String>("a", 1);
		weight = Weighted.weighted("a", 1);
		Weighted<String> weight2 = new Weighted<String>("a", 3);
		weight.compareTo(weight2);
		assertFalse(weight.equals(new String()));
		assertFalse(weight.equals(weight2));
		weight2 = new Weighted<String>("a", 1);
		assertTrue(weight.equals(weight2));
		weight.hashCode();
		assertNotNull(weight.toString());
		
		
		SparseWeightedGraph<String> sg;
//		sg = SparseWeightedGraph.from(edges)
		
		Edge<String> edge = new Edge<String>("a", "b");
		Edge<String> edge2 = new Edge<String>("a", "c");
		weight = Weighted.weighted("a", (double)1);
		ExclusiveEdge<String> ee;
		ExclusiveEdge<String> e2;
		ee = ExclusiveEdge.of(edge, 1);
		e2 = ExclusiveEdge.of(edge, 13);
		
		ee.compareTo(e2);
		e2.compareTo(ee);
		
		DenseWeightedGraph<Integer> dg;
		dg = DenseWeightedGraph.from(new double[][] {{1},{2}});
		
		assertEquals(2, dg.getNodes().size());
		dg.getWeightOf(1, 2);
		dg.getWeightOf(0, 2);
		dg.getWeightOf(0, 0);
		
		Collection<Weighted<Edge<Integer>>> coll = dg.getIncomingEdges(0);
		assertEquals(2, coll.size());
		dg.getIncomingEdges(2);
		try {
			
		
		WeightedGraph<Integer> weightedGraph = new WeightedGraph<Integer>() {
			
			@Override
			public double getWeightOf(Integer source, Integer dest) {
				// TODO Auto-generated method stub
				return 1;
			}
			
			@Override
			public Collection<Integer> getNodes() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Collection<Weighted<Edge<Integer>>> getIncomingEdges(Integer destinationNode) {
				// TODO Auto-generated method stub
				return new ArrayList<Weighted<Edge<Integer>>>();
			}
		};
		ChuLiuEdmonds.getMaxArborescence(weightedGraph);
		} catch (Exception e) {
		}
		
		FibonacciHeap<String,Integer> fc;
		fc = FibonacciHeap.create();
		FibonacciHeap<String,Integer> fc2;
		fc2 = FibonacciHeap.create();
		fc.comparator();
		assertTrue(fc.isEmpty());
		fc.clear();
		try {
			fc.decreasePriority(null, null);
		} catch (Exception e) {
		}
		assertTrue(fc.isEmpty());
//		FibonacciHeap.Entry entry = new FibonacciHeap.Entry();
		fc.add("1", 1);
		fc.add("2", 2);
		fc.peekOption();
		fc.pollOption();
		fc.size();
		
		fc2.add("3", 3);
		fc2.add("4", 4);
		fc.merge(fc, fc2);
		
		fc.iterator();
		
		Optional<FibonacciHeap<String, Integer>.Entry> entry1 = fc.peekOption();
		FibonacciHeap.Entry entry;
		entry = entry1.get();
		fc.decreasePriority(entry, 1);
		try {
			fc.decreasePriority(entry, 2);
		} catch (Exception e) {
		}
		
		FibonacciQueue<String> fq ;
		fq = FibonacciQueue.create();
		fq.create(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});
		fq.comparator();
		fq.peek();
		fq.add("a");
//		fq.addAll(new ArrayList<Integer>().add(1));
		fq.offer("a");
		fq.poll();
		fq.size();
		fq.add("b");
		fq.iterator();
	}
}
