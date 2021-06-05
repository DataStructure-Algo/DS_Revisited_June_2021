package com.util.linkedlist;

import com.ds.linkedlist.singly.LinkedList;
import com.util.array.ArrayUtil;

import java.util.Iterator;
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

    static <T> LinkedList<T> toLinkedList(T[] items) {
        LinkedList<T> list = new LinkedList<>();
        for (T item : items) {
            list.add(item);
        }
        return list;
    }

    static LinkedList<Integer> numberToLinkedList(Integer number) {
        return toLinkedList(ArrayUtil.numberToIntegerArray(number));
    }

    static Integer linkedListToNumber(LinkedList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next());
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    static LinkedList<Character> stringToLinkedList(String string) {
        LinkedList<Character> charList = new LinkedList<>();
        for (char charItem:string.toCharArray()) {
            charList.add(charItem);
        }
        return charList;
    }

}