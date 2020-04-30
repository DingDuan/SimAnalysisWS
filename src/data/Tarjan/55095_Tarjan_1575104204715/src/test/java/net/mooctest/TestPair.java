

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import net.mooctest.Pair;



public class TestPair{

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Pair<Object, Object> pair0 = Pair.of((Object) integer0, (Object) integer0);
      Pair<Integer, String> pair1 = new Pair<Integer, String>(integer0, (String) null);
      Pair<Object, Pair<Integer, String>> pair2 = Pair.of((Object) pair0, pair1);
      boolean boolean0 = pair2.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pair<Integer, String> pair0 = new Pair<Integer, String>((Integer) null, (String) null);
      Pair<Integer, Integer> pair1 = new Pair<Integer, Integer>((Integer) null, (Integer) null);
      Pair<Object, String> pair2 = Pair.of((Object) pair1, "");
      Pair<Pair<Integer, String>, String> pair3 = new Pair<Pair<Integer, String>, String>(pair0, (String) null);
      boolean boolean0 = pair2.equals(pair3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pair<String, String> pair0 = Pair.of("5|3F<*9[6~6?aQUZ", "");
      Pair<Object, Object> pair1 = Pair.of((Object) "5|3F<*9[6~6?aQUZ", (Object) "");
      boolean boolean0 = pair1.equals(pair0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Pair<Integer, Integer> pair0 = new Pair<Integer, Integer>(integer0, integer0);
      Pair<Object, Object> pair1 = Pair.of((Object) pair0, (Object) integer0);
      Pair<Pair<Object, Object>, String> pair2 = Pair.of(pair1, "");
      boolean boolean0 = pair2.equals(pair1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Pair<Integer, Integer> pair0 = new Pair<Integer, Integer>(integer0, integer0);
      Pair<Object, Object> pair1 = Pair.of((Object) pair0, (Object) integer0);
      pair1.hashCode();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Pair<Integer, Integer> pair0 = new Pair<Integer, Integer>(integer0, integer0);
      Pair<Object, Object> pair1 = Pair.of((Object) pair0, (Object) integer0);
      Pair<Pair<Object, Object>, String> pair2 = Pair.of(pair1, "");
      String string0 = pair2.toString();
      assertEquals("Pair{first=Pair{first=Pair{first=0, second=0}, second=0}, second=}", string0);
  }
}
