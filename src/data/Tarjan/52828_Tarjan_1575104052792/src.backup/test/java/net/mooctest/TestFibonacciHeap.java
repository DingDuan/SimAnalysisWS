package net.mooctest;
import static org.junit.Assert.*;

import org.junit.Test;

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
		Weighted<Integer> wighted = new Weighted(edge,2);
		
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
	        fail("Expecting exception: NoClassDefFoundError");
	      
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
	        fail("Expecting exception: NoClassDefFoundError");
	      
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
	        fail("Expecting exception: NoClassDefFoundError");
	      
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
	      try { 
	        pair0.toString();
	        fail("Expecting exception: NoClassDefFoundError");
	      
	      } catch(NoClassDefFoundError e) {
	         //
	         // com/google/common/base/Objects
	         //
	      }
	  }
	
	
}
