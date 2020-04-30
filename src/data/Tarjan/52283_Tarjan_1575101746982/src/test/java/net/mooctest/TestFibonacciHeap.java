	
	package net.mooctest;
	

	import com.google.common.collect.ImmutableBiMap;
	import com.google.common.collect.ImmutableMap;
	import com.google.common.collect.ImmutableSortedMap;
	import static org.junit.Assert.*;
	import static org.junit.Assert.assertFalse;
	import static org.junit.Assert.assertNotSame;
	import static org.junit.Assert.assertTrue;
	import java.util.*;
	
	import java.util.Comparator;
	import java.util.function.Consumer;
	
	import org.junit.Test;
	
	
	
	public class TestFibonacciHeap {
	
	  @Test(timeout = 4000)
	  public void demo01()  throws Throwable  {

	      try { 
	        FibonacciHeap.merge((FibonacciHeap<Integer, Integer>) null, (FibonacciHeap<Integer, Integer>) null);
	      } catch(NullPointerException e) {
	    	  assertEquals(null, e.getMessage());
	      }
	  }
	
	
	  @Test(timeout = 4000)
	  public void demo02()  throws Throwable  {
	      try { 
	        FibonacciHeap.create((Comparator<? super Object>) null);      
	      } catch(NullPointerException e) {
	    	  assertEquals(null, e.getMessage());
	      }
	  }
	
	  @Test(timeout = 4000)
	  public void demo03()  throws Throwable  {
	      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
	      try { 
	        fibonacciHeap0.add((String) null, "");
     
	      } catch(NullPointerException e) {
	    	  assertEquals(null, e.getMessage());
	      }
	  }
	
	  @Test(timeout = 4000)
	  public void demo04()  throws Throwable  {
	      FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      Integer integer0 = new Integer(0);
	      fibonacciHeap0.add("", integer0);
	      fibonacciHeap0.add("", integer0);
	      fibonacciHeap0.spliterator();
	      assertEquals(2, fibonacciHeap0.size());
	  }
	
	 
	  @Test(timeout = 4000)
	  public void demo05()  throws Throwable  {
	      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
	      fibonacciHeap0.pollOption();
	      assertEquals(0, fibonacciHeap0.size());
	  }
	
	  @Test(timeout = 4000)
	  public void demo06()  throws Throwable  {
	      FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      Integer integer0 = new Integer(0);
	      fibonacciHeap0.add("", integer0);
	      boolean boolean0 = fibonacciHeap0.isEmpty();
	      assertEquals(1, fibonacciHeap0.size());
	      assertFalse(boolean0);
	  }
	
	  @Test(timeout = 4000)
	  public void demo07()  throws Throwable  {
	      FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create();
	      fibonacciHeap0.peekOption();
	      assertEquals(0, fibonacciHeap0.size());
	  }
	
	
	  @Test(timeout = 4000)
	  public void demo08()  throws Throwable  {
	      PriorityQueue<Integer> priorityQueue0 = new PriorityQueue<Integer>(1);
	      LinkedHashSet<Weighted<Edge<Integer>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<Integer>>>();
	      SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Integer>) priorityQueue0, (Iterable<Weighted<Edge<Integer>>>) linkedHashSet0);
	      LinkedHashSet<Edge<Integer>> linkedHashSet1 = new LinkedHashSet<Edge<Integer>>();
	      HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>(0, 0.65920657F);
	      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) sparseWeightedGraph0, (Set<Edge<Integer>>) linkedHashSet1, (Set<Edge<Integer>>) hashSet0);
	      assertNotNull(weighted0);
	  }

	  @Test(timeout = 4000)
	  public void demo09()  throws Throwable  {
	      HashSet<Edge<String>> hashSet0 = new HashSet<Edge<String>>();
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) null, (Set<Edge<String>>) hashSet0, (Set<Edge<String>>) hashSet0);
	
	      } catch(NullPointerException e) {
	    	  assertEquals(null, e.getMessage());
	      }
	  }
	  @Test(timeout = 4000)
	  public void demo10()  throws Throwable  {
	      double[][] doubleArray0 = new double[6][1];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) linkedHashSet0, (Set<Edge<Integer>>) linkedHashSet0);
	
	      } catch(ArrayIndexOutOfBoundsException e) {
	    	  assertEquals("1", e.getMessage());
	      }
	  }
	
	  @Test(timeout = 4000)
	  public void demo11()  throws Throwable  {
	      double[][] doubleArray0 = new double[4][1];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, integer0);	
	      } catch(ArrayIndexOutOfBoundsException e) {
	         assertEquals("1", e.getMessage());
	      }
	  }
	
	  @Test(timeout = 4000)
	  public void demo12()  throws Throwable  {
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) null);
	
	      } catch(NullPointerException e) {
	    	  assertEquals(null, e.getMessage());
	      }
	  }
	
	  @Test(timeout = 4000)
	  public void demo13()  throws Throwable  {
	      double[][] doubleArray0 = new double[8][5];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      try { 
	        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
	      } catch(ArrayIndexOutOfBoundsException e) {
	    	  assertEquals("5", e.getMessage());
	      }
	  }
	
	  @Test(timeout = 4000)
	  public void demo14()  throws Throwable  {
	      ArrayDeque<Weighted<Edge<Object>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Object>>>(0);
	      SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) arrayDeque0);
	      ChuLiuEdmonds.PartialSolution<Object> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Object>) sparseWeightedGraph0);
	      Set<Object> set0 = chuLiuEdmonds_PartialSolution0.getNodes();
	      assertFalse(set0.contains(0));
	  }
	
	
	  @Test(timeout = 4000)
	  public void demo15()  throws Throwable  {
	      double[][] doubleArray0 = new double[7][4];
	      double[] doubleArray1 = new double[8];
	      doubleArray1[2] = Double.NEGATIVE_INFINITY;
	      doubleArray0[4] = doubleArray1;
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      try { 
	        ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);
	
	      } catch(ArrayIndexOutOfBoundsException e) {
	    	  assertEquals("4", e.getMessage());
	      }
	  }
	
	  @Test(timeout = 4000)
	  public void demo16()  throws Throwable  {
	      double[][] doubleArray0 = new double[2][8];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Weighted<Arborescence<Integer>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);
	      assertNotNull(weighted0);
	  }

	
	  @Test(timeout = 4000)
	  public void demo17()  throws Throwable  {
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      // Undeclared exception!
	      try { 
	        KBestArborescences.seek((ExclusiveEdge<Integer>) null, arborescence0, (EdgeQueueMap.EdgeQueue<Integer>) null);
	
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assertEquals(null, e.getMessage());
	      }
	  }
	
	  @Test(timeout = 4000)
	  public void demo18()  throws Throwable  {
	      HashSet<Edge<Edge<Object>>> hashSet0 = new HashSet<Edge<Edge<Object>>>();
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Edge<Object>>) null, (Set<Edge<Edge<Object>>>) hashSet0, (Set<Edge<Edge<Object>>>) hashSet0, (Weighted<Arborescence<Edge<Object>>>) null);
	  
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assertEquals(null, e.getMessage());
	      }
	  }
	
	
	
	  @Test(timeout = 4000)
	  public void demo19()  throws Throwable  {
	      double[][] doubleArray0 = new double[8][4];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      // Undeclared exception!
	      try { 
	        KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) linkedHashSet0, (Set<Edge<Integer>>) linkedHashSet0, (Weighted<Arborescence<Integer>>) null);
	
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assertEquals("4", e.getMessage());
	      }
	  }
	
	
	  @Test(timeout = 4000)
	  public void demo20()  throws Throwable  {
	      double[][] doubleArray0 = new double[10][7];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 0);
	
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assertEquals("7", e.getMessage());
	      }
	  }
	
	
	  @Test(timeout = 4000)
	  public void demo21()  throws Throwable  {
	      double[][] doubleArray0 = new double[4][7];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(0);
	      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 2);
	      assertEquals(2, list0.size());
	  }
	
	  @Test(timeout = 4000)
	  public void demo22()  throws Throwable  {
	      double[][] doubleArray0 = new double[2][7];
	      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
	      Integer integer0 = new Integer(2);
	      List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 2);
	      assertFalse(list0.isEmpty());
	  }
	
	  @Test(timeout = 4000)
	  public void demo23()  throws Throwable  {
	      Stack<Weighted<Edge<String>>> stack0 = new Stack<Weighted<Edge<String>>>();
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) stack0);
	      List<Weighted<Arborescence<String>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<String>) sparseWeightedGraph0, "", 0);
	      assertEquals(0, list0.size());
	  }
	
	
	
	  @Test(timeout = 4000)
	  public void demo24()  throws Throwable  {
	      ArrayList<Arborescence<String>> arrayList0 = new ArrayList<Arborescence<String>>(0);
	      double[][] doubleArray0 = new double[1][6];
	      arrayList0.add((Arborescence<String>) null);
	      DenseWeightedGraph<Arborescence<String>> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Arborescence<String>>) arrayList0, doubleArray0);
	      // Undeclared exception!
	      try { 
	        KBestArborescences.getKBestArborescences((WeightedGraph<Arborescence<String>>) denseWeightedGraph0, (Arborescence<String>) null, 0);
	
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assertEquals(null, e.getMessage());
	      }
	  }

	  @Test(timeout = 4000)
	  public void demo25()  throws Throwable  {
	      ImmutableMap<Object, Object> immutableMap0 = ImmutableMap.of();
	      Arborescence<Object> arborescence0 = Arborescence.of(immutableMap0);
	      String string0 = arborescence0.toString();
	      assertEquals("Arborescence{}", string0);
	  }

	  @Test(timeout = 4000)
	  public void demo26()  throws Throwable  {
	      Arborescence<Object> arborescence0 = Arborescence.of((ImmutableMap<Object, Object>) null);
	      // Undeclared exception!
	      try { 
	        arborescence0.toString();

	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assertEquals(null, e.getMessage());
	      }
	  }

	  @Test(timeout = 4000)
	  public void demo27()  throws Throwable  {
	      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("n", "", ",", "", "I", "", "", "");
	      Arborescence<String> arborescence0 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
	      Arborescence<Comparable<String>> arborescence1 = Arborescence.of((ImmutableMap<Comparable<String>, Comparable<String>>) null);
	      // Undeclared exception!
	      try { 
	        arborescence1.equals(arborescence0);

	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assertEquals(null, e.getMessage());
	      }
	  }

	  @Test(timeout = 4000)
	  public void demo28()  throws Throwable  {
	      Arborescence<Object> arborescence0 = Arborescence.empty();
	      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "", "w", "");
	      Arborescence<String> arborescence1 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
	      boolean boolean0 = arborescence1.equals(arborescence0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void demo29()  throws Throwable  {
	      ImmutableMap<Object, Object> immutableMap0 = ImmutableMap.of();
	      Arborescence<Object> arborescence0 = Arborescence.of(immutableMap0);
	      Arborescence<String> arborescence1 = Arborescence.empty();
	      boolean boolean0 = arborescence0.equals(arborescence1);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void demo30()  throws Throwable  {
	      ImmutableMap<Object, Object> immutableMap0 = ImmutableMap.of();
	      Arborescence<Object> arborescence0 = Arborescence.of(immutableMap0);
	      Object object0 = new Object();
	      boolean boolean0 = arborescence0.equals(object0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void demo31()  throws Throwable  {
	      Arborescence<Object> arborescence0 = Arborescence.empty();
	      boolean boolean0 = arborescence0.equals((Object) null);
	      assertFalse(boolean0);
	  }


	  @Test(timeout = 4000)
	  public void demo32()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      ImmutableMap<Integer, Integer> immutableMap0 = ImmutableMap.of(integer0, integer0);
	      Arborescence<Integer> arborescence0 = Arborescence.of(immutableMap0);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
	      boolean boolean0 = arborescence0.contains(edge0);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void demo33()  throws Throwable  {
	      Arborescence<Object> arborescence0 = Arborescence.empty();
	      ImmutableBiMap<Object, Object> immutableBiMap0 = ImmutableBiMap.of((Object) arborescence0, (Object) arborescence0);
	      Arborescence<Object> arborescence1 = Arborescence.of((ImmutableMap<Object, Object>) immutableBiMap0);
	      Edge<Object> edge0 = new Edge<Object>(arborescence1, arborescence0);
	      boolean boolean0 = arborescence1.contains(edge0);
	      assertFalse(boolean0);
	      assertFalse(arborescence1.equals((Object)arborescence0));
	  }

	  @Test(timeout = 4000)
	  public void demo34()  throws Throwable  {
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      Integer integer0 = new Integer(0);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
	      boolean boolean0 = arborescence0.contains(edge0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void demo35()  throws Throwable  {
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      arborescence0.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void demo36()  throws Throwable  {
	      Arborescence<Arborescence<Integer>> arborescence0 = Arborescence.empty();
	      // Undeclared exception!
	      try { 
	        arborescence0.contains((Edge<Arborescence<Integer>>) null);
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assertEquals(null, e.getMessage());
	      }
	  }

	  @Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Integer integer1 = new Integer(0);
	      Pair<Object, Integer> pair0 = Pair.of((Object) integer1, integer0);
	      Pair<Integer, Object> pair1 = Pair.of(integer0, (Object) integer1);
	      boolean boolean0 = pair1.equals(pair0);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test1()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<Integer, String> pair0 = new Pair<Integer, String>(integer0, "");
	      Pair<Object, Integer> pair1 = Pair.of((Object) pair0, integer0);
	      Integer integer1 = new Integer(0);
	      Pair<Integer, Object> pair2 = Pair.of(integer0, (Object) integer1);
	      boolean boolean0 = pair2.equals(pair1);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test2()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<Integer, String> pair0 = new Pair<Integer, String>(integer0, "");
	      Pair<Object, Integer> pair1 = Pair.of((Object) pair0, integer0);
	      boolean boolean0 = pair1.equals("");
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test3()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<Integer, Integer> pair0 = new Pair<Integer, Integer>(integer0, integer0);
	      Pair<Object, Object> pair1 = Pair.of((Object) integer0, (Object) "");
	      boolean boolean0 = pair0.equals(pair1);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test4()  throws Throwable  {
	      Pair<Object, Object> pair0 = Pair.of((Object) "", (Object) "");
	      pair0.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void test5()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<Object, Object> pair0 = Pair.of((Object) integer0, (Object) "");
	      String string0 = pair0.toString();
	      assertEquals("Pair{first=0, second=}", string0);
	  }

	  @Test(timeout = 4000)
	  public void demo37()  throws Throwable  {
	      Weighted<String> weighted0 = Weighted.weighted("", 0.0);
	      Weighted<String> weighted1 = new Weighted<String>("eed{a7^'Xd.,wght82.446909179", 0.0);
	      int int0 = weighted0.compareTo(weighted1);
	      assertEquals(1, int0);
	  }

	  @Test(timeout = 4000)
	  public void demo38()  throws Throwable  {
	      Weighted<String> weighted0 = Weighted.weighted("", 0.0);
	      Weighted<String> weighted1 = new Weighted<String>("l Fod?", 0.0);
	      int int0 = weighted0.compareTo(weighted1);
	      assertEquals((-1), int0);
	  }

	  @Test(timeout = 4000)
	  public void demo39()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        Weighted.weighted((Integer) null, 0.0);

	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assertEquals(null, e.getMessage());
	      }
	  }

	  @Test(timeout = 4000)
	  public void demo40()  throws Throwable  {
	      Object object0 = new Object();
	      Weighted<Object> weighted0 = Weighted.weighted(object0, 0.0);
	      // Undeclared exception!
	      try { 
	        weighted0.compareTo((Weighted<Object>) null);

	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assertEquals(null, e.getMessage());
	      }
	  }

	  @Test(timeout = 4000)
	  public void demo41()  throws Throwable  {
	      Weighted<Object> weighted0 = null;
	      try {
	        weighted0 = new Weighted<Object>((Object) null, 0);

	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	    	  assertEquals(null, e.getMessage());
	      }
	  }

	  @Test(timeout = 4000)
	  public void demo42()  throws Throwable  {
	      Weighted<String> weighted0 = Weighted.weighted("", 0.0);
	      Integer integer0 = new Integer(0);
	      boolean boolean0 = weighted0.equals(integer0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void demo43()  throws Throwable  {
	      Weighted<Object> weighted0 = Weighted.weighted((Object) "", 0.0);
	      Weighted<Weighted<Object>> weighted1 = Weighted.weighted(weighted0, 0.0);
	      weighted1.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void demo44()  throws Throwable  {
	      Weighted<Object> weighted0 = new Weighted<Object>("v", 0.0);
	      Weighted<Object> weighted1 = Weighted.weighted((Object) "v", 0.6622888447135158);
	      boolean boolean0 = weighted0.equals(weighted1);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void demo45()  throws Throwable  {
	      Weighted<String> weighted0 = Weighted.weighted("", 0.0);
	      Weighted<Object> weighted1 = Weighted.weighted((Object) "", 0.0);
	      Weighted<Weighted<Object>> weighted2 = Weighted.weighted(weighted1, 0.0);
	      boolean boolean0 = weighted2.equals(weighted0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void demo46()  throws Throwable  {
	      Weighted<String> weighted0 = Weighted.weighted("", 0.0);
	      Weighted<Object> weighted1 = Weighted.weighted((Object) "", 0.0);
	      boolean boolean0 = weighted1.equals(weighted0);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void demo47()  throws Throwable  {
	      Weighted<String> weighted0 = Weighted.weighted("", 0.0);
	      Weighted<Weighted<String>> weighted1 = new Weighted<Weighted<String>>(weighted0, 0.0);
	      String string0 = weighted1.toString();
	      assertEquals("Weighted{val=Weighted{val=, weight=0.0}, weight=0.0}", string0);
	  }

	  @Test(timeout = 4000)
	  public void demo48()  throws Throwable  {
	      Object object0 = new Object();
	      Weighted<Object> weighted0 = Weighted.weighted(object0, 0.0);
	      Weighted<Weighted<Object>> weighted1 = Weighted.weighted(weighted0, 0.0);
	      int int0 = weighted1.compareTo(weighted1);
	      assertEquals(0, int0);
	  }
	  @Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      ArrayList<Weighted<Edge<String>>> arrayList0 = new ArrayList<Weighted<Edge<String>>>();
	      Edge<String> edge0 = new Edge<String>("LPo", "LPo");
	      Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, 0.7);
	      arrayList0.add(weighted0);
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) arrayList0);
	      double double0 = sparseWeightedGraph0.getWeightOf("LPo", "LPo");
	      assertEquals(0.7, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      HashSet<Object> hashSet0 = new HashSet<Object>();
	      ArrayList<Weighted<Edge<Object>>> arrayList0 = new ArrayList<Weighted<Edge<Object>>>();
	      Integer integer0 = new Integer(0);
	      Edge<Object> edge0 = new Edge<Object>(arrayList0, integer0);
	      Weighted<Edge<Object>> weighted0 = new Weighted<Edge<Object>>(edge0, 0.0);
	      arrayList0.add(weighted0);
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Object>) hashSet0, (Iterable<Weighted<Edge<Object>>>) arrayList0);

	      } catch(StackOverflowError e) {
	    	  assertEquals(null, e.getMessage());
	      }
	  }



	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	      LinkedHashSet<Weighted<Edge<Object>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<Object>>>(0);
	      Weighted<Object> weighted0 = new Weighted<Object>(linkedHashSet0, 0);
	      Edge<Object> edge0 = new Edge<Object>(linkedHashSet0, weighted0);
	      Weighted<Edge<Object>> weighted1 = new Weighted<Edge<Object>>(edge0, 0.0);
	      linkedHashSet0.add(weighted1);
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) linkedHashSet0);

	      } catch(StackOverflowError e) {
	    	  assertEquals(null, e.getMessage());
	      }
	  }

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) null);

	      } catch(NullPointerException e) {

	    	  assertEquals(null, e.getMessage());
	      }
	  }

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      ArrayList<Weighted<Edge<String>>> arrayList0 = new ArrayList<Weighted<Edge<String>>>();
	      Edge<String> edge0 = new Edge<String>("", "LPo");
	      Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, 0.0);
	      arrayList0.add(weighted0);
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) arrayList0);
	      Collection<Weighted<Edge<String>>> collection0 = sparseWeightedGraph0.getIncomingEdges("LPo");
	      assertTrue(collection0.contains(weighted0));
	  }

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {
	      ArrayList<Weighted<Edge<String>>> arrayList0 = new ArrayList<Weighted<Edge<String>>>();
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) arrayList0);
	      Collection<Weighted<Edge<String>>> collection0 = sparseWeightedGraph0.getIncomingEdges("");
	      assertNotNull(collection0);
	  }

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      ArrayList<Weighted<Edge<String>>> arrayList0 = new ArrayList<Weighted<Edge<String>>>();
	      Edge<String> edge0 = new Edge<String>("", "LPo");
	      Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, 0.0);
	      arrayList0.add(weighted0);
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) arrayList0);
	      double double0 = sparseWeightedGraph0.getWeightOf("", "LPo");
	      assertEquals(0.0, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      TreeSet<Weighted<Edge<Integer>>> treeSet0 = new TreeSet<Weighted<Edge<Integer>>>();
	      SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Integer>>>) treeSet0);
	      double double0 = sparseWeightedGraph0.getWeightOf((Integer) null, (Integer) null);
	      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      ArrayDeque<Weighted<Edge<Locale.FilteringMode>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Locale.FilteringMode>>>();
	      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
	      Edge<Locale.FilteringMode> edge0 = new Edge<Locale.FilteringMode>(locale_FilteringMode0, locale_FilteringMode0);
	      Weighted<Edge<Locale.FilteringMode>> weighted0 = Weighted.weighted(edge0, 0.0);
	      arrayDeque0.add(weighted0);
	      arrayDeque0.add(weighted0);
	      // Undeclared exception!
	      try { 
	        SparseWeightedGraph.from((Iterable<Locale.FilteringMode>) null, (Iterable<Weighted<Edge<Locale.FilteringMode>>>) arrayDeque0);

	      } catch(NullPointerException e) {

	    	  assertEquals(null, e.getMessage());
	      }
	  }


	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {
	      LinkedHashSet<Weighted<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<String>>>(0);
	      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) linkedHashSet0);
	      Collection<String> collection0 = sparseWeightedGraph0.getNodes();
	      assertNotNull(collection0);
	  }
	
	}
