/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 06:11:05 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class DenseWeightedGraph_ESTest  {

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        double[][] doubleArray0 = new double[4][4];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Integer integer0 = new Integer(0);
        Integer integer1 = Integer.getInteger("Ordering.explicit(", 0);
        double double0 = denseWeightedGraph0.getWeightOf(integer1, integer0);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        ArrayDeque<String> arrayDeque0 = new ArrayDeque<String>();
        HashSet<Object> hashSet0 = new HashSet<Object>(arrayDeque0);
        Edge<String> edge0 = new Edge<String>("=7x?,La+tliv )>9W", "");
        hashSet0.add(edge0);
        double[][] doubleArray0 = new double[0][3];
        // Undeclared exception!
        try {
            DenseWeightedGraph.from((Iterable<Object>) hashSet0, doubleArray0);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        HashSet<List<Integer>> hashSet0 = new HashSet<List<Integer>>();
        double[][] doubleArray0 = new double[1][4];
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 285.7699983787;
        ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
        hashSet0.add(arrayList0);
        doubleArray0[0] = doubleArray1;
        DenseWeightedGraph<List<Integer>> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<List<Integer>>) hashSet0, doubleArray0);
        Stack<Integer> stack0 = new Stack<Integer>();
        double double0 = denseWeightedGraph0.getWeightOf(stack0, stack0);
        assertEquals(285.7699983787, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        HashSet<List<Integer>> hashSet0 = new HashSet<List<Integer>>();
        double[][] doubleArray0 = new double[1][4];
        ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
        hashSet0.add(arrayList0);
        DenseWeightedGraph<List<Integer>> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<List<Integer>>) hashSet0, doubleArray0);
        arrayList0.add((Integer) null);
        // Undeclared exception!
        try {
            denseWeightedGraph0.getIncomingEdges(arrayList0);
            //  fail("Expecting exception: NullPointerException");
            // Unstable assertion
        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.DenseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        double[][] doubleArray0 = new double[5][4];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Integer integer0 = new Integer(4);
        // Undeclared exception!
        try {
            denseWeightedGraph0.getIncomingEdges(integer0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch(ArrayIndexOutOfBoundsException e) {
            //
            // 4
            //
            verifyException("net.mooctest.DenseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        // Undeclared exception!
        try {
            DenseWeightedGraph.from((double[][]) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.DenseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        // Undeclared exception!
        try {
            DenseWeightedGraph.from((Iterable<String>) treeSet0, (double[][]) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.DenseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        double[][] doubleArray0 = new double[1][2];
        // Undeclared exception!
        try {
            DenseWeightedGraph.from((Iterable<Object>) null, doubleArray0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        double[][] doubleArray0 = new double[4][4];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Integer integer0 = new Integer(0);
        Collection<Weighted<Edge<Integer>>> collection0 = denseWeightedGraph0.getIncomingEdges(integer0);
        assertNotNull(collection0);
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        HashSet<List<Integer>> hashSet0 = new HashSet<List<Integer>>();
        double[][] doubleArray0 = new double[1][4];
        ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
        hashSet0.add(arrayList0);
        DenseWeightedGraph<List<Integer>> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<List<Integer>>) hashSet0, doubleArray0);
        Vector<Object> vector0 = new Vector<Object>(hashSet0);
        DenseWeightedGraph<Object> denseWeightedGraph1 = DenseWeightedGraph.from((Iterable<Object>) vector0, doubleArray0);
        Collection<Weighted<Edge<Object>>> collection0 = denseWeightedGraph1.getIncomingEdges(denseWeightedGraph0);
        assertNotNull(collection0);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        double[][] doubleArray0 = new double[1][4];
        Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        EnumSet<Locale.FilteringMode> enumSet0 = EnumSet.of(locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0);
        DenseWeightedGraph<Locale.FilteringMode> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Locale.FilteringMode>) enumSet0, doubleArray0);
        Locale.FilteringMode locale_FilteringMode1 = Locale.FilteringMode.AUTOSELECT_FILTERING;
        double double0 = denseWeightedGraph0.getWeightOf(locale_FilteringMode0, locale_FilteringMode1);
        assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        HashSet<List<Integer>> hashSet0 = new HashSet<List<Integer>>();
        double[][] doubleArray0 = new double[1][4];
        ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
        hashSet0.add(arrayList0);
        DenseWeightedGraph<List<Integer>> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<List<Integer>>) hashSet0, doubleArray0);
        Vector<Object> vector0 = new Vector<Object>(hashSet0);
        DenseWeightedGraph<Object> denseWeightedGraph1 = DenseWeightedGraph.from((Iterable<Object>) vector0, doubleArray0);
        double double0 = denseWeightedGraph1.getWeightOf(denseWeightedGraph0, vector0);
        assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        double[][] doubleArray0 = new double[8][4];
        ArrayDeque<ArrayList<Integer>> arrayDeque0 = new ArrayDeque<ArrayList<Integer>>();
        // Undeclared exception!
        try {
            DenseWeightedGraph.from((Iterable<ArrayList<Integer>>) arrayDeque0, doubleArray0);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        double[][] doubleArray0 = new double[4][4];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Collection<Integer> collection0 = denseWeightedGraph0.getNodes();
        assertNotNull(collection0);
    }
}