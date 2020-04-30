package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableMap;


public class Testall {

	@Test
	public void test() {
		Edge<Integer> edge = new Edge(1,2);
		edge.hashCode();
		edge.toString();
		edge.from(2);
		Edge.EdgeBuilder<Integer> edgebuild;
		
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		
		ImmutableMap<String, String> map1 = ImmutableMap .<String, String>of("1", "2");
		
		ArrayList<Integer> nodes = new ArrayList();
		double[][] weights = new double[][]{};
		DenseWeightedGraph dwg1 = DenseWeightedGraph.from(weights);
		DenseWeightedGraph dwg2 =DenseWeightedGraph.from(nodes, weights);
		dwg1.getIncomingEdges(1);
		dwg1.getNodes();
		dwg1.getWeightOf(1, 2);
		Predicate predicate = null;
		dwg2.filterEdges(predicate);
		dwg2.getIncomingEdges(1);
	
		Weighted<Edge<Integer>> weighted = new Weighted(edge,2);
		Weighted<Edge<Integer>> weighted1 = new Weighted(edge,9);
		weighted.compareTo(weighted);
		assertFalse(weighted.equals(null));
		assertTrue(weighted.equals(weighted));
		assertFalse(weighted.equals(1));
		assertFalse(weighted.equals(weighted1));
		
		ChuLiuEdmonds chu = new ChuLiuEdmonds();
		chu.getMaxArborescence(dwg1);
		chu.getMaxArborescence(dwg2, 1);
		
		FibonacciHeap<Integer,Integer> fi = null;
		fi = fi.create();
		fi.add(1, 2);
		fi.isEmpty();
		fi.iterator();
		fi.peekOption();
		fi.pollOption();
		fi.size();
	}
	
	@Test
	public void Equaltest() {
		Edge<Integer> edge = new Edge(1,2);
		Edge<Integer> edge1 = new Edge(1,3);
		assertFalse(edge.equals(null));
		assertTrue(edge.equals(edge));
		assertFalse(edge.equals(1));
		assertFalse(edge.equals(edge1));
	}
	
	@Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<Object, String> pair0 = Pair.of((Object) integer0, "");
	      Pair<Integer, Object> pair1 = new Pair<Integer, Object>(integer0, integer0);
	      // Undeclared exception!
	      try { 
	        pair1.equals(pair0);
	      
	      } catch(NoClassDefFoundError e) {
	         //
	         // com/google/common/base/Objects
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test1()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<Integer, Object> pair0 = new Pair<Integer, Object>(integer0, "");
	      Pair<Object, String> pair1 = Pair.of((Object) pair0, "");
	      Pair pair2 = (Pair)pair1.first;
	      Pair<Object, Pair<Object, String>> pair3 = new Pair<Object, Pair<Object, String>>(pair2, pair1);
	      // Undeclared exception!
	      try { 
	        pair3.equals(pair0);
	      } catch(NoClassDefFoundError e) {
	         //
	         // com/google/common/base/Objects
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test2()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<Integer, String> pair0 = Pair.of(integer0, "");
	      // Undeclared exception!
	      try { 
	        pair0.hashCode();
	      } catch(NoClassDefFoundError e) {
	         //
	         // com/google/common/base/Objects
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test3()  throws Throwable  {
	      Pair<String, Object> pair0 = Pair.of("", (Object) null);
	      Object object0 = new Object();
	      boolean boolean0 = pair0.equals(object0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test4()  throws Throwable  {
	      Object object0 = new Object();
	      Integer integer0 = new Integer(0);
	      Pair<Object, Integer> pair0 = new Pair<Object, Integer>(object0, integer0);
	      // Undeclared exception!
	        pair0.toString();

	  }
	  
	  @Test(timeout = 4000)
	  public void test5()  throws Throwable  {
	      LinkedList<Object> linkedList0 = new LinkedList<Object>();
	      // Undeclared exception!
	      try { 
	        Partition.singletons((Collection<Object>) linkedList0);
	      
	      } catch(NoClassDefFoundError e) {
	         //
	         // com/google/common/collect/Maps
	         //
	      }
	  }
	  
	  @Test(timeout = 4000)
	  public void test6()  throws Throwable  {
	      LinkedList<Edge<Object>> linkedList0 = new LinkedList<Edge<Object>>();
	      ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of((Edge<Object>) null, (List<Edge<Object>>) linkedList0, 0.0);
	      // Undeclared exception!
	      try { 
	        exclusiveEdge0.compareTo(exclusiveEdge0);
	      
	      } catch(NoClassDefFoundError e) {
	         //
	         // com/google/common/primitives/Doubles
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test7()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        ExclusiveEdge.of((Edge<Object>) null, 0.0);
	      
	      } catch(NoClassDefFoundError e) {
	         //
	         // com/google/common/collect/ImmutableList
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test8()  throws Throwable  {
	      LinkedList<Edge<Edge<String>>> linkedList0 = new LinkedList<Edge<Edge<String>>>();
	      ExclusiveEdge<Edge<String>> exclusiveEdge0 = ExclusiveEdge.of((Edge<Edge<String>>) null, (List<Edge<Edge<String>>>) linkedList0, 0.0);
	      // Undeclared exception!
	      try { 
	        exclusiveEdge0.compareTo((ExclusiveEdge<Edge<String>>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }
	  
	  @Test(timeout = 4000)
	  public void test9()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        Weighted.weighted("", 0.0);
	      
	      } catch(NoClassDefFoundError e) {
	         //
	         // com/google/common/base/Preconditions
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      Weighted<String> weighted0 = null;
	      try {
	        weighted0 = new Weighted<String>("", 0.0);
 
	      } catch(NoClassDefFoundError e) {
	         //
	         // com/google/common/base/Preconditions
	         //
	      }
	  }
	
	
}
