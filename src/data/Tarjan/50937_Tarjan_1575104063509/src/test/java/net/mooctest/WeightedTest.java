package net.mooctest;


import static org.junit.Assert.*;

import org.junit.Test;

public class WeightedTest {

	@Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, 0);
	      int int0 = weighted0.compareTo(weighted0);
	      assertEquals(0, int0);
	  }

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Object> weighted0 = Weighted.weighted((Object) integer0, 0.0);
	      Weighted<Object> weighted1 = new Weighted<Object>("", 0.84354817125);
	      int int0 = weighted0.compareTo(weighted1);
	      assertEquals(1, int0);
	  }

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	      Weighted<Object> weighted0 = Weighted.weighted((Object) "", 1063.6875707036133);
	      Weighted<Object> weighted1 = new Weighted<Object>("", 0.0);
	      int int0 = weighted0.compareTo(weighted1);
	      assertEquals((-1), int0);
	  }

	  

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {
	      Weighted<Object> weighted0 = null;
	    
	  }

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      Weighted<String> weighted0 = new Weighted<String>("weight", 0);
	      Weighted<String> weighted1 = new Weighted<String>("weight", 0.5793118076319753);
	      boolean boolean0 = weighted1.equals(weighted0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {
	      Weighted<Object> weighted0 = Weighted.weighted((Object) "", 0.0);
	      Weighted<Weighted<Object>> weighted1 = new Weighted<Weighted<Object>>(weighted0, 0.0);
	      boolean boolean0 = weighted0.equals(weighted1);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      Weighted<Object> weighted0 = Weighted.weighted((Object) "", 0.0);
	      boolean boolean0 = weighted0.equals((Object) null);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, 0);
	      Weighted<Object> weighted1 = Weighted.weighted((Object) integer0, (double) 0);
	      boolean boolean0 = weighted1.equals(weighted0);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Object> weighted0 = Weighted.weighted((Object) integer0, (double) 0);
	      String string0 = weighted0.toString();
	      assertEquals("Weighted{val=0, weight=0.0}", string0);
	  }

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Object> weighted0 = Weighted.weighted((Object) integer0, (double) 0);
	      weighted0.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, 0);
	      Weighted<Object> weighted1 = new Weighted<Object>(weighted0, 0.0);
	      // Undeclared exception!
	     
	  }

}
