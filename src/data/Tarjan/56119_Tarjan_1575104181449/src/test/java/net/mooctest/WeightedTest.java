package net.mooctest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeightedTest
{
    @Test(timeout = 4000)
    public void test0()
    {
        Weighted weighted = Weighted.weighted(1, 2);
        assertEquals("Weighted{val=1, weight=2.0}", weighted.toString());
    }
}
