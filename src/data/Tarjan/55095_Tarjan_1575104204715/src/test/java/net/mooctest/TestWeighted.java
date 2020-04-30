package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import net.mooctest.Weighted;

public class TestWeighted{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Weighted<String> weighted0 = new Weighted<String>("", 0.0);
      Weighted<String> weighted1 = Weighted.weighted("", 0.6611595703125);
      int int0 = weighted0.compareTo(weighted1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Weighted<String> weighted0 = Weighted.weighted("", 0.0);
      Weighted<String> weighted1 = new Weighted<String>("", 1);
      int int0 = weighted1.compareTo(weighted0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weighted.weighted((String) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
         //
        
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Weighted<String> weighted0 = Weighted.weighted("", 0.0);
      Weighted<Weighted<String>> weighted1 = Weighted.weighted(weighted0, (double) 0);
      // Undeclared exception!
      try { 
        weighted1.compareTo((Weighted<Weighted<String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
        
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Weighted<Object> weighted0 = null;
      try {
        weighted0 = new Weighted<Object>((Object) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weighted<Object> weighted0 = new Weighted<Object>("", 0.0);
      boolean boolean0 = weighted0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weighted<String> weighted0 = Weighted.weighted("Weighted{val=Weighted{val=java.lang.Object@208aec0b, weight=0.0}, weight=0.0}", 0.0);
      Weighted<String> weighted1 = new Weighted<String>("Weighted{val=Weighted{val=java.lang.Object@208aec0b, weight=0.0}, weight=0.0}", 1);
      boolean boolean0 = weighted1.equals(weighted0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      Weighted<Object> weighted0 = Weighted.weighted(object0, 0.0);
      Weighted<Weighted<Object>> weighted1 = new Weighted<Weighted<Object>>(weighted0, 0.0);
      Weighted<Object> weighted2 = new Weighted<Object>(weighted1, 0.0);
      boolean boolean0 = weighted2.equals(weighted0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weighted<String> weighted0 = Weighted.weighted("", 0.0);
      boolean boolean0 = weighted0.equals(weighted0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      Weighted<Object> weighted0 = Weighted.weighted(object0, 0.0);
      Weighted<Weighted<Object>> weighted1 = new Weighted<Weighted<Object>>(weighted0, 0.0);
      String string0 = weighted1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Weighted<String> weighted0 = Weighted.weighted("", 0.0);
      weighted0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Weighted<String> weighted0 = Weighted.weighted("", 0.0);
      int int0 = weighted0.compareTo(weighted0);
      assertEquals(0, int0);
  }
}
