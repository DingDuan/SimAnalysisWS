package net.mooctest;


import static org.junit.Assert.*;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;

import org.junit.Test;

public class PartitionTest {

	 @Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.add(",{x7]g");
	      linkedList0.add("");
	      linkedList0.addFirst("?^");
	      linkedList0.add("G%y{");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      partition0.merge("?^", "");
	      partition0.merge("G%y{", ",{x7]g");
	      String string0 = partition0.merge("", "G%y{");
	      assertEquals("?^", string0);
	  }

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.add(",{x7]:");
	      linkedList0.add("");
	      linkedList0.add("G%y{");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      String string0 = partition0.merge("G%y{", "");
	      assertEquals("G%y{", string0);
	      
	      String string1 = partition0.merge("", ",{x7]:");
	      assertEquals("G%y{", string1);
	  }

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.add(",{x7]:");
	      linkedList0.add("");
	      linkedList0.add("G%y{");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      String string0 = partition0.merge("G%y{", ",{x7]:");
	      assertEquals("G%y{", string0);
	      
	      String string1 = partition0.merge("", ",{x7]:");
	      assertEquals("G%y{", string1);
	      
	      String string2 = partition0.merge("", "G%y{");
	      assertEquals("G%y{", string2);
	  }

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	      LinkedList<Object> linkedList0 = new LinkedList<Object>();
	      linkedList0.add((Object) linkedList0);
	      // Undeclared exception!
	      try { 
	        Partition.singletons((Collection<Object>) linkedList0);
	        fail("Expecting exception: StackOverflowError");
	      
	      } catch(StackOverflowError e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        Partition.singletons((Collection<Object>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      
	      }
	  }

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) linkedList0);
	      Set<Integer> set0 = partition0.getNodes();
	      LinkedList<Object> linkedList1 = new LinkedList<Object>();
	      Partition<Object> partition1 = Partition.singletons((Collection<Object>) linkedList1);
	      // Undeclared exception!
	      try { 
	        partition1.sameComponent(set0, "");
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	       
	      }
	  }

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {
	      LinkedList<Object> linkedList0 = new LinkedList<Object>();
	      Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
	      // Undeclared exception!
	      try { 
	        partition0.merge(linkedList0, "");
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        
	      }
	  }

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      LinkedList<Object> linkedList0 = new LinkedList<Object>();
	      Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
	      // Undeclared exception!
	      try { 
	        partition0.componentOf("");
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.add(",|.scLQ=7UCB}!H6L");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      String string0 = partition0.componentOf(",|.scLQ=7UCB}!H6L");
	      assertEquals(",|.scLQ=7UCB}!H6L", string0);
	  }

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.add("c`5H<O*.");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      boolean boolean0 = partition0.sameComponent("c`5H<O*.", "c`5H<O*.");
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.add("c`5H<O*.");
	      linkedList0.add("");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      boolean boolean0 = partition0.sameComponent("", "c`5H<O*.");
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      linkedList0.add(",|.scLQ=7UCB}!H6L");
	      linkedList0.add("m^8m;~#'O|%");
	      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
	      String string0 = partition0.merge(",|.scLQ=7UCB}!H6L", "m^8m;~#'O|%");
	      assertEquals(",|.scLQ=7UCB}!H6L", string0);
	      
	      String string1 = partition0.componentOf("m^8m;~#'O|%");
	      assertEquals(",|.scLQ=7UCB}!H6L", string1);
	  }

}
