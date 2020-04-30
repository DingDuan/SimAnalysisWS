package net.mooctest;

import com.google.common.base.Predicate;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class EdgeTest {

    @Test
    public void test() {
        Edge<Integer> edge=new Edge(5,10);
    }

    @Test
    public void test01() {
        Edge<Integer> edge=new Edge(5,10);
    }


    @Test
    public void from() {
        Edge.EdgeBuilder<Integer> from = Edge.from(12);
        assertTrue(from.source==12);
        Edge<Integer> to = from.to(24);
        assertTrue(to.source==12);
        assertTrue(to.destination==24);
    }

    @Test
    public void testHashCode() {
        Edge<Integer> edge=new Edge(5,10);
        assertEquals(edge.hashCode(),1126);
    }

    @Test
    public void testToString() {
        Edge<Integer> edge=new Edge(5,10);
        assertEquals(edge.toString(),"Edge{source=5, destination=10}");
    }

    @Test
    public void testEquals() {
        Edge<Integer> edge=new Edge(5,10);
        assertTrue(edge.equals(edge));
        assertFalse(edge.equals(null));
        assertFalse(edge.equals(""));

    }

    @Test
    public void hasDestination() {
        Predicate<Edge<Integer>> edgePredicate = Edge.hasDestination(12);
        assertTrue(edgePredicate.apply(new Edge<>(2,12)));
    }

    @Test
    public void competesWith() {
        Set<Edge<Integer>> edges=new HashSet<>();
        Edge<Integer> integerEdge = new Edge<>(12, 50);
        edges.add(new Edge<>(12,50));
        edges.add(new Edge<>(45,24));
        edges.add(new Edge<>(24,12));
        Predicate<Edge<Integer>> edgePredicate = Edge.competesWith(edges);
        assertFalse(edgePredicate.apply(integerEdge));
        integerEdge = new Edge<>(50, 45);
        assertFalse(edgePredicate.apply(integerEdge));
    }

    @Test
    public void isAutoCycle() {
        Predicate<Edge<Object>> autoCycle = Edge.isAutoCycle();
        assertTrue(autoCycle.apply(new Edge<>(12,12)));
        assertFalse(autoCycle.apply(new Edge<>(2,12)));
    }

    @Test
    public void isIn() {
        Set<Edge<Integer>> edges=new HashSet<>();
        Edge<Integer> integerEdge = new Edge<>(120, 50);
        edges.add(new Edge<>(12,50));
        edges.add(new Edge<>(45,24));
        edges.add(new Edge<>(24,12));
        Predicate<Edge<Integer>> in = Edge.isIn(edges);
        assertFalse(in.apply(integerEdge));
        integerEdge = new Edge<>(12, 50);
        assertTrue(in.apply(integerEdge));
    }
}