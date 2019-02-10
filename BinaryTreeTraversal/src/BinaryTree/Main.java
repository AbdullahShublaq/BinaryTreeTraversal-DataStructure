/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author Abdullah Shublaq
 */
public class Main {

    public static void main(String[] args) {

        Node<Integer> root = new Node(5);
        Node<Integer> left = new Node(4);
        Node<Integer> right = new Node(6);

        left.addParentToLeft(root);
        root.addLeftChild(left);

        right.addParentToRight(root);
        root.addParentToRight(right);

        System.out.println("Root : " + root.getData().toString());
        System.out.println("Left : " + root.getLeft().getData().toString());
        System.out.println("Right : " + root.getRight().getData().toString());
    }
}
