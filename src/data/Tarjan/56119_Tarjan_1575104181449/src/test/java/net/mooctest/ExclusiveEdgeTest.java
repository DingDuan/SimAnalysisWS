package net.mooctest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ExclusiveEdgeTest
{
    Edge e1 = new Edge(1, 2);
    Edge e2 = new Edge(2, 3);
    Edge e3 = new Edge(3, 4);
    Edge e4 = new Edge(4, 5);
    Edge e5 = new Edge(5, 6);
    Edge e6 = new Edge(6, 3);
    Edge e7 = new Edge(6, 7);

    @Test(timeout = 4000)
    public void test0()
    {
        List edgeList = new ArrayList<Edge>();
        edgeList.add(e2);
        ExclusiveEdge edge1 = ExclusiveEdge.of(e1, edgeList, 2);
        ExclusiveEdge edge2 = ExclusiveEdge.of(e1, 2);

        assertEquals(0, edge1.compareTo(edge2));
    }

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        LinkedList<Edge<Integer>> linkedList0 = new LinkedList<Edge<Integer>>();
        ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of((Edge<Integer>) null, (List<Edge<Integer>>) linkedList0, (-16.115655782392587));
        int int0 = exclusiveEdge0.compareTo(exclusiveEdge0);
        assertEquals((-16.115655782392587), exclusiveEdge0.weight, 0.01);
        assertEquals(0, int0);
    }


}
