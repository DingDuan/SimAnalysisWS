package net.mooctest;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ArborescenceTest {

	@Test(timeout=4000)
	public void test01() {
		Edge<Object> edge0=new Edge<Object>(2,3);
		Arborescence.empty();
		Arborescence.empty().contains(edge0);
		Arborescence.empty().toString();
		Arborescence.empty().equals(Arborescence.empty());
		assertFalse(Arborescence.empty().equals(2));
		Arborescence.empty().hashCode();
	}

}
