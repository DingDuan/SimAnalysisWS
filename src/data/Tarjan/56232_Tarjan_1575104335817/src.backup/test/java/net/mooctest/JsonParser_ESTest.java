/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 30 05:19:37 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
//import static org.evosuite.shaded.org.mockito.Mockito.*;
//import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import net.mooctest.JsonHandler;
import net.mooctest.JsonParser;
import net.mooctest.Location;
//import org.evosuite.runtime.EvoRunner;
//import org.evosuite.runtime.EvoRunnerParameters;
//import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonParser_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
//      JsonHandler<Integer, Integer> jsonHandler0 = (JsonHandler<Integer, Integer>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
//      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
//      assertNotNull(jsonParser0);
//      
//      StringReader stringReader0 = new StringReader("");
//      assertNotNull(stringReader0);
//      
//      // Undeclared exception!
//      try { 
//        jsonParser0.parse((Reader) stringReader0, (-1846));
//        fail("Expecting exception: IllegalArgumentException");
//      
//      } catch(IllegalArgumentException e) {
//         //
//         // buffersize is zero or negative
//         //
//         //verifyException("net.mooctest.JsonParser", e);
//      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonHandler<Integer, Object> jsonHandler0 = (JsonHandler<Integer, Object>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      StringReader stringReader0 = new StringReader("false");
      assertNotNull(stringReader0);
      
      jsonParser0.parse((Reader) stringReader0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonHandler<Integer, Object> jsonHandler0 = (JsonHandler<Integer, Object>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      Location location0 = jsonParser0.getLocation();
      assertNotNull(location0);
      assertEquals(0, location0.column);
      assertEquals(0, location0.line);
      assertEquals((-1), location0.offset);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonHandler<Object, String> jsonHandler0 = (JsonHandler<Object, String>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      stringReader0.close();
      try { 
        jsonParser0.parse((Reader) stringReader0, 48);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonHandler<Integer, String> jsonHandler0 = (JsonHandler<Integer, String>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      // Undeclared exception!
      try { 
        jsonParser0.parse((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // reader is null
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonHandler<String, Integer> jsonHandler0 = (JsonHandler<String, Integer>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      StringReader stringReader0 = new StringReader("Not a boolean: ");
      assertNotNull(stringReader0);
      
      stringReader0.close();
      try { 
        jsonParser0.parse((Reader) stringReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonHandler<Object, String> jsonHandler0 = (JsonHandler<Object, String>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(jsonHandler0).startArray();
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      // Undeclared exception!
      try { 
        jsonParser0.parse("[:g2");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected value at 1:2
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonHandler<Object, Object> jsonHandler0 = (JsonHandler<Object, Object>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      StringReader stringReader0 = new StringReader(" 5");
      assertNotNull(stringReader0);
      
      jsonParser0.parse((Reader) stringReader0, 97);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonHandler<Object, String> jsonHandler0 = (JsonHandler<Object, String>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      StringReader stringReader0 = new StringReader("9<n!Gq-zH-iSi50");
      assertNotNull(stringReader0);
      
      // Undeclared exception!
      try { 
        jsonParser0.parse((Reader) stringReader0, 1787);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected character at 1:2
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonHandler<String, String> jsonHandler0 = (JsonHandler<String, String>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      StringReader stringReader0 = new StringReader("\"@8dBXUktqb'Ne");
      assertNotNull(stringReader0);
      
      // Undeclared exception!
      try { 
        jsonParser0.parse((Reader) stringReader0, 8232);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected end of input at 1:15
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonHandler<Object, Integer> jsonHandler0 = (JsonHandler<Object, Integer>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      // Undeclared exception!
      try { 
        jsonParser0.parse("\"9V*VaTI%\"ck*VF^H");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected character at 1:11
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonHandler<String, String> jsonHandler0 = (JsonHandler<String, String>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(jsonHandler0).startArray();
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      // Undeclared exception!
      try { 
        jsonParser0.parse("[9{2");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected ',' or ']' at 1:3
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonHandler<Object, String> jsonHandler0 = (JsonHandler<Object, String>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      // Undeclared exception!
      try { 
        jsonParser0.parse("95a;eA& ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected character at 1:3
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonHandler<Object, Object> jsonHandler0 = (JsonHandler<Object, Object>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      StringReader stringReader0 = new StringReader("8VNc8x[c_to=gu,s,");
      assertNotNull(stringReader0);
      
      // Undeclared exception!
      try { 
        jsonParser0.parse((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected character at 1:2
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonHandler<Object, Object> jsonHandler0 = (JsonHandler<Object, Object>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      StringReader stringReader0 = new StringReader("76$");
      assertNotNull(stringReader0);
      
      // Undeclared exception!
      try { 
        jsonParser0.parse((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected character at 1:3
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonHandler<Object, Object> jsonHandler0 = (JsonHandler<Object, Object>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      assertNotNull(jsonParser0);
      
      jsonParser0.parse(" 5");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonHandler<Object, Object> jsonHandler0 = (JsonHandler<Object, Object>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      // Undeclared exception!
      try { 
        jsonParser0.parse("49o");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected character at 1:3
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonHandler<Object, String> jsonHandler0 = (JsonHandler<Object, String>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      // Undeclared exception!
      try { 
        jsonParser0.parse("3H9\"t9");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected character at 1:2
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonHandler<Object, String> jsonHandler0 = (JsonHandler<Object, String>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      jsonParser0.parse("2");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonHandler<Object, Object> jsonHandler0 = (JsonHandler<Object, Object>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      // Undeclared exception!
      try { 
        jsonParser0.parse("1.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected end of input at 1:3
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonHandler<Integer, Object> jsonHandler0 = (JsonHandler<Integer, Object>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      jsonParser0.parse("0");
      jsonParser0.parse("0");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonHandler<String, Integer> jsonHandler0 = (JsonHandler<String, Integer>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      StringReader stringReader0 = new StringReader("-]:eRf?");
      // Undeclared exception!
      try { 
        jsonParser0.parse((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected digit at 1:2
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonHandler<Object, Object> jsonHandler0 = (JsonHandler<Object, Object>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      // Undeclared exception!
      try { 
        jsonParser0.parse("6xgj@6}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected character at 1:2
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonHandler<Integer, Object> jsonHandler0 = (JsonHandler<Integer, Object>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      StringReader stringReader0 = new StringReader("q");
      // Undeclared exception!
      try { 
        jsonParser0.parse((Reader) stringReader0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // buffersize is zero or negative
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonHandler<String, String> jsonHandler0 = (JsonHandler<String, String>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      // Undeclared exception!
      try { 
        jsonParser0.parse((Reader) null, (-1331));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // reader is null
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonHandler<Object, Integer> jsonHandler0 = (JsonHandler<Object, Integer>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      // Undeclared exception!
      try { 
        jsonParser0.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // string is null
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonParser jsonParser0 = null;
      try {
        jsonParser0 = new JsonParser((JsonHandler<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // handler is null
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonHandler<Object, String> jsonHandler0 = (JsonHandler<Object, String>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      // Undeclared exception!
      try { 
        jsonParser0.parse("number is negative");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected 'l' at 1:3
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Integer integer0 = new Integer(9);
      JsonHandler<Object, Integer> jsonHandler0 = (JsonHandler<Object, Integer>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(jsonHandler0).startObject();
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      StringReader stringReader0 = new StringReader("{;6");
      // Undeclared exception!
      try { 
        jsonParser0.parse((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected name at 1:2
         //
         verifyException("net.mooctest.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonHandler<Integer, Object> jsonHandler0 = (JsonHandler<Integer, Object>) mock(JsonHandler.class, new ViolatedAssumptionAnswer());
      JsonParser jsonParser0 = new JsonParser(jsonHandler0);
      jsonParser0.parse("true");
  }
}
