package net.mooctest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ChuLiuEdmondsTest {

	  @Test(timeout = 4000)
	  public void test0()  throws Throwable  {
		  
		  Weighted weighted1 = new Weighted("11",5);
		  Weighted weighted2 = new Weighted("12",5);
		  Weighted weighted3 = new Weighted("13",5);
		  Weighted weighted4 = new Weighted("14",5);
		  Weighted weighted5 = new Weighted("15",5);
		  Weighted weighted6 = new Weighted("16",5);
		  List<Weighted> l =new ArrayList<Weighted>();
		  l.add(weighted1);
		  l.add(weighted2);
		  l.add(weighted3);
		  l.add(weighted4);
		  l.add(weighted5);
		  l.add(weighted6);
		  Iterator<Weighted> iterator = l.iterator();
//		  PartialSolution.initialize(SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) iterator));
	  }
}
