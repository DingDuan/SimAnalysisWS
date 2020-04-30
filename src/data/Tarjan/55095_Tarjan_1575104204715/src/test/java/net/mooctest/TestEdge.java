package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Predicate;
import java.util.LinkedHashSet;
import java.util.Set;
import net.mooctest.Edge;



public class TestEdge {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
      Edge<String> edge0 = new Edge<String>("", "");
      Edge<Object> edge1 = new Edge<Object>(edge0, linkedHashSet0);
      boolean boolean0 = edge1.equals(edge1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
      Edge<String> edge0 = edge_EdgeBuilder0.to("");
      Edge<Object> edge1 = new Edge<Object>(edge0, edge0);
      String string0 = edge1.toString();
      assertEquals("Edge{source=Edge{source=, destination=}, destination=Edge{source=, destination=}}", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Edge<Edge<Integer>> edge0 = new Edge<Edge<Integer>>((Edge<Integer>) null, (Edge<Integer>) null);
      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) edge0);
      Integer integer0 = new Integer(0);
      Edge<Object> edge1 = edge_EdgeBuilder0.to(integer0);
      edge1.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Edge.competesWith((Set<Edge<Object>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
      Edge<String> edge0 = edge_EdgeBuilder0.to("nSFl key in enbry: null=%s");
      linkedHashSet0.add(edge0);
      Edge<String> edge1 = new Edge<String>("", "nSFl key in enbry: null=%s");
      linkedHashSet0.add(edge1);
      // Undeclared exception!
      try { 
        Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(Exception e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
      Edge<String> edge0 = edge_EdgeBuilder0.to("");
      Edge<Edge<String>> edge1 = new Edge<Edge<String>>(edge0, edge0);
      Edge<Object> edge2 = new Edge<Object>(edge0, edge1);
      boolean boolean0 = edge1.equals(edge2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Edge<Edge<Integer>> edge0 = new Edge<Edge<Integer>>((Edge<Integer>) null, (Edge<Integer>) null);
      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) edge0);
      Edge edge1 = (Edge)edge_EdgeBuilder0.source;
      assertNotNull(edge1);
      
      Integer integer0 = new Integer(0);
      Edge<Object> edge2 = edge_EdgeBuilder0.to(integer0);
      boolean boolean0 = edge2.equals(edge1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
      boolean boolean0 = edge0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
      Predicate<Edge<String>> predicate0 = Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from((String) null);
      Edge<String> edge0 = edge_EdgeBuilder0.to((String) null);
      linkedHashSet0.add(edge0);
      // Undeclared exception!
      try { 
        Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(Exception e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Predicate<Edge<Object>> predicate0 = Edge.isAutoCycle();
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashSet<Edge<Edge<Integer>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<Integer>>>();
      Predicate<Edge<Edge<Integer>>> predicate0 = Edge.isIn((Set<Edge<Edge<Integer>>>) linkedHashSet0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Predicate<Edge<Integer>> predicate0 = Edge.hasDestination(integer0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
      Edge<String> edge0 = edge_EdgeBuilder0.to("");
      boolean boolean0 = edge0.equals((Object) null);
      assertFalse(boolean0);
  }
}
