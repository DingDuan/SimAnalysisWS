//package net.mooctest;
//
//import org.hamcrest.Description;
//import org.hamcrest.TypeSafeMatcher;
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.contrib.java.lang.system.ExpectedSystemExit;
//import org.junit.contrib.java.lang.system.SystemErrRule;
//import org.junit.contrib.java.lang.system.SystemOutRule;
//import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
//import org.junit.rules.ExpectedException;
//import org.junit.runners.MethodSorters;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.lang.reflect.Modifier;
//import java.security.MessageDigest;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class TestFibonacciHeap {
//    @org.junit.Rule
//    public final ExpectedSystemExit exit = ExpectedSystemExit.none();
//
//    @org.junit.Rule
//    public final TextFromStandardInputStream systemInMock
//            = emptyStandardInputStream();
//    @org.junit.Rule
//    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
//
//    @org.junit.Rule
//    public final SystemErrRule systemErrRule = new SystemErrRule().enableLog();
//
//    @org.junit.Rule
//    public final ExpectedException thrown = ExpectedException.none();
//
//    class CauseMatcher extends TypeSafeMatcher {
//        private Class<?> expectedType;
//        private String expectedCause;
//
//        public CauseMatcher(Class<?> clazz, String str) {
//            this.expectedType = clazz;
//            this.expectedCause = str;
//        }
//
//        protected boolean matchesSafely(Object item) {
//            Throwable throwable = (Throwable) item;
//            return throwable.getClass().isAssignableFrom(this.expectedType) && throwable.getMessage().contains(this.expectedCause);
//        }
//
//        public void describeTo(Description description) {
//            description.appendText("expects type ");
//        }
//    }
//
//    public String encrypt(String str) {
//        try {
//            String dataStr = str;
//            MessageDigest m = MessageDigest.getInstance("MD5");
//            m.update(dataStr.getBytes("UTF8"));
//            byte s[] = m.digest();
//            String result = "";
//            for (int i = 0; i < s.length; i++) {
//                result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
//            }
//            return result;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return "";
//    }
//
//    private Method getMethod(Class clazz, String name, Class... parameters) throws Throwable {
//        Method method = clazz.getDeclaredMethod(name, parameters);
//        method.setAccessible(true);
//        return method;
//    }
//
//    private Field getField(Class clazz, String fieldName) throws Throwable {
//        Field field = clazz.getDeclaredField(fieldName);
//        field.setAccessible(true);
//        return field;
//    }
//
//    private Field getFinalField(Class clazz, String fieldName) throws Throwable {
//        Field field = clazz.getDeclaredField(fieldName);
//        field.setAccessible(true);
//        Field modifiersField = Field.class.getDeclaredField("modifiers");
//        modifiersField.setAccessible(true);
//        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
//        return field;
//    }
//
//    private void el(String out) {
//        assertEquals(out, encrypt(systemOutRule.getLog()));
//    }
//
//    @Before
//    public void handleBefore() {
//        systemErrRule.clearLog();
//        systemOutRule.clearLog();
//    }
//
//    @Test(timeout = 2000)
//    public void testHere() {
//
//    }
//}
