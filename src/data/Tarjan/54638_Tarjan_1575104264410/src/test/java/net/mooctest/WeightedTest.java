package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeightedTest {

	
	      @Test(timeout = 4000)
		  public void test2()  throws Throwable  {
	    	  Weighted<Integer>weighted0=new Weighted<Integer>(1,3.0);
	    	  Weighted<Integer>weighted1=new Weighted<Integer>(2,3.0);
	    	  Weighted<Integer>weighted2=new Weighted<Integer>(1,2.0);
	    	  weighted0.compareTo(weighted0);
	    	  assertTrue(weighted0.equals(weighted0));
	    	  assertFalse(weighted0.equals(1));
	    	  assertFalse(weighted0.equals(weighted1));
	    	  assertFalse(weighted0.equals(weighted2));
	    	  weighted0.hashCode();
	    	  weighted0.toString();
	  }

}
