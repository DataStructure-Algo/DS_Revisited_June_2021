package com.ds.linkedlist;

public interface LinkedListInterface <T>{
    /**
     * Adds the item at the end of the list
     * @param data - data item
     */
    void add(T data);

    /***
     * Adds the item at the head of the list
     * @param data - data item
     */
    void addHead(T data);

    /**
     * deletes the last item from the non-empty list
     * @return - true if deleted, false if not
     */
    boolean delete();

    /**
     * deletes the first item from the non-empty list
     * @return - true if deleted, false if not
     */
    boolean deleteHead();

    /**
     * deletes the item at index i from the non-empty list
     * @param index - index(ranges from 0 to size_of_list-1) of the item to be deleted
     * @return - true if deleted, false if not
     */
    boolean deleteAt(int index);

    /**
     * deletes the item if found in the list
     * @param data - delete the item
     * @return - true if deleted, false if not
     */
    boolean delete(T data);
}