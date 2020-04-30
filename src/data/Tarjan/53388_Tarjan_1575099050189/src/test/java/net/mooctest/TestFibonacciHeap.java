package net.mooctest;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.naming.PartialResultException;

import org.junit.Test;
import org.junit.experimental.categories.ExcludeCategories;


public class TestFibonacciHeap {

	@Test
	public void test() {
		Weighted<Integer> weighted=new Weighted<Integer>(1, 12.2);
		weighted.hashCode();
		
		Weighted<Integer> weighted2=new Weighted<Integer>(1, 132.2);
		Weighted<Integer> weighted3=new Weighted<Integer>(2, 12.2);
		assertEquals(weighted.equals(weighted2),false);
		assertEquals(weighted.equals(weighted),true);
		assertEquals(weighted.equals(weighted3),false);
		assertEquals(weighted.equals(weighted),true);
		assertEquals(weighted.equals("ss"),false);
		assertEquals(weighted.equals("ss"),false);
		weighted.compareTo(weighted3);
		weighted.toString();
		Weighted.weighted(1, 22.3);
		try {
			assertEquals(weighted.equals(null),false);
	     }catch(Exception e) {
	    	 
	     }
		
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> heap2 = FibonacciHeap.create();
		heap.add(1, 2);
		heap.comparator();
		heap.peekOption();
		heap.create();
		

	     try {
	    	 heap2.decreasePriority(null, 1);
	     }catch(Exception e) {
	    	 
	     }
	     try {
	    	
	     }catch(Exception e) {
	    	 
	     }
	     ;
	    assertEquals(heap2.isEmpty(),true);
	    assertEquals(   heap2.size(),0);
	    heap2.add(1, 2);
	    
	    assertEquals(heap2.isEmpty(),false);
	 ;
	    assertEquals(   heap2.size(),1);
	   
	    assertEquals(   heap2.MAX_CAPACITY,2147483647);
	   
	    try {
	    	heap2.remove(null);
	     }catch(Exception e) {
	    	 
	     }
	    
		Pair<Integer, Integer> pair=new Pair<Integer, Integer>(1,2);
		Pair<Integer, Integer> pair2=new Pair<Integer, Integer>(2,2);
		Pair<Integer, Integer> pair3=new Pair<Integer, Integer>(1,3);
		;
		
		assertEquals(pair.first,(Object)1);
		assertEquals(pair.second,(Object)2);
		
		pair.toString();
		assertEquals(pair.equals(pair2),false);
		assertEquals(pair.equals(pair3),false);
		assertEquals(pair.equals(pair),true);
		assertEquals(pair.equals(pair),true);
		assertEquals(pair.equals("ss"),false);
		try {
			assertEquals(pair.equals(null),false);
	     }catch(Exception e) {
	    	 
	     }
		pair.hashCode();
		Pair.of(1, 2);
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		Partition.singletons(list1);
		
		
		Edge<Integer> edge=new Edge<Integer>(1, 2);
		Edge<Integer> edge2=new Edge<Integer>(2, 2);
		Edge<Integer> edge3=new Edge<Integer>(1, 3);
		assertEquals(edge.equals(edge2),false);
		assertEquals(edge.equals(edge3),false);
		assertEquals(edge.equals(edge),true);
		assertEquals(edge.equals(edge),true);
		assertEquals(edge.equals("ss"),false);
		edge.hasDestination(1);
		edge.isAutoCycle();
		Set<Edge<Integer>> set=new HashSet<Edge<Integer>>();
		set.add(new Edge<Integer>(1,2));
		set.add(new Edge<Integer>(2,2));
		set.add(new Edge<Integer>(1,3));
		edge.isIn(set);
		
		  try {
				assertEquals(edge.equals(null),false);
		     }catch(Exception e) {
		    	 
		     }
		  edge.hasDestination(1);
		 EdgeQueueMap<Integer> edgeQueueMap=new EdgeQueueMap<Integer>(null);
		 EdgeQueueMap<Integer> edgeQueueMap2=new EdgeQueueMap<Integer>(null);
		 
		 try {
			 edgeQueueMap2.addEdge(null);
	     }catch(Exception e) {
	    	 
	     }
		 try {
			 edgeQueueMap.merge(1, null);
	     }catch(Exception e) {
	    	 
	     }
		 try {
			 edgeQueueMap.addEdge(new Weighted<Edge<Integer>>(new Edge<Integer>(1, 2), 12));
	     }catch(Exception e) {
	    	 
	     }
		 KBestArborescences kbestArborescences=new KBestArborescences();

		    try {
		    	 kbestArborescences.getKBestArborescences(null, null, 1);
		     }catch(Exception e) {
		    	 
		     }
		    ExclusiveEdge.of(edge, 12.2);
		    List<Edge<Integer>> edgeList=new ArrayList<Edge<Integer>>();
		    edgeList.add(edge3);
		    edgeList.add(edge2);
		    edgeList.add(edge);
		    ExclusiveEdge.of(edge,edgeList, 11.2);
		    ExclusiveEdge.of(edge2,edgeList, 11.2);
		    ExclusiveEdge.of(edge3,edgeList, 11.2);
		    ExclusiveEdge.of(edge3,edgeList, 11.2);
		 //edgeQueueMap.addEdge(new Weighted<Edge<Integer>>(new Edge<Integer>(2, 2), 1)); 
	    heap.merge(heap2, heap);
	    
	    try {
	    	
	     }catch(Exception e) {
	    	 
	     }
		heap.clear();
		heap2.clear();
		
		
	}
	

	
}
