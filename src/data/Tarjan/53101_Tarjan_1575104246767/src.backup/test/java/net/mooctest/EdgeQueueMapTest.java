package net.mooctest;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import net.mooctest.EdgeQueueMap.EdgeQueue;

import org.junit.Test;

public class EdgeQueueMapTest {

	@Test()
	public void test01() {
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add(2);
		Partition p1 = Partition.singletons(c1);
		ArrayList l1 = new ArrayList();
		l1.add(1);
		l1.add(2);
		EdgeQueue e1 = EdgeQueue.create(1,p1);
		FibonacciQueue edges = FibonacciQueue.create(Collections.reverseOrder());
		ExclusiveEdge ex1 = ExclusiveEdge.of(new Edge(1, 1),l1,1);
		e1.addEdge(ex1);
	}

}
