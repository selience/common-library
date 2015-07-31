package org.iresearch.android.collection;

import java.util.ArrayList;
import java.util.Collection;

public class NoDuplicatesArrayList<E> extends ArrayList<E> {

	private static final long serialVersionUID = -7277301117508689125L;

	public NoDuplicatesArrayList() {
		super();
	}

	public NoDuplicatesArrayList(final int capacity) {
		super(capacity);
	}

	public NoDuplicatesArrayList(final java.util.Collection<? extends E> collection) {
		super(collection);
	}

	@Override
	public boolean add(final E e) {
		if (contains(e))
			return false;
		else
			return super.add(e);
	}

	@Override
	public void add(final int index, final E element) {
		if (contains(element))
			return;
		else {
			super.add(index, element);
		}
	}

	@Override
	public boolean addAll(final Collection<? extends E> collection) {
		final Collection<E> copy = new ArrayList<E>(collection);
		copy.removeAll(this);
		return super.addAll(copy);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends E> collection) {
		final Collection<E> copy = new ArrayList<E>(collection);
		copy.removeAll(this);
		return super.addAll(index, copy);
	}
}
