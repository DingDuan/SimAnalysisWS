package net.mooctest;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import static org.junit.Assert.fail;


public class TestFibonacciHeap {

	@Test
	public void test() {
		FibonacciHeap<Integer,Integer> heap = FibonacciHeap.create();
	}

	@Test
    public void  testArbor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Map<String,String> immutableMap = new ImmutableMap.Builder<String,String>()
                .put("k1","v1")
                .put("k2","v2")
                .build();
        Class c = Arborescence.class;
        Constructor constructor = c.getDeclaredConstructor(new Class[]{ImmutableMap.class});
        constructor.setAccessible(true);
        Object o = constructor.newInstance(new Object[]{immutableMap});
        Arborescence<Object> arborescence0 = Arborescence.of((ImmutableMap<Object, Object>) null);

        //o = Arborescence.of(new ImmutableMap<String,String>.Builder());
    }

    @Test(timeout = 1000)
    public void testkk(){
        double[][] doubleArray0 = new double[2][2];
        doubleArray0[0][0] = 1;
        doubleArray0[0][1] = 1;
        doubleArray0[1][0] = 1;
        doubleArray0[1][1] = 1;
        DenseWeightedGraph<Integer> denseWeightedGraph0 = DenseWeightedGraph.from(doubleArray0);
        Integer integer0 = new Integer((1));
        // Undeclared exception!
        try {
            KBestArborescences.getKBestArborescences((WeightedGraph<Integer>) denseWeightedGraph0, integer0, 1);


        } catch(Exception e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

	
}
