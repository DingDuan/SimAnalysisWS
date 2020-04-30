/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 06:40:06 GMT 2019
 */

package net.mooctest;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;

import com.google.common.base.Predicate;

import java.util.Collection;
import java.util.Iterator;

import net.mooctest.DenseWeightedGraph;
import net.mooctest.Edge;
import net.mooctest.SparseWeightedGraph;
import net.mooctest.Weighted;
import net.mooctest.WeightedGraph;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

public class WeightedGraph_ESTest {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Iterator<Weighted<Edge<Integer>>> iterator0 = (Iterator<Weighted<Edge<Integer>>>) mock(Iterator.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(iterator0).hasNext();
        Iterable<Weighted<Edge<Integer>>> iterable0 = (Iterable<Weighted<Edge<Integer>>>) mock(Iterable.class, new ViolatedAssumptionAnswer());
        doReturn(iterator0, (Iterator) null).when(iterable0).iterator();
        // Undeclared exception!
        try {
            SparseWeightedGraph.from(iterable0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.SparseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        double[][] doubleArray0 = new double[6][0];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Collection<Integer> collection0 = denseWeightedGraph0.getNodes();
        assertNotNull(collection0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        double[][] doubleArray0 = new double[1][1];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Integer integer0 = new Integer((-4898));
        Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
        assertNotNull(collection0);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        double[][] doubleArray0 = new double[2][9];
        double[] doubleArray1 = new double[0];
        doubleArray0[1] = doubleArray1;
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Integer integer0 = new Integer(1);
        // Undeclared exception!
        try {
            denseWeightedGraph0.getWeightOf(integer0, integer0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 1
            //
            verifyException("net.mooctest.DenseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        double[][] doubleArray0 = new double[1][7];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        // Undeclared exception!
        try {
            denseWeightedGraph0.filterEdges((Predicate<Edge<Integer>>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.WeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        double[][] doubleArray0 = new double[7][0];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Predicate<Edge<Integer>> predicate0 = (Predicate<Edge<Integer>>) mock(Predicate.class, new ViolatedAssumptionAnswer());
        // Undeclared exception!
        try {
            denseWeightedGraph0.filterEdges(predicate0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
            verifyException("net.mooctest.DenseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        double[][] doubleArray0 = new double[1][7];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Predicate<Edge<Integer>> predicate0 = (Predicate<Edge<Integer>>) mock(Predicate.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(predicate0).apply(nullable(Edge.class));
        WeightedGraph<Integer> weightedGraph0 = denseWeightedGraph0.filterEdges(predicate0);
        assertNotNull(weightedGraph0);
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        double[][] doubleArray0 = new double[1][7];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Predicate<Edge<Integer>> predicate0 = (Predicate<Edge<Integer>>) mock(Predicate.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(predicate0).apply(nullable(Edge.class));
        WeightedGraph<Integer> weightedGraph0 = denseWeightedGraph0.filterEdges(predicate0);
        assertNotNull(weightedGraph0);
    }
}
