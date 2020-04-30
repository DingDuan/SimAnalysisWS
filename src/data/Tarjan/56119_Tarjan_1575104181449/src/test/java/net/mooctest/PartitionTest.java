package net.mooctest;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class PartitionTest
{
    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();

    @Test(timeout = 4000)
    public void test0()
    {
        list.add(1);
        list.add(2);
        list.add(3);

        map.put(1, 2);
        map.put(2, 3);

        Partition partition = Partition.singletons(list);
        assertEquals(1, partition.componentOf(1));
    }

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        assertNotNull(linkedList0);
        assertEquals(0, linkedList0.size());

        boolean boolean0 = linkedList0.add("");
        assertTrue(linkedList0.contains(""));
        assertTrue(boolean0);
        assertEquals(1, linkedList0.size());

        boolean boolean1 = linkedList0.add("yXd");
        assertTrue(linkedList0.contains("yXd"));
        assertTrue(boolean1);
        assertTrue(boolean1 == boolean0);
        assertEquals(2, linkedList0.size());

        boolean boolean2 = linkedList0.add("uFHkA?}s,l_y46yM 5");
        assertTrue(linkedList0.contains(""));
        assertTrue(boolean2);
        assertTrue(boolean2 == boolean1);
        assertTrue(boolean2 == boolean0);
        assertEquals(3, linkedList0.size());

        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        assertTrue(linkedList0.contains(""));
        assertNotNull(partition0);
        assertEquals(3, linkedList0.size());

        String string0 = partition0.merge("", "yXd");
        assertTrue(linkedList0.contains(""));
        assertNotNull(string0);
        assertEquals("", string0);
        assertEquals(3, linkedList0.size());

        String string1 = partition0.merge("uFHkA?}s,l_y46yM 5", "yXd");
        assertTrue(linkedList0.contains(string1));
        assertNotNull(string1);
        assertEquals("", string1);
        assertEquals(3, linkedList0.size());
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        assertNotNull(linkedList0);
        assertEquals(0, linkedList0.size());

        boolean boolean0 = linkedList0.add("netLmo*ctvt.Partit$on");
        assertTrue(linkedList0.contains("netLmo*ctvt.Partit$on"));
        assertTrue(boolean0);
        assertEquals(1, linkedList0.size());

        boolean boolean1 = linkedList0.add("1h DV_ba");
        assertTrue(linkedList0.contains("1h DV_ba"));
        assertTrue(boolean1);
        assertTrue(boolean1 == boolean0);
        assertEquals(2, linkedList0.size());

        boolean boolean2 = linkedList0.add("");
        assertTrue(linkedList0.contains("netLmo*ctvt.Partit$on"));
        assertTrue(boolean2);
        assertTrue(boolean2 == boolean0);
        assertTrue(boolean2 == boolean1);
        assertEquals(3, linkedList0.size());

        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        assertTrue(linkedList0.contains("netLmo*ctvt.Partit$on"));
        assertNotNull(partition0);
        assertEquals(3, linkedList0.size());

        String string0 = partition0.merge("", "netLmo*ctvt.Partit$on");
        assertTrue(linkedList0.contains(""));
        assertNotNull(string0);
        assertEquals("", string0);
        assertEquals(3, linkedList0.size());

        String string1 = partition0.merge("netLmo*ctvt.Partit$on", "1h DV_ba");
        assertTrue(linkedList0.contains(""));
        assertNotNull(string1);
        assertEquals("", string1);
        assertEquals(3, linkedList0.size());
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        assertNotNull(linkedList0);
        assertEquals(0, linkedList0.size());

        boolean boolean0 = linkedList0.add("net.mooctest.Partition");
        assertTrue(linkedList0.contains("net.mooctest.Partition"));
        assertTrue(boolean0);
        assertEquals(1, linkedList0.size());

        boolean boolean1 = linkedList0.add("");
        assertTrue(linkedList0.contains("net.mooctest.Partition"));
        assertTrue(boolean1);
        assertTrue(boolean1 == boolean0);
        assertEquals(2, linkedList0.size());

        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        assertTrue(linkedList0.contains("net.mooctest.Partition"));
        assertNotNull(partition0);
        assertEquals(2, linkedList0.size());

        String string0 = partition0.merge("", "net.mooctest.Partition");
        assertTrue(linkedList0.contains(""));
        assertNotNull(string0);
        assertEquals("", string0);
        assertEquals(2, linkedList0.size());

        String string1 = partition0.merge("net.mooctest.Partition", "net.mooctest.Partition");
        assertTrue(linkedList0.contains("net.mooctest.Partition"));
        assertNotNull(string1);
        assertEquals("", string1);
        assertEquals(2, linkedList0.size());
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        // Undeclared exception!
        try {
            Partition.singletons((Collection<String>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        assertNotNull(linkedList0);
        assertEquals(0, linkedList0.size());

        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        assertNotNull(partition0);
        assertEquals(0, linkedList0.size());

        // Undeclared exception!
        try {
            partition0.sameComponent("net.mooctest.Partition", "BeD)CxkF0`N#i)QdUR");
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        assertNotNull(linkedList0);
        assertEquals(0, linkedList0.size());

        Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
        assertNotNull(partition0);
        assertEquals(0, linkedList0.size());

        Integer integer0 = new Integer(1);
        assertNotNull(integer0);
        assertEquals(1, (int)integer0);

        // Undeclared exception!
        try {
            partition0.merge(integer0, integer0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        assertNotNull(linkedList0);
        assertEquals(0, linkedList0.size());

        Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
        assertNotNull(partition0);
        assertEquals(0, linkedList0.size());

        // Undeclared exception!
        try {
            partition0.componentOf(linkedList0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("net.mooctest.Partition");
        linkedList0.add("");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        String string0 = partition0.merge("", "net.mooctest.Partition");
        assertEquals("", string0);

        String string1 = partition0.componentOf("net.mooctest.Partition");
        assertEquals("", string1);
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        String string0 = partition0.componentOf("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("net.mooctest.Partition");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        boolean boolean0 = partition0.sameComponent("net.mooctest.Partition", "net.mooctest.Partition");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("]XH2.CedH?DG");
        linkedList0.add(",>i\".?%ldrn");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        boolean boolean0 = partition0.sameComponent("]XH2.CedH?DG", ",>i\".?%ldrn");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("1h DV_ba");
        linkedList0.add("");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        String string0 = partition0.merge("", "1h DV_ba");
        assertEquals("", string0);

        String string1 = partition0.merge("1h DV_ba", "");
        assertEquals("", string1);
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        Set<String> set0 = partition0.getNodes();
        assertEquals(0, set0.size());
    }
}
