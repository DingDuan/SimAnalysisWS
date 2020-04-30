package net.mooctest;


import static org.junit.Assert.*;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

import com.google.common.base.Predicate;

public class EdgeTest {
	@Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      Edge<Object> edge0 = new Edge<Object>("", "");
	      edge0.hashCode();
	  }

	 

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
	      Edge<Object> edge0 = new Edge<Object>((Object) null, (Object) null);
	      linkedHashSet0.add(edge0);
	      // Undeclared exception!
	     
	  }

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	      Edge<String> edge0 = new Edge<String>("", "");
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) edge0);
	      Edge edge1 = (Edge)edge_EdgeBuilder0.source;
	      boolean boolean0 = edge0.equals(edge1);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {
	      Edge<String> edge0 = new Edge<String>("source", "");
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) "source");
	      Edge<Object> edge1 = edge_EdgeBuilder0.to("");
	      boolean boolean0 = edge1.equals(edge0);
	      //  // Unstable assertion: assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      Edge<Object> edge0 = new Edge<Object>((Object) null, (Object) null);
	      Edge<String> edge1 = new Edge<String>((String) null, "");
	      boolean boolean0 = edge1.equals(edge0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) "");
	      Edge<Object> edge1 = edge_EdgeBuilder0.to("");
	      boolean boolean0 = edge0.equals(edge1);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      Edge<Integer> edge0 = new Edge<Integer>((Integer) null, (Integer) null);
	      boolean boolean0 = edge0.equals((Object) null);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
	      Predicate<Edge<Object>> predicate0 = Edge.competesWith((Set<Edge<Object>>) linkedHashSet0);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      Edge<String> edge0 = new Edge<String>("", "");
	      String string0 = edge0.toString();
	      assertEquals("Edge{source=, destination=}", string0);
	  }

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
	      Edge<String> edge0 = new Edge<String>("", "");
	      linkedHashSet0.add(edge0);
	      Predicate<Edge<String>> predicate0 = Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {
	      Predicate<Edge<Integer>> predicate0 = Edge.isAutoCycle();
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {
	      Predicate<Edge<String>> predicate0 = Edge.isIn((Set<Edge<String>>) null);
	      assertNotNull(predicate0);
	  }

	  @Test(timeout = 4000)
	  public void test13()  throws Throwable  {
	      Predicate<Edge<Object>> predicate0 = Edge.hasDestination((Object) "");
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) "");
	      Edge<Object> edge0 = edge_EdgeBuilder0.to("");
	      boolean boolean0 = edge0.equals(predicate0);
	      assertFalse(boolean0);
	  }

}
