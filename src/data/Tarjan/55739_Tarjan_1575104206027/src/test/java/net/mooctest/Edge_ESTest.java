/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 06:21:39 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Edge_ESTest{
    //////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////
    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
        Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) linkedHashSet0);
        Edge<Object> edge0 = new Edge<Object>(linkedHashSet0, edge_EdgeBuilder0);
        linkedHashSet0.add(edge0);
        Integer integer0 = new Integer(0);
        Edge<Object> edge1 = edge_EdgeBuilder0.to(integer0);
//        try{
//            edge1.toString();
//        }catch (Exception e){
//            System.out.printf(e.getMessage());
//        }


    }
    //////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////
    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
        Integer integer0 = new Integer(249);
        Edge.EdgeBuilder<Integer> edge_EdgeBuilder0 = Edge.from(integer0);
        Integer integer1 = new Integer(249);
        Edge<Integer> edge0 = edge_EdgeBuilder0.to(integer1);
        Edge.isAutoCycle();
        Integer integer2 = new Integer(249);
        Edge.isAutoCycle();
        Edge.hasDestination((Object) integer2);
        Edge.from((Object) linkedHashSet0);
        linkedHashSet0.add(edge0);
        int int0 = (-61);
        Integer integer3 = new Integer((-61));
        Integer integer4 = new Integer((-61));
        Edge<Integer> edge1 = new Edge<Integer>(integer4, integer3);
        linkedHashSet0.add(edge1);
        Edge<Integer> edge2 = new Edge<Integer>(integer3, integer3);
        //edge2.toString();
        linkedHashSet0.add(edge2);
        // Undeclared exception!
        try {
            Edge.competesWith((Set<Edge<Integer>>) linkedHashSet0);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // duplicate key: -61
            //
            assertEquals("duplicate key: -61",e.getMessage());
        }
    }
    //////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////
//    @Test(timeout = 4000)
//    public void test02()  throws Throwable  {
//        LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
//        Edge<Object> edge0 = new Edge<Object>(linkedHashSet0, linkedHashSet0);
//        edge0.hashCode();
//        linkedHashSet0.add(edge0);
//        Edge<Object> edge1 = new Edge<Object>(linkedHashSet0, edge0);
//        //edge1.toString();
//        linkedHashSet0.add(edge1);
//        Predicate<Edge<Object>> predicate0 = Edge.isIn((Set<Edge<Object>>) linkedHashSet0);
//        Edge.hasDestination((Object) predicate0);
//        edge0.hashCode();
//        edge0.hashCode();
//        Object object0 = null;
//        edge1.equals(object0);
//        LinkedHashSet<Edge<Edge<Integer>>> linkedHashSet1 = new LinkedHashSet<Edge<Edge<Integer>>>();
//        int int0 = 2;
//        Integer integer0 = new Integer(int0);
//        Edge.EdgeBuilder<Integer> edge_EdgeBuilder0 = Edge.from(integer0);
//        int int1 = 2363;
//        Integer integer1 = new Integer(int1);
//        Edge<Integer> edge2 = edge_EdgeBuilder0.to(integer1);
//        Edge<Edge<Integer>> edge3 = new Edge<Edge<Integer>>(edge2, edge2);
//        linkedHashSet1.add(edge3);
//        Edge.isIn((Set<Edge<Edge<Integer>>>) linkedHashSet1);
//        String string0 = "net.mooctest.Edge";
//        Edge.hasDestination(string0);
//        String string1 = "source";
//        String string2 = "%Kv5a)&";
//        Edge<String> edge4 = new Edge<String>(string1, string2);
//        edge4.hashCode();
//        Edge.isAutoCycle();
//        Edge.hasDestination(string2);
//        int int2 = 0;
//        Integer integer2 = new Integer(int2);
//        Edge.EdgeBuilder<Integer> edge_EdgeBuilder1 = Edge.from(integer2);
//        Integer integer3 = new Integer(int2);
//        Edge<Integer> edge5 = edge_EdgeBuilder1.to(integer3);
//        Edge.hasDestination((Object) edge5);
//    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        Edge.isAutoCycle();
        Integer integer0 = new Integer((-456));
        Edge<Integer> edge0 = new Edge<Integer>(integer0, integer0);
        Edge.hasDestination(edge0);
        Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("d&");
        String string0 = edge_EdgeBuilder0.source;
        Edge.EdgeBuilder<Object> edge_EdgeBuilder1 = Edge.from((Object) "d&");
        Edge<Object> edge1 = edge_EdgeBuilder1.to("d&");
        String string1 = (String)edge1.source;
        Integer integer1 = new Integer((-456));
        Edge<Object> edge2 = new Edge<Object>("d&", integer1);
        Edge<String> edge3 = new Edge<String>("d&", "d&");
        edge2.equals(edge3);
        LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
        Predicate<Edge<String>> predicate0 = Edge.isIn((Set<Edge<String>>) linkedHashSet0);
        assertNotNull(predicate0);
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        Integer integer0 = new Integer(395);
        Edge.EdgeBuilder<Integer> edge_EdgeBuilder0 = Edge.from(integer0);
        Integer integer1 = new Integer(1);
        Edge<Integer> edge0 = edge_EdgeBuilder0.to(integer1);
        Integer integer2 = new Integer(395);
        edge0.equals(integer2);
        // Undeclared exception!
        try {
            Edge.competesWith((Set<Edge<Integer>>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.Edge", e);
        }
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        Edge<Object> edge0 = new Edge<Object>((Object) null, (Object) null);
        edge0.hashCode();
        edge0.equals((Object) null);
        LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
        LinkedList<Object> linkedList0 = new LinkedList<Object>(linkedHashSet0);
        linkedList0.add((Object) linkedHashSet0);
        linkedList0.removeAll(linkedHashSet0);
        linkedHashSet0.retainAll(linkedList0);
        Edge.isIn((Set<Edge<String>>) linkedHashSet0);
        Edge.from((Object) linkedHashSet0);
        Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
        assertNotNull(edge_EdgeBuilder0);
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
        String string0 = null;
        Edge<String> edge0 = new Edge<String>((String) null, (String) null);
        linkedHashSet0.add(edge0);
        Edge<String> edge1 = new Edge<String>((String) null, (String) null);
        linkedHashSet0.add(edge1);
        // Undeclared exception!
        try {
            Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // null key in entry: null=null
            //
            assertEquals("null key in entry: null=null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        Integer integer0 = new Integer((-3264));
        Edge.EdgeBuilder<Integer> edge_EdgeBuilder0 = Edge.from(integer0);
        Edge<Object> edge0 = new Edge<Object>((Object) null, edge_EdgeBuilder0);
        Edge.isAutoCycle();
        //edge0.toString();
        Integer integer1 = new Integer((-3264));
        Edge.hasDestination(integer1);
        Edge.hasDestination("pZE&^h \">gm");
        Integer integer2 = new Integer((-3264));
        Edge<Integer> edge1 = new Edge<Integer>(integer1, integer2);
        Edge.isAutoCycle();
        edge1.hashCode();
        edge1.hashCode();
        LinkedHashSet<Edge<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<String>>>();
        linkedHashSet0.remove("pZE&^h \">gm");
        Edge.competesWith((Set<Edge<Edge<String>>>) linkedHashSet0);
        LinkedHashSet<Edge<String>> linkedHashSet1 = new LinkedHashSet<Edge<String>>();
        Edge<String> edge2 = new Edge<String>("+tZk,YzO>lw*~}p[Xw", "pZE&^h \">gm");
        linkedHashSet1.add(edge2);
        Edge.competesWith((Set<Edge<String>>) linkedHashSet1);
        //edge0.toString();
        LinkedHashSet<Edge<Object>> linkedHashSet2 = new LinkedHashSet<Edge<Object>>();
        linkedHashSet2.add(edge0);
        // Undeclared exception!
        try {
            Edge.competesWith((Set<Edge<Object>>) linkedHashSet2);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        LinkedHashSet<Edge<Edge<Object>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<Object>>>();
        Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) linkedHashSet0);
        Edge<Object> edge0 = edge_EdgeBuilder0.to((Object) null);
        Edge<Edge<Object>> edge1 = new Edge<Edge<Object>>(edge0, edge0);
        linkedHashSet0.add(edge1);
        Edge.isIn((Set<Edge<Edge<Object>>>) linkedHashSet0);
        Predicate<Edge<String>> predicate0 = Edge.isAutoCycle();
        assertNotNull(predicate0);
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        Edge.hasDestination(null);
        Edge.hasDestination(null);
        Integer integer0 = new Integer((-1));
        Integer integer1 = new Integer((-1));
        Edge<Integer> edge0 = new Edge<Integer>(integer0, integer1);
        //String string0 = edge0.toString();
        //assertEquals("Edge{source=-1, destination=-1}", string0);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        Edge.isIn((Set<Edge<Integer>>) null);
        LinkedHashSet<Edge<Edge<String>>> linkedHashSet0 = new LinkedHashSet<Edge<Edge<String>>>();
        Predicate<Edge<Edge<String>>> predicate0 = Edge.competesWith((Set<Edge<Edge<String>>>) linkedHashSet0);
        assertNotNull(predicate0);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("source");
        Edge<String> edge0 = edge_EdgeBuilder0.to("net.mooctest.Edge$4");
        assertNotNull(edge0);
    }
//////////////////////////////////////////
    ////////////////////////////////
    ////////////
    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        Edge<String> edge0 = new Edge<String>("tDJg", "3R9@G");
        Integer integer0 = new Integer(0);
        Edge.EdgeBuilder<Integer> edge_EdgeBuilder0 = Edge.from(integer0);
        Integer integer1 = new Integer(0);
        Edge<Integer> edge1 = edge_EdgeBuilder0.to(integer1);
        edge0.equals(edge1);
        edge0.hashCode();
        Object object0 = new Object();
        Edge<Object> edge2 = new Edge<Object>(object0, "3R9@G");
        //String string0 = edge2.toString();
        //assertNotNull(string0);
    }
///////////////////////////////////////
    ///////////////////////////
    ///////////////////
    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        Integer integer0 = new Integer(0);
        Edge<Object> edge0 = new Edge<Object>("", integer0);
        //String string0 = edge0.toString();
        //assertEquals("Edge{source=, destination=0}", string0);
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        Edge<Object> edge0 = new Edge<Object>("", (Object) null);
        edge0.hashCode();
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
        Edge<String> edge0 = new Edge<String>("9} To", "9} To");
        linkedHashSet0.add(edge0);
        Predicate<Edge<String>> predicate0 = Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
        Predicate<Edge<Object>> predicate1 = Edge.hasDestination((Object) predicate0);
        assertNotNull(predicate1);
    }

    @Test(timeout = 4000)
    public void test16()  throws Throwable  {
        LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
        Predicate<Edge<Object>> predicate0 = Edge.competesWith((Set<Edge<Object>>) linkedHashSet0);
        assertNotNull(predicate0);
    }

    @Test(timeout = 4000)
    public void test17()  throws Throwable  {
        Edge.isAutoCycle();
        Integer integer0 = new Integer(0);
        Edge.from(integer0);
        Edge<String> edge0 = new Edge<String>(";}N", (String) null);
        Edge.EdgeBuilder<Edge<String>> edge_EdgeBuilder0 = Edge.from(edge0);
        Edge<String> edge1 = edge_EdgeBuilder0.source;
        Edge<Object> edge2 = new Edge<Object>(edge1, integer0);
        Edge edge3 = (Edge)edge2.source;
        boolean boolean0 = edge0.equals(edge3);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test18()  throws Throwable  {
        Object object0 = new Object();
        Predicate<Edge<Object>> predicate0 = Edge.hasDestination(object0);
        Predicate<Edge<Object>> predicate1 = Edge.isAutoCycle();
        Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) predicate0);
        Edge<Object> edge0 = edge_EdgeBuilder0.to(predicate1);
        Integer integer0 = new Integer(1941);
        boolean boolean0 = edge0.equals(integer0);
        assertFalse(boolean0);

        Edge<Object> edge1 = edge_EdgeBuilder0.to(object0);
        assertFalse(edge1.equals((Object)edge0));
    }
////////////////////////////////////
    ///////////////////////////
    ////////////////////
    @Test(timeout = 4000)
    public void test19()  throws Throwable  {
        Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) "\"7 b[dqXi8/@Pk");
        Edge<Object> edge0 = edge_EdgeBuilder0.to("\"7 b[dqXi8/@Pk");
        ///String string0 = edge0.toString();
        //assertEquals("Edge{source=\"7 b[dqXi8/@Pk, destination=\"7 b[dqXi8/@Pk}", string0);
    }

    @Test(timeout = 4000)
    public void test20()  throws Throwable  {
        LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
        Predicate<Edge<Object>> predicate0 = Edge.isIn((Set<Edge<Object>>) linkedHashSet0);
        assertNotNull(predicate0);
    }

    @Test(timeout = 4000)
    public void test21()  throws Throwable  {
        Edge<String> edge0 = new Edge<String>("g%13aPM;wOe", "g%13aPM;wOe");
        edge0.hashCode();
    }

    @Test(timeout = 4000)
    public void test22()  throws Throwable  {
        Edge.EdgeBuilder<Object> edge_EdgeBuilder0 = Edge.from((Object) "gp");
        Edge<Object> edge0 = edge_EdgeBuilder0.to("gp");
        assertNotNull(edge0);
    }

    @Test(timeout = 4000)
    public void test23()  throws Throwable  {
        Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("");
        assertNotNull(edge_EdgeBuilder0);
    }

    @Test(timeout = 4000)
    public void test24()  throws Throwable  {
        LinkedHashSet<Edge<String>> linkedHashSet0 = new LinkedHashSet<Edge<String>>();
        Edge<String> edge0 = new Edge<String>("", "");
        linkedHashSet0.add(edge0);
        Edge<String> edge1 = new Edge<String>("", "");
        linkedHashSet0.add(edge1);
        // Undeclared exception!
        try {
            Edge.competesWith((Set<Edge<String>>) linkedHashSet0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch(IllegalArgumentException e) {
            //
            // duplicate key:
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }
/////////////////////////////////
/////////////////////////////////
/////////////////////////////////
/////////////////////////////////
    @Test(timeout = 4000)
    public void test25()  throws Throwable  {
        Edge<String> edge0 = new Edge<String>("]s", "]s");
        //String string0 = edge0.toString();
        //assertEquals("Edge{source=]s, destination=]s}", string0);

        Edge<Object> edge1 = new Edge<Object>("]s", "]s");
        Edge.isAutoCycle();
        boolean boolean0 = edge1.equals((Object) null);
        boolean boolean1 = edge0.equals("Edge{source=]s, destination=]s}");
        assertTrue(boolean1 == boolean0);
        assertFalse(boolean1);
    }

    @Test(timeout = 4000)
    public void test26()  throws Throwable  {
        Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from(".b8dV4!lU");
        Edge.EdgeBuilder<Object> edge_EdgeBuilder1 = Edge.from((Object) ".b8dV4!lU");
        Edge<Object> edge0 = edge_EdgeBuilder1.to(edge_EdgeBuilder0);
        Integer integer0 = new Integer(0);
        Edge<Integer> edge1 = new Edge<Integer>(integer0, integer0);
        edge1.equals(edge0);
        Edge.hasDestination(".b8dV4!lU");
        LinkedHashSet<Edge<Integer>> linkedHashSet0 = new LinkedHashSet<Edge<Integer>>();
        Predicate<Edge<Integer>> predicate0 = Edge.isIn((Set<Edge<Integer>>) linkedHashSet0);
        assertNotNull(predicate0);
    }

    @Test(timeout = 4000)
    public void test27()  throws Throwable  {
        Integer integer0 = new Integer((-485));
        Edge.EdgeBuilder<String> edge_EdgeBuilder0 = Edge.from("d&");
        String string0 = edge_EdgeBuilder0.source;
        assertNotNull(string0);

        Edge<Object> edge0 = new Edge<Object>("d&", integer0);
        Edge<String> edge1 = new Edge<String>("d&", "d&");
        boolean boolean0 = edge0.equals(edge1);
        assertFalse(boolean0);
    }
}
