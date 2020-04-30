package net.mooctest;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestFibonacciHeap {

	@Test
	public void test() {
    
    FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
      Pair<Integer, Integer> p =new Pair<>(1, 2);
      Pair<Integer, Integer> p3 =new Pair<>(1, 2);
      Pair<Integer, Integer> p4 =new Pair<>(1, 3);
      Pair<Integer, Integer> p5 =new Pair<>(2, 2);
      assertEquals("Pair{first=1, second=2}", p.toString());
      assertEquals(994, p.hashCode());
      assertFalse(p.equals(2));
      assertFalse(p.equals(null));
      assertTrue(p.equals(p3));
      assertFalse(p.equals(p4));
      assertFalse(p.equals(p5));
      
        Edge<Integer> e1 = new Edge(1, 2);
      //EdgeBuilder<Integer> e2 = Edge.from(2);
      assertTrue(e1.equals(e1));
      assertFalse(e1.equals(null));
     
      Edge<Integer> e3 = new Edge(1, 2);
      Edge<Integer> e4 = new Edge(2, 2);
      Edge<Integer> e5 = new Edge(1, 3);
      assertTrue(e1.equals(e3));
      assertFalse(e1.equals(e4));
      assertFalse(e1.equals(e5));
      
      Edge.from(2);
	}

	
}
