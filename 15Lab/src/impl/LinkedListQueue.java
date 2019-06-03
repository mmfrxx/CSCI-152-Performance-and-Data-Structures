/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Queue;

/**
 *
 * @author As
 * @param <T>
 */
public class LinkedListQueue<T> implements Queue<T>{
    private Node<T> front;
    private Node<T> back;
    private int size;
    Node<T> newNode;
    private T result;
     public LinkedListQueue(){
         front = null;
         back = null;
         size = 0;
     }
    @Override
    public void enqueue(T value) {
       if(size==0){
           newNode=new Node(value);
           front = newNode;
           back = newNode;
           size++;
       }else{
           newNode=new Node(value);
         
           back.setLink(newNode);
           back = newNode;
           size++;
       }
    }

    @Override
    public T dequeue() throws Exception {
        if(size==0){
            throw new Exception ("The queue is empty!");
        }else if(size==1){
             result = front.getValue();
            front = null;
            back = null;
            size--;
        }else{
            result = front.getValue();
            front = front.getLink();
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
        front = null;
         back = null;
         size = 0;
         result = null;
    }
    public String toString(){
       String result = "front [";
       Node front1 = front;
        for(int i =0;
                 i<size;
                 i++){
             result+= " " +front1;
             front1=front1.getLink();
          }
        result+= "] back";
        return result;
    }
}
