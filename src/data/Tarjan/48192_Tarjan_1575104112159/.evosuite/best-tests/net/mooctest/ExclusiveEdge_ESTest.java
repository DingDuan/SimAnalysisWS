/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 06:00:19 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import net.mooctest.Edge;
import net.mooctest.ExclusiveEdge;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExclusiveEdge_ESTest extends ExclusiveEdge_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Edge<Integer> edge0 = (Edge<Integer>) mock(Edge.class, new ViolatedAssumptionAnswer());
      ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of(edge0, (-1313.7589048891148));
      ExclusiveEdge<Integer> exclusiveEdge1 = ExclusiveEdge.of(exclusiveEdge0.edge, (List<Edge<Integer>>) null, (-988.01295));
      int int0 = exclusiveEdge1.compareTo(exclusiveEdge0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Edge<Integer> edge0 = (Edge<Integer>) mock(Edge.class, new ViolatedAssumptionAnswer());
      ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of(edge0, 1.0);
      ExclusiveEdge<Object> exclusiveEdge1 = ExclusiveEdge.of((Edge<Object>) exclusiveEdge0.edge, 1.0);
      ExclusiveEdge<Integer> exclusiveEdge2 = ExclusiveEdge.of((Edge<Integer>) exclusiveEdge1.edge, (List<Edge<Integer>>) null, (-1444.2234281007));
      int int0 = exclusiveEdge2.compareTo(exclusiveEdge0);
      assertEquals((-1), int0);
      assertEquals(1.0, exclusiveEdge1.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Edge<Integer> edge0 = (Edge<Integer>) mock(Edge.class, new ViolatedAssumptionAnswer());
      ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of(edge0, 1.0);
      ExclusiveEdge<ExclusiveEdge<String>> exclusiveEdge1 = ExclusiveEdge.of((Edge<ExclusiveEdge<String>>) exclusiveEdge0.edge, 0.0);
      ExclusiveEdge<String> exclusiveEdge2 = ExclusiveEdge.of((Edge<String>) exclusiveEdge1.edge, (-862.32017657));
      // Undeclared exception!
      try { 
        exclusiveEdge2.compareTo((ExclusiveEdge<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.ExclusiveEdge", e);
      }
  }
}
