/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:40:03 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Optional;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
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

public class EdgeQueueMapTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      EnumSet<Locale.FilteringMode> enumSet0 = EnumSet.of(locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0);
      Partition<Locale.FilteringMode> partition0 = Partition.singletons((Collection<Locale.FilteringMode>) enumSet0);
      EdgeQueueMap.EdgeQueue<Locale.FilteringMode> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(locale_FilteringMode0, partition0);
      Edge<Locale.FilteringMode> edge0 = (Edge<Locale.FilteringMode>) mock(Edge.class, new ViolatedAssumptionAnswer());
      ExclusiveEdge<Locale.FilteringMode> exclusiveEdge0 = ExclusiveEdge.of(edge0, (-800.0));
      // Undeclared exception!
      try { 
        edgeQueueMap_EdgeQueue0.addEdge(exclusiveEdge0);
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
      HashSet<String> hashSet0 = new HashSet<String>(3, 3);
      Partition<String> partition0 = Partition.singletons((Collection<String>) hashSet0);
      EdgeQueueMap<String> edgeQueueMap0 = new EdgeQueueMap<String>(partition0);
      HashSet<Pair<EdgeQueueMap.EdgeQueue<String>, Weighted<Edge<String>>>> hashSet1 = new HashSet<Pair<EdgeQueueMap.EdgeQueue<String>, Weighted<Edge<String>>>>();
      Pair<EdgeQueueMap.EdgeQueue<String>, Weighted<Edge<String>>> pair0 = (Pair<EdgeQueueMap.EdgeQueue<String>, Weighted<Edge<String>>>) mock(Pair.class, new ViolatedAssumptionAnswer());
      hashSet1.add(pair0);
      // Undeclared exception!
      try { 
        edgeQueueMap0.merge("Dl?l/yiwEeQY{Q1.X,T", hashSet1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.EdgeQueueMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Partition<String> partition0 = Partition.singletons((Collection<String>) vector0);
      EdgeQueueMap<String> edgeQueueMap0 = new EdgeQueueMap<String>(partition0);
      HashSet<Pair<EdgeQueueMap.EdgeQueue<String>, Weighted<Edge<String>>>> hashSet0 = new HashSet<Pair<EdgeQueueMap.EdgeQueue<String>, Weighted<Edge<String>>>>();
      EdgeQueueMap.EdgeQueue edgeQueueMap_EdgeQueue0 = edgeQueueMap0.merge("", hashSet0);
      assertNotNull(edgeQueueMap_EdgeQueue0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      EdgeQueueMap<Weighted<Object>> edgeQueueMap0 = new EdgeQueueMap<Weighted<Object>>((Partition<Weighted<Object>>) null);
      Weighted<Object> weighted0 = Weighted.weighted((Object) treeSet0, (double) 2336);
      Arborescence<Weighted<Object>> arborescence0 = Arborescence.empty();
      Optional<ExclusiveEdge<Weighted<Object>>> optional0 = edgeQueueMap0.popBestEdge(weighted0, arborescence0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Weighted<String> weighted0 = new Weighted<String>("", (-1.0));
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      FibonacciQueue<Weighted<String>> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Weighted<String>>) comparator0);
      Partition<Weighted<String>> partition0 = Partition.singletons((Collection<Weighted<String>>) fibonacciQueue0);
      EdgeQueueMap.EdgeQueue<Weighted<String>> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(weighted0, partition0);
      Optional<ExclusiveEdge<Weighted<String>>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge();
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Partition<String> partition0 = Partition.singletons((Collection<String>) set0);
      EdgeQueueMap.EdgeQueue<String> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create("o;Izq2]w", partition0);
      Arborescence<String> arborescence0 = Arborescence.empty();
      Optional<ExclusiveEdge<String>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge(arborescence0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EdgeQueueMap<ExclusiveEdge<Object>> edgeQueueMap0 = new EdgeQueueMap<ExclusiveEdge<Object>>((Partition<ExclusiveEdge<Object>>) null);
      Edge<ExclusiveEdge<Object>> edge0 = (Edge<ExclusiveEdge<Object>>) mock(Edge.class, new ViolatedAssumptionAnswer());
      Weighted<Edge<ExclusiveEdge<Object>>> weighted0 = new Weighted<Edge<ExclusiveEdge<Object>>>(edge0, (-1.0));
      // Undeclared exception!
      try { 
        edgeQueueMap0.addEdge(weighted0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.EdgeQueueMap", e);
      }
  }
}
