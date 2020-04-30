/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:55:47 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import net.mooctest.Partition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Partition_ESTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      
      boolean boolean0 = linkedList0.add("V](jS+V'\"OALw");
      assertTrue(boolean0);
      assertTrue(linkedList0.contains("V](jS+V'\"OALw"));
      assertEquals(1, linkedList0.size());
      
      boolean boolean1 = linkedList0.add("");
      assertTrue(boolean1);
      assertTrue(linkedList0.contains(""));
      assertTrue(boolean1 == boolean0);
      assertEquals(2, linkedList0.size());
      
      boolean boolean2 = linkedList0.offer("nyr[+|.tsyyu!n5|z5");
      assertTrue(boolean2);
      assertTrue(linkedList0.contains(""));
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      assertEquals(3, linkedList0.size());
      
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      assertTrue(linkedList0.contains(""));
      assertNotNull(partition0);
      assertEquals(3, linkedList0.size());
      
      String string0 = partition0.merge("nyr[+|.tsyyu!n5|z5", "V](jS+V'\"OALw");
      assertEquals("nyr[+|.tsyyu!n5|z5", string0);
      assertTrue(linkedList0.contains(""));
      assertNotNull(string0);
      assertEquals(3, linkedList0.size());
      
      String string1 = partition0.merge("", "V](jS+V'\"OALw");
      assertEquals("nyr[+|.tsyyu!n5|z5", string1);
      assertTrue(linkedList0.contains(""));
      assertNotNull(string1);
      assertEquals(3, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      
      boolean boolean0 = linkedList0.add("V](jS+V'\"OALw");
      assertTrue(boolean0);
      assertTrue(linkedList0.contains("V](jS+V'\"OALw"));
      assertEquals(1, linkedList0.size());
      
      boolean boolean1 = linkedList0.add("");
      assertTrue(boolean1);
      assertTrue(linkedList0.contains("V](jS+V'\"OALw"));
      assertTrue(boolean1 == boolean0);
      assertEquals(2, linkedList0.size());
      
      boolean boolean2 = linkedList0.offer("nyr[+|.tsyyu!n5|z5");
      assertTrue(boolean2);
      assertTrue(linkedList0.contains("V](jS+V'\"OALw"));
      assertTrue(boolean2 == boolean0);
      assertTrue(boolean2 == boolean1);
      assertEquals(3, linkedList0.size());
      
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      assertTrue(linkedList0.contains("V](jS+V'\"OALw"));
      assertNotNull(partition0);
      assertEquals(3, linkedList0.size());
      
      String string0 = partition0.merge("nyr[+|.tsyyu!n5|z5", "V](jS+V'\"OALw");
      assertEquals("nyr[+|.tsyyu!n5|z5", string0);
      assertTrue(linkedList0.contains(string0));
      assertNotNull(string0);
      assertEquals(3, linkedList0.size());
      
      String string1 = partition0.merge("V](jS+V'\"OALw", "");
      assertEquals("nyr[+|.tsyyu!n5|z5", string1);
      assertTrue(linkedList0.contains(string0));
      assertNotNull(string1);
      assertEquals(3, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      
      boolean boolean0 = linkedList0.add("%s (%s) must not be grater than size (%s)");
      assertTrue(boolean0);
      assertTrue(linkedList0.contains("%s (%s) must not be grater than size (%s)"));
      assertEquals(1, linkedList0.size());
      
      boolean boolean1 = linkedList0.offer("m");
      assertTrue(boolean1);
      assertTrue(linkedList0.contains("m"));
      assertTrue(boolean1 == boolean0);
      assertEquals(2, linkedList0.size());
      
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      assertTrue(linkedList0.contains("m"));
      assertNotNull(partition0);
      assertEquals(2, linkedList0.size());
      
      String string0 = partition0.merge("m", "%s (%s) must not be grater than size (%s)");
      assertEquals("m", string0);
      assertTrue(linkedList0.contains("%s (%s) must not be grater than size (%s)"));
      assertNotNull(string0);
      assertEquals(2, linkedList0.size());
      
      String string1 = partition0.merge("m", "%s (%s) must not be grater than size (%s)");
      assertEquals("m", string1);
      assertTrue(linkedList0.contains("m"));
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertEquals(2, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      
      boolean boolean0 = linkedList0.add("%s (%s) must not $e grater than size (%s)");
      assertTrue(boolean0);
      assertTrue(linkedList0.contains("%s (%s) must not $e grater than size (%s)"));
      assertEquals(1, linkedList0.size());
      
      boolean boolean1 = linkedList0.offer("nyr[+|.t=syyu!n5|z5");
      assertTrue(boolean1);
      assertTrue(linkedList0.contains("%s (%s) must not $e grater than size (%s)"));
      assertTrue(boolean1 == boolean0);
      assertEquals(2, linkedList0.size());
      
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      assertTrue(linkedList0.contains("%s (%s) must not $e grater than size (%s)"));
      assertNotNull(partition0);
      assertEquals(2, linkedList0.size());
      
      String string0 = partition0.merge("nyr[+|.t=syyu!n5|z5", "%s (%s) must not $e grater than size (%s)");
      assertEquals("nyr[+|.t=syyu!n5|z5", string0);
      assertTrue(linkedList0.contains("%s (%s) must not $e grater than size (%s)"));
      assertNotNull(string0);
      assertEquals(2, linkedList0.size());
      
      String string1 = partition0.merge("%s (%s) must not $e grater than size (%s)", "nyr[+|.t=syyu!n5|z5");
      assertEquals("nyr[+|.t=syyu!n5|z5", string1);
      assertTrue(linkedList0.contains("nyr[+|.t=syyu!n5|z5"));
      assertNotNull(string1);
      assertEquals(2, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      
      boolean boolean0 = linkedList0.add("%s (%s) must not $e grater than size (%s)");
      assertTrue(boolean0);
      assertTrue(linkedList0.contains("%s (%s) must not $e grater than size (%s)"));
      assertEquals(1, linkedList0.size());
      
      boolean boolean1 = linkedList0.offer("nyr[+|.t=syyu!n5|z5");
      assertTrue(boolean1);
      assertTrue(linkedList0.contains("%s (%s) must not $e grater than size (%s)"));
      assertTrue(boolean1 == boolean0);
      assertEquals(2, linkedList0.size());
      
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      assertTrue(linkedList0.contains("%s (%s) must not $e grater than size (%s)"));
      assertNotNull(partition0);
      assertEquals(2, linkedList0.size());
      
      String string0 = partition0.merge("nyr[+|.t=syyu!n5|z5", "%s (%s) must not $e grater than size (%s)");
      assertEquals("nyr[+|.t=syyu!n5|z5", string0);
      assertTrue(linkedList0.contains("nyr[+|.t=syyu!n5|z5"));
      assertNotNull(string0);
      assertEquals(2, linkedList0.size());
      
      boolean boolean2 = partition0.sameComponent("%s (%s) must not $e grater than size (%s)", "%s (%s) must not $e grater than size (%s)");
      assertTrue(boolean2);
      assertTrue(linkedList0.contains("nyr[+|.t=syyu!n5|z5"));
      assertTrue(boolean2 == boolean0);
      assertTrue(boolean2 == boolean1);
      assertEquals(2, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Partition.singletons((Collection<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Partition", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      assertNotNull(partition0);
      assertEquals(0, linkedList0.size());
      
      // Undeclared exception!
      try { 
        partition0.sameComponent("%s (%s) must not be grater than size (%s)", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Partition", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      
      boolean boolean0 = linkedList0.add("EnYT0@CsxG@{\"");
      assertTrue(boolean0);
      assertTrue(linkedList0.contains("EnYT0@CsxG@{\""));
      assertEquals(1, linkedList0.size());
      
      String string0 = linkedList0.removeLast();
      assertEquals("EnYT0@CsxG@{\"", string0);
      assertFalse(linkedList0.contains(string0));
      assertNotNull(string0);
      assertEquals(0, linkedList0.size());
      
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      assertFalse(linkedList0.contains(string0));
      assertNotNull(partition0);
      assertEquals(0, linkedList0.size());
      
      // Undeclared exception!
      try { 
        partition0.merge("EnYT0@CsxG@{\"", "EnYT0@CsxG@{\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Partition", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      assertNotNull(partition0);
      assertEquals(0, linkedList0.size());
      
      // Undeclared exception!
      try { 
        partition0.componentOf("piiKMC%/>`W}8n5aU-");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Partition", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      
      boolean boolean0 = linkedList0.add("%s (%s) must not be grater than size (%s)");
      assertTrue(boolean0);
      assertTrue(linkedList0.contains("%s (%s) must not be grater than size (%s)"));
      assertEquals(1, linkedList0.size());
      
      boolean boolean1 = linkedList0.offer("m");
      assertTrue(boolean1);
      assertTrue(linkedList0.contains("m"));
      assertTrue(boolean1 == boolean0);
      assertEquals(2, linkedList0.size());
      
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      assertTrue(linkedList0.contains("m"));
      assertNotNull(partition0);
      assertEquals(2, linkedList0.size());
      
      String string0 = partition0.merge("m", "%s (%s) must not be grater than size (%s)");
      assertEquals("m", string0);
      assertTrue(linkedList0.contains("m"));
      assertNotNull(string0);
      assertEquals(2, linkedList0.size());
      
      String string1 = partition0.componentOf("%s (%s) must not be grater than size (%s)");
      assertEquals("m", string1);
      assertTrue(linkedList0.contains("%s (%s) must not be grater than size (%s)"));
      assertNotNull(string1);
      assertEquals(2, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("%s (%s) must not be grater than size (%s)");
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      String string0 = partition0.componentOf("%s (%s) must not be grater than size (%s)");
      assertTrue(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("%s (%s) must not be grater than size (%s)");
      linkedList0.offer("m");
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      boolean boolean0 = partition0.sameComponent("%s (%s) must not be grater than size (%s)", "m");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) linkedList0);
      Set<Integer> set0 = partition0.getNodes();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      List<Object> list0 = linkedList1.subList(0, 0);
      linkedList1.add((Object) set0);
      // Undeclared exception!
      try { 
        Partition.singletons((Collection<Object>) list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
}
