/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:18:12 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import net.mooctest.Pair;
import org.junit.runner.RunWith;

public class Pair_ESTest {
 
  @Test(timeout = 1000)
  public void test6755e3e0_7fbf_4ead_9a2e_670d96e94d3a0()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Pair<Object, Object> pair0 = new Pair<Object, Object>((Object) null, integer0);
      String string0 = pair0.toString();
      assertEquals("Pair{first=null, second=-1}", string0);
  }

  @Test(timeout = 1000)
  public void testf30afaa3_76f9_41ab_80bb_ddf2ca9e9b8b1()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Pair<Object, Object> pair0 = new Pair<Object, Object>((Object) null, integer0);
      pair0.hashCode();
  }

  @Test(timeout = 1000)
  public void testb5d75cd5_3d1c_4415_b977_02a8993063732()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Pair<Object, Object> pair0 = new Pair<Object, Object>((Object) null, integer0);
      Pair<Object, String> pair1 = Pair.of((Object) null, "");
      boolean boolean0 = pair1.equals(pair0);
      assertFalse(boolean0);
  }

  @Test(timeout = 1000)
  public void test9449d4e9_e4ef_463b_b9dd_b28cf16eecb23()  throws Throwable  {
      Integer integer0 = new Integer((-51));
      Pair<Integer, Object> pair0 = new Pair<Integer, Object>(integer0, integer0);
      Pair<Object, Integer> pair1 = Pair.of((Object) integer0, integer0);
      boolean boolean0 = pair0.equals(pair1);
      assertTrue(boolean0);
  }

  @Test(timeout = 1000)
  public void test4cf98a36_8f31_432d_88eb_ff29cc44f81a4()  throws Throwable  {
      Integer integer0 = new Integer((-51));
      Pair<Object, Integer> pair0 = Pair.of((Object) integer0, integer0);
      Pair<String, Object> pair1 = Pair.of(", ", (Object) ", ");
      boolean boolean0 = pair0.equals(pair1);
      assertFalse(boolean0);
  }

  @Test(timeout = 1000)
  public void testba18e7bb_f4d4_4ab6_8faa_38cb7b2d940d5()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Pair<Integer, Object> pair0 = new Pair<Integer, Object>(integer0, "sednh");
      boolean boolean0 = pair0.equals("sednh");
      assertFalse(boolean0);
  }
}
