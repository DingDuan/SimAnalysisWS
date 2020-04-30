package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;

import org.junit.Test;

public class PartitionTest {


	@Test
	public void testGetNodes_1()
		throws Exception {
		Partition fixture = Partition.singletons(new ArrayList<Object>());

		Set<Object> result = fixture.getNodes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}


}
