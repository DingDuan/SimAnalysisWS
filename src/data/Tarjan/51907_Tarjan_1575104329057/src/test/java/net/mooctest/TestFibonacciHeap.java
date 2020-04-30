package net.mooctest;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class TestFibonacciHeap {

	public Object invokeField(String packageAndClassName, String fieldName, Object inst) {
		Field field = null;
		try {
			Class clazz = Class.forName(packageAndClassName);
			field = clazz.getDeclaredField(fieldName);
			field.setAccessible(true);
			try {
				return field.get(inst);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | NoSuchFieldException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Method invokeMethod(String packageAndClassName, String methodName, Class<?>... parameterTypes) {
		Method method = null;
		try {
			Class clazz = Class.forName(packageAndClassName);
			method = clazz.getDeclaredMethod(methodName, parameterTypes);
		} catch (ClassNotFoundException | NoSuchMethodException e) {
			e.printStackTrace();
		}
		if (method != null)
			method.setAccessible(true);
		return method;
	}

	@Before
	public void before() throws Exception {
	}

	@After
	public void after() throws Exception {
	}

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test(timeout = 4000)
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		Random random = new Random();
		for (int i = 0; i < 1000; i++) {
			heap.add(i, random.nextInt(1000));
		}

		assertTrue(heap.size() == 1000);
	}

	@Test(timeout = 4000)
	public void customTest19() throws Exception {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		heap.add(1, 2);
		heap.add(2, 2);
		assertFalse(heap.hashCode() == 1398488399);
	}

	@Test(timeout = 4000)
	public void customTest34() throws Exception {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(1, 1);
		hashMap.put(2, 3);
		hashMap.put(3, 4);
		double[][] weight = new double[][]{{1.1, 1.2}, {1.1, 1.2}, {1.1, 1.2}};
		assertTrue(DenseWeightedGraph.from(arrayList, weight).getNodes().toString().equals("[1, 2, 3]"));
	}

	@Test(timeout = 4000)
	public void customTest512() throws Exception {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(1, 1);
		hashMap.put(2, 3);
		hashMap.put(3, 4);
		double[][] weight = new double[][]{{1.1, 1.2}, {1.1, 1.2}, {1.1, 1.2}};
		DenseWeightedGraph denseWeightedGraph = DenseWeightedGraph.from(arrayList, weight);
		assertTrue(denseWeightedGraph.getIncomingEdges(4).size() == 0);
		assertTrue(denseWeightedGraph.getIncomingEdges(1).size() == 3);
		assertTrue(denseWeightedGraph.getWeightOf(1, 2)  == 1.2);
		assertTrue(denseWeightedGraph.getWeightOf(-1, 1) == Double.NEGATIVE_INFINITY);
		assertTrue(denseWeightedGraph.getWeightOf(1, 5) == Double.NEGATIVE_INFINITY);
		assertTrue(denseWeightedGraph.getWeightOf(-1, 3) == Double.NEGATIVE_INFINITY);
	}

	@Test(timeout = 4000)
	public void customTest50() throws Exception {
		double[][] weight = new double[][]{{1.1, 1.2}, {1.1, 1.2}, {1.1, 1.2}};
		assertTrue(DenseWeightedGraph.from(weight).getNodes().toString().equals("[0, 1, 2]"));
	}

	@Test(timeout = 4000)
	public void customTest56() throws Exception {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(1, 1);
		hashMap.put(2, 3);
		hashMap.put(3, 4);
		double[][] weight = new double[][]{{1.1, 1.2}, {1.1, 1.2}, {1.1, 1.2}};
		DenseWeightedGraph denseWeightedGraph = DenseWeightedGraph.from(arrayList, weight);
		HashSet<Edge<Integer>> hashSet = new HashSet<>();
		hashSet.add(new Edge<Integer>(1, 2));
		hashSet.add(new Edge<Integer>(2, 3));
		hashSet.add(new Edge<>(3, 1));
	}

	@Test(timeout = 4000)
	public void customTest74() throws Exception {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		heap.add(1, 2);
		heap.add(2, 3);
		heap.add(3, 4);
		assertFalse(heap.isEmpty());
		assertTrue(heap.size() == 3);
		Iterator iterator = heap.iterator();
		for (Iterator it = iterator; it.hasNext(); ) {
			Object obj = it.next();
		}
	}

	@Test(timeout = 4000)
	public void customTest88() throws Exception {
		Weighted<Integer> weighted = new Weighted<>(1, 2);
		assertTrue(Weighted.weighted(1, 2).equals(weighted));
		assertTrue(weighted.equals(weighted));
		assertFalse(weighted.equals(null));
		Weighted<Integer> weighted1 = new Weighted<>(1, 3);
		assertFalse(weighted.equals(weighted1));
		Weighted<Integer> weighted2 = new Weighted<>(2, 2);
		assertFalse(weighted.equals(weighted2));
		Weighted<Integer> weighted3 = new Weighted<>(1, 2);
		assertTrue(weighted.equals(weighted3));
		assertTrue(weighted.compareTo(weighted) == 0);
		assertTrue(weighted.compareTo(weighted1) == 1);
		Weighted<Integer> weighted34 = new Weighted<>(0, 0);
		assertTrue(weighted.compareTo(weighted34) == -1);
	}

	@Test(timeout = 4000)
	public void customTest103() throws Exception {
		Weighted<Integer> weighted = new Weighted<>(1, 2);
		assertTrue(weighted.hashCode() == 1073742816);
		assertTrue(weighted.toString().equals("Weighted{val=1, weight=2.0}"));
	}

	@Test(timeout = 4000)
	public void customTest109() throws Exception {
		Edge<Integer> edge = new Edge<>(1, 2);
		assertTrue(edge.hashCode() == 994);
		assertTrue(edge.destination == 2);
		assertTrue(edge.source == 1);
		assertTrue(edge.toString().equals("Edge{source=1, destination=2}"));
		Edge<Integer> edge2 = new Edge<>(1, 2);
		Edge<Integer> edge3 = new Edge<>(1, 3);
		Edge<Integer> edge4 = new Edge<>(2, 2);
		assertTrue(edge.equals(edge));
		assertTrue(edge.equals(edge2));
		assertFalse(edge.equals(edge3));
		assertFalse(edge.equals(edge4));
		assertFalse(edge.equals(new StringBuffer()));
		Edge.hasDestination(1);
	}

	@Test(timeout = 4000)
	public void customTest150() throws Exception {
		Edge<Integer> edge2 = new Edge<>(1, 2);
		Edge<Integer> edge3 = new Edge<>(3, 3);
		Edge<Integer> edge4 = new Edge<>(2, 1);
		Edge<Integer> edge = new Edge<>(4, 4);
		HashSet<Edge<Integer>> hashSet = new HashSet<>();
		hashSet.add(edge);
		hashSet.add(edge4);
		hashSet.add(edge2);
		hashSet.add(edge3);
		Edge.competesWith(hashSet);
		Edge.isAutoCycle();
	}

	@Test(timeout = 4000)
	public void customTest166() throws Exception {
		Edge<Integer> edge2 = new Edge<>(1, 2);
		Edge<Integer> edge3 = new Edge<>(3, 3);
		Edge<Integer> edge4 = new Edge<>(2, 2);
		Edge<Integer> edge = new Edge<>(4, 4);
		HashSet<Edge<Integer>> hashSet = new HashSet<>();
		hashSet.add(edge);
		hashSet.add(edge4);
		hashSet.add(edge2);
		hashSet.add(edge3);
		expectedException.expect(IllegalArgumentException.class);
		Edge.competesWith(hashSet);
	}

	@Test(timeout = 4000)
	public void customTest225() throws Exception {
		Edge<Integer> edge2 = new Edge<>(1, 2);
		Edge<Integer> edge3 = new Edge<>(3, 3);
		Edge<Integer> edge4 = new Edge<>(2, 2);
		Edge<Integer> edge = new Edge<>(4, 4);
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(1, 2);
		hashMap.put(2, 3);
		hashMap.put(3, 4);
		HashMap<Integer, Integer> rank = new HashMap<>();
		rank.put(1, 2);
		rank.put(2, 3);
		rank.put(3, 4);
		ArrayList arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		Partition<Integer> partition = Partition.singletons(arrayList);
		assertTrue(partition.componentOf(1) == 1);
		assertTrue(partition.componentOf(3) == 3);
		EdgeQueueMap.EdgeQueue edgeQueue = EdgeQueueMap.EdgeQueue.create(3, partition);
		assertTrue(edgeQueue.edges.size() == 0);
		ArrayList<Edge<Integer>> arrayList1 = new ArrayList<>();
		arrayList.add(edge2);
		ExclusiveEdge exclusiveEdge = ExclusiveEdge.of(edge, arrayList1, 2);
		System.out.println(exclusiveEdge.edge.hashCode() == 1089);
//		edgeQueue.addEdge(exclusiveEdge);
	}

	@Test(timeout = 4000)
	public void customTest254() throws Exception {
		Edge<Integer> edge2 = new Edge<>(1, 2);
		Edge<Integer> edge3 = new Edge<>(3, 3);
		Edge<Integer> edge4 = new Edge<>(2, 2);
		Edge<Integer> edge = new Edge<>(4, 4);
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(1, 2);
		hashMap.put(2, 3);
		hashMap.put(3, 4);
		HashMap<Integer, Integer> rank = new HashMap<>();
		rank.put(1, 2);
		rank.put(2, 3);
		rank.put(3, 4);
		ArrayList arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		Partition<Integer> partition = Partition.singletons(arrayList);
		assertTrue(partition.componentOf(1) == 1);
		assertTrue(partition.componentOf(3) == 3);
		EdgeQueueMap.EdgeQueue edgeQueue = EdgeQueueMap.EdgeQueue.create(3, partition);
		assertTrue(edgeQueue.edges.size() == 0);
		ArrayList<Edge<Integer>> arrayList1 = new ArrayList<>();
		arrayList.add(edge2);
		ExclusiveEdge exclusiveEdge = ExclusiveEdge.of(edge, arrayList1, 2);
		expectedException.expect(NullPointerException.class);
		edgeQueue.addEdge(exclusiveEdge);
	}

	@Test(timeout = 4000)
	public void customTest244() throws Exception {
		ArrayList arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		Partition<Integer> partition = Partition.singletons(arrayList);
		expectedException.expect(NullPointerException.class);
		partition.componentOf(-1);
	}

	@Test(timeout = 4000)
	public void customTest296() throws Exception {
	  Pair<Integer, Integer> pair = new Pair<>(1, 2);
		Pair<Integer, Integer> pair2 = new Pair<>(1, 2);
		Pair<Integer, Integer> pair3 = new Pair<>(3, 2);
		Pair<Integer, Integer> pair4 = new Pair<>(1, 2);
	  assertTrue(pair.first == 1);
	  assertTrue(pair.second == 2);
	  assertTrue(pair.equals(pair));
	  assertTrue(pair.equals(pair2));
	  assertFalse(pair.equals(pair3));
	  assertFalse(pair3.equals(pair));
	  assertFalse(pair.equals(null));
	  assertFalse(pair.equals(new String()));
		assertTrue(pair.hashCode() == 994);
		assertTrue(pair.toString().equals("Pair{first=1, second=2}"));
	}

	@Test(timeout = 4000)
	public void customTest312() throws Exception {
		ArrayList<Integer> arrayList = new ArrayList<>();
		ArrayList<Weighted<Edge<Integer>>> arrayList1 = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList1.add(new Weighted<>(new Edge<>(1, 2), 2));
		arrayList1.add(new Weighted<>(new Edge<>(2, 3), 3));
	  SparseWeightedGraph sparseWeightedGraph = SparseWeightedGraph.from(arrayList, arrayList1);
		assertTrue(sparseWeightedGraph.getNodes().size() == 2);
		assertTrue(sparseWeightedGraph.getWeightOf(1, 2) == 2.0);
	}

	@Test(timeout = 4000)
	public void customTest325() throws Exception {
	  FibonacciQueue fibonacciQueue = FibonacciQueue.create();
	  assertTrue(fibonacciQueue.add(1));
	  assertTrue((int)fibonacciQueue.poll() == 1);
	  assertTrue(fibonacciQueue.size() == 0);
	}

	@Test(timeout = 4000)
	public void customTest333() throws Exception {
		FibonacciQueue fibonacciQueue = FibonacciQueue.create();
		expectedException.expect(NullPointerException.class);
		fibonacciQueue.addAll((ArrayList)null);
	}

	@Test(timeout = 4000)
	public void customTest340() throws Exception {
		FibonacciQueue fibonacciQueue = FibonacciQueue.create();
		expectedException.expect(IllegalArgumentException.class);
		fibonacciQueue.addAll(fibonacciQueue);
	}

	@Test(timeout = 4000)
	public void customTest347() throws Exception {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		FibonacciQueue fibonacciQueue = FibonacciQueue.create();
		fibonacciQueue.addAll(arrayList);
		assertTrue(fibonacciQueue.size() == 2);
	}

	@Test(timeout = 4000)
	public void customTest357() throws Exception {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		FibonacciQueue fibonacciQueue = FibonacciQueue.create();
		fibonacciQueue.addAll(arrayList);
		Iterator iterator = fibonacciQueue.iterator();
	}

	@Test(timeout = 4000)
	public void customTest367() throws Exception {
		double[][] doubles = new double[][]{{1,2}, {1,2}};
		DenseWeightedGraph denseWeightedGraph = DenseWeightedGraph.from(doubles);
		List kBestArborescences = KBestArborescences.getKBestArborescences(denseWeightedGraph, 1, 3);
		assertTrue(kBestArborescences.size() == 1);
	}

	@Test(timeout = 4000)
	public void customTest375() throws Exception {
		double[][] doubles = new double[][]{{1,2, 3, 4}, {1,2, 3, 4}, {2, 3, 4}};
		DenseWeightedGraph denseWeightedGraph = DenseWeightedGraph.from(doubles);
		List kBestArborescences = KBestArborescences.getKBestArborescences(denseWeightedGraph, 1, 3);
		assertTrue(kBestArborescences.size() == 3);
	}

	@Test(timeout = 4000)
	public void customTest383() throws Exception {
		double[][] doubles = new double[][]{{1,2, 3, 4, -1, -6}, {1,2, 3, 4, 10, 11}, {2, 3, 4, 20, 21}};
		DenseWeightedGraph denseWeightedGraph = DenseWeightedGraph.from(doubles);
		List kBestArborescences = KBestArborescences.getKBestArborescences(denseWeightedGraph, 1, 3);
		assertTrue(kBestArborescences.size() == 3);
	}
	
	@Test(timeout = 4000)
	public void customTest391() throws Exception {
		double[][] doubles = new double[][]{{1,2, 3, 4, -1, -6, 11, 0, 12}, {1,2, 3, 4, 10, 11, 11, 12, 13}, {5, 6, 7, 2, 3, 4, 20, 21}};
		DenseWeightedGraph denseWeightedGraph = DenseWeightedGraph.from(doubles);
		List kBestArborescences = KBestArborescences.getKBestArborescences(denseWeightedGraph, 1, 3);
		assertTrue(kBestArborescences.size() == 3);
	}
}
