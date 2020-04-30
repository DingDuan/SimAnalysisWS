package net.mooctest;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class ArborescenceTest
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
        ImmutableMap<Integer, Integer> immutableMap1 = new ImmutableMap.Builder<Integer, Integer>().put(1, 2).put(4,3).build();
        ImmutableMap<Integer, Integer> immutableMap2 = new ImmutableMap.Builder<Integer, Integer>().build();

        Arborescence arborescence = Arborescence.of(immutableMap1);
        Arborescence arborescence1 = Arborescence.of(immutableMap2);

        assertEquals(false, arborescence.contains(e2));
        assertEquals(false, arborescence.contains(e1));
        assertEquals(true, arborescence.contains(e3));

        assertEquals(false, arborescence.equals(arborescence1));
        assertEquals(true, arborescence.equals(arborescence));
    }

    @Test(timeout = 4000)
    public void test1()
    {
        ImmutableMap<Integer, Integer> immutableMap1 = new ImmutableMap.Builder<Integer, Integer>().put(1, 2).put(4,3).build();
        ImmutableMap<Integer, Integer> immutableMap2 = new ImmutableMap.Builder<Integer, Integer>().build();

        Arborescence arborescence = Arborescence.of(immutableMap1);
        Arborescence arborescence1 = Arborescence.of(immutableMap2);
        assertEquals("Arborescence{2 -> 1, 3 -> 4}", arborescence.toString());
        assertEquals("Arborescence{}", arborescence1.toString());

        assertEquals(41, arborescence.hashCode());
    }

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        Arborescence<Integer> arborescence0 = Arborescence.empty();
        // Undeclared exception!
        try {
            arborescence0.contains((Edge<Integer>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        Arborescence<Comparable<Object>> arborescence0 = Arborescence.empty();
        String string0 = arborescence0.toString();
        assertEquals("Arborescence{}", string0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        Arborescence<Comparable<Object>> arborescence0 = Arborescence.empty();
        Integer integer0 = new Integer((-270));
        boolean boolean0 = arborescence0.equals(integer0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        Arborescence<String> arborescence0 = Arborescence.empty();
        // Undeclared exception!
        try {
            ImmutableMap.of(arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0, arborescence0);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // duplicate key: Arborescence{}
            //
        }
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        Arborescence<Integer> arborescence0 = Arborescence.empty();
        Edge<Integer> edge0 = new Edge<Integer>((Integer) null, (Integer) null);
        boolean boolean0 = arborescence0.contains(edge0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        Arborescence<String> arborescence0 = Arborescence.empty();
        arborescence0.hashCode();
    }
}
