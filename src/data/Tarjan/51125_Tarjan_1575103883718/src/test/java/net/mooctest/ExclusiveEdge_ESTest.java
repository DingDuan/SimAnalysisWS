/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 06:40:57 GMT 2019
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

public class ExclusiveEdge_ESTest  {


  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Edge<Integer> edge0 = (Edge<Integer>) mock(Edge.class, new ViolatedAssumptionAnswer());
      ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of(edge0, (-21.95));
      int int0 = exclusiveEdge0.compareTo(exclusiveEdge0);
      assertEquals(0, int0);
      assertEquals((-21.95), exclusiveEdge0.weight, 0.01);
  }
}