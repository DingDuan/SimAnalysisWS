package net.mooctest;

import static org.junit.Assert.*;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

public class KBestArborescencesTest {

	@Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      KBestArborescences.SubsetOfSolutions<KBestArborescences> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<KBestArborescences>((Edge<KBestArborescences>) null, (Weighted<Arborescence<KBestArborescences>>) null, (Set<Edge<KBestArborescences>>) null, (Set<Edge<KBestArborescences>>) null);
	      KBestArborescences.SubsetOfSolutions<KBestArborescences> kBestArborescences_SubsetOfSolutions1 = new KBestArborescences.SubsetOfSolutions<KBestArborescences>((Edge<KBestArborescences>) null, (Weighted<Arborescence<KBestArborescences>>) null, (Set<Edge<KBestArborescences>>) null, (Set<Edge<KBestArborescences>>) null);
	      LinkedHashSet<Edge<KBestArborescences>> linkedHashSet0 = new LinkedHashSet<Edge<KBestArborescences>>();
	      linkedHashSet0.clear();
	      linkedHashSet0.add((Edge<KBestArborescences>) null);
	      linkedHashSet0.add((Edge<KBestArborescences>) null);
	      KBestArborescences.SubsetOfSolutions<KBestArborescences> kBestArborescences_SubsetOfSolutions2 = new KBestArborescences.SubsetOfSolutions<KBestArborescences>((Edge<KBestArborescences>) null, (Weighted<Arborescence<KBestArborescences>>) null, (Set<Edge<KBestArborescences>>) null, linkedHashSet0);
	      assertFalse(kBestArborescences_SubsetOfSolutions2.equals((Object)kBestArborescences_SubsetOfSolutions0));
	  }

	@Test(timeout = 4000)
	  public void test1()  throws Throwable  {
	      Edge<Double> edge0 = null;
	      Weighted<Arborescence<Double>> weighted0 = null;
	      LinkedHashSet<Edge<Double>> linkedHashSet0 = new LinkedHashSet<Edge<Double>>();
	      KBestArborescences.SubsetOfSolutions<Double> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Double>((Edge<Double>) null, (Weighted<Arborescence<Double>>) null, linkedHashSet0, linkedHashSet0);
	      KBestArborescences kBestArborescences0 = new KBestArborescences();
	      KBestArborescences kBestArborescences1 = new KBestArborescences();
	      KBestArborescences.SubsetOfSolutions<Double> kBestArborescences_SubsetOfSolutions1 = new KBestArborescences.SubsetOfSolutions<Double>(edge0, weighted0, linkedHashSet0, linkedHashSet0);
	      KBestArborescences kBestArborescences2 = new KBestArborescences();
	      KBestArborescences kBestArborescences3 = new KBestArborescences();
	      KBestArborescences.SubsetOfSolutions<Double> kBestArborescences_SubsetOfSolutions2 = new KBestArborescences.SubsetOfSolutions<Double>(edge0, weighted0, linkedHashSet0, linkedHashSet0);
	      KBestArborescences kBestArborescences4 = new KBestArborescences();
	  }

	@Test(timeout = 4000)
	  public void test2()  throws Throwable  {
	      LinkedHashSet<Edge<Double>> linkedHashSet0 = new LinkedHashSet<Edge<Double>>();
	      KBestArborescences.SubsetOfSolutions<Double> kBestArborescences_SubsetOfSolutions0 = new KBestArborescences.SubsetOfSolutions<Double>((Edge<Double>) null, (Weighted<Arborescence<Double>>) null, linkedHashSet0, linkedHashSet0);
	      KBestArborescences kBestArborescences0 = new KBestArborescences();
	  }

}
