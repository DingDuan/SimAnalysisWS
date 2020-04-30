package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class PairTest {

	@Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      Pair<Integer, Object> pair0 = new Pair<Integer, Object>((Integer) null, "w");
	      Pair<Object, String> pair1 = new Pair<Object, String>((Object) null, "w");
	      boolean boolean0 = pair1.equals(pair0);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test1()  throws Throwable  {
	      Pair<Integer, Object> pair0 = new Pair<Integer, Object>((Integer) null, "");
	      Pair<String, String> pair1 = new Pair<String, String>("", "");
	      boolean boolean0 = pair1.equals(pair0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test2()  throws Throwable  {
	      Pair<Object, String> pair0 = new Pair<Object, String>((Object) null, "");
	      boolean boolean0 = pair0.equals("");
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test3()  throws Throwable  {
	      Pair<Integer, Object> pair0 = new Pair<Integer, Object>((Integer) null, "");
	      pair0.hashCode();
	  }

	  @Test(timeout = 4000)
	  public void test4()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Pair<Object, String> pair0 = Pair.of((Object) integer0, "");
	      Pair<Integer, Object> pair1 = new Pair<Integer, Object>(integer0, integer0);
	      boolean boolean0 = pair0.equals(pair1);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test5()  throws Throwable  {
	      Pair<String, String> pair0 = new Pair<String, String>("", "");
	      String string0 = pair0.toString();
	      assertEquals("Pair{first=, second=}", string0);
	  }

}
