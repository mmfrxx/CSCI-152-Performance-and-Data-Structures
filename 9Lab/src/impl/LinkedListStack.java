/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;
import adt.Stack;
/**
 * It is an impementation of Stack adt in form of nodes.
 * @author As
 * @param <T> means that it is generic mode of variables.
 */
public class LinkedListStack<T> implements Stack<T> {
        private Node<T> top;
        private int size;
        private Node<T> top1;
        private Node<T> top2;
        
        public LinkedListStack(){
            top = null;
            size = 0;
        }
    @Override
    public void push(T value) {
      if(size ==0){
          Node newNode = new Node(value);
          top = newNode;
          size++;
      }else{
         
      Node newNode = new Node(value);
     newNode.setLink(top);
     top = newNode;
     size++;
      
       
      }
    }

    @Override
    public T pop() throws Exception {
        if(size==0){
           throw new Exception ("The stack is empty! Push something into it.");
        }
        top1=top;
        top2=top.getLink();
        top = null;
        top = top2;
        size--;
        return top1.getValue();
        
        
        
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

     public String toString(){
         String result = "[";
         for(int i =0;
                 i<size;
                 i++){
             result+= " " + top.getValue();
             top2=top.getLink();
      
        top = top2;
         }
         return result+ " ]";
     }

    
}
