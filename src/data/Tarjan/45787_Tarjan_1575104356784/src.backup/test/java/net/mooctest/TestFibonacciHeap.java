package net.mooctest;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.junit.Test;

import com.google.common.base.Optional;

import net.mooctest.Edge.EdgeBuilder;
import net.mooctest.FibonacciHeap.Entry;


public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap01 = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> heap02 = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> heap03 = FibonacciHeap.create();
		assertEquals(heap01.isEmpty(), true);
		assertEquals(heap01.size(), 0);
		Optional<Integer> opt10 = heap01.pollOption();
		heap01.add(1, 8);
		Optional<Integer> opt11 = heap01.pollOption();
		Optional<FibonacciHeap<Integer, Integer>.Entry> opt01 = heap01.peekOption();
		heap01.add(2, 7);
		heap02.add(2, 7);
		heap03.add(2, 7);
		heap01.add(3, 6);
		heap01.add(4, 1);
		heap02.add(4, 1);
		heap03.add(4, 1);
		heap01.add(5, 5);
		heap01.add(6, 6);
		heap03.add(9, 8);
		assertEquals(heap01.isEmpty(), false);
		Optional<Integer> opt12 = heap01.pollOption();
		Optional<FibonacciHeap<Integer, Integer>.Entry> opt02 = heap01.peekOption();
		assertEquals(heap01.size(), 4);
		Entry ent01 = opt02.get();
		heap01.remove(ent01);
		opt02 = heap01.peekOption();
		Entry ent02 = opt02.get();
		heap01.remove(ent02);
		opt02 = heap01.peekOption();
		Entry ent03 = opt02.get();
		heap01.decreasePriority(ent03, 3);
		try {
			heap01.decreasePriority(ent02, -1);
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}finally {
		}
		
		
		Optional<FibonacciHeap<Integer, Integer>.Entry> opt03 = heap01.peekOption();
		Entry ent04 = opt02.get();
		Optional<FibonacciHeap<Integer, Integer>.Entry> opt04 = heap01.peekOption();
		Entry ent05 = opt02.get();
		heap01.decreasePriority(ent04, -102);
		
		
		heap02 = FibonacciHeap.merge(heap02, heap03);
		Iterator<FibonacciHeap<Integer, Integer>.Entry> ite01 = heap02.iterator();
		int cnt = 5;
		while(ite01.hasNext()) {
			Entry ent0 = ite01.next();
			try {
				heap01.decreasePriority(ent0, cnt);
			}catch(IllegalArgumentException e) {
				System.out.println(e);
			}finally {
				cnt-=2;
			}
		}
		Iterator<FibonacciHeap<Integer, Integer>.Entry> ite02 = heap02.iterator();
		cnt = 0;
		while(ite02.hasNext()) {
			Entry ent0 = ite02.next();
			try {
				heap01.decreasePriority(ent0, (int)Math.pow(-1, cnt)*10);
			}catch(IllegalArgumentException e) {
				System.out.println(e);
			}finally {
				cnt++;
			}
		}
		heap02.clear();
		heap02 = FibonacciHeap.merge(heap02, heap03);
		
		
		FibonacciQueue fq01 = FibonacciQueue.create();
		Comparator<Integer> cp01 = fq01.comparator();
		FibonacciQueue fq02 = FibonacciQueue.create(cp01);
		assertEquals(fq02.peek(), null);
		fq02.offer(new Integer(1));
		fq02.offer(new Integer(1));
		fq02.offer(new Integer(2));
		assertEquals(fq02.size(), 3);
		Integer fqi01 = (Integer)fq02.poll();
		assertEquals((int)fqi01, 1);
		
		
		
		Weighted wt01 = new Weighted(1, 1);
		Weighted wt02 = new Weighted(2, 2);
		Weighted wt03 = new Weighted(3, 3);
		Weighted wt04 = new Weighted(4, 6);
		Weighted wt05 = new Weighted(5, 5);
		Weighted wt06 = new Weighted(6, 4);
		Weighted wt07 = Weighted.weighted(7, 3);
		Weighted wt08 = Weighted.weighted(3, 7);
		assertEquals(wt07.compareTo(wt03),-1);
		assertEquals(wt06.compareTo(wt04),1);
		assertEquals(wt05.compareTo(wt02),-1);
		assertEquals(wt04.compareTo(wt01),-1);
		assertEquals(wt04.compareTo(wt04),0);
		assertEquals(wt04.equals(wt04), true);
		assertEquals(wt03.equals(wt04), false);
		assertEquals(wt04.equals(null), false);
		assertEquals(wt03.equals(wt07), false);
		assertEquals(wt03.equals(wt08), false);
		assertEquals(wt03.hashCode(), 1074267166);
		assertEquals(wt04.hashCode(), 1075315773);
		assertEquals(wt03.toString(), "Weighted{val=3, weight=3.0}");
		assertEquals(wt04.toString(), "Weighted{val=4, weight=6.0}");
		
		
		
		double[][] weights01 = new double[][]{{0,2,3,0,0,0},{0,0,0,4,0,0},{0,0,0,4,5,0},{1,0,0,0,0,6},{0,0,0,0,0,6},{0,0,0,0,0,0}};
		DenseWeightedGraph dwg01 = DenseWeightedGraph.from(weights01);
		Collection<Integer> coll01 = dwg01.getNodes();
		assertEquals((int)dwg01.getWeightOf(1, 3), 4);
		assertEquals((int)dwg01.getWeightOf(2, 4), 5);
		assertEquals((int)dwg01.getWeightOf(1, 4), 0);
		try {
			dwg01.getWeightOf(1,7);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
		}
		try {
			dwg01.getWeightOf(7,1);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
		}
		Collection<Weighted<Edge<Integer>>> cwe01 = dwg01.getIncomingEdges(new Integer(4));
		assertEquals(cwe01.size(), 6);
		cwe01 = dwg01.getIncomingEdges(new Integer(7));
		assertEquals(cwe01.size(), 0);
		
		
		Collection<Integer> coll02 = new ArrayList();
		for(int i=1;i<=6;i++) {
			coll02.add(i);
		}
		Collection<Weighted<Edge<Integer>>> wte01 = new ArrayList();
		Edge edg01 = new Edge<Integer>(1, 2);
		Edge edg02 = new Edge<Integer>(1, 3);
		Edge edg03 = new Edge<Integer>(2, 4);
		Edge edg04 = new Edge<Integer>(3, 4);
		Edge edg05 = new Edge<Integer>(3, 5);
		Edge edg06 = new Edge<Integer>(4, 1);
		Edge edg07 = new Edge<Integer>(4, 6);
		Edge edg08 = new Edge<Integer>(5, 6);
		Edge edg09 = new Edge<Integer>(5, 7);
		assertEquals(edg08.hashCode(), 1122);
		assertEquals(edg08.toString(), "Edge{source=5, destination=6}");
		assertEquals(edg08.equals(edg08), true);
		assertEquals(edg08.equals(edg07), false);
		assertEquals(edg08.equals(edg06), false);
		assertEquals(edg08.equals(edg09), false);
		assertEquals(edg08.equals(null), false);
		assertEquals(edg08.equals(new Integer(3)), false);
		edg08.hasDestination(new Integer(6));
		edg08.isAutoCycle();
		Set<Edge<Integer>> set01 = new HashSet();
		Set<Edge<Integer>> set02 = new HashSet();
		set01.add(edg01);
		set01.add(edg08);
		set02.add(edg07);
		edg08.competesWith(set01);
		edg08.competesWith(set02);
		edg08.isIn(set01);
		edg08.isIn(set02);
		
		
		
		
		Weighted<Edge<Integer>> we01 = new Weighted(edg01, 2);
		Weighted<Edge<Integer>> we02 = new Weighted(edg02, 3);
		Weighted<Edge<Integer>> we03 = new Weighted(edg03, 4);
		Weighted<Edge<Integer>> we04 = new Weighted(edg04, 4);
		Weighted<Edge<Integer>> we05 = new Weighted(edg05, 5);
		Weighted<Edge<Integer>> we06 = new Weighted(edg05, 1);
		Weighted<Edge<Integer>> we07 = new Weighted(edg05, 6);
		Weighted<Edge<Integer>> we08 = new Weighted(edg05, 6);
		wte01.add(we01);
		wte01.add(we02);
		wte01.add(we03);
		wte01.add(we04);
		wte01.add(we05);
		wte01.add(we06);
		wte01.add(we07);
		wte01.add(we08);
		Iterable ita01 = coll02;
		Iterable ita02 = wte01;
		SparseWeightedGraph swg01 = SparseWeightedGraph.from(ita01, ita02);
		SparseWeightedGraph swg02 = SparseWeightedGraph.from(ita02);
		Collection coll03 = swg02.getNodes();
		assertEquals(coll03.size(), 5);
		assertEquals((int)swg02.getWeightOf(1, 3), 3);
		Collection<Weighted<Edge<Integer>>> coll04 = swg02.getIncomingEdges(new Integer(4));
		assertEquals(coll04.size(), 2);
		//Predicate<T>
		
		
		ExclusiveEdge<Integer> eed01 = ExclusiveEdge.of(edg01, 3);
		assertEquals(eed01.compareTo(eed01), 0);
		
		
		Pair pr01 = Pair.of(1, 2);
		Pair pr02 = Pair.of(1, 3);
		Pair pr03 = Pair.of(3, 2);
		Pair pr04 = Pair.of(3, 3);
		assertEquals(pr01.equals(pr01), true);
		assertEquals(pr01.equals(null), false);
		assertEquals(pr01.equals(pr02), false);
		assertEquals(pr01.equals(pr03), false);
		assertEquals(pr01.equals(pr04), false);
		assertEquals(pr01.equals(new Integer(2)), false);
		assertEquals(pr01.hashCode(), 994);
		assertEquals(pr01.toString(), "Pair{first=1, second=2}");
		
		fq01.iterator();
		fq02.iterator();
	}

	
}
