/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:17:33 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import net.mooctest.Weighted;
import org.junit.runner.RunWith;

public class Weighted_ESTest {
 
  @Test(timeout = 1000)
  public void testd64b4fec_5d42_46ff_8024_66fb6125cf8f00()  throws Throwable  {
      Weighted<String> weighted0 = Weighted.weighted("0f\"w)", 965.5418077);
      int int0 = weighted0.compareTo(weighted0);
      assertEquals(0, int0);
      assertEquals(965.5418077, weighted0.weight, 0.01);
  }

  @Test(timeout = 1000)
  public void test6d0440c4_968a_41b9_add3_a753b3ce72e001()  throws Throwable  {
      Weighted<Object> weighted0 = Weighted.weighted((Object) "#.*,L&mkl[ZVP|NU1", (-2824.519230994627));
      Weighted<Object> weighted1 = Weighted.weighted((Object) "#.*,L&mkl[ZVP|NU1", (-1871.708826));
      int int0 = weighted0.compareTo(weighted1);
      assertEquals(1, int0);
  }

  @Test(timeout = 1000)
  public void testb3fe249c_13e8_45b6_b4d1_26ed9b5d387802()  throws Throwable  {
      Weighted<Object> weighted0 = new Weighted<Object>("", 0.0);
      Weighted<Object> weighted1 = new Weighted<Object>(weighted0, 0.0);
      int int0 = weighted1.compareTo(weighted0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 1000)
  public void test4087afb9_36a3_4bac_a898_1e5cc1b4354a03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weighted.weighted((Integer) null, (-1.0));
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertTrue(e instanceof NullPointerException);
      }
  }

  @Test(timeout = 1000)
  public void test22fc021e_edfd_4eaa_8836_84f8d285075804()  throws Throwable  {
      Weighted<Object> weighted0 = null;
      try {
        weighted0 = new Weighted<Object>((Object) null, (-1.0));
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertTrue(e instanceof NullPointerException);
      }
  }

  @Test(timeout = 1000)
  public void testd005268b_16c4_4915_888a_ef008e6792f705()  throws Throwable  {
      Weighted<Object> weighted0 = Weighted.weighted((Object) "#.*,L&mkl[ZVP|NU1", (-2824.519230994627));
      Weighted<Object> weighted1 = Weighted.weighted((Object) "#.*,L&mkl[ZVP|NU1", (-1871.708826));
      boolean boolean0 = weighted0.equals(weighted1);
      assertFalse(boolean0);
      assertEquals((-1871.708826), weighted1.weight, 0.01);
  }

  @Test(timeout = 1000)
  public void test30eb7280_87a8_4184_b988_2c8a3d01caa406()  throws Throwable  {
      Integer integer0 = new Integer(35);
      Weighted<Integer> weighted0 = Weighted.weighted(integer0, (double) 35);
      Weighted<Object> weighted1 = Weighted.weighted((Object) weighted0, 35.0);
      boolean boolean0 = weighted1.equals(weighted0);
      assertEquals(35.0, weighted1.weight, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 1000)
  public void testee597eeb_b496_4c03_80ce_4f83bde6035007()  throws Throwable  {
      Weighted<String> weighted0 = Weighted.weighted("", 0.0);
      boolean boolean0 = weighted0.equals("");
      assertFalse(boolean0);
      assertEquals(0.0, weighted0.weight, 0.01);
  }

  @Test(timeout = 1000)
  public void test8464c4a4_10ab_46ba_970a_cec0349dbe3508()  throws Throwable  {
      Weighted<Object> weighted0 = Weighted.weighted((Object) "#.*,L&mkl[ZVP|NU1", (-2824.519230994627));
      boolean boolean0 = weighted0.equals(weighted0);
      assertEquals((-2824.519230994627), weighted0.weight, 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 1000)
  public void testc2bcf595_c61d_4377_bf90_9dc554eb95b709()  throws Throwable  {
      Weighted<Object> weighted0 = new Weighted<Object>("", 0.0);
      String string0 = weighted0.toString();
      assertEquals("Weighted{val=, weight=0.0}", string0);
  }

  @Test(timeout = 1000)
  public void test141f1556_6945_48ef_a53a_b5298b85cd9c10()  throws Throwable  {
      Weighted<Object> weighted0 = Weighted.weighted((Object) "#.*,L&mkl[ZVP|NU1", (-2824.519230994627));
      weighted0.hashCode();
      assertEquals((-2824.519230994627), weighted0.weight, 0.01);
  }

  @Test(timeout = 1000)
  public void test54ba72f8_b267_49d0_af19_a81180671f7f11()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Weighted<Object> weighted0 = Weighted.weighted((Object) integer0, (double) (-1));
      // Undeclared exception!
      try { 
        weighted0.compareTo((Weighted<Object>) null);
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertTrue(e instanceof NullPointerException);
      }
  }
}
