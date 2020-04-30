/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 06:24:36 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Weighted_ESTest {

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        Weighted<String> weighted0 = Weighted.weighted("", 982.6268174193887);
        int int0 = weighted0.compareTo(weighted0);
        assertEquals(982.6268174193887, weighted0.weight, 0.01);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        Weighted<String> weighted0 = Weighted.weighted("hTQ_[|7Uq&o*p", (-941.3));
        Weighted<String> weighted1 = new Weighted<String>("", (-941.3));
        int int0 = weighted0.compareTo(weighted1);
        assertEquals((-941.3), weighted0.weight, 0.01);
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        // Undeclared exception!
        try {
            Weighted.weighted((Integer) null, 0.0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        Weighted<String> weighted0 = null;
        try {
            weighted0 = new Weighted<String>((String) null, 0.0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        Weighted<Object> weighted0 = Weighted.weighted((Object) "", (-1464.09287));
        weighted0.hashCode();
        assertEquals((-1464.09287), weighted0.weight, 0.01);
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        Integer integer0 = new Integer((-1235));
        Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, (-1235));
        Weighted<Integer> weighted1 = new Weighted<Integer>(integer0, (-3988.332983389265));
        boolean boolean0 = weighted0.equals(weighted1);
        assertFalse(boolean0);
        assertEquals((-3988.332983389265), weighted1.weight, 0.01);
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        Weighted<Object> weighted0 = new Weighted<Object>("]sm%XI1*GRuM", 0.0);
        Weighted<Object> weighted1 = Weighted.weighted((Object) weighted0, 0.0);
        boolean boolean0 = weighted0.equals(weighted1);
        assertEquals(0.0, weighted1.weight, 0.01);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        Weighted<String> weighted0 = new Weighted<String>("", (-1235.0));
        boolean boolean0 = weighted0.equals("");
        assertFalse(boolean0);
        assertEquals((-1235.0), weighted0.weight, 0.01);
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        Weighted<Object> weighted0 = new Weighted<Object>("]sm%XI1*GRuM", 0.0);
        Weighted<String> weighted1 = new Weighted<String>("]sm%XI1*GRuM", 0.0);
        boolean boolean0 = weighted1.equals(weighted0);
        assertTrue(boolean0);
        assertEquals(0.0, weighted1.weight, 0.01);
    }

    ////////////////////////
    ///////////////////
    ///
    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        Weighted<Object> weighted0 = new Weighted<Object>("]sm%XI1*GRuM", 0.0);
        //String string0 = weighted0.toString();
        //assertEquals("Weighted{val=]sm%XI1*GRuM, weight=0.0}", string0);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        Weighted<Object> weighted0 = new Weighted<Object>("]sm%XI1*GRuM", 0.0);
        Weighted<Object> weighted1 = Weighted.weighted((Object) weighted0, 0.0);
        int int0 = weighted1.compareTo(weighted0);
        assertEquals(0.0, weighted1.weight, 0.01);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        Integer integer0 = new Integer(0);
        Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, 0);
        Weighted<Object> weighted1 = new Weighted<Object>(weighted0, 0.0);
        Weighted<Weighted<Object>> weighted2 = Weighted.weighted(weighted1, 1828.10393);
        // Undeclared exception!
        try {
            weighted2.compareTo((Weighted<Weighted<Object>>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.Weighted", e);
        }
    }
}
