/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 13:30:16 GMT+08:00 2019
 */

package net.mooctest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;

public class EdgeQueueMapTest_{

  @Test(timeout = 4000)
  public void test_E2()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Pair<Integer, Object> pair0 = new Pair<Integer, Object>(integer0, (Object) null);
      HashSet<Pair<Integer, Object>> hashSet0 = new HashSet<Pair<Integer, Object>>();
      Partition<Pair<Integer, Object>> partition0 = Partition.singletons((Collection<Pair<Integer, Object>>) hashSet0);
      EdgeQueueMap.EdgeQueue<Pair<Integer, Object>> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(pair0, partition0);
      Arborescence<Pair<Integer, Object>> arborescence0 = Arborescence.of((ImmutableMap<Pair<Integer, Object>, Pair<Integer, Object>>) null);
      Optional<ExclusiveEdge<Pair<Integer, Object>>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge(arborescence0);
      assertNotNull(optional0);
  }


  @Test(timeout = 4000)
  public void test_E5()  throws Throwable  {
      LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
      Partition<Edge<Object>> partition0 = Partition.singletons((Collection<Edge<Object>>) linkedHashSet0);
      EdgeQueueMap.EdgeQueue<Edge<Object>> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((Edge<Object>) null, partition0);
      Optional<ExclusiveEdge<Edge<Object>>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge();
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test_E6()  throws Throwable  {
      ArrayDeque<Pair<Integer, String>> arrayDeque0 = new ArrayDeque<Pair<Integer, String>>();
      Partition<Pair<Integer, String>> partition0 = Partition.singletons((Collection<Pair<Integer, String>>) arrayDeque0);
      EdgeQueueMap<Pair<Integer, String>> edgeQueueMap0 = new EdgeQueueMap<Pair<Integer, String>>(partition0);
      Integer integer0 = new Integer(0);
      Pair<Integer, String> pair0 = new Pair<Integer, String>(integer0, "");
      PriorityQueue<Pair<EdgeQueueMap.EdgeQueue<Pair<Integer, String>>, Weighted<Edge<Pair<Integer, String>>>>> priorityQueue0 = new PriorityQueue<Pair<EdgeQueueMap.EdgeQueue<Pair<Integer, String>>, Weighted<Edge<Pair<Integer, String>>>>>();
      EdgeQueueMap.EdgeQueue edgeQueueMap_EdgeQueue0 = edgeQueueMap0.merge(pair0, priorityQueue0);
      assertNotNull(edgeQueueMap_EdgeQueue0);
  }
}
