package net.mooctest;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArborescenceTest {

    @Test
    public void of() {
        Arborescence<Object> of = Arborescence.of(ImmutableMap.of());
        Arborescence.of(ImmutableMap.of("123","456"));
    }

    @Test
    public void empty() {
        Arborescence<Object> of = Arborescence.of(ImmutableMap.of());
        Arborescence<Object> empty = Arborescence.empty();
        assertTrue(of.equals(empty));
    }

    @Test
    public void contains() {
        Arborescence<Object> of = Arborescence.of(ImmutableMap.of(10,10,20,20));
        assertTrue(of.contains(new Edge<>(20,20)));
        assertFalse(of.contains(new Edge<>(100,20)));
    }

    @Test
    public void testToString() {
        Arborescence<Object> of = Arborescence.of(ImmutableMap.of(10,10,20,20));
        assertEquals(of.toString(),"Arborescence{10 -> 10, 20 -> 20}");
    }

    @Test
    public void testEquals() {
        Arborescence<Object> of = Arborescence.of(ImmutableMap.of(10,10,20,20));
        assertTrue(of.equals(of));
        assertFalse(of.equals(null));
        assertFalse(of.equals(""));
        assertTrue(of.equals( Arborescence.of(ImmutableMap.of(10,10,20,20))));
    }

    @Test
    public void testHashCode() {
        Arborescence<Object> of = Arborescence.of(ImmutableMap.of(10,10,20,20));
        assertTrue(31==of.hashCode());
    }
}