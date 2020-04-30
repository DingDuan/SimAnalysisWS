package net.mooctest;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

public class TestFibonacciHeap {
    @Test(timeout=4000)
        public void test() {
                ArrayList<Integer> nodeList = new ArrayList<>();
                nodeList.add(1);
                nodeList.add(2);
                nodeList.add(3);
                
                Edge<Integer> edges1 = new Edge<Integer>(1, 2);
                Weighted<Edge<Integer>> weighted1 = new Weighted<Edge<Integer>>(edges1, 2.0);
                Edge<Integer> edges2 = new Edge<Integer>(2, 1);
                Weighted<Edge<Integer>> weighted2 = new Weighted<Edge<Integer>>(edges2, 3.0);
                Edge<Integer> edges3 = new Edge<Integer>(2, 3);
                Weighted<Edge<Integer>> weighted3 = new Weighted<Edge<Integer>>(edges3, 3.0);
                
                ArrayList<Weighted<Edge<Integer>>> wArrayList = new ArrayList<>();
                wArrayList.add(weighted1);
                wArrayList.add(weighted2);
                wArrayList.add(weighted3);
                
                SparseWeightedGraph<Integer> sparseWeightedGraph = SparseWeightedGraph.from(nodeList, wArrayList);
                ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds = ChuLiuEdmonds.PartialSolution.initialize(sparseWeightedGraph);
        }
    
    @Test
	public void testOf_2()
		throws Exception {
		Edge<Object> edge = new Edge((Object) null, (Object) null);
		List<Edge<Object>> excluded = new LinkedList();
		double weight = 1.0;

		ExclusiveEdge<Object> result = ExclusiveEdge.of(edge, excluded, weight);

		// add additional test code here
		assertNotNull(result);
	}
    
    @Test
	public void testScoreSubsetOfSolutions_11()
		throws Exception {
		WeightedGraph<Object> graph = DenseWeightedGraph.from(null, new double[][] {{-1.0, 0.0, 1.0, -0.5, 0.5, Double.MAX_VALUE, Double.MIN_VALUE}});
		Set<Edge<Object>> required = new HashSet();
		Set<Edge<Object>> banned = new HashSet();
		Weighted<Arborescence<Object>> wBestArborescence = new Weighted(new Object(), 1.0);

		Optional<Weighted<KBestArborescences.SubsetOfSolutions<Object>>> result = KBestArborescences.scoreSubsetOfSolutions(graph, required, banned, wBestArborescence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.google.common.base.Preconditions.checkNotNull(Preconditions.java:191)
		//       at com.google.common.collect.Lists.newArrayList(Lists.java:123)
		//       at tarjan2.DenseWeightedGraph.from(DenseWeightedGraph.java:28)
		//       at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
		//       at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
		assertNotNull(result);
	}
    
	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
        //System.out.println(heap.size());
        assertEquals(0, heap.size());
        assertEquals(true, heap.isEmpty());
        heap.clear();
        assertEquals(0, heap.size());
        Integer a = 0;
        Integer b = 1;
        heap.add(a, b);
        assertEquals(1, heap.size());
	}

	@Test
	public void test1() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
        Integer a = 0;
        Integer b = 1;
        heap.add(a, b);
        a = 1;
        b = 1;
        heap.add(a, b);
        assertEquals(Optional.of(0), heap.pollOption());
        heap.peekOption();
        heap.iterator();
	}
    
    @Test
	public void testCompareTo_1()
		throws Exception {
		ExclusiveEdge fixture = ExclusiveEdge.of(null, new ArrayList<Edge<Object>>(), -1.0);
		ExclusiveEdge<Object> exclusiveEdge = ExclusiveEdge.of(null, new ArrayList<Edge<Object>>(), -1.0);

		int result = fixture.compareTo(exclusiveEdge);

		// add additional test code here
		assertEquals(0, result);
	}
    
    @Test
    public void test2() {
        Integer a = 0;
        Integer b = 1;
        Weighted<Integer> w = new Weighted<Integer>(a, b);
        Weighted<Integer> w1 = new Weighted<Integer>(a, b);
        assertEquals(true, w.equals(w1));
        assertEquals(0, w.compareTo(w1));
        assertEquals(1072694209, w.hashCode());
    }
    
    @Test
    public void test3() {
        Integer a = 0;
        Integer b = 1;
        Integer c = 2;
        Pair<Integer, Integer> p = new Pair<Integer, Integer> (a, b);
        Pair<Integer, Integer> p1 = p.of(a, b);
        assertEquals(true, p.equals(p1));
        assertEquals(962, p.hashCode());
        
    }
    
    @Test
    public void test4() {
        Integer a = 0;
        Integer b = 1;
        Integer c = 2;
        Edge<Integer> e = new Edge<Integer>(a, b);
        Edge<Integer> e1 = new Edge<Integer>(a, c);
        assertEquals(false, e.equals(e1));
    }
}
