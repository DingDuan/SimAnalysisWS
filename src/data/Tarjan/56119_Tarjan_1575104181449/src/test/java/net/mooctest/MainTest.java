package net.mooctest;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class MainTest
{
    Edge e1 = new Edge(1, 2);
    Edge e2 = new Edge(2, 3);
    Edge e3 = new Edge(3, 4);
    Edge e4 = new Edge(4, 5);
    Edge e5 = new Edge(5, 6);
    Edge e6 = new Edge(6, 3);
    Edge e7 = new Edge(6, 7);
    Edge e8 = new Edge(7, 9);
    Edge e9 = new Edge(9, 8);
    Edge e10 = new Edge(8, 6);


    List nodes = new ArrayList<>();
    List edges = new ArrayList<>();

    @Test(timeout = 4000)
    public void test0()
    {
        for (int i = 1; i <= 10; i++)
            nodes.add(i);

        edges.add(Weighted.weighted(e1, 2));
        edges.add(Weighted.weighted(e2, 4));
        edges.add(Weighted.weighted(e3, 3));
        edges.add(Weighted.weighted(e4, 3));
        edges.add(Weighted.weighted(e5, 1));
        edges.add(Weighted.weighted(e6, 6));
        edges.add(Weighted.weighted(e7, 2));
        edges.add(Weighted.weighted(e8, 2));
        edges.add(Weighted.weighted(e9, 2));
        edges.add(Weighted.weighted(e10, 5));

        SparseWeightedGraph graph1 = SparseWeightedGraph.from(nodes, edges);
        SparseWeightedGraph graph2 = SparseWeightedGraph.from(edges);

        KBestArborescences kBestArborescences = new KBestArborescences();
        List tmp = KBestArborescences.getKBestArborescences(graph1, 1, 1);

        assertEquals("[Weighted{val=Arborescence{2 -> 3, 5 -> 6, 7 -> 9, 9 -> 8, 6 -> 7, 4 -> 5, 3 -> 4, 1 -> 2}, weight=19.0}]", tmp.toString());

    }

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        Edge<KBestArborescences.SubsetOfSolutions<String>> edge0 = e1;
        Arborescence<KBestArborescences.SubsetOfSolutions<String>> arborescence0 = Arborescence.empty();
        Weighted<Arborescence<KBestArborescences.SubsetOfSolutions<String>>> weighted0 = new Weighted<Arborescence<KBestArborescences.SubsetOfSolutions<String>>>(arborescence0, 1739.04264);
        HashSet<Edge<KBestArborescences.SubsetOfSolutions<String>>> hashSet0 = new HashSet<Edge<KBestArborescences.SubsetOfSolutions<String>>>();
        LinkedHashSet<Edge<KBestArborescences.SubsetOfSolutions<String>>> linkedHashSet0 = new LinkedHashSet<Edge<KBestArborescences.SubsetOfSolutions<String>>>();
        KBestArborescences.SubsetOfSolutions<KBestArborescences.SubsetOfSolutions<String>> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<KBestArborescences.SubsetOfSolutions<String>>(edge0, weighted0, hashSet0, linkedHashSet0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        Edge<Object> edge0 = e1;
        ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, (-200.1188));
        Arborescence<Object> arborescence0 = Arborescence.empty();
        // Undeclared exception!
        try {
            KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<Object>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        TreeSet<Edge<Object>> treeSet0 = new TreeSet<Edge<Object>>();
        Arborescence<Object> arborescence0 = Arborescence.empty();
        Weighted<Arborescence<Object>> weighted0 = new Weighted<Arborescence<Object>>(arborescence0, 0.0);
        // Undeclared exception!
        try {
            KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Object>) null, (Set<Edge<Object>>) null, (Set<Edge<Object>>) treeSet0, weighted0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }


    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        double[][] doubleArray0 = new double[9][6];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
        Arborescence<Integer> arborescence0 = Arborescence.empty();
        Weighted<Arborescence<Integer>> weighted0 = Weighted.weighted(arborescence0, 0.0);
        // Undeclared exception!
        try {
            KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) hashSet0, weighted0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch(ArrayIndexOutOfBoundsException e) {
            //
            // 6
            //
        }
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        // Undeclared exception!
        try {
            KBestArborescences.getKBestArborescences((WeightedGraph<Double>) null, (Double) 2563.09285421, (-1));
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        double[][] doubleArray0 = new double[4][6];
        double[] doubleArray1 = new double[1];
        doubleArray0[0] = doubleArray1;
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Integer integer0 = new Integer(0);
        // Undeclared exception!
        try {
            KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch(ArrayIndexOutOfBoundsException e) {
            //
            // 1
            //
        }
    }


    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
        EnumSet<Locale.FilteringMode> enumSet0 = EnumSet.of(locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0);
        TreeSet<Weighted<Edge<Locale.FilteringMode>>> treeSet0 = new TreeSet<Weighted<Edge<Locale.FilteringMode>>>();
        SparseWeightedGraph<Locale.FilteringMode> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Locale.FilteringMode>) enumSet0, (Iterable<Weighted<Edge<Locale.FilteringMode>>>) treeSet0);
        List<Weighted<Arborescence<Locale.FilteringMode>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Locale.FilteringMode>) sparseWeightedGraph0, locale_FilteringMode0, 1301);
        assertEquals(1, list0.size());
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        double[][] doubleArray0 = new double[2][3];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Integer integer0 = new Integer(1438);
        List<Weighted<Arborescence<Integer>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 1);
        assertEquals(1, list0.size());
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        KBestArborescences kBestArborescences0 = new KBestArborescences();
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        LinkedHashSet<Weighted<Edge<KBestArborescences.SubsetOfSolutions<String>>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<KBestArborescences.SubsetOfSolutions<String>>>>(0);
        SparseWeightedGraph<KBestArborescences.SubsetOfSolutions<String>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<KBestArborescences.SubsetOfSolutions<String>>>>) linkedHashSet0);
        List<Weighted<Arborescence<KBestArborescences.SubsetOfSolutions<String>>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<KBestArborescences.SubsetOfSolutions<String>>) sparseWeightedGraph0, (KBestArborescences.SubsetOfSolutions<String>) null, 0);
        assertTrue(list0.isEmpty());
    }
}
