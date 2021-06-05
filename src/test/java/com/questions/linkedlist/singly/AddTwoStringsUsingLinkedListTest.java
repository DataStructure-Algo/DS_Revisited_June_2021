package com.questions.linkedlist.singly;

import com.ds.linkedlist.singly.LinkedList;
import com.util.linkedlist.LinkedListUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class AddTwoStringsUsingLinkedListTest {
    private AddTwoStringsUsingLinkedList subject;

    @BeforeEach
    void setUp() {
        subject = new AddTwoStringsUsingLinkedList();
    }

    @Test
    public void testAddTwoStrings() {
        for (TestCase testCase : getTestCases()) {
            LinkedList<Character> string1 = LinkedListUtil.stringToLinkedList(testCase.first);
            LinkedList<Character> string2 = LinkedListUtil.stringToLinkedList(testCase.second);
            LinkedList<Character> result = subject.addTwoStrings(string1, string2);
            System.out.println("---   AddTwoStringsUsingLinkedList   ---");
            System.out.println("first- " + string1);
            System.out.println("second- " + string2);
            System.out.println("result- " + result);
            Assertions.assertEquals(testCase.result, LinkedListUtil.listToFlatString(result));
        }
    }

    class TestCase {
        String first;
        String second;
        String result;

        public TestCase(String first, String second) {
            this.first = first;
            this.second = second;
            this.result = first + second;
        }
    }

    private ArrayList<TestCase> getTestCases() {
        ArrayList<TestCase> testCases = new ArrayList<>();
        testCases.add(new TestCase("Hello", "World"));
        testCases.add(new TestCase("Check ", "One "));
        return testCases;
    }

}