/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreetraversal;

import BinaryTree.Node;

/**
 *
 * @author jit
 */
public class Main {

    /*Input1:
            1
           / \
          2   3
         / \
        4   5   
     */
 /*Output1:
        InOrder : 4 2 5 1 3
        PreOrder : 1 2 4 5 3
        PostOrder : 4 5 2 3 1
        LevelOrder : 1 2 3 4 5
     */
 /*------------------------------*/
 /*Input2:
            1
           / \
          2   3
         /   / \
        4   5   6
         \       \
          7       8
           \     /
            9   10
               /  \
              11   12
     */
 /*Output1:
        InOrder : 4 7 9 2 1 5 3 6 11 10 12 8
        PreOrder : 1 2 4 7 9 3 5 6 8 10 11 12
        PostOrder : 9 7 4 2 5 11 12 10 8 6 3 1
        LevelOrder : 12 11 10 9 8 7 6 5 4 3 2 1
     */
 /*------------------------------*/
    public static void main(String[] args) {
        BinaryTreeTraversal traversal = new BinaryTreeTraversal();

        Node<Integer> root = new Node(1);
        root.setRight(new Node(3));
        root.setLeft(new Node(2));
        root.left.setLeft(new Node(4));
        root.left.setRight(new Node(5));


//        Node<Integer> root = new Node(1);
//        root.setLeft(new Node(2));
//        root.left.setLeft(new Node(4));
//        root.left.left.setRight(new Node(7));
//        root.left.left.right.setRight(new Node(9));
//
//        root.setRight(new Node(3));
//        root.right.setLeft(new Node(5));
//        root.right.setRight(new Node(6));
//        root.right.right.setRight(new Node(8));
//        root.right.right.right.setLeft(new Node(10));
//        root.right.right.right.left.setLeft(new Node(11));
//        root.right.right.right.left.setRight(new Node(12));

        System.out.println("In Order : " + traversal.inOrder(root));

        System.out.println("Pre Order : " + traversal.PreOrder(root));

        System.out.println("Post Order : " + traversal.PostOrder(root));

        System.out.println("Level Order : " + traversal.LevelOrder(root));

    }
}
