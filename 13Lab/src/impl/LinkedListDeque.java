/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Deque;

/**
 *
 * @author As
 * @param <T>
 */
public class LinkedListDeque<T> implements Deque<T> {

    private int size;
    private DoublyLinkedNode<T> front;
    private DoublyLinkedNode<T> back;

    public LinkedListDeque() {
        front = null;
        back = null;
        size = 0;
    }

    @Override
    public void pushToFront(T value) {
        DoublyLinkedNode<T> newone = new DoublyLinkedNode(value);
        if (size == 0) {
            front = newone;
            back = newone;
            size++;
        } else {
            newone.setNext(front);
            front.setPrevious(newone);
            front = newone;
            size++;
        }
    }

    @Override
    public void pushToBack(T value) {
        DoublyLinkedNode<T> newone = new DoublyLinkedNode(value);
        if (size == 0) {
            front = newone;
            back = newone;
            size++;
        } else {
            back.setNext(newone);
            newone.setPrevious(back);
            back = newone;
            size++;
        }
    }

    @Override
    public T popFromFront() throws Exception {

        T result;
        if (size == 0) {
            throw new Exception("OOHPS! ERROR!ERROR!!!!!!!DEQUE IS EMPTYYYYYYYYYYY! Push something please!");

        } else if (size == 1) {
            result = front.getValue();
            back = null;

            front = null;
        } else {
            result = front.getValue();
            front.getNext().setPrevious(null);
            front = front.getNext();

        }
        size--;
        return result;
    }

    @Override
    public T popFromBack() throws Exception {
        T result;
        if (size == 0) {
            throw new Exception("OOHPS! ERROR!ERROR!!!!!!!!EMPTYYYYYYYYYYY! Push something please!");
        } else if (size == 1) {
            result = back.getValue();
            back = null;
            size--;
            front = null;
        } else {
            result = back.getValue();
            back.getPrevious().setNext(null);
            back = back.getPrevious();
            size--;
        }
        return result;

    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        back = null;
        front = null;
        size = 0;
    }

    public String toString() {
        String result = "front [";
        DoublyLinkedNode<T> top = front;
        for (int i = 0; i < size; i++) {
            result += " " + top.toString();
            top = top.getNext();
        }
        result += " ] back\n" + "Size: " + size;
        return result;
    }
}
