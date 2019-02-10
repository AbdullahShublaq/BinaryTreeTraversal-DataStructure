/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author Abdullah Shublaq
 * @param <E>
 */
public class Node<E> {

    public Node<E> parent = null;
    public Node<E> left = null;
    public Node<E> right = null;
    public E data;

    public Node(E data) {
        this.data = data;
    }

    public Node<E> getParent() {
        return parent;
    }

    public void setParent(Node<E> parent) {
        this.parent = parent;
    }//set parent

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setChild(Node<E> child) {
        if (this.left == null) {
            addLeftChild(child);
        } else if (this.right == null) {
            addRightChild(child);
        }
    }//set child

    public void addLeftChild(Node<E> child) {
        this.setLeft(child);
        child.setParent(this);
    }//add left child

    public void addRightChild(Node<E> child) {
        this.setRight(child);
        child.setParent(this);
    }//add right child

    public void addParentToLeft(Node<E> parent) {
        this.setParent(parent);
        parent.setLeft(this);
    }//add parent to left

    public void addParentToRight(Node<E> parent) {
        this.setParent(parent);
        parent.setRight(this);
    }//add parent to right

    public boolean hasRight() {
        return this.right != null;
    }

    public boolean hasLeft() {
        return this.left != null;
    }

}
