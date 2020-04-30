package net.mooctest;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ExclusiveEdgeTest {

    @Test
    public void of() {
        ExclusiveEdge<Integer> of = ExclusiveEdge.of(new Edge<>(10, 20), 51);
        assertTrue(of.excluded.size()==0);
        assertTrue(of.weight==51);
        assertEquals(of.edge,new Edge<>(10,20));
    }

    @Test
    public void testOf() {
        ExclusiveEdge<Integer> of = ExclusiveEdge.of(new Edge<>(10, 20),new ArrayList<>(), 51);
        assertTrue(of.excluded.size()==0);
        assertTrue(of.weight==51);
        assertEquals(of.edge,new Edge<>(10,20));
        assertTrue(of.compareTo(ExclusiveEdge.of(new Edge<>(10, 20), 51))==0);
    }

}