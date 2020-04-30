package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class PartitionTestt {

	@Test
	public void testPartition() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		Class c = Partition.class;
		Constructor con = c.getDeclaredConstructor(Map.class, Map.class);
		con.setAccessible(true);
		Map<Integer, Integer> parents = new HashMap<Integer, Integer>();
		Map<Integer, Integer> ranks = new HashMap<Integer, Integer>();
		Partition<Integer> partition = (Partition<Integer>) con.newInstance(parents, ranks);
		Field f = c.getDeclaredField("parents");
		f.setAccessible(true);
		assertSame(parents, f.get(partition));
		f = c.getDeclaredField("ranks");
		f.setAccessible(true);
		assertSame(ranks, f.get(partition));
	}
	
	@Test
	public void testSingletons() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		Partition<Integer> partition = Partition.singletons(list);
		Map<Integer, Integer> parents = new HashMap<Integer, Integer>();
		Map<Integer, Integer> ranks = new HashMap<Integer, Integer>();
		for(Integer li : list){
			parents.put(li, li);
			ranks.put(li, 0);
		}
		Class c = Partition.class;
		Field f = c.getDeclaredField("parents");
		f.setAccessible(true);
		assertEquals(parents, (Map<Integer, Integer>)f.get(partition));
		f = c.getDeclaredField("ranks");
		f.setAccessible(true);
		assertEquals(ranks, (Map<Integer, Integer>)f.get(partition));
	}

	@Test
	public void testComponentOf1() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		Partition<Integer> partition = Partition.singletons(list);
		Integer actual = partition.componentOf(2);
		Integer expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void testMerge1() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		Partition<Integer> partition = Partition.singletons(list);
		Integer actual = partition.merge(2, 2);
		Integer expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMerge2() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		Partition<Integer> partition = Partition.singletons(list);
		Integer actual = partition.merge(2, 3);
		Integer expected = 2;
		assertEquals(expected, actual);
		Map<Integer, Integer> parents = new HashMap<Integer, Integer>();
		parents.put(5, 5);
		parents.put(4, 4);
		parents.put(3, 3);
		parents.put(2, 2);
		parents.put(3, 2);
		Class c = Partition.class;
		Field f = c.getDeclaredField("parents");
		f.setAccessible(true);
		assertEquals(parents, (Map<Integer, Integer>)f.get(partition));
	}
	
	@Test
	public void testMerge3() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		Partition<Integer> partition = Partition.singletons(list);
		Integer actual = partition.merge(3, 2);
		Integer expected = 3;
		assertEquals(expected, actual);
		Map<Integer, Integer> parents = new HashMap<Integer, Integer>();
		parents.put(5, 5);
		parents.put(4, 4);
		parents.put(3, 3);
		parents.put(2, 2);
		parents.put(2, 3);
		Class c = Partition.class;
		Field f = c.getDeclaredField("parents");
		f.setAccessible(true);
		assertEquals(parents, (Map<Integer, Integer>)f.get(partition));
	}

	@Test
	public void testSameComponent1() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		Partition<Integer> partition = Partition.singletons(list);
		boolean condition = partition.sameComponent(2, 2);
		assertTrue(condition);
	}
	
	@Test
	public void testSameComponent() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		Partition<Integer> partition = Partition.singletons(list);
		boolean condition = partition.sameComponent(2, 3);
		assertFalse(condition);
	}

	@Test
	public void testGetNodes() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		Partition<Integer> partition = Partition.singletons(list);
		Map<Integer, Integer> parents = new HashMap<Integer, Integer>();
		parents.put(5, 5);
		parents.put(4, 4);
		parents.put(3, 3);
		parents.put(2, 2);
		parents.put(2, 3);
		Set<Integer> actual = partition.getNodes();
		Set<Integer> expected = parents.keySet();
		assertEquals(expected, actual);
	}

}
