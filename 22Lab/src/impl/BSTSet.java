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
        T result = null;
        TreeNode<T> node =root;
        if (contains(value)) {
            return removeHelper(root, root, value, 't');
        }
        return false;
    }

    private boolean removeHelper(TreeNode<T> node, TreeNode<T> parent, T value, char c) {
        boolean result;
        if (node.getValue().equals(value)) {
            if ((node.getLeft() == null && node.getRight() != null)) {
                if (c == 'l') {
                    parent.setLeft(node.getRight());
                    size--;
                    return true;
                } else {
                    parent.setRight(node.getRight());
                    size--;
                    return true;
                }
            }
            if (node.getLeft() != null && node.getRight() == null) {
                if (c == 'l') {
                    parent.setLeft(node.getLeft());
                    size--;
                    return true;
                } else {
                    parent.setRight(node.getLeft());
                    size--;
                    return true;
                }
            }
            if (node.getLeft() == null && node.getRight() == null) {
                if (c == 'l') {
                    parent.setLeft(null);
                    size--;
                    return true;
                } else {
                    parent.setRight(null);
                    size--;
                    return true;
                }
            }
            if (node.getLeft() != null && node.getRight() != null) {
                node.setValue(replace(node.getRight(), node));
                return true;
            }
        } else {
            if (node.getValue().compareTo(value) > 0) {
                removeHelper(node.getLeft(), node, value, 'l');//l stands for left
            } else {
                removeHelper(node.getRight(), node, value, 'r');//r stands for right
            }
        }
        return true;
    }

    private T replace(TreeNode<T> node, TreeNode<T> parent) {
        T result = parent.getValue();
        if (node.getLeft() == null) {
            result = node.getValue();
            parent.setLeft(node.getRight());
            size--;
            return result;
        }
        result = replace(node.getLeft(), node);
        return result;
    }

    @Override
    public T removeAny() throws Exception {
        T value = null;
        int size = getSize();
        if (size == 0) {
            throw new Exception("The set is empty");
        } else if (size == 1) {
            value = root.getValue();
            root = null;
            size--;
        } else {
            if (root.getLeft() == null) {
                value = removeAnyHelper(root.getRight(), root, root);
            } else if (root.getRight() == null) {
                value = removeAnyHelper(root.getLeft(), root, root);
            } else {
                value = removeAnyHelper(root.getLeft(), root, root);
            }
        }
        return value;
    }

    private T removeAnyHelper(TreeNode<T> node, TreeNode<T> parent, TreeNode<T> grandparent) {
        if (node == null) {
            size--;
            grandparent.setLeft(parent.getRight());
            return parent.getValue();
        }
        T value = removeAnyHelper(node.getLeft(), node, parent);
        return value;
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

