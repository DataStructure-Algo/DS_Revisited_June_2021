package com.questions.linkedlist.singly;

import com.ds.linkedlist.singly.LinkedList;

public class AddTwoStringsUsingLinkedList {

    public LinkedList<Character> addTwoStrings(LinkedList<Character> string1, LinkedList<Character> string2) {
        if (string1.getHead() == null)
            return string2;
        if (string2.getHead() == null)
            return string1;
        string1.getTail().setNext(string2.getHead());
        return string1;
    }
}