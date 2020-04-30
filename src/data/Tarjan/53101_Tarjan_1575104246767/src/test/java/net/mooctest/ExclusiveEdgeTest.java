package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.junit.Test;

public class ExclusiveEdgeTest {
	@Test
	public void test01() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		ExclusiveEdge e = ExclusiveEdge.of(new Edge(1, 1),null,1);
		ExclusiveEdge e1 = ExclusiveEdge.of(new Edge(0, 0),null,0);
		ExclusiveEdge.of(new Edge(1, 1), 1);
		assertEquals(0,e.compareTo(e));
		assertEquals(1,e.compareTo(e1));
		assertEquals(-1,e1.compareTo(e));
	}
}
