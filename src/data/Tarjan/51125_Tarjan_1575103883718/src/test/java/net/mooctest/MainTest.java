package net.mooctest;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.function.Predicate;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test00() throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Integer> nodes = new ArrayList<>();
        nodes.add(1);
        nodes.add(2);
        double[][] weights = new double[2][1];
        weights[0] = new double[]{0.5};
        weights[1] = new double[]{0.6};
        DenseWeightedGraph<Integer> graph = DenseWeightedGraph.from(weights);
        ImmutableMap<Integer, Integer> map = ImmutableMap.<Integer, Integer>builder().build();
        Arborescence<Integer> arborescence = Arborescence.of(map);
        assertEquals("Arborescence{}", arborescence.toString());
        arborescence = Arborescence.empty();
        Edge<Integer> e1 = new Edge(0, 1);
        Edge<Integer> e2 = new Edge(1, 0);
        Edge<Integer> e3 = new Edge(3, 4);
        assertFalse(arborescence.contains(e1));
        assertTrue(arborescence.equals(arborescence));
        assertFalse(arborescence.equals("a"));
        Arborescence<Integer> tmpA = Arborescence.of(map);
        assertTrue(arborescence.equals(tmpA));
        assertFalse(arborescence.equals(null));
        map = new ImmutableMap.Builder<Integer, Integer>()
                .put(0, 1)
                .put(1, 0)
                .build();
        arborescence = Arborescence.of(map);
        assertFalse(arborescence.equals(tmpA));
        ImmutableMap<Integer, Integer> tmpM = new ImmutableMap.Builder<Integer, Integer>()
                .put(0, 1)
                .put(1, 2)
                .build();
        tmpA = Arborescence.of(tmpM);
        assertFalse(arborescence.equals(tmpA));
        assertEquals("Arborescence{1 -> 0, 0 -> 1}", arborescence.toString());
        assertTrue(arborescence.contains(e1));
        assertFalse(arborescence.contains(e3));
        Set<Edge<Integer>> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        hashMap1.put(0, 1);
        hashMap1.put(1, 0);
        Field field = Arborescence.class.getDeclaredField("parents");
        field.setAccessible(true);
        Partition<Integer> partition = Partition.singletons(graph.getNodes());
    }

    @Test
    public void test02() {
        ArrayList<Weighted<Edge<Integer>>> list = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            Edge<Integer> e = new Edge<>(i, i / 10);
            list.add(new Weighted(e, i / 10.0));
        }
        SparseWeightedGraph<Integer> graph = SparseWeightedGraph.from(list);
        assertEquals("[0, 1, 2, 3, 4]", graph.getNodes().toString());
        assertEquals("-Infinity", graph.getWeightOf(-1, 1) + "");
        assertEquals("-Infinity", graph.getWeightOf(1, 100) + "");
        assertEquals("0.1", graph.getWeightOf(1, 0) + "");
        assertEquals("[Weighted{val=Edge{source=1, destination=0}, weight=0.1}, Weighted{val=Edge{source=2, destination=0}, weight=0.2}, Weighted{val=Edge{source=3, destination=0}, weight=0.3}, Weighted{val=Edge{source=4, destination=0}, weight=0.4}]", graph.getIncomingEdges(0).toString());
        assertEquals("-Infinity", graph.getWeightOf(1, 1) + "");
        List list1 = KBestArborescences.getKBestArborescences(graph, 0, 1);
        assertEquals("[Weighted{val=Arborescence{}, weight=0.0}]", list1.toString());
        List list2 = KBestArborescences.getKBestArborescences(graph, 0, 5);
        assertEquals("[Weighted{val=Arborescence{}, weight=0.0}]", list2.toString());
        List list3 = KBestArborescences.getKBestArborescences(graph, 0, 0);
        assertEquals("[]", list3.toString());

        list = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            Edge<Integer> e = new Edge<>(i, i / 10);
            list.add(new Weighted(e, i / 2.0));
        }
        graph = SparseWeightedGraph.from(list);
        list1 = KBestArborescences.getKBestArborescences(graph, 0, 5);
        assertEquals("[Weighted{val=Arborescence{99 -> 9, 89 -> 8, 79 -> 7, 69 -> 6, 59 -> 5, 49 -> 4, 39 -> 3, 29 -> 2, 19 -> 1}, weight=265.5}, Weighted{val=Arborescence{99 -> 9, 89 -> 8, 79 -> 7, 69 -> 6, 59 -> 5, 49 -> 4, 39 -> 3, 29 -> 2, 18 -> 1}, weight=265.0}, Weighted{val=Arborescence{99 -> 9, 89 -> 8, 79 -> 7, 69 -> 6, 59 -> 5, 49 -> 4, 39 -> 3, 28 -> 2, 19 -> 1}, weight=265.0}, Weighted{val=Arborescence{99 -> 9, 89 -> 8, 79 -> 7, 69 -> 6, 59 -> 5, 49 -> 4, 38 -> 3, 29 -> 2, 19 -> 1}, weight=265.0}, Weighted{val=Arborescence{99 -> 9, 89 -> 8, 79 -> 7, 69 -> 6, 59 -> 5, 48 -> 4, 39 -> 3, 29 -> 2, 19 -> 1}, weight=265.0}]", list1.toString());


        list = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            Edge<Integer> e = new Edge<>(i, i / 10);
            list.add(new Weighted(e, 10000 / i));
        }
        for (int i = 300; i >= 200; i--) {
            Edge<Integer> e = new Edge<>(i, i - 10);
            list.add(new Weighted(e, i));
        }
        Random random = new Random();
        for (int i = 1; i < 500; i++) {
            Edge<Integer> e = new Edge<>(i, random.nextInt(i));
            list.add(new Weighted<>(e, i));
        }
        graph = SparseWeightedGraph.from(list);
        list1 = KBestArborescences.getKBestArborescences(graph, 0, 20);
        list = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            Edge<Integer> e = new Edge<>(i, random.nextInt(i));
            list.add(new Weighted(e, 100 / i));
        }
        graph = SparseWeightedGraph.from(list);
        list1 = KBestArborescences.getKBestArborescences(graph, 0, 10000);
    }


}
