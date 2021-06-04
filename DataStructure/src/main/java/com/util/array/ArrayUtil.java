package com.util.array;

import com.ds.linkedlist.singly.LinkedList;

public interface ArrayUtil {
    static <T> LinkedList<T> toLinkedList(T[] items) {
        LinkedList<T> list = new LinkedList<>();
        for (T item : items) {
            list.add(item);
        }
        return list;
    }
}