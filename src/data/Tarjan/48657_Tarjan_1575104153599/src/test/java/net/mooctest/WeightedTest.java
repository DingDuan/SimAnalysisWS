package net.mooctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.util.Comparator;

import org.junit.Test;

public class WeightedTest {
	  @Test
	  public void test00(){
		  Weighted<String> weighted0 = Weighted.weighted("", (-0.5));
	      Weighted<String> weighted1 = Weighted.weighted("", 0.0);
	      int int0 = weighted0.compareTo(weighted1);
	      assertEquals(1, int0);
	  }


	@Test
	  public void test01(){
		 Integer integer0 = new Integer(0);
	      Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, 0.0);
	      Weighted<Integer> weighted1 = Weighted.weighted(integer0, (-0.8225668725585937));
	      int int0 = weighted0.compareTo(weighted1);
	      assertEquals((-1), int0);
	  }

	  @Test
	  public void test02(){
		  Integer integer0 = new Integer(0);
	      Weighted<Object> weighted0 = Weighted.weighted((Object) integer0, 0.0);
	      boolean boolean0 = weighted0.equals(integer0);
	      assertFalse(boolean0);
	  }

	  @Test
	  public void test03(){
		  Weighted<String> weighted0 = Weighted.weighted("", (double) 0);
	      weighted0.hashCode();
	  }

	  @Test
	  public void test04(){
		  Weighted<String> weighted0 = new Weighted<String>("N", 0.0);
	      Weighted<Object> weighted1 = new Weighted<Object>("N", 0.9321932967930683);
	      boolean boolean0 = weighted0.equals(weighted1);
	      assertFalse(boolean0);
	  }

	  @Test
	  public void test05(){
		  Weighted<String> weighted0 = Weighted.weighted("M{f<F8yl^mc", (double) 0);
	      Weighted<Object> weighted1 = new Weighted<Object>("M{f<F8yl^mc", 0);
	      boolean boolean0 = weighted0.equals(weighted1);
	      assertTrue(boolean0);
	  }

	  @Test
	  public void test06(){
		  Weighted<String> weighted0 = new Weighted<String>("", 0.0);
	      Weighted<Object> weighted1 = new Weighted<Object>(weighted0, 0.0);
	      boolean boolean0 = weighted1.equals(weighted0);
	      assertFalse(boolean0);
	  }

	  @Test
	  public void test07(){
		  Integer integer0 = new Integer(0);
	      Weighted<Object> weighted0 = new Weighted<Object>(integer0, (double) integer0);
	      String string0 = weighted0.toString();
	      assertEquals("Weighted{val=0, weight=0.0}", string0);
	  }
	  @Test
	  public void test08(){
		  Weighted<String> weighted0 = new Weighted<String>("", 0.0);
	      Weighted<Object> weighted1 = new Weighted<Object>(weighted0, 0.0);
	      int int0 = weighted1.compareTo(weighted1);
	      assertEquals(0, int0);
	  }
}
