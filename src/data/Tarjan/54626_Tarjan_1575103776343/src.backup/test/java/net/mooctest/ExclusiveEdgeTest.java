/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 13:35:30 GMT+08:00 2019
 */

package net.mooctest;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.LinkedList;
import java.util.List;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ExclusiveEdgeTest{

  @Test(timeout = 4000)
  public void test_E0()  throws Throwable  {
      Edge<String> edge0 = (Edge<String>) mock(Edge.class, new ViolatedAssumptionAnswer());
      ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
      Edge<String> edge1 = (Edge<String>) mock(Edge.class, new ViolatedAssumptionAnswer());
      ExclusiveEdge<String> exclusiveEdge1 = ExclusiveEdge.of(edge1, (List<Edge<String>>) null, 0.5758514849649433);
      int int0 = exclusiveEdge1.compareTo(exclusiveEdge0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_E1()  throws Throwable  {
      Edge<String> edge0 = (Edge<String>) mock(Edge.class, new ViolatedAssumptionAnswer());
      ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
      Edge<String> edge1 = (Edge<String>) mock(Edge.class, new ViolatedAssumptionAnswer());
      ExclusiveEdge<String> exclusiveEdge1 = ExclusiveEdge.of(edge1, (List<Edge<String>>) null, 0.5758514849649433);
      int int0 = exclusiveEdge0.compareTo(exclusiveEdge1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_E2()  throws Throwable  {
      Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
      LinkedList<Edge<Object>> linkedList0 = new LinkedList<Edge<Object>>();
      ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<Object>>) linkedList0, 0.0);
      // Undeclared exception!
      try { 
        exclusiveEdge0.compareTo((ExclusiveEdge<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.ExclusiveEdge", e);
      }
  }

  @Test(timeout = 4000)
  public void test_E3()  throws Throwable  {
      Edge<Integer> edge0 = (Edge<Integer>) mock(Edge.class, new ViolatedAssumptionAnswer());
      LinkedList<Edge<Integer>> linkedList0 = new LinkedList<Edge<Integer>>();
      ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<Integer>>) linkedList0, 0.0);
      int int0 = exclusiveEdge0.compareTo(exclusiveEdge0);
      assertEquals(0, int0);
  }
}
