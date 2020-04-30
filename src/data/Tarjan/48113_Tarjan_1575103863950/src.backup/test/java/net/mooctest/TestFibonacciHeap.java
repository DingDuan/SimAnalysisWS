package net.mooctest;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import net.mooctest.EdgeQueueMap.EdgeQueue;


public class TestFibonacciHeap {
	private static Class class1;
	private static Class class2;
	private static Class class3;
	private static Partition p;//v对象�?
	private static SparseWeightedGraph s;
	private static Arborescence a;
	private static DenseWeightedGraph d; 
	
	@BeforeClass
	public static void beforeClass() throws Exception{
		class1=Class.forName("net.mooctest.Partition");//类的位置
		class2=Class.forName("net.mooctest.ExclusiveEdge");//类的位置
		class3=Class.forName("net.mooctest.DenseWeightedGraph");//类的位置
	}
	@Test
	public void test0() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		heap.add(90, 90);
		
	}
	 @Test(timeout = 4000)
	  public void test() throws Throwable{
		  //a(); 
		Edge e1=new Edge(1,4);//source,destination
		Edge e2=new Edge(2,1);
		Edge e3=new Edge(3,1);
		Edge e4=new Edge(3,4);  
		Edge e5=new Edge(4,3);
		Edge e6=new Edge(2,4);
		Edge e7=new Edge(2,3);
		Edge.from(1);
		Edge.from(2);
		Edge.from(3);
		Edge.from(4);
		e1.toString();
		e1.equals(e6);
		a(true,e1.equals(e1));
		a(false,e1.equals(e2));
		a(false,e1.equals(e3));
		a(false,e1.equals(e4));
		a(false,e1.equals(e5));
		a(false,e1.equals(e6));
		a(false,e2.equals(e6));
		a(false,e2.equals(e5));
		a(false,e2.equals(e4));
		a(false,e2.equals(e3));
		a(true,e2.equals(e2));
		a(false,e2.equals(null));
		a(1024,e2.hashCode());
		try {
			e2.competesWith(null);
		}catch(NullPointerException e) {
			
		}
		//e1.
		Set<Edge<Integer>>s=new HashSet<Edge<Integer>>();
		s.add(e7);
		s.add(e6);
		s.add(e5);
		s.add(e4);
		s.add(e3);
		s.add(e2);
		s.add(e1);
		Set<Edge<Integer>>s1=new HashSet<Edge<Integer>>();
		s1.add(e1);
		e1.competesWith(s1);
		e2.isIn(s1);
		e2.isAutoCycle();
		e2.hasDestination(null);
		
		
		Pair p1=new Pair(1,4);
		Pair p2=new Pair(2,1);
		Pair p3=new Pair(3,1);
		Pair p4=new Pair(3,4);
		Pair p5=new Pair(4,4);
		Pair p6=new Pair(2,2);
		Pair p7=new Pair(2,3);
		p1.equals(p1);
		a(true,p1.equals(p1));
		a(false,p1.equals(p2));
		a(false,p3.equals(p2));
		a(false,p4.equals(p2));
		a(false,p5.equals(p2));
		a(false,p6.equals(p2));
		a(false,p7.equals(p2));
		a(false,p3.equals(p4));
		a(false,p3.equals(p5));
		a(false,p3.equals(p6));
		a(false,p3.equals(p7));
		p6.toString();
		System.out.println();
		a("Pair{first=2, second=2}",p6.toString());
		Weighted w=new Weighted(1,2);
		for(int j=0;j<100;j++) {
		for(int i=0;i<100;i++) {
			Weighted w1=new Weighted(i+1,i+2);
			w1.weighted(i, i+3);
			w1.compareTo(w);
			w1.equals(p6);
			w1.equals(w);
			w1.equals(w1);
			
			}
		}
		Weighted w2=new Weighted(2,2);
		Weighted w3=new Weighted(3,3);
		Weighted w4=new Weighted(23,4);
		Weighted w5=new Weighted(13,22);
		Weighted w6=new Weighted(1,200);
		w3.equals(w4);
		w4.equals(w4);
		a(true,w4.equals(w4));
		a(false,w3.equals(w4));
		a("Weighted{val=2, weight=2.0}",w2.toString());
		a("Weighted{val=3, weight=3.0}",w3.toString());
		//SparseWeightedGraph.from(edges);
		//SparseWeightedGraph.
		Weighted<Edge<Integer>> we=new Weighted<Edge<Integer>>(e7, 0);
		//SparseWeightedGraph.from(we);
		we.compareTo(w6);
		we.toString();
		we.weighted(1, 1);
		//SparseWeightedGraph<Integer> s1 = SparseWeightedGraph.getInstance();
		KBestArborescences kb=new KBestArborescences();
		//kb.scoreSubsetOfSolutions(null, , banned, wBestArborescence)
		//WeightedGraph<Integer> wg=new WeightedGraph<Integer>();
		//ChuLiuEdmonds c=ChuLiuEdmonds.getMaxArborescence(graph)
		//WeightedGraph.class;
		
		Scanner cin = new Scanner(System.in);
		//Main hern = new Main();	
		
		
			
	 
	 }
	 @Test(timeout = 4000)
	  public void test13()  throws Throwable  {
		String data = "ss";//固定
		//int s;//根据待测方法返回值类�?
		Map mp1=new HashMap();
		mp1.put(1, 1);
		Map mp2=new HashMap();
		mp2.put(1, 1);
		InputStream stdin = System.in;//固定
		try { 
		System.setIn(new ByteArrayInputStream(data.getBytes())); //固定
		//s=Jipa.readValue();//可变（待测方法）
		//Partition p=new Partition(mp1, mp2); 
		} finally{ 
		System.setIn(stdin); //固定
		  }
		 //assertEquals(0,s);
		
         Map<String,String> cols = new HashMap<String,String>();
         cols.put("id", "int unsigned primary key auto_increment");
         cols.put("name", "varchar(50) not null unique");
         String result = "";
         Class<?> clazz  = EdgeQueueMap.class;


	  }
	 	//测试类的私有构�?�函�?
		@Test
		public void test11()throws Exception{
			Map m=new HashMap();
			Map mm=new HashMap();
			Constructor c=class1.getDeclaredConstructor(Map.class,Map.class);
			c.setAccessible(true);
			Partition v=(Partition)c.newInstance(m,mm);
			
		}
	 
		//测试类的私有构�?�函�?
		@Test
		public void test10()throws Exception{
			HashSet<Integer>hs=new HashSet<Integer>();
			hs.add(1);
			hs.add(2);
			hs.add(3);
			hs.add(4);
			hs.add(5);
			
			
		}
	
	  @Test(timeout = 4000)
	  public void test1() throws Throwable{
		  	Map m=new HashMap();
			Map mm=new HashMap();
			//Constructor c=class1.getDeclaredConstructor(ArrayList.class,Map.class,Double[][].class);
			//c.setAccessible(true);
			//DenseWeightedGraph de=(DenseWeightedGraph)c.newInstance(m,mm);
		  
	  }
	  @Test(timeout = 4000)
	  public void test2() throws Throwable{
		  //a(); 
		  
		  
		  
	  }
	  @Test(timeout = 4000)
	  public void test3() throws Throwable{
		  //a(); 
		  /*
			当函数的参数为Collection类型的时候用它的实现类创建：
			HashSet ArrayList
			Collection<Integer>c=new ArrayList<Integer>();
			Collection<Integer> c = Arrays.asList(10, 9, 7, 11, 12);
		  */
		  
		  /* 异常try----catch
			assertEquals(FileNotFoundException.class,e.getClass());
			
			
			@Rule
			public ExpectedException expectedException = ExpectedException.none();
			@Test(timeout = 4000)
			public void test () {
	        expectedException.expect(IllegalArgumentException.class);
	  		expectedException.expectMessage("The length of product's name cannot longer than 20: ");
	  		//写方法，构�?�对�? ,上一条语句就是测试这�?句的异常输出
			}
			
		  */  
		}
	  @Before
      public void setUp() throws Exception
      {
      }

      @After
      public void tearDown() throws Exception
      {
      }

      @Test
      public void testGetSQL()
      {
               
               
      }
		private <T> void a(T a, T b) {
			assertEquals(a, b);
		}
}
