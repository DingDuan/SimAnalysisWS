package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class PairTest {

	@Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      Pair<String, Object> pair0 = Pair.of("", (Object) "");
	      boolean boolean0 = pair0.equals("");
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test1()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<String, Object> pair0 = Pair.of("", (Object) integer0);
	      Pair<Pair<String, Object>, Object> pair1 = new Pair<Pair<String, Object>, Object>(pair0, "");
	      Pair<String, Integer> pair2 = new Pair<String, Integer>("", integer0);
	      Pair<Object, Pair<String, Integer>> pair3 = Pair.of((Object) integer0, pair2);
	      // Undeclared exception!
	      try { 
	        pair1.equals(pair3);
	        fail("Expecting exception: NoClassDefFoundError");
	      
	      } catch(NoClassDefFoundError e) {
	         //
	         // com/google/common/base/Objects
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test2()  throws Throwable  {
	      Pair<String, String> pair0 = new Pair<String, String>("", "");
	      // Undeclared exception!
	      try { 
	        pair0.hashCode();
	        fail("Expecting exception: NoClassDefFoundError");
	      
	      } catch(NoClassDefFoundError e) {
	         //
	         // com/google/common/base/Objects
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test3()  throws Throwable  {
	      Pair<String, Object> pair0 = Pair.of("", (Object) "");
	      // Undeclared exception!
	      try { 
	        pair0.toString();
	        fail("Expecting exception: NoClassDefFoundError");
	      
	      } catch(NoClassDefFoundError e) {
	         //
	         // com/google/common/base/Objects
	         //
	      }
	  }

}
