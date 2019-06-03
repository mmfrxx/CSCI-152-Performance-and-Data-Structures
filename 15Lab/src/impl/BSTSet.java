/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;

/**
 *
 * @author As
 */
public class BSTSet<T extends Comparable> implements Set<T> {
    private TreeNode<T> root;
    private int size;
    
    public BSTSet(){
        root = null;
        size=0;
    }
    @Override
    public void add(T value) {
        if(!contains(value)){
           if(size==0){
               root = new TreeNode(value);
               size++;
           }else{
           addHelper(root,value);
       }
    }}

    private void addHelper(TreeNode<T> node, T value){
        
        if(node.getValue().compareTo(value)>0){
            if(node.getLeft()==null){
                node.setLeft(new TreeNode(value));
                size++;
            }else{
                addHelper(node.getLeft(),value);
            }
            
            
            
        }else{
             if(node.getRight()==null){
                node.setRight(new TreeNode(value));
                size++;
            }else{
                addHelper(node.getRight(),value);
            }
           
        }
    }
    @Override
    public boolean contains(T value) {
        return containsHelper(root, value);
   }

    private boolean containsHelper(TreeNode<T> node, T value){
        boolean result;
        if(node==null){
            return false;
        }
        if(node.getValue().compareTo(value)>0){
        result = containsHelper(node.getLeft(), value);
        }
        else{
        result = containsHelper(node.getRight(), value);
        }
        
        if(node.getValue().equals(value)){
            result = true;
        }
        return result;
    }
    @Override
    public boolean remove(T value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeAny() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
       root = null;
       size = 0;
    }
    
    @Override
    public String  toString(){
        return toStringHelper(root)+"Size " +getSize();
    }
    
    private String toStringHelper(TreeNode<T> node){
        if(node == null){
            return " ";
        }
        return toStringHelper(node.getLeft())+node + toStringHelper(node.getRight());
    }
}
