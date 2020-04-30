/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 15:27:56 CST 2019
 */

package net.mooctest;


import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ExclusiveEdgeTest  {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Edge<Object>> linkedList0 = new LinkedList<Edge<Object>>();
      ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of((Edge<Object>) null, (List<Edge<Object>>) linkedList0, 0.0);
      // Undeclared exception!
      try { 
        exclusiveEdge0.compareTo((ExclusiveEdge<Object>) null);
        
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //

      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
      ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of((Edge<Integer>) null, (List<Edge<Integer>>) null, 0.0);
      // Undeclared exception!
      try { 
        exclusiveEdge0.compareTo(exclusiveEdge0);
        
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/primitives/Doubles
         //

      }
  }
}
