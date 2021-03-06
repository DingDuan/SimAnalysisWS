/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:15:11 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Vector;
import net.mooctest.Arborescence;
import net.mooctest.Edge;
import net.mooctest.EdgeQueueMap;
import net.mooctest.ExclusiveEdge;
import net.mooctest.FibonacciQueue;
import net.mooctest.Pair;
import net.mooctest.Partition;
import net.mooctest.Weighted;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EdgeQueueMap_ESTest extends EdgeQueueMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<Locale.Category> arrayList0 = new ArrayList<Locale.Category>();
      Partition<Locale.Category> partition0 = Partition.singletons((Collection<Locale.Category>) arrayList0);
      EdgeQueueMap<Locale.Category> edgeQueueMap0 = new EdgeQueueMap<Locale.Category>(partition0);
      Edge<Locale.Category> edge0 = (Edge<Locale.Category>) mock(Edge.class, new ViolatedAssumptionAnswer());
      Weighted<Edge<Locale.Category>> weighted0 = new Weighted<Edge<Locale.Category>>(edge0, 0.0);
      // Undeclared exception!
      try { 
        edgeQueueMap0.addEdge(weighted0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Partition", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "net.mooctest.EdgeQueueMap", "net.mooctest.EdgeQueueMap", "");
      ImmutableSortedSet<String> immutableSortedSet0 = immutableSortedMap0.navigableKeySet();
      Partition<String> partition0 = Partition.singletons((Collection<String>) immutableSortedSet0);
      EdgeQueueMap.EdgeQueue<String> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create("", partition0);
      Optional<ExclusiveEdge<String>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge((Arborescence<String>) null);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FibonacciQueue<Comparable<String>> fibonacciQueue0 = FibonacciQueue.create();
      Partition<Comparable<String>> partition0 = Partition.singletons((Collection<Comparable<String>>) fibonacciQueue0);
      EdgeQueueMap<Comparable<String>> edgeQueueMap0 = new EdgeQueueMap<Comparable<String>>(partition0);
      LinkedHashSet<Pair<EdgeQueueMap.EdgeQueue<Comparable<String>>, Weighted<Edge<Comparable<String>>>>> linkedHashSet0 = new LinkedHashSet<Pair<EdgeQueueMap.EdgeQueue<Comparable<String>>, Weighted<Edge<Comparable<String>>>>>(2912);
      Pair<EdgeQueueMap.EdgeQueue<Comparable<String>>, Weighted<Edge<Comparable<String>>>> pair0 = (Pair<EdgeQueueMap.EdgeQueue<Comparable<String>>, Weighted<Edge<Comparable<String>>>>) mock(Pair.class, new ViolatedAssumptionAnswer());
      linkedHashSet0.add(pair0);
      // Undeclared exception!
      try { 
        edgeQueueMap0.merge((Comparable<String>) null, linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.EdgeQueueMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayDeque<Object> arrayDeque0 = new ArrayDeque<Object>();
      Partition<Object> partition0 = Partition.singletons((Collection<Object>) arrayDeque0);
      EdgeQueueMap<Object> edgeQueueMap0 = new EdgeQueueMap<Object>(partition0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<Pair<EdgeQueueMap.EdgeQueue<Object>, Weighted<Edge<Object>>>> priorityQueue0 = new PriorityQueue<Pair<EdgeQueueMap.EdgeQueue<Object>, Weighted<Edge<Object>>>>(comparator0);
      EdgeQueueMap.EdgeQueue edgeQueueMap_EdgeQueue0 = edgeQueueMap0.merge((Object) null, priorityQueue0);
      assertNotNull(edgeQueueMap_EdgeQueue0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector<ExclusiveEdge<String>> vector0 = new Vector<ExclusiveEdge<String>>();
      Partition<ExclusiveEdge<String>> partition0 = Partition.singletons((Collection<ExclusiveEdge<String>>) vector0);
      EdgeQueueMap<ExclusiveEdge<String>> edgeQueueMap0 = new EdgeQueueMap<ExclusiveEdge<String>>(partition0);
      Edge<String> edge0 = (Edge<String>) mock(Edge.class, new ViolatedAssumptionAnswer());
      LinkedList<Edge<String>> linkedList0 = new LinkedList<Edge<String>>();
      ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<String>>) linkedList0, 611.5661280224242);
      Optional<ExclusiveEdge<ExclusiveEdge<String>>> optional0 = edgeQueueMap0.popBestEdge(exclusiveEdge0, (Arborescence<ExclusiveEdge<String>>) null);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      FibonacciQueue<Weighted<Integer>> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Weighted<Integer>>) comparator0);
      Partition<Weighted<Integer>> partition0 = Partition.singletons((Collection<Weighted<Integer>>) fibonacciQueue0);
      EdgeQueueMap<Weighted<Integer>> edgeQueueMap0 = new EdgeQueueMap<Weighted<Integer>>(partition0);
      PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>();
      Partition<Object> partition1 = Partition.singletons((Collection<Object>) priorityQueue0);
      EdgeQueueMap.EdgeQueue<Object> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((Object) edgeQueueMap0, partition1);
      Weighted<Object> weighted0 = new Weighted<Object>(edgeQueueMap_EdgeQueue0, 4647.7);
      Partition<Weighted<Object>> partition2 = (Partition<Weighted<Object>>) mock(Partition.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(partition2).componentOf(nullable(net.mooctest.Weighted.class));
      EdgeQueueMap.EdgeQueue<Weighted<Object>> edgeQueueMap_EdgeQueue1 = EdgeQueueMap.EdgeQueue.create(weighted0, partition2);
      Edge<Weighted<Object>> edge0 = (Edge<Weighted<Object>>) mock(Edge.class, new ViolatedAssumptionAnswer());
      ExclusiveEdge<Weighted<Object>> exclusiveEdge0 = ExclusiveEdge.of(edge0, 4647.7);
      edgeQueueMap_EdgeQueue1.addEdge(exclusiveEdge0);
      assertEquals(4647.7, exclusiveEdge0.weight, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
      Vector<Edge<Object>> vector0 = new Vector<Edge<Object>>();
      Partition<Edge<Object>> partition0 = Partition.singletons((Collection<Edge<Object>>) vector0);
      EdgeQueueMap.EdgeQueue<Edge<Object>> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(edge0, partition0);
      Optional<ExclusiveEdge<Edge<Object>>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge();
      assertNotNull(optional0);
  }
}
