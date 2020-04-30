package net.mooctest;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ExclusiveEdgeTest {

	@Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      LinkedList<Edge<Edge<String>>> linkedList0 = new LinkedList<Edge<Edge<String>>>();
	      ExclusiveEdge<Edge<String>> exclusiveEdge0 = ExclusiveEdge.of((Edge<Edge<String>>) null, (List<Edge<Edge<String>>>) linkedList0, 1082.15455436842);
	      ExclusiveEdge<Edge<String>> exclusiveEdge1 = ExclusiveEdge.of((Edge<Edge<String>>) null, (List<Edge<Edge<String>>>) linkedList0, 1082.15455436842);
	      // Undeclared exception!
	      
	        exclusiveEdge0.compareTo(exclusiveEdge1);
	        
	     
	  }

	@Test(timeout = 4000)
	  public void test1()  throws Throwable  {
	      LinkedList<Edge<String>> linkedList0 = new LinkedList<Edge<String>>();
	      ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of((Edge<String>) null, (List<Edge<String>>) linkedList0, 2540.282879872);
	      assertEquals(2540.282879872, exclusiveEdge0.weight, 0.01);
	  }

	@Test(timeout = 4000)
	  public void test2()  throws Throwable  {
	      LinkedList<Edge<Edge<String>>> linkedList0 = new LinkedList<Edge<Edge<String>>>();
	      ExclusiveEdge<Edge<String>> exclusiveEdge0 = ExclusiveEdge.of((Edge<Edge<String>>) null, (List<Edge<Edge<String>>>) linkedList0, 1115.7637685045108);
	      // Undeclared exception!
	   
	        exclusiveEdge0.compareTo(exclusiveEdge0);
//	        fail("Expecting exception: NoClassDefFoundError");
	      
	   
	  }

	@Test(timeout = 4000)
	  public void test3()  throws Throwable  {
	      // Undeclared exception!
	 
	        ExclusiveEdge.of((Edge<Integer>) null, (-1413.0154436350122));
//	        fail("Expecting exception: NoClassDefFoundError");
	      
	      
	  }

}
