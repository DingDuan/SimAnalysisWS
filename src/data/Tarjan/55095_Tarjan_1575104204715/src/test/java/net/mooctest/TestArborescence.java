package net.mooctest;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.AbstractMap;


import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;

 
public class TestArborescence{

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Arborescence<Edge<Object>> arborescence0 = Arborescence.empty();
      String string0 = arborescence0.toString();
      assertEquals("Arborescence{}", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Arborescence<Object> arborescence0 = Arborescence.of((ImmutableMap<Object, Object>) null);
      // Undeclared exception!
      try { 
        arborescence0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Arborescence<String> arborescence0 = Arborescence.empty();
      Arborescence<AbstractMap.SimpleEntry<Object, Object>> arborescence1 = Arborescence.empty();
      boolean boolean0 = arborescence1.equals(arborescence0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Arborescence<Object> arborescence0 = Arborescence.empty();
      boolean boolean0 = arborescence0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "", "G", "");
      Arborescence<String> arborescence0 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
      boolean boolean0 = arborescence0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ImmutableMap<String, String> immutableMap0 = ImmutableMap.of("", "", "X", "");
      Arborescence<String> arborescence0 = Arborescence.of(immutableMap0);
      // Undeclared exception!
      try { 
        ImmutableBiMap.of(arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(Exception e) {
         
        
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "", "[G", "");
      Arborescence<String> arborescence0 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
      Edge<String> edge0 = new Edge<String>("", "[G");
      boolean boolean0 = arborescence0.contains(edge0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Arborescence<Integer> arborescence0 = Arborescence.empty();
      Integer integer0 = new Integer(0);
      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
      boolean boolean0 = arborescence0.contains(edge0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Arborescence<Integer> arborescence0 = Arborescence.empty();
      arborescence0.hashCode();
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Arborescence<Arborescence<Object>> arborescence0 = Arborescence.empty();
      // Undeclared exception!
      try { 
        arborescence0.contains((Edge<Arborescence<Object>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
         
      }
  }
}

