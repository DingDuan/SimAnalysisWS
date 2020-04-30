package net.mooctest;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import com.google.common.collect.ImmutableMap;
import net.mooctest.FibonacciQueue;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.EnumSet;
import net.mooctest.WeightedGraph;
import java.util.ConcurrentModificationException;
import static org.junit.Assert.*;
import net.mooctest.Pair;
import net.mooctest.ChuLiuEdmonds;
import java.util.Stack;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunnerParameters;
import net.mooctest.ExclusiveEdge;
import java.util.HashSet;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableBiMap;
import java.util.Set;
import net.mooctest.Partition;
import com.google.common.collect.ImmutableSortedMap;
import net.mooctest.Arborescence;
import org.evosuite.runtime.EvoRunner;
import org.junit.Test;
import java.util.Comparator;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.Map;
import java.util.List;
import java.util.TreeSet;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import net.mooctest.SparseWeightedGraph;
import net.mooctest.EdgeQueueMap;
import java.util.ArrayDeque;
import java.util.Iterator;
import net.mooctest.KBestArborescences;
import java.util.AbstractMap;
import java.util.Locale;
import net.mooctest.DenseWeightedGraph;
import java.util.Collection;
import com.google.common.base.Optional;
import net.mooctest.FibonacciHeap;
import java.util.PriorityQueue;
import net.mooctest.Weighted;
import net.mooctest.Edge;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyTestFibonacciHeap {
	@org.junit.Rule
	public final ExpectedSystemExit exit = ExpectedSystemExit.none();

	@org.junit.Rule
	public final TextFromStandardInputStream systemInMock
			= emptyStandardInputStream();
	@org.junit.Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@org.junit.Rule
	public final ExpectedException thrown = ExpectedException.none();

	@org.junit.Rule
	public final SystemErrRule systemErrRule = new SystemErrRule().enableLog();

	class CauseMatcher extends TypeSafeMatcher {
		private Class<?> expectedType;
		private String expectedCause;

		public CauseMatcher(Class<?> clazz, String str) {
			this.expectedType = clazz;
			this.expectedCause = str;
		}

		protected boolean matchesSafely(Object item) {
			Throwable throwable = (Throwable) item;
			return throwable.getClass().isAssignableFrom(this.expectedType) && throwable.getMessage().contains(this.expectedCause);
		}

		public void describeTo(Description description) {
			description.appendText("expects type ");
		}
	}

	private Method getMethod(Class clazz, String name, Class... parameters) throws Throwable {
		Method method = clazz.getDeclaredMethod(name, parameters);
		method.setAccessible(true);
		return method;
	}

	private Field getField(Class clazz, String fieldName) throws Throwable {
		Field field = clazz.getDeclaredField(fieldName);
		field.setAccessible(true);
		return field;
	}

	private Field getFinalField(Class clazz, String fieldName) throws Throwable {
		Field field = clazz.getDeclaredField(fieldName);
		field.setAccessible(true);
		Field modifiersField = Field.class.getDeclaredField("modifiers");
		modifiersField.setAccessible(true);
		modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
		return field;
	}

	private void el(String out) {
		assertEquals(out, systemOutRule.getLog());
	}

	@Before
	public void handleBefore() {
		systemErrRule.clearLog();
		systemOutRule.clearLog();
	}

	@Test(timeout = 4000)
	public void testArborescence0()  throws Throwable  {
		Arborescence<Object> arborescence0 = Arborescence.empty();
		// Undeclared exception!
		try {
			ImmutableBiMap.of(arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0);
			fail("Expecting exception: IllegalArgumentException");

		} catch(IllegalArgumentException e) {
			//
			// Multiple entries with same key: Arborescence{}=Arborescence{} and Arborescence{}=Arborescence{}
			//
			verifyException("com.google.common.collect.RegularImmutableBiMap", e);
		}
	}

	@Test(timeout = 4000)
	public void testArborescence1()  throws Throwable  {
		Arborescence<String> arborescence0 = Arborescence.of((ImmutableMap<String, String>) null);
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
	public void testArborescence2()  throws Throwable  {
		Arborescence<Comparable<Edge>> arborescence0 = Arborescence.of((ImmutableMap<Comparable<Edge>, Comparable<Edge>>) null);
		Arborescence<Edge<AbstractMap.SimpleImmutableEntry<Arborescence<Object>, Integer>>> arborescence1 = Arborescence.empty();
		// Undeclared exception!
		try {
			arborescence1.equals(arborescence0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.Arborescence", e);
		}
	}

	@Test(timeout = 4000)
	public void testArborescence3()  throws Throwable  {
		Arborescence<Edge<Object>> arborescence0 = Arborescence.of((ImmutableMap<Edge<Object>, Edge<Object>>) null);
		Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
		Edge<Edge<Object>> edge1 = new Edge<Edge<Object>>(edge0, edge0);
		// Undeclared exception!
		try {
			arborescence0.contains(edge1);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.Arborescence", e);
		}
	}

	@Test(timeout = 4000)
	public void testArborescence4()  throws Throwable  {
		Arborescence<Object> arborescence0 = Arborescence.empty();
		ImmutableBiMap<Arborescence<Object>, Arborescence<Object>> immutableBiMap0 = ImmutableBiMap.of(arborescence0, arborescence0);
		Arborescence<Arborescence<Object>> arborescence1 = Arborescence.of((ImmutableMap<Arborescence<Object>, Arborescence<Object>>) immutableBiMap0);
		Integer integer0 = new Integer(0);
		ImmutableBiMap<Object, Object> immutableBiMap1 = ImmutableBiMap.of((Object) arborescence1, (Object) integer0, (Object) arborescence0, (Object) immutableBiMap0);
		assertEquals(2, immutableBiMap1.size());
	}

	@Test(timeout = 4000)
	public void testArborescence5()  throws Throwable  {
		Arborescence<Comparable<Object>> arborescence0 = Arborescence.empty();
		boolean boolean0 = arborescence0.equals((Object) null);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testArborescence6()  throws Throwable  {
		Arborescence<Object> arborescence0 = Arborescence.empty();
		Arborescence<AbstractMap.SimpleImmutableEntry<String, String>> arborescence1 = Arborescence.empty();
		boolean boolean0 = arborescence1.equals(arborescence0);
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testArborescence7()  throws Throwable  {
		Arborescence<AbstractMap.SimpleEntry<String, Object>> arborescence0 = Arborescence.empty();
		Object object0 = new Object();
		boolean boolean0 = arborescence0.equals(object0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testArborescence8()  throws Throwable  {
		Integer integer0 = new Integer(0);
		Integer integer1 = new Integer(1073741824);
		ImmutableMap<Integer, Integer> immutableMap0 = ImmutableMap.of(integer0, integer0, integer1, integer1);
		Arborescence<Integer> arborescence0 = Arborescence.of(immutableMap0);
		String string0 = arborescence0.toString();
		assertEquals("Arborescence{0 -> 0, 1073741824 -> 1073741824}", string0);
	}

	@Test(timeout = 4000)
	public void testArborescence9()  throws Throwable  {
		ImmutableBiMap<String, String> immutableBiMap0 = ImmutableBiMap.of("PdiebL9@RJ+0vQKZd", "");
		ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.copyOf((Map<? extends String, ? extends String>) immutableBiMap0);
		Arborescence<String> arborescence0 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
		Edge<String> edge0 = new Edge<String>(" -> ", "PdiebL9@RJ+0vQKZd");
		boolean boolean0 = arborescence0.contains(edge0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testArborescence10()  throws Throwable  {
		Arborescence<Integer> arborescence0 = Arborescence.empty();
		Object object0 = new Object();
		Edge<Object> edge0 = new Edge<Object>(arborescence0, object0);
		ImmutableMap<Edge<Object>, Edge<Object>> immutableMap0 = ImmutableMap.of(edge0, edge0);
		Arborescence<Edge<Object>> arborescence1 = Arborescence.of(immutableMap0);
		Edge<Edge<Object>> edge1 = new Edge<Edge<Object>>(edge0, edge0);
		boolean boolean0 = arborescence1.contains(edge1);
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testArborescence11()  throws Throwable  {
		Arborescence<String> arborescence0 = Arborescence.empty();
		Edge<String> edge0 = new Edge<String>("com.google.common.collect.ImmutableSet", (String) null);
		boolean boolean0 = arborescence0.contains(edge0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testArborescence12()  throws Throwable  {
		Arborescence<Comparable<String>> arborescence0 = Arborescence.of((ImmutableMap<Comparable<String>, Comparable<String>>) null);
		arborescence0.hashCode();
	}

	@Test(timeout = 4000)
	public void testChuLiuEdmonds13()  throws Throwable  {
		Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>(433, comparator0);
		TreeSet<Weighted<Edge<String>>> treeSet0 = new TreeSet<Weighted<Edge<String>>>();
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) priorityQueue0, (Iterable<Weighted<Edge<String>>>) treeSet0);
		LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
		HashSet<Edge<String>> hashSet0 = new HashSet<Edge<String>>();
		Weighted<Arborescence<String>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) sparseWeightedGraph0, (Set<Edge<String>>) linkedHashSet0, (Set<Edge<String>>) hashSet0);
		assertEquals(0.0, weighted0.weight, 0.01);
	}

	@Test(timeout = 4000)
	public void testChuLiuEdmonds14()  throws Throwable  {
		double[][] doubleArray0 = new double[4][6];
		double[] doubleArray1 = new double[8];
		doubleArray1[1] = (double) 558;
		doubleArray0[0] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
		assertEquals(558.0, weighted0.weight, 0.01);
	}

	@Test(timeout = 4000)
	public void testChuLiuEdmonds15()  throws Throwable  {
		ArrayList<Object> arrayList0 = new ArrayList<Object>(1705);
		double[][] doubleArray0 = new double[0][6];
		DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) arrayList0, doubleArray0);
		ChuLiuEdmonds.PartialSolution<Object> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Object>) denseWeightedGraph0);
		Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
		ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, (double) 1705);
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

	@Test(timeout = 4000)
	public void testChuLiuEdmonds16()  throws Throwable  {
		LinkedHashSet<Edge<ExclusiveEdge<String>>> linkedHashSet0 = new LinkedHashSet<Edge<ExclusiveEdge<String>>>();
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<ExclusiveEdge<String>>) null, (Set<Edge<ExclusiveEdge<String>>>) linkedHashSet0, (Set<Edge<ExclusiveEdge<String>>>) linkedHashSet0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.ChuLiuEdmonds", e);
		}
	}

	@Test(timeout = 4000)
	public void testChuLiuEdmonds17()  throws Throwable  {
		ArrayList<Object> arrayList0 = new ArrayList<Object>();
		double[][] doubleArray0 = new double[1][2];
		double[] doubleArray1 = new double[0];
		Edge<String> edge0 = (Edge<String>) mock(Edge.class, new ViolatedAssumptionAnswer());
		ArrayList<Edge<String>> arrayList1 = new ArrayList<Edge<String>>();
		ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<String>>) arrayList1, 0.0);
		arrayList0.add((Object) exclusiveEdge0);
		doubleArray0[0] = doubleArray1;
		DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) arrayList0, doubleArray0);
		TreeSet<Edge<Object>> treeSet0 = new TreeSet<Edge<Object>>();
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) denseWeightedGraph0, (Set<Edge<Object>>) treeSet0, (Set<Edge<Object>>) treeSet0);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 0
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void testChuLiuEdmonds18()  throws Throwable  {
		double[][] doubleArray0 = new double[7][7];
		double[] doubleArray1 = new double[2];
		doubleArray0[2] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Integer) null);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 2
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void testChuLiuEdmonds19()  throws Throwable  {
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Weighted<Edge<String>>>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.ChuLiuEdmonds", e);
		}
	}

	@Test(timeout = 4000)
	public void testChuLiuEdmonds20()  throws Throwable  {
		double[][] doubleArray0 = new double[6][0];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 0
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void testChuLiuEdmonds21()  throws Throwable  {
		double[][] doubleArray0 = new double[2][5];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);
		assertNotNull(chuLiuEdmonds_PartialSolution0);
	}

	@Test(timeout = 4000)
	public void testChuLiuEdmonds22()  throws Throwable  {
		HashSet<Weighted<Edge<Object>>> hashSet0 = new HashSet<Weighted<Edge<Object>>>();
		SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) hashSet0);
		ChuLiuEdmonds.PartialSolution<Object> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Object>) sparseWeightedGraph0);
		Set<Object> set0 = chuLiuEdmonds_PartialSolution0.getNodes();
		assertEquals(0, set0.size());
	}

	@Test(timeout = 4000)
	public void testChuLiuEdmonds23()  throws Throwable  {
		ArrayDeque<String> arrayDeque0 = new ArrayDeque<String>();
		HashSet<Object> hashSet0 = new HashSet<Object>(arrayDeque0);
		Vector<Weighted<Edge<Object>>> vector0 = new Vector<Weighted<Edge<Object>>>(3461, 3461);
		SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Object>) hashSet0, (Iterable<Weighted<Edge<Object>>>) vector0);
		ChuLiuEdmonds.PartialSolution<Object> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Object>) sparseWeightedGraph0);
		Optional<ExclusiveEdge<Object>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge((Object) hashSet0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void testChuLiuEdmonds24()  throws Throwable  {
		LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>(558);
		Vector<Weighted<Edge<Edge<String>>>> vector0 = new Vector<Weighted<Edge<Edge<String>>>>();
		SparseWeightedGraph<Edge<String>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Edge<String>>) linkedHashSet0, (Iterable<Weighted<Edge<Edge<String>>>>) vector0);
		ChuLiuEdmonds.PartialSolution<Edge<String>> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Edge<String>>) sparseWeightedGraph0);
		Edge<String> edge0 = (Edge<String>) mock(Edge.class, new ViolatedAssumptionAnswer());
		Arborescence<Edge<String>> arborescence0 = Arborescence.empty();
		Optional<ExclusiveEdge<Edge<String>>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge(edge0, arborescence0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void testChuLiuEdmonds25()  throws Throwable  {
		Stack<Comparable<Object>> stack0 = new Stack<Comparable<Object>>();
		PriorityQueue<Comparable<Object>> priorityQueue0 = new PriorityQueue<Comparable<Object>>(stack0);
		Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
		doReturn((String) null).when(comparable0).toString();
		priorityQueue0.add(comparable0);
		ArrayDeque<Weighted<Edge<Comparable<Object>>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Comparable<Object>>>>();
		SparseWeightedGraph<Comparable<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Comparable<Object>>) priorityQueue0, (Iterable<Weighted<Edge<Comparable<Object>>>>) arrayDeque0);
		Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
		Weighted<Arborescence<Comparable<Object>>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Comparable<Object>>) sparseWeightedGraph0, comparable1);
		assertEquals(0.0, weighted0.weight, 0.01);
	}

	@Test(timeout = 4000)
	public void testChuLiuEdmonds26()  throws Throwable  {
		Edge<String> edge0 = (Edge<String>) mock(Edge.class, new ViolatedAssumptionAnswer());
		LinkedList<Edge<String>> linkedList0 = new LinkedList<Edge<String>>();
		ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<String>>) linkedList0, (-3468.741961));
		// Undeclared exception!
		try {
			ChuLiuEdmonds.getMaxArborescence((WeightedGraph<ExclusiveEdge<String>>) null, exclusiveEdge0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.ChuLiuEdmonds", e);
		}
	}

	@Test(timeout = 4000)
	public void testChuLiuEdmonds27()  throws Throwable  {
		ChuLiuEdmonds chuLiuEdmonds0 = new ChuLiuEdmonds();
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph28()  throws Throwable  {
		double[][] doubleArray0 = new double[9][9];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		Integer integer1 = new Integer(0);
		double double0 = denseWeightedGraph0.getWeightOf(integer0, integer1);
		assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph29()  throws Throwable  {
		double[][] doubleArray0 = new double[0][8];
		ArrayDeque<Locale.Category> arrayDeque0 = new ArrayDeque<Locale.Category>();
		Locale.Category locale_Category0 = Locale.Category.FORMAT;
		arrayDeque0.offerLast(locale_Category0);
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((Iterable<Locale.Category>) arrayDeque0, doubleArray0);
			fail("Expecting exception: IllegalArgumentException");

		} catch(IllegalArgumentException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph30()  throws Throwable  {
		double[][] doubleArray0 = new double[9][7];
		double[] doubleArray1 = new double[6];
		doubleArray1[0] = 1.3453176988122908;
		doubleArray0[0] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
		assertEquals(1.3453176988122908, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph31()  throws Throwable  {
		double[][] doubleArray0 = new double[6][6];
		double[] doubleArray1 = new double[0];
		doubleArray0[0] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		// Undeclared exception!
		try {
			denseWeightedGraph0.getWeightOf(integer0, integer0);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 0
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph32()  throws Throwable  {
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
	public void testDenseWeightedGraph33()  throws Throwable  {
		Stack<String> stack0 = new Stack<String>();
		List<String> list0 = stack0.subList(0, 0);
		double[][] doubleArray0 = new double[2][1];
		stack0.add("");
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((Iterable<String>) list0, doubleArray0);
			fail("Expecting exception: ConcurrentModificationException");

		} catch(ConcurrentModificationException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("java.util.SubList", e);
		}
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph34()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((Iterable<String>) linkedList0, (double[][]) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph35()  throws Throwable  {
		double[][] doubleArray0 = new double[3][8];
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((Iterable<Weighted<String>>) null, doubleArray0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph36()  throws Throwable  {
		Locale.Category locale_Category0 = Locale.Category.DISPLAY;
		EnumSet<Locale.Category> enumSet0 = EnumSet.range(locale_Category0, locale_Category0);
		double[][] doubleArray0 = new double[1][4];
		DenseWeightedGraph<Locale.Category> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.Category>) enumSet0, doubleArray0);
		Collection<Weighted<Edge<Locale.Category>>> collection0 = denseWeightedGraph0.getIncomingEdges(locale_Category0);
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph37()  throws Throwable  {
		double[][] doubleArray0 = new double[1][9];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(41);
		Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph38()  throws Throwable  {
		double[][] doubleArray0 = new double[1][9];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		Integer integer1 = new Integer(1019);
		double double0 = denseWeightedGraph0.getWeightOf(integer0, integer1);
		assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph39()  throws Throwable  {
		double[][] doubleArray0 = new double[1][9];
		TreeSet<String> treeSet0 = new TreeSet<String>();
		treeSet0.add("");
		DenseWeightedGraph<String> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<String>) treeSet0, doubleArray0);
		double double0 = denseWeightedGraph0.getWeightOf("z3?E16X3QMS)kV~\"", (String) null);
		assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph40()  throws Throwable  {
		double[][] doubleArray0 = new double[1][9];
		Vector<Locale.LanguageRange> vector0 = new Vector<Locale.LanguageRange>();
		// Undeclared exception!
		try {
			DenseWeightedGraph.from((Iterable<Locale.LanguageRange>) vector0, doubleArray0);
			fail("Expecting exception: IllegalArgumentException");

		} catch(IllegalArgumentException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph41()  throws Throwable  {
		double[][] doubleArray0 = new double[0][8];
		ArrayDeque<Locale.Category> arrayDeque0 = new ArrayDeque<Locale.Category>();
		DenseWeightedGraph<Locale.Category> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.Category>) arrayDeque0, doubleArray0);
		Collection<Locale.Category> collection0 = denseWeightedGraph0.getNodes();
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void testDenseWeightedGraph42()  throws Throwable  {
		double[][] doubleArray0 = new double[2][0];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(1);
		// Undeclared exception!
		try {
			denseWeightedGraph0.getIncomingEdges(integer0);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 1
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void testEdgeQueueMap43()  throws Throwable  {
		FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create();
		Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) fibonacciQueue0);
		EdgeQueueMap<Integer> edgeQueueMap0 = new EdgeQueueMap<Integer>(partition0);
		Edge<Integer> edge0 = (Edge<Integer>) mock(Edge.class, new ViolatedAssumptionAnswer());
		Weighted<Edge<Integer>> weighted0 = new Weighted<Edge<Integer>>(edge0, 1507.6852219628688);
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
	public void testEdgeQueueMap44()  throws Throwable  {
		EdgeQueueMap.EdgeQueue<Object> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((Object) null, (Partition<Object>) null);
		Arborescence<Object> arborescence0 = Arborescence.of((ImmutableMap<Object, Object>) null);
		Optional<ExclusiveEdge<Object>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge(arborescence0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void testEdgeQueueMap45()  throws Throwable  {
		Vector<String> vector0 = new Vector<String>();
		Partition<String> partition0 = Partition.singletons((Collection<String>) vector0);
		EdgeQueueMap<String> edgeQueueMap0 = new EdgeQueueMap<String>(partition0);
		ArrayDeque<Pair<EdgeQueueMap.EdgeQueue<String>, Weighted<Edge<String>>>> arrayDeque0 = new ArrayDeque<Pair<EdgeQueueMap.EdgeQueue<String>, Weighted<Edge<String>>>>();
		Pair<EdgeQueueMap.EdgeQueue<String>, Weighted<Edge<String>>> pair0 = (Pair<EdgeQueueMap.EdgeQueue<String>, Weighted<Edge<String>>>) mock(Pair.class, new ViolatedAssumptionAnswer());
		arrayDeque0.add(pair0);
		// Undeclared exception!
		try {
			edgeQueueMap0.merge("M5ymX d", arrayDeque0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.EdgeQueueMap", e);
		}
	}

	@Test(timeout = 4000)
	public void testEdgeQueueMap46()  throws Throwable  {
		PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
		Partition<String> partition0 = Partition.singletons((Collection<String>) priorityQueue0);
		EdgeQueueMap<String> edgeQueueMap0 = new EdgeQueueMap<String>(partition0);
		Vector<Pair<EdgeQueueMap.EdgeQueue<String>, Weighted<Edge<String>>>> vector0 = new Vector<Pair<EdgeQueueMap.EdgeQueue<String>, Weighted<Edge<String>>>>();
		edgeQueueMap0.merge("", vector0);
		ImmutableMap<String, String> immutableMap0 = ImmutableMap.of("", "net.mooctest.EdgeQueueMap");
		Arborescence<String> arborescence0 = Arborescence.of(immutableMap0);
		Optional<ExclusiveEdge<String>> optional0 = edgeQueueMap0.popBestEdge("", arborescence0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void testEdgeQueueMap47()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		EdgeQueueMap<String> edgeQueueMap0 = new EdgeQueueMap<String>(partition0);
		Arborescence<String> arborescence0 = Arborescence.empty();
		Optional<ExclusiveEdge<String>> optional0 = edgeQueueMap0.popBestEdge("A$", arborescence0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void testEdgeQueueMap48()  throws Throwable  {
		Stack<Object> stack0 = new Stack<Object>();
		Partition<Object> partition0 = Partition.singletons((Collection<Object>) stack0);
		Partition<Partition<Object>> partition1 = (Partition<Partition<Object>>) mock(Partition.class, new ViolatedAssumptionAnswer());
		doReturn((Object) null).when(partition1).componentOf(nullable(net.mooctest.Partition.class));
		EdgeQueueMap.EdgeQueue<Partition<Object>> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(partition0, partition1);
		Edge<Partition<Object>> edge0 = (Edge<Partition<Object>>) mock(Edge.class, new ViolatedAssumptionAnswer());
		ExclusiveEdge<Partition<Object>> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
		edgeQueueMap_EdgeQueue0.addEdge(exclusiveEdge0);
		assertEquals(0.0, exclusiveEdge0.weight, 0.01);
	}

	@Test(timeout = 4000)
	public void testEdgeQueueMap49()  throws Throwable  {
		Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
		Stack<Locale.FilteringMode> stack0 = new Stack<Locale.FilteringMode>();
		LinkedHashSet<Locale.FilteringMode> linkedHashSet0 = new LinkedHashSet<Locale.FilteringMode>(stack0);
		Partition<Locale.FilteringMode> partition0 = Partition.singletons((Collection<Locale.FilteringMode>) linkedHashSet0);
		EdgeQueueMap.EdgeQueue<Locale.FilteringMode> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(locale_FilteringMode0, partition0);
		Optional<ExclusiveEdge<Locale.FilteringMode>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge();
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void testEdge50()  throws Throwable  {
		Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
		Edge.EdgeBuilder<Object> edge_EdgeBuilder1 = Edge.from((Object) "net.mooctest.Edge");
		Edge<Object> edge0 = edge_EdgeBuilder1.to(edge_EdgeBuilder0);
		boolean boolean0 = edge0.equals(edge0);
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testEdge51()  throws Throwable  {
		Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) "");
		Edge<Object> edge0 = edge_EdgeBuilder0.to("");
		String string0 = edge0.toString();
		assertEquals("Edge{source=, destination=}", string0);
	}

	@Test(timeout = 4000)
	public void testEdge52()  throws Throwable  {
		Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) "");
		Edge<Object> edge0 = edge_EdgeBuilder0.to("");
		edge0.hashCode();
	}

	@Test(timeout = 4000)
	public void testEdge53()  throws Throwable  {
		// Undeclared exception!
		try {
			Edge.competesWith((Set<Edge<String>>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.Edge", e);
		}
	}

	@Test(timeout = 4000)
	public void testEdge54()  throws Throwable  {
		LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
		Edge<String> edge0 = new Edge<String>("% 1Ln_6#o;R4}[]dIBg", (String) null);
		linkedHashSet0.add(edge0);
		// Undeclared exception!
		try {
			Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// null key in entry: null=% 1Ln_6#o;R4}[]dIBg
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void testEdge55()  throws Throwable  {
		Edge<String> edge0 = new Edge<String>(",>Mcb", ",>Mcb");
		LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
		linkedHashSet0.add(edge0);
		Edge<String> edge1 = new Edge<String>("", ",>Mcb");
		linkedHashSet0.add(edge1);
		// Undeclared exception!
		try {
			Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
			fail("Expecting exception: IllegalArgumentException");

		} catch(IllegalArgumentException e) {
			//
			// duplicate key: ,>Mcb
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void testEdge56()  throws Throwable  {
		Edge<String> edge0 = new Edge<String>("", "");
		Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) edge0);
		Predicate<Edge<Integer>> predicate0 = Edge.isAutoCycle();
		Edge<Edge<String>> edge1 = new Edge<Edge<String>>(edge0, edge0);
		Edge<Object> edge2 = edge_EdgeBuilder0.to(predicate0);
		boolean boolean0 = edge1.equals(edge2);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testEdge57()  throws Throwable  {
		Edge<String> edge0 = new Edge<String>("", "");
		Edge<Edge<String>> edge1 = new Edge<Edge<String>>(edge0, edge0);
		boolean boolean0 = edge0.equals(edge1);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testEdge58()  throws Throwable  {
		Integer integer0 = new Integer(467);
		Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
		boolean boolean0 = edge0.equals(integer0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testEdge59()  throws Throwable  {
		Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) "");
		Edge<Object> edge0 = edge_EdgeBuilder0.to("");
		boolean boolean0 = edge0.equals((Object) null);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testEdge60()  throws Throwable  {
		LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
		Predicate<Edge<Object>> predicate0 = Edge.competesWith((Set<Edge<Object>>) linkedHashSet0);
		assertNotNull(predicate0);
	}

	@Test(timeout = 4000)
	public void testEdge61()  throws Throwable  {
		LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
		Predicate<Edge<Object>> predicate0 = Edge.isIn((Set<Edge<Object>>) linkedHashSet0);
		assertNotNull(predicate0);
	}

	@Test(timeout = 4000)
	public void testEdge62()  throws Throwable  {
		Predicate<Edge<Object>> predicate0 = Edge.hasDestination((Object) "");
		assertNotNull(predicate0);
	}

//	@Test(timeout = 4000)
//	public void testExclusiveEdge63()  throws Throwable  {
//		Edge<ExclusiveEdge<Object>> edge0 = (Edge<ExclusiveEdge<Object>>) mock(Edge.class, new ViolatedAssumptionAnswer());
//		ExclusiveEdge<ExclusiveEdge<Object>> exclusiveEdge0 = ExclusiveEdge.of(edge0, 4981.864);
//		ExclusiveEdge<Object> exclusiveEdge1 = ExclusiveEdge.of((Edge<Object>) exclusiveEdge0.edge, 4981.864);
//		ExclusiveEdge<Edge<Object>> exclusiveEdge2 = ExclusiveEdge.of((Edge<Edge<Object>>) exclusiveEdge0.edge, 4981.864);
//		ExclusiveEdge<Object> exclusiveEdge3 = ExclusiveEdge.of((Edge<Object>) exclusiveEdge2.edge, (List<Edge<Object>>) null, (double) 0);
//		int int0 = exclusiveEdge1.compareTo(exclusiveEdge3);
//		assertEquals(1, int0);
//	}

	@Test(timeout = 4000)
	public void testExclusiveEdge64()  throws Throwable  {
		Edge<ExclusiveEdge<Object>> edge0 = (Edge<ExclusiveEdge<Object>>) mock(Edge.class, new ViolatedAssumptionAnswer());
		ExclusiveEdge<ExclusiveEdge<Object>> exclusiveEdge0 = ExclusiveEdge.of(edge0, (-337.5811473341552));
		// Undeclared exception!
		try {
			exclusiveEdge0.compareTo((ExclusiveEdge<ExclusiveEdge<Object>>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.ExclusiveEdge", e);
		}
	}

//	@Test(timeout = 4000)
//	public void testExclusiveEdge65()  throws Throwable  {
//		Edge<ExclusiveEdge<Object>> edge0 = (Edge<ExclusiveEdge<Object>>) mock(Edge.class, new ViolatedAssumptionAnswer());
//		ExclusiveEdge<ExclusiveEdge<Object>> exclusiveEdge0 = ExclusiveEdge.of(edge0, (-337.5811473341552));
//		ExclusiveEdge<String> exclusiveEdge1 = ExclusiveEdge.of((Edge<String>) exclusiveEdge0.edge, (List<Edge<String>>) null, (-1782.0));
//		ExclusiveEdge<String> exclusiveEdge2 = ExclusiveEdge.of((Edge<String>) exclusiveEdge0.edge, (List<Edge<String>>) null, 1245.4);
//		int int0 = exclusiveEdge1.compareTo(exclusiveEdge2);
//		assertEquals((-337.5811473341552), exclusiveEdge0.weight, 0.01);
//		assertEquals((-1), int0);
//	}

	@Test(timeout = 4000)
	public void testFibonacciHeap66()  throws Throwable  {
		FibonacciHeap<Integer, String> fibonacciHeap0 = FibonacciHeap.create();
		Comparator<? super String> comparator0 = fibonacciHeap0.comparator();
		FibonacciHeap<String, String> fibonacciHeap1 = FibonacciHeap.create(comparator0);
		fibonacciHeap0.add((Integer) fibonacciHeap1.MAX_CAPACITY, "po3");
		fibonacciHeap0.add((Integer) Integer.MAX_VALUE, "v2^uy5F:n]f17ZD8~");
		assertEquals(2, fibonacciHeap0.size());
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap67()  throws Throwable  {
		FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
		FibonacciHeap<String, Integer> fibonacciHeap1 = FibonacciHeap.create();
		fibonacciHeap1.add("LB @e<kG'", (Integer) fibonacciHeap0.MAX_CAPACITY);
		fibonacciHeap1.add("", (Integer) Integer.MAX_VALUE);
		FibonacciHeap<String, Integer> fibonacciHeap2 = FibonacciHeap.merge(fibonacciHeap1, fibonacciHeap1);
		assertEquals(2, fibonacciHeap1.size());
		assertEquals(4, fibonacciHeap2.size());
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap68()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<String, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
		FibonacciHeap<String, Object> fibonacciHeap1 = FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
		fibonacciHeap1.add("", fibonacciHeap1);
		FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap1);
		assertEquals(1, fibonacciHeap1.size());
		assertEquals(0, fibonacciHeap0.size());
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap69()  throws Throwable  {
		FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create();
		fibonacciHeap0.add("LB @e<kG'", (Integer) fibonacciHeap0.MAX_CAPACITY);
		fibonacciHeap0.add("", (Integer) Integer.MAX_VALUE);
		fibonacciHeap0.pollOption();
		assertEquals(1, fibonacciHeap0.size());
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap70()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<FibonacciHeap<Object, Object>, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
		Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Object, Object> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super Object>) comparator1);
		Object object0 = new Object();
		fibonacciHeap0.add(fibonacciHeap1, object0);
		int int0 = fibonacciHeap0.size();
		assertEquals(1, int0);
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap71()  throws Throwable  {
		FibonacciHeap<Integer, String> fibonacciHeap0 = FibonacciHeap.create();
		Comparator<? super String> comparator0 = fibonacciHeap0.comparator();
		FibonacciHeap<String, String> fibonacciHeap1 = FibonacciHeap.create(comparator0);
		fibonacciHeap1.iterator();
		assertEquals(0, fibonacciHeap1.size());
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap72()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Integer, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
		// Undeclared exception!
		try {
			FibonacciHeap.merge((FibonacciHeap<Integer, String>) null, fibonacciHeap0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.FibonacciHeap", e);
		}
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap73()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
		FibonacciHeap<String, Integer> fibonacciHeap1 = FibonacciHeap.create();
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
	public void testFibonacciHeap74()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Integer, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
		// Undeclared exception!
		try {
			fibonacciHeap0.decreasePriority((FibonacciHeap.Entry) null, (Integer) Integer.MAX_VALUE);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.FibonacciHeap$Entry", e);
		}
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap75()  throws Throwable  {
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
	public void testFibonacciHeap76()  throws Throwable  {
		FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
		Comparator<? super String> comparator0 = fibonacciHeap0.comparator();
		FibonacciHeap<FibonacciHeap.Entry, String> fibonacciHeap1 = FibonacciHeap.create(comparator0);
		// Undeclared exception!
		try {
			fibonacciHeap1.add((FibonacciHeap.Entry) null, "XPsXr&m`aSrb.");
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap77()  throws Throwable  {
		FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Object, FibonacciHeap<Object, Object>> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super FibonacciHeap<Object, Object>>) comparator0);
		Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
		Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Object, Object> fibonacciHeap2 = FibonacciHeap.create((Comparator<? super Object>) comparator1);
		fibonacciHeap1.add(fibonacciHeap0, fibonacciHeap2);
		fibonacciHeap1.add("5", fibonacciHeap2);
		fibonacciHeap1.forEach(consumer0);
		assertEquals(2, fibonacciHeap1.size());
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap78()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Object, FibonacciHeap<Object, Object>> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super FibonacciHeap<Object, Object>>) comparator0);
		FibonacciHeap<Object, Object> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
		fibonacciHeap0.add("bi)n&vL", fibonacciHeap1);
		assertEquals(1, fibonacciHeap0.size());

		fibonacciHeap0.pollOption();
		assertEquals(0, fibonacciHeap0.size());
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap79()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Object, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
		fibonacciHeap0.pollOption();
		assertEquals(0, fibonacciHeap0.size());
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap80()  throws Throwable  {
		FibonacciHeap<Integer, Integer> fibonacciHeap0 = FibonacciHeap.create();
		boolean boolean0 = fibonacciHeap0.isEmpty();
		assertEquals(0, fibonacciHeap0.size());
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap81()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<FibonacciHeap<Object, Object>, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
		Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<Object, Object> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super Object>) comparator1);
		Object object0 = new Object();
		fibonacciHeap0.add(fibonacciHeap1, object0);
		boolean boolean0 = fibonacciHeap0.isEmpty();
		assertEquals(1, fibonacciHeap0.size());
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap82()  throws Throwable  {
		FibonacciHeap<FibonacciHeap.Entry, String> fibonacciHeap0 = FibonacciHeap.create();
		int int0 = fibonacciHeap0.size();
		assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap83()  throws Throwable  {
		FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
		fibonacciHeap0.peekOption();
		assertEquals(0, fibonacciHeap0.size());
	}

	@Test(timeout = 4000)
	public void testFibonacciHeap84()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<FibonacciHeap.Entry, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
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
	public void testFibonacciHeap85()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciHeap<String, FibonacciHeap<Object, String>> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super FibonacciHeap<Object, String>>) comparator0);
		fibonacciHeap0.clear();
		assertEquals(0, fibonacciHeap0.size());
	}

	@Test(timeout = 4000)
	public void testFibonacciQueue86()  throws Throwable  {
		FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
		int int0 = fibonacciQueue0.size();
		assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testFibonacciQueue87()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super String>) comparator0);
		fibonacciQueue0.offer("");
		int int0 = fibonacciQueue0.size();
		assertEquals(1, int0);
	}

	@Test(timeout = 4000)
	public void testFibonacciQueue88()  throws Throwable  {
		FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
		String string0 = fibonacciQueue0.poll();
		assertNull(string0);
	}

	@Test(timeout = 4000)
	public void testFibonacciQueue89()  throws Throwable  {
		FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
		fibonacciQueue0.offer("com.google.common.collect.NullsFirstOrdering");
		String string0 = fibonacciQueue0.poll();
		assertFalse(fibonacciQueue0.contains(string0));
	}

	@Test(timeout = 4000)
	public void testFibonacciQueue90()  throws Throwable  {
		// Undeclared exception!
		try {
			FibonacciQueue.create((Comparator<? super String>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void testFibonacciQueue91()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super String>) comparator0);
		fibonacciQueue0.offer("net.mooctest.FibonacciQueue$1");
		String string0 = fibonacciQueue0.peek();
		assertEquals("net.mooctest.FibonacciQueue$1", string0);
	}

	@Test(timeout = 4000)
	public void testFibonacciQueue92()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
		Object object0 = fibonacciQueue0.peek();
		assertNull(object0);
	}

	@Test(timeout = 4000)
	public void testFibonacciQueue93()  throws Throwable  {
		FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
		fibonacciQueue0.add("net.mooctest.FibonacciQueue$1");
		Object[] objectArray0 = fibonacciQueue0.toArray();
		assertEquals(1, objectArray0.length);
	}

	@Test(timeout = 4000)
	public void testFibonacciQueue94()  throws Throwable  {
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
	public void testFibonacciQueue95()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
		Comparator<? super Object> comparator1 = fibonacciQueue0.comparator();
		assertNotNull(comparator1);
	}

	@Test(timeout = 4000)
	public void testFibonacciQueue96()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		FibonacciQueue<FibonacciHeap.Entry> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super FibonacciHeap.Entry>) comparator0);
		Iterator<FibonacciHeap.Entry> iterator0 = fibonacciQueue0.iterator();
		assertNotNull(iterator0);
	}

	@Test(timeout = 4000)
	public void testKBestArborescences97()  throws Throwable  {
		Edge<Weighted<String>> edge0 = (Edge<Weighted<String>>) mock(Edge.class, new ViolatedAssumptionAnswer());
		Arborescence<Weighted<String>> arborescence0 = Arborescence.empty();
		Weighted<Arborescence<Weighted<String>>> weighted0 = new Weighted<Arborescence<Weighted<String>>>(arborescence0, 1729.1942871);
		TreeSet<Edge<Weighted<String>>> treeSet0 = new TreeSet<Edge<Weighted<String>>>();
		HashSet<Edge<Weighted<String>>> hashSet0 = new HashSet<Edge<Weighted<String>>>();
		KBestArborescences.SubsetOfSolutions<Weighted<String>> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Weighted<String>>(edge0, weighted0, treeSet0, hashSet0);
	}

	@Test(timeout = 4000)
	public void testKBestArborescences98()  throws Throwable  {
		Vector<Weighted<Edge<Object>>> vector0 = new Vector<Weighted<Edge<Object>>>();
		SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) vector0);
		LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
		LinkedHashSet<Edge<Object>> linkedHashSet1 = new LinkedHashSet<Edge<Object>>();
		Arborescence<Object> arborescence0 = Arborescence.empty();
		Weighted<Arborescence<Object>> weighted0 = new Weighted<Arborescence<Object>>(arborescence0, (-3173.656710164277));
		Optional<Weighted<KBestArborescences.SubsetOfSolutions<Object>>> optional0 = KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Object>) sparseWeightedGraph0, (Set<Edge<Object>>) linkedHashSet0, (Set<Edge<Object>>) linkedHashSet1, weighted0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void testKBestArborescences99()  throws Throwable  {
		Edge<Arborescence<Integer>> edge0 = (Edge<Arborescence<Integer>>) mock(Edge.class, new ViolatedAssumptionAnswer());
		ExclusiveEdge<Arborescence<Integer>> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
		// Undeclared exception!
		try {
			KBestArborescences.seek(exclusiveEdge0, (Arborescence<Arborescence<Integer>>) null, (EdgeQueueMap.EdgeQueue<Arborescence<Integer>>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.KBestArborescences", e);
		}
	}

	@Test(timeout = 4000)
	public void testKBestArborescences100()  throws Throwable  {
		HashSet<Edge<Edge<String>>> hashSet0 = new HashSet<Edge<Edge<String>>>();
		Arborescence<Edge<String>> arborescence0 = Arborescence.empty();
		Weighted<Arborescence<Edge<String>>> weighted0 = Weighted.weighted(arborescence0, 0.0);
		// Undeclared exception!
		try {
			KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Edge<String>>) null, (Set<Edge<Edge<String>>>) hashSet0, (Set<Edge<Edge<String>>>) hashSet0, weighted0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.KBestArborescences", e);
		}
	}

	@Test(timeout = 4000)
	public void testKBestArborescences101()  throws Throwable  {
		double[][] doubleArray0 = new double[2][8];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		TreeSet<Edge<Integer>> treeSet0 = new TreeSet<Edge<Integer>>();
		Arborescence<Integer> arborescence0 = Arborescence.empty();
		Weighted<Arborescence<Integer>> weighted0 = Weighted.weighted(arborescence0, (-1312.0));
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
	public void testKBestArborescences102()  throws Throwable  {
		double[][] doubleArray0 = new double[4][1];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>(5760, 5760);
		Arborescence<Integer> arborescence0 = Arborescence.empty();
		Weighted<Arborescence<Integer>> weighted0 = new Weighted<Arborescence<Integer>>(arborescence0, 0.0);
		// Undeclared exception!
		try {
			KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) linkedHashSet0, (Set<Edge<Integer>>) linkedHashSet0, weighted0);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 1
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void testKBestArborescences103()  throws Throwable  {
		Double double0 = Double.valueOf(0.0);
		// Undeclared exception!
		try {
			KBestArborescences.getKBestArborescences((WeightedGraph<Double>) null, double0, 0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.KBestArborescences", e);
		}
	}

	@Test(timeout = 4000)
	public void testKBestArborescences104()  throws Throwable  {
		double[][] doubleArray0 = new double[9][3];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(8233);
		// Undeclared exception!
		try {
			KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 8233);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 3
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void testKBestArborescences105()  throws Throwable  {
		Edge<Locale.Category> edge0 = (Edge<Locale.Category>) mock(Edge.class, new ViolatedAssumptionAnswer());
		ArrayList<Edge<Locale.Category>> arrayList0 = new ArrayList<Edge<Locale.Category>>();
		ExclusiveEdge<Locale.Category> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<Locale.Category>>) arrayList0, 4050.0);
		Arborescence<Locale.Category> arborescence0 = Arborescence.empty();
		Locale.Category locale_Category0 = Locale.Category.FORMAT;
		EnumSet<Locale.Category> enumSet0 = EnumSet.of(locale_Category0, locale_Category0, locale_Category0, locale_Category0);
		Partition<Locale.Category> partition0 = Partition.singletons((Collection<Locale.Category>) enumSet0);
		EdgeQueueMap.EdgeQueue<Locale.Category> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(locale_Category0, partition0);
		Optional<ExclusiveEdge<Locale.Category>> optional0 = KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<Locale.Category>) edgeQueueMap_EdgeQueue0);
		assertNotNull(optional0);
	}

	@Test(timeout = 4000)
	public void testKBestArborescences106()  throws Throwable  {
		PriorityQueue<EdgeQueueMap.EdgeQueue<Locale.Category>> priorityQueue0 = new PriorityQueue<EdgeQueueMap.EdgeQueue<Locale.Category>>();
		double[][] doubleArray0 = new double[1][2];
		Locale.Category locale_Category0 = Locale.Category.DISPLAY;
		ArrayDeque<Locale.Category> arrayDeque0 = new ArrayDeque<Locale.Category>();
		Partition<Locale.Category> partition0 = Partition.singletons((Collection<Locale.Category>) arrayDeque0);
		EdgeQueueMap.EdgeQueue<Locale.Category> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(locale_Category0, partition0);
		priorityQueue0.add(edgeQueueMap_EdgeQueue0);
		DenseWeightedGraph<EdgeQueueMap.EdgeQueue<Locale.Category>> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<EdgeQueueMap.EdgeQueue<Locale.Category>>) priorityQueue0, doubleArray0);
		List<Weighted<Arborescence<EdgeQueueMap.EdgeQueue<Locale.Category>>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<EdgeQueueMap.EdgeQueue<Locale.Category>>) denseWeightedGraph0, (EdgeQueueMap.EdgeQueue<Locale.Category>) edgeQueueMap_EdgeQueue0, 1360);
		assertFalse(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testKBestArborescences107()  throws Throwable  {
		Vector<ExclusiveEdge<Object>> vector0 = new Vector<ExclusiveEdge<Object>>();
		PriorityQueue<Weighted<Edge<ExclusiveEdge<Object>>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<ExclusiveEdge<Object>>>>();
		SparseWeightedGraph<ExclusiveEdge<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<ExclusiveEdge<Object>>) vector0, (Iterable<Weighted<Edge<ExclusiveEdge<Object>>>>) priorityQueue0);
		Edge<Object> edge0 = new Edge<Object>(sparseWeightedGraph0, priorityQueue0);
		ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<Object>>) null, (double) 1231);
		List<Weighted<Arborescence<ExclusiveEdge<Object>>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<ExclusiveEdge<Object>>) sparseWeightedGraph0, exclusiveEdge0, 1);
		assertFalse(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testKBestArborescences108()  throws Throwable  {
		TreeSet<Weighted<Edge<KBestArborescences>>> treeSet0 = new TreeSet<Weighted<Edge<KBestArborescences>>>();
		SparseWeightedGraph<KBestArborescences> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<KBestArborescences>>>) treeSet0);
		KBestArborescences kBestArborescences0 = new KBestArborescences();
		List<Weighted<Arborescence<KBestArborescences>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<KBestArborescences>) sparseWeightedGraph0, kBestArborescences0, (-1163));
		assertTrue(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testKBestArborescences109()  throws Throwable  {
		ArrayDeque<Weighted<Edge<Locale.Category>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Locale.Category>>>();
		SparseWeightedGraph<Locale.Category> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Locale.Category>>>) arrayDeque0);
		Locale.Category locale_Category0 = Locale.Category.DISPLAY;
		List<Weighted<Arborescence<Locale.Category>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Locale.Category>) sparseWeightedGraph0, locale_Category0, 2);
		assertEquals(1, list0.size());
	}

	@Test(timeout = 4000)
	public void testPair110()  throws Throwable  {
		Pair<Object, String> pair0 = Pair.of((Object) null, "");
		String string0 = pair0.toString();
		assertEquals("Pair{first=null, second=}", string0);
	}

	@Test(timeout = 4000)
	public void testPair111()  throws Throwable  {
		Object object0 = new Object();
		Object object1 = new Object();
		Pair<Object, Object> pair0 = new Pair<Object, Object>(object0, object1);
		pair0.hashCode();
	}

	@Test(timeout = 4000)
	public void testPair112()  throws Throwable  {
		Pair<Object, String> pair0 = Pair.of((Object) null, "");
		boolean boolean0 = pair0.equals("");
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testPair113()  throws Throwable  {
		Pair<String, Object> pair0 = new Pair<String, Object>("4V", "4V");
		Pair<String, String> pair1 = new Pair<String, String>("4V", "4V");
		boolean boolean0 = pair1.equals(pair0);
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testPair114()  throws Throwable  {
		Pair<String, Object> pair0 = new Pair<String, Object>("4V", "4V");
		Pair<String, Pair<String, Object>> pair1 = new Pair<String, Pair<String, Object>>("4V", pair0);
		boolean boolean0 = pair1.equals(pair0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testPair115()  throws Throwable  {
		Pair<String, String> pair0 = Pair.of("!p^Y>`Q/", "!p^Y>`Q/");
		Pair<String, Object> pair1 = new Pair<String, Object>("G87m?6", "G87m?6");
		boolean boolean0 = pair0.equals(pair1);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testPartition116()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("");
		linkedList0.offerFirst("gcRd,0a$D9DE");
		linkedList0.add("E");
		linkedList0.add(",U3C-gt,dh[1R+z*Z<");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		partition0.merge(",U3C-gt,dh[1R+z*Z<", "");
		partition0.merge("gcRd,0a$D9DE", "E");
		String string0 = partition0.merge("gcRd,0a$D9DE", "");
		assertEquals("gcRd,0a$D9DE", string0);
	}

	@Test(timeout = 4000)
	public void testPartition117()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("");
		linkedList0.offerFirst("gcRd,0a$D9DE");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.merge("", "gcRd,0a$D9DE");
		assertEquals("", string0);

		String string1 = partition0.merge("gcRd,0a$D9DE", "");
		assertEquals("", string1);
	}

	@Test(timeout = 4000)
	public void testPartition118()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("");
		linkedList0.offerFirst("gcRd,0a$D9DE");
		linkedList0.add(")");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.merge("", "gcRd,0a$D9DE");
		assertEquals("", string0);

		String string1 = partition0.merge("gcRd,0a$D9DE", ")");
		assertEquals("", string1);
	}

	@Test(timeout = 4000)
	public void testPartition119()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("");
		List<String> list0 = linkedList0.subList(1, 1);
		linkedList0.add("E");
		// Undeclared exception!
		try {
			Partition.singletons((Collection<String>) list0);
			fail("Expecting exception: ConcurrentModificationException");

		} catch(ConcurrentModificationException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("java.util.SubList", e);
		}
	}

	@Test(timeout = 4000)
	public void testPartition120()  throws Throwable  {
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
	public void testPartition121()  throws Throwable  {
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
	public void testPartition122()  throws Throwable  {
		LinkedList<Object> linkedList0 = new LinkedList<Object>();
		Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
		// Undeclared exception!
		try {
			partition0.sameComponent(linkedList0, linkedList0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 4000)
	public void testPartition123()  throws Throwable  {
		LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
		Integer integer0 = new Integer(652);
		Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) linkedList0);
		// Undeclared exception!
		try {
			partition0.merge(integer0, integer0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 4000)
	public void testPartition124()  throws Throwable  {
		Integer integer0 = new Integer(652);
		LinkedList<Object> linkedList0 = new LinkedList<Object>();
		Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
		// Undeclared exception!
		try {
			partition0.componentOf(integer0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 4000)
	public void testPartition125()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.offerFirst("");
		linkedList0.add("t");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.merge("", "t");
		assertEquals("", string0);

		String string1 = partition0.componentOf("t");
		assertEquals("", string1);
	}

	@Test(timeout = 4000)
	public void testPartition126()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.offerFirst("");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.componentOf("");
		assertEquals("", string0);
	}

	@Test(timeout = 4000)
	public void testPartition127()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("net.mooctest.Partition");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		boolean boolean0 = partition0.sameComponent("net.mooctest.Partition", "net.mooctest.Partition");
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testPartition128()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.offerFirst("gcRd,|0a$D9DE");
		linkedList0.add("6h");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		boolean boolean0 = partition0.sameComponent("6h", "gcRd,|0a$D9DE");
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testPartition129()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		linkedList0.add("");
		linkedList0.offerFirst("gcRd,|0a$D9DE");
		linkedList0.add("6h");
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		String string0 = partition0.merge("6h", "");
		assertEquals("6h", string0);

		String string1 = partition0.merge("gcRd,|0a$D9DE", "");
		assertEquals("6h", string1);
	}

	@Test(timeout = 4000)
	public void testPartition130()  throws Throwable  {
		LinkedList<String> linkedList0 = new LinkedList<String>();
		Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
		Set<String> set0 = partition0.getNodes();
		assertEquals(0, set0.size());
	}

	@Test(timeout = 4000)
	public void testSparseWeightedGraph131()  throws Throwable  {
		Stack<Weighted<Edge<Weighted<Object>>>> stack0 = new Stack<Weighted<Edge<Weighted<Object>>>>();
		Edge<String> edge0 = new Edge<String>("f.c)CH';w!J6/ol", (String) null);
		Weighted<Object> weighted0 = new Weighted<Object>(edge0, 22.60944055);
		Edge<Weighted<Object>> edge1 = new Edge<Weighted<Object>>(weighted0, weighted0);
		Weighted<Edge<Weighted<Object>>> weighted1 = Weighted.weighted(edge1, 22.60944055);
		stack0.add(weighted1);
		SparseWeightedGraph<Weighted<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Weighted<Object>>>>) stack0);
		double double0 = sparseWeightedGraph0.getWeightOf(weighted0, weighted0);
		assertEquals(22.60944055, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testSparseWeightedGraph132()  throws Throwable  {
		Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
		PriorityQueue<Weighted<Edge<Integer>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Integer>>>(comparator0);
		// Undeclared exception!
		try {
			SparseWeightedGraph.from((Iterable<Integer>) null, (Iterable<Weighted<Edge<Integer>>>) priorityQueue0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.collect.ImmutableSet", e);
		}
	}

	@Test(timeout = 4000)
	public void testSparseWeightedGraph133()  throws Throwable  {
		LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
		linkedHashSet0.add((Integer) null);
		LinkedList<Weighted<Edge<Integer>>> linkedList0 = new LinkedList<Weighted<Edge<Integer>>>();
		// Undeclared exception!
		try {
			SparseWeightedGraph.from((Iterable<Integer>) linkedHashSet0, (Iterable<Weighted<Edge<Integer>>>) linkedList0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void testSparseWeightedGraph134()  throws Throwable  {
		HashSet<Weighted<Edge<Object>>> hashSet0 = new HashSet<Weighted<Edge<Object>>>();
		Integer integer0 = new Integer(2157);
		Edge<Object> edge0 = new Edge<Object>(hashSet0, integer0);
		Weighted<Edge<Object>> weighted0 = new Weighted<Edge<Object>>(edge0, 2157);
		hashSet0.add(weighted0);
		// Undeclared exception!
		try {
			SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) hashSet0);
			fail("Expecting exception: StackOverflowError");

		} catch(StackOverflowError e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 4000)
	public void testSparseWeightedGraph135()  throws Throwable  {
		// Undeclared exception!
		try {
			SparseWeightedGraph.from((Iterable<Weighted<Edge<Weighted<Object>>>>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.SparseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void testSparseWeightedGraph136()  throws Throwable  {
		PriorityQueue<Weighted<Edge<String>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<String>>>();
		Edge<String> edge0 = new Edge<String>(";-z", (String) null);
		Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, (-1198.2045603));
		priorityQueue0.add(weighted0);
		// Undeclared exception!
		try {
			SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) priorityQueue0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// at index 0
			//
			verifyException("com.google.common.collect.ObjectArrays", e);
		}
	}

	@Test(timeout = 4000)
	public void testSparseWeightedGraph137()  throws Throwable  {
		TreeSet<Weighted<Edge<String>>> treeSet0 = new TreeSet<Weighted<Edge<String>>>();
		Edge<String> edge0 = new Edge<String>("", "");
		Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, (-1.0));
		treeSet0.add(weighted0);
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) treeSet0);
		Collection<Weighted<Edge<String>>> collection0 = sparseWeightedGraph0.getIncomingEdges("");
		assertTrue(collection0.contains(weighted0));
	}

	@Test(timeout = 4000)
	public void testSparseWeightedGraph138()  throws Throwable  {
		LinkedHashSet<Weighted<Integer>> linkedHashSet0 = new LinkedHashSet<Weighted<Integer>>(65548);
		Integer integer0 = new Integer((-1110));
		Weighted<Integer> weighted0 = Weighted.weighted(integer0, (double) 65548);
		PriorityQueue<Weighted<Edge<Weighted<Integer>>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Weighted<Integer>>>>();
		SparseWeightedGraph<Weighted<Integer>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Integer>>) linkedHashSet0, (Iterable<Weighted<Edge<Weighted<Integer>>>>) priorityQueue0);
		Collection<Weighted<Edge<Weighted<Integer>>>> collection0 = sparseWeightedGraph0.getIncomingEdges(weighted0);
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void testSparseWeightedGraph139()  throws Throwable  {
		Stack<Weighted<Edge<Weighted<Object>>>> stack0 = new Stack<Weighted<Edge<Weighted<Object>>>>();
		Edge<String> edge0 = new Edge<String>("f.c)CH';w!J6/ol", (String) null);
		Weighted<Object> weighted0 = new Weighted<Object>(edge0, Double.NEGATIVE_INFINITY);
		Edge<Weighted<Object>> edge1 = new Edge<Weighted<Object>>(weighted0, weighted0);
		Weighted<Edge<Weighted<Object>>> weighted1 = Weighted.weighted(edge1, Double.NEGATIVE_INFINITY);
		stack0.add(weighted1);
		SparseWeightedGraph<Weighted<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Weighted<Object>>>>) stack0);
		double double0 = sparseWeightedGraph0.getWeightOf(weighted0, weighted0);
		assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testSparseWeightedGraph140()  throws Throwable  {
		ArrayDeque<Weighted<Edge<Weighted<Locale.FilteringMode>>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Weighted<Locale.FilteringMode>>>>();
		LinkedHashSet<Weighted<Edge<Object>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<Object>>>();
		SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) linkedHashSet0);
		double double0 = sparseWeightedGraph0.getWeightOf((Object) null, arrayDeque0);
		assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testSparseWeightedGraph141()  throws Throwable  {
		LinkedHashSet<Weighted<Edge<Integer>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<Integer>>>();
		Integer integer0 = new Integer(3);
		Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
		Weighted<Edge<Integer>> weighted0 = new Weighted<Edge<Integer>>(edge0, 0.0);
		linkedHashSet0.add(weighted0);
		Weighted<Edge<Integer>> weighted1 = Weighted.weighted(edge0, (-1.0));
		linkedHashSet0.add(weighted1);
		SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Integer>>>) linkedHashSet0);
		Collection<Integer> collection0 = sparseWeightedGraph0.getNodes();
		SparseWeightedGraph.from((Iterable<Integer>) collection0, (Iterable<Weighted<Edge<Integer>>>) linkedHashSet0);
		assertTrue(collection0.contains(3));
	}

	@Test(timeout = 4000)
	public void testWeightedGraph142()  throws Throwable  {
		double[][] doubleArray0 = new double[5][1];
		double[] doubleArray1 = new double[6];
		doubleArray0[2] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(2);
		double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
		assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testWeightedGraph143()  throws Throwable  {
		double[][] doubleArray0 = new double[5][4];
		double[] doubleArray1 = new double[7];
		doubleArray1[0] = 1.0;
		doubleArray0[0] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(0);
		double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
		assertEquals(1.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testWeightedGraph144()  throws Throwable  {
		ArrayDeque<Weighted<Edge<Object>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Object>>>();
		SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) arrayDeque0);
		double double0 = sparseWeightedGraph0.getWeightOf(arrayDeque0, (Object) null);
		assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testWeightedGraph145()  throws Throwable  {
		ArrayDeque<Edge<Object>> arrayDeque0 = new ArrayDeque<Edge<Object>>();
		Vector<Weighted<Edge<Edge<Object>>>> vector0 = new Vector<Weighted<Edge<Edge<Object>>>>(1, 0);
		SparseWeightedGraph<Edge<Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Edge<Object>>) arrayDeque0, (Iterable<Weighted<Edge<Edge<Object>>>>) vector0);
		Collection<Edge<Object>> collection0 = sparseWeightedGraph0.getNodes();
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void testWeightedGraph146()  throws Throwable  {
		ArrayDeque<Weighted<Edge<Object>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Object>>>();
		SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) arrayDeque0);
		Collection<Weighted<Edge<Object>>> collection0 = sparseWeightedGraph0.getIncomingEdges((Object) null);
		assertNotNull(collection0);
	}

	@Test(timeout = 4000)
	public void testWeightedGraph147()  throws Throwable  {
		double[][] doubleArray0 = new double[5][1];
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		Integer integer0 = new Integer(2);
		// Undeclared exception!
		try {
			denseWeightedGraph0.getWeightOf(integer0, integer0);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 2
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void testWeightedGraph148()  throws Throwable  {
		double[][] doubleArray0 = new double[6][8];
		double[] doubleArray1 = new double[0];
		doubleArray0[1] = doubleArray1;
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
	public void testWeightedGraph149()  throws Throwable  {
		double[][] doubleArray0 = new double[3][1];
		double[] doubleArray1 = new double[0];
		doubleArray0[1] = doubleArray1;
		DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
		// Undeclared exception!
		try {
			denseWeightedGraph0.filterEdges((Predicate<Edge<Integer>>) null);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch(ArrayIndexOutOfBoundsException e) {
			//
			// 0
			//
			verifyException("net.mooctest.DenseWeightedGraph", e);
		}
	}

	@Test(timeout = 4000)
	public void testWeightedGraph150()  throws Throwable  {
		TreeSet<String> treeSet0 = new TreeSet<String>();
		treeSet0.add("net.mooctest.WightedGrp");
		ArrayList<Weighted<Edge<String>>> arrayList0 = new ArrayList<Weighted<Edge<String>>>();
		Edge<String> edge0 = new Edge<String>("net.mooctest.WightedGrp", "net.mooctest.WightedGrp");
		Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, 8172);
		arrayList0.add(weighted0);
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) treeSet0, (Iterable<Weighted<Edge<String>>>) arrayList0);
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
	public void testWeightedGraph151()  throws Throwable  {
		TreeSet<String> treeSet0 = new TreeSet<String>();
		treeSet0.add("!%/RM=Y|");
		ArrayList<Weighted<Edge<String>>> arrayList0 = new ArrayList<Weighted<Edge<String>>>();
		SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) treeSet0, (Iterable<Weighted<Edge<String>>>) arrayList0);
		WeightedGraph<String> weightedGraph0 = sparseWeightedGraph0.filterEdges((Predicate<Edge<String>>) null);
		assertNotNull(weightedGraph0);
	}

	@Test(timeout = 4000)
	public void testWeighted152()  throws Throwable  {
		Integer integer0 = new Integer(0);
		Weighted<Integer> weighted0 = Weighted.weighted(integer0, (-1.0));
		Weighted<Integer> weighted1 = Weighted.weighted(integer0, 1.0);
		int int0 = weighted0.compareTo(weighted1);
		assertEquals(1, int0);
	}

	@Test(timeout = 4000)
	public void testWeighted153()  throws Throwable  {
		Object object0 = new Object();
		Weighted<Object> weighted0 = Weighted.weighted(object0, (-842.1731086));
		Weighted<Object> weighted1 = Weighted.weighted((Object) weighted0, (-842.1731086));
		int int0 = weighted0.compareTo(weighted1);
		assertEquals((-842.1731086), weighted1.weight, 0.01);
		assertEquals((-1), int0);
	}

	@Test(timeout = 4000)
	public void testWeighted154()  throws Throwable  {
		// Undeclared exception!
		try {
			Weighted.weighted((String) null, 2360.7);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void testWeighted155()  throws Throwable  {
		Integer integer0 = new Integer(0);
		Weighted<Integer> weighted0 = Weighted.weighted(integer0, (-1.0));
		// Undeclared exception!
		try {
			weighted0.compareTo((Weighted<Integer>) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("net.mooctest.Weighted", e);
		}
	}

	@Test(timeout = 4000)
	public void testWeighted156()  throws Throwable  {
		Weighted<Object> weighted0 = null;
		try {
			weighted0 = new Weighted<Object>((Object) null, (-1515.0));
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			verifyException("com.google.common.base.Preconditions", e);
		}
	}

	@Test(timeout = 4000)
	public void testWeighted157()  throws Throwable  {
		Weighted<String> weighted0 = new Weighted<String>("?'%)eAE]l}\"Ip", 39.28126372565499);
		boolean boolean0 = weighted0.equals(weighted0);
		assertEquals(39.28126372565499, weighted0.weight, 0.01);
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testWeighted158()  throws Throwable  {
		Weighted<String> weighted0 = new Weighted<String>("val", 1.0);
		Weighted<Weighted<String>> weighted1 = Weighted.weighted(weighted0, 1.0);
		boolean boolean0 = weighted1.equals("val");
		assertEquals(1.0, weighted1.weight, 0.01);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testWeighted159()  throws Throwable  {
		Weighted<String> weighted0 = new Weighted<String>("val", 1.0);
		Weighted<Weighted<String>> weighted1 = Weighted.weighted(weighted0, 1.0);
		boolean boolean0 = weighted0.equals(weighted1);
		assertFalse(boolean0);
		assertEquals(1.0, weighted1.weight, 0.01);
	}

	@Test(timeout = 4000)
	public void testWeighted160()  throws Throwable  {
		Weighted<Object> weighted0 = new Weighted<Object>("val", 1.0);
		String string0 = weighted0.toString();
		assertEquals("Weighted{val=val, weight=1.0}", string0);
	}

	@Test(timeout = 4000)
	public void testWeighted161()  throws Throwable  {
		Integer integer0 = new Integer((-134));
		Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, (-13.427389827294544));
		weighted0.hashCode();
		assertEquals((-13.427389827294544), weighted0.weight, 0.01);
	}

	@Test(timeout = 4000)
	public void testWeighted162()  throws Throwable  {
		Integer integer0 = new Integer((-134));
		Weighted<Object> weighted0 = Weighted.weighted((Object) integer0, (double) (-134));
		Weighted<Integer> weighted1 = new Weighted<Integer>(integer0, (-13.427389827294544));
		boolean boolean0 = weighted0.equals(weighted1);
		assertFalse(boolean0);
		assertEquals((-134.0), weighted0.weight, 0.01);
	}

	@Test(timeout = 4000)
	public void testWeighted163()  throws Throwable  {
		Integer integer0 = new Integer((-134));
		Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, (-13.427389827294544));
		int int0 = weighted0.compareTo(weighted0);
		assertEquals(0, int0);
		assertEquals((-13.427389827294544), weighted0.weight, 0.01);
	}

}


