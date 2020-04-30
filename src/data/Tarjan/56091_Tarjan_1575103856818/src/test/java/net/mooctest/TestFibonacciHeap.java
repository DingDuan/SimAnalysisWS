package net.mooctest;

import com.google.common.base.Predicate;
import com.google.common.collect.*;
import org.junit.*;
import com.google.common.base.Optional;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.*;
import java.util.function.Consumer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;

import com.google.common.collect.ImmutableMap;
import net.mooctest.Arborescence;
import net.mooctest.Edge;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;


import static net.mooctest.Weighted.weighted;
import static org.junit.Assert.*;


public class TestFibonacciHeap {


	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
		System.setErr(null);
	}

	@Test
	public void test10000() {
        FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		System.out.println(heap.size());
		System.out.println(heap.isEmpty());
		System.out.println(heap.pollOption());
		heap.add(1, 2);
		System.out.println(heap.size());
		System.out.println(heap.isEmpty());
		heap.add(2, 1);
		System.out.println(heap.size());
		System.out.println(heap.isEmpty());
		FibonacciHeap<Integer,Integer> heap_2 = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> heap_3 = FibonacciHeap.create();

		heap_3 = FibonacciHeap.merge(heap, heap_2);
		System.out.println(heap_3.size());
		System.out.println(heap_3.isEmpty());

		FibonacciHeap<Integer,Integer> heap_4 = FibonacciHeap.create();
		heap_4.add(5, 4);
		heap_3 = FibonacciHeap.merge(heap, heap_4);
		System.out.println(heap_3.size());
		System.out.println(heap_3.isEmpty());
		assertEquals(heap.MAX_CAPACITY, Integer.MAX_VALUE);

		Arborescence<Integer> arb = Arborescence.empty();
		Arborescence<Integer> arb2 = Arborescence.empty();

		ImmutableMap<String, String> immutableMap0 = ImmutableMap.of("", "");
		Arborescence<String> arborescence0 = Arborescence.of(immutableMap0);
		Edge<String> edge0 = new Edge<String>("", "");
		boolean boolean0 = arborescence0.contains(edge0);
		System.out.println(arborescence0);
		System.out.println();
		assertTrue(arb.equals(arb));
		assertFalse(arb.equals(null));
		assertFalse(arb.equals(heap));

		FibonacciHeap.Entry ent_0 = heap.peekOption().get();
		heap.decreasePriority(ent_0, 0);
		heap.decreasePriority(ent_0, -1);

		Optional<FibonacciHeap<Integer, Integer>.Entry> ent_1 = heap.add(12, 2);
		heap.add(21313, 2);
		heap.add(213123, -234324);
		heap.add(324, 234324);
		heap.decreasePriority(ent_0, -2);
		heap.decreasePriority(ent_0, -100);

		heap.remove(ent_0);
		System.out.println(heap.size());

		assertNotEquals(heap.hashCode(), heap_4.hashCode());


		try {
			heap_2.decreasePriority(ent_0, 2);
		} catch (IllegalArgumentException e){

		}


		for (int i = -10; i<100; i++){
			heap.add(i, i*10);
		}

		for (int i = 1010; i<100; i--){
			heap.add(i, i*10);
		}

		FibonacciHeap.Entry ent_2 = heap.peekOption().get();
		System.out.println(ent_2.value);
		System.out.println(heap.size());

//		heap.decreasePriority(ent_0, -10000000);

		Iterator it = heap.iterator();
		for (int i = 0; i < 20; i++) {
//			heap.decreasePriority(it.n, -100);
			it.next();
		}

		heap.remove(ent_0);
		heap.remove(ent_2);


		FibonacciHeap<Integer,Integer> h0 = FibonacciHeap.create();
		for (int i = -10; i < 10; i++) {
			h0.add(0, i);
		}
		Iterator it0 = h0.iterator();
		int cnt = 0;
		FibonacciHeap.Entry tmp = (FibonacciHeap.Entry) it0.next();
		while (it0.hasNext()){
			tmp = (FibonacciHeap.Entry) it0.next();
			cnt += 1;
			if(cnt==30){
				break;
			}
			h0.decreasePriority(tmp, -20);

		}

		h0.decreasePriority(tmp, -2000);

		while (it0.hasNext()){
			tmp = (FibonacciHeap.Entry) it0.next();

			cnt += 1;
			if(cnt==80){
				break;
			}
			h0.remove(tmp);
		}

		h0.decreasePriority(tmp, -2000);








		assertEquals("0 true Optional.absent() 1 false 2 false 2 false 3 false Arborescence{ -> }  5 213123 115 ", outContent.toString().replaceAll("\r\n", " ").replaceAll("\n", " ").replaceAll("\r", " "));


	}


	@Test(timeout = 4000)
	public void test0000002()  throws Throwable  {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		heap.add(0, -19);
		FibonacciHeap.Entry ent_1 = heap.peekOption().get();

		for (int i = -10; i<100; i++){
			heap.add(i, i*10);
		}
		FibonacciHeap.Entry ent_2 = heap.peekOption().get();

		for (int i = 1010; i<100; i--){
			heap.add(i, i*10);
		}
		Class<FibonacciHeap> clazz = FibonacciHeap.class;
		FibonacciHeap.Entry ent_0 = heap.peekOption().get();

		try{
			Method method = clazz.getDeclaredMethod("cutAndMakeRoot", FibonacciHeap.Entry.class);
			method.setAccessible(true);
			method.invoke(heap, ent_0);
		}catch (Exception e){
			e.printStackTrace();
			Assert.fail();
		}

		try{
			Method method = clazz.getDeclaredMethod("cutAndMakeRoot", FibonacciHeap.Entry.class);
			method.setAccessible(true);
			method.invoke(heap, ent_2);
		}catch (Exception e){
			e.printStackTrace();
			Assert.fail();
		}

		try{
			Method method = clazz.getDeclaredMethod("cutAndMakeRoot", FibonacciHeap.Entry.class);
			method.setAccessible(true);
			method.invoke(heap, ent_1);
		}catch (Exception e){
			e.printStackTrace();
			Assert.fail();
		}

		for (int i = 0; i<100; i++){
			heap.add(0, 0);
		}

		Iterator it0 = heap.iterator();
		while (it0.hasNext()){
			FibonacciHeap.Entry tmp = (FibonacciHeap.Entry) it0.next();
			heap.pollOption();
			try{
				Method method = clazz.getDeclaredMethod("cutAndMakeRoot", FibonacciHeap.Entry.class);
				method.setAccessible(true);
				method.invoke(heap, tmp);
			}catch (Exception e){
				e.printStackTrace();
				Assert.fail();
			}
		}
		
	}

	@Test(timeout = 4000)
	public void test00()  throws Throwable  {
		Arborescence<String> arborescence0 = Arborescence.empty();
		Arborescence<Object> arborescence1 = Arborescence.empty();
		AbstractMap.SimpleImmutableEntry<Arborescence<Object>, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Arborescence<Object>, String>(arborescence1, "Iy@Xv");
		Edge<AbstractMap.SimpleImmutableEntry<Arborescence<Object>, String>> edge0 = new Edge<AbstractMap.SimpleImmutableEntry<Arborescence<Object>, String>>(abstractMap_SimpleImmutableEntry0, abstractMap_SimpleImmutableEntry0);
		ImmutableBiMap<Edge<AbstractMap.SimpleImmutableEntry<Arborescence<Object>, String>>, Edge<AbstractMap.SimpleImmutableEntry<Arborescence<Object>, String>>> immutableBiMap0 = ImmutableBiMap.of(edge0, edge0);
		Arborescence<Edge<AbstractMap.SimpleImmutableEntry<Arborescence<Object>, String>>> arborescence2 = Arborescence.of((ImmutableMap<Edge<AbstractMap.SimpleImmutableEntry<Arborescence<Object>, String>>, Edge<AbstractMap.SimpleImmutableEntry<Arborescence<Object>, String>>>) immutableBiMap0);
		boolean boolean0 = arborescence2.equals(arborescence0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test01()  throws Throwable  {
		Arborescence<Arborescence<Object>> arborescence0 = Arborescence.of((ImmutableMap<Arborescence<Object>, Arborescence<Object>>) null);
		// Undeclared exception!
		try {
			arborescence0.toString();
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.Arborescence", e);
		}
	}

	@Test(timeout = 4000)
	public void test02()  throws Throwable  {
		Arborescence<Arborescence<Object>> arborescence0 = Arborescence.of((ImmutableMap<Arborescence<Object>, Arborescence<Object>>) null);
		Arborescence<String> arborescence1 = Arborescence.empty();
		// Undeclared exception!
		try {
			arborescence0.equals(arborescence1);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.Arborescence", e);
		}
	}

	@Test(timeout = 4000)
	public void test03()  throws Throwable  {
		Arborescence<String> arborescence0 = Arborescence.empty();
		// Undeclared exception!
		try {
			arborescence0.contains((Edge<String>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.Arborescence", e);
		}
	}

	@Test(timeout = 4000)
	public void test04()  throws Throwable  {
		Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
		doReturn("n1t.mooctest.Arb`rescence", "n1t.mooctest.Arb`rescence").when(comparable0).toString();
		ImmutableBiMap<Comparable<Object>, Comparable<Object>> immutableBiMap0 = ImmutableBiMap.of(comparable0, comparable0);
		Arborescence<Comparable<Object>> arborescence0 = Arborescence.of((ImmutableMap<Comparable<Object>, Comparable<Object>>) immutableBiMap0);
		Arborescence<Object> arborescence1 = Arborescence.empty();
		boolean boolean0 = arborescence1.equals(arborescence0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test05()  throws Throwable  {
		Arborescence<Object> arborescence0 = Arborescence.of((ImmutableMap<Object, Object>) null);
		boolean boolean0 = arborescence0.equals((Object) null);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test06()  throws Throwable  {
		ImmutableMap<String, String> immutableMap0 = ImmutableMap.of("", "");
		Arborescence<String> arborescence0 = Arborescence.of(immutableMap0);
		Edge<String> edge0 = new Edge<String>("", "");
		boolean boolean0 = arborescence0.contains(edge0);
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test07()  throws Throwable  {
		Arborescence<Object> arborescence0 = Arborescence.empty();
		arborescence0.hashCode();
	}

	@Test(timeout = 4000)
	public void test08()  throws Throwable  {
		Arborescence<AbstractMap.SimpleEntry<String, String>> arborescence0 = Arborescence.empty();
		AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("", "");
		Edge<AbstractMap.SimpleEntry<String, String>> edge0 = new Edge<AbstractMap.SimpleEntry<String, String>>(abstractMap_SimpleEntry0, abstractMap_SimpleEntry0);
		boolean boolean0 = arborescence0.contains(edge0);
		assertFalse(boolean0);
	}


	@Test(timeout = 4000)
	public void test100()  throws Throwable  {
		ArrayList<Integer> arrayList0 = new ArrayList<Integer>(3068);
		ArrayDeque<Weighted<Edge<Integer>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Integer>>>();
		SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Integer>) arrayList0, (Iterable<Weighted<Edge<Integer>>>) arrayDeque0);
		HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
		TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>();
		Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) sparseWeightedGraph0, (Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) treeSet0);
		assertEquals(0.0, weighted0.weight, 0.01);
	}

	@Test(timeout = 4000)
	public void test101()  throws Throwable  {
		TreeMap<Object, Object> treeMap0 = new TreeMap<Object, Object>();
		Collection<Object> collection0 = treeMap0.values();
		LinkedHashSet<Weighted<Edge<Object>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<Object>>>();
		SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) collection0, (Iterable<Weighted<Edge<Object>>>) linkedHashSet0);
		ChuLiuEdmonds.PartialSolution<Object> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Object>) sparseWeightedGraph0);
		Edge<Object> edge0 = new Edge<Object>(treeMap0, "q9Jr2qPqPC`oW}xs3");
		ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, (-1806.724015346604));
		// Undeclared exception!
		try {
			chuLiuEdmonds_PartialSolution0.addEdge(exclusiveEdge0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 5000)
	public void test102()  throws Throwable  {
		LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>(361);
		Edge<String> edge0 = (Edge<String>) mock(Edge.class, new ViolatedAssumptionAnswer());
		linkedHashSet0.add(edge0);
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) null, (Set<Edge<String>>) linkedHashSet0, (Set<Edge<String>>) linkedHashSet0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// null key in entry: null=null
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test103()  throws Throwable  {
		double[][] doubleArray0 = new double[2][8];
		double[] doubleArray1 = new double[1];
		doubleArray0[1] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) hashSet0);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 1
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void test104()  throws Throwable  {
		double[][] doubleArray0 = new double[5][9];
		double[] doubleArray1 = new double[1];
		doubleArray0[1] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, integer0);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 1
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void test105()  throws Throwable  {
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Locale.FilteringMode>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.ChuLiuEdmonds", e);
		}
	}

	@Test(timeout = 4000)
	public void test106()  throws Throwable  {
		double[][] doubleArray0 = new double[19][9];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 9
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void test107()  throws Throwable  {
		double[][] doubleArray0 = new double[0][2];
		ArrayDeque<Arborescence<Integer>> arrayDeque0 = new ArrayDeque<Arborescence<Integer>>();
		DenseWeightedGraph<Arborescence<Integer>> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Arborescence<Integer>>) arrayDeque0, doubleArray0);
		ChuLiuEdmonds.PartialSolution<Arborescence<Integer>> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Arborescence<Integer>>) denseWeightedGraph0);
		Set<Arborescence<Integer>> set0 = chuLiuEdmonds_PartialSolution0.getNodes();
		assertTrue(set0.isEmpty());
	}

	@Test(timeout = 4000)
	public void test108()  throws Throwable  {
		TreeSet<Weighted<Edge<Object>>> treeSet0 = new TreeSet<Weighted<Edge<Object>>>();
		SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) treeSet0);
		ChuLiuEdmonds.PartialSolution<Object> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Object>) sparseWeightedGraph0);
		Integer integer0 = new Integer((-1));
		Edge<Integer> edge0 = new Edge<Integer>(integer0, (Integer) null);
		ImmutableSortedMap<Object, Object> immutableSortedMap0 = ImmutableSortedMap.of();
		Arborescence<Object> arborescence0 = Arborescence.of((ImmutableMap<Object, Object>) immutableSortedMap0);
		Optional<ExclusiveEdge<Object>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge((Object) edge0, arborescence0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void test109()  throws Throwable  {
		double[][] doubleArray0 = new double[9][5];
		double[] doubleArray1 = new double[6];
		doubleArray1[2] = Double.NEGATIVE_INFINITY;
		doubleArray0[0] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		// Undeclared exception!
		try {
			ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 5
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void test110()  throws Throwable  {
		double[][] doubleArray0 = new double[3][9];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
		assertEquals(0.0, weighted0.weight, 0.01);
	}

	@Test(timeout = 4000)
	public void test111()  throws Throwable  {
		TreeMap<Object, Object> treeMap0 = new TreeMap<Object, Object>();
		Collection<Object> collection0 = treeMap0.values();
		TreeSet<Weighted<Edge<Object>>> treeSet0 = new TreeSet<Weighted<Edge<Object>>>();
		SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) collection0, (Iterable<Weighted<Edge<Object>>>) treeSet0);
		Object object0 = new Object();
		Weighted<Arborescence<Object>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) sparseWeightedGraph0, object0);
		assertEquals(0.0, weighted0.weight, 0.01);
	}

	@Test(timeout = 4000)
	public void test112()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		TreeSet<Weighted<Edge<ExclusiveEdge<Object>>>> treeSet0 = new TreeSet<Weighted<Edge<ExclusiveEdge<Object>>>>(comparator0);
		SparseWeightedGraph<ExclusiveEdge<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<ExclusiveEdge<Object>>>>) treeSet0);
		ChuLiuEdmonds.PartialSolution<ExclusiveEdge<Object>> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<ExclusiveEdge<Object>>) sparseWeightedGraph0);
		Object object0 = new Object();
		Edge<Object> edge0 = new Edge<Object>(object0, object0);
		LinkedList<Edge<Object>> linkedList0 = new LinkedList<Edge<Object>>();
		ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<Object>>) linkedList0, 0.0);
		Optional<ExclusiveEdge<ExclusiveEdge<Object>>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge(exclusiveEdge0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void test113()  throws Throwable  {
		LinkedHashSet<Edge<Arborescence<Integer>>> linkedHashSet0 = new LinkedHashSet<Edge<Arborescence<Integer>>>();
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Arborescence<Integer>>) null, (Set<Edge<Arborescence<Integer>>>) linkedHashSet0, (Set<Edge<Arborescence<Integer>>>) linkedHashSet0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.ChuLiuEdmonds", e);
		}
	}

	@Test(timeout = 4000)
	public void test114()  throws Throwable  {
		Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Locale.FilteringMode>) null, locale_FilteringMode0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.ChuLiuEdmonds", e);
		}
	}

	@Test(timeout = 4000)
	public void test115()  throws Throwable  {
		ChuLiuEdmonds chuLiuEdmonds0 = new ChuLiuEdmonds();
	}



	@Test(timeout = 4000)
	public void test200()  throws Throwable  {
		double[][] doubleArray0 = new double[9][0];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		Integer integer1 = new Integer(0);
		// Undeclared exception!
		try {
			denseWeightedGraph0.getWeightOf(integer0, integer1);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 0
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void test201()  throws Throwable  {
		Locale.Category locale_Category0 = Locale.Category.FORMAT;
		Locale.Category locale_Category1 = Locale.Category.DISPLAY;
		EnumSet<Locale.Category> enumSet0 = EnumSet.of(locale_Category0, locale_Category0, locale_Category0, locale_Category0, locale_Category1);
		double[][] doubleArray0 = new double[1][5];
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, doubleArray0);
			fail("Expecting exception: IllegalArgumentException");

		} catch(IllegalArgumentException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test202()  throws Throwable  {
		double[][] doubleArray0 = new double[7][4];
		double[] doubleArray1 = new double[3];
		doubleArray1[0] = 554.0;
		doubleArray0[0] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
		assertEquals(554.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test203()  throws Throwable  {
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((double[][]) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void test204()  throws Throwable  {
		Class<Locale.Category> class0 = Locale.Category.class;
		EnumSet<Locale.Category> enumSet0 = EnumSet.allOf(class0);
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, (double[][]) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void test205()  throws Throwable  {
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((Iterable<Object>) null, (double[][]) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test206()  throws Throwable  {
		double[][] doubleArray0 = new double[7][4];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void test207()  throws Throwable  {
		double[][] doubleArray0 = new double[7][0];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = Integer.valueOf(0);
		// Undeclared exception!
		try {
			denseWeightedGraph0.getIncomingEdges(integer0);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 0
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void test208()  throws Throwable  {
		ArrayDeque<Weighted<Locale.Category>> arrayDeque0 = new ArrayDeque<Weighted<Locale.Category>>();
		double[][] doubleArray0 = new double[1][4];
		Locale.Category locale_Category0 = Locale.Category.FORMAT;
		Weighted<Locale.Category> weighted0 = Weighted.weighted(locale_Category0, 0.5);
		arrayDeque0.add(weighted0);
		DenseWeightedGraph<Weighted<Locale.Category>> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Weighted<Locale.Category>>) arrayDeque0, doubleArray0);
		assertNotNull(denseWeightedGraph0);
	}

	@Test(timeout = 4000)
	public void test209()  throws Throwable  {
		double[][] doubleArray0 = new double[1][4];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Collection<Integer> collection0 = denseWeightedGraph0.getNodes();
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void test210()  throws Throwable  {
		double[][] doubleArray0 = new double[9][3];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer((-1308));
		Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void test211()  throws Throwable  {
		double[][] doubleArray0 = new double[8][4];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
		assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test212()  throws Throwable  {
		double[][] doubleArray0 = new double[8][4];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		double double0 = denseWeightedGraph0.getWeightOf((Integer) null, integer0);
		assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test213()  throws Throwable  {
		double[][] doubleArray0 = new double[1][0];
		LinkedList<DenseWeightedGraph<String>> linkedList0 = new LinkedList<DenseWeightedGraph<String>>();
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((Iterable<DenseWeightedGraph<String>>) linkedList0, doubleArray0);
			fail("Expecting exception: IllegalArgumentException");

		} catch(IllegalArgumentException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test214()  throws Throwable  {
		double[][] doubleArray0 = new double[1][0];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		Integer integer1 = new Integer(94);
		double double0 = denseWeightedGraph0.getWeightOf(integer0, integer1);
		assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}



	@Test(timeout = 4000)
	public void test300()  throws Throwable  {
		Edge<Object> edge0 = new Edge<Object>("", "");
		boolean boolean0 = edge0.equals(edge0);
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test301()  throws Throwable  {
		Edge<String> edge0 = new Edge<String>("T7A#X2", "1+bx@*Rz^dt?$;ZJ");
		edge0.hashCode();
	}

	@Test(timeout = 4000)
	public void test302()  throws Throwable  {
		Edge<String> edge0 = new Edge<String>("", "");
		boolean boolean0 = edge0.equals("");
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test303()  throws Throwable  {
		LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
		linkedHashSet0.add((Edge<Object>) null);
		// Undeclared exception!
		try {
			Edge.competesWith((Set<Edge<Object>>) linkedHashSet0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.Edge", e);
		}
	}

	@Test(timeout = 4000)
	public void test304()  throws Throwable  {
		LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
		Integer integer0 = new Integer((-681));
		Edge<Integer> edge0 = new Edge<Integer>((Integer) null, integer0);
		linkedHashSet0.add(edge0);
		// Undeclared exception!
		try {
			Edge.competesWith((Set<Edge<Integer>>) linkedHashSet0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// null value in entry: -681=null
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test305()  throws Throwable  {
		Integer integer0 = new Integer(461);
		LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
		Integer integer1 = new Integer(461);
		Edge<Integer> edge0 = new Edge<Integer>(integer1, integer1);
		linkedHashSet0.add(edge0);
		Edge<Integer> edge1 = new Edge<Integer>(integer0, integer1);
		linkedHashSet0.add(edge1);
		// Undeclared exception!
		try {
			Edge.competesWith((Set<Edge<Integer>>) linkedHashSet0);
			fail("Expecting exception: IllegalArgumentException");

		} catch(IllegalArgumentException e) {
			//
			// duplicate key: 461
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test306()  throws Throwable  {
		LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
		Edge<Object> edge0 = new Edge<Object>(linkedHashSet0, linkedHashSet0);
		linkedHashSet0.add(edge0);
		Predicate<Edge<Object>> predicate0 = Edge.competesWith((Set<Edge<Object>>) linkedHashSet0);
		assertNotNull(predicate0);
	}

	@Test(timeout = 4000)
	public void test307()  throws Throwable  {
		LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
		Edge<Object> edge0 = new Edge<Object>(linkedHashSet0, linkedHashSet0);
		linkedHashSet0.add(edge0);
		Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) linkedHashSet0);
		Integer integer0 = new Integer(1);
		Edge<Integer> edge1 = new Edge<Integer>(integer0, integer0);
		Edge<Object> edge2 = edge_EdgeBuilder0.to(edge1);
		java.util.function.Predicate<Object> predicate0 = java.util.function.Predicate.isEqual((Object) edge2);
		boolean boolean0 = linkedHashSet0.removeIf(predicate0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test308()  throws Throwable  {
		LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
		Edge<Object> edge0 = new Edge<Object>(linkedHashSet0, linkedHashSet0);
		Integer integer0 = new Integer(1);
		Edge<Integer> edge1 = new Edge<Integer>(integer0, integer0);
		java.util.function.Predicate<Object> predicate0 = java.util.function.Predicate.isEqual((Object) edge0);
		Edge<Object> edge2 = new Edge<Object>(edge1, linkedHashSet0);
		boolean boolean0 = predicate0.test(edge2);
		assertFalse(edge2.equals((Object)edge0));
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test309()  throws Throwable  {
		LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
		Edge<Object> edge0 = new Edge<Object>(linkedHashSet0, linkedHashSet0);
		java.util.function.Predicate<Object> predicate0 = java.util.function.Predicate.isEqual((Object) edge0);
		linkedHashSet0.add((Edge<Object>) null);
		boolean boolean0 = linkedHashSet0.removeIf(predicate0);
		assertEquals(1, linkedHashSet0.size());
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test310()  throws Throwable  {
		Predicate<Edge<Edge<Object>>> predicate0 = Edge.isAutoCycle();
		assertNotNull(predicate0);
	}

	@Test(timeout = 4000)
	public void test311()  throws Throwable  {
		LinkedHashSet<Edge<Edge<Integer>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<Integer>>>();
		Predicate<Edge<Edge<Integer>>> predicate0 = Edge.isIn((Set<Edge<Edge<Integer>>>) linkedHashSet0);
		assertNotNull(predicate0);
	}

	@Test(timeout = 4000)
	public void test312()  throws Throwable  {
		LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
		Predicate<Edge<Object>> predicate0 = Edge.hasDestination((Object) linkedHashSet0);
		assertNotNull(predicate0);
	}

	@Test(timeout = 4000)
	public void test313()  throws Throwable  {
		Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("ZMi");
		Edge<String> edge0 = edge_EdgeBuilder0.to("ZMi");
		String string0 = edge0.toString();
		assertEquals("Edge{source=ZMi, destination=ZMi}", string0);
	}






	@Test(timeout = 4000)
	public void test30()  throws Throwable  {
		Integer integer0 = new Integer(4099);
		ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
		Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) arrayList0);
		EdgeQueueMap.EdgeQueue<Integer> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(integer0, partition0);
		Arborescence<Integer> arborescence0 = Arborescence.empty();
		Optional<ExclusiveEdge<Integer>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge(arborescence0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void test31()  throws Throwable  {
		FibonacciQueue<Weighted<Object>> fibonacciQueue0 = FibonacciQueue.create();
		Partition<Weighted<Object>> partition0 = Partition.singletons((Collection<Weighted<Object>>) fibonacciQueue0);
		EdgeQueueMap<Weighted<Object>> edgeQueueMap0 = new EdgeQueueMap<Weighted<Object>>(partition0);
		Weighted<Object> weighted0 = Weighted.weighted((Object) edgeQueueMap0, 6038.328912);
		PriorityQueue<Pair<EdgeQueueMap.EdgeQueue<Weighted<Object>>, Weighted<Edge<Weighted<Object>>>>> priorityQueue0 = new PriorityQueue<Pair<EdgeQueueMap.EdgeQueue<Weighted<Object>>, Weighted<Edge<Weighted<Object>>>>>();
		Pair<EdgeQueueMap.EdgeQueue<Weighted<Object>>, Weighted<Edge<Weighted<Object>>>> pair0 = (Pair<EdgeQueueMap.EdgeQueue<Weighted<Object>>, Weighted<Edge<Weighted<Object>>>>) mock(Pair.class, new ViolatedAssumptionAnswer());
		priorityQueue0.add(pair0);
		// Undeclared exception!
		try {
			edgeQueueMap0.merge(weighted0, priorityQueue0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.EdgeQueueMap", e);
		}
	}

	@Test(timeout = 4000)
	public void test32()  throws Throwable  {
		FibonacciQueue<Weighted<Locale.FilteringMode>> fibonacciQueue0 = FibonacciQueue.create();
		Partition<Weighted<Locale.FilteringMode>> partition0 = Partition.singletons((Collection<Weighted<Locale.FilteringMode>>) fibonacciQueue0);
		ArrayList<Object> arrayList0 = new ArrayList<Object>();
		Partition<Object> partition1 = Partition.singletons((Collection<Object>) arrayList0);
		EdgeQueueMap<Object> edgeQueueMap0 = new EdgeQueueMap<Object>(partition1);
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciQueue<Pair<EdgeQueueMap.EdgeQueue<Object>, Weighted<Edge<Object>>>> fibonacciQueue1 = FibonacciQueue.create((Comparator<? super Pair<EdgeQueueMap.EdgeQueue<Object>, Weighted<Edge<Object>>>>) comparator0);
		edgeQueueMap0.merge((Object) null, fibonacciQueue1);
		ImmutableBiMap<Object, Object> immutableBiMap0 = ImmutableBiMap.of((Object) partition0, (Object) arrayList0);
		Arborescence<Object> arborescence0 = Arborescence.of((ImmutableMap<Object, Object>) immutableBiMap0);
		Optional<ExclusiveEdge<Object>> optional0 = edgeQueueMap0.popBestEdge((Object) null, arborescence0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void test33()  throws Throwable  {
		Object object0 = new Object();
		EdgeQueueMap<EdgeQueueMap.EdgeQueue<Object>> edgeQueueMap0 = new EdgeQueueMap<EdgeQueueMap.EdgeQueue<Object>>((Partition<EdgeQueueMap.EdgeQueue<Object>>) null);
		ArrayList<Object> arrayList0 = new ArrayList<Object>();
		Partition<Object> partition0 = Partition.singletons((Collection<Object>) arrayList0);
		EdgeQueueMap.EdgeQueue<Object> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(object0, partition0);
		Arborescence<EdgeQueueMap.EdgeQueue<Object>> arborescence0 = Arborescence.empty();
		Optional<ExclusiveEdge<EdgeQueueMap.EdgeQueue<Object>>> optional0 = edgeQueueMap0.popBestEdge(edgeQueueMap_EdgeQueue0, arborescence0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void test34()  throws Throwable  {
		Integer integer0 = new Integer((-1529));
		Weighted<Object> weighted0 = new Weighted<Object>(integer0, 727.421888168259);
		Vector<Weighted<Object>> vector0 = new Vector<Weighted<Object>>();
		vector0.add(weighted0);
		Partition<Weighted<Object>> partition0 = Partition.singletons((Collection<Weighted<Object>>) vector0);
		EdgeQueueMap.EdgeQueue<Weighted<Object>> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(weighted0, partition0);
		Edge<Weighted<Object>> edge0 = new Edge<Weighted<Object>>(weighted0, weighted0);
		ExclusiveEdge<Weighted<Object>> exclusiveEdge0 = ExclusiveEdge.of(edge0, 727.421888168259);
		edgeQueueMap_EdgeQueue0.addEdge(exclusiveEdge0);
		assertEquals(727.421888168259, exclusiveEdge0.weight, 0.01);
	}

	@Test(timeout = 4000)
	public void test35()  throws Throwable  {
		Object object0 = new Object();
		Edge<Object> edge0 = new Edge<Object>(object0, object0);
		ArrayList<Edge<Object>> arrayList0 = new ArrayList<Edge<Object>>();
		Partition<Edge<Object>> partition0 = Partition.singletons((Collection<Edge<Object>>) arrayList0);
		EdgeQueueMap.EdgeQueue<Edge<Object>> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(edge0, partition0);
		Optional<ExclusiveEdge<Edge<Object>>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge();
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void test36()  throws Throwable  {
		ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
		Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) arrayList0);
		EdgeQueueMap<Integer> edgeQueueMap0 = new EdgeQueueMap<Integer>(partition0);
		Integer integer0 = new Integer(2754);
		Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
		Weighted<Edge<Integer>> weighted0 = Weighted.weighted(edge0, (double) 2754);
		// Undeclared exception!
		try {
			edgeQueueMap0.addEdge(weighted0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.Partition", e);
		}
	}


	@Test(timeout = 4000)
	public void test40()  throws Throwable  {
		LinkedList<Edge<Edge<Object>>> linkedList0 = new LinkedList<Edge<Edge<Object>>>();
		ExclusiveEdge<Edge<Object>> exclusiveEdge0 = ExclusiveEdge.of((Edge<Edge<Object>>) null, (List<Edge<Edge<Object>>>) linkedList0, 4003.3230772266);
		ExclusiveEdge<Edge<Object>> exclusiveEdge1 = ExclusiveEdge.of((Edge<Edge<Object>>) null, (-1211.9396));
		int int0 = exclusiveEdge0.compareTo(exclusiveEdge1);
		assertEquals((-1211.9396), exclusiveEdge1.weight, 0.01);
		assertEquals(1, int0);
	}

	@Test(timeout = 4000)
	public void test41()  throws Throwable  {
		LinkedList<Edge<Integer>> linkedList0 = new LinkedList<Edge<Integer>>();
		ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of((Edge<Integer>) null, (List<Edge<Integer>>) linkedList0, (-2244.16));
		ExclusiveEdge<Integer> exclusiveEdge1 = ExclusiveEdge.of((Edge<Integer>) null, 1142.3071476);
		int int0 = exclusiveEdge0.compareTo(exclusiveEdge1);
		assertEquals(1142.3071476, exclusiveEdge1.weight, 0.01);
		assertEquals((-1), int0);
	}

	@Test(timeout = 4000)
	public void test42()  throws Throwable  {
		ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of((Edge<Integer>) null, 0.0);
		int int0 = exclusiveEdge0.compareTo(exclusiveEdge0);
		assertEquals(0.0, exclusiveEdge0.weight, 0.01);
		assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void test43()  throws Throwable  {
		Edge<ExclusiveEdge<String>> edge0 = (Edge<ExclusiveEdge<String>>) mock(Edge.class, new ViolatedAssumptionAnswer());
		LinkedList<Edge<ExclusiveEdge<String>>> linkedList0 = new LinkedList<Edge<ExclusiveEdge<String>>>();
		ExclusiveEdge<ExclusiveEdge<String>> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<ExclusiveEdge<String>>>) linkedList0, (-1.0));
		// Undeclared exception!
		try {
			exclusiveEdge0.compareTo((ExclusiveEdge<ExclusiveEdge<String>>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.ExclusiveEdge", e);
		}
	}


	@Test(timeout = 4000)
	public void test600()  throws Throwable  {
		Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		doReturn((-185), (-310), (-310), 0, 0).when(comparator0).compare(anyInt() , anyInt());
		FibonacciHeap<Object, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
		Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Integer, Integer> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super Integer>) comparator1);
		FibonacciHeap<Integer, Integer> fibonacciHeap2 = FibonacciHeap.merge(fibonacciHeap1, fibonacciHeap1);
		Integer integer0 = new Integer(Integer.MAX_VALUE);
		fibonacciHeap0.add(fibonacciHeap2, integer0);
		fibonacciHeap0.add(Integer.MAX_VALUE, (Integer) Integer.MAX_VALUE);
		FibonacciHeap<Object, Integer> fibonacciHeap3 = FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
		fibonacciHeap3.add(fibonacciHeap0, (Integer) Integer.MAX_VALUE);
		fibonacciHeap3.spliterator();
		fibonacciHeap3.pollOption();
		fibonacciHeap0.pollOption();
		Comparator<Object> comparator2 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<FibonacciHeap<String, Object>, Integer> fibonacciHeap4 = FibonacciHeap.create((Comparator<? super Integer>) comparator2);
		fibonacciHeap4.peekOption();
		// Undeclared exception!
		try {
			FibonacciHeap.create((Comparator<? super FibonacciHeap.Entry>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test601()  throws Throwable  {
		Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		doReturn((-1341)).when(comparator0).compare(anyInt() , anyInt());
		FibonacciHeap<Object, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
		Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Integer, Integer> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super Integer>) comparator1);
		fibonacciHeap0.add(fibonacciHeap1, (Integer) fibonacciHeap0.MAX_CAPACITY);
		fibonacciHeap0.add(Integer.MAX_VALUE, (Integer) Integer.MAX_VALUE);
		fibonacciHeap0.pollOption();
		assertEquals(1, fibonacciHeap0.size());
	}

	@Test(timeout = 4000)
	public void test602()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Object, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
		FibonacciHeap<Object, String> fibonacciHeap1 = FibonacciHeap.create();
		FibonacciHeap<Object, String> fibonacciHeap2 = FibonacciHeap.merge(fibonacciHeap1, fibonacciHeap1);
		fibonacciHeap2.add(fibonacciHeap0, "\">h'tZgC");
		FibonacciHeap<Object, String> fibonacciHeap3 = FibonacciHeap.merge(fibonacciHeap1, fibonacciHeap2);
		assertEquals(1, fibonacciHeap2.size());
		assertEquals(1, fibonacciHeap3.size());
	}

	@Test(timeout = 4000)
	public void test603()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<String, FibonacciHeap<Object, Integer>> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super FibonacciHeap<Object, Integer>>) comparator0);
		Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<String, Object> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super Object>) comparator1);
		fibonacciHeap1.add("", fibonacciHeap0);
		int int0 = fibonacciHeap1.size();
		assertEquals(1, int0);
	}

	@Test(timeout = 4000)
	public void test604()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Integer, FibonacciHeap.Entry> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super FibonacciHeap.Entry>) comparator0);
		fibonacciHeap0.iterator();
		assertEquals(0, fibonacciHeap0.size());
	}

	@Test(timeout = 4000)
	public void test605()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
		// Undeclared exception!
		try {
			FibonacciHeap.merge(fibonacciHeap0, (FibonacciHeap<Object, String>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.FibonacciHeap", e);
		}
	}

	@Test(timeout = 4000)
	public void test606()  throws Throwable  {
		Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<FibonacciHeap.Entry, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
		FibonacciHeap<FibonacciHeap.Entry, Integer> fibonacciHeap1 = FibonacciHeap.create();
		// Undeclared exception!
		try {
			FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap1);
			fail("Expecting exception: IllegalArgumentException");

		} catch(IllegalArgumentException e) {
			//
			// Heaps that use different comparators can't be merged.
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test607()  throws Throwable  {
		FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
		// Undeclared exception!
		try {
			fibonacciHeap0.decreasePriority((FibonacciHeap.Entry) null, "com.google.common.collect.Iterators$1");
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.FibonacciHeap$Entry", e);
		}
	}

	@Test(timeout = 4000)
	public void test608()  throws Throwable  {
		FibonacciHeap<Integer, Integer> fibonacciHeap0 = FibonacciHeap.create();
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Object, Object> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
		// Undeclared exception!
		try {
			fibonacciHeap1.add(fibonacciHeap0.MAX_CAPACITY, (Object) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test609()  throws Throwable  {
		FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create();
		fibonacciHeap0.comparator();
		assertEquals(0, fibonacciHeap0.size());
	}

	@Test(timeout = 4000)
	public void test610()  throws Throwable  {
		FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
		Optional<Object> optional0 = fibonacciHeap0.pollOption();
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<String, Object> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
		fibonacciHeap1.add(")Y]klVO!hg]'", optional0);
		assertEquals(1, fibonacciHeap1.size());

		fibonacciHeap1.pollOption();
		assertEquals(0, fibonacciHeap1.size());
	}

	@Test(timeout = 4000)
	public void test611()  throws Throwable  {
		Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<FibonacciHeap<Object, Integer>, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
		boolean boolean0 = fibonacciHeap0.isEmpty();
		assertEquals(0, fibonacciHeap0.size());
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test612()  throws Throwable  {
		FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
		fibonacciHeap0.add("As", "As");
		boolean boolean0 = fibonacciHeap0.isEmpty();
		assertEquals(1, fibonacciHeap0.size());
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test613()  throws Throwable  {
		FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
		fibonacciHeap0.add("As", "As");
		Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
		fibonacciHeap0.forEach(consumer0);
		assertEquals(1, fibonacciHeap0.size());
	}

	@Test(timeout = 4000)
	public void test614()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Object, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
		int int0 = fibonacciHeap0.size();
		assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void test615()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Object, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
		// Undeclared exception!
		try {
			fibonacciHeap0.remove((FibonacciHeap.Entry) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.FibonacciHeap$Entry", e);
		}
	}

	@Test(timeout = 4000)
	public void test616()  throws Throwable  {
		Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Object, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
		fibonacciHeap0.clear();
		assertEquals(0, fibonacciHeap0.size());
	}


	@Test(timeout = 4000)
	public void test700()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
		int int0 = fibonacciQueue0.size();
		assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void test701()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
		Integer integer0 = new Integer((-3121));
		fibonacciQueue0.add(integer0);
		int int0 = fibonacciQueue0.size();
		assertEquals(1, int0);
	}

	@Test(timeout = 4000)
	public void test702()  throws Throwable  {
		FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
		fibonacciQueue0.offer("com.google.common.collect.NullsLastOrdering");
		String string0 = fibonacciQueue0.poll();
		assertFalse(fibonacciQueue0.contains(string0));
	}

	@Test(timeout = 4000)
	public void test703()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
		Iterator<Object> iterator0 = fibonacciQueue0.iterator();
		assertNotNull(iterator0);
	}

	@Test(timeout = 4000)
	public void test704()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Integer>) comparator0);
		// Undeclared exception!
		try {
			fibonacciQueue0.offer((Integer) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test705()  throws Throwable  {
		// Undeclared exception!
		try {
			FibonacciQueue.create((Comparator<? super FibonacciHeap.Entry>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test706()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super String>) comparator0);
		fibonacciQueue0.offer("c/u_3OPnM9d");
		String string0 = fibonacciQueue0.peek();
		assertEquals("c/u_3OPnM9d", string0);
	}

	@Test(timeout = 4000)
	public void test707()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super String>) comparator0);
		String string0 = fibonacciQueue0.peek();
		assertNull(string0);
	}

	@Test(timeout = 4000)
	public void test708()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super String>) comparator0);
		fibonacciQueue0.offer("c/u_3OPnM9d");
		Object[] objectArray0 = fibonacciQueue0.toArray();
		assertEquals(1, objectArray0.length);
	}

	@Test(timeout = 4000)
	public void test709()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super String>) comparator0);
		Comparator<? super String> comparator1 = fibonacciQueue0.comparator();
		assertNotNull(comparator1);
	}

	@Test(timeout = 4000)
	public void test710()  throws Throwable  {
		FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create();
		Integer integer0 = fibonacciQueue0.poll();
		assertNull(integer0);
	}



	@Test(timeout = 4000)
	public void test800()  throws Throwable  {
		double[][] doubleArray0 = new double[3][0];
		double[] doubleArray1 = new double[9];
		doubleArray0[0] = doubleArray1;
		double[] doubleArray2 = new double[9];
		doubleArray2[1] = (double) 2;
		doubleArray0[1] = doubleArray2;
		doubleArray0[2] = doubleArray0[1];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(2);
		List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 2);
		assertEquals(2, list0.size());
	}

	@Test(timeout = 4000)
	public void test801()  throws Throwable  {
		double[][] doubleArray0 = new double[3][0];
		double[] doubleArray1 = new double[9];
		doubleArray1[0] = (double) 2;
		doubleArray0[0] = doubleArray1;
		doubleArray0[1] = doubleArray0[0];
		doubleArray0[2] = doubleArray0[0];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(2);
		List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 2);
		assertEquals(2, list0.size());
	}

	@Test(timeout = 4000)
	public void test802()  throws Throwable  {
		Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
		ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, Double.POSITIVE_INFINITY);
		ImmutableMap<Object, Object> immutableMap0 = ImmutableMap.of((Object) exclusiveEdge0, (Object) "~Q'W7TM[;z!mmMA)Wtu");
		Arborescence<Object> arborescence0 = Arborescence.of(immutableMap0);
		Vector<Edge<EdgeQueueMap.EdgeQueue<Double>>> vector0 = new Vector<Edge<EdgeQueueMap.EdgeQueue<Double>>>();
		LinkedList<Object> linkedList0 = new LinkedList<Object>(vector0);
		Vector<Weighted<Edge<Object>>> vector1 = new Vector<Weighted<Edge<Object>>>();
		SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) linkedList0, (Iterable<Weighted<Edge<Object>>>) vector1);
		LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
		TreeSet<Edge<Object>> treeSet0 = new TreeSet<Edge<Object>>();
		Weighted<Arborescence<Object>> weighted0 = new Weighted<Arborescence<Object>>(arborescence0, Double.POSITIVE_INFINITY);
		Optional<Weighted<KBestArborescences.SubsetOfSolutions<Object>>> optional0 = KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Object>) sparseWeightedGraph0, (Set<Edge<Object>>) linkedHashSet0, (Set<Edge<Object>>) treeSet0, weighted0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void test803()  throws Throwable  {
		Edge<KBestArborescences.SubsetOfSolutions<String>> edge0 = (Edge<KBestArborescences.SubsetOfSolutions<String>>) mock(Edge.class, new ViolatedAssumptionAnswer());
		ExclusiveEdge<KBestArborescences.SubsetOfSolutions<String>> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
		// Undeclared exception!
		try {
			KBestArborescences.seek(exclusiveEdge0, (Arborescence<KBestArborescences.SubsetOfSolutions<String>>) null, (EdgeQueueMap.EdgeQueue<KBestArborescences.SubsetOfSolutions<String>>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.KBestArborescences", e);
		}
	}

	@Test(timeout = 4000)
	public void test804()  throws Throwable  {
		Arborescence<Pair<Object, String>> arborescence0 = Arborescence.empty();
		Weighted<Arborescence<Pair<Object, String>>> weighted0 = Weighted.weighted(arborescence0, 0.0);
		// Undeclared exception!
		try {
			KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Pair<Object, String>>) null, (Set<Edge<Pair<Object, String>>>) null, (Set<Edge<Pair<Object, String>>>) null, weighted0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.Edge", e);
		}
	}

	@Test(timeout = 4000)
	public void test805()  throws Throwable  {
		HashSet<Edge<Object>> hashSet0 = new HashSet<Edge<Object>>();
		Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
		hashSet0.add(edge0);
		// Undeclared exception!
		try {
			KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Object>) null, (Set<Edge<Object>>) hashSet0, (Set<Edge<Object>>) hashSet0, (Weighted<Arborescence<Object>>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// null key in entry: null=null
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test806()  throws Throwable  {
		double[][] doubleArray0 = new double[1][7];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>();
		Arborescence<Integer> arborescence0 = Arborescence.empty();
		Weighted<Arborescence<Integer>> weighted0 = Weighted.weighted(arborescence0, 0.0);
		// Undeclared exception!
		try {
			KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) treeSet0, (Set<Edge<Integer>>) treeSet0, weighted0);
			fail("Expecting exception: ClassCastException");

		} catch(ClassCastException e) {
			//
			// net.mooctest.Edge cannot be cast to java.lang.Comparable
			//
			verifyException("java.util.TreeMap", e);
		}
	}

	@Test(timeout = 4000)
	public void test807()  throws Throwable  {
		double[][] doubleArray0 = new double[9][7];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
		Arborescence<Integer> arborescence0 = Arborescence.empty();
		Weighted<Arborescence<Integer>> weighted0 = new Weighted<Arborescence<Integer>>(arborescence0, 1653.0);
		// Undeclared exception!
		try {
			KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) linkedHashSet0, (Set<Edge<Integer>>) linkedHashSet0, weighted0);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

//	@Test(timeout = 4000)
//	public void test808()  throws Throwable  {
//		double[][] doubleArray0 = new double[4][7];
//		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
//		Integer integer0 = new Integer(25);
//		// Undeclared exception!
//		KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 25);
//	}

	@Test(timeout = 4000)
	public void test809()  throws Throwable  {
		Locale.Category locale_Category0 = Locale.Category.FORMAT;
		// Undeclared exception!
		try {
			KBestArborescences.getKBestArborescences((WeightedGraph<Locale.Category>) null, locale_Category0, 6);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.KBestArborescences", e);
		}
	}

	@Test(timeout = 4000)
	public void test810()  throws Throwable  {
		double[][] doubleArray0 = new double[5][3];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		// Undeclared exception!
		try {
			KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, (Integer) null, 953);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 4000)
	public void test811()  throws Throwable  {
		Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
		ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, (-1.0));
		Arborescence<Object> arborescence0 = Arborescence.empty();
		PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>();
		Partition<Object> partition0 = Partition.singletons((Collection<Object>) priorityQueue0);
		EdgeQueueMap.EdgeQueue<Object> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((Object) null, partition0);
		Optional<ExclusiveEdge<Object>> optional0 = KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<Object>) edgeQueueMap_EdgeQueue0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void test812()  throws Throwable  {
		ImmutableSortedMap<Weighted<Object>, Weighted<Object>> immutableSortedMap0 = ImmutableSortedMap.of();
		Arborescence<Weighted<Object>> arborescence0 = Arborescence.of((ImmutableMap<Weighted<Object>, Weighted<Object>>) immutableSortedMap0);
		Weighted<Arborescence<Weighted<Object>>> weighted0 = Weighted.weighted(arborescence0, 1.0);
		TreeSet<Edge<Weighted<Object>>> treeSet0 = new TreeSet<Edge<Weighted<Object>>>();
		KBestArborescences.SubsetOfSolutions<Weighted<Object>> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Weighted<Object>>((Edge<Weighted<Object>>) null, weighted0, treeSet0, treeSet0);
	}

	@Test(timeout = 4000)
	public void test813()  throws Throwable  {
		double[][] doubleArray0 = new double[2][1];
		double[] doubleArray1 = new double[7];
		doubleArray0[0] = doubleArray1;
		doubleArray0[1] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(9);
		List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 9);
		assertFalse(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void test814()  throws Throwable  {
		ArrayList<Weighted<Edge<KBestArborescences>>> arrayList0 = new ArrayList<Weighted<Edge<KBestArborescences>>>(1);
		SparseWeightedGraph<KBestArborescences> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<KBestArborescences>>>) arrayList0);
		KBestArborescences kBestArborescences0 = new KBestArborescences();
		List<Weighted<Arborescence<KBestArborescences>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<KBestArborescences>) sparseWeightedGraph0, kBestArborescences0, 1);
		assertFalse(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void test815()  throws Throwable  {
		LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
		LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>(linkedList0);
		double[][] doubleArray0 = new double[0][2];
		DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) linkedHashSet0, doubleArray0);
		List<Weighted<Arborescence<Object>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Object>) denseWeightedGraph0, (Object) linkedHashSet0, 0);
		assertEquals(0, list0.size());
	}


	@Test(timeout = 4000)
	public void test90()  throws Throwable  {
		Object object0 = new Object();
		Pair<Object, String> pair0 = new Pair<Object, String>(object0, "{)QI~,:0");
		Pair<String, String> pair1 = Pair.of("{)QI~,:0", "second");
		boolean boolean0 = pair1.equals(pair0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test91()  throws Throwable  {
		Integer integer0 = new Integer(2);
		Pair<String, Object> pair0 = Pair.of("", (Object) integer0);
		Pair<String, Pair<String, Object>> pair1 = new Pair<String, Pair<String, Object>>("", pair0);
		Pair<Integer, String> pair2 = new Pair<Integer, String>(integer0, "");
		Pair<Object, Object> pair3 = new Pair<Object, Object>("", pair2);
		Pair<Object, Object> pair4 = Pair.of((Object) "", (Object) pair1);
		boolean boolean0 = pair3.equals(pair4);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test92()  throws Throwable  {
		Integer integer0 = new Integer(2);
		Pair<Integer, String> pair0 = new Pair<Integer, String>(integer0, "");
		Pair<Object, Object> pair1 = new Pair<Object, Object>("", pair0);
		boolean boolean0 = pair1.equals(pair1);
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test93()  throws Throwable  {
		Integer integer0 = new Integer(2);
		Pair<Integer, String> pair0 = new Pair<Integer, String>(integer0, "");
		Pair<Object, Object> pair1 = new Pair<Object, Object>("", pair0);
		pair1.hashCode();
	}

	@Test(timeout = 4000)
	public void test94()  throws Throwable  {
		Integer integer0 = new Integer(2);
		Pair<String, Object> pair0 = Pair.of("", (Object) integer0);
		boolean boolean0 = pair0.equals("");
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test95()  throws Throwable  {
		Integer integer0 = new Integer(2);
		Pair<Integer, String> pair0 = new Pair<Integer, String>(integer0, "");
		Pair<Object, Object> pair1 = new Pair<Object, Object>("", pair0);
		String string0 = pair1.toString();
		assertEquals("Pair{first=, second=Pair{first=2, second=}}", string0);
	}


	@Test(timeout = 4000)
	public void test0101000()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("P");
		linkedList0.add("0{P-y#P}ZF,pPGI9");
		linkedList0.add("H*");
		linkedList0.add("z]^ x=X;[$");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		partition0.merge("z]^ x=X;[$", "0{P-y#P}ZF,pPGI9");
		partition0.merge("P", "H*");
		String string0 = partition0.merge("0{P-y#P}ZF,pPGI9", "P");
		assertEquals("z]^ x=X;[$", string0);
	}

	@Test(timeout = 4000)
	public void test0101001()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("m01[");
		linkedList0.add("cm.goo`le.common.colect.ImmutableEnumMap");
		linkedList0.add("net.mooctest.Partition");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.merge("m01[", "net.mooctest.Partition");
		assertEquals("m01[", string0);

		String string1 = partition0.merge("cm.goo`le.common.colect.ImmutableEnumMap", "net.mooctest.Partition");
		assertEquals("m01[", string1);
	}

	@Test(timeout = 4000)
	public void test0101002()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("01[");
		linkedList0.add("");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.merge("01[", "");
		assertEquals("01[", string0);

		String string1 = partition0.merge("01[", "");
		assertEquals("01[", string1);
	}

	@Test(timeout = 4000)
	public void test0101003()  throws Throwable  {
		LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
		List<Integer> list0 = linkedList0.subList(0, 0);
		Integer integer0 = new Integer(1785);
		linkedList0.add(integer0);
		// Undeclared exception!
		try {
			Partition.singletons((Collection<Integer>) list0);
			fail("Expecting exception: ConcurrentModificationException");

		} catch(ConcurrentModificationException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("java.util.SubList", e);
		}
	}

	@Test(timeout = 4000)
	public void test0101004()  throws Throwable  {
		LinkedList<Object> linkedList0 = new LinkedList<Object>();
		linkedList0.add((Object) linkedList0);
		// Undeclared exception!
		try {
			Partition.singletons((Collection<Object>) linkedList0);
			fail("Expecting exception: StackOverflowError");

		} catch(StackOverflowError e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 4000)
	public void test0101005()  throws Throwable  {
		// Undeclared exception!
		try {
			Partition.singletons((Collection<String>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.Partition", e);
		}
	}

	@Test(timeout = 4000)
	public void test0101006()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		// Undeclared exception!
		try {
			partition0.sameComponent("", ",|C_?,d|");
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 4000)
	public void test0101007()  throws Throwable  {
		LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
		Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) linkedList0);
		LinkedList<Object> linkedList1 = new LinkedList<Object>();
		Partition<Object> partition1 = Partition.singletons((Collection<Object>) linkedList1);
		// Undeclared exception!
		try {
			partition1.componentOf(partition0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 4000)
	public void test0101008()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("-1>,.7F]\"GIbZgo");
		linkedList0.add("");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.merge("", "-1>,.7F]\"GIbZgo");
		assertEquals("", string0);

		String string1 = partition0.componentOf("-1>,.7F]\"GIbZgo");
		assertEquals("", string1);
	}

	@Test(timeout = 4000)
	public void test0101009()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.push("end index");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.componentOf("end index");
		assertTrue(linkedList0.contains(string0));
	}

	@Test(timeout = 4000)
	public void test0101010()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.push("end index");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		boolean boolean0 = partition0.sameComponent("end index", "end index");
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test0101011()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("I\"1<");
		linkedList0.add("WJxO/ny<hKQ-");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		boolean boolean0 = partition0.sameComponent("I\"1<", "WJxO/ny<hKQ-");
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test0101012()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("01[");
		linkedList0.add("com.goo`le.common.collect.ImmutableEnumMap");
		linkedList0.add("");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.merge("com.goo`le.common.collect.ImmutableEnumMap", "01[");
		assertEquals("com.goo`le.common.collect.ImmutableEnumMap", string0);

		String string1 = partition0.merge("01[", "");
		assertEquals("com.goo`le.common.collect.ImmutableEnumMap", string1);

		String string2 = partition0.merge("", "com.goo`le.common.collect.ImmutableEnumMap");
		assertEquals("com.goo`le.common.collect.ImmutableEnumMap", string2);
	}

	@Test(timeout = 4000)
	public void test0101013()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("01[");
		linkedList0.add("com.goo`le.common.collect.ImmutableEnumMap");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		partition0.merge("com.goo`le.common.collect.ImmutableEnumMap", "01[");
		// Undeclared exception!
		try {
			partition0.merge("01[", "");
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 4000)
	public void test0101014()  throws Throwable  {
		LinkedList<Object> linkedList0 = new LinkedList<Object>();
		Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
		Set<Object> set0 = partition0.getNodes();
		assertTrue(set0.isEmpty());
	}


	@Test(timeout = 4000)
	public void test01100()  throws Throwable  {
		Vector<Locale.LanguageRange> vector0 = new Vector<Locale.LanguageRange>();
		List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) vector0, (Collection<String>) null);
		HashSet<Object> hashSet0 = new HashSet<Object>(list0);
		hashSet0.add((Object) null);
		ArrayDeque<Weighted<Edge<Object>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Object>>>();
		// Undeclared exception!
		try {
			SparseWeightedGraph.from((Iterable<Object>) hashSet0, (Iterable<Weighted<Edge<Object>>>) arrayDeque0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test01101()  throws Throwable  {
		Vector<Weighted<Edge<Object>>> vector0 = new Vector<Weighted<Edge<Object>>>();
		Edge<Object> edge0 = new Edge<Object>(vector0, (Object) null);
		Weighted<Edge<Object>> weighted0 = Weighted.weighted(edge0, (-1051.37166));
		vector0.add(weighted0);
		// Undeclared exception!
		try {
			SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) vector0);
			fail("Expecting exception: StackOverflowError");

		} catch(StackOverflowError e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 4000)
	public void test01102()  throws Throwable  {
		// Undeclared exception!
		try {
			SparseWeightedGraph.from((Iterable<Weighted<Edge<Weighted<Integer>>>>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.SparseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void test01103()  throws Throwable  {
		PriorityQueue<Weighted<Edge<String>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<String>>>();
		Edge<String> edge0 = new Edge<String>((String) null, (String) null);
		Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, 50.012870644);
		priorityQueue0.add(weighted0);
		// Undeclared exception!
		try {
			SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) priorityQueue0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test01104()  throws Throwable  {
		TreeSet<Locale.Category> treeSet0 = new TreeSet<Locale.Category>();
		PriorityQueue<Locale.Category> priorityQueue0 = new PriorityQueue<Locale.Category>((SortedSet<? extends Locale.Category>) treeSet0);
		HashSet<Weighted<Edge<Locale.Category>>> hashSet0 = new HashSet<Weighted<Edge<Locale.Category>>>(1);
		Locale.Category locale_Category0 = Locale.Category.DISPLAY;
		Edge<Locale.Category> edge0 = new Edge<Locale.Category>(locale_Category0, locale_Category0);
		Weighted<Edge<Locale.Category>> weighted0 = new Weighted<Edge<Locale.Category>>(edge0, 1);
		hashSet0.add(weighted0);
		SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.Category>) priorityQueue0, (Iterable<Weighted<Edge<Locale.Category>>>) hashSet0);
		Collection<Weighted<Edge<Locale.Category>>> collection0 = sparseWeightedGraph0.getIncomingEdges(locale_Category0);
		assertTrue(collection0.contains(weighted0));
	}

	@Test(timeout = 4000)
	public void test01105()  throws Throwable  {
		TreeSet<Locale.Category> treeSet0 = new TreeSet<Locale.Category>();
		PriorityQueue<Locale.Category> priorityQueue0 = new PriorityQueue<Locale.Category>((SortedSet<? extends Locale.Category>) treeSet0);
		LinkedHashSet<Weighted<Edge<Locale.Category>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<Locale.Category>>>();
		Locale.Category locale_Category0 = Locale.Category.DISPLAY;
		SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.Category>) priorityQueue0, (Iterable<Weighted<Edge<Locale.Category>>>) linkedHashSet0);
		Collection<Weighted<Edge<Locale.Category>>> collection0 = sparseWeightedGraph0.getIncomingEdges(locale_Category0);
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void test01106()  throws Throwable  {
		TreeSet<Locale.Category> treeSet0 = new TreeSet<Locale.Category>();
		PriorityQueue<Locale.Category> priorityQueue0 = new PriorityQueue<Locale.Category>((SortedSet<? extends Locale.Category>) treeSet0);
		LinkedHashSet<Weighted<Edge<Locale.Category>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<Locale.Category>>>();
		Locale.Category locale_Category0 = Locale.Category.DISPLAY;
		Edge<Locale.Category> edge0 = new Edge<Locale.Category>(locale_Category0, locale_Category0);
		Weighted<Edge<Locale.Category>> weighted0 = new Weighted<Edge<Locale.Category>>(edge0, 1);
		linkedHashSet0.add(weighted0);
		SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.Category>) priorityQueue0, (Iterable<Weighted<Edge<Locale.Category>>>) linkedHashSet0);
		Locale.Category locale_Category1 = Locale.Category.FORMAT;
		double double0 = sparseWeightedGraph0.getWeightOf(locale_Category1, locale_Category0);
		assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test01107()  throws Throwable  {
		TreeSet<Locale.Category> treeSet0 = new TreeSet<Locale.Category>();
		PriorityQueue<Locale.Category> priorityQueue0 = new PriorityQueue<Locale.Category>((SortedSet<? extends Locale.Category>) treeSet0);
		HashSet<Weighted<Edge<Locale.Category>>> hashSet0 = new HashSet<Weighted<Edge<Locale.Category>>>(1);
		Locale.Category locale_Category0 = Locale.Category.DISPLAY;
		Edge<Locale.Category> edge0 = new Edge<Locale.Category>(locale_Category0, locale_Category0);
		Weighted<Edge<Locale.Category>> weighted0 = new Weighted<Edge<Locale.Category>>(edge0, 1);
		hashSet0.add(weighted0);
		SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.Category>) priorityQueue0, (Iterable<Weighted<Edge<Locale.Category>>>) hashSet0);
		double double0 = sparseWeightedGraph0.getWeightOf(locale_Category0, locale_Category0);
		assertEquals(1.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test01108()  throws Throwable  {
		ArrayList<Weighted<Edge<Object>>> arrayList0 = new ArrayList<Weighted<Edge<Object>>>(92);
		SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) arrayList0);
		Integer integer0 = new Integer(92);
		Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
		double double0 = sparseWeightedGraph0.getWeightOf(arrayList0, edge0);
		assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test01109()  throws Throwable  {
		ArrayDeque<Weighted<Edge<Edge<Object>>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Edge<Object>>>>();
		Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
		Edge<Edge<Object>> edge1 = new Edge<Edge<Object>>(edge0, edge0);
		Weighted<Edge<Edge<Object>>> weighted0 = Weighted.weighted(edge1, (-643.55544));
		arrayDeque0.offerFirst(weighted0);
		arrayDeque0.add(weighted0);
		// Undeclared exception!
		try {
			SparseWeightedGraph.from((Iterable<Edge<Object>>) null, (Iterable<Weighted<Edge<Edge<Object>>>>) arrayDeque0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.collect.ImmutableSet", e);
		}
	}

	@Test(timeout = 4000)
	public void test01110()  throws Throwable  {
		ArrayDeque<Weighted<Edge<Object>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Object>>>((-543));
		SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) arrayDeque0);
		Collection<Object> collection0 = sparseWeightedGraph0.getNodes();
		assertFalse(collection0.contains((-543)));
	}


	@Test(timeout = 4000)
	public void test01200()  throws Throwable  {
		Integer integer0 = new Integer(616);
		Weighted<Integer> weighted0 = Weighted.weighted(integer0, 0.0);
		Weighted<Object> weighted1 = new Weighted<Object>(weighted0, 0.0);
		Weighted<Object> weighted2 = new Weighted<Object>(weighted0, 616);
		int int0 = weighted1.compareTo(weighted2);
		assertEquals(1, int0);
		assertEquals(0.0, weighted0.weight, 0.01);
	}

	@Test(timeout = 4000)
	public void test01201()  throws Throwable  {
		Weighted<String> weighted0 = new Weighted<String>("vahpl", 513.7592514804143);
		Integer integer0 = new Integer((-964));
		Weighted<Object> weighted1 = Weighted.weighted((Object) weighted0, 513.7592514804143);
		Weighted<Object> weighted2 = Weighted.weighted((Object) integer0, 513.7592514804143);
		int int0 = weighted2.compareTo(weighted1);
		assertEquals(513.7592514804143, weighted2.weight, 0.01);
		assertEquals((-1), int0);
	}

	@Test(timeout = 4000)
	public void test01202()  throws Throwable  {
		// Undeclared exception!
		try {
			Weighted.weighted((Object) null, (-7057.938470339));
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test01203()  throws Throwable  {
		Weighted<Integer> weighted0 = null;
		try {
			weighted0 = new Weighted<Integer>((Integer) null, (-3932.977012528));
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void test01204()  throws Throwable  {
		Integer integer0 = new Integer(549);
		Weighted<Object> weighted0 = Weighted.weighted((Object) integer0, (double) 549);
		boolean boolean0 = weighted0.equals(integer0);
		assertEquals(549.0, weighted0.weight, 0.01);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test01205()  throws Throwable  {
		Weighted<String> weighted0 = Weighted.weighted("", (-2539.2191962176));
		weighted0.hashCode();
		assertEquals((-2539.2191962176), weighted0.weight, 0.01);
	}

	@Test(timeout = 4000)
	public void test01206()  throws Throwable  {
		Integer integer0 = new Integer((-964));
		Weighted<Object> weighted0 = Weighted.weighted((Object) integer0, 513.7592514804143);
		Weighted<Integer> weighted1 = new Weighted<Integer>(integer0, (-964));
		boolean boolean0 = weighted0.equals(weighted1);
		assertEquals(513.7592514804143, weighted0.weight, 0.01);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test01207()  throws Throwable  {
		Integer integer0 = new Integer((-964));
		Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, 513.7592514804143);
		Weighted<Object> weighted1 = Weighted.weighted((Object) integer0, 513.7592514804143);
		boolean boolean0 = weighted1.equals(weighted0);
		assertEquals(513.7592514804143, weighted1.weight, 0.01);
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test01208()  throws Throwable  {
		Weighted<String> weighted0 = new Weighted<String>("vahpl", 513.7592514804143);
		Integer integer0 = new Integer((-964));
		Weighted<Integer> weighted1 = new Weighted<Integer>(integer0, 513.7592514804143);
		Weighted<Object> weighted2 = Weighted.weighted((Object) weighted0, 513.7592514804143);
		boolean boolean0 = weighted2.equals(weighted1);
		assertEquals(513.7592514804143, weighted2.weight, 0.01);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test01209()  throws Throwable  {
		Weighted<String> weighted0 = new Weighted<String>("vahpl", 513.7592514804143);
		Weighted<Object> weighted1 = Weighted.weighted((Object) weighted0, 513.7592514804143);
		String string0 = weighted1.toString();
		assertEquals("Weighted{val=Weighted{val=vahpl, weight=513.7592514804143}, weight=513.7592514804143}", string0);
	}

	@Test(timeout = 4000)
	public void test01210()  throws Throwable  {
		Weighted<String> weighted0 = new Weighted<String>("vahpl", 513.7592514804143);
		Weighted<Object> weighted1 = Weighted.weighted((Object) weighted0, 513.7592514804143);
		int int0 = weighted1.compareTo(weighted1);
		assertEquals(513.7592514804143, weighted1.weight, 0.01);
		assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void test01211()  throws Throwable  {
		Object object0 = new Object();
		Weighted<Object> weighted0 = new Weighted<Object>(object0, 1644.41604409);
		// Undeclared exception!
		try {
			weighted0.compareTo((Weighted<Object>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.Weighted", e);
		}
	}


	@Test(timeout = 4000)
	public void test0130()  throws Throwable  {
		LinkedHashSet<Weighted<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<String>>>(13);
		Edge<String> edge0 = new Edge<String>("", "");
		Weighted<Edge<String>> weighted0 = Weighted.weighted(edge0, (double) 13);
		linkedHashSet0.add(weighted0);
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) linkedHashSet0);
		double double0 = sparseWeightedGraph0.getWeightOf("", "");
		assertEquals(13.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test0131()  throws Throwable  {
		LinkedHashSet<Weighted<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<String>>>(0);
		ArrayList<Weighted<Edge<Weighted<Object>>>> arrayList0 = new ArrayList<Weighted<Edge<Weighted<Object>>>>(636);
		SparseWeightedGraph<Weighted<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Weighted<Object>>>>) arrayList0);
		Collection<Weighted<Object>> collection0 = sparseWeightedGraph0.getNodes();
		LinkedList<Weighted<Edge<Object>>> linkedList0 = new LinkedList<Weighted<Edge<Object>>>();
		SparseWeightedGraph<Object> sparseWeightedGraph1 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) linkedList0);
		Object object0 = new Object();
		Edge<Object> edge0 = new Edge<Object>(object0, linkedHashSet0);
		double double0 = sparseWeightedGraph1.getWeightOf(edge0, collection0);
		assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test0132()  throws Throwable  {
		ArrayList<Weighted<Edge<String>>> arrayList0 = new ArrayList<Weighted<Edge<String>>>();
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) arrayList0);
		Collection<String> collection0 = sparseWeightedGraph0.getNodes();
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void test0133()  throws Throwable  {
		ArrayList<Weighted<Edge<String>>> arrayList0 = new ArrayList<Weighted<Edge<String>>>();
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) arrayList0);
		Collection<Weighted<Edge<String>>> collection0 = sparseWeightedGraph0.getIncomingEdges("");
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void test0134()  throws Throwable  {
		double[][] doubleArray0 = new double[4][7];
		double[] doubleArray1 = new double[0];
		doubleArray0[1] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(1);
		// Undeclared exception!
		try {
			denseWeightedGraph0.getWeightOf(integer0, integer0);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 1
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void test0135()  throws Throwable  {
		double[][] doubleArray0 = new double[7][2];
		double[] doubleArray1 = new double[0];
		doubleArray0[3] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		// Undeclared exception!
		try {
			denseWeightedGraph0.getIncomingEdges(integer0);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 0
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void test0136()  throws Throwable  {
		LinkedHashSet<Weighted<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<String>>>();
		Edge<String> edge0 = new Edge<String>("&", "N}+");
		Weighted<Edge<String>> weighted0 = Weighted.weighted(edge0, (double) 1);
		linkedHashSet0.add(weighted0);
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) linkedHashSet0);
		// Undeclared exception!
		try {
			sparseWeightedGraph0.filterEdges((Predicate<Edge<String>>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.WeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void test0137()  throws Throwable  {
		LinkedHashSet<Weighted<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<String>>>();
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) linkedHashSet0);
		WeightedGraph<String> weightedGraph0 = sparseWeightedGraph0.filterEdges((Predicate<Edge<String>>) null);
		assertNotNull(weightedGraph0);
	}
	

}

