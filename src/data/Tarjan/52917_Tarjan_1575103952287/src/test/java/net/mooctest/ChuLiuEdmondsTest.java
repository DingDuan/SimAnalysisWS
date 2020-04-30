package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ChuLiuEdmondsTest {

	@Test(timeout=4000)
	public void test() {
		ArrayList<Integer> nodeList = new ArrayList<>();
		nodeList.add(1);
		nodeList.add(2);
		nodeList.add(3);
		
		Edge<Integer> edges1 = new Edge<Integer>(1, 2);
		Weighted<Edge<Integer>> weighted1 = new Weighted<Edge<Integer>>(edges1, 2.0);
		Edge<Integer> edges2 = new Edge<Integer>(2, 1);
		Weighted<Edge<Integer>> weighted2 = new Weighted<Edge<Integer>>(edges2, 3.0);
		Edge<Integer> edges3 = new Edge<Integer>(2, 3);
		Weighted<Edge<Integer>> weighted3 = new Weighted<Edge<Integer>>(edges3, 3.0);
		
		ArrayList<Weighted<Edge<Integer>>> wArrayList = new ArrayList<>();
		wArrayList.add(weighted1);
		wArrayList.add(weighted2);
		wArrayList.add(weighted3);
		
		SparseWeightedGraph<Integer> sparseWeightedGraph = SparseWeightedGraph.from(nodeList, wArrayList);
		ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds = ChuLiuEdmonds.PartialSolution.initialize(sparseWeightedGraph);
	
		try {
			ChuLiuEdmonds.getMaxArborescence(sparseWeightedGraph);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ChuLiuEdmonds.getMaxArborescence(sparseWeightedGraph, 1);
	}

	@Test(timeout=4000)
	public void test2() {
		ArrayList<Integer> nodeList = new ArrayList<>();
		nodeList.add(1);
		nodeList.add(2);
		nodeList.add(3);
		
		double [][] ds = new double[][] {
			{1.2, 2.3, 5.0},
			{3.1, 1.0, 5.0},
			{1.0, 4.0, 5.0}
		};
		
		DenseWeightedGraph<Integer> sparseWeightedGraph = DenseWeightedGraph.from(nodeList, ds);
		ChuLiuEdmonds.PartialSolution<Integer> chuLiuEdmonds = ChuLiuEdmonds.PartialSolution.initialize(sparseWeightedGraph);
	
		try {
			ChuLiuEdmonds.getMaxArborescence(sparseWeightedGraph);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ChuLiuEdmonds.getMaxArborescence(sparseWeightedGraph, 3);
	}
}
