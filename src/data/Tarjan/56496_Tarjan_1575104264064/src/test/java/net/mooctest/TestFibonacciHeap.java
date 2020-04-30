package net.mooctest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * Create by gwfp2 on 2019/11/30
 */
public class TestFibonacciHeap {
    FibonacciHeap merge;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        FibonacciHeap fibonacciHeap = FibonacciHeap.create();
        System.out.println("     "+ fibonacciHeap.comparator());
        fibonacciHeap.add(5, 1);
        fibonacciHeap.add(15, 6);
        fibonacciHeap.add(11, 13);
        Class clazz = FibonacciHeap.class;
        try {
            Constructor declaredConstructor = clazz.getDeclaredClasses()[0].getDeclaredConstructor(FibonacciHeap.class, Object.class, Object.class);
            declaredConstructor.setAccessible(true);
            FibonacciHeap.Entry entry = (FibonacciHeap.Entry) declaredConstructor.newInstance(fibonacciHeap, 3, 5);
            fibonacciHeap.decreasePriority(entry, 3);
            fibonacciHeap.remove(entry);
            assertFalse(fibonacciHeap.isEmpty());
            assertEquals(2, fibonacciHeap.size());
            fibonacciHeap.peekOption();
            fibonacciHeap.pollOption();

            FibonacciHeap fibonacciHeap2 = FibonacciHeap.create();
            fibonacciHeap.add(34, 12);
            fibonacciHeap.add(17, 6);
            fibonacciHeap.add(55, 8);

            FibonacciHeap merge = FibonacciHeap.merge(fibonacciHeap, fibonacciHeap2);
            Method cutAndMakeRoot = clazz.getDeclaredMethod("cutAndMakeRoot", FibonacciHeap.Entry.class);
            cutAndMakeRoot.setAccessible(true);
            //merge.decreasePriority(declaredConstructor.newInstance(fibonacciHeap, 55, 8), 1);
            cutAndMakeRoot.invoke(merge, declaredConstructor.newInstance(merge, 5, 1));
            Method setParent = clazz.getDeclaredMethod("setParent", FibonacciHeap.Entry.class, FibonacciHeap.Entry.class);
            setParent.setAccessible(true);
            setParent.invoke(merge, entry, declaredConstructor.newInstance(fibonacciHeap, 42, 11));

            Iterator iterator = merge.iterator();
            while (iterator.hasNext()) {
                Object next = iterator.next();
            }
            merge.clear();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        FibonacciQueue fibonacciQueue = FibonacciQueue.create();
        fibonacciQueue.comparator();
        assertNull(fibonacciQueue.peek());
        fibonacciQueue.offer("value1");
        fibonacciQueue.offer("value2");
        fibonacciQueue.offer("value3");
        assertEquals("value1", fibonacciQueue.poll());
        assertEquals(2, fibonacciQueue.size());
        Iterator iterator = fibonacciQueue.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }

    @Test
    public void test3() {
        WeightedGraph weightedGraph = DenseWeightedGraph.from(new double[][]{
                {1 , 3},
                {3, 2}
        });
        Weighted maxArborescence = ChuLiuEdmonds.getMaxArborescence(weightedGraph);
        ChuLiuEdmonds.getMaxArborescence(weightedGraph, 1);
        ChuLiuEdmonds.getMaxArborescence(weightedGraph, new HashSet<>(), new HashSet<>());

        weightedGraph.getWeightOf(1, 3);
    }

    @Test
    public void test4() {
        Pair pair1 = new Pair(5, 7);
        Pair pair2 = new Pair(5, 9);
        assertFalse(pair1.equals(null));
        assertFalse(pair1.equals(new Object()));
        assertFalse(pair1.equals(pair2));
        assertTrue(pair1.equals(pair1));
        assertTrue(pair1.equals(new Pair(5, 7)));
        assertEquals("Pair{first=5, second=7}", pair1.toString());
    }

    @Test
    public void test5() {
        Weighted<Integer> weighted = Weighted.weighted(3, 6);
        Weighted<Integer> weighted2 = Weighted.weighted(3, 7);
        assertFalse(weighted.equals(null));
        assertFalse(weighted.equals(weighted2));
        assertFalse(weighted.equals(new Object()));
        assertTrue(weighted.equals(weighted));
        assertTrue(weighted.equals(Weighted.weighted(3, 6)));
    }

    @Test
    public void test6() {
        Arborescence<Object> empty = Arborescence.empty();
        assertFalse(empty.contains(new Edge<>(3, 5)));
        assertEquals("Arborescence{}", empty.toString());
        Arborescence<Object> of = Arborescence.of(null);
        assertFalse(empty.equals(null));
        assertFalse(empty.equals(new Object()));
        assertTrue(empty.equals(Arborescence.empty()));
        assertTrue(empty.equals(empty));
    }
}
