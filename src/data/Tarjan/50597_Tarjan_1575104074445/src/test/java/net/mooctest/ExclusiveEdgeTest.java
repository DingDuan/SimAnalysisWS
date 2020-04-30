package net.mooctest;


import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ExclusiveEdgeTest {

	@Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of((Edge<Object>) null, (List<Edge<Object>>) null, 0.0);
	      
	      try { 
	        exclusiveEdge0.compareTo(exclusiveEdge0);
	      
	      } catch(NoClassDefFoundError e) {
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void test1()  throws Throwable  {
	     
	      try { 
	        ExclusiveEdge.of((Edge<ExclusiveEdge<String>>) null, 0.0);
	     
	      
	      } catch(NoClassDefFoundError e) {
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void test2()  throws Throwable  {
	      LinkedList<Edge<Edge<Object>>> linkedList0 = new LinkedList<Edge<Edge<Object>>>();
	      ExclusiveEdge<Edge<Object>> exclusiveEdge0 = ExclusiveEdge.of((Edge<Edge<Object>>) null, (List<Edge<Edge<Object>>>) linkedList0, 0.0);
	     
	      try { 
	        exclusiveEdge0.compareTo((ExclusiveEdge<Edge<Object>>) null);
	     
	      
	      } catch(NullPointerException e) {
	        
	      }
	  }

}
