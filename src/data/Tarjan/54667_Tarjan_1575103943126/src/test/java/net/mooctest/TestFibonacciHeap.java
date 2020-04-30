package net.mooctest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.junit.Test;
import com.google.common.base.Optional;
import net.mooctest.EdgeQueueMap.EdgeQueue;



public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
	}
	
	@Test
	public void my_test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
		heap.comparator();
		heap.clear();
		assertTrue(heap.isEmpty());
		
		Optional<FibonacciHeap<Integer, Integer>.Entry> optional=heap.add(2, 3);
		heap.add(3, 4);
		FibonacciHeap<Integer, Integer>.Entry en=optional.get();
		
		heap.remove(en);
		assertFalse(heap.isEmpty());
		heap.peekOption();
		heap.pollOption();
		assertEquals(0,heap.size());
		heap.iterator();
		try {
			heap.decreasePriority(en, 2);
			fail();
		} catch (Exception e) {
			// TODO: handle exception
		}
		heap.merge(heap, heap);
	}
	
	@Test
	public void my_test02() {
		Arborescence<Integer>ar=Arborescence.of(null);
		ar.empty();
		try {
			ar.contains(new Edge<Integer>(1, 2));
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			ar.toString();
			fail();
		} catch (Exception e) {
			// TODO: handle exception
		}
		assertFalse(ar.equals(null));
		assertFalse(ar.equals(2));
		assertTrue(ar.equals(ar));
		ar.hashCode();
		
		//SparseWeightedGraph<T>
		ArrayList<Weighted<Edge<Integer>>> arr=new ArrayList<>();
		Weighted<Edge<Integer>>we1=new Weighted<Edge<Integer>>(new Edge<Integer>(2,3), 2.3);
		Weighted<Edge<Integer>>we2=new Weighted<Edge<Integer>>(new Edge<Integer>(2,3), 2.3);
		Weighted<Edge<Integer>>we3=new Weighted<Edge<Integer>>(new Edge<Integer>(1,2), 2.5);
		arr.add(we1);
		arr.add(we2);
		arr.add(we3);
		
		SparseWeightedGraph<Integer>weightedGraph=SparseWeightedGraph.from(arr);
		double swe=weightedGraph.getWeightOf(1, 2);
		assertEquals(2.5, swe,0.000001);
		double swe1=weightedGraph.getWeightOf(1, 4);
		//System.out.println(swe1);
		String anString2=String.valueOf(swe1);
		assertTrue(anString2.equals("-Infinity"));
		
		//ChuLiuEdmonds
		ChuLiuEdmonds ch=new ChuLiuEdmonds();
		Weighted<Arborescence<Integer>> wa=ChuLiuEdmonds.getMaxArborescence(weightedGraph);
		Weighted<Arborescence<Integer>> wa2=ChuLiuEdmonds.getMaxArborescence(weightedGraph,1);
	
		ArrayList<Integer> arr2=new ArrayList<>();
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		double[][] weights=new double [][] {{2.0,3.0,},{3.0,3.0}};
		DenseWeightedGraph<Integer>denseWeightedGraph=DenseWeightedGraph.from(weights);
		try {
			DenseWeightedGraph<Integer>denseWeightedGraph2=DenseWeightedGraph.from(arr2,weights);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		double aa1=denseWeightedGraph.getWeightOf(1, 2);
		//System.out.println(aa1);
		String anString=String.valueOf(aa1);
		assertTrue(anString.equals("-Infinity"));
		double aa2=denseWeightedGraph.getWeightOf(0, 1);
		//System.out.println(aa2);
		assertEquals(3.0, aa2,0.000001);
		Collection<Weighted<Edge<Integer>>> arr3=denseWeightedGraph.getIncomingEdges(1);
		//System.out.println(arr3.size());
		assertEquals(2, arr3.size());
		Collection<Integer>co=denseWeightedGraph.getNodes();
		//System.out.println(co.size());
		assertEquals(2, co.size());
		
		Edge<Integer>ed1=new Edge<Integer>(1,5);
		Edge<Integer>ed2=new Edge<Integer>(1,6);
		Edge<Integer>ed3=new Edge<Integer>(1,5);
		String str1=ed1.toString();
		//System.out.println(str1);
		assertTrue(str1.equals("Edge{source=1, destination=5}"));
		assertFalse(ed1.equals(null));
		assertFalse(ed1.equals(2));
		assertFalse(ed1.equals(ed2));
		assertTrue(ed1.equals(ed3));
		
		FibonacciQueue fq=FibonacciQueue.create();
		fq.peek();
		Comparator<Integer> cm=fq.comparator();
		FibonacciQueue fq2=FibonacciQueue.create(cm);
		
	}
	
	@Test
	public void my_test03() {
		ArrayList<Weighted<Edge<Integer>>> arr=new ArrayList<>();
		Weighted<Edge<Integer>>we1=new Weighted<Edge<Integer>>(new Edge<Integer>(2,3), 2.3);
		Weighted<Edge<Integer>>we2=new Weighted<Edge<Integer>>(new Edge<Integer>(2,3), 2.3);
		Weighted<Edge<Integer>>we3=new Weighted<Edge<Integer>>(new Edge<Integer>(2,3), 2.3);
		arr.add(we1);
		arr.add(we2);
		arr.add(we3);
		
		SparseWeightedGraph<Integer>weightedGraph=SparseWeightedGraph.from(arr);
		
		KBestArborescences ka=new KBestArborescences();
		List<Weighted<Arborescence<Integer>>> lwa=ka.getKBestArborescences(weightedGraph, 2, 2);
		
		double[][] weights=new double [][] {{2.0,3.0,},{3.0,3.0}};
		DenseWeightedGraph<Integer>denseWeightedGraph=DenseWeightedGraph.from(weights);
		
		Arborescence<Integer>ar=Arborescence.of(null);
		Edge<Integer>ed1=new Edge<Integer>(1, 2);
		 Weighted<Arborescence<Integer>> bestArborescence=new Weighted<Arborescence<Integer>>(ar,2);
		 Set<Edge<Integer>>s1=new Set<Edge<Integer>>() {
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Edge<Integer>> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean add(Edge<Integer> e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends Edge<Integer>> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
		};
		
		KBestArborescences.SubsetOfSolutions<Integer> kaSolutions=new KBestArborescences.SubsetOfSolutions<Integer>(ed1,bestArborescence,s1,s1);
	}
	
	@Test
	public void test033() {
		Pair<Integer,Integer>p1=new Pair<Integer,Integer>(1,2);
		Pair<Integer,Integer>p2=new Pair<Integer,Integer>(1,2);
		Pair<Integer,Integer>p3=new Pair<Integer,Integer>(1,5);
		String str1=p1.toString();
		//System.out.println(str1);
		assertTrue(str1.equals("Pair{first=1, second=2}"));
		assertTrue(p1.equals(p2));
		assertFalse(p1.equals(null));
		assertFalse(p1.equals(2));
		assertFalse(p1.equals(p3));
		p1.hashCode();
		Pair<Integer,Integer>p4=p1.of(2, 3);
		String str2=p4.toString();
		assertTrue(str2.equals("Pair{first=2, second=3}"));
	}
	
	@Test
	public void test0334() {
		ArrayList<Edge<Integer>> ar=new ArrayList<Edge<Integer>>();
		ar.add(new Edge<Integer>(2,3));
		ar.add(new Edge<Integer>(1,3));
		ar.add(new Edge<Integer>(5,3));
		ar.add(new Edge<Integer>(4,3));
		
		Collection<Edge<Integer>> collection=ar;
		
		Partition<Edge<Integer>>pa=Partition.singletons(collection);
		
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		Collection<Integer> collection2=arr;
		
		Partition<Integer>pa2=Partition.singletons(collection2);
		int a1=pa2.merge(2, 2);
		int a2=pa2.merge(1, 2);
		int a3=pa2.merge(4, 2);
		//System.out.println(a1);
		assertEquals(2, a1);
		assertEquals(1, a2);
		assertEquals(1, a3);
		//System.out.println(a2);
		//System.out.println(a3);
		try {
			pa2.merge(-2, 2);
			fail();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Edge<Integer>edge=new Edge<Integer>(2,3);
		Weighted<Edge<Integer>>we=new Weighted<Edge<Integer>>(edge,2.5);
		Weighted<Edge<Integer>>we2=new Weighted<Edge<Integer>>(edge,3.52);
		Weighted<Edge<Integer>>we3=new Weighted<Edge<Integer>>(edge,2.5);
		Weighted<Edge<Integer>>we4=new Weighted<Edge<Integer>>(edge,1.5);
		
		int com1=we.compareTo(we2);
		int com2=we.compareTo(we3);
		int com3=we.compareTo(we4);
		assertEquals(1, com1);
		assertEquals(-1, com3);
		assertEquals(0, com2);
		
		assertTrue(we.equals(we3));
		assertFalse(we.equals(we2));
		assertFalse(we.equals(2));
		we.hashCode();
		String str=we.toString();
		//System.out.println(str);
		assertTrue(str.equals("Weighted{val=Edge{source=2, destination=3}, weight=2.5}"));

		EdgeQueue<Integer> edMap=EdgeQueueMap.EdgeQueue.create(22, pa2);
		
		EdgeQueueMap dqm=new EdgeQueueMap(pa);
		ArrayList<Pair<EdgeQueue<Integer>, Weighted<Edge<Integer>>>> arrayList=new ArrayList<Pair<EdgeQueue<Integer>, Weighted<Edge<Integer>>>>();
		Pair<EdgeQueue<Integer>, Weighted<Edge<Integer>> >pair1=new Pair<EdgeQueue<Integer>, Weighted<Edge<Integer> >>(edMap,we);
		arrayList.add(pair1);
		
		
	}
}
