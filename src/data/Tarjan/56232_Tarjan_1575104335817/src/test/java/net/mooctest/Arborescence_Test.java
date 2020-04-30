package net.mooctest;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import static org.junit.Assert.*;

import java.util.HashSet;
//import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Arborescence_Test {
	 @Test(timeout = 4000) //equals
	  public void test0()  throws Throwable {
		
		 ImmutableMap<Integer,Integer> immutableMap = new ImmutableMap.Builder<Integer,Integer>()
		    .put(0,1)
		    .put(1,2)
		    .build();
		 Arborescence a = Arborescence.of(immutableMap);
		 Arborescence.empty();
		 
		 Integer source = 0;
		 Integer to = 5;
		 Integer v0 =1;
		 Integer v1 =2;
		 String str = "1";
		 Edge<Integer> e0 = new Edge<Integer>(v0,v1);
		 Edge<Integer> e1 = new Edge<Integer>(v1,v0);
		 Edge<Integer> e2 = new Edge<Integer>(v0,v1);
		 e0.from(source).to(to);
		 assertFalse(a.contains(e0));
		 a.toString();
		 assertFalse(a.equals(e2));
		 assertTrue(a.equals(a));
		 assertFalse(a.equals(null));
		 assertFalse(a.equals(new String("1")));
		 
		 a.hashCode();
		 
		
	 }
	 @Test(timeout = 4000) //equals
	  public void test1()  throws Throwable {
		
		 ImmutableMap<Integer,Integer> immutableMap = new ImmutableMap.Builder<Integer,Integer>()
		    .put(0,1)
		    .put(1,2)
		    .build();
		 Arborescence a = Arborescence.of(immutableMap);
		 Arborescence b = Arborescence.of(immutableMap);
		 Arborescence.empty();
		 
		 Integer source = 0;
		 Integer to = 5;
		 Integer v0 =1;
		 Integer v1 =2;
		 String str = "1";
		 Edge<Integer> e0 = new Edge<Integer>(v0,v1);
		 Edge<Integer> e1 = new Edge<Integer>(v1,v0);
		 Edge<Integer> e2 = new Edge<Integer>(v0,v1);
		 e0.from(source).to(to);
		 assertFalse(a.contains(e0));
		 a.toString();		 
		 assertTrue(a.equals(b));		 
		 a.hashCode();
		 
		
	 }
}
