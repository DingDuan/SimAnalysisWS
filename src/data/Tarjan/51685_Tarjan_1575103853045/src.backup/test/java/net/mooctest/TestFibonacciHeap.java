package net.mooctest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import com.google.common.base.Optional;

import java.util.*;

import org.junit.Test;

import net.mooctest.ChuLiuEdmonds.PartialSolution;
import net.mooctest.FibonacciHeap.Entry;


public class TestFibonacciHeap {

	@Test(timeout=400)
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		assertEquals(false,heap.create().equals(heap));
		assertEquals(0,heap.size());
		assertEquals(new Integer(3),heap.add(3, 1).get().value);
		assertEquals(new Integer(3),heap.peekOption().get().value);
		assertEquals(false,heap.isEmpty());
		heap.clear();
		assertEquals(true,heap.isEmpty());
		try {
			heap.decreasePriority(null,4);
			//fail("Cannot increase priority");
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		FibonacciHeap<Integer,Integer> a = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> b = FibonacciHeap.create();
		a.add(3, 3);
		b.add(4, 4);
		
		assertEquals(2,heap.merge(a, b).size());
		heap.add(3, 4);
		heap.add(4, 2);
		try{
			heap.decreasePriority(heap.peekOption().get(),3);
			fail("Cannot increase priority");
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		
		heap.decreasePriority(heap.peekOption().get(),0);
		heap.add(3, 1);
		//heap.decreasePriority(heap.peekOption().get(),1);
		Optional<Integer> opt=heap.pollOption();
		heap.remove(heap.peekOption().get());
		
		assertEquals(new Integer(3),a.pollOption().get());
		Iterator it=heap.iterator();
		assertEquals(true,it.hasNext());
		//System.out.println(it.next().toString());
		heap.add(4, 4);
		
		assertEquals(true,heap.pollOption().isPresent());
		heap.decreasePriority(heap.peekOption().get(),3);
	}
	
	@Test(timeout=400)
	public void testFibonacciQueue() {
		FibonacciQueue<Integer> queue=FibonacciQueue.create();
		//queue.add(3);
		assertEquals(false,queue.comparator().equals(queue));
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		assertEquals(new Integer(3),heap.add(3, 1).get().value);
		assertEquals(null,queue.peek());
		assertEquals(true,queue.offer(new Integer(3)));
		FibonacciQueue<Integer> que=FibonacciQueue.create(heap.comparator());
		que.comparator();
		
		FibonacciQueue<Integer> nque=FibonacciQueue.create();
		nque.add(3);
		assertEquals(new Integer(3),nque.peek());
		assertEquals(new Integer(3),queue.poll());
		assertEquals(0,queue.size());
		assertEquals(false,queue.iterator().hasNext());
		
	}

	
	@Test(timeout=400)
	public void testDenseWeightedGraph() {
		List<Integer> nodes=new ArrayList<>();
		nodes.add(1);
		nodes.add(2);
		nodes.add(3);
		nodes.add(4);
		nodes.add(5);
		double[][] weights= {{1,2},{3,4},{5,6},{7,8},{9,10}};
		DenseWeightedGraph<Integer> dh=DenseWeightedGraph.from(nodes,weights);
		assertEquals(true,dh.getNodes().contains(nodes.get(1)));
		//System.out.print(dh.getWeightOf(new Integer(1),new Integer(2)));
		
//		double res=2.0;
//		double ral=dh.getWeightOf(new Integer(1),new Integer(2));
		assertEquals(5,dh.getIncomingEdges(new Integer(2)).size());
		DenseWeightedGraph<Integer> dhg=DenseWeightedGraph.from(weights);
		assertEquals(5,dhg.getIncomingEdges(new Integer(1)).size());
		
		
		List<Integer> node=new ArrayList<>();
		node.add(1);
		//node.add(2);
		double[][] weight= {{1,2}};
		DenseWeightedGraph<Integer> graph=DenseWeightedGraph.from(node,weight);
		PartialSolution<Integer> par=PartialSolution.initialize(graph);
		assertEquals(true,par.getNodes().contains(1));
		PartialSolution<Integer> par2=PartialSolution.initialize(graph);
		
		
		//assertEquals(new Integer(1),par.popBestEdge(1).get().edge);
	}
	
	@Test(timeout=400)
	public void testWeighted() {
		Weighted wei=new Weighted(1,2);
		Weighted wei2=new Weighted(1,2);
		Weighted wei3=new Weighted(1,3);
		assertEquals(0,wei.compareTo(wei2));
		assertEquals(false,wei.equals(0));
		assertEquals(true,wei.equals(wei));
		assertEquals(false,wei.equals(wei3));
		assertEquals(true,wei.equals(wei2));
		assertEquals("Weighted{val=1, weight=2.0}",wei.toString());
		
		
	}
	
	@Test(timeout=400)
	public void testAnyWay() {
		Edge<Integer> edge=new Edge(1,2);
		Edge<Integer> edge2=new Edge(1,3);
		Edge<Integer> edge3=new Edge(2,1);
		assertEquals(true,edge.equals(edge));
		assertEquals(false,edge.equals(null));
		assertEquals(false,edge.equals("str"));
		assertEquals(false,edge.equals(edge2));
		assertEquals(false,edge.equals(edge3));
		assertEquals("Edge{source=1, destination=2}",edge.toString());
		
		assertEquals(true,Edge.hasDestination(2).apply(edge));
		assertEquals(new Integer(1),ExclusiveEdge.of(edge, 0).edge.source);
		//assertEquals(true,Edge.isAutoCycle().apply(null));
//		ExclusiveEdge<Integer> excu=new ExclusiveEdge<>();
//		par.addEdge(null)a;
		
		
	}
	
	
	
	
}
