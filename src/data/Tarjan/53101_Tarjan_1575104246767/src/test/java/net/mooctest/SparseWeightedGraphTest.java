package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class SparseWeightedGraphTest {

	
	@Test
	public void test01() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("net.mooctest.SparseWeightedGraph");
		Constructor con = c.getDeclaredConstructor(Set.class,Map.class);
		con.setAccessible(true);
		Object obj = con.newInstance(null,null);
	}
	
//	@Test
//	public void test02() {
//		
//	}

}
