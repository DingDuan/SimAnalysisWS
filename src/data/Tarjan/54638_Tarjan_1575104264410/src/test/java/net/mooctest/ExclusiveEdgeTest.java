package net.mooctest;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ExclusiveEdgeTest {

	@Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      LinkedList<Edge<String>> linkedList0 = new LinkedList<Edge<String>>();
	      ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of((Edge<String>) null, (List<Edge<String>>) linkedList0, 0.0);
	      // Undeclared exception!
	      try { 
	        exclusiveEdge0.compareTo((ExclusiveEdge<String>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

}
