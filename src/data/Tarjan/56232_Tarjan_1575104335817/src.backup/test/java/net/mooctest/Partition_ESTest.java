/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 06:21:54 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
//import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import net.mooctest.Partition;
//import org.evosuite.runtime.EvoRunner;
//import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Partition_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        Partition.singletons((Collection<Object>) linkedList0);
        //fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Maps
         //
       //  verifyException("net.mooctest.Partition", e);
      }
  }
}
