package net.mooctest;
import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
	}

	@Test
	public void test1(){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);al.add(2);al.add(3);al.add(4);
		double[][] weights = new double[4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				weights[i][j]=i+j;
			}
		}
		Iterable<Integer> it = al;
		DenseWeightedGraph<Integer> dwg = DenseWeightedGraph.from(it,weights);
		ChuLiuEdmonds.PartialSolution<Integer> pts = ChuLiuEdmonds.PartialSolution.initialize(dwg);
		Set<Integer> s = pts.getNodes();
		Set<Integer> es = new HashSet();
		es.add(1);es.add(2);es.add(3);es.add(4);
		assertEquals(es,s);
		//ChuLiuEdmonds cle = new ChuLiuEdmonds();
	}
	
	
	@Test
	public void test2(){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);al.add(2);al.add(3);al.add(4);
		double[][] weights = new double[4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				weights[i][j]=i+j;
			}
		}
		Iterable<Integer> it = al;
		DenseWeightedGraph<Integer> dwg = DenseWeightedGraph.from(it,weights);
		DenseWeightedGraph<Integer> dgg = DenseWeightedGraph.from(weights);
		assertNotNull(KBestArborescences.getKBestArborescences(dwg, 1, 0));
		assertNotNull(KBestArborescences.getKBestArborescences(dwg, 1, 1));
		assertNotNull(KBestArborescences.getKBestArborescences(dgg, 1, 0));
		assertNotNull(KBestArborescences.getKBestArborescences(dgg, 1, 1));
		assertNotNull(KBestArborescences.getKBestArborescences(dwg, 1, 2));
		assertNotNull(KBestArborescences.getKBestArborescences(dgg, 1, 2));
		assertNotNull(KBestArborescences.getKBestArborescences(dwg, 1, 4));
		assertNotNull(KBestArborescences.getKBestArborescences(dgg, 1, 4));
	}
	
	@Test
	public void test3(){
		ImmutableMap<Integer,Integer> mp = new ImmutableMap.Builder<Integer,Integer>()
			    .put(1,2)
			    .put(3,4)
			    .build();
		Arborescence<Integer> ab = Arborescence.of(mp);
		Edge e = new Edge(2,1);
		assertEquals(true,ab.contains(e));
		//System.out.println(ab.toString());
		String s = "Arborescence{2 -> 1, 4 -> 3}";
		assertEquals(s,ab.toString());
		assertEquals(true,ab.equals(ab));
		assertEquals(false,ab.equals(null));
		assertEquals(false,ab.equals(s));
		ImmutableMap<Integer,Integer> mmp = new ImmutableMap.Builder<Integer,Integer>()
			    .put(1,2)
			    .put(3,4)
			    .put(5,6)
			    .build();
		Arborescence<Integer> abb = Arborescence.of(mmp);
		assertEquals(false,abb.equals(ab));
		ImmutableMap<Integer,Integer> mmmp = new ImmutableMap.Builder<Integer,Integer>()
			    .put(1,2)
			    .put(5,6)
			    .build();
		Arborescence<Integer> abbb = Arborescence.of(mmmp);
		assertEquals(false,abbb.equals(ab));
		ImmutableMap<Integer,Integer> mmmmp = new ImmutableMap.Builder<Integer,Integer>()
			    .put(1,2)
			    .put(3,4)
			    .build();
		Arborescence<Integer> abbbb = Arborescence.of(mmmmp);
		assertEquals(true,abbbb.equals(ab));
		//System.out.println(ab.hashCode());
		assertEquals(41,ab.hashCode());
	}
	
	@Test
	public void test4(){
		Pair<Integer,Integer> p = Pair.of(1, 2);
		Pair<Integer,Integer> pp = Pair.of(1, 3);
		Pair<Integer,Integer> ppp = Pair.of(1, 2);
		Pair<Integer,Integer> pppp = Pair.of(2, 3);
		String s = "1";
		assertEquals(false,p.equals(pp));
		assertEquals(false,p.equals(s));
		assertEquals(true,p.equals(ppp));
		assertEquals(false,p.equals(pppp));
		//System.out.println(p.hashCode());
		assertEquals(994,p.hashCode());
		//System.out.println(p.toString());
		String ss = "Pair{first=1, second=2}";
		assertEquals(ss,p.toString());
		
	}
	
	@Test
	public void test5(){
		FibonacciHeap<Integer,Integer> fb = FibonacciHeap.create();
		assertEquals(true,fb.isEmpty());
		Object x = fb.pollOption();
		//System.out.println(fb.pollOption());
		fb.clear();
		fb.add(1, 1);fb.add(7, 7);fb.add(13, 13);  //to 45?
		fb.add(2, 2);fb.add(8, 8);fb.add(14, 14);
		fb.add(3, 3);fb.add(9, 9);fb.add(15, 15);
		fb.add(4, 4);fb.add(10, 10);
		fb.add(5, 5);fb.add(11, 11);
		fb.add(6, 6);fb.add(12, 12);
		Optional<FibonacciHeap<Integer,Integer>.Entry> ey = fb.add(16, 16);
		fb.decreasePriority(ey.get(), 8);
		Optional<FibonacciHeap<Integer,Integer>.Entry> eyy = fb.add(17, 12);
		try{
			fb.decreasePriority(eyy.get(), 15);
	  	}catch (Exception e){
	  		e.printStackTrace();
		}
		fb.remove(ey.get());
		try{
			fb.decreasePriority(ey.get(), 6);
	  	}catch (Exception e){
	  		e.printStackTrace();
		}
		assertEquals(false,fb.isEmpty());
		Object xx = fb.pollOption();
		assertNotEquals(x,xx);
		fb.add(16, 16);fb.add(18, 18);
		Optional<FibonacciHeap<Integer,Integer>.Entry> kk = fb.add(19, 19);fb.add(20, 17);
		Optional<FibonacciHeap<Integer,Integer>.Entry> kkk = fb.add(20, 20);fb.add(21, 21);fb.add(32, 32);fb.add(35, 35);
		fb.add(22, 22);fb.add(23, 23);fb.add(24, 24);fb.add(25, 25);fb.add(26, 26);fb.add(33, 33);fb.add(36, 36);
		fb.add(27, 27);fb.add(28, 28);fb.add(29, 29);fb.add(30, 30);fb.add(31, 31);fb.add(34, 34);fb.add(37, 37);
		fb.add(38, 38);fb.add(39, 39);fb.add(40, 40);fb.add(41, 41);fb.add(42, 42);fb.add(43, 43);fb.add(44, 44);
		FibonacciHeap<Integer,Integer> f = FibonacciHeap.create();
		f.add(45, 45);f.add(46, 46);f.add(47, 47);f.add(48, 48);f.add(2, 2);
		FibonacciHeap<Integer,Integer> ff = FibonacciHeap.create();
		ff=ff.merge(f, fb);
		FibonacciHeap<Integer,Integer> a = FibonacciHeap.create();a.add(1, 1);a.add(2, 2);
		FibonacciHeap<Integer,Integer> b = FibonacciHeap.create();b.add(3, 3);b.add(2, 2);
		FibonacciHeap<Integer,Integer> c = FibonacciHeap.create();
		c.add(3, 3);
		c.add(2, 2);
		c.add(2, 2);
		c.add(1, 1);
		FibonacciHeap<Integer,Integer> d = FibonacciHeap.create();d=d.merge(a, b);
		//System.out.println(d.size());
		assertEquals(c.size(),d.size());
		FibonacciHeap<Integer,Integer> h = FibonacciHeap.create();
		FibonacciHeap<Integer,Integer> g = FibonacciHeap.create();
		try{
			g = g.merge(h, b);
	  	}catch (Exception e){
	  		e.printStackTrace();
		}
		fb.decreasePriority(kk.get(), 0);
		//System.out.println(fb.add(49, 49));
		//assertEquals(x,xxx);  //反射
		try{
			Field m = fb.getClass().getDeclaredField("size");
			m.setAccessible(true);
		    m.set(fb, Integer.MAX_VALUE);
		    Object xxx = fb.add(49, 19);
		    assertEquals(x,xxx);
	  	}catch (Exception e){
	  		e.printStackTrace();
		}
	}
	
	@Test
	public void test6(){
		FibonacciHeap<Integer,Integer> c = FibonacciHeap.create();
		Optional<FibonacciHeap<Integer,Integer>.Entry> k = c.add(4, 2);
		c.add(2, 3);
		c.add(3, 4);
		c.add(1, 1);
		try{
			Method m = c.getClass().getDeclaredMethod("cutAndMakeRoot", FibonacciHeap.Entry.class);
			m.setAccessible(true);
		    m.invoke(c, k.get());
	  	}catch (Exception e){
	  		e.printStackTrace();
		}
		
	}
	
	@Test
	public void test7(){
		Weighted<Edge<Integer>> eg1,eg2,eg3,eg4,eg5,eg6,eg7;
		Edge<Integer> e1 = new Edge(1,2);eg1 = new Weighted(e1,1);
		Edge<Integer> e2 = new Edge(1,3);eg2 = new Weighted(e2,2);
		Edge<Integer> e3 = new Edge(1,4);eg3 = new Weighted(e3,3);
		Edge<Integer> e4 = new Edge(2,3);eg4 = new Weighted(e4,4);
		Edge<Integer> e5 = new Edge(4,3);eg5 = new Weighted(e5,5);
		ArrayList<Weighted<Edge<Integer>>> a = new ArrayList<Weighted<Edge<Integer>>>();
		a.add(eg1);a.add(eg2);a.add(eg3);a.add(eg4);a.add(eg4);
		Iterable<Weighted<Edge<Integer>>> it = a;
		SparseWeightedGraph<Integer> swg = SparseWeightedGraph.from(it);
		assertEquals(2,(int)(swg.getWeightOf(1, 3)));
		if(swg.getWeightOf(1, 5) == Double.NEGATIVE_INFINITY) {
			assertEquals(1,1);
		}
		else {
			assertEquals(1,2);
		}
		assertEquals(true,eg1.equals(eg1));
		assertEquals(false,eg1.equals(eg2));
		assertEquals(false,eg1.equals(a));
		Edge<Integer> e6 = new Edge(4,5);eg6 = new Weighted(e6,5);
		assertEquals(false,eg6.equals(eg5));
		Edge<Integer> e7 = new Edge(4,5);eg7 = new Weighted(e7,6);
		assertEquals(false,eg6.equals(eg7));
		//System.out.println(eg6.hashCode());
		assertEquals(1075087295,eg6.hashCode());
		//System.out.println(eg6.toString());
		String ss = "Weighted{val=Edge{source=4, destination=5}, weight=5.0}";
		assertEquals(ss,eg6.toString());
		assertEquals(false,e6.equals(null));
		assertEquals(false,e6.equals(a));
	}
}
