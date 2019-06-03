/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.SortedQueue;

/**
 *
 * @author As
 */
public class LinkedListSortedQueue<T extends Comparable> implements SortedQueue<T> {
    private Node<T> front;
    Node<T> checker;
    private int size;
    Node<T> newNode;
    private T result;
    
    public LinkedListSortedQueue(){
         front = null;
         size = 0;
     }
    
    
    
    @Override
    public void insert(T value) {
        Node<T> newNode = new Node(value);
        int size1 = size;
        if (size==0){
            front = newNode;
            size++;
        }else{
            //newNode goes before front
            if(value.compareTo(front.getValue())<=0){
                newNode.setLink(front);
                front = newNode;
                size++;
            }//newNode goes somewhere in the middle 
            else{
                checker=front;
                for(int i =0;
                        i<size-1;
                        i++){
                   
                    if(value.compareTo(checker.getValue())>0&&value.compareTo(checker.getLink().getValue())<=0 ){
                        newNode.setLink(checker.getLink());
                        checker.setLink(newNode);
                        size++;
                    } 
                    checker = checker.getLink();
                    
                }
                
            }
            if(size1==size){
                
                        checker.setLink(newNode);
                        size++;
                    
            }
        }
    }

    @Override
    public T dequeue() throws Exception {
         if(size==0){
            throw new Exception ("The queue is empty!");
        }else if(size==1){
             result = front.getValue();
            front = null;
            
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
         
         size = 0;
         result = null;
    }
    public String toString(){
       String resultt = "front [";
       Node front1 = front;
        for(int i =0;
                 i<size;
                 i++){
             resultt+= " " +front1.toString();
             front1=front1.getLink();
          }
        resultt+= "] back";
        return resultt;
    }

    
}