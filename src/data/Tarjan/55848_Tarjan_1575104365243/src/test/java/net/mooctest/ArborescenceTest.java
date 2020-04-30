package net.mooctest;

import org.junit.Test;

public class ArborescenceTest {
	  @Test(timeout = 4000)
	  public void test0()  throws Throwable  {
		  Arborescence<Object> empty = Arborescence.empty();
		  empty.contains(new Edge("a","b"));
		  empty.equals(empty);
		  empty.equals(null);
		  empty.equals(new Long(5));
		  empty.hashCode();
	  }
}
