package com.ds.linkedlist;

import java.util.Iterator;

public abstract class AbstractLinkedList<T> implements LinkedListInterface<T>, Iterable<T> {
    protected Node<T> head, tail;
    protected int size;

    /**
     * @return - size of the list
     */
    public int size() {
        return size;
    }

    /**
     * @return true if not empty else false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @return - head of the list
     */
    public Node<T> getHead() {
        return head;
    }

    /**
     * @return - tail of the list
     */
    public Node<T> getTail() {
        return tail;
    }

    /**
     * @return - iterator of the class to iterate
     */
    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<>(head);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isEmpty()) {
            sb.append("Empty List");
        } else {
            Iterator<T> iterator = iterator();
            while (iterator.hasNext()) {
                sb.append(iterator.next());
                sb.append(iterator.hasNext() ? " -> " : "");
            }
        }
        return sb.toString();
    }

    /**
     * Iterator class to iterate the linked-list
     *
     * @param <T>
     */
    private static class LinkedListIterator<T> implements Iterator<T> {
        private Node<T> curr;

        LinkedListIterator(Node<T> head) {
            this.curr = head;
        }

        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public T next() {
            T data = curr.data;
            curr = curr.next;
            return data;
        }
    }

    protected static class Node<T> {
        public final T data;
        protected Node<T> prev, next;

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getNext() {
            return next;
        }

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }
}