package net.mooctest;


import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import com.google.common.base.Optional;
import org.junit.Test;
import org.junit.contrib.java.lang.system.*;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestGraphFind {


    @Test
    public void testEdgeEquals(){
        Edge<Integer> e1=  new Edge<>(1,2);
        Edge<Integer> e2=  new Edge<>(1,3);
        Edge<Integer> e3=  new Edge<>(2,2);
        Edge<Integer> e4=  new Edge<>(1,2);
        assertNotEquals(e1,e2);
        assertNotEquals(e1,e3);
        assertEquals(e1,e1);
        assertEquals(e1,e4);

        assertNotEquals(e1,"aaa");
        assertNotEquals(e1,null);


    }

    @Test
    public void testFibHeap(){

        FibonacciQueue<Integer> fq = FibonacciQueue.create();
        assertNull(fq.peek());
        fq.offer(1);
        assertNotNull(fq.peek());

        FibonacciHeap<Integer, Integer> fh = FibonacciHeap.create();

        assertTrue(fh.isEmpty());

        fh.add(1,2);
        fh.add(3,4);
        fh.add(100, 10);
        fh.add(99,100);
        fh.add(88,50);
        fh.add(111,0);
        fh.add(33,33);

        assertFalse(fh.isEmpty());

//        System.out.println(fh.size());
        assertEquals(7, fh.size());

        List<Integer> li = Arrays.asList(111, 33, 88, 99, 100, 3, 1);
        int cnt = 0;

        Iterator<FibonacciHeap<Integer, Integer>.Entry> it = fh.iterator();
        List<FibonacciHeap<Integer, Integer>.Entry> li2 = new ArrayList<>();
//        it.next();
        while(it.hasNext()){
//            assertEquals(li.get(cnt),it.next().value);
//            cnt++;
            FibonacciHeap<Integer, Integer>.Entry en = it.next();
            li2.add(en);
            int n = en.value;
//            System.out.println("1"+n);
            System.out.println(n);
            System.out.println("-------"+li.get(cnt));
            assertEquals((int)li.get(cnt), (int)n);
            cnt++;
        }

        FibonacciHeap<Integer, Integer>.Entry en1 = li2.get(0);
        fh.remove(en1);
        Iterator<FibonacciHeap<Integer, Integer>.Entry> it2 = fh.iterator();

        int[] a2 = new int[]{1, 3, 100, 33, 88, 99};
        cnt = 0;

        System.out.println("aaaaaaa");
        while (it2.hasNext()){

//            System.out.println(it2.next().value);
            assertEquals(a2[cnt++], (int)it2.next().value);
        }


        FibonacciHeap<Integer, Integer> fh2 = FibonacciHeap.create();

//        assertTrue(fh.isEmpty());

        fh2.add(1,3);
        fh2.add(3,8);
        fh2.add(100, 10);
        fh2.add(222, 20);

        FibonacciHeap<Integer, Integer> fh3 = FibonacciHeap.merge(fh, fh2);
        Iterator<FibonacciHeap<Integer, Integer>.Entry> it3 = fh.iterator();
        int[] a3 = new int[]{1, 3, 222, 100, 3, 1, 100, 33, 88, 99};
        cnt = 0;

        System.out.println("aaaaaaa");
        while (it3.hasNext()){

//            System.out.println(it3.next().value);
            assertEquals(a3[cnt++], (int)it3.next().value);
        }



        FibonacciHeap<Integer, Integer>.Entry en3 = li2.get(0);

        try {
            fh.decreasePriority(en3, 100);
            fail();

        }catch (Exception e){

        }

        fh.decreasePriority(li2.get(3),1);

        Optional<FibonacciHeap<Integer, Integer>.Entry> eo = fh.peekOption();
        assertTrue(eo.isPresent());
        Optional<Integer> io = fh.pollOption();
        assertEquals(eo.get().value, io.get());



        fh.clear();

    }

    @Test
    public void testArborescenceEquals(){
        double[][] weights = new double[][]{
                new double[]{1,2,3,4},
                new double[]{5,6,7,8},
                new double[]{1,2,3,4},
                new double[]{5,6,7,8}

        };
        DenseWeightedGraph<Integer> dwg = DenseWeightedGraph.from(weights);

        List<Weighted<Arborescence<Integer>>> kli = KBestArborescences.getKBestArborescences(dwg, 0, 2);
        assertEquals(kli.get(0),kli.get(0));
        assertNotEquals(kli.get(1),kli.get(0));
        assertNotEquals(kli.get(1),null);

    }

    @Test
    public void testWeightEquals(){
        Weighted<Integer> w1 = new Weighted<>(1,2);
        Weighted<Integer> w2 = new Weighted<>(2,2);
        Weighted<Integer> w3 = new Weighted<>(1,1);
        Weighted<Integer> w4 = new Weighted<>(1,2);


        assertEquals(w1,w1);
        assertNotEquals(w1,w2);
        assertNotEquals(w1,w3);
        assertEquals(w1,w4);

        Weighted<String> w5 = new Weighted<>("aaa",1);
        assertNotEquals(w1,w5);
        assertNotEquals(w1,"aaaa");
        assertNotEquals(w1, null);

    }

    @Test
    public void testDenseWeightGraphs(){
        double[][] weights = new double[][]{
                new double[]{1,2,3,4},
                new double[]{5,6,7,8},
                new double[]{1,2,3,4},
                new double[]{5,6,7,8}

        };
        DenseWeightedGraph<Integer> dwg = DenseWeightedGraph.from(weights);
        System.out.println(dwg.getNodes());
        System.out.println(dwg.getIncomingEdges(1));
//        System.out.println(dwg.getIncomingEdges());

//        System.out.println(KBestArborescences.getKBestArborescences(dwg, 0, 1));
        assertEquals("[Weighted{val=Arborescence{0 -> 3, 3 -> 2, 3 -> 1}, weight=17.0}]", KBestArborescences.getKBestArborescences(dwg, 0, 1).toString());

        System.out.println(ChuLiuEdmonds.getMaxArborescence(dwg));
        assertEquals("Weighted{val=Arborescence{0 -> 3, 3 -> 2, 3 -> 1, 3 -> 0}, weight=22.0}",ChuLiuEdmonds.getMaxArborescence(dwg).toString());
        System.out.println(ChuLiuEdmonds.getMaxArborescence(dwg,1));
        assertEquals("Weighted{val=Arborescence{1 -> 3, 3 -> 2, 3 -> 0}, weight=20.0}",ChuLiuEdmonds.getMaxArborescence(dwg,1).toString());

    }


    @Test
    public void testSparseWeightedGraph(){

        List<Weighted<Edge<Integer>>> edgeli = new ArrayList<>();
        edgeli.add(new Weighted<>(new Edge<>(0,1),1));
        edgeli.add(new Weighted<>(new Edge<>(1,2),10));
        edgeli.add(new Weighted<>(new Edge<>(1,3),2));
        edgeli.add(new Weighted<>(new Edge<>(3,2),8));
//        edgeli.add(new Weighted<>(new Edge<>(0,1),1));


        SparseWeightedGraph<Integer> swg = SparseWeightedGraph.from(edgeli);

        assertEquals(1,swg.getWeightOf(0,1),eps);
        assertEquals(Double.NEGATIVE_INFINITY,swg.getWeightOf(10,10),eps);
        assertEquals(Double.NEGATIVE_INFINITY,swg.getWeightOf(0,2),eps);
        assertEquals(Double.NEGATIVE_INFINITY,swg.getWeightOf(2,0),eps);


        List<Weighted<Arborescence<Integer>>> k1 = KBestArborescences.getKBestArborescences(swg, 0, 1);
        List<Weighted<Arborescence<Integer>>> k2 = KBestArborescences.getKBestArborescences(swg, 0, 2);
        System.out.println(k1);
        System.out.println(k2);

        assertEquals("[Weighted{val=Arborescence{1 -> 3, 1 -> 2, 0 -> 1}, weight=13.0}]", k1.toString());
        assertEquals("[Weighted{val=Arborescence{1 -> 3, 1 -> 2, 0 -> 1}, weight=13.0}, Weighted{val=Arborescence{1 -> 3, 3 -> 2, 0 -> 1}, weight=11.0}]",k2.toString());

    }

    static final double eps = 0.0000001;


    @Test
    public void testDenseWeightGraphs2(){
        double[][] weights = new double[][]{
                new double[]{0,1,0,0},
                new double[]{0,0,0,2},
                new double[]{0,0,10,0},
                new double[]{0,0,4,0},

        };
        DenseWeightedGraph<Integer> dwg = DenseWeightedGraph.from(weights);
        System.out.println(dwg.getNodes());
        System.out.println(dwg.getIncomingEdges(1));

        assertEquals(1,dwg.getWeightOf(0,1),eps);
        assertEquals(Double.NEGATIVE_INFINITY, dwg.getWeightOf(5,1),eps);
        assertEquals(Double.NEGATIVE_INFINITY, dwg.getWeightOf(1,5),eps);


        assertEquals("[0, 1, 2, 3]", dwg.getNodes().toString());
        assertEquals("[Weighted{val=Edge{source=0, destination=1}, weight=1.0}, Weighted{val=Edge{source=1, destination=1}, weight=0.0}, Weighted{val=Edge{source=2, destination=1}, weight=0.0}, Weighted{val=Edge{source=3, destination=1}, weight=0.0}]",dwg.getIncomingEdges(1).toString());

        assertEquals("[Weighted{val=Arborescence{1 -> 3, 3 -> 2, 0 -> 1}, weight=7.0}]",KBestArborescences.getKBestArborescences(dwg,0,1).toString());
        assertEquals("[Weighted{val=Arborescence{1 -> 3, 3 -> 2, 0 -> 1}, weight=7.0}, Weighted{val=Arborescence{0 -> 3, 3 -> 2, 0 -> 1}, weight=5.0}]",KBestArborescences.getKBestArborescences(dwg,0,2).toString());
        assertEquals("[Weighted{val=Arborescence{1 -> 3, 3 -> 2, 2 -> 0}, weight=6.0}, Weighted{val=Arborescence{1 -> 3, 3 -> 2, 3 -> 0}, weight=6.0}]",KBestArborescences.getKBestArborescences(dwg,1,2).toString());
        assertEquals("[Weighted{val=Arborescence{1 -> 3, 0 -> 1, 2 -> 0}, weight=3.0}, Weighted{val=Arborescence{2 -> 1, 1 -> 3, 2 -> 0}, weight=2.0}]",KBestArborescences.getKBestArborescences(dwg,2,2).toString());

        //        System.out.println(dwg.getIncomingEdges());

//        System.out.println(KBestArborescences.getKBestArborescences(dwg, 0, 1));
//        assertEquals("[Weighted{val=Arborescence{0 -> 3, 3 -> 2, 3 -> 1}, weight=17.0}]", KBestArborescences.getKBestArborescences(dwg, 0, 1).toString());



    }

    @Test
    public void testPair(){

        Pair<String ,Integer> p1 = new Pair<>("aaa",111);
        assertEquals(p1,p1);
        Pair<String ,Integer> p2 = new Pair<>("aaa",222);
        Pair<String ,Integer> p3 = new Pair<>("bbb",111);
        assertNotEquals(p1,p2);
        assertNotEquals(p1,p3);


        Pair<Integer ,Integer> p4 = new Pair<>(111,111);
        assertNotEquals(p1,p4);
        Pair<String ,Double> p5 = new Pair<>("bbb",111.001);
        assertNotEquals(p1,p5);

        Pair<String ,Integer> p6 = new Pair<>("aaa",111);
        assertEquals(p1,p6);
        Pair<String, Integer> p7 = Pair.of("aaa",111);
        assertEquals(p1,p7);
        assertNotEquals(p1,"Aaaa");

        System.out.println(p1.hashCode());
        System.out.println(p1.toString());

        assertEquals(2987023,p1.hashCode());
        assertEquals("Pair{first=aaa, second=111}",p1.toString());

    }

}
