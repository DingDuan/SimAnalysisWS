package net.mooctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

import com.google.common.base.Predicate;

public class EdgeTest {

	  @Test
	  public void test00(){
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) "");
	      Edge<Object> edge0 = edge_EdgeBuilder0.to((Object) null);
	      boolean boolean0 = edge0.equals(edge0);
	      assertTrue(boolean0);
	  }

	  @Test
	  public void test02(){
		  LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
	      Integer integer0 = new Integer(0);
	      Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
	      linkedHashSet0.add(edge0);
	      Predicate<Edge<Integer>> predicate0 = Edge.competesWith((Set<Edge<Integer>>) linkedHashSet0);
	      assertNotNull(predicate0);
	  }

	  @Test
	  public void test03(){
		  Edge<Edge<String>> edge0 = new Edge<Edge<String>>((Edge<String>) null, (Edge<String>) null);
	      Integer integer0 = new Integer(0);
	      Edge<Integer> edge1 = new Edge<Integer>((Integer) null, integer0);
	      boolean boolean0 = edge1.equals(edge0);
	      assertFalse(boolean0);

	  }

	  @Test
	  public void test04(){
		  Edge<Integer> edge0 = new Edge<Integer>((Integer) null, (Integer) null);
	      Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
	      Edge<String> edge1 = edge_EdgeBuilder0.to("");
	      Edge<Edge<Integer>> edge2 = new Edge<Edge<Integer>>(edge0, edge0);
	      boolean boolean0 = edge2.equals(edge1);
	      assertFalse(boolean0);
	  }

	  @Test
	  public void test05(){
		  Edge<Integer> edge0 = new Edge<Integer>((Integer) null, (Integer) null);
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) edge0);
	      Edge<Object> edge1 = edge_EdgeBuilder0.to((Object) null);
	      LinkedHashSet<Edge<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<String>>>();
	      Predicate<Edge<Edge<String>>> predicate0 = Edge.competesWith((Set<Edge<Edge<String>>>) linkedHashSet0);
	      boolean boolean0 = edge1.equals(predicate0);
	      assertFalse(boolean0);
	  }

	  @Test
	  public void test06(){
		  Edge<Integer> edge0 = new Edge<Integer>((Integer) null, (Integer) null);
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) edge0);
	      Edge<Object> edge1 = edge_EdgeBuilder0.to((Object) null);
	      Edge<Edge<Object>> edge2 = new Edge<Edge<Object>>(edge1, edge1);
	      String string0 = edge2.toString();
	      assertEquals("Edge{source=Edge{source=Edge{source=null, destination=null}, destination=null}, destination=Edge{source=Edge{source=null, destination=null}, destination=null}}", string0);
	  }

	  @Test
	  public void test07(){
		  Predicate<Edge<Object>> predicate0 = Edge.hasDestination((Object) "");
	      assertNotNull(predicate0);
	  }
	  @Test
	  public void test08(){
		  Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
	      Edge<String> edge0 = edge_EdgeBuilder0.to("");
	      Edge<Edge<String>> edge1 = new Edge<Edge<String>>(edge0, edge0);
	      boolean boolean0 = edge1.equals((Object) null);
	      assertFalse(boolean0);
	  }
	  @Test
	  public void test09(){
		  Predicate<Edge<Object>> predicate0 = Edge.isAutoCycle();
	      assertNotNull(predicate0);
	  }
	  @Test
	  public void test10(){
		  Edge<Integer> edge0 = new Edge<Integer>((Integer) null, (Integer) null);
	      Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) edge0);
	      Edge<Object> edge1 = edge_EdgeBuilder0.to((Object) null);
	      edge1.hashCode();
	  }
}
