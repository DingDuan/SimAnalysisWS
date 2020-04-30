/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 06:16:12 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Partition_ESTest  {
 @Test(timeout = 4000)
  public void test01111110()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.push("d@9=s,");
      linkedList0.add("");
      linkedList0.offerFirst("v|]?LJWg");
      linkedList0.add("Z");
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      String string0 = partition0.merge("", "Z");
      assertEquals("", string0);
      
      String string1 = partition0.merge("d@9=s,", "v|]?LJWg");
      String string2 = partition0.merge("Z", "d@9=s,");
      assertEquals("", string2);
      assertFalse(string2.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test01111111()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.push("negative size: ");
      linkedList0.offerFirst("net.mooctest.Partition");
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      String string0 = partition0.merge("net.mooctest.Partition", "negative size: ");
      assertEquals("net.mooctest.Partition", string0);
      
      String string1 = partition0.merge("negative size: ", "net.mooctest.Partition");
      assertEquals("net.mooctest.Partition", string1);
  }

  @Test(timeout = 4000)
  public void test01111112()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.push("negative size: ");
      linkedList0.offerFirst("ecBHM+fd{jst8,f) KM");
      linkedList0.add("");
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      String string0 = partition0.merge("negative size: ", "");
      assertEquals("negative size: ", string0);
      
      String string1 = partition0.merge("ecBHM+fd{jst8,f) KM", "");
      assertEquals("negative size: ", string1);
  }

  @Test(timeout = 4000)
  public void test01111113()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List<Object> list0 = linkedList0.subList(0, 0);
      linkedList0.add((Object) list0);
      // Undeclared exception!
      try { 
        Partition.singletons((Collection<Object>) list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01111114()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) linkedList0);
      // Undeclared exception!
      try { 
        Partition.singletons((Collection<Object>) linkedList0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11111105()  throws Throwable  {
      // Undeclared exception!
      try { 
        Partition.singletons((Collection<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Partition", e);
      }
  }

  @Test(timeout = 4000)
  public void test11111106()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      // Undeclared exception!
      try { 
        partition0.sameComponent("g-lvLN ", "g2k]l");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11111107()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-4527));
      Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) linkedList0);
      // Undeclared exception!
      try { 
        partition0.merge(integer0, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11111108()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = linkedList0.subList(0, 0);
      linkedList0.add("appendable");
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList1);
      // Undeclared exception!
      try { 
        partition0.componentOf(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11111109()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      linkedList0.add((Object) linkedList1);
      Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
      linkedList1.add((Object) linkedList0);
      // Undeclared exception!
      try { 
        partition0.componentOf(linkedList0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11111110()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
      // Undeclared exception!
      try { 
        partition0.componentOf("negative size: ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11111111()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.push("zW TI");
      linkedList0.offerFirst("");
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      String string0 = partition0.merge("", "zW TI");
      assertEquals("", string0);
      
      String string1 = partition0.componentOf("zW TI");
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test11111112()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-4527));
      linkedList0.add(integer0);
      Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) linkedList0);
      Integer integer1 = partition0.componentOf(integer0);
      assertEquals((-4527), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11111113()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.push("negative size: ");
      linkedList0.offerFirst("net.mooctest.Partition");
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      boolean boolean0 = partition0.sameComponent("net.mooctest.Partition", "negative size: ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void tes111111t14()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.push("negative size: ");
      linkedList0.offerFirst("net.mooctest.Partition");
      linkedList0.add("");
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      String string0 = partition0.merge("net.mooctest.Partition", "negative size: ");
      assertEquals("net.mooctest.Partition", string0);
      
      String string1 = partition0.merge("negative size: ", "");
      assertEquals("net.mooctest.Partition", string1);
  }

  @Test(timeout = 4000)
  public void test11111115()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.push("negative size: ");
      linkedList0.offerFirst("net.mooctest.Partition");
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      String string0 = partition0.merge("net.mooctest.Partition", "negative size: ");
      assertEquals("net.mooctest.Partition", string0);
      
      boolean boolean0 = partition0.sameComponent("negative size: ", "negative size: ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void tes111111t16()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
      Set<String> set0 = partition0.getNodes();
      assertTrue(set0.isEmpty());
  }
    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.push("d@9=s,");
        linkedList0.add("");
        linkedList0.offerFirst("v|]?LJWg");
        linkedList0.add("Z");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        String string0 = partition0.merge("", "Z");
        assertEquals("", string0);

        String string1 = partition0.merge("d@9=s,", "v|]?LJWg");
        String string2 = partition0.merge("Z", "d@9=s,");
        assertEquals("", string2);
        assertFalse(string2.equals((Object)string1));
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.push("negative size: ");
        linkedList0.offerFirst("ecBHM+fd{jst8,f) KM");
        linkedList0.add("");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        String string0 = partition0.merge("negative size: ", "");
        assertEquals("negative size: ", string0);

        String string1 = partition0.merge("ecBHM+fd{jst8,f) KM", "");
        assertEquals("negative size: ", string1);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.push("d@9=s,");
        linkedList0.add("");
        linkedList0.add("Z");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        String string0 = partition0.merge("", "Z");
        assertEquals("", string0);

        String string1 = partition0.merge("Z", "d@9=s,");
        assertEquals("", string1);
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.push("zW TI");
        linkedList0.offerFirst("");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        String string0 = partition0.merge("", "zW TI");
        assertEquals("", string0);

        String string1 = partition0.merge("", "zW TI");
        assertEquals("", string1);
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.push("zW TI");
        linkedList0.offerFirst("");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        String string0 = partition0.merge("", "zW TI");
        assertEquals("", string0);

        String string1 = partition0.merge("zW TI", "");
        assertEquals("", string1);
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        List<Object> list0 = linkedList0.subList(0, 0);
        linkedList0.add((Object) list0);
        // Undeclared exception!
        try {
            Partition.singletons((Collection<Object>) list0);
            fail("Expecting exception: ConcurrentModificationException");

        } catch(ConcurrentModificationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.SubList", e);
        }
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        linkedList0.add((Object) linkedList0);
        // Undeclared exception!
        try {
            Partition.singletons((Collection<Object>) linkedList0);
            fail("Expecting exception: StackOverflowError");

        } catch(StackOverflowError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        // Undeclared exception!
        try {
            Partition.singletons((Collection<Integer>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.Partition", e);
        }
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        // Undeclared exception!
        try {
            partition0.sameComponent(";4*+Ob[a", "already specified skipNulls");
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        Integer integer0 = new Integer((-4527));
        Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) linkedList0);
        // Undeclared exception!
        try {
            partition0.merge(integer0, integer0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        List<String> list0 = linkedList0.subList(0, 0);
        linkedList0.add("appendable");
        LinkedList<Object> linkedList1 = new LinkedList<Object>();
        Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList1);
        // Undeclared exception!
        try {
            partition0.componentOf(list0);
            fail("Expecting exception: ConcurrentModificationException");

        } catch(ConcurrentModificationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.SubList", e);
        }
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        LinkedList<Object> linkedList1 = new LinkedList<Object>();
        linkedList0.add((Object) linkedList1);
        Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
        linkedList1.add((Object) linkedList0);
        // Undeclared exception!
        try {
            partition0.componentOf(linkedList0);
            fail("Expecting exception: StackOverflowError");

        } catch(StackOverflowError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        // Undeclared exception!
        try {
            partition0.componentOf("");
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.push("zW TI");
        linkedList0.offerFirst("");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        String string0 = partition0.merge("", "zW TI");
        assertEquals("", string0);

        String string1 = partition0.componentOf("zW TI");
        assertEquals("", string1);
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        Integer integer0 = new Integer((-4527));
        linkedList0.add(integer0);
        Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) linkedList0);
        Integer integer1 = partition0.componentOf(integer0);
        assertEquals((-4527), (int)integer1);
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.push("`R& !v");
        linkedList0.offerFirst("net.mooctest.Partition");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        boolean boolean0 = partition0.sameComponent("net.mooctest.Partition", "`R& !v");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test16()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.push("`R& !v");
        linkedList0.offerFirst("net.mooctest.Partition");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        String string0 = partition0.merge("net.mooctest.Partition", "`R& !v");
        assertEquals("net.mooctest.Partition", string0);

        boolean boolean0 = partition0.sameComponent("`R& !v", "`R& !v");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test17()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        Set<String> set0 = partition0.getNodes();
        assertEquals(0, set0.size());
    }
}
