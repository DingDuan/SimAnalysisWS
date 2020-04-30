package net.mooctest;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class EdgeQueueMapTest
{
    Edge e1 = new Edge(1, 2);
    Edge e2 = new Edge(2, 3);
    Edge e3 = new Edge(3, 4);
    Edge e4 = new Edge(4, 5);
    Edge e5 = new Edge(5, 6);
    Edge e6 = new Edge(6, 3);
    Edge e7 = new Edge(6, 7);
    Edge e8 = new Edge(7, 9);
    Edge e9 = new Edge(9, 8);
    Edge e10 = new Edge(8, 6);

    ExclusiveEdge edge1 = ExclusiveEdge.of(e1, new ArrayList<>(), 2);
    ExclusiveEdge edge2 = ExclusiveEdge.of(e2, new ArrayList<>(), 4);
    ExclusiveEdge edge3 = ExclusiveEdge.of(e3, new ArrayList<>(), 3);
    ExclusiveEdge edge4 = ExclusiveEdge.of(e4, new ArrayList<>(), 3);
    ExclusiveEdge edge5 = ExclusiveEdge.of(e5, new ArrayList<>(), 1);
    ExclusiveEdge edge6 = ExclusiveEdge.of(e6, new ArrayList<>(), 6);
    ExclusiveEdge edge7 = ExclusiveEdge.of(e7, new ArrayList<>(), 2);
    ExclusiveEdge edge8 = ExclusiveEdge.of(e8, new ArrayList<>(), 2);
    ExclusiveEdge edge9 = ExclusiveEdge.of(e9, new ArrayList<>(), 2);
    ExclusiveEdge edge10 = ExclusiveEdge.of(e10, new ArrayList<>(), 5);


    @Test(timeout = 4000)
    public void test0()
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        EdgeQueueMap queueMap = new EdgeQueueMap(Partition.singletons(list));
        EdgeQueueMap.EdgeQueue queue = EdgeQueueMap.EdgeQueue.create(1, Partition.singletons(list));

        queue.addEdge(edge1);
        queue.addEdge(edge2);
        queue.addEdge(edge3);

        queue.popBestEdge();
        ImmutableMap<Integer, Integer> immutableMap1 = new ImmutableMap.Builder<Integer, Integer>().put(1, 2).put(4,3).build();
        Arborescence arborescence = Arborescence.of(immutableMap1);
        queue.popBestEdge(arborescence);
    }

    @Test(timeout = 4000)
    public void test1()
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++)
            list.add(i);

        EdgeQueueMap queueMap = new EdgeQueueMap(Partition.singletons(list));

        queueMap.addEdge(Weighted.weighted(e1, 2));
        queueMap.addEdge(Weighted.weighted(e2, 4));
        queueMap.addEdge(Weighted.weighted(e3, 3));
        queueMap.addEdge(Weighted.weighted(e4, 3));
        queueMap.addEdge(Weighted.weighted(e5, 1));
        queueMap.addEdge(Weighted.weighted(e6, 6));
        queueMap.addEdge(Weighted.weighted(e7, 2));
        queueMap.addEdge(Weighted.weighted(e8, 2));
        queueMap.addEdge(Weighted.weighted(e9, 2));
        queueMap.addEdge(Weighted.weighted(e10, 5));

        ImmutableMap<Integer, Integer> immutableMap1 = new ImmutableMap.Builder<Integer, Integer>().put(1, 2).put(4,3).build();
        Arborescence arborescence = Arborescence.of(immutableMap1);
        try {
            System.out.println(queueMap.popBestEdge(1, arborescence).get());
            fail();
        } catch (IllegalStateException e){

        }
            //queueMap.popBestEdge(1, arborescence).get().toString();
    }


    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        HashSet<Object> hashSet0 = new HashSet<Object>();
        Partition<Object> partition0 = Partition.singletons((Collection<Object>) hashSet0);
        EdgeQueueMap.EdgeQueue<Object> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((Object) treeSet0, partition0);
        Arborescence<Object> arborescence0 = Arborescence.empty();
        assertNotNull(edgeQueueMap_EdgeQueue0.popBestEdge(arborescence0));
    }


    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Partition<String> partition0 = Partition.singletons((Collection<String>) treeSet0);
        EdgeQueueMap<String> edgeQueueMap0 = new EdgeQueueMap<String>(partition0);
        LinkedHashSet<Pair<EdgeQueueMap.EdgeQueue<String>, Weighted<Edge<String>>>> linkedHashSet0 = new LinkedHashSet<Pair<EdgeQueueMap.EdgeQueue<String>, Weighted<Edge<String>>>>(1899);
        EdgeQueueMap.EdgeQueue edgeQueueMap_EdgeQueue0 = edgeQueueMap0.merge("X", linkedHashSet0);
        assertNotNull(edgeQueueMap_EdgeQueue0);
    }



    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Partition<String> partition0 = Partition.singletons((Collection<String>) treeSet0);
        EdgeQueueMap.EdgeQueue<String> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create("", partition0);
        assertNotNull(edgeQueueMap_EdgeQueue0.popBestEdge());
    }
}
