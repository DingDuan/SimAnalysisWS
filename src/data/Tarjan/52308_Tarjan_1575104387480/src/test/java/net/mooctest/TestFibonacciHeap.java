package net.mooctest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

import org.junit.Test;


public class TestFibonacciHeap {

	@Test
	public void test(){
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		com.google.common.base.Optional<FibonacciHeap<Integer, Integer>.Entry> entry0 = heap.add(1, 3);
		com.google.common.base.Optional<FibonacciHeap<Integer, Integer>.Entry> entry1 =heap.add(3, 5);
		com.google.common.base.Optional<FibonacciHeap<Integer, Integer>.Entry> entry2=heap.add(5, 3);
	
		com.google.common.base.Optional<FibonacciHeap<Integer, Integer>.Entry> entry3=heap.add(5, 7);
		com.google.common.base.Optional<FibonacciHeap<Integer, Integer>.Entry> entry4 = heap.add(7, 6);
		com.google.common.base.Optional<FibonacciHeap<Integer, Integer>.Entry> entry5 = heap.add(7, 9);
		com.google.common.base.Optional<FibonacciHeap<Integer, Integer>.Entry> entry6 = heap.add(8, 9);
		com.google.common.base.Optional<FibonacciHeap<Integer, Integer>.Entry> entry7 = heap.add(9, 1);
		com.google.common.base.Optional<FibonacciHeap<Integer, Integer>.Entry> entry8 = heap.add(2, 4);
		com.google.common.base.Optional<FibonacciHeap<Integer, Integer>.Entry> entry9 = heap.add(3, 10);
		com.google.common.base.Optional<FibonacciHeap<Integer, Integer>.Entry> entry10 = heap.add(1, 9);
		com.google.common.base.Optional<FibonacciHeap<Integer, Integer>.Entry> entry11 = heap.add(3, 6);
		com.google.common.base.Optional<FibonacciHeap<Integer, Integer>.Entry> entry12 = heap.add(6, 9);
		com.google.common.base.Optional<FibonacciHeap<Integer, Integer>.Entry> entry13 = heap.add(8, 2);
		
		//heap.decreasePriority(entry0, new Integer(1));
		 	     
	      
	}
	
	
	


  @Test(timeout = 4000)
  public void demo01()  throws Throwable  {
      // Undeclared exception!
      try { 
        FibonacciHeap.merge((FibonacciHeap<Integer, Integer>) null, (FibonacciHeap<Integer, Integer>) null);

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
    	  assertEquals(null, e.getMessage());
      }
  }


  @Test(timeout = 4000)
  public void demo02()  throws Throwable  {
      // Undeclared exception!
      try { 
        FibonacciHeap.create((Comparator<? super Object>) null);

      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
    	  assertEquals(null, e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void demo03()  throws Throwable  {
      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
      // Undeclared exception!
      try { 
        fibonacciHeap0.add((String) null, "");

      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
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
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) null, (Set<Edge<String>>) hashSet0, (Set<Edge<String>>) hashSet0);

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
    	  assertEquals(null, e.getMessage());
      }
  }



  @Test(timeout = 4000)
  public void demo10()  throws Throwable  {
      double[][] doubleArray0 = new double[6][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) linkedHashSet0, (Set<Edge<Integer>>) linkedHashSet0);

      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
    	  assertEquals("1", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void demo11()  throws Throwable  {
      double[][] doubleArray0 = new double[4][1];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, integer0);

      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertEquals("1", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void demo12()  throws Throwable  {
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) null);

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
    	  assertEquals(null, e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void demo13()  throws Throwable  {
      double[][] doubleArray0 = new double[8][5];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0);

      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
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
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);

      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
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
	  Pair<Integer ,Integer > pa = new Pair<Integer,Integer>(1,3);
	  assertEquals(false, pa.equals(null));
	  assertEquals(false, pa.equals(395));
	  Pair<Integer ,Integer > pa1 = new Pair<Integer,Integer>(1,3);
	  assertEquals(true, pa.equals(pa1));
	  assertEquals(995, pa.hashCode());
	  assertEquals("Pair{first=1, second=3}",pa.toString());
  }

  @Test(timeout = 4000)
  public void demo26()  throws Throwable  {
	
	  Arborescence<Integer> a =  Arborescence.empty(); 
	  
	  assertEquals("Arborescence{}", a.toString());
	  assertEquals(31, a.hashCode());
	  assertEquals(false, a.equals(null));
	  assertEquals(false, a.equals(11));
	  assertEquals(true, a.equals(a));
	  Arborescence<Integer> b =  Arborescence.empty(); 
	  assertEquals(true, a.equals(b));
  }

  @Test(timeout = 4000)
  public void demo27()  throws Throwable  {
	
	  Weighted<Integer> w = new Weighted<Integer>(1, 2.3);
	  assertEquals(644088800, w.hashCode());
	  assertEquals("Weighted{val=1, weight=2.3}", w.toString());
	  assertEquals(false, w.equals(null));
	  assertEquals(false, w.equals(11));
	  assertEquals(true, w.equals(w));
	  Weighted<Integer> w1 = new Weighted<Integer>(1, 2.3);
	  Weighted<Integer> w2 = new Weighted<Integer>(3, 2.3);
	  assertEquals(true,w1.equals(w1));
	  assertEquals(false,w1.equals(w2));
  }
  
  
  @Test(timeout = 4000)
  public void demo28()  throws Throwable  {
	 
	  Stack<Weighted<Edge<String>>> stack0 = new Stack<Weighted<Edge<String>>>();
      SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) stack0);
      List<Weighted<Arborescence<String>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<String>) sparseWeightedGraph0, "", 0);
      assertEquals(0, list0.size());
      sparseWeightedGraph0.getWeightOf(null, null);
  }

  @Test(timeout = 4000)
  public void demo29()  throws Throwable  {
	 
	  double[][] doubleArray0 = new double[6][1];
      DenseWeightedGraph<Integer> dw = DenseWeightedGraph.from(doubleArray0);
      double b = dw.getWeightOf(1, 0);
      
      assertEquals(0, (int)b);
}
  
  @Test(timeout = 4000)
  public void demo30()  throws Throwable  {
	  ArrayList<Edge<Integer>> ayl = new ArrayList<Edge<Integer>>();
	  Edge<Integer> e1 = new Edge<Integer>(1,2);
	  Edge<Integer> e2 = new Edge<Integer>(1,3);
	  Edge<Integer> e3 = new Edge<Integer>(2,1);
	  ayl.add(e1);
	  ayl.add(e2);
	  ayl.add(e3);
	  
	  


	
}
	
}
	

