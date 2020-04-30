package net.mooctest;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Comparator;
import java.util.function.Consumer;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import com.google.common.base.Predicate;


public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
	}
@Test(timeout = 4000)
  public void testA0(){
      Arborescence<Integer> a0 = Arborescence.empty();
      ImmutableBiMap<Arborescence<Integer>, Arborescence<Integer>> immutableBiMap0 = ImmutableBiMap.of(a0, a0);
      Arborescence<Arborescence<Integer>> a1 = Arborescence.of((ImmutableMap<Arborescence<Integer>, Arborescence<Integer>>) immutableBiMap0);
      Arborescence<Arborescence<Object>> a2 = Arborescence.empty();
      boolean boolean0 = a2.equals(a1);
      assertFalse(boolean0);
  }
  
  @Test(timeout = 4000)
  public void testA1(){
  Arborescence<Comparable<String>> a0 = Arborescence.of((ImmutableMap<Comparable<String>, Comparable<String>>) null);
  try{
  a0.toString();
  }catch(NullPointerException e){}
  }
  
@Test(timeout = 4000)
public void testA4() {
    Arborescence<Object> a0 = Arborescence.empty();
    Arborescence<Comparable<Edge<Object>>> a1 = Arborescence.empty();
    boolean boolean0 = a1.equals(a0);
    assertTrue(boolean0);
}

@Test(timeout = 4000)
public void testA5() {
    Arborescence<Comparable<Object>> a0 = Arborescence.empty();
    boolean boolean0 = a0.equals((Object) null);
    assertFalse(boolean0);
}

@Test(timeout = 4000)
public void testA6() {
    ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "");
    Arborescence<String> a0 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
    boolean boolean0 = a0.equals("");
    assertFalse(boolean0);
}

@Test(timeout = 4000)
public void testA7() {
    ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "");
    Arborescence<String> a0 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
    String string0 = a0.toString();
    assertEquals("Arborescence{ -> }", string0);
}

@Test(timeout = 4000)
public void testA8() {
    ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "");
    Arborescence<String> a0 = Arborescence.of((ImmutableMap<String, String>) immutableSortedMap0);
    Edge<String> edge0 = new Edge<String>("Arborescence{ -> }", "");
    boolean boolean0 = a0.contains(edge0);
    assertFalse(boolean0);
}

@Test(timeout = 4000)
public void testA9() {
    Arborescence<Integer> a0 = Arborescence.empty();
    ImmutableBiMap<Arborescence<Integer>, Arborescence<Integer>> immutableBiMap0 = ImmutableBiMap.of(a0, a0);
    Arborescence<Arborescence<Integer>> a1 = Arborescence.of((ImmutableMap<Arborescence<Integer>, Arborescence<Integer>>) immutableBiMap0);
    Edge<Arborescence<Integer>> edge0 = new Edge<Arborescence<Integer>>(a0, a0);
    boolean boolean0 = a1.contains(edge0);
    assertTrue(boolean0);
}

@Test(timeout = 4000)
public void testA10() {
    Arborescence<String> a0 = Arborescence.empty();
    Edge<String> edge0 = new Edge<String>(" -> ", "tmgr:^F6");
    boolean boolean0 = a0.contains(edge0);
    assertFalse(boolean0);
}

@Test(timeout = 4000)
  public void testCLE0(){
      TreeSet<Weighted<Edge<Integer>>> ts0 = new TreeSet<Weighted<Edge<Integer>>>((Comparator<? super Weighted<Edge<Integer>>>) null);
      SparseWeightedGraph<Integer> swg0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Integer>>>) ts0);
      ChuLiuEdmonds.PartialSolution<Integer> cle0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) swg0);
      Integer i0 = new Integer(1781);
      Arborescence<Integer> a0 = Arborescence.empty();
      Optional<ExclusiveEdge<Integer>> o0 = cle0.popBestEdge(i0, a0);
      assertNotNull(o0);
  }

  @Test(timeout = 4000)
  public void testCLE1(){
      FibonacciQueue<Weighted<Edge<Comparable<Integer>>>> fq0 = FibonacciQueue.create();
      SparseWeightedGraph<Comparable<Integer>> swg0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Comparable<Integer>>>>) fq0);
      ChuLiuEdmonds.PartialSolution<Comparable<Integer>> cle0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Comparable<Integer>>) swg0);
      Optional<ExclusiveEdge<Comparable<Integer>>> o0 = cle0.popBestEdge((Comparable<Integer>) null);
      assertNotNull(o0);
  }

  @Test(timeout = 4000)
  public void testCLE2(){
      PriorityQueue<Weighted<Edge<Comparable<Weighted<Edge<String>>>>>> pq0 = new PriorityQueue<Weighted<Edge<Comparable<Weighted<Edge<String>>>>>>();
      SparseWeightedGraph<Comparable<Weighted<Edge<String>>>> swg0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Comparable<Weighted<Edge<String>>>>>>) pq0);
      ChuLiuEdmonds.PartialSolution<Comparable<Weighted<Edge<String>>>> cle0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Comparable<Weighted<Edge<String>>>>) swg0);
      Set<Comparable<Weighted<Edge<String>>>> s0 = cle0.getNodes();
      assertTrue(s0.isEmpty());
  }

@Test(timeout = 4000)
  public void testCLE3(){
      ArrayList<Object> al0 = new ArrayList<Object>();
      double[][] da0 = new double[2][7];
      double[] da1 = new double[5];
      Object o0 = new Object();
      al0.add(o0);
      al0.add((Object) da1);
      DenseWeightedGraph<Object> dwg0 = DenseWeightedGraph.from((Iterable<Object>) al0, da0);
      Weighted<Arborescence<Object>> w0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) dwg0);
      assertEquals(0.0, w0.weight, 0.01);
  }
  
  @Test(timeout = 4000)
  public void testCLE4(){
      Locale.Category l0 = Locale.Category.DISPLAY;
      EnumSet<Locale.Category> es0 = EnumSet.of(l0, l0);
      Vector<Weighted<Edge<Locale.Category>>> v0 = new Vector<Weighted<Edge<Locale.Category>>>(981, 981);
      SparseWeightedGraph<Locale.Category> swg0 = SparseWeightedGraph.from((Iterable<Locale.Category>) es0, (Iterable<Weighted<Edge<Locale.Category>>>) v0);
      TreeSet<Edge<Locale.Category>> ts0 = new TreeSet<Edge<Locale.Category>>();
      Weighted<Arborescence<Locale.Category>> w0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Locale.Category>) swg0, (Set<Edge<Locale.Category>>) ts0, (Set<Edge<Locale.Category>>) ts0);
      assertEquals(0.0, w0.weight, 0.01);
  }
  
  @Test(timeout = 4000)
  public void testCLE5(){
      LinkedHashSet<Edge<Integer>> lhs0 = new LinkedHashSet<Edge<Integer>>();
      LinkedHashSet<Edge<Integer>> lhs1 = new LinkedHashSet<Edge<Integer>>();
      // Undeclared exception!
      try { 
        ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) null, (Set<Edge<Integer>>) lhs0, (Set<Edge<Integer>>) lhs1);
      } catch(NullPointerException e) {}
  }
  
  @Test(timeout = 4000)
  public void testCLE6(){
      PriorityQueue<Weighted<Edge<Comparable<Locale.Category>>>> pq0 = new PriorityQueue<Weighted<Edge<Comparable<Locale.Category>>>>(2963);
      SparseWeightedGraph<Comparable<Locale.Category>> swg0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Comparable<Locale.Category>>>>) pq0);
      Weighted<Arborescence<Comparable<Locale.Category>>> w0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Comparable<Locale.Category>>) swg0, (Comparable<Locale.Category>) null);
      assertEquals(0.0, w0.weight, 0.01);
  }
  
  @Test(timeout = 4000)
  public void testDWG0(){
      double[][] da0 = new double[4][3];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(da0);
      Integer i0 = new Integer(1);
      Integer i1 = new Integer(1);
      double double0 = denseWeightedGraph0.getWeightOf(i1, i0);
      assertEquals(0.0, double0, 0.01);
  }
  
  @Test(timeout = 4000)
  public void testDWG1(){
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      double[][] da0 = new double[2][3];
      // Undeclared exception!
      try { 
        DenseWeightedGraph.from((Iterable<String>) set0, da0);     
      } catch(IllegalArgumentException e) {}
  }
  
  @Test(timeout = 4000)
  public void testDWG2() {
      double[][] da0 = new double[4][3];
      double[] da1 = new double[2];
      da1[1] = 1466.2;
      da0[1] = da1;
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(da0);
      Integer i0 = new Integer(1);
      double double0 = denseWeightedGraph0.getWeightOf(i0, i0);
      assertEquals(1466.2, double0, 0.01);
  }
  
  @Test(timeout = 4000)
  public void testDWG3() {
      ChronoUnit chronoUnit0 = ChronoUnit.ERAS;
      ChronoUnit chronoUnit1 = ChronoUnit.FOREVER;
      EnumSet<ChronoUnit> enumSet0 = EnumSet.of(chronoUnit0, chronoUnit0, chronoUnit0, chronoUnit0, chronoUnit1);
      double[][] da0 = new double[2][2];
      DenseWeightedGraph<ChronoUnit> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<ChronoUnit>) enumSet0, da0);
      assertNotNull(denseWeightedGraph0);
  }

  @Test(timeout = 4000)
  public void testDWG4() {
      double[][] da0 = new double[4][2];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(da0);
      Integer i0 = new Integer(0);
      Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(i0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void testDWG6() {
      double[][] da0 = new double[4][3];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(da0);
      Integer i0 = new Integer(1);
      Integer i1 = new Integer(8287);
      double double0 = denseWeightedGraph0.getWeightOf(i0, i1);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void testDWG7() {
      double[][] da0 = new double[0][0];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(da0);
      Integer i0 = new Integer(59);
      double double0 = denseWeightedGraph0.getWeightOf(i0, i0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void testDWG8() {
      double[][] da0 = new double[4][2];
      TreeSet<TreeSet<String>> treeSet0 = new TreeSet<TreeSet<String>>();
      try { 
        DenseWeightedGraph.from((Iterable<TreeSet<String>>) treeSet0, da0);
      } catch(IllegalArgumentException e) {}
  }

  @Test(timeout = 4000)
  public void testDWG9() {
      double[][] da0 = new double[0][0];
      DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(da0);
      Collection<Integer> collection0 = denseWeightedGraph0.getNodes();
      assertNotNull(collection0);
  }
  
  @Test(timeout = 4000)
public void  testE4() {
    LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
    Integer  i0 = new Integer(0);
    Edge<Integer>  e0 = new Edge<Integer>( i0,  i0);
    linkedHashSet0.add( e0);
    Predicate<Edge<Integer>> predicate0 = Edge.competesWith((Set<Edge<Integer>>) linkedHashSet0);
    assertNotNull(predicate0);
}

@Test(timeout = 4000)
public void  testE5() {
    Integer  i0 = new Integer(0);
    Edge<Object>  e0 = new Edge<Object>( i0, "+");
    Edge<Integer>  e1 = new Edge<Integer>( i0, (Integer) null);
    boolean boolean0 =  e1.equals( e0);
    assertFalse(boolean0);
}

@Test(timeout = 4000)
public void  testE6() {
    Edge<String>  e0 = new Edge<String>((String) null, "");
    Edge<Object>  e1 = new Edge<Object>("", (Object) null);
    boolean boolean0 =  e0.equals( e1);
    assertFalse(boolean0);
}

@Test(timeout = 4000)
public void  testE7() {
    Object object0 = new Object();
    Edge<Object>  e0 = new Edge<Object>((Object) null, object0);
    boolean boolean0 =  e0.equals( e0);
    assertTrue(boolean0);
}

@Test(timeout = 4000)
public void  testE8() {
    Edge<Object>  e0 = new Edge<Object>("", (Object) null);
    boolean boolean0 =  e0.equals((Object) null);
    assertFalse(boolean0);
}

@Test(timeout = 4000)
public void  testE9() {
    Edge<String>  e0 = new Edge<String>("HiAR_?kj,", "HiAR_?kj,");
    boolean boolean0 =  e0.equals("HiAR_?kj,");
    assertFalse(boolean0);
}

@Test(timeout = 4000)
public void  testE10() {
    Edge<String>  e0 = new Edge<String>("HiAR_?kj,", "HiAR_?kj,");
     e0.hashCode();
}

@Test(timeout = 4000)
public void  testE11() {
    Predicate<Edge<Object>> predicate0 = Edge.hasDestination((Object) null);
    assertNotNull(predicate0);
}

@Test(timeout = 4000)
public void  testE12() {
    Predicate<Edge<Edge<String>>> predicate0 = Edge.isAutoCycle();
    assertNotNull(predicate0);
}

@Test(timeout = 4000)
public void  testE13() {
    LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
    Predicate<Edge<Integer>> predicate0 = Edge.isIn((Set<Edge<Integer>>) linkedHashSet0);
    assertNotNull(predicate0);
}

@Test(timeout = 4000)
  public void testEQM1(){
      MinguoEra minguoEra0 = MinguoEra.ROC;
      PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>();
      Partition<Object> partition0 = Partition.singletons((Collection<Object>) priorityQueue0);
      EdgeQueueMap.EdgeQueue<Object> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((Object) minguoEra0, partition0);
      Optional<ExclusiveEdge<Object>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge((Arborescence<Object>) null);
      assertNotNull(optional0);
  }


}
