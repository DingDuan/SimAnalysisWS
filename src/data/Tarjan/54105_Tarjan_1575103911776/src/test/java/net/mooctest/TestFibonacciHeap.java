package net.mooctest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import net.mooctest.Edge.EdgeBuilder;
import net.mooctest.EdgeQueueMap.EdgeQueue;

public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
	}
    
    
    //
    
    
    Arborescence<Integer> testArborarb;
	
	public void testArborinit() {
		testArborarb = Arborescence.<Integer>of(new ImmutableMap.Builder<Integer, Integer>().put(1,0).put(0,1).build());
	}
	
	@Test
	public void testArbortestHashCode() {
		testArborinit();
		testArborarb.hashCode();
	}

	@Test
	public void testArbortestOf() {
		testArborinit();
		testArborarb = Arborescence.<Integer>of(new ImmutableMap.Builder<Integer, Integer>().put(1,0).put(0,1).build());
	}

	@Test
	public void testArbortestEmpty() {
		testArborinit();
		testArborarb.empty();
	}

	@Test
	public void testArbortestContains() {
		testArborinit();
		assertTrue(testArborarb.contains(Edge.from(1).to(0)));
		assertFalse(testArborarb.contains(Edge.from(1).to(1)));
		assertFalse(testArborarb.contains(Edge.from(0).to(0)));
		assertFalse(testArborarb.contains(Edge.from(19).to(18)));
	}

	@Test
	public void testArbortestToString() {
		testArborinit();
		testArborarb.toString();
	}

	@Test
	public void testArbortestEqualsObject() {
		testArborinit();
		assertTrue(testArborarb.equals(testArborarb));
		assertFalse(testArborarb.equals(null));
		assertFalse(testArborarb.equals(1));
		assertTrue(testArborarb.equals(Arborescence.<Integer>of(new ImmutableMap.Builder<Integer, Integer>().put(1,0).put(0,1).build())));
		assertFalse(testArborarb.equals(Arborescence.<Integer>of(new ImmutableMap.Builder<Integer, Integer>().put(0,1).build())));
		assertFalse(testArborarb.equals(Arborescence.<Integer>of(new ImmutableMap.Builder<Integer, Integer>().put(19,1).put(0,1).build())));
	}
    
    //
    Integer testEdgefrom = 0, testEdgedestination = 1;
	Edge<Integer> testEdgetestEdge;
    
    public void testEdgeinit() {
		testEdgefrom = 0;
		testEdgedestination = 1;
		testEdgetestEdge = new Edge(testEdgefrom,testEdgedestination);
	}
	
	@Test
	public void testEdgetestHashCode() {
		testEdgeinit();
		testEdgetestEdge.hashCode();
	}

	@Test
	public void testEdgetestEdge() {
		testEdgeinit();
		Edge<Integer> edge = new Edge(testEdgefrom, testEdgedestination);
	}

	@Test
	public void testEdgetestFrom() {
		testEdgeinit();
		EdgeBuilder edgeBuilder = Edge.from(testEdgefrom);
		edgeBuilder.to(testEdgedestination);
	}

	@Test
	public void testEdgetestToString() {
		testEdgeinit();
		testEdgetestEdge.toString();
	}

	@Test
	public void testEdgetestEqualsObject() {
		testEdgeinit();
		assertFalse(testEdgetestEdge.equals(null));
		assertFalse(testEdgetestEdge.equals(new Integer(12)));
		
		assertFalse("Fail",testEdgetestEdge.equals(new Edge<Integer>(testEdgefrom,testEdgefrom)));
		assertFalse("Fail",testEdgetestEdge.equals(new Edge<Integer>(testEdgedestination,testEdgedestination)));
		assertFalse("Fail",testEdgetestEdge.equals(new Edge<Integer>(testEdgedestination,testEdgefrom)));
		assertTrue("Fail",testEdgetestEdge.equals(new Edge<Integer>(testEdgefrom,testEdgedestination)));
	}

	@Test
	public void testEdgetestHasDestination() {
		testEdgeinit();
		assertFalse(Edge.hasDestination(testEdgefrom).apply(testEdgetestEdge));
		assertTrue(Edge.hasDestination(testEdgedestination).apply(testEdgetestEdge));
	}

	@Test
	public void testEdgetestCompetesWith() {
		testEdgeinit();
		Set<Edge<Integer>> required = new HashSet<>();
		required.add(testEdgetestEdge);
		Edge<Integer> newEdge = Edge.from(12).to(13);
		Edge<Integer> newEdgeB = Edge.from(1).to(1);
		assertFalse(Edge.competesWith(required).apply(testEdgetestEdge));
		assertFalse(Edge.competesWith(required).apply(newEdge));
		assertTrue(Edge.competesWith(required).apply(newEdgeB));
	}

	@Test
	public void testEdgetestIsAutoCycle() {
		testEdgeinit();
		assertTrue(Edge.<Integer>isAutoCycle().apply(Edge.from(0).to(0)));
		assertFalse(Edge.<Integer>isAutoCycle().apply(testEdgetestEdge));
	}

	@Test
	public void testEdgetestIsIn() {
		testEdgeinit();
		Set<Edge<Integer>> banned = new HashSet<>();
		banned.add(testEdgetestEdge);
		Edge<Integer> newEdge = Edge.from(12).to(13);
		Edge<Integer> newEdgeB = Edge.from(1).to(1);
		assertTrue(Edge.isIn(banned).apply(testEdgetestEdge));
		assertFalse(Edge.isIn(banned).apply(newEdge));
		assertFalse(Edge.isIn(banned).apply(newEdgeB));
	}
	
	
	//
	
	EdgeQueue<Integer> testEdgeQueueedgeQueue;
	Integer testEdgeQueuefrom, testEdgeQueuedestination;
	Partition<Integer> testEdgeQueuepartitionA;
	Partition<Integer> testEdgeQueuepartitionB;
	List<Integer> testEdgeQueuelistA = new ArrayList<>();
	List<Integer> testEdgeQueuelistB = new ArrayList<>();
	
	public void testEdgeQueueinit() {
		testEdgeQueuefrom = 0;
		testEdgeQueuedestination = 1;
		
		testEdgeQueuelistA.add(0);
		testEdgeQueuelistA.add(1);
		testEdgeQueuelistA.add(2);
		testEdgeQueuelistA.add(3);
		testEdgeQueuelistA.add(4);
		testEdgeQueuelistB.add(9);
		testEdgeQueuelistB.add(6);
		testEdgeQueuelistB.add(5);
		testEdgeQueuelistB.add(8);
		testEdgeQueuelistB.add(7);
		testEdgeQueuelistB.add(4);
		testEdgeQueuepartitionA = Partition.singletons(testEdgeQueuelistA);
		testEdgeQueuepartitionB = Partition.singletons(testEdgeQueuelistB);
		
		testEdgeQueueedgeQueue = EdgeQueue.create(testEdgeQueuefrom,testEdgeQueuepartitionA);
	}
	
	@Test
	public void testEdgeQueuetestCreate() {
		testEdgeQueueinit();
		testEdgeQueueedgeQueue = EdgeQueue.create(testEdgeQueuefrom,testEdgeQueuepartitionA);
	}

	@Test
	public void testEdgeQueuetestAddEdge() {
		testEdgeQueueinit();
		testEdgeQueuepartitionA.merge(0, 3);
		testEdgeQueuepartitionA.merge(0, 1);
		testEdgeQueuepartitionA.merge(2, 1);
		testEdgeQueueedgeQueue = EdgeQueue.create(testEdgeQueuefrom,testEdgeQueuepartitionA);
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(testEdgeQueuefrom).to(testEdgeQueuedestination), 12));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(4).to(testEdgeQueuedestination), 12));
	}

	@Test
	public void testEdgeQueuetestPopBestEdge() {
		testEdgeQueueinit();
		testEdgeQueuepartitionA.merge(0, 3);
		testEdgeQueuepartitionA.merge(0, 1);
		testEdgeQueuepartitionA.merge(2, 1);
		testEdgeQueueedgeQueue = EdgeQueue.create(testEdgeQueuefrom,testEdgeQueuepartitionA);
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(testEdgeQueuefrom).to(testEdgeQueuedestination), 12));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(4).to(testEdgeQueuedestination), 12));
		testEdgeQueueedgeQueue.popBestEdge();
	}

	@Test
	public void testEdgeQueuetestPopBestEdgeArborescenceOfV() {
		testEdgeQueueinit();
		testEdgeQueuepartitionA.merge(0, 3);
		testEdgeQueuepartitionA.merge(0, 1);
		testEdgeQueuepartitionA.merge(2, 1);
		testEdgeQueueedgeQueue = EdgeQueue.create(testEdgeQueuefrom,testEdgeQueuepartitionA);
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(testEdgeQueuefrom).to(testEdgeQueuedestination), 12));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(4).to(testEdgeQueuedestination), 12));
		testEdgeQueueedgeQueue.popBestEdge();
		
		EdgeQueue.create(0, null).popBestEdge();
		
		testEdgeQueuepartitionA = Partition.singletons(testEdgeQueuelistA);
		testEdgeQueueedgeQueue = EdgeQueue.create(testEdgeQueuefrom,testEdgeQueuepartitionA);
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(3).to(0), 12));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(1).to(0), 1));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(2).to(1), 11));
		testEdgeQueueedgeQueue.popBestEdge();
		
		testEdgeQueuepartitionA = Partition.singletons(testEdgeQueuelistA);
		testEdgeQueueedgeQueue = EdgeQueue.create(testEdgeQueuefrom,testEdgeQueuepartitionA);
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(2).to(1), 11));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(3).to(0), 11));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(1).to(0), 11));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(2).to(3), 11));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(3).to(1), 6));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(4).to(0), 11));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(4).to(2), 6));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(4).to(1), 3));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(1).to(4), 3));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(0).to(4), 11));
		testEdgeQueueedgeQueue.addEdge(ExclusiveEdge.of(Edge.from(2).to(4), 6));
		testEdgeQueueedgeQueue.popBestEdge();
		testEdgeQueueedgeQueue.popBestEdge(Arborescence.<Integer>of(new ImmutableMap.Builder<Integer, Integer>().put(1,0).put(0,1).build()));
		
	}
	
	//
	
	Partition<Integer> testEdgeQueueMappartitionA;
	Partition<Integer> testEdgeQueueMappartitionB;
	List<Integer> testEdgeQueueMaplistA = new ArrayList<>();
	List<Integer> testEdgeQueueMaplistB = new ArrayList<>();
	EdgeQueueMap<Integer> testEdgeQueueMapmapA;
	EdgeQueueMap<Integer> testEdgeQueueMapmapB;
	
	public void testEdgeQueueMapinit() {
		testEdgeQueueMaplistA.add(0);
		testEdgeQueueMaplistA.add(1);
		testEdgeQueueMaplistA.add(2);
		testEdgeQueueMaplistA.add(3);
		testEdgeQueueMaplistA.add(4);
		testEdgeQueueMaplistB.add(9);
		testEdgeQueueMaplistB.add(6);
		testEdgeQueueMaplistB.add(5);
		testEdgeQueueMaplistB.add(8);
		testEdgeQueueMaplistB.add(7);
		testEdgeQueueMaplistB.add(4);
		testEdgeQueueMappartitionA = Partition.singletons(testEdgeQueueMaplistA);
		testEdgeQueueMappartitionB = Partition.singletons(testEdgeQueueMaplistB);
		testEdgeQueueMapmapA = new EdgeQueueMap<Integer>(testEdgeQueueMappartitionA);
		testEdgeQueueMapmapB = new EdgeQueueMap<Integer>(testEdgeQueueMappartitionB);
	}
	
	@Test
	public void testEdgeQueueMaptestEdgeQueueMapFunc() {
		testEdgeQueueMapinit();
		testEdgeQueueMapmapA = new EdgeQueueMap<Integer>(testEdgeQueueMappartitionA);
	}

	@Test
	public void testEdgeQueueMaptestAddEdge() {
		testEdgeQueueMapinit();
		testEdgeQueueMapmapA.addEdge(Weighted.weighted(Edge.from(4).to(0), 3));
		testEdgeQueueMapmapA.addEdge(Weighted.weighted(Edge.from(4).to(0), 3));
		testEdgeQueueMapmapA.popBestEdge(null, null);
		testEdgeQueueMapmapA.popBestEdge(0, Arborescence.<Integer>of(new ImmutableMap.Builder<Integer, Integer>().put(1,0).put(0,1).build()));
	}

	@Test
	public void testEdgeQueueMaptestPopBestEdge() {
		testEdgeQueueMapinit();
		testEdgeQueueMapmapA.addEdge(Weighted.weighted(Edge.from(4).to(0), 3));
		testEdgeQueueMapmapA.addEdge(Weighted.weighted(Edge.from(4).to(0), 3));
		testEdgeQueueMapmapA.popBestEdge(null, null);
		testEdgeQueueMapmapA.popBestEdge(0, Arborescence.<Integer>of(new ImmutableMap.Builder<Integer, Integer>().put(1,0).put(0,1).build()));
	}

	@Test
	public void testEdgeQueueMaptestMerge() {
		testEdgeQueueMapinit();
		testEdgeQueueMappartitionA.merge(0, 3);
		testEdgeQueueMappartitionA.merge(0, 1);
		testEdgeQueueMappartitionA.merge(2, 1);
		EdgeQueue<Integer> edgeQueueA = EdgeQueue.create(0,testEdgeQueueMappartitionA);
		EdgeQueue<Integer> edgeQueueB = EdgeQueue.create(9,testEdgeQueueMappartitionB);
		
		
		edgeQueueA.addEdge(ExclusiveEdge.of(Edge.from(2).to(1), 11));
		edgeQueueA.addEdge(ExclusiveEdge.of(Edge.from(3).to(0), 11));
		edgeQueueA.addEdge(ExclusiveEdge.of(Edge.from(1).to(0), 11));
		edgeQueueA.addEdge(ExclusiveEdge.of(Edge.from(2).to(3), 11));
		edgeQueueA.addEdge(ExclusiveEdge.of(Edge.from(3).to(1), 6));
		edgeQueueA.addEdge(ExclusiveEdge.of(Edge.from(4).to(0), 11));
		edgeQueueA.addEdge(ExclusiveEdge.of(Edge.from(4).to(2), 6));
		edgeQueueA.addEdge(ExclusiveEdge.of(Edge.from(4).to(1), 3));
		edgeQueueA.addEdge(ExclusiveEdge.of(Edge.from(1).to(4), 3));
		edgeQueueA.addEdge(ExclusiveEdge.of(Edge.from(0).to(4), 11));
		edgeQueueA.addEdge(ExclusiveEdge.of(Edge.from(2).to(4), 6));
		
		List<Pair<EdgeQueue<Integer>, Weighted<Edge<Integer>>>> list = new ArrayList<>();
		list.add(new Pair<>(edgeQueueA,Weighted.<Edge<Integer>>weighted(Edge.from(9).to(2), 12)));
		try {
			testEdgeQueueMapmapB.merge(9, list);
			fail();
		}
		catch(Exception e) {
			
		}
	}

	
	//
	
	
	@Test
	public void testExclusiveEdgetestOfEdgeOfTListOfEdgeOfTDouble() {
		ExclusiveEdge.of(Edge.from(0).to(1), null, 12);
	}

	@Test
	public void testExclusiveEdgetestOfEdgeOfTDouble() {
		ExclusiveEdge.of(Edge.from(0).to(1), 12);
	}

	@Test
	public void testExclusiveEdgetestCompareTo() {
		assertEquals("Fail",ExclusiveEdge.of(Edge.from(0).to(1), 12).compareTo(ExclusiveEdge.of(Edge.from(0).to(1), 12)),0);
	}
	
	
	//
	
	
FibonacciHeap<Integer,Integer> testFibonacciHeapheap;
	
	public void testFibonacciHeapinit() {
		testFibonacciHeapheap = FibonacciHeap.create();
	}
	
	@Test
	public void testFibonacciHeaptestCreateComparatorOfQsuperC() {
		testFibonacciHeapinit();
		//fail("Not yet implemented");
	}

	@Test
	public void testFibonacciHeaptestCreate() {
		testFibonacciHeapinit();
		testFibonacciHeapheap = FibonacciHeap.create();
	}

	@Test
	public void testFibonacciHeaptestComparator() {
		testFibonacciHeapinit();
		//fail("Not yet implemented");
	}

	@Test
	public void testFibonacciHeaptestClear() {
		testFibonacciHeapinit();
		testFibonacciHeapheap.clear();
	}

	@Test
	public void testFibonacciHeaptestDecreasePriority() {
		testFibonacciHeapinit();
		//fail("Not yet implemented");
	}

	@Test
	public void testFibonacciHeaptestRemove() {
		testFibonacciHeapinit();
		//fail("Not yet implemented");
	}

	@Test
	public void testFibonacciHeaptestIsEmpty() {
		testFibonacciHeapinit();
		//fail("Not yet implemented");
	}

	@Test
	public void testFibonacciHeaptestAdd() {
		testFibonacciHeapinit();
		//fail("Not yet implemented");
	}

	@Test
	public void testFibonacciHeaptestPeekOption() {
		testFibonacciHeapinit();
		//fail("Not yet implemented");
	}

	@Test
	public void testFibonacciHeaptestPollOption() {
		testFibonacciHeapinit();
		//fail("Not yet implemented");
	}

	@Test
	public void testFibonacciHeaptestSize() {
		testFibonacciHeapinit();
		//fail("Not yet implemented");
	}

	@Test
	public void testFibonacciHeaptestMerge() {
		testFibonacciHeapinit();
		//fail("Not yet implemented");
	}

	@Test
	public void testFibonacciHeaptestIterator() {
		testFibonacciHeapinit();
		//fail("Not yet implemented");
	}
	
	
	//
	
	
	Partition<Integer> testPartitionpartitionA;
	Partition<Integer> testPartitionpartitionB;
	List<Integer> testPartitionlistA = new ArrayList<>();
	List<Integer> testPartitionlistB = new ArrayList<>();
	
	public void testPartitioninit() {
		testPartitionlistA.add(0);
		testPartitionlistA.add(1);
		testPartitionlistA.add(2);
		testPartitionlistA.add(3);
		testPartitionlistA.add(4);
		testPartitionlistB.add(9);
		testPartitionlistB.add(6);
		testPartitionlistB.add(5);
		testPartitionlistB.add(8);
		testPartitionlistB.add(7);
		testPartitionlistB.add(4);
		testPartitionpartitionA = Partition.singletons(testPartitionlistA);
		testPartitionpartitionB = Partition.singletons(testPartitionlistB);
	}
		
	@Test
	public void testPartitiontestSingletons() {
		testPartitioninit();
		testPartitionpartitionA = Partition.singletons(testPartitionlistA);
	}

	@Test
	public void testPartitiontestComponentOf() {
		testPartitioninit();
		assertEquals("Fail",testPartitionpartitionA.componentOf(0),(Integer)0);
		assertNotEquals("Fail",testPartitionpartitionA.componentOf(0),(Integer)1);
		assertNotEquals("Fail",testPartitionpartitionA.componentOf(1),(Integer)0);
		
		testPartitionpartitionA.merge(0, 3);
		assertEquals("Fail",testPartitionpartitionA.componentOf(3),(Integer)0);
		
		testPartitionpartitionA.merge(0, 1);
		testPartitionpartitionA.merge(2, 0);
		
		
		
	}

	@Test
	public void testPartitiontestMerge() {
		testPartitioninit();
		testPartitionpartitionA.merge(0, 0);
		testPartitionpartitionA.merge(0, 3);
		testPartitionpartitionA.merge(0, 1);
		testPartitionpartitionA.merge(2, 0);
	}

	@Test
	public void testPartitiontestSameComponent() {
		testPartitioninit();
		assertTrue(testPartitionpartitionA.sameComponent(3,3));
		assertFalse(testPartitionpartitionA.sameComponent(4,3));
	}

	@Test
	public void testPartitiontestGetNodes() {
		testPartitioninit();
		Map<Integer,Integer> parentMap = Maps.newHashMap();
		parentMap.put(0, 0);
		parentMap.put(1, 1);
		parentMap.put(2, 2);
		parentMap.put(3, 3);
		parentMap.put(4, 4);
		Object[] set = parentMap.keySet().toArray();
		Object[] setB = testPartitionpartitionA.getNodes().toArray();
		assertArrayEquals(set,setB);
	}
	
	
	//
	
	
	@Test
	public void testWeightedtestHashCode() {
		new Weighted(1,1).hashCode();
	}

	@Test
	public void testWeightedtestWeightedFunc() {
		new Weighted(1,1);
	}

	@Test
	public void testWeightedtestWeighted1() {
		Weighted.weighted(1, 1);
	}

	@Test
	public void testWeightedtestCompareTo() {
		assertEquals(Weighted.weighted(1, 1).compareTo(new Weighted(1,1)),0);
	}

	@Test
	public void testWeightedtestEqualsObject() {
		assertTrue(Weighted.weighted(1, 1).equals(new Weighted(1,1)));
		assertFalse(Weighted.weighted(1, 1).equals(new Weighted(0,1)));
		assertFalse(Weighted.weighted(1, 1).equals(new Weighted(1,2)));
		assertFalse(Weighted.weighted(1, 1).equals(new Weighted(0,2)));
		assertFalse(Weighted.weighted(1, 1).equals(null));
	}

	@Test
	public void testWeightedtestToString() {
		new Weighted(1,1).toString();
	}

	
}
