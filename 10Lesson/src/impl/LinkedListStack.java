/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Stack;

/**
 * It is an impementation of Stack adt in form of nodes.
 *
 * @author As
 * @param <T> means that it is generic mode of variables.
 */
public class LinkedListStack<T> implements Stack<T> {

    private Node<T> top;
    private int size;
    private Node<T> top1;
    private Node<T> top2;
    Node<T> newNode;

    public LinkedListStack() {
        top = null;
        size = 0;
    }

    @Override
    public void push(T value) {
        if (size == 0) {
            newNode = new Node(value);
            top = newNode;
            size++;
        } else {

            newNode = new Node(value);
            newNode.setLink(top);
            top = newNode;
            size++;

        }
    }

    @Override
    public T pop() throws Exception {
        if (size == 0) {
            throw new Exception("The stack is empty! Push something into it.");
        }
        T result = top.getValue();
        top1 = top.getLink();

        top = top1;
        size--;
        return result;

    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        top = null;
        size = 0;
    }

    @Override
    public String toString() {
        top1 = top;
        String result = "top [";
        for (int i = 0;
                i < size;
                i++) {
            result += " " + top1;
            top2 = top1.getLink();

            top1 = top2;
        }
        return result + " ] bottom";
    }

}
