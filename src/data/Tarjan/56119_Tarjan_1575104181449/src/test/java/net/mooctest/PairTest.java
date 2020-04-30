package net.mooctest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PairTest
{
    Pair pair1 = new Pair(1, 1);
    Pair pair2 = new Pair(2, 2);
    Pair pair3 = new Pair(1, 2);

    @Test(timeout = 4000)
    public void test0()
    {
        assertEquals(false, pair1.equals(0));

        assertEquals(false, pair1.equals(pair2));

        assertEquals(false, pair1.equals(pair3));

        assertEquals(true, pair1.equals(pair1));
    }

    @Test(timeout = 4000)
    public void test1()
    {
        assertEquals(true, pair1.equals(Pair.of(1, 1)));
    }

    @Test(timeout = 4000)
    public void test2()
    {
        assertEquals(993, pair1.hashCode());
        assertEquals(1025, pair2.hashCode());
    }

    @Test(timeout = 4000)
    public void test3()
    {
        assertEquals(true, pair1.toString().equals("Pair{first=1, second=1}"));
        assertEquals(true, pair2.toString().equals("Pair{first=2, second=2}"));
        assertEquals(true, pair3.toString().equals("Pair{first=1, second=2}"));
    }
}
