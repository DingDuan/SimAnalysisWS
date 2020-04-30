package net.mooctest;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.MessageDigest;
import java.util.Map;

import static net.mooctest.ChuLiuEdmondsTest.NINF;
import static net.mooctest.ChuLiuEdmondsTest.graph;
import static net.mooctest.Weighted.weighted;
import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestFibonacciHeap {
    @org.junit.Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @org.junit.Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();
    @org.junit.Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @org.junit.Rule
    public final SystemErrRule systemErrRule = new SystemErrRule().enableLog();

    @org.junit.Rule
    public final ExpectedException thrown = ExpectedException.none();

    class CauseMatcher extends TypeSafeMatcher {
        private Class<?> expectedType;
        private String expectedCause;

        public CauseMatcher(Class<?> clazz, String str) {
            this.expectedType = clazz;
            this.expectedCause = str;
        }

        protected boolean matchesSafely(Object item) {
            Throwable throwable = (Throwable) item;
            return throwable.getClass().isAssignableFrom(this.expectedType) && throwable.getMessage().contains(this.expectedCause);
        }

        public void describeTo(Description description) {
            description.appendText("expects type ");
        }
    }

    public String encrypt(String str) {
        try {
            String dataStr = str;
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(dataStr.getBytes("UTF8"));
            byte s[] = m.digest();
            String result = "";
            for (int i = 0; i < s.length; i++) {
                result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

    private Method getMethod(Class clazz, String name, Class... parameters) throws Throwable {
        Method method = clazz.getDeclaredMethod(name, parameters);
        method.setAccessible(true);
        return method;
    }

    private Field getField(Class clazz, String fieldName) throws Throwable {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        return field;
    }

    private Field getFinalField(Class clazz, String fieldName) throws Throwable {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        return field;
    }

    private void el(String out) {
        assertEquals(out, encrypt(systemOutRule.getLog()));
    }

    @Before
    public void handleBefore() {
        systemErrRule.clearLog();
        systemOutRule.clearLog();
    }

    @Test(timeout = 2000)
    public void testHere() throws Throwable {
        Pair<Integer, Integer> pair = new Pair<>(1, 2);
        System.out.println(pair);
        System.out.println(pair.equals(pair));
        System.out.println(pair.equals(null));
        System.out.println(pair.equals(new Pair<Integer, Integer>(1, 3)));
        System.out.println(pair.equals(new Pair<Integer, Integer>(1, 2)));
        System.out.println(pair.equals(new Pair<Integer, Integer>(3, 2)));
        System.out.println(pair.hashCode());
        Weighted<Arborescence<Integer>> bestA = weighted(Arborescence.of(ImmutableMap.of(
                1, 0,
                2, 1,
                3, 2
        )), 21);
        System.out.println(bestA);
        System.out.println(bestA.equals(null));
        System.out.println(bestA.equals(bestA));
        System.out.println(bestA.equals(""));
        System.out.println(bestA.equals(weighted(Arborescence.of(ImmutableMap.of(
                1, 0,
                2, 1
        )), 21)));
        System.out.println(bestA.equals(weighted(Arborescence.of(ImmutableMap.of(
                1, 0,
                2, 1,
                3, 2
        )), 21)));
        System.out.println(bestA.equals(bestA));
        FibonacciHeap<Integer, Integer> heap = FibonacciHeap.create();
        Map<Integer, FibonacciHeap<Integer, Integer>.Entry> entries = Maps.newHashMap();
        for (int i = 100; i < 200; i++) {
            entries.put(i, heap.add(i, i).get());
        }
        for (int i = 100; i < 150; i++)
            heap.remove(entries.get(i));
        Weighted weighted = new Weighted(1, 1.2);
        System.out.println(weighted.equals(new Weighted(2, 1.2)));
        System.out.println(weighted.equals(new Weighted(1, 1.2)));
        System.out.println(weighted.equals(new Weighted(1, 1.3)));
        el("3570f7a3b8d36b9b5c1b6be234d8be5e");
        systemOutRule.clearLog();
        Arborescence arborescence = Arborescence.of(ImmutableMap.of(
                1, 0,
                2, 1
        ));
        System.out.println(arborescence.equals(arborescence));
        System.out.println(arborescence.equals(null));
        System.out.println(arborescence.equals(""));
        System.out.println(FibonacciQueue.create().peek());
        System.out.println(KBestArborescences.getKBestArborescences(graph, 0, 0));
        System.out.println(KBestArborescences.getKBestArborescences(graph, 0, 1));
        System.out.println(KBestArborescences.getKBestArborescences(graph, 0, 2));
        System.out.println(KBestArborescences.getKBestArborescences(graph, 0, 3));
        double[][] weights = {
                {NINF, 10, 30, 10, NINF},
                {NINF, NINF, 10, NINF, 10},
                {NINF, 20, NINF, 7, 20},
                {NINF, NINF, 40, NINF, NINF},
                {NINF, NINF, NINF, NINF, NINF},
        };
        final DenseWeightedGraph<Integer> graph = DenseWeightedGraph.from(weights);
        System.out.println(graph.getWeightOf(0, 99999));
        System.out.println(graph.getWeightOf(-1, 0));
        System.out.println(graph.getIncomingEdges(9999999));
        Edge<Integer> edge = new Edge<Integer>(1, 2);
        System.out.println(edge);
        System.out.println(edge.equals(edge));
        System.out.println(edge.equals(""));
        System.out.println(edge.equals(null));
        el("03112bda9b3bc05c48a06418580f5daa");
        systemOutRule.clearLog();
        heap = FibonacciHeap.create();
        System.out.println(heap.pollOption());
        for (int i = 5; i > 0; i--) {
            entries.put(i, heap.add(i, i).get());
            try {
                heap.decreasePriority(entries.get(i), 9999);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 6; i < 15; i++) {
            entries.put(i, heap.add(i, i).get());
        }

        for (int i = 3; i < 8; i++)
            heap.decreasePriority(entries.get(i), -1);
        for (int i = 3; i < 8; i++)
            heap.decreasePriority(entries.get(i), -2);
        System.out.println(heap.pollOption());
        el("d8241003ca98dcefb622b42b5d57c2f9");

        for (int i = 6; i < 50; i++) {
            entries.put(i, heap.add(i, i).get());
        }
        for (int i = 6; i < 20; i++) {
            heap.decreasePriority(entries.get(i), i - 1);
        }

        for (int i = 20; i > 6; i--) {
            try {
                heap.decreasePriority(entries.get(i), i + 1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        Method cutAndMakeRoot = getMethod(FibonacciHeap.class, "cutAndMakeRoot", new Class[]{FibonacciHeap.Entry.class});
        for (int i = 0; i < 50; i++) {
            if (entries.get(i) != null)
                cutAndMakeRoot.invoke(heap, entries.get(i));
        }
        el("075d9b3f1e67e0bd6db72d5ffd27b24d");
    }


}
