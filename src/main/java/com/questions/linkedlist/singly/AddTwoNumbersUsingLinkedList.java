package com.questions.linkedlist.singly;

import com.ds.linkedlist.singly.LinkedList;
import com.util.linkedlist.LinkedListUtil;

import java.util.Stack;

public class AddTwoNumbersUsingLinkedList {

    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> number1, LinkedList<Integer> number2) {
        Stack<Integer> first = LinkedListUtil.toStack(number1);
        Stack<Integer> second = LinkedListUtil.toStack(number2);
        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;
        int sum = 0;
        while (!first.isEmpty() || !second.isEmpty()) {
            sum = (!first.isEmpty() ? first.pop() : 0) + (!second.isEmpty() ? second.pop() : 0) + carry;
            if (sum >= 10) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            result.addAtHead(sum);
        }
        if (carry > 0) {
            result.addAtHead(carry);
        }
        return result;
    }
}