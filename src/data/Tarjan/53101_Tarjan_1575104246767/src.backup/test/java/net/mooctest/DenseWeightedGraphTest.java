package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class DenseWeightedGraphTest {
	
	@Test
	public void test01() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("net.mooctest.DenseWeightedGraph");
		Constructor con = c.getDeclaredConstructor(ArrayList.class,Map.class,double[][].class);
		con.setAccessible(true);
		Object obj = con.newInstance(null,null,null);
	}
	
	@Test
	public void test02() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		double [][]array = {{1.5,2.5},{3.5,4.5},{5.5,6.5}};
		DenseWeightedGraph<Integer> d = DenseWeightedGraph.from(array);
		
		assertEquals("[0, 1, 2]", d.getNodes().toString());
		assertEquals(4.5, d.getWeightOf(1, 1),0.1);
	}
	
	@Test
	public void test03(){
		double [][]array = {{1.5,2.5},{3.5,4.5},{5.5,6.5}};
		DenseWeightedGraph<Integer> d = DenseWeightedGraph.from(array);
		Collection a  = d.getIncomingEdges(1);
		a.add(5);
		assertEquals(4, a.size());	
	}


}
