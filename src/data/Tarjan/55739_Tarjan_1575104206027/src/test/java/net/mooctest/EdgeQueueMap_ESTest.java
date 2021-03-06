/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 06:19:06 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Optional;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class EdgeQueueMap_ESTest {

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        HashSet<String> hashSet0 = new HashSet<String>();
        Partition<String> partition0 = Partition.singletons((Collection<String>) hashSet0);
        EdgeQueueMap<String> edgeQueueMap0 = new EdgeQueueMap<String>(partition0);
        // Undeclared exception!
        try {
            edgeQueueMap0.addEdge((Weighted<Edge<String>>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.EdgeQueueMap", e);
        }
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        Locale.Category locale_Category0 = Locale.Category.FORMAT;
        LinkedList<Locale.Category> linkedList0 = new LinkedList<Locale.Category>();
        Partition<Locale.Category> partition0 = Partition.singletons((Collection<Locale.Category>) linkedList0);
        ArrayDeque<Weighted<Object>> arrayDeque0 = new ArrayDeque<Weighted<Object>>();
        Partition<Weighted<Object>> partition1 = Partition.singletons((Collection<Weighted<Object>>) arrayDeque0);
        EdgeQueueMap<Weighted<Object>> edgeQueueMap0 = new EdgeQueueMap<Weighted<Object>>(partition1);
        EdgeQueueMap.EdgeQueue<Locale.Category> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(locale_Category0, partition0);
        Arborescence<Locale.Category> arborescence0 = Arborescence.empty();
        Optional<ExclusiveEdge<Locale.Category>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge(arborescence0);
        Weighted<Object> weighted0 = Weighted.weighted((Object) optional0, 1029.957);
        PriorityQueue<Pair<EdgeQueueMap.EdgeQueue<Weighted<Object>>, Weighted<Edge<Weighted<Object>>>>> priorityQueue0 = new PriorityQueue<Pair<EdgeQueueMap.EdgeQueue<Weighted<Object>>, Weighted<Edge<Weighted<Object>>>>>();
        Pair<EdgeQueueMap.EdgeQueue<Weighted<Object>>, Weighted<Edge<Weighted<Object>>>> pair0 = (Pair<EdgeQueueMap.EdgeQueue<Weighted<Object>>, Weighted<Edge<Weighted<Object>>>>) mock(Pair.class, new ViolatedAssumptionAnswer());
        priorityQueue0.add(pair0);
        // Undeclared exception!
        try {
            edgeQueueMap0.merge(weighted0, priorityQueue0);
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
        TreeSet<EdgeQueueMap.EdgeQueue<String>> treeSet0 = new TreeSet<EdgeQueueMap.EdgeQueue<String>>();
        ArrayList<Object> arrayList0 = new ArrayList<Object>();
        Partition<Object> partition0 = Partition.singletons((Collection<Object>) arrayList0);
        EdgeQueueMap<Object> edgeQueueMap0 = new EdgeQueueMap<Object>(partition0);
        Stack<Pair<EdgeQueueMap.EdgeQueue<Object>, Weighted<Edge<Object>>>> stack0 = new Stack<Pair<EdgeQueueMap.EdgeQueue<Object>, Weighted<Edge<Object>>>>();
        EdgeQueueMap.EdgeQueue edgeQueueMap_EdgeQueue0 = edgeQueueMap0.merge(treeSet0, stack0);
        assertNotNull(edgeQueueMap_EdgeQueue0);
    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        Arborescence<Comparable<Object>> arborescence0 = Arborescence.empty();
        Vector<Object> vector0 = new Vector<Object>(2775);
        Partition<Object> partition0 = Partition.singletons((Collection<Object>) vector0);
        EdgeQueueMap<Object> edgeQueueMap0 = new EdgeQueueMap<Object>(partition0);
        Optional<ExclusiveEdge<Object>> optional0 = edgeQueueMap0.popBestEdge(arborescence0, (Arborescence<Object>) null);
        assertNotNull(optional0);
    }

    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        EdgeQueueMap<EdgeQueueMap.EdgeQueue<Object>> edgeQueueMap0 = new EdgeQueueMap<EdgeQueueMap.EdgeQueue<Object>>((Partition<EdgeQueueMap.EdgeQueue<Object>>) null);
        Weighted<Object> weighted0 = new Weighted<Object>(edgeQueueMap0, 0.0);
        HashSet<Weighted<Object>> hashSet0 = new HashSet<Weighted<Object>>();
        hashSet0.add(weighted0);
        Partition<Weighted<Object>> partition0 = Partition.singletons((Collection<Weighted<Object>>) hashSet0);
        EdgeQueueMap.EdgeQueue<Weighted<Object>> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(weighted0, partition0);
        Edge<Weighted<Object>> edge0 = new Edge<Weighted<Object>>(weighted0, weighted0);
        ExclusiveEdge<Weighted<Object>> exclusiveEdge0 = ExclusiveEdge.of(edge0, 1.0);
        edgeQueueMap_EdgeQueue0.addEdge(exclusiveEdge0);
        assertEquals(1.0, exclusiveEdge0.weight, 0.01);
    }

    @Test(timeout = 4000)
    public void test5()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        EdgeQueueMap.EdgeQueue<String> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create("", partition0);
        Weighted<Object> weighted0 = Weighted.weighted((Object) edgeQueueMap_EdgeQueue0, (-1.0));
        Partition<Weighted<Object>> partition1 = (Partition<Weighted<Object>>) mock(Partition.class, new ViolatedAssumptionAnswer());
        doReturn((Object) null).when(partition1).componentOf(nullable(Weighted.class));
        EdgeQueueMap.EdgeQueue<Weighted<Object>> edgeQueueMap_EdgeQueue1 = EdgeQueueMap.EdgeQueue.create(weighted0, partition1);
        Edge<Weighted<Object>> edge0 = (Edge<Weighted<Object>>) mock(Edge.class, new ViolatedAssumptionAnswer());
        ExclusiveEdge<Weighted<Object>> exclusiveEdge0 = ExclusiveEdge.of(edge0, (double) (-1));
        edgeQueueMap_EdgeQueue1.addEdge(exclusiveEdge0);
        assertEquals((-1.0), exclusiveEdge0.weight, 0.01);
    }

    @Test(timeout = 4000)
    public void test6()  throws Throwable  {
        HashSet<String> hashSet0 = new HashSet<String>();
        Partition<String> partition0 = Partition.singletons((Collection<String>) hashSet0);
        EdgeQueueMap.EdgeQueue<String> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create("", partition0);
        Optional<ExclusiveEdge<String>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge();
        assertNotNull(optional0);
    }
}
