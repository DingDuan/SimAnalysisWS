package net.mooctest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EdgeTest
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
        Edge.EdgeBuilder eb1 = Edge.from(1);
        assertEquals(994, e1.hashCode());
        assertEquals("Edge{source=1, destination=2}", e1.toString());
        assertEquals("Edge{source=6, destination=3}", e6.toString());
        System.out.println(e1.toString());
    }

    @Test(timeout = 4000)
    public void test1()
    {
        assertEquals(false, e1.equals(null));
        assertEquals(false, e1.equals(1));
        assertEquals(false, e6.equals(e7));
        assertEquals(true, e6.equals(e6));
    }
}
