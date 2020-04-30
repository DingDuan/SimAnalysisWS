/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:15:11 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
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
import org.junit.runner.RunWith;

public class EdgeQueueMap_ESTest {

  @Test(timeout = 1000)
  public void testeac2ea4f_824c_4866_9435_9d3994f4f4011()  throws Throwable  {
      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "net.mooctest.EdgeQueueMap", "net.mooctest.EdgeQueueMap", "");
      ImmutableSortedSet<String> immutableSortedSet0 = immutableSortedMap0.navigableKeySet();
      Partition<String> partition0 = Partition.singletons((Collection<String>) immutableSortedSet0);
      EdgeQueueMap.EdgeQueue<String> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create("", partition0);
      Optional<ExclusiveEdge<String>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge((Arborescence<String>) null);
      assertNotNull(optional0);
  }
}
