package net.mooctest;

import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Doubles;

import java.util.List;

/**
 * An edge, together with a list of edges that can't be in the final answer if 'edge' is.
 *
 *一个边，还有一个列有边的列表，如果“边”是最终答案，那么这些边就不能出现在最终答案中。
 * @author sthomson@cs.cmu.edu
 */
public class ExclusiveEdge<V> implements Comparable<ExclusiveEdge<V>> {
	public final Edge<V> edge;
	public final List<Edge<V>> excluded;
	public final double weight;

	private ExclusiveEdge(Edge<V> edge, List<Edge<V>> excluded, double weight) {
		this.edge = edge;
		this.excluded = excluded;
		this.weight = weight;
	}

	public static <T> ExclusiveEdge<T> of(Edge<T> edge, List<Edge<T>> excluded, double weight) {
		return new ExclusiveEdge<T>(edge, excluded, weight);
	}

	public static <T> ExclusiveEdge<T> of(Edge<T> edge, double weight) {
		return ExclusiveEdge.of(edge, ImmutableList.<Edge<T>>of(), weight);
	}

	@Override public int compareTo(ExclusiveEdge<V> exclusiveEdge) {
		return Doubles.compare(weight, exclusiveEdge.weight);
	}
}
