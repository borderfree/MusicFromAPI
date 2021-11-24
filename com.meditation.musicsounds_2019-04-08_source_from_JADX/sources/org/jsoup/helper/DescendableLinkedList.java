package org.jsoup.helper;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DescendableLinkedList<E> extends LinkedList<E> {

    /* renamed from: org.jsoup.helper.DescendableLinkedList$a */
    private class C6757a<E> implements Iterator<E> {

        /* renamed from: b */
        private final ListIterator<E> f23717b;

        private C6757a(int i) {
            this.f23717b = DescendableLinkedList.this.listIterator(i);
        }

        public boolean hasNext() {
            return this.f23717b.hasPrevious();
        }

        public E next() {
            return this.f23717b.previous();
        }

        public void remove() {
            this.f23717b.remove();
        }
    }

    public Iterator<E> descendingIterator() {
        return new C6757a(size());
    }

    public E peekLast() {
        if (size() == 0) {
            return null;
        }
        return getLast();
    }

    public E pollLast() {
        if (size() == 0) {
            return null;
        }
        return removeLast();
    }

    public void push(E e) {
        addFirst(e);
    }
}
