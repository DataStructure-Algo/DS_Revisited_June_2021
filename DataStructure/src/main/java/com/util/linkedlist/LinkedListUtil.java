package com.util.linkedlist;

import com.ds.linkedlist.singly.LinkedList;

import java.util.Stack;

public interface LinkedListUtil {

    static <T> String listToFlatString(LinkedList<T> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (T integer : list) {
            stringBuilder.append(integer);
        }
        return stringBuilder.toString();
    }

    static <T> Stack<T> toStack(LinkedList<T> list) {
        Stack<T> stack = new Stack<>();
        for (T integer : list) {
            stack.push(integer);
        }
        return stack;
    }

    static <T> T[] toArray(LinkedList<T> list) {
        T[] items = (T[]) new Object[list.size()];
        int i = 0;
        for (T item : list) {
            items[i++] = item;
        }
        return items;
    }
}