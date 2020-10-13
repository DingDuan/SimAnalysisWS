/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 06:23:09 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import net.mooctest.Edge;
import net.mooctest.ExclusiveEdge;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExclusiveEdge_ESTest extends ExclusiveEdge_ESTest_scaffolding {

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
         verifyException("net.mooctest.ExclusiveEdge", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExclusiveEdge.of((Edge<Integer>) null, 101.946537);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/ImmutableList
         //
         verifyException("net.mooctest.ExclusiveEdge", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of((Edge<String>) null, (List<Edge<String>>) null, (-1.0));
      // Undeclared exception!
      try { 
        exclusiveEdge0.compareTo(exclusiveEdge0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/primitives/Doubles
         //
         verifyException("net.mooctest.ExclusiveEdge", e);
      }
  }
}