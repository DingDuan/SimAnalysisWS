/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 15:23:34 CST 2019
 */

package net.mooctest;


import java.util.Collection;
import java.util.LinkedList;

import org.junit.Test;

public class PartitionTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        Partition.singletons((Collection<Object>) linkedList0);
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Maps
         //
      }
  }
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
	  LinkedList<Object> linkedList0 = new LinkedList<Object>();
	  linkedList0.add("aa");
	  linkedList0.add("bb");
	  linkedList0.add("cc");
	  linkedList0.add("dd");
	  linkedList0.add("ee");
	  linkedList0.add("hh");
	  Partition.singletons(linkedList0);
  }
  

}
