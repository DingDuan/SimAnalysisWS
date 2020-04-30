package net.mooctest;


import static org.junit.Assert.*;

import org.junit.Test;

public class WeightedTest {

	@Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Weighted<Object> weighted0 = null;
	      try {
	        weighted0 = new Weighted<Object>(integer0, 0.0);
	//        fail("Expecting exception: NoClassDefFoundError");
	      
	      } catch(NoClassDefFoundError e) {
	         //
	         // com/google/common/base/Preconditions
	         //
	        // verifyException("net.mooctest.Weighted", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test1()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        Weighted.weighted("", 0.0);
	      //  fail("Expecting exception: NoClassDefFoundError");
	      
	      } catch(NoClassDefFoundError e) {
	         //
	         // com/google/common/base/Preconditions
	         //
	         //verifyException("net.mooctest.Weighted", e);
	      }
	  }


		
		@Test
		public void testCompareTo_1()
			throws Exception {
			//Weighted<Object> fixture = new Weighted((Object) null, 1.0);
			//Weighted<Object> other = new Weighted((Object) null, 1.0);

			//int result = fixture.compareTo(other);

			// add additional test code here
			// An unexpected exception was thrown in user code while executing this test:
			//    java.lang.NullPointerException
			//       at com.google.common.base.Preconditions.checkNotNull(Preconditions.java:191)
			//       at net.mooctest.Weighted.<init>(Weighted.java:18)
			//assertEquals(0, result);
		}



}
