/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:15:47 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Comparator;
import net.mooctest.FibonacciHeap;
import org.junit.runner.RunWith;

public class FibonacciHeap_ESTest {
 
  @Test(timeout = 1000)
  public void testca8bfa9e_dde0_4e5d_b952_f03f94e39e9a00()  throws Throwable  {
      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
      fibonacciHeap0.add("%A&'=oPL4v,q", "ZW{D0k L/X,.PpQ");
      fibonacciHeap0.add("ZW{D0k L/X,.PpQ", "%A&'=oPL4v,q");
      fibonacciHeap0.add("%A&'=oPL4v,q", "%A&'=oPL4v,q");
      fibonacciHeap0.add("ZW{D0k L/X,.PpQ", "ZW{D0k L/X,.PpQ");
      fibonacciHeap0.add("5q", "com.google.common.collect.Iterators");
      fibonacciHeap0.pollOption();
      assertEquals(4, fibonacciHeap0.size());
  }

  @Test(timeout = 1000)
  public void testa4fc4d46_7ece_45ad_85ec_0863205d48fc01()  throws Throwable  {
      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
      fibonacciHeap0.add("", "pA&'=oPL4v,q");
      fibonacciHeap0.add("pA&'=oPL4v,q", "ZW{D0k L/X,.PpQ");
      fibonacciHeap0.add("ZW{D0k L/X,.PpQ", "pA&'=oPL4v,q");
      fibonacciHeap0.add("pA&'=oPL4v,q", "pA&'=oPL4v,q");
      fibonacciHeap0.add("ZW{D0k L/X,.PpQ", "ZW{D0k L/X,.PpQ");
      fibonacciHeap0.pollOption();
      assertEquals(4, fibonacciHeap0.size());
  }

  @Test(timeout = 1000)
  public void testb0a81f75_dfaa_415b_8cad_be7b1cb864a802()  throws Throwable  {
      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
      fibonacciHeap0.add("", "ZW{D0kZL/X,.PpQ");
      fibonacciHeap0.add("ZW{D0kZL/X,.PpQ", "");
      fibonacciHeap0.add("", "");
      fibonacciHeap0.add("ZW{D0kZL/X,.PpQ", "ZW{D0kZL/X,.PpQ");
      fibonacciHeap0.pollOption();
      fibonacciHeap0.pollOption();
      assertEquals(2, fibonacciHeap0.size());
  }

  @Test(timeout = 1000)
  public void test2569fd18_f7a5_4324_8965_5887c0cdbd3703()  throws Throwable  {
      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
      fibonacciHeap0.add("", "ZW{D0kZL/X,.PpQ");
      FibonacciHeap<String, String> fibonacciHeap1 = FibonacciHeap.create();
      FibonacciHeap<String, String> fibonacciHeap2 = FibonacciHeap.merge(fibonacciHeap1, fibonacciHeap0);
      assertEquals(1, fibonacciHeap0.size());
      assertEquals(1, fibonacciHeap2.size());
  }

  @Test(timeout = 1000)
  public void test7a514960_821f_47f6_8d14_f66883268b2c04()  throws Throwable  {
      FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create();
      FibonacciHeap<Object, String> fibonacciHeap1 = FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
      FibonacciHeap<Object, String> fibonacciHeap2 = FibonacciHeap.merge(fibonacciHeap1, fibonacciHeap0);
      assertEquals(0, fibonacciHeap2.size());
      assertNotSame(fibonacciHeap2, fibonacciHeap1);
  }

  @Test(timeout = 1000)
  public void testc33961bd_e792_4e27_b338_f857fc205d0a05()  throws Throwable  {
      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
      String string0 = "]uK; }alH3-\\uCE;";
      fibonacciHeap0.add("negative size: ", string0);
      int int0 = fibonacciHeap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 1000)
  public void test909a3604_36bc_49e4_af16_f4023d6f346406()  throws Throwable  {
      // Undeclared exception!
      try { 
        FibonacciHeap.merge((FibonacciHeap<Object, Integer>) null, (FibonacciHeap<Object, Integer>) null);
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertTrue(e instanceof NullPointerException);
      }
  }

  @Test(timeout = 1000)
  public void teste9326401_b54a_4ad6_bd9c_8aa70f7853d307()  throws Throwable  {
      FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create();
      // Undeclared exception!
      try { 
        fibonacciHeap0.decreasePriority((FibonacciHeap.Entry) null, (Integer) fibonacciHeap0.MAX_CAPACITY);
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertTrue(e instanceof NullPointerException);
      }
  }

  @Test(timeout = 1000)
  public void testfba1521a_21d1_4af4_b4c4_664221f88dbe08()  throws Throwable  {
      FibonacciHeap<FibonacciHeap.Entry, Integer> fibonacciHeap0 = FibonacciHeap.create();
      // Undeclared exception!
      try { 
        fibonacciHeap0.add((FibonacciHeap.Entry) null, (Integer) fibonacciHeap0.MAX_CAPACITY);
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertTrue(e instanceof NullPointerException);
      }
  }

  @Test(timeout = 1000)
  public void test1ff21539_c091_4ad0_aa59_9c46d2fba0e809()  throws Throwable  {
      // Undeclared exception!
      try { 
        FibonacciHeap.create((Comparator<? super FibonacciHeap.Entry>) null);
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertTrue(e instanceof NullPointerException);
      }
  }

  @Test(timeout = 1000)
  public void test64c37627_95ef_48af_a5ad_413243f557d710()  throws Throwable  {
      FibonacciHeap<FibonacciHeap.Entry, String> fibonacciHeap0 = FibonacciHeap.create();
      Comparator<? super String> comparator0 = fibonacciHeap0.comparator();
      FibonacciHeap<Integer, String> fibonacciHeap1 = FibonacciHeap.create(comparator0);
      assertEquals(0, fibonacciHeap1.size());
  }

  @Test(timeout = 1000)
  public void test378796a8_f59f_4be1_9ab6_8fa533e8b95511()  throws Throwable  {
      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
      fibonacciHeap0.add("W-]\u00068}_ro~P/]", "W-]\u00068}_ro~P/]");
      assertEquals(1, fibonacciHeap0.size());
      
      fibonacciHeap0.pollOption();
      assertEquals(0, fibonacciHeap0.size());
  }

  @Test(timeout = 1000)
  public void test4ec023a3_9099_4b38_bd62_978c201caae412()  throws Throwable  {
      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
      fibonacciHeap0.pollOption();
      assertEquals(0, fibonacciHeap0.size());
  }

  @Test(timeout = 1000)
  public void test7a496298_2ab0_43c5_a89d_c8b878e3198613()  throws Throwable  {
      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
      boolean boolean0 = fibonacciHeap0.isEmpty();
      assertTrue(boolean0);
      assertEquals(0, fibonacciHeap0.size());
  }

  @Test(timeout = 1000)
  public void test132d0987_d00c_49b8_a1ff_8127dee7eb0f14()  throws Throwable  {
      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
      fibonacciHeap0.add("W-]\u00068}_ro~P/]", "W-]\u00068}_ro~P/]");
      boolean boolean0 = fibonacciHeap0.isEmpty();
      assertEquals(1, fibonacciHeap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 1000)
  public void test013ce2b1_3854_4102_83f9_6d3b5031639815()  throws Throwable  {
      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
      fibonacciHeap0.add("W-]\u00068}_ro~P/]", "W-]\u00068}_ro~P/]");
      fibonacciHeap0.spliterator();
      assertEquals(1, fibonacciHeap0.size());
  }

  @Test(timeout = 1000)
  public void testda8d9790_4598_423b_959a_941f71a009a416()  throws Throwable  {
      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
      int int0 = fibonacciHeap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 1000)
  public void test3b55ed35_9adc_4a23_94e7_7cfab7b5b9b017()  throws Throwable  {
      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
      fibonacciHeap0.peekOption();
      assertEquals(0, fibonacciHeap0.size());
  }

  @Test(timeout = 1000)
  public void test2e6583d3_0c8f_426a_9215_a35b42a068a718()  throws Throwable  {
      FibonacciHeap<Integer, Integer> fibonacciHeap0 = FibonacciHeap.create();
      // Undeclared exception!
      try { 
        fibonacciHeap0.remove((FibonacciHeap.Entry) null);
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertTrue(e instanceof NullPointerException);
      }
  }

  @Test(timeout = 1000)
  public void testa194bc87_aa0e_426d_8008_f7fe3283f58219()  throws Throwable  {
      FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create();
      fibonacciHeap0.iterator();
      assertEquals(0, fibonacciHeap0.size());
  }

  @Test(timeout = 1000)
  public void test21cac4c6_4260_4660_8b30_f1cc804dd24220()  throws Throwable  {
      FibonacciHeap<Integer, Integer> fibonacciHeap0 = FibonacciHeap.create();
      fibonacciHeap0.clear();
      assertEquals(0, fibonacciHeap0.size());
  }
}
