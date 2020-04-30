package net.mooctest;

import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class DenseWeightedGraphTest {

    @Test
    public void from() {
        DenseWeightedGraph<Integer> from = DenseWeightedGraph.from(new double[][]{{51, 12, 1}, {1, 0, 15}});
        Collection<Integer> nodes = from.getNodes();
        assertEquals(nodes.size(),2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFrom() {
        Set<Integer> s=new HashSet<>();
        s.add(10);
        s.add(50);
        s.add(140);
        DenseWeightedGraph<Integer> from = DenseWeightedGraph.from(s,new double[][]{{51, 12, 1}, {1, 0, 15}});
    }

    @Test
    public void testFrom01() {
        Set<Integer> s=new HashSet<>();
        s.add(10);
        s.add(50);
        DenseWeightedGraph<Integer> from = DenseWeightedGraph.from(s,new double[][]{{51, 12, 1}, {1, 0, 15}});
        Collection<Integer> nodes = from.getNodes();
        assertEquals(nodes.size(),2);
    }

    @Test
    public void getWeightOf() {
        Set<Integer> s=new HashSet<>();
        s.add(10);
        s.add(50);
        DenseWeightedGraph<Integer> from = DenseWeightedGraph.from(s,new double[][]{{51, 12, 1}, {1, 0, 15}});
        double weightOf = from.getWeightOf(10, 50);
        assertTrue(weightOf==1.0);
    }

    @Test
    public void getIncomingEdges() {
        Set<Integer> s=new HashSet<>();
        s.add(10);
        s.add(50);
        DenseWeightedGraph<Integer> from = DenseWeightedGraph.from(s,new double[][]{{51, 12, 1}, {1, 0, 15}});
        Collection<Weighted<Edge<Integer>>> incomingEdges = from.getIncomingEdges(15);
        assertTrue(incomingEdges.size()==0);
    }
}