package net.mooctest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;
import net.mooctest.KBestArborescences.SubsetOfSolutions;

import org.junit.Test;

import com.google.common.base.Optional;


public class TestFibonacciHeap {

  @Test
  public void test() {
    FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
    List vs=new ArrayList<Integer>();
    vs.add(2);
    vs.add(3);
    vs.add(6);
    vs.add(4);
    vs.add(5);
    double[][] weights={
            {1,3,2,4},
          {0,0,1,11},
          {2,8,9,1},
          {2,0,0,1},
          };
    DenseWeightedGraph<Integer> dw = DenseWeightedGraph.from(weights);
    assertEquals("[0, 1, 2, 3]", dw.getNodes().toString());
    assertEquals(11.0, dw.getWeightOf(1, 3),0.01);
    assertEquals("[Weighted{val=Edge{source=0, destination=2}, weight=2.0}, Weighted{val=Edge{source=1, destination=2}, weight=1.0}, Weighted{val=Edge{source=2, destination=2}, weight=9.0}, Weighted{val=Edge{source=3, destination=2}, weight=0.0}]", dw.getIncomingEdges(2).toString());
    Weighted<Arborescence<Integer>> war= ChuLiuEdmonds.getMaxArborescence(dw);
    assertEquals("Weighted{val=Arborescence{1 -> 3, 0 -> 2, 2 -> 1, 3 -> 0}, weight=23.0}", war.toString());
    double[][] weights2={
            {1,3,2,4,3},
          {0,1,3,1,1},
          {2,8,2,9,1},
          {2,0,3,0,1},
          {3,10,2,1,3}
    };
    dw=dw.from(vs, weights2);
    assertEquals("[2, 3, 6, 4, 5]", dw.getNodes().toString());
    assertEquals(3.0, dw.getWeightOf(2,3),0.01);
    assertEquals("[Weighted{val=Edge{source=2, destination=2}, weight=1.0}, Weighted{val=Edge{source=3, destination=2}, weight=0.0}, Weighted{val=Edge{source=6, destination=2}, weight=2.0}, Weighted{val=Edge{source=4, destination=2}, weight=2.0}, Weighted{val=Edge{source=5, destination=2}, weight=3.0}]", dw.getIncomingEdges(2).toString());
    war= ChuLiuEdmonds.getMaxArborescence(dw);
    assertEquals("Weighted{val=Arborescence{3 -> 6, 6 -> 2, 2 -> 5, 6 -> 4, 5 -> 3}, weight=27.0}", war.toString());
    vs.add(1);
    vs.add(9);
    double[][] weights3={
            {1,3,2,4,3,5,1},
          {0,1,3,1,1,0,1},
          {2,8,2,9,1,8,4},
          {2,0,3,0,1,4,7},
          {3,10,2,1,3,1,3},
          {0,3,1,3,1,2,3},
          {2,6,2,3,1,2,4}
    };
    dw=dw.from(vs, weights3);
    assertEquals("[2, 3, 6, 4, 5, 1, 9]", dw.getNodes().toString());
    assertEquals(3.0, dw.getWeightOf(2,3),0.01);
    assertEquals("[Weighted{val=Edge{source=2, destination=2}, weight=1.0}, Weighted{val=Edge{source=3, destination=2}, weight=0.0}, Weighted{val=Edge{source=6, destination=2}, weight=2.0}, Weighted{val=Edge{source=4, destination=2}, weight=2.0}, Weighted{val=Edge{source=5, destination=2}, weight=3.0}, Weighted{val=Edge{source=1, destination=2}, weight=0.0}, Weighted{val=Edge{source=9, destination=2}, weight=2.0}]", dw.getIncomingEdges(2).toString());
    war= ChuLiuEdmonds.getMaxArborescence(dw);
    assertEquals("Weighted{val=Arborescence{1 -> 5, 3 -> 6, 4 -> 9, 6 -> 4, 5 -> 3, 5 -> 2, 6 -> 1}, weight=41.0}", war.toString());
    Set<Edge<Integer>>  requery=new HashSet<Edge<Integer>>();
    Set<Edge<Integer>>  banned=new HashSet<Edge<Integer>>();
    requery.add(new Edge<Integer>(2, 3));
    requery.add(new Edge<Integer>(2, 6));
    requery.add(new Edge<Integer>(2, 4));
    requery.add(new Edge<Integer>(2, 9));
    banned.add(new Edge<Integer>(2, 3));
    banned.add(new Edge<Integer>(2, 4));
    banned.add(new Edge<Integer>(2, 6));
//    Optional<Weighted<SubsetOfSolutions<Integer>>> op= KBestArborescences.scoreSubsetOfSolutions(dw, requery, banned, war);
//    assertEquals("", op.toString());
  }
  
   @Test(timeout = 4000)
    public void testsdadsad0()  throws Throwable  {
        Object object0 = new Object();
        Weighted<Object> weighted0 = null;
        try {
          weighted0 = new Weighted<Object>(object0, 0.0);
          
        
        } catch(Exception e) {
           
           
           
           
        }
    }

    @Test(timeout = 4000)
    public void testsdadsad1()  throws Throwable  {
        Integer integer0 = new Integer(0);
        
        try { 
          Weighted.weighted(integer0, 0.0);
          
        
        } catch(Exception e) {
           
           
           
           
        }
    }
  
    @Test(timeout = 4000)
    public void testshwhehweshwhehwe0()  throws Throwable  {
        Pair<Object, Object> pair0 = new Pair<Object, Object>((Object) null, (Object) null);
        boolean boolean0 = pair0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void testshwhehweshwhehwe1()  throws Throwable  {
        Pair<String, Object> pair0 = Pair.of("", (Object) "");
        Integer integer0 = new Integer(0);
        Pair<String, Integer> pair1 = new Pair<String, Integer>("", integer0);
        
        try { 
          pair1.equals(pair0);
          
        
        } catch(Exception e) {
           
           
           
           
        }
    }

    @Test(timeout = 4000)
    public void testshwhehweshwhehwe2()  throws Throwable  {
        Pair<String, Object> pair0 = new Pair<String, Object>("", "");
        
    }

    @Test(timeout = 4000)
    public void testshwhehweshwhehwe3()  throws Throwable  {
        Integer integer0 = new Integer(0);
        Pair<Object, String> pair0 = Pair.of((Object) integer0, "");
        
    }

    
}
