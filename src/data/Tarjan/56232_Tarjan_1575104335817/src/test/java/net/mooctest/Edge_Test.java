package net.mooctest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
//import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import net.mooctest.Partition;
//import org.evosuite.runtime.EvoRunner;
//import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import java.util.HashSet;
//import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
public class Edge_Test {
	 @Test(timeout = 4000) //equals
	  public void test0()  throws Throwable {
		 Integer source = 0;
		 Integer to = 5;
		 Integer v0 =1;
		 Integer v1 =2;
		 String str = "1";
		 Edge<Integer> e0 = new Edge<Integer>(v0,v1);
		 Edge<Integer> e1 = new Edge<Integer>(v1,v0);
		 Edge<Integer> e2 = new Edge<Integer>(v0,v1);
		 Edge.from(source).to(to);
		 e0.toString();
		 assertTrue(e0.hashCode()==e0.hashCode());
		 assertFalse(e0.equals(e1));
		 assertFalse(e0.equals(null));
		 assertFalse(e0.equals(str));
		 assertTrue(e0.equals(e0));
		 assertTrue(e0.equals(e2));
	}
	 @Test(timeout = 4000) //equals
	  public void test1()  throws Throwable {
		 Set<Edge<Integer>> set = new HashSet<Edge<Integer>>();
		 Integer source = 0;
		 Integer to = 5;
		 Integer v0 =1;
		 Integer v1 =2;
		 String str = "1";
		 Edge<Integer> e0 = new Edge<Integer>(v0,v1);
		 Edge<Integer> e1 = new Edge<Integer>(v1,v0);
		 Edge<Integer> e2 = new Edge<Integer>(v0,v1);
		 Edge.from(source).to(to);
		 e0.from(source).to(to);
		 e0.toString();
		 assertTrue(e0.hashCode()==e0.hashCode());
		 assertFalse(e0.equals(e1));
		 assertFalse(e0.equals(null));
		 assertFalse(e0.equals(str));
		 assertTrue(e0.equals(e0));
		 assertTrue(e0.equals(e2));
		 
		 set.add(e0);
		 set.add(e1);
		 set.add(e2);
		 Edge.competesWith(set).apply(e2);
		 e0.isAutoCycle();
		 e0.isIn(set);
		 Edge<Object> e3 = new Edge<Object>(v0,v1);
		 e0.isAutoCycle().apply(e3);
		 e0.isIn(set).apply(e2);
	 }
	 @Test(timeout = 4000) //equals
	  public void test2()  throws Throwable {
		 Set<Edge<Integer>> set = new HashSet<Edge<Integer>>();
		 Integer source = 0;
		 Integer to = 5;
		 Integer v0 =1;
		 Integer v1 =2;
		 String str = "1";
		 Edge<Integer> e0 = new Edge<Integer>(v0,v1);
		 Edge<Integer> e1 = new Edge<Integer>(v1,v0);
		 Edge<Integer> e2 = new Edge<Integer>(v0,v1);
		 Edge.from(source).to(to);
		 e0.toString();
		 assertTrue(e0.hashCode()==e0.hashCode());
		 assertFalse(e0.equals(e1));
		 assertFalse(e0.equals(null));
		 assertFalse(e0.equals(str));
		 assertTrue(e0.equals(e0));
		 assertTrue(e0.equals(e2));
		 
		 set.add(e0);
		 set.add(e1);
		 set.add(e2);
		 Edge.competesWith(set).apply(e2);
		 e0.isAutoCycle();
		 e0.isIn(set);
		 Edge<Object> e3 = new Edge<Object>(v0,v1);
		 e0.isAutoCycle().apply(e3);
		 e0.isIn(set).apply(e2);
		 e0.hasDestination(v1);
		 e0.hasDestination(v1).apply(e0);
	 }
}
