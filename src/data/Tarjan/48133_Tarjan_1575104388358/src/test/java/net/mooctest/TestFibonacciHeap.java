package net.mooctest;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.UnaryExpr;
import com.github.javaparser.ast.observer.AstObserver;
import com.github.javaparser.ast.stmt.LocalClassDeclarationStmt;
import com.github.javaparser.ast.type.PrimitiveType;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.*;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.After;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.junit.rules.ExpectedException;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.function.Consumer;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.evosuite.shaded.org.mockito.ArgumentMatchers.any;
import static org.evosuite.shaded.org.mockito.Mockito.doReturn;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;


public class TestFibonacciHeap {

    @Test
    public void test() {
        FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
    }
    @org.junit.Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();
    @org.junit.Rule
    public final ExpectedException thrown = ExpectedException.none();

    @org.junit.Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();
    @org.junit.Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    @org.junit.Rule
    public final SystemErrRule systemErrRule = new SystemErrRule().enableLog();

    private boolean isExp = false;

    @After
    public void handleAfter() {
        if (isExp) {
            el("You should never see this message. If you do, please inform the author.");
            systemOutRule.clearLog();
            isExp = false;
        }
    }

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
        assertEquals(out, systemOutRule.getLog());
        systemOutRule.clearLog();
    }

    private void err(String err) {
        assertEquals(err, systemErrRule.getLog());
        systemErrRule.clearLog();
    }

    /* 如何使用 ExpectedSystemExit
    @Test
    public void verifiesExitStatus() {
        exit.expectSystemExitWithStatus(1);
        System.exit(1);
    }
    */


    /* 如何使用 CauseMatcher
    https://www.javacodegeeks.com/2014/03/junit-expectedexception-rule-beyond-basics.html
    @Test
    public void verifiesCauseTypeAndAMessage() {
        thrown.expect(RuntimeException.class);
        thrown.expectCause(new CauseMatcher(IllegalStateException.class, "Illegal state"));

        throw new RuntimeException("Runtime exception occurred",
                new IllegalStateException("Illegal state"));
    }
    */

    @Test(timeout = 4000)
    public void Arborescence_ESTest0()  throws Throwable  {
        Arborescence<String> arborescence0 = Arborescence.empty();
        Object object0 = new Object();
        // Undeclared exception!
        try {
            ImmutableMap.of((Object) arborescence0, (Object) arborescence0, (Object) arborescence0, object0);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // duplicate key: Arborescence{}
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void Arborescence_ESTest1()  throws Throwable  {
        Arborescence<Arborescence<AstObserver.ListChangeType>> arborescence0 = Arborescence.of((ImmutableMap<Arborescence<AstObserver.ListChangeType>, Arborescence<AstObserver.ListChangeType>>) null);
        // Undeclared exception!
        try {
            arborescence0.toString();
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.Arborescence", e);
        }
    }

    @Test(timeout = 4000)
    public void Arborescence_ESTest2()  throws Throwable  {
        Arborescence<ConstructorDeclaration> arborescence0 = Arborescence.of((ImmutableMap<ConstructorDeclaration, ConstructorDeclaration>) null);
        Arborescence<ConstructorDeclaration> arborescence1 = Arborescence.empty();
        // Undeclared exception!
        try {
            arborescence0.equals(arborescence1);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.Arborescence", e);
        }
    }

    @Test(timeout = 4000)
    public void Arborescence_ESTest3()  throws Throwable  {
        Arborescence<Object> arborescence0 = Arborescence.empty();
        // Undeclared exception!
        try {
            arborescence0.contains((Edge<Object>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.Arborescence", e);
        }
    }

    @Test(timeout = 4000)
    public void Arborescence_ESTest4()  throws Throwable  {
        Arborescence<Integer> arborescence0 = Arborescence.empty();
        boolean boolean0 = arborescence0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void Arborescence_ESTest5()  throws Throwable  {
        ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "EiEXLke~RYYY!Js");
        ImmutableBiMap<String, String> immutableBiMap0 = ImmutableBiMap.copyOf((Map<? extends String, ? extends String>) immutableSortedMap0);
        Arborescence<String> arborescence0 = Arborescence.of((ImmutableMap<String, String>) immutableBiMap0);
        boolean boolean0 = arborescence0.equals("");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void Arborescence_ESTest6()  throws Throwable  {
        Arborescence<Comparable<Object>> arborescence0 = Arborescence.empty();
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        Edge<Comparable<Object>> edge0 = new Edge<Comparable<Object>>(comparable0, comparable0);
        boolean boolean0 = arborescence0.contains(edge0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void Arborescence_ESTest7()  throws Throwable  {
        Arborescence<Arborescence<Object>> arborescence0 = Arborescence.empty();
        arborescence0.hashCode();
    }
    @Test(timeout = 4000)
    public void ChuLiuEdmonds_ESTest00()  throws Throwable  {
        ArrayDeque<Edge<Weighted<Edge<Integer>>>> arrayDeque0 = new ArrayDeque<Edge<Weighted<Edge<Integer>>>>();
        HashSet<Weighted<Edge<Edge<Weighted<Edge<Integer>>>>>> hashSet0 = new HashSet<Weighted<Edge<Edge<Weighted<Edge<Integer>>>>>>(1219, 1219);
        SparseWeightedGraph<Edge<Weighted<Edge<Integer>>>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Edge<Weighted<Edge<Integer>>>>) arrayDeque0, (Iterable<Weighted<Edge<Edge<Weighted<Edge<Integer>>>>>>) hashSet0);
        HashSet<Edge<Edge<Weighted<Edge<Integer>>>>> hashSet1 = new HashSet<Edge<Edge<Weighted<Edge<Integer>>>>>();
        TreeSet<Edge<Edge<Weighted<Edge<Integer>>>>> treeSet0 = new TreeSet<Edge<Edge<Weighted<Edge<Integer>>>>>();
        Weighted<Arborescence<Edge<Weighted<Edge<Integer>>>>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Edge<Weighted<Edge<Integer>>>>) sparseWeightedGraph0, (Set<Edge<Edge<Weighted<Edge<Integer>>>>>) hashSet1, (Set<Edge<Edge<Weighted<Edge<Integer>>>>>) treeSet0);
        assertEquals(0.0, weighted0.weight, 0.01);
    }

    @Test(timeout = 4000)
    public void ChuLiuEdmonds_ESTest01()  throws Throwable  {
        Edge<Integer> edge0 = (Edge<Integer>) mock(Edge.class, new ViolatedAssumptionAnswer());
        ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of(edge0, Double.NEGATIVE_INFINITY);
        double[][] doubleArray0 = new double[1][5];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);
        // Undeclared exception!
        try {
            chuLiuEdmonds_PartialSolution0.addEdge(exclusiveEdge0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.Partition", e);
        }
    }

    @Test(timeout = 4000)
    public void ChuLiuEdmonds_ESTest02()  throws Throwable  {
        HashSet<Weighted<Edge<ExclusiveEdge<Integer>>>> hashSet0 = new HashSet<Weighted<Edge<ExclusiveEdge<Integer>>>>(108, 217.80417F);
        SparseWeightedGraph<ExclusiveEdge<Integer>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<ExclusiveEdge<Integer>>>>) hashSet0);
        Edge<Integer> edge0 = (Edge<Integer>) mock(Edge.class, new ViolatedAssumptionAnswer());
        ExclusiveEdge<Integer> exclusiveEdge0 = ExclusiveEdge.of(edge0, Double.NEGATIVE_INFINITY);
        Weighted<Arborescence<ExclusiveEdge<Integer>>> weighted0 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<ExclusiveEdge<Integer>>) sparseWeightedGraph0, exclusiveEdge0);
        assertEquals(0.0, weighted0.weight, 0.01);
    }

    @Test(timeout = 4000)
    public void ChuLiuEdmonds_ESTest03()  throws Throwable  {
        LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
        Edge<Object> edge0 = new Edge<Object>((Object) null, (Object) null);
        linkedHashSet0.add(edge0);
        // Undeclared exception!
        try {
            ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) null, (Set<Edge<Object>>) linkedHashSet0, (Set<Edge<Object>>) linkedHashSet0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // null key in entry: null=null
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void ChuLiuEdmonds_ESTest04()  throws Throwable  {
        double[][] doubleArray0 = new double[9][5];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        // Undeclared exception!
        try {
            ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Integer>) denseWeightedGraph0, (Integer) null);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch(ArrayIndexOutOfBoundsException e) {
            //
            // 5
            //
            verifyException("net.mooctest.DenseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void ChuLiuEdmonds_ESTest05()  throws Throwable  {
        // Undeclared exception!
        try {
            ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.ChuLiuEdmonds", e);
        }
    }

    @Test(timeout = 4000)
    public void ChuLiuEdmonds_ESTest06()  throws Throwable  {
        double[][] doubleArray0 = new double[0][0];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);
        Set<Integer> set0 = chuLiuEdmonds_PartialSolution0.getNodes();
        assertEquals(0, set0.size());
    }

    @Test(timeout = 4000)
    public void ChuLiuEdmonds_ESTest07()  throws Throwable  {
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        ArrayDeque<Weighted<Edge<Integer>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<Integer>>>();
        SparseWeightedGraph<Integer> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Integer>) linkedList0, (Iterable<Weighted<Edge<Integer>>>) arrayDeque0);
        ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) sparseWeightedGraph0);
        Arborescence<Integer> arborescence0 = Arborescence.empty();
        com.google.common.base.Optional<ExclusiveEdge<Integer>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge((Integer) null, arborescence0);
        assertNotNull(optional0);
    }

    @Test(timeout = 4000)
    public void ChuLiuEdmonds_ESTest08()  throws Throwable  {
        double[][] doubleArray0 = new double[1][5];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = Double.NEGATIVE_INFINITY;
        doubleArray0[0] = doubleArray1;
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<Integer>) denseWeightedGraph0);
        assertNotNull(chuLiuEdmonds_PartialSolution0);
    }

    @Test(timeout = 4000)
    public void ChuLiuEdmonds_ESTest09()  throws Throwable  {
        PriorityQueue<Weighted<Edge<Object>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Object>>>();
        Object object0 = new Object();
        Edge<Object> edge0 = new Edge<Object>(priorityQueue0, object0);
        Weighted<Edge<Object>> weighted0 = new Weighted<Edge<Object>>(edge0, 0.0);
        priorityQueue0.add(weighted0);
        SparseWeightedGraph<Object> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) priorityQueue0);
        Weighted<Arborescence<Object>> weighted1 = ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) sparseWeightedGraph0);
        assertEquals(0.0, weighted1.weight, 0.01);
    }

    @Test(timeout = 4000)
    public void ChuLiuEdmonds_ESTest10()  throws Throwable  {
        Vector<Weighted<Edge<ExclusiveEdge<MethodDeclaration>>>> vector0 = new Vector<Weighted<Edge<ExclusiveEdge<MethodDeclaration>>>>(1145, 1145);
        SparseWeightedGraph<ExclusiveEdge<MethodDeclaration>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<ExclusiveEdge<MethodDeclaration>>>>) vector0);
        ChuLiuEdmonds.PartialSolution<ExclusiveEdge<MethodDeclaration>> chuLiuEdmonds_PartialSolution0 = ChuLiuEdmonds.PartialSolution.initialize((WeightedGraph<ExclusiveEdge<MethodDeclaration>>) sparseWeightedGraph0);
        ExclusiveEdge<MethodDeclaration> exclusiveEdge0 = ExclusiveEdge.of((Edge<MethodDeclaration>) null, 833.4097000452);
        com.google.common.base.Optional<ExclusiveEdge<ExclusiveEdge<MethodDeclaration>>> optional0 = chuLiuEdmonds_PartialSolution0.popBestEdge(exclusiveEdge0);
        assertNotNull(optional0);
    }

    @Test(timeout = 4000)
    public void ChuLiuEdmonds_ESTest11()  throws Throwable  {
        LinkedHashSet<Edge<Object>> linkedHashSet0 = new LinkedHashSet<Edge<Object>>();
        // Undeclared exception!
        try {
            ChuLiuEdmonds.getMaxArborescence((WeightedGraph<Object>) null, (Set<Edge<Object>>) linkedHashSet0, (Set<Edge<Object>>) linkedHashSet0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.ChuLiuEdmonds", e);
        }
    }

    @Test(timeout = 4000)
    public void ChuLiuEdmonds_ESTest12()  throws Throwable  {
        // Undeclared exception!
        try {
            ChuLiuEdmonds.getMaxArborescence((WeightedGraph<String>) null, "Eo},_/}");
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.ChuLiuEdmonds", e);
        }
    }

    @Test(timeout = 4000)
    public void ChuLiuEdmonds_ESTest13()  throws Throwable  {
        ChuLiuEdmonds chuLiuEdmonds0 = new ChuLiuEdmonds();
    }

    @Test(timeout = 4000)
    public void DenseWeightedGraph_ESTest00()  throws Throwable  {
        ArrayDeque<Object> arrayDeque0 = new ArrayDeque<Object>();
        double[][] doubleArray0 = new double[0][9];
        DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) arrayDeque0, doubleArray0);
        double double0 = denseWeightedGraph0.getWeightOf(arrayDeque0, (Object) null);
        assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void DenseWeightedGraph_ESTest01()  throws Throwable  {
        PriorityQueue<Integer> priorityQueue0 = new PriorityQueue<Integer>();
        PriorityQueue<Object> priorityQueue1 = new PriorityQueue<Object>(priorityQueue0);
        priorityQueue1.add(priorityQueue0);
        double[][] doubleArray0 = new double[0][0];
        // Undeclared exception!
        try {
            DenseWeightedGraph.from((Iterable<Object>) priorityQueue1, doubleArray0);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void DenseWeightedGraph_ESTest02()  throws Throwable  {
        // Undeclared exception!
        try {
            DenseWeightedGraph.from((double[][]) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.DenseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void DenseWeightedGraph_ESTest03()  throws Throwable  {
        ArrayDeque<Weighted<Integer>> arrayDeque0 = new ArrayDeque<Weighted<Integer>>(0);
        // Undeclared exception!
        try {
            DenseWeightedGraph.from((Iterable<Weighted<Integer>>) arrayDeque0, (double[][]) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.DenseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void DenseWeightedGraph_ESTest04()  throws Throwable  {
        double[][] doubleArray0 = new double[5][8];
        // Undeclared exception!
        try {
            DenseWeightedGraph.from((Iterable<Integer>) null, doubleArray0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void DenseWeightedGraph_ESTest05()  throws Throwable  {
        PrimitiveType.Primitive primitiveType_Primitive0 = PrimitiveType.Primitive.INT;
        PrimitiveType.Primitive primitiveType_Primitive1 = PrimitiveType.Primitive.DOUBLE;
        EnumSet<PrimitiveType.Primitive> enumSet0 = EnumSet.of(primitiveType_Primitive0, primitiveType_Primitive1, primitiveType_Primitive0, primitiveType_Primitive0);
        double[][] doubleArray0 = new double[2][0];
        DenseWeightedGraph<PrimitiveType.Primitive> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<PrimitiveType.Primitive>) enumSet0, doubleArray0);
        // Undeclared exception!
        try {
            denseWeightedGraph0.getIncomingEdges(primitiveType_Primitive0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch(ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
            verifyException("net.mooctest.DenseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void DenseWeightedGraph_ESTest06()  throws Throwable  {
        PrimitiveType.Primitive primitiveType_Primitive0 = PrimitiveType.Primitive.INT;
        PrimitiveType.Primitive primitiveType_Primitive1 = PrimitiveType.Primitive.DOUBLE;
        EnumSet<PrimitiveType.Primitive> enumSet0 = EnumSet.of(primitiveType_Primitive0, primitiveType_Primitive1, primitiveType_Primitive1, primitiveType_Primitive1);
        double[][] doubleArray0 = new double[2][0];
        DenseWeightedGraph<PrimitiveType.Primitive> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<PrimitiveType.Primitive>) enumSet0, doubleArray0);
        // Undeclared exception!
        try {
            denseWeightedGraph0.getIncomingEdges(primitiveType_Primitive1);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch(ArrayIndexOutOfBoundsException e) {
            //
            // 1
            //
            verifyException("net.mooctest.DenseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void DenseWeightedGraph_ESTest07()  throws Throwable  {
        double[][] doubleArray0 = new double[6][7];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Collection<Integer> collection0 = denseWeightedGraph0.getNodes();
        assertNotNull(collection0);
    }

    @Test(timeout = 4000)
    public void DenseWeightedGraph_ESTest08()  throws Throwable  {
        double[][] doubleArray0 = new double[0][6];
        Stack<String> stack0 = new Stack<String>();
        DenseWeightedGraph<String> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<String>) stack0, doubleArray0);
        Collection<Weighted<Edge<String>>> collection0 = denseWeightedGraph0.getIncomingEdges((String) null);
        assertNotNull(collection0);
    }

    @Test(timeout = 4000)
    public void DenseWeightedGraph_ESTest09()  throws Throwable  {
        double[][] doubleArray0 = new double[17][2];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Integer integer0 = Integer.getInteger("x<", 1);
        double double0 = denseWeightedGraph0.getWeightOf(integer0, integer0);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void DenseWeightedGraph_ESTest10()  throws Throwable  {
        double[][] doubleArray0 = new double[17][2];
        Class<PrimitiveType.Primitive> class0 = PrimitiveType.Primitive.class;
        EnumSet<PrimitiveType.Primitive> enumSet0 = EnumSet.allOf(class0);
        // Undeclared exception!
        try {
            DenseWeightedGraph.from((Iterable<PrimitiveType.Primitive>) enumSet0, doubleArray0);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void DenseWeightedGraph_ESTest11()  throws Throwable  {
        double[][] doubleArray0 = new double[1][2];
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        // Undeclared exception!
        try {
            denseWeightedGraph0.filterEdges((Predicate<Edge<Integer>>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.WeightedGraph", e);
        }
    }
    @Test(timeout = 4000)
    public void EdgeQueueMap_ESTest0()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciQueue<Comparable<Object>> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Comparable<Object>>) comparator0);
        Partition<Comparable<Object>> partition0 = Partition.singletons((Collection<Comparable<Object>>) fibonacciQueue0);
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        Edge<Comparable<Object>> edge0 = new Edge<Comparable<Object>>(comparable0, comparable0);
        ArrayList<Object> arrayList0 = new ArrayList<Object>();
        Partition<Object> partition1 = Partition.singletons((Collection<Object>) arrayList0);
        EdgeQueueMap.EdgeQueue<Object> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((Object) partition0, partition1);
        Edge<Object> edge1 = new Edge<Object>(edge0, fibonacciQueue0);
        ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge1, 0.0);
        // Undeclared exception!
        try {
            edgeQueueMap_EdgeQueue0.addEdge(exclusiveEdge0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.Partition", e);
        }
    }

    @Test(timeout = 4000)
    public void EdgeQueueMap_ESTest1()  throws Throwable  {
        ArrayDeque<ExclusiveEdge<Object>> arrayDeque0 = new ArrayDeque<ExclusiveEdge<Object>>();
        Partition<ExclusiveEdge<Object>> partition0 = Partition.singletons((Collection<ExclusiveEdge<Object>>) arrayDeque0);
        EdgeQueueMap<ExclusiveEdge<Object>> edgeQueueMap0 = new EdgeQueueMap<ExclusiveEdge<Object>>(partition0);
        Vector<Edge<Object>> vector0 = new Vector<Edge<Object>>(0, 0);
        ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of((Edge<Object>) null, (List<Edge<Object>>) vector0, (double) 0);
        // Undeclared exception!
        try {
            edgeQueueMap0.merge(exclusiveEdge0, (Iterable<Pair<EdgeQueueMap.EdgeQueue<ExclusiveEdge<Object>>, Weighted<Edge<ExclusiveEdge<Object>>>>>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.EdgeQueueMap", e);
        }
    }

//    @Test(timeout = 4000)
//    @Ignore
//    public void EdgeQueueMap_ESTest2()  throws Throwable  {
//        ArrayList<Locale.FilteringMode> arrayList0 = new ArrayList<Locale.FilteringMode>();
//        Partition<Locale.FilteringMode> partition0 = Partition.singletons((Collection<Locale.FilteringMode>) arrayList0);
//        ArrayList<Annotation> arrayList1 = new ArrayList<Annotation>();
//        Edge<Object> edge0 = new Edge<Object>(partition0, arrayList1);
//        ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
//        FibonacciQueue<Comparable<MethodDeclaration>> fibonacciQueue0 = FibonacciQueue.create();
//        Partition<Comparable<MethodDeclaration>> partition1 = Partition.singletons((Collection<Comparable<MethodDeclaration>>) fibonacciQueue0);
//        EdgeQueueMap<Comparable<MethodDeclaration>> edgeQueueMap0 = new EdgeQueueMap<Comparable<MethodDeclaration>>(partition1);
//        Weighted<Edge<Comparable<MethodDeclaration>>> weighted0 = new Weighted<Edge<Comparable<MethodDeclaration>>>(exclusiveEdge0.edge, 0.0);
//        // Undeclared exception!
//        try {
//            edgeQueueMap0.addEdge(weighted0);
//            fail("Expecting exception: NullPointerException");
//
//        } catch(NullPointerException e) {
//            //
//            // no message in exception (getMessage() returned null)
//            //
//            verifyException("net.mooctest.Partition", e);
//        }
//    }

    @Test(timeout = 4000)
    public void EdgeQueueMap_ESTest3()  throws Throwable  {
        Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        EdgeQueueMap.EdgeQueue<Object> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create((Object) locale_FilteringMode0, (Partition<Object>) null);
        com.google.common.base.Optional<ExclusiveEdge<Object>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge((Arborescence<Object>) null);
        assertNotNull(optional0);
    }

    @Test(timeout = 4000)
    public void EdgeQueueMap_ESTest4()  throws Throwable  {
        ArrayList<Annotation> arrayList0 = new ArrayList<Annotation>();
        Partition<Annotation> partition0 = Partition.singletons((Collection<Annotation>) arrayList0);
        EdgeQueueMap<Annotation> edgeQueueMap0 = new EdgeQueueMap<Annotation>(partition0);
        Annotation annotation0 = mock(Annotation.class, new ViolatedAssumptionAnswer());
        com.google.common.base.Optional<ExclusiveEdge<Annotation>> optional0 = edgeQueueMap0.popBestEdge(annotation0, (Arborescence<Annotation>) null);
        assertNotNull(optional0);
    }

    @Test(timeout = 4000)
    public void EdgeQueueMap_ESTest5()  throws Throwable  {
        ArrayList<Locale.FilteringMode> arrayList0 = new ArrayList<Locale.FilteringMode>();
        Partition<Locale.FilteringMode> partition0 = Partition.singletons((Collection<Locale.FilteringMode>) arrayList0);
        ArrayList<Annotation> arrayList1 = new ArrayList<Annotation>();
        Edge<Object> edge0 = new Edge<Object>(partition0, arrayList1);
        ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
        LinkedHashSet<ExclusiveEdge<Object>> linkedHashSet0 = new LinkedHashSet<ExclusiveEdge<Object>>();
        Partition<ExclusiveEdge<Object>> partition1 = Partition.singletons((Collection<ExclusiveEdge<Object>>) linkedHashSet0);
        EdgeQueueMap.EdgeQueue<ExclusiveEdge<Object>> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create(exclusiveEdge0, partition1);
        com.google.common.base.Optional<ExclusiveEdge<ExclusiveEdge<Object>>> optional0 = edgeQueueMap_EdgeQueue0.popBestEdge();
        assertNotNull(optional0);
    }

    @Test(timeout = 4000)
    public void EdgeQueueMap_ESTest6()  throws Throwable  {
        ArrayDeque<ExclusiveEdge<Object>> arrayDeque0 = new ArrayDeque<ExclusiveEdge<Object>>();
        Partition<ExclusiveEdge<Object>> partition0 = Partition.singletons((Collection<ExclusiveEdge<Object>>) arrayDeque0);
        EdgeQueueMap<ExclusiveEdge<Object>> edgeQueueMap0 = new EdgeQueueMap<ExclusiveEdge<Object>>(partition0);
        Vector<Edge<Object>> vector0 = new Vector<Edge<Object>>(0, 0);
        ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of((Edge<Object>) null, (List<Edge<Object>>) vector0, (double) 0);
        Vector<Pair<EdgeQueueMap.EdgeQueue<ExclusiveEdge<Object>>, Weighted<Edge<ExclusiveEdge<Object>>>>> vector1 = new Vector<Pair<EdgeQueueMap.EdgeQueue<ExclusiveEdge<Object>>, Weighted<Edge<ExclusiveEdge<Object>>>>>(0);
        EdgeQueueMap.EdgeQueue edgeQueueMap_EdgeQueue0 = edgeQueueMap0.merge(exclusiveEdge0, vector1);
        assertNotNull(edgeQueueMap_EdgeQueue0);
    }


    @Test(timeout = 4000)
    public void ExclusiveEdge_ESTest0()  throws Throwable  {
        ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of((Edge<Object>) null, 191.904692);
        ExclusiveEdge<Object> exclusiveEdge1 = ExclusiveEdge.of((Edge<Object>) null, (-1.0));
        int int0 = exclusiveEdge0.compareTo(exclusiveEdge1);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void ExclusiveEdge_ESTest1()  throws Throwable  {
        Edge<Object> edge0 = (Edge<Object>) mock(Edge.class, new ViolatedAssumptionAnswer());
        ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of(edge0, 0.0);
        LinkedList<Edge<Object>> linkedList0 = new LinkedList<Edge<Object>>();
        ExclusiveEdge<Object> exclusiveEdge1 = ExclusiveEdge.of(exclusiveEdge0.edge, (List<Edge<Object>>) linkedList0, 1.0);
        int int0 = exclusiveEdge0.compareTo(exclusiveEdge1);
        assertEquals((-1), int0);
        assertEquals(0.0, exclusiveEdge0.weight, 0.01);
    }

    @Test(timeout = 4000)
    public void ExclusiveEdge_ESTest2()  throws Throwable  {
        ExclusiveEdge<Object> exclusiveEdge0 = ExclusiveEdge.of((Edge<Object>) null, 191.904692);
        int int0 = exclusiveEdge0.compareTo(exclusiveEdge0);
        assertEquals(0, int0);
        assertEquals(191.904692, exclusiveEdge0.weight, 0.01);
    }

    @Test(timeout = 4000)
    public void ExclusiveEdge_ESTest3()  throws Throwable  {
        Edge<String> edge0 = (Edge<String>) mock(Edge.class, new ViolatedAssumptionAnswer());
        LinkedList<Edge<String>> linkedList0 = new LinkedList<Edge<String>>();
        ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of(edge0, (List<Edge<String>>) linkedList0, (-2000.45278043471));
        // Undeclared exception!
        try {
            exclusiveEdge0.compareTo((ExclusiveEdge<String>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.ExclusiveEdge", e);
        }
    }
    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest00()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn((-720), 0).when(comparator0).compare(any() , any());
        FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        Integer integer0 = new Integer(0);
        fibonacciHeap0.add("", integer0);
        Integer.min(670, 0);
        fibonacciHeap0.forEach(consumer0);
        FibonacciHeap<String, Integer> fibonacciHeap1 = FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
        Consumer<Object> consumer1 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        Integer integer1 = new Integer(Integer.MAX_VALUE);
        fibonacciHeap1.add("", integer1);
        fibonacciHeap1.forEach(consumer1);
        fibonacciHeap1.add("", integer0);
        FibonacciHeap.create();
        Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<Object, Object> fibonacciHeap2 = FibonacciHeap.create((Comparator<? super Object>) comparator1);
        FibonacciHeap<Object, Object> fibonacciHeap3 = FibonacciHeap.merge(fibonacciHeap2, fibonacciHeap2);
        FibonacciHeap<Object, Object> fibonacciHeap4 = FibonacciHeap.merge(fibonacciHeap2, fibonacciHeap3);
        fibonacciHeap4.spliterator();
        fibonacciHeap4.iterator();
        fibonacciHeap4.pollOption();
        fibonacciHeap1.pollOption();
        Comparator<Object> comparator2 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap.create((Comparator<? super Object>) comparator2);
        FibonacciHeap<String, String> fibonacciHeap5 = FibonacciHeap.create();
        assertEquals(Integer.MAX_VALUE, FibonacciHeap.MAX_CAPACITY);
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest01()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn((-720), 3062, 15, (-3457), 0).when(comparator0).compare(any() , any());
        FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
        fibonacciHeap0.add("", (Integer) Integer.MAX_VALUE);
        fibonacciHeap0.add("", (Integer) fibonacciHeap0.MAX_CAPACITY);
        fibonacciHeap0.add("", (Integer) fibonacciHeap0.MAX_CAPACITY);
        fibonacciHeap0.add("", (Integer) Integer.MAX_VALUE);
        fibonacciHeap0.pollOption();
        assertEquals(3, fibonacciHeap0.size());
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest02()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn((-720), 3062, 3062, 3062, 0).when(comparator0).compare(any() , any());
        FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
        fibonacciHeap0.add("", (Integer) Integer.MAX_VALUE);
        fibonacciHeap0.add("", (Integer) fibonacciHeap0.MAX_CAPACITY);
        fibonacciHeap0.add("", (Integer) Integer.MAX_VALUE);
        fibonacciHeap0.add("", (Integer) fibonacciHeap0.MAX_CAPACITY);
        fibonacciHeap0.add("", (Integer) Integer.MAX_VALUE);
        fibonacciHeap0.pollOption();
        assertEquals(4, fibonacciHeap0.size());
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest03()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(comparator0).compare(any() , any());
        FibonacciHeap<String, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
        Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<Integer, Integer> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super Integer>) comparator1);
        fibonacciHeap0.add(">7sDRVa(#~r!i", ">7sDRVa(#~r!i");
        fibonacciHeap0.add("", fibonacciHeap1.MAX_CAPACITY);
        FibonacciHeap<String, Object> fibonacciHeap2 = FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap0);
        assertEquals(2, fibonacciHeap0.size());
        assertEquals(4, fibonacciHeap2.size());
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest04()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<Object, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
        Comparator<? super Object> comparator1 = fibonacciHeap0.comparator();
        FibonacciHeap<Integer, Integer> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super Integer>) comparator1);
        FibonacciHeap<Integer, Integer> fibonacciHeap2 = FibonacciHeap.merge(fibonacciHeap1, fibonacciHeap1);
        fibonacciHeap1.add((Integer) Integer.MAX_VALUE, (Integer) Integer.MAX_VALUE);
        FibonacciHeap.merge(fibonacciHeap2, fibonacciHeap1);
        assertEquals(1, fibonacciHeap1.size());
        assertEquals(0, fibonacciHeap2.size());
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest05()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<String, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
        fibonacciHeap0.add(">7sDRVa(#~r!i", ">7sDRVa(#~r!i");
        int int0 = fibonacciHeap0.size();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest06()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<Object, FibonacciHeap.Entry> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super FibonacciHeap.Entry>) comparator0);
        // Undeclared exception!
        try {
            FibonacciHeap.merge((FibonacciHeap<Object, FibonacciHeap.Entry>) null, fibonacciHeap0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.FibonacciHeap", e);
        }
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest07()  throws Throwable  {
        FibonacciHeap<Integer, Integer> fibonacciHeap0 = FibonacciHeap.create();
        Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<Integer, Integer> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
        // Undeclared exception!
        try {
            FibonacciHeap.merge(fibonacciHeap0, fibonacciHeap1);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // Heaps that use different comparators can't be merged.
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest08()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<FibonacciHeap.Entry, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
        Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<String, Object> fibonacciHeap1 = FibonacciHeap.create((Comparator<? super Object>) comparator1);
        // Undeclared exception!
        try {
            fibonacciHeap1.decreasePriority((FibonacciHeap.Entry) null, fibonacciHeap0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.FibonacciHeap$Entry", e);
        }
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest09()  throws Throwable  {
        // Undeclared exception!
        try {
            FibonacciHeap.create((Comparator<? super Integer>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest10()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<String, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
        // Undeclared exception!
        try {
            fibonacciHeap0.add((String) null, (String) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest11()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<Object, String> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super String>) comparator0);
        Object object0 = new Object();
        fibonacciHeap0.add(object0, "");
        assertEquals(1, fibonacciHeap0.size());

        fibonacciHeap0.pollOption();
        assertEquals(0, fibonacciHeap0.size());
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest12()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn((-720), 3062, 3062, 3062).when(comparator0).compare(any() , any());
        FibonacciHeap<String, Integer> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Integer>) comparator0);
        fibonacciHeap0.add("", (Integer) Integer.MAX_VALUE);
        fibonacciHeap0.add("", (Integer) Integer.MAX_VALUE);
        fibonacciHeap0.add("", (Integer) Integer.MAX_VALUE);
        fibonacciHeap0.pollOption();
        fibonacciHeap0.pollOption();
        assertEquals(1, fibonacciHeap0.size());
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest13()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<String, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
        boolean boolean0 = fibonacciHeap0.isEmpty();
        assertEquals(0, fibonacciHeap0.size());
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest14()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<String, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
        fibonacciHeap0.add("", "");
        boolean boolean0 = fibonacciHeap0.isEmpty();
        assertEquals(1, fibonacciHeap0.size());
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest15()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<FibonacciHeap.Entry, FibonacciHeap.Entry> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super FibonacciHeap.Entry>) comparator0);
        int int0 = fibonacciHeap0.size();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest16()  throws Throwable  {
        FibonacciHeap<FibonacciHeap.Entry, String> fibonacciHeap0 = FibonacciHeap.create();
        fibonacciHeap0.peekOption();
        assertEquals(0, fibonacciHeap0.size());
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest17()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<String, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
        // Undeclared exception!
        try {
            fibonacciHeap0.remove((FibonacciHeap.Entry) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.FibonacciHeap$Entry", e);
        }
    }

    @Test(timeout = 4000)
    public void FibonacciHeap_ESTest18()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciHeap<String, Object> fibonacciHeap0 = FibonacciHeap.create((Comparator<? super Object>) comparator0);
        fibonacciHeap0.clear();
        assertEquals(0, fibonacciHeap0.size());
    }

    @Test(timeout = 4000)
    public void FibonacciQueue_ESTest00()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciQueue<FibonacciHeap.Entry> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super FibonacciHeap.Entry>) comparator0);
        int int0 = fibonacciQueue0.size();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void FibonacciQueue_ESTest01()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super String>) comparator0);
        fibonacciQueue0.add("1");
        int int0 = fibonacciQueue0.size();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void FibonacciQueue_ESTest02()  throws Throwable  {
        FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create();
        Integer integer0 = new Integer(0);
        fibonacciQueue0.add(integer0);
        Integer integer1 = fibonacciQueue0.poll();
        assertEquals(0, (int)integer1);
    }

    @Test(timeout = 4000)
    public void FibonacciQueue_ESTest03()  throws Throwable  {
        FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create();
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciQueue<Object> fibonacciQueue1 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
        boolean boolean0 = fibonacciQueue1.offer(fibonacciQueue0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void FibonacciQueue_ESTest04()  throws Throwable  {
        FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create();
        Iterator<Integer> iterator0 = fibonacciQueue0.iterator();
        assertNotNull(iterator0);
    }

    @Test(timeout = 4000)
    public void FibonacciQueue_ESTest05()  throws Throwable  {
        // Undeclared exception!
        try {
            FibonacciQueue.create((Comparator<? super Integer>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void FibonacciQueue_ESTest06()  throws Throwable  {
        FibonacciQueue<Integer> fibonacciQueue0 = FibonacciQueue.create();
        Integer integer0 = new Integer(615);
        fibonacciQueue0.add(integer0);
        Integer integer1 = fibonacciQueue0.peek();
        assertEquals(615, (int)integer1);
    }

    @Test(timeout = 4000)
    public void FibonacciQueue_ESTest07()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
        Comparator<? super Object> comparator1 = fibonacciQueue0.comparator();
        FibonacciQueue<String> fibonacciQueue1 = FibonacciQueue.create((Comparator<? super String>) comparator1);
        String string0 = fibonacciQueue1.peek();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void FibonacciQueue_ESTest08()  throws Throwable  {
        FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
        fibonacciQueue0.add(":hgE1?u~mO79<HS01k");
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        fibonacciQueue0.forEach(consumer0);
        assertTrue(fibonacciQueue0.contains(":hgE1?u~mO79<HS01k"));
    }

    @Test(timeout = 4000)
    public void FibonacciQueue_ESTest09()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        FibonacciQueue<Object> fibonacciQueue0 = FibonacciQueue.create((Comparator<? super Object>) comparator0);
        Comparator<? super Object> comparator1 = fibonacciQueue0.comparator();
        FibonacciQueue<String> fibonacciQueue1 = FibonacciQueue.create((Comparator<? super String>) comparator1);
        // Undeclared exception!
        try {
            fibonacciQueue1.offer((String) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void FibonacciQueue_ESTest10()  throws Throwable  {
        FibonacciQueue<String> fibonacciQueue0 = FibonacciQueue.create();
        String string0 = fibonacciQueue0.poll();
        assertNull(string0);
    }
    @Test(timeout = 4000)
    public void KBestArborescences_ESTest00()  throws Throwable  {
        Edge<Node.ObserverRegistrationMode> edge0 = (Edge<Node.ObserverRegistrationMode>) mock(Edge.class, new ViolatedAssumptionAnswer());
        Arborescence<Node.ObserverRegistrationMode> arborescence0 = Arborescence.of((ImmutableMap<Node.ObserverRegistrationMode, Node.ObserverRegistrationMode>) null);
        Weighted<Arborescence<Node.ObserverRegistrationMode>> weighted0 = Weighted.weighted(arborescence0, 0.0);
        HashSet<Edge<Node.ObserverRegistrationMode>> hashSet0 = new HashSet<Edge<Node.ObserverRegistrationMode>>();
        LinkedHashSet<Edge<Node.ObserverRegistrationMode>> linkedHashSet0 = new LinkedHashSet<Edge<Node.ObserverRegistrationMode>>();
        KBestArborescences.SubsetOfSolutions<Node.ObserverRegistrationMode> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Node.ObserverRegistrationMode>(edge0, weighted0, hashSet0, linkedHashSet0);
    }

    @Test(timeout = 4000)
    public void KBestArborescences_ESTest01()  throws Throwable  {
        ArrayDeque<Weighted<Edge<String>>> arrayDeque0 = new ArrayDeque<Weighted<Edge<String>>>(896);
        SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) arrayDeque0);
        TreeSet<Edge<String>> treeSet0 = new TreeSet<Edge<String>>();
        Arborescence<String> arborescence0 = Arborescence.empty();
        Weighted<Arborescence<String>> weighted0 = new Weighted<Arborescence<String>>(arborescence0, 896);
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        TreeSet<Edge<String>> treeSet1 = new TreeSet<Edge<String>>(comparator0);
        com.google.common.base.Optional<Weighted<KBestArborescences.SubsetOfSolutions<String>>> optional0 = KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<String>) sparseWeightedGraph0, (Set<Edge<String>>) treeSet0, (Set<Edge<String>>) treeSet1, weighted0);
        assertNotNull(optional0);
    }

    @Test(timeout = 4000)
    public void KBestArborescences_ESTest02()  throws Throwable  {
        ArrayList<Weighted<Edge<KBestArborescences>>> arrayList0 = new ArrayList<Weighted<Edge<KBestArborescences>>>();
        SparseWeightedGraph<KBestArborescences> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<KBestArborescences>>>) arrayList0);
        KBestArborescences kBestArborescences0 = new KBestArborescences();
        List<Weighted<Arborescence<KBestArborescences>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<KBestArborescences>) sparseWeightedGraph0, kBestArborescences0, 49);
        assertFalse(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void KBestArborescences_ESTest03()  throws Throwable  {
        Edge<Double> edge0 = (Edge<Double>) mock(Edge.class, new ViolatedAssumptionAnswer());
        ExclusiveEdge<Double> exclusiveEdge0 = ExclusiveEdge.of(edge0, 1708.23123);
        Arborescence<Double> arborescence0 = Arborescence.empty();
        // Undeclared exception!
        try {
            KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<Double>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.KBestArborescences", e);
        }
    }

    @Test(timeout = 4000)
    public void KBestArborescences_ESTest04()  throws Throwable  {
        LinkedHashSet<Edge<Node.ObserverRegistrationMode>> linkedHashSet0 = new LinkedHashSet<Edge<Node.ObserverRegistrationMode>>();
        Arborescence<Node.ObserverRegistrationMode> arborescence0 = Arborescence.empty();
        Weighted<Arborescence<Node.ObserverRegistrationMode>> weighted0 = new Weighted<Arborescence<Node.ObserverRegistrationMode>>(arborescence0, 0.5);
        // Undeclared exception!
        try {
            KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Node.ObserverRegistrationMode>) null, (Set<Edge<Node.ObserverRegistrationMode>>) linkedHashSet0, (Set<Edge<Node.ObserverRegistrationMode>>) linkedHashSet0, weighted0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.KBestArborescences", e);
        }
    }

    @Test(timeout = 4000)
    public void KBestArborescences_ESTest05()  throws Throwable  {
        Class<ConstructorDeclaration> class0 = ConstructorDeclaration.class;
        ServiceLoader<ConstructorDeclaration> serviceLoader0 = ServiceLoader.load(class0, (ClassLoader) null);
        double[][] doubleArray0 = new double[0][5];
        DenseWeightedGraph<ConstructorDeclaration> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<ConstructorDeclaration>) serviceLoader0, doubleArray0);
        HashSet<Edge<ConstructorDeclaration>> hashSet0 = new HashSet<Edge<ConstructorDeclaration>>();
        Arborescence<ConstructorDeclaration> arborescence0 = Arborescence.empty();
        Edge<ConstructorDeclaration> edge0 = (Edge<ConstructorDeclaration>) mock(Edge.class, new ViolatedAssumptionAnswer());
        ExclusiveEdge<ConstructorDeclaration> exclusiveEdge0 = ExclusiveEdge.of(edge0, 214.2341);
        hashSet0.add(exclusiveEdge0.edge);
        Weighted<Arborescence<ConstructorDeclaration>> weighted0 = new Weighted<Arborescence<ConstructorDeclaration>>(arborescence0, 1503.76275579);
        // Undeclared exception!
        try {
            KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<ConstructorDeclaration>) denseWeightedGraph0, (Set<Edge<ConstructorDeclaration>>) hashSet0, (Set<Edge<ConstructorDeclaration>>) hashSet0, weighted0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // null key in entry: null=null
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void KBestArborescences_ESTest06()  throws Throwable  {
        double[][] doubleArray0 = new double[1][6];
        double[] doubleArray1 = new double[0];
        doubleArray0[0] = doubleArray1;
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        HashSet<Edge<Integer>> hashSet0 = new HashSet<Edge<Integer>>();
        Arborescence<Integer> arborescence0 = Arborescence.empty();
        Weighted<Arborescence<Integer>> weighted0 = new Weighted<Arborescence<Integer>>(arborescence0, (-2403.6));
        // Undeclared exception!
        try {
            KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Integer>) denseWeightedGraph0, (Set<Edge<Integer>>) hashSet0, (Set<Edge<Integer>>) hashSet0, weighted0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch(ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
            verifyException("net.mooctest.DenseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void KBestArborescences_ESTest07()  throws Throwable  {
        // Undeclared exception!
        try {
            KBestArborescences.getKBestArborescences((WeightedGraph<Comparable<Edge<Object>>>) null, (Comparable<Edge<Object>>) null, 4294);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.KBestArborescences", e);
        }
    }

    @Test(timeout = 4000)
    public void KBestArborescences_ESTest08()  throws Throwable  {
        double[][] doubleArray0 = new double[3][4];
        double[] doubleArray1 = new double[1];
        doubleArray0[0] = doubleArray1;
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        // Undeclared exception!
        try {
            KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, (Integer) null, 0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch(ArrayIndexOutOfBoundsException e) {
            //
            // 1
            //
            verifyException("net.mooctest.DenseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void KBestArborescences_ESTest09()  throws Throwable  {
        Edge<String> edge0 = (Edge<String>) mock(Edge.class, new ViolatedAssumptionAnswer());
        ExclusiveEdge<String> exclusiveEdge0 = ExclusiveEdge.of(edge0, Double.POSITIVE_INFINITY);
        Arborescence<String> arborescence0 = Arborescence.empty();
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedHashSet0);
        EdgeQueueMap.EdgeQueue<String> edgeQueueMap_EdgeQueue0 = EdgeQueueMap.EdgeQueue.create("Y6(4JU]qhx/(", partition0);
        com.google.common.base.Optional<ExclusiveEdge<String>> optional0 = KBestArborescences.seek(exclusiveEdge0, arborescence0, (EdgeQueueMap.EdgeQueue<String>) edgeQueueMap_EdgeQueue0);
        assertNotNull(optional0);
    }

    @Test(timeout = 4000)
    public void KBestArborescences_ESTest10()  throws Throwable  {
        Node.ObserverRegistrationMode node_ObserverRegistrationMode0 = Node.ObserverRegistrationMode.SELF_PROPAGATING;
        Node.ObserverRegistrationMode[] node_ObserverRegistrationModeArray0 = new Node.ObserverRegistrationMode[3];
        node_ObserverRegistrationModeArray0[0] = node_ObserverRegistrationMode0;
        node_ObserverRegistrationModeArray0[1] = node_ObserverRegistrationMode0;
        node_ObserverRegistrationModeArray0[2] = node_ObserverRegistrationMode0;
        EnumSet<Node.ObserverRegistrationMode> enumSet0 = EnumSet.of(node_ObserverRegistrationMode0, node_ObserverRegistrationModeArray0);
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        PriorityQueue<Weighted<Edge<Node.ObserverRegistrationMode>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<Node.ObserverRegistrationMode>>>(comparator0);
        SparseWeightedGraph<Node.ObserverRegistrationMode> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Node.ObserverRegistrationMode>) enumSet0, (Iterable<Weighted<Edge<Node.ObserverRegistrationMode>>>) priorityQueue0);
        LinkedHashSet<Edge<Node.ObserverRegistrationMode>> linkedHashSet0 = new LinkedHashSet<Edge<Node.ObserverRegistrationMode>>();
        Arborescence<Node.ObserverRegistrationMode> arborescence0 = Arborescence.empty();
        Weighted<Arborescence<Node.ObserverRegistrationMode>> weighted0 = new Weighted<Arborescence<Node.ObserverRegistrationMode>>(arborescence0, (-7.529865132971587));
        Optional<Weighted<KBestArborescences.SubsetOfSolutions<Node.ObserverRegistrationMode>>> optional0 = KBestArborescences.scoreSubsetOfSolutions((WeightedGraph<Node.ObserverRegistrationMode>) sparseWeightedGraph0, (Set<Edge<Node.ObserverRegistrationMode>>) linkedHashSet0, (Set<Edge<Node.ObserverRegistrationMode>>) linkedHashSet0, weighted0);
        assertNotNull(optional0);
    }

    @Test(timeout = 4000)
    public void KBestArborescences_ESTest11()  throws Throwable  {
        HashSet<Weighted<Edge<Comparable<Node.ObserverRegistrationMode>>>> hashSet0 = new HashSet<Weighted<Edge<Comparable<Node.ObserverRegistrationMode>>>>(1865, 1865);
        SparseWeightedGraph<Comparable<Node.ObserverRegistrationMode>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<Comparable<Node.ObserverRegistrationMode>>>>) hashSet0);
        Node.ObserverRegistrationMode node_ObserverRegistrationMode0 = Node.ObserverRegistrationMode.THIS_NODE_AND_EXISTING_DESCENDANTS;
        List<Weighted<Arborescence<Comparable<Node.ObserverRegistrationMode>>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<Comparable<Node.ObserverRegistrationMode>>) sparseWeightedGraph0, (Comparable<Node.ObserverRegistrationMode>) node_ObserverRegistrationMode0, (-1593));
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void KBestArborescences_ESTest12()  throws Throwable  {
        PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>(716);
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        PriorityQueue<Weighted<Edge<String>>> priorityQueue1 = new PriorityQueue<Weighted<Edge<String>>>(comparator0);
        SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) priorityQueue0, (Iterable<Weighted<Edge<String>>>) priorityQueue1);
        List<Weighted<Arborescence<String>>> list0 = KBestArborescences.getKBestArborescences((WeightedGraph<String>) sparseWeightedGraph0, (String) null, 2);
        assertEquals(1, list0.size());
    }
    @Test(timeout = 4000)
    public void Pair_ESTest0()  throws Throwable  {
        Integer integer0 = new Integer(0);
        Pair<Object, String> pair0 = new Pair<Object, String>(integer0, "");
        Pair<Integer, Object> pair1 = Pair.of(integer0, (Object) pair0);
        boolean boolean0 = pair1.equals(integer0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void Pair_ESTest1()  throws Throwable  {
        Integer integer0 = new Integer((-244));
        Pair<Object, String> pair0 = new Pair<Object, String>(integer0, "");
        Pair<String, Object> pair1 = Pair.of("", (Object) pair0);
        Pair<Object, Object> pair2 = Pair.of((Object) integer0, (Object) pair1);
        Pair pair3 = (Pair)pair2.second;
        boolean boolean0 = pair1.equals(pair3);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void Pair_ESTest2()  throws Throwable  {
        Integer integer0 = new Integer((-244));
        Pair<Object, String> pair0 = new Pair<Object, String>(integer0, "");
        Pair<String, Object> pair1 = Pair.of("", (Object) pair0);
        Pair<Integer, Object> pair2 = Pair.of(integer0, (Object) pair0);
        Pair<Pair<Integer, Object>, String> pair3 = new Pair<Pair<Integer, Object>, String>(pair2, "");
        boolean boolean0 = pair3.equals(pair1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void Pair_ESTest3()  throws Throwable  {
        Integer integer0 = new Integer((-244));
        Pair<Object, String> pair0 = new Pair<Object, String>(integer0, "");
        Pair<String, Object> pair1 = Pair.of("", (Object) pair0);
        Pair<Object, Object> pair2 = Pair.of((Object) integer0, (Object) pair1);
        boolean boolean0 = pair2.equals(pair0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void Pair_ESTest4()  throws Throwable  {
        Integer integer0 = new Integer((-244));
        Pair<Object, String> pair0 = new Pair<Object, String>(integer0, "");
        Pair<String, Object> pair1 = Pair.of("", (Object) pair0);
        pair1.hashCode();
    }

    @Test(timeout = 4000)
    public void Pair_ESTest5()  throws Throwable  {
        Integer integer0 = new Integer((-244));
        Pair<Object, String> pair0 = new Pair<Object, String>(integer0, "");
        String string0 = pair0.toString();
        assertEquals("Pair{first=-244, second=}", string0);
    }
    @Test(timeout = 4000)
    public void Partition_ESTest00()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("~G,8B^)5v8'rH_E");
        linkedList0.add("net.moocet.Partitz");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        String string0 = partition0.merge("net.moocet.Partitz", "~G,8B^)5v8'rH_E");
        assertEquals("net.moocet.Partitz", string0);

        String string1 = partition0.merge("~G,8B^)5v8'rH_E", "~G,8B^)5v8'rH_E");
        assertEquals("net.moocet.Partitz", string1);
    }

    @Test(timeout = 4000)
    public void Partition_ESTest01()  throws Throwable  {
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        linkedList0.add((Object) linkedList0);
        // Undeclared exception!
        try {
            Partition.singletons((Collection<Object>) linkedList0);
            fail("Expecting exception: StackOverflowError");

        } catch(StackOverflowError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void Partition_ESTest02()  throws Throwable  {
        // Undeclared exception!
        try {
            Partition.singletons((Collection<Object>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.Partition", e);
        }
    }

    @Test(timeout = 4000)
    public void Partition_ESTest03()  throws Throwable  {
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        Partition<Object> partition0 = Partition.singletons((Collection<Object>) linkedList0);
        // Undeclared exception!
        try {
            partition0.sameComponent(linkedList0, linkedList0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.Partition", e);
        }
    }

    @Test(timeout = 4000)
    public void Partition_ESTest04()  throws Throwable  {
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        Integer integer0 = new Integer((-143));
        Partition<Integer> partition0 = Partition.singletons((Collection<Integer>) linkedList0);
        // Undeclared exception!
        try {
            partition0.merge((Integer) null, integer0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.Partition", e);
        }
    }

    @Test(timeout = 4000)
    public void Partition_ESTest05()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        // Undeclared exception!
        try {
            partition0.componentOf("8:+t_9Q1+Jq{R?V\"");
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.Partition", e);
        }
    }

    @Test(timeout = 4000)
    public void Partition_ESTest06()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("~G,8B^)5v8'rH_E");
        linkedList0.add("net.moocet.Partitz");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        String string0 = partition0.merge("net.moocet.Partitz", "~G,8B^)5v8'rH_E");
        assertEquals("net.moocet.Partitz", string0);

        String string1 = partition0.componentOf("~G,8B^)5v8'rH_E");
        assertEquals("net.moocet.Partitz", string1);
    }

    @Test(timeout = 4000)
    public void Partition_ESTest07()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        String string0 = partition0.componentOf("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void Partition_ESTest08()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("nGt.mocet.Paitz");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        boolean boolean0 = partition0.sameComponent("nGt.mocet.Paitz", "nGt.mocet.Paitz");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void Partition_ESTest09()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("j5!");
        linkedList0.add("nGt.mocet.Paitz");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        boolean boolean0 = partition0.sameComponent("nGt.mocet.Paitz", "j5!");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void Partition_ESTest10()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("j5!");
        linkedList0.add("nGt.mocet.Paitz");
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        String string0 = partition0.merge("nGt.mocet.Paitz", "j5!");
        assertEquals("nGt.mocet.Paitz", string0);

        String string1 = partition0.merge("j5!", "nGt.mocet.Paitz");
        assertEquals("nGt.mocet.Paitz", string1);
    }

    @Test(timeout = 4000)
    public void Partition_ESTest11()  throws Throwable  {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        Partition<String> partition0 = Partition.singletons((Collection<String>) linkedList0);
        Set<String> set0 = partition0.getNodes();
        assertEquals(0, set0.size());
    }
    @Test(timeout = 4000)
    public void SparseWeightedGraph_ESTest0()  throws Throwable  {
        ArrayList<LocalClassDeclarationStmt> arrayList0 = new ArrayList<LocalClassDeclarationStmt>();
        // Undeclared exception!
        try {
            SparseWeightedGraph.from((Iterable<LocalClassDeclarationStmt>) arrayList0, (Iterable<Weighted<Edge<LocalClassDeclarationStmt>>>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.SparseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void SparseWeightedGraph_ESTest1()  throws Throwable  {
        LocalClassDeclarationStmt[] localClassDeclarationStmtArray0 = new LocalClassDeclarationStmt[0];
        NodeList<LocalClassDeclarationStmt> nodeList0 = new NodeList<LocalClassDeclarationStmt>(localClassDeclarationStmtArray0);
        nodeList0.add((LocalClassDeclarationStmt) null);
        PriorityQueue<Weighted<Edge<LocalClassDeclarationStmt>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<LocalClassDeclarationStmt>>>();
        // Undeclared exception!
        try {
            SparseWeightedGraph.from((Iterable<LocalClassDeclarationStmt>) nodeList0, (Iterable<Weighted<Edge<LocalClassDeclarationStmt>>>) priorityQueue0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void SparseWeightedGraph_ESTest2()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(comparator0).compare(any() , any());
        TreeSet<Weighted<Edge<Object>>> treeSet0 = new TreeSet<Weighted<Edge<Object>>>(comparator0);
        Edge<Object> edge0 = new Edge<Object>(treeSet0, treeSet0);
        Weighted<Edge<Object>> weighted0 = new Weighted<Edge<Object>>(edge0, (-1.0));
        treeSet0.add(weighted0);
        // Undeclared exception!
        try {
            SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) treeSet0);
            fail("Expecting exception: StackOverflowError");

        } catch(StackOverflowError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void SparseWeightedGraph_ESTest3()  throws Throwable  {
        // Undeclared exception!
        try {
            SparseWeightedGraph.from((Iterable<Weighted<Edge<Object>>>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.SparseWeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void SparseWeightedGraph_ESTest4()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(comparator0).compare(any() , any());
        TreeSet<Weighted<Edge<String>>> treeSet0 = new TreeSet<Weighted<Edge<String>>>(comparator0);
        Edge<String> edge0 = new Edge<String>((String) null, (String) null);
        Weighted<Edge<String>> weighted0 = new Weighted<Edge<String>>(edge0, 2611.20319);
        treeSet0.add(weighted0);
        // Undeclared exception!
        try {
            SparseWeightedGraph.from((Iterable<Weighted<Edge<String>>>) treeSet0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void SparseWeightedGraph_ESTest5()  throws Throwable  {
        Class<LocalClassDeclarationStmt> class0 = LocalClassDeclarationStmt.class;
        ServiceLoader<LocalClassDeclarationStmt> serviceLoader0 = ServiceLoader.load(class0);
        LinkedHashSet<Weighted<Edge<LocalClassDeclarationStmt>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<LocalClassDeclarationStmt>>>(665);
        ClassOrInterfaceDeclaration classOrInterfaceDeclaration0 = new ClassOrInterfaceDeclaration();
        LocalClassDeclarationStmt localClassDeclarationStmt0 = new LocalClassDeclarationStmt(classOrInterfaceDeclaration0);
        Edge<LocalClassDeclarationStmt> edge0 = new Edge<LocalClassDeclarationStmt>(localClassDeclarationStmt0, localClassDeclarationStmt0);
        Weighted<Edge<LocalClassDeclarationStmt>> weighted0 = Weighted.weighted(edge0, 0.0);
        linkedHashSet0.add(weighted0);
        Weighted<Edge<LocalClassDeclarationStmt>> weighted1 = Weighted.weighted(edge0, (double) 665);
        linkedHashSet0.add(weighted1);
        SparseWeightedGraph<LocalClassDeclarationStmt> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<LocalClassDeclarationStmt>) serviceLoader0, (Iterable<Weighted<Edge<LocalClassDeclarationStmt>>>) linkedHashSet0);
        assertNotNull(sparseWeightedGraph0);
    }

    @Test(timeout = 4000)
    public void SparseWeightedGraph_ESTest6()  throws Throwable  {
        Stack<Weighted<Edge<HashMap<String, Object>>>> stack0 = new Stack<Weighted<Edge<HashMap<String, Object>>>>();
        SparseWeightedGraph<HashMap<String, Object>> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<HashMap<String, Object>>>>) stack0);
        Collection<Weighted<Edge<HashMap<String, Object>>>> collection0 = sparseWeightedGraph0.getIncomingEdges((HashMap<String, Object>) null);
        assertNotNull(collection0);
    }

    @Test(timeout = 4000)
    public void SparseWeightedGraph_ESTest7()  throws Throwable  {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        ArrayList<Weighted<Edge<String>>> arrayList0 = new ArrayList<Weighted<Edge<String>>>();
        SparseWeightedGraph<String> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<String>) linkedHashSet0, (Iterable<Weighted<Edge<String>>>) arrayList0);
        double double0 = sparseWeightedGraph0.getWeightOf("", "");
        assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void SparseWeightedGraph_ESTest8()  throws Throwable  {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        PriorityQueue<Weighted<Edge<MethodDeclaration>>> priorityQueue0 = new PriorityQueue<Weighted<Edge<MethodDeclaration>>>(comparator0);
        SparseWeightedGraph<MethodDeclaration> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<MethodDeclaration>>>) priorityQueue0);
        Collection<MethodDeclaration> collection0 = sparseWeightedGraph0.getNodes();
        assertNotNull(collection0);
    }
    @Test(timeout = 4000)
    public void Weighted_ESTest00()  throws Throwable  {
        Object object0 = new Object();
        Weighted<Object> weighted0 = new Weighted<Object>(object0, (-691.8474));
        Weighted<Object> weighted1 = new Weighted<Object>(object0, (-256.2848512497711));
        int int0 = weighted0.compareTo(weighted1);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void Weighted_ESTest01()  throws Throwable  {
        Weighted<String> weighted0 = new Weighted<String>("", 286.0);
        Weighted<String> weighted1 = Weighted.weighted("", (-3298.222255118226));
        int int0 = weighted0.compareTo(weighted1);
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void Weighted_ESTest02()  throws Throwable  {
        // Undeclared exception!
        try {
            Weighted.weighted((Integer) null, (-4654.0));
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void Weighted_ESTest03()  throws Throwable  {
        Weighted<Object> weighted0 = Weighted.weighted((Object) "", 1425.08);
        // Undeclared exception!
        try {
            weighted0.compareTo((Weighted<Object>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.Weighted", e);
        }
    }

    @Test(timeout = 4000)
    public void Weighted_ESTest04()  throws Throwable  {
        Weighted<Object> weighted0 = null;
        try {
            weighted0 = new Weighted<Object>((Object) null, (-2122.622));
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void Weighted_ESTest05()  throws Throwable  {
        Integer integer0 = new Integer(0);
        Weighted<Integer> weighted0 = Weighted.weighted(integer0, (double) 0);
        boolean boolean0 = weighted0.equals(integer0);
        assertFalse(boolean0);
        assertEquals(0.0, weighted0.weight, 0.01);
    }

    @Test(timeout = 4000)
    public void Weighted_ESTest06()  throws Throwable  {
        Integer integer0 = new Integer((-1615));
        Weighted<Object> weighted0 = new Weighted<Object>(integer0, (-1615));
        weighted0.hashCode();
        assertEquals((-1615.0), weighted0.weight, 0.01);
    }

    @Test(timeout = 4000)
    public void Weighted_ESTest07()  throws Throwable  {
        Integer integer0 = new Integer((-29));
        Weighted<Object> weighted0 = Weighted.weighted((Object) integer0, (double) (-29));
        Weighted<Object> weighted1 = Weighted.weighted((Object) integer0, 15.60331816460262);
        boolean boolean0 = weighted0.equals(weighted1);
        assertEquals(15.60331816460262, weighted1.weight, 0.01);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void Weighted_ESTest08()  throws Throwable  {
        Integer integer0 = new Integer((-29));
        Weighted<Object> weighted0 = Weighted.weighted((Object) integer0, (double) (-29));
        Weighted<Weighted<Object>> weighted1 = new Weighted<Weighted<Object>>(weighted0, 15.60331816460262);
        boolean boolean0 = weighted1.equals(weighted0);
        assertEquals((-29.0), weighted0.weight, 0.01);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void Weighted_ESTest09()  throws Throwable  {
        Integer integer0 = new Integer((-29));
        Weighted<Integer> weighted0 = new Weighted<Integer>(integer0, (-29));
        Weighted<Object> weighted1 = Weighted.weighted((Object) integer0, (double) (-29));
        boolean boolean0 = weighted1.equals(weighted0);
        assertEquals((-29.0), weighted0.weight, 0.01);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void Weighted_ESTest10()  throws Throwable  {
        Integer integer0 = new Integer((-29));
        Weighted<Object> weighted0 = Weighted.weighted((Object) integer0, (double) (-29));
        String string0 = weighted0.toString();
        assertEquals("Weighted{val=-29, weight=-29.0}", string0);
    }

    @Test(timeout = 4000)
    public void Weighted_ESTest11()  throws Throwable  {
        Integer integer0 = new Integer((-29));
        Weighted<Object> weighted0 = Weighted.weighted((Object) integer0, (double) (-29));
        Weighted<Weighted<Object>> weighted1 = new Weighted<Weighted<Object>>(weighted0, 15.60331816460262);
        int int0 = weighted1.compareTo(weighted1);
        assertEquals((-29.0), weighted0.weight, 0.01);
        assertEquals(0, int0);
    }


    @Test(timeout = 4000)
    public void WeightedGraph_ESTest1()  throws Throwable  {
        HashSet<Edge<Object>> hashSet0 = new HashSet<Edge<Object>>(0);
        Vector<Object> vector0 = new Vector<Object>(hashSet0);
        double[][] doubleArray0 = new double[0][7];
        DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) vector0, doubleArray0);
        Collection<Object> collection0 = denseWeightedGraph0.getNodes();
        assertFalse(collection0.contains(0));
    }

    @Test(timeout = 4000)
    public void WeightedGraph_ESTest2()  throws Throwable  {
        LinkedHashSet<Weighted<Edge<ConstructorDeclaration>>> linkedHashSet0 = new LinkedHashSet<Weighted<Edge<ConstructorDeclaration>>>(0);
        SparseWeightedGraph<ConstructorDeclaration> sparseWeightedGraph0 = SparseWeightedGraph.from((Iterable<Weighted<Edge<ConstructorDeclaration>>>) linkedHashSet0);
        Collection<Weighted<Edge<ConstructorDeclaration>>> collection0 = sparseWeightedGraph0.getIncomingEdges((ConstructorDeclaration) null);
        assertNotNull(collection0);
    }

    @Test(timeout = 4000)
    public void WeightedGraph_ESTest3()  throws Throwable  {
        Stack<Object> stack0 = new Stack<Object>();
        double[][] doubleArray0 = new double[1][7];
        UnaryExpr.Operator unaryExpr_Operator0 = UnaryExpr.Operator.PREFIX_DECREMENT;
        stack0.add((Object) unaryExpr_Operator0);
        DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) stack0, doubleArray0);
        // Undeclared exception!
        try {
            denseWeightedGraph0.filterEdges((Predicate<Edge<Object>>) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("net.mooctest.WeightedGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void WeightedGraph_ESTest4()  throws Throwable  {
        Stack<Object> stack0 = new Stack<Object>();
        double[][] doubleArray0 = new double[0][7];
        DenseWeightedGraph<Object> denseWeightedGraph0 = DenseWeightedGraph.from((Iterable<Object>) stack0, doubleArray0);
        WeightedGraph<Object> weightedGraph0 = denseWeightedGraph0.filterEdges((Predicate<Edge<Object>>) null);
        assertNotNull(weightedGraph0);
    }
    final static double DELTA = 0.001;
    final static double NINF = Double.NEGATIVE_INFINITY;
    final static WeightedGraph<Integer> graph = SparseWeightedGraph.from(ImmutableList.of(
            Weighted.weighted(Edge.from(0).to(1), 5),
            Weighted.weighted(Edge.from(0).to(2), 1),
            Weighted.weighted(Edge.from(0).to(3), 1),
            Weighted.weighted(Edge.from(1).to(2), 11),
            Weighted.weighted(Edge.from(1).to(3), 4),
            Weighted.weighted(Edge.from(2).to(1), 10),
            Weighted.weighted(Edge.from(2).to(3), 5),
            Weighted.weighted(Edge.from(3).to(1), 9),
            Weighted.weighted(Edge.from(3).to(2), 8)
    ));

    static <V> void assertEdgesSumToScore(WeightedGraph<V> originalEdgeWeights, Weighted<Arborescence<V>> bestTree) {
        final Map<V, V> parentsMap = bestTree.val.parents;
        double sumOfWeights = 0.0;
        for (V dest : parentsMap.keySet()) {
            final V source = parentsMap.get(dest);
            sumOfWeights += originalEdgeWeights.getWeightOf(source, dest);
        }
        assertEquals(sumOfWeights, bestTree.weight, DELTA);
    }

    @Test
    public void testGetMaxSpanningTree() {
		/*
		root    10
		(0) -------> (1) \
		 |  \       /  ^  \
		 |   \30   |   |20 \
		 |10  \    |10 |    \10
		 |     \   |  /      \
		 V  15  V  V /   20   V
		(3)<----- (2) -----> (4)
		  \-------^
		     40
		 */
        double[][] weights = {
                {NINF, 10, 30, 10, NINF},
                {NINF, NINF, 10, NINF, 10 },
                {NINF,  20, NINF,  7, 20 },
                {NINF, NINF, 40, NINF, NINF},
                {NINF, NINF, NINF, NINF, NINF},
        };
        final DenseWeightedGraph<Integer> graph = DenseWeightedGraph.from(weights);
        final Weighted<Arborescence<Integer>> weightedSpanningTree = ChuLiuEdmonds.getMaxArborescence(graph, 0);
        assertTrue(weightedSpanningTree.equals(weightedSpanningTree));
        final Weighted<Arborescence<Integer>> weightedSpanningTree1 = ChuLiuEdmonds.getMaxArborescence(graph, 0);
        assertTrue(weightedSpanningTree.equals(weightedSpanningTree1));
		/*
		root
		(0)           (1)
		 |             ^
		 |             |
		 |             |
		 |            /
		 V           /
		(3)       (2) ------> (4)
		  \-------^
		 */
        final Map<Integer, Integer> maxBranching = weightedSpanningTree.val.parents;
        assertEquals(2, maxBranching.get(1).intValue());
        assertEquals(3, maxBranching.get(2).intValue());
        assertEquals(0, maxBranching.get(3).intValue());
        assertEquals(2, maxBranching.get(4).intValue());
        assertEquals(90.0, weightedSpanningTree.weight, DELTA);
        assertEdgesSumToScore(graph, weightedSpanningTree);
    }

    @Test
    public void testRequiredAndBannedEdges() {
        final Weighted<Arborescence<Integer>> weightedSpanningTree = ChuLiuEdmonds.getMaxArborescence(
                graph,
                ImmutableSet.of(Edge.from(0).to(1)),
                ImmutableSet.of(Edge.from(2).to(3)));
        final Map<Integer, Integer> maxBranching = weightedSpanningTree.val.parents;
        assertEquals(0, maxBranching.get(1).intValue());
        assertEquals(1, maxBranching.get(2).intValue());
        assertEquals(1, maxBranching.get(3).intValue());
        assertEquals(20.0, weightedSpanningTree.weight, DELTA);
        assertEdgesSumToScore(graph, weightedSpanningTree);

    }

    @Test
    public void testRequiredAndBannedEdges2() {
        final Weighted<Arborescence<Integer>> weightedSpanningTree = ChuLiuEdmonds.getMaxArborescence(
                graph,
                ImmutableSet.of(Edge.from(0).to(3), Edge.from(3).to(1)),
                ImmutableSet.of(Edge.from(1).to(2))
        );
        final Map<Integer, Integer> maxBranching = weightedSpanningTree.val.parents;
        assertEquals(3, maxBranching.get(1).intValue());
        assertEquals(3, maxBranching.get(2).intValue());
        assertEquals(0, maxBranching.get(3).intValue());
        assertEquals(18.0, weightedSpanningTree.weight, DELTA);
        assertEdgesSumToScore(graph, weightedSpanningTree);

    }

    @Test
    public void testElevenNodeGraph() {
        // make a graph with a bunch of nested cycles so we can exercise the recursive part of the algorithm.
        final WeightedGraph<Integer> graph = SparseWeightedGraph.from(ImmutableList.of(
                Weighted.weighted(Edge.from(0).to(8), 0),
                Weighted.weighted(Edge.from(1).to(2), 10),
                Weighted.weighted(Edge.from(1).to(4), 5),
                Weighted.weighted(Edge.from(2).to(3), 9),
                Weighted.weighted(Edge.from(3).to(1), 8),
                Weighted.weighted(Edge.from(4).to(5), 9),
                Weighted.weighted(Edge.from(5).to(6), 10),
                Weighted.weighted(Edge.from(6).to(4), 8),
                Weighted.weighted(Edge.from(6).to(7), 5),
                Weighted.weighted(Edge.from(7).to(8), 10),
                Weighted.weighted(Edge.from(8).to(2), 5),
                Weighted.weighted(Edge.from(8).to(9), 8),
                Weighted.weighted(Edge.from(8).to(10), 1),
                Weighted.weighted(Edge.from(9).to(7), 9),
                Weighted.weighted(Edge.from(10).to(3), 3)
        ));
        final Weighted<Arborescence<Integer>> weightedSpanningTree = ChuLiuEdmonds.getMaxArborescence(graph, 0);

        final Map<Integer, Integer> maxBranching = weightedSpanningTree.val.parents;
        assertEdgesSumToScore(graph, weightedSpanningTree);
        assertEquals(3, maxBranching.get(1).intValue());
        assertEquals(8, maxBranching.get(2).intValue());
        assertEquals(2, maxBranching.get(3).intValue());
        assertEquals(1, maxBranching.get(4).intValue());
        assertEquals(4, maxBranching.get(5).intValue());
        assertEquals(5, maxBranching.get(6).intValue());
        assertEquals(9, maxBranching.get(7).intValue());
        assertEquals(0, maxBranching.get(8).intValue());
        assertEquals(8, maxBranching.get(9).intValue());
        assertEquals(8, maxBranching.get(10).intValue());
    }


    @Test
    public void testDecreasePriority() {
        // Inserts a set of elements, decreases some of their priorities, then
        // extracts them by key order and ensures everything comes out
        // in the order expected.
        final FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
        assertTrue(heap.isEmpty());
        assertEquals(0, heap.size());
        // keep references to entries as we add them so we can decreasePriority and remove
        final Map<Integer, FibonacciHeap<Integer,Integer>.Entry> entries = Maps.newHashMap();
        for (int i = 100; i < 200; i++) {
            entries.put(i, heap.add(i, i).get());
        }
        assertFalse(heap.isEmpty());
        assertEquals(100, heap.size());
        try{
            heap.decreasePriority(entries.get(110), 200);
            fail();
        }catch (Exception e){
            assertEquals("Cannot increase priority", e.getMessage());
        }
        heap.decreasePriority(entries.get(110), 50);
        heap.decreasePriority(entries.get(140), 25);
        heap.decreasePriority(entries.get(160), 15);
        // Last one should be the min value.
        assertEquals(heap.peekOption().get(), entries.get(160));
        assertEquals(160, heap.pollOption().get().intValue());
        // Second last should now be the min value.
        assertEquals(heap.peekOption().get(), entries.get(140));
        heap.remove(entries.get(140));
        // Remove the third smallest entry.
        heap.remove(entries.get(110));
        // Original min value should now be the min.
        assertEquals(heap.peekOption().get(), entries.get(100));
        assertEquals(97, heap.size());
        heap.remove(entries.get(100));
        heap.clear();
        assertTrue(heap.isEmpty());
        assertEquals(0, heap.size());
    }

    @Test
    public void testDuplicates() {
        final FibonacciHeap<Integer,Double> heap = FibonacciHeap.create();
        assertTrue(heap.isEmpty());
        assertEquals(0, heap.size());
        // Insert entries with duplicate priorities.
        final double priority = Double.MIN_NORMAL;
        for (int i = 1; i < 1001; i++) {
            heap.add(i, priority);
        }
        assertFalse(heap.isEmpty());
        assertEquals(1000, heap.size());
        heap.pollOption();
        assertFalse(heap.isEmpty());
        assertEquals(999, heap.size());
        heap.clear();
        assertTrue(heap.isEmpty());
        assertEquals(0, heap.size());
    }

    @Test
    public void testDuplicatesLarger() {
        // Test a heap consisting of all duplicate priorities, except for one
        // whose value is greater than the others.
        final FibonacciHeap<Integer,Double> heap = FibonacciHeap.create();
        assertTrue(heap.isEmpty());
        assertEquals(0, heap.size());
        // Insert entries with duplicate priorities.
        final double priority = 0.0;
        for (int i = 1; i < 1000; i++) {
            heap.add(i, priority);
        }
        heap.add(1001, Double.MIN_NORMAL);
        assertFalse(heap.isEmpty());
        assertEquals(1000, heap.size());
        assertTrue(heap.pollOption().get() < 1001);
        assertFalse(heap.isEmpty());
        assertEquals(999, heap.size());
        heap.clear();
        assertTrue(heap.isEmpty());
        assertEquals(0, heap.size());
    }

    @Test
    public void testDuplicatesSmaller() {
        // Test a heap consisting of all duplicate priorities, except for one
        // whose value is less than the others.
        final FibonacciHeap<Integer,Double> heap = FibonacciHeap.create();
        assertTrue(heap.isEmpty());
        assertEquals(0, heap.size());
        // Insert entries with duplicate priorities.
        final double priority = Double.MIN_NORMAL;
        for (int i = 1; i < 1000; i++) {
            heap.add(i, priority);
        }
        heap.add(1001, 0.0);
        assertFalse(heap.isEmpty());
        assertEquals(1000, heap.size());
        assertEquals(1001, heap.pollOption().get().intValue());
        assertFalse(heap.isEmpty());
        assertEquals(999, heap.size());
        heap.clear();
        assertTrue(heap.isEmpty());
        assertEquals(0, heap.size());
    }

    @Test
    public void testUnion() {
        final FibonacciHeap<Integer,Integer> heap1 = FibonacciHeap.create();
        assertTrue(heap1.isEmpty());
        assertEquals(0, heap1.size());
        heap1.add(1, 1);
        heap1.add(2, 2);
        heap1.add(3, 3);
        heap1.add(4, 4);
        heap1.add(5, 5);
        assertFalse(heap1.isEmpty());
        assertEquals(5, heap1.size());
        final FibonacciHeap<Integer,Integer> heap2 = FibonacciHeap.create();
        assertTrue(heap2.isEmpty());
        assertEquals(0, heap2.size());
        heap2.add(6, 6);
        heap2.add(7, 7);
        heap2.add(8, 8);
        heap2.add(9, 9);
        heap2.add(10, 10);
        assertFalse(heap2.isEmpty());
        assertEquals(5, heap2.size());
        final FibonacciHeap<Integer,Integer> joined = FibonacciHeap.merge(heap1, heap2);
        assertFalse(joined.isEmpty());
        assertEquals(10, joined.size());
        Optional<Integer> oVal = joined.pollOption();
        int i = 1;
        assertTrue(oVal.get() == i);
        while (!joined.isEmpty()) {
            oVal = joined.pollOption();
            assertTrue(oVal.get() > i);
            i = oVal.get();
        }
        assertTrue(joined.isEmpty());
        assertEquals(0, joined.size());
    }

    @Test
    public void testMinComparison() {
        // Test case contributed by Travis Wheeler which exposed a problem
        // when the min pointer had not been adjusted even though the start
        // pointer had been moved during consolidate.
        final double[] values = {
                0.0834, 0.01187, 0.10279, 0.09835, 0.09883,
                0.1001, 0.1129, 0.09599, 0.09468, 0.09063,
                0.09083, 0.08194, 0.10182, 0.09323, 0.08796,
                0.09972, 0.09429, 0.08069, 0.09008, 0.10346,
                0.10594, 0.09416, 0.06915, 0.08638, 0.0886,
                0.09538, 0.08546, 0.09271, 0.0936, 0.09941,
                0.08026, 0.0952, 0.09446, 0.09309, 0.09855,
                0.08682, 0.09464, 0.0857, 0.09154, 0.08024,
                0.08824, 0.09442, 0.09495, 0.08731, 0.08428,
                0.08959, 0.07994, 0.08034, 0.09095, 0.09659,
                0.10066, 0.0821, 0.09606, 0.12346, 0.07866,
                0.07723, 0.08642, 0.08076, 0.07455, 0.07961,
                0.07364, 0.08911, 0.06946, 0.07509, 0.087,
                0.071, 0.08653, 0.07899, 0.09512, 0.09456,
                0.09161, 0.08412, 0.09649, 0.09994, 0.10151,
                0.09751, 0.1019, 0.10499, 0.0873, 0.1085,
                0.10189, 0.09987, 0.08912, 0.10606, 0.09552,
                0.08902, 0.09158, 0.08046, 0.10687, 0.0906,
                0.09937, 0.09737, 0.09825, 0.10234, 0.09926,
                0.09147, 0.09071, 0.09659, 0.09472, 0.09327,
                0.0949, 0.09316, 0.09393, 0.09328, 0.01187,
                0.00848, 0.02284, 0.03053, 0.08393, 0.08167,
                0.10191, 0.06527, 0.06613, 0.06863, 0.0652,
                0.06848, 0.06681, 0.07466, 0.06444, 0.05991,
                0.07031, 0.06612, 0.06873, 0.06598, 0.07283,
                0.06862, 0.06437, 0.06599, 0.07291, 0.06355,
                0.0685, 0.06599, 0.06593, 0.0869, 0.07364,
                0.08118, 0.07693, 0.06779, 0.06605, 0.07286,
                0.05655, 0.06352, 0.06105, 0.09177, 0.08312,
                0.0978, 0.07464, 0.07977, 0.06241, 0.07227,
                0.06255, 0.0675, 0.07953, 0.07806, 0.06702,
                0.08429, 0.08567, 0.0933, 0.087, 0.08809,
                0.07888, 0.06351, 0.08651, 0.08294, 0.07282,
                0.11102, 0.08711, 0.06192, 0.0652, 0.06957,
                0.06763, 0.07123, 0.0687, 0.06773, 0.06338,
                0.06694, 0.09871, 0.09221, 0.08962, 0.0879,
                0.09625, 0.09953, 0.09532, 0.09903, 0.0946,
                0.09406, 0.09704, 0.09877, 0.07257, 0.1001,
                0.09458, 0.10141, 0.10581, 0.09824, 0.10668,
                0.09835, 0.10816, 0.09667, 0.08962, 0.08486,
                0.08572, 0.08324, 0.08826, 0.08801, 0.09744,
                0.09916, 0.09996, 0.10054, 0.10761, 0.105,
                0.10604, 0.10161, 0.09155, 0.10162, 0.08549,
                0.10342, 0.09419, 0.11429, 0.09764, 0.09505,
                0.09394, 0.10411, 0.08792, 0.08887, 0.08648,
                0.07637, 0.08544, 0.08034, 0.12373, 0.12963,
                0.13817, 0.13904, 0.12648, 0.13207, 0.10788,
                0.09605, 0.12674, 0.08139, 0.08326, 0.08835,
                0.10922, 0.103, 0.12225, 0.09854, 0.09326,
                0.11181, 0.089, 0.12674, 0.11631, 0.0879,
                0.09866, 0.11393, 0.09839, 0.09738, 0.09922,
                0.1145, 0.09967, 0.1032, 0.11624, 0.10472,
                0.09999, 0.09762, 0.1075, 0.11558, 0.10482,
                0.10237, 0.10776, 0.08781, 0.08771, 0.09751,
                0.09025, 0.09201, 0.08731, 0.08537, 0.0887,
                0.0844, 0.0804, 0.08217, 0.10216, 0.07789,
                0.08693, 0.0833, 0.08542, 0.09729, 0.0937,
                0.09886, 0.092, 0.08392, 0.09668, 0.09444,
                0.09401, 0.08657, 0.09659, 0.08553, 0.0834,
                0.0846, 0.10167, 0.10447, 0.09838, 0.09545,
                0.09163, 0.10475, 0.09761, 0.09475, 0.09769,
                0.09873, 0.09033, 0.09202, 0.08637, 0.0914,
                0.09146, 0.09437, 0.08454, 0.09009, 0.08888,
                0.0811, 0.12672, 0.10517, 0.11959, 0.10941,
                0.10319, 0.10544, 0.10717, 0.11218, 0.12347,
                0.10637, 0.11558, 0.1198, 0.10133, 0.09795,
                0.10818, 0.11657, 0.10836, 0.11127, 0.09611,
                0.08462, 0.1056, 0.09537, 0.09815, 0.10385,
                0.10246, 0.11299, 0.11926, 0.104, 0.10309,
                0.09494, 0.10078, 0.09966, 0.08215, 0.09136,
                0.10058, 0.10078, 0.10121, 0.09711, 0.10072,
                0.10881, 0.09396, 0.09925, 0.09221, 0.0939,
                0.08804, 0.09234, 0.09647, 0.07966, 0.09939,
                0.09651, 0.10765, 0.10154, 0.07889, 0.10452,
                0.1023, 0.10275, 0.08817, 0.0923, 0.09237,
                0.09481, 0.09309, 0.08683, 0.09903, 0.08784,
                0.09309, 0.08876, 0.08442, 0.097, 0.10054,
                0.09463, 0.10038, 0.08208, 0.10209, 0.10181,
                0.10416, 0.08065, 0.09581, 0.08961, 0.08553,
                0.10272, 0.08432, 0.08437, 0.08946, 0.07594,
                0.07751, 0.07935, 0.07751, 0.07714, 0.09572,
                0.09626, 0.08606, 0.08031, 0.08196, 0.09758,
                0.0754, 0.08671, 0.10245, 0.07644, 0.07965,
                0.09553, 0.08362, 0.07587, 0.08234, 0.08611,
                0.09835, 0.09917, 0.09264, 0.09656, 0.0992,
                0.10802, 0.10905, 0.09726, 0.09911, 0.11056,
                0.08599, 0.09095, 0.10547, 0.08824, 0.09831,
                0.08445, 0.09562, 0.09378, 0.08482, 0.08686,
                0.09192, 0.09617, 0.09142, 0.1024, 0.10415,
                0.10673, 0.08337, 0.10091, 0.08162, 0.08284,
                0.08472, 0.1021, 0.09073, 0.10521, 0.09252,
                0.08545, 0.09849, 0.0891, 0.10849, 0.08897,
                0.08306, 0.10775, 0.10054, 0.09952, 0.10851,
                0.10823, 0.10827, 0.11254, 0.11344, 0.10478,
                0.11348, 0.10646, 0.12112, 0.10183, 0.1197,
                0.12399, 0.11847, 0.11572, 0.14614, 0.13348,
                0.12449, 0.12358, 0.12792, 0.12525, 0.12265,
                0.1305, 0.13037, 0.12684, 0.12374, 0.12907,
                0.12858, 0.1285, 0.12857, 0.15825, 0.15937,
                0.1467, 0.128305, 0.118165, 0.119619995, 0.117565,
                0.12769, 0.11013
        };
        final FibonacciHeap<Double,Double> heap = FibonacciHeap.create();
        for (double d : values) {
            heap.add(d, d);
        }
        Arrays.sort(values);
        int i = 0;
        while (!heap.isEmpty()) {
            assertEquals(values[i], heap.pollOption().get(), 0.0001);
            i++;
        }
    }

    @Test
    public void test_Final1() {
        final WeightedGraph<Integer> graph = SparseWeightedGraph.from(ImmutableList.of(
                Weighted.weighted(Edge.from(0).to(8), 0),
                Weighted.weighted(Edge.from(1).to(2), 10),
                Weighted.weighted(Edge.from(1).to(4), 5),
                Weighted.weighted(Edge.from(2).to(3), 9),
                Weighted.weighted(Edge.from(3).to(1), 8),
                Weighted.weighted(Edge.from(4).to(5), 9),
                Weighted.weighted(Edge.from(5).to(6), 10),
                Weighted.weighted(Edge.from(6).to(4), 8),
                Weighted.weighted(Edge.from(6).to(7), 5),
                Weighted.weighted(Edge.from(7).to(8), 10),
                Weighted.weighted(Edge.from(8).to(2), 5),
                Weighted.weighted(Edge.from(8).to(9), 8),
                Weighted.weighted(Edge.from(8).to(10), 1),
                Weighted.weighted(Edge.from(9).to(7), 9),
                Weighted.weighted(Edge.from(10).to(3), 3)
        ));
        final List<Weighted<Arborescence<Integer>>> weightedSpanningTree = KBestArborescences.getKBestArborescences(
                graph,
                0,
                10
        );
        assertFalse(weightedSpanningTree.isEmpty());
        assertEquals(6, weightedSpanningTree.size());
        for (int i = 0; i < 6; i++) {
            System.out.println(weightedSpanningTree.get(i));
        }
        String expect = "Weighted{val=Arborescence{0 -> 8, 1 -> 4, 8 -> 2, 8 -> 10, 8 -> 9, 9 -> 7, 5 -> 6, 4 -> 5, 2 -> 3, 3 -> 1}, weight=64.0}\n" +
                "Weighted{val=Arborescence{0 -> 8, 1 -> 4, 10 -> 3, 8 -> 10, 8 -> 9, 9 -> 7, 5 -> 6, 4 -> 5, 1 -> 2, 3 -> 1}, weight=63.0}\n" +
                "Weighted{val=Arborescence{0 -> 8, 1 -> 4, 8 -> 10, 8 -> 9, 6 -> 7, 5 -> 6, 4 -> 5, 2 -> 3, 8 -> 2, 3 -> 1}, weight=60.0}\n" +
                "Weighted{val=Arborescence{0 -> 8, 1 -> 4, 10 -> 3, 8 -> 10, 8 -> 9, 6 -> 7, 5 -> 6, 4 -> 5, 1 -> 2, 3 -> 1}, weight=59.0}\n" +
                "Weighted{val=Arborescence{0 -> 8, 1 -> 4, 8 -> 10, 8 -> 9, 9 -> 7, 5 -> 6, 4 -> 5, 10 -> 3, 8 -> 2, 3 -> 1}, weight=58.0}\n" +
                "Weighted{val=Arborescence{0 -> 8, 1 -> 4, 8 -> 10, 8 -> 9, 6 -> 7, 5 -> 6, 4 -> 5, 10 -> 3, 8 -> 2, 3 -> 1}, weight=54.0}\n";
        el(expect);


    }

    @Test
    public void test111() {
        final Map<Integer, FibonacciHeap<Integer,Integer>.Entry> entries = Maps.newHashMap();
        final FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
        for (int i = 100; i < 200; i++) {
            entries.put(i, heap.add(i, i).get());
        }
        for (int i = 150; i>100; i--) {
            heap.remove(entries.get(i));
        }  

    }
}
