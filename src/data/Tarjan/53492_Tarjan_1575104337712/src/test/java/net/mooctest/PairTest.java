package net.mooctest;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairTest {

    @Test
    public void test01(){
        Pair<Integer,Integer> pair=new Pair<>(10,21);
    }

    @Test
    public void of() {
        Pair<Integer,Integer> pair=new Pair<>(12,15);
        Pair<Integer, Integer> of = Pair.of(12, 15);
        assertTrue(of.equals(pair));
        assertFalse(of.equals("123"));
        assertFalse(of.equals(Pair.of(17, 15)));
    }

    @Test
    public void testHashCode() {
        Pair<Integer,Integer> pair=new Pair<>(12,15);
        assertTrue(pair.hashCode()==1348);
    }

    @Test
    public void testToString() {
        Pair<Integer,Integer> pair=new Pair<>(12,15);
        assertEquals(pair.toString(),"Pair{first=12, second=15}");
    }
}