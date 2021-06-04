package com.ds.linkedlist.singly;


import com.ds.linkedlist.AbstractLinkedList;

/**
 * Generic Linked list data structure to accept any type T
 *
 * @param <T> - type T to be stored in the list
 */
public class LinkedList<T> extends AbstractLinkedList<T> {

    @Override
    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    @Override
    public void addHead(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = tail = node;
        } else {
            node.setNext(head);;
            head = node;
        }
        size++;
    }

    @Override
    public boolean delete() {
        if (isEmpty()) {
            System.out.println("Can't delete from empty list");
            return false;
        } else {
            Node<T> curr = head, prev = null;
            while (curr.getNext() != null) {
                prev = curr;
                curr = curr.getNext();
            }
            tail = prev;
            if (prev != null) {
                prev.setNext(null);
            } else {
                head = null;
            }
            size--;
            return true;
        }
    }

    @Override
    public boolean deleteHead() {
        if (isEmpty()) {
            System.out.println("Can't delete from empty list");
            return false;
        } else {
            head = head.getNext();
            if (head == null) {// if the linked-list contains only one element
                tail = null;
            }
            size--;
            return true;
        }
    }

    @Override
    public boolean deleteAt(int index) {
        if (isEmpty()) {
            System.out.println("Can't delete from empty list");
            return false;
        } else if (index >= size || index < 0) {
            System.out.println("Can't delete, index out of bounds");
            return false;
        } else {
            Node<T> curr = head, prev = null;
            int count = 0;
            while (curr.getNext() != null && count < index) {
                prev = curr;
                curr = curr.getNext();
                count++;
            }
            if (prev != null) {// if node to be deleted is not head
                prev.setNext(curr.getNext());
                if (curr.getNext() == null) {// if deleting last node
                    tail = prev;
                }
            } else {// if deleting head node
                head = curr.getNext();
                if (head == null) {// if head is the only node
                    tail = null;
                }
            }
            size--;
            return true;
        }
    }

    @Override
    public boolean delete(T data) {
        if (isEmpty()) {
            System.out.println("Can't delete from empty list");
            return false;
        } else {
            Node<T> curr = head, prev = null;
            while (curr.getNext() != null && curr.data != data) {
                prev = curr;
                curr = curr.getNext();
            }
            if (prev != null) {// if node to be deleted is not head
                prev.setNext(curr.getNext());
                if (curr.getNext() == null) {// if deleting last node
                    tail = prev;
                }
            } else {// if deleting head node
                head = curr.getNext();
                if (head == null) {// if head is the only node
                    tail = null;
                }
            }
            return true;
        }
    }
}