package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class PairTest {

	@Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      Pair<Object, String> pair0 = Pair.of((Object) "E-&&", "V-{|p@LU1jJ");
	      Integer integer0 = new Integer(0);
	      Pair<Object, Integer> pair1 = Pair.of((Object) pair0, integer0);
	      // Undeclared exception!
	     
	        pair0.equals(pair1);
//	        fail("Expecting exception: NoClassDefFoundError");
	      
	     
	  }

	@Test(timeout = 4000)
	  public void test1()  throws Throwable  {
	      Object object0 = new Object();
	      Pair<String, Object> pair0 = new Pair<String, Object>("", object0);
	      boolean boolean0 = pair0.equals("");
	      assertFalse(boolean0);
	  }

	@Test(timeout = 4000)
	  public void test2()  throws Throwable  {
	      Integer integer0 = new Integer(2952);
	      Pair<Object, Object> pair0 = Pair.of((Object) integer0, (Object) integer0);
	      Integer integer1 = new Integer(2952);
	      boolean boolean0 = pair0.equals(integer1);
	      assertFalse(boolean0);
	  }

	@Test(timeout = 4000)
	  public void test3()  throws Throwable  {
	      Pair<String, Object> pair0 = new Pair<String, Object>("Q+|[%fm+8\n", "Q+|[%fm+8\n");
	      Pair<Pair<String, Object>, String> pair1 = Pair.of(pair0, (String) null);
	      // Undeclared exception!
	  
	        pair1.hashCode();
//	        fail("Expecting exception: NoClassDefFoundError");
	      
	    
	  }

	@Test(timeout = 4000)
	  public void test4()  throws Throwable  {
	      Pair<String, String> pair0 = Pair.of("first", "first");
	      Pair<Integer, Pair<String, String>> pair1 = Pair.of((Integer) null, pair0);
	      assertNotNull(pair1);
	  }

	@Test(timeout = 4000)
	  public void test5()  throws Throwable  {
	      Pair<String, String> pair0 = new Pair<String, String>("", "");
	      // Undeclared exception!
	   
	        pair0.hashCode();
//	        fail("Expecting exception: NoClassDefFoundError");
	      
	      
	  }

	@Test(timeout = 4000)
	  public void test6()  throws Throwable  {
	      Pair<String, Object> pair0 = Pair.of("6J#$dvdCl,+_ds", (Object) "6J#$dvdCl,+_ds");
	      // Undeclared exception!
	      
	        pair0.toString();
//	        fail("Expecting exception: NoClassDefFoundError");
	      
	     
	  }

	@Test(timeout = 4000)
	  public void test7()  throws Throwable  {
	      Pair<Object, String> pair0 = new Pair<Object, String>("2pq0$!A[=fSav.,It", "2pq0$!A[=fSav.,It");
	      pair0.equals("2pq0$!A[=fSav.,It");
	      Pair<Object, Pair<Object, String>> pair1 = new Pair<Object, Pair<Object, String>>("2pq0$!A[=fSav.,It", pair0);
	 
	        pair1.equals(pair0);
//	        fail("Expecting exception: NoClassDefFoundError");
	    
	  }

}
