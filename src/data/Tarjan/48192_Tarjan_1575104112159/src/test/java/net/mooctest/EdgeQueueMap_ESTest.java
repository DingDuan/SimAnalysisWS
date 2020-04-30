/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:56:57 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.stmt.BreakStmt;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import java.lang.annotation.Annotation;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;
import net.mooctest.Arborescence;
import net.mooctest.Edge;
import net.mooctest.EdgeQueueMap;
import net.mooctest.ExclusiveEdge;
import net.mooctest.FibonacciQueue;
import net.mooctest.Pair;
import net.mooctest.Partition;
import net.mooctest.Weighted;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EdgeQueueMap_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Edge<ConstructorDeclaration> edge0 = (Edge<ConstructorDeclaration>) mock(Edge.class, new ViolatedAssumptionAnswer());
      EdgeQueueMap.EdgeQueue<Edge<ConstructorDeclaration>> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(edge0, (Partition<Edge<ConstructorDeclaration>>) null);
      // Undeclared exception!
      try { 
        edgeQueueMap_EdgeQueue0.addEdge((ExclusiveEdge<Edge<ConstructorDeclaration>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.EdgeQueueMap$EdgeQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PriorityQueue<ConstructorDeclaration> priorityQueue0 = new PriorityQueue<ConstructorDeclaration>();
      Partition<ConstructorDeclaration> partition0 = Partition.singletons((Collection<ConstructorDeclaration>) priorityQueue0);
      EdgeQueueMap<ConstructorDeclaration> edgeQueueMap0 = new EdgeQueueMap<ConstructorDeclaration>(partition0);
      Edge<ConstructorDeclaration> edge0 = (Edge<ConstructorDeclaration>) mock(Edge.class, new ViolatedAssumptionAnswer());
      Weighted<Edge<ConstructorDeclaration>> weighted0 = new Weighted<Edge<ConstructorDeclaration>>(edge0, 1635.2427779);
      // Undeclared exception!
      try { 
        edgeQueueMap0.addEdge(weighted0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Partition", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EdgeQueueMap<Weighted<String>> edgeQueueMap0 = new EdgeQueueMap<Weighted<String>>((Partition<Weighted<String>>) null);
      Weighted<String> weighted0 = Weighted.weighted("", (-1.0));
      ArrayDeque<Pair<EdgeQueueMap.EdgeQueue<Weighted<String>>, Weighted<Edge<Weighted<String>>>>> arrayDeque0 = new ArrayDeque<Pair<EdgeQueueMap.EdgeQueue<Weighted<String>>, Weighted<Edge<Weighted<String>>>>>();
      Pair<EdgeQueueMap.EdgeQueue<Weighted<String>>, Weighted<Edge<Weighted<String>>>> pair0 = (Pair<EdgeQueueMap.EdgeQueue<Weighted<String>>, Weighted<Edge<Weighted<String>>>>) mock(Pair.class, new ViolatedAssumptionAnswer());
      arrayDeque0.addLast(pair0);
      // Undeclared exception!
      try { 
        edgeQueueMap0.merge(weighted0, arrayDeque0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.EdgeQueueMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TreeSet<Weighted<Integer>> treeSet0 = new TreeSet<Weighted<Integer>>();
      Partition<Weighted<Integer>> partition0 = Partition.singletons((Collection<Weighted<Integer>>) treeSet0);
      EdgeQueueMap<Weighted<Integer>> edgeQueueMap0 = new EdgeQueueMap<Weighted<Integer>>(partition0);
      Integer integer0 = new Integer(0);
      Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, 0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<Pair<EdgeQueueMap.EdgeQueue<Weighted<Integer>>, Weighted<Edge<Weighted<Integer>>>>> priorityQueue0 = new PriorityQueue<Pair<EdgeQueueMap.EdgeQueue<Weighted<Integer>>, Weighted<Edge<Weighted<Integer>>>>>(comparator0);
      edgeQueueMap0.merge(weighted0, priorityQueue0);
      Arborescence<Weighted<Integer>> arborescence0 = Arborescence.empty();
      Optional<ExclusiveEdge<Weighted<Integer>>> optional0 = edgeQueueMap0.popBestEdge(weighted0, arborescence0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NodeList<ConstructorDeclaration> nodeList0 = new NodeList<ConstructorDeclaration>();
      Partition<ConstructorDeclaration> partition0 = Partition.singletons((Collection<ConstructorDeclaration>) nodeList0);
      EdgeQueueMap<ConstructorDeclaration> edgeQueueMap0 = new EdgeQueueMap<ConstructorDeclaration>(partition0);
      Arborescence<ConstructorDeclaration> arborescence0 = Arborescence.of((ImmutableMap<ConstructorDeclaration, ConstructorDeclaration>) null);
      Optional<ExclusiveEdge<ConstructorDeclaration>> optional0 = edgeQueueMap0.popBestEdge((ConstructorDeclaration) null, arborescence0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BreakStmt breakStmt0 = new BreakStmt("hwv}v:J");
      FibonacciQueue<BreakStmt> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super BreakStmt>) breakStmt0.NODE_BY_BEGIN_POSITION);
      Partition<BreakStmt> partition0 = Partition.singletons((Collection<BreakStmt>) fibonacciQueue0);
      EdgeQueueMap.EdgeQueue<BreakStmt> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(breakStmt0, partition0);
      Optional<ExclusiveEdge<BreakStmt>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge();
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Annotation annotation0 = mock(Annotation.class, new ViolatedAssumptionAnswer());
      Edge<Annotation> edge0 = new Edge<Annotation>(annotation0, annotation0);
      ExclusiveEdge<Annotation> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.7);
      HashSet<ExclusiveEdge<Annotation>> hashSet0 = new HashSet<ExclusiveEdge<Annotation>>();
      Partition<ExclusiveEdge<Annotation>> partition0 = Partition.singletons((Collection<ExclusiveEdge<Annotation>>) hashSet0);
      EdgeQueueMap.EdgeQueue<ExclusiveEdge<Annotation>> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(exclusiveEdge0, partition0);
      Optional<ExclusiveEdge<ExclusiveEdge<Annotation>>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge((Arborescence<ExclusiveEdge<Annotation>>) null);
      assertNotNull(optional0);
  }
}
