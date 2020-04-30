package net.mooctest;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

import com.google.common.base.Predicate;

public class WeightedGraphTest {

	@Test(expected=NullPointerException.class)
	public void test() {
		Weighted<String> weighted = new Weighted<String>("wangyunxiao", 100);
		Weighted<String> weighted2 = weighted.weighted("wangyunxiao", 100);
		Weighted<String> weighted3 = new Weighted<String>("wangyunxiao", 101);
		Weighted<String> weighted4 = new Weighted<String>("wangyunxiao", 99);
		Weighted<String> weighted5 = new Weighted<String>("wangyunx", 99);
		
		WeightedGraph<String> graph = new WeightedGraph<String>() {
			
			@Override
			public double getWeightOf(String source, String dest) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Collection<String> getNodes() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Collection<Weighted<Edge<String>>> getIncomingEdges(String destinationNode) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		Predicate<Edge<String>> predicate = new Predicate<Edge<String>>() {

			@Override
			public boolean apply(Edge<String> arg0) {
				// TODO Auto-generated method stub
				return false;
			}
		}; 
		
		graph.filterEdges(predicate);
	}



}
