package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import net.mooctest.KBestArborescences.SubsetOfSolutions;

import org.junit.Test;

public class KBestArborescencesTest {
	@Test(expected = NullPointerException.class)
	public void test01(){
		KBestArborescences.seek(null,null,null);
		SubsetOfSolutions s = new SubsetOfSolutions (null,null,null,null);
		KBestArborescences k = new KBestArborescences();
		KBestArborescences.getKBestArborescences(null,null,1);
	}
	@Test(expected = NullPointerException.class)
	public void test02(){
		SubsetOfSolutions s = new SubsetOfSolutions (null,null,null,null);
		KBestArborescences k = new KBestArborescences();
		KBestArborescences.scoreSubsetOfSolutions(null,null,null,null);
	}
	@Test(expected = InvocationTargetException.class)
	public void test03() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Class c = KBestArborescences.class;
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		Method m = c.getDeclaredMethod("getNextBestArborescence", WeightedGraph.class,Arborescence.class);
		m.setAccessible(true);
		m.invoke(obj,null, null);
		
	}
	@Test(expected = InvocationTargetException.class)
	public void test04() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Class c = KBestArborescences.class;
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		Method m = c.getDeclaredMethod("isAncestor", Object.class,Object.class,Arborescence.class);
		m.setAccessible(true);
		assertEquals(true,m.invoke(obj,1,null, null));	
	}
	@Test(expected = InvocationTargetException.class)
	public void test05() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class c = KBestArborescences.class;
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		Method m = c.getDeclaredMethod("getNextBestArborescence", WeightedGraph.class,Arborescence.class);
		m.setAccessible(true);
		assertEquals(null,m.invoke(obj,null, null));	
	}
}
