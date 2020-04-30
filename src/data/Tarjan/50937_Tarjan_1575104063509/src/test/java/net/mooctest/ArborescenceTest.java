package net.mooctest;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;

public class ArborescenceTest {

	@Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      Arborescence<Object> arborescence0 = Arborescence.empty();
	      // Undeclared exception!
	     
	  }

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      Arborescence<Object> arborescence0 = Arborescence.of((ImmutableMap<Object, Object>) null);
	      // Undeclared exception!
	      
	  }

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	      Arborescence<Arborescence<String>> arborescence0 = Arborescence.empty();
	      Arborescence<Arborescence<Integer>> arborescence1 = Arborescence.of((ImmutableMap<Arborescence<Integer>, Arborescence<Integer>>) null);
	      // Undeclared exception!
	    
	  }

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	      Arborescence<Comparable<Integer>> arborescence0 = Arborescence.empty();
	      // Undeclared exception!
	    
	  }

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      Arborescence<Object> arborescence1 = Arborescence.empty();
	      ImmutableMap<Arborescence<Object>, Arborescence<Object>> immutableMap0 = ImmutableMap.of(arborescence1, arborescence1);
	      Arborescence<Arborescence<Object>> arborescence2 = Arborescence.of(immutableMap0);
	      boolean boolean0 = arborescence2.equals(arborescence0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "", "V", "");
	      Arborescence<String> arborescence0 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
	      boolean boolean0 = arborescence0.equals((Object) null);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      Arborescence<Arborescence<String>> arborescence1 = Arborescence.empty();
	      boolean boolean0 = arborescence1.equals(arborescence0);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Arborescence<Arborescence<Object>> arborescence0 = Arborescence.empty();
	      boolean boolean0 = arborescence0.equals(integer0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "");
	      Arborescence<String> arborescence0 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
	      String string0 = arborescence0.toString();
	      assertEquals("Arborescence{ -> }", string0);
	  }

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("Arborescence{}", "");
	      ImmutableBiMap<Comparable<String>, Comparable<String>> immutableBiMap0 = ImmutableBiMap.copyOf((Map<? extends Comparable<String>, ? extends Comparable<String>>) immutableSortedMap0);
	      Arborescence<Comparable<String>> arborescence0 = Arborescence.of((ImmutableMap<Comparable<String>, Comparable<String>>) immutableBiMap0);
	      Edge<Comparable<String>> edge0 = new Edge<Comparable<String>>("A", "Arborescence{}");
	      boolean boolean0 = arborescence0.contains(edge0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("Arborescence{}", "");
	      ImmutableBiMap<Comparable<String>, Comparable<String>> immutableBiMap0 = ImmutableBiMap.copyOf((Map<? extends Comparable<String>, ? extends Comparable<String>>) immutableSortedMap0);
	      Arborescence<Comparable<String>> arborescence0 = Arborescence.of((ImmutableMap<Comparable<String>, Comparable<String>>) immutableBiMap0);
	      Edge<Comparable<String>> edge0 = new Edge<Comparable<String>>("", "Arborescence{}");
	      boolean boolean0 = arborescence0.contains(edge0);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      Integer integer0 = new Integer(0);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, (Integer) null);
	      boolean boolean0 = arborescence0.contains(edge0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {
	      Arborescence<Integer> arborescence0 = Arborescence.empty();
	      arborescence0.hashCode();
	  }

}
