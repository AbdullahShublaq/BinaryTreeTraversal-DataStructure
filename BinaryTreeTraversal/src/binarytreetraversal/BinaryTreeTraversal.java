/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreetraversal;

import BinaryTree.Node;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author Abdullah Shublaq
 * @param <E>
 */
public class BinaryTreeTraversal<E> {

    Stack<Node> parents = new Stack();
    String result = "";

    public String inOrder(Node root) {
        if (root.hasLeft()) {
            parents.push(root);
            return inOrder(root.left);
        } else if (root.hasRight()) {
            result += (root.data) + (" ");
            return inOrder(root.right);
        } else if (!root.hasLeft() && !root.hasRight()) {
            result += (root.data) + (" ");
            while (!parents.empty()) {
                Node<E> node;
                node = parents.pop();
                result += (node.data) + (" ");
                if (node.hasRight()) {
                    return inOrder(node.right);
                }
            }
        }
        String send = result;
        result = "";
        return send;
    } // LnR

    public String PreOrder(Node root) {
        if (root.hasLeft() && root.hasRight()) {
            result += root.data + " ";
            parents.push(root);
            return PreOrder(root.left);
        } else if (root.hasLeft()) {
            result += root.data + " ";
            return PreOrder(root.left);
        } else if (root.hasRight()) {
            result += root.data + " ";
            return PreOrder(root.right);
        } else if (!root.hasLeft() && !root.hasRight()) {
            result += root.data + " ";
            Node<E> node;
            if (!parents.empty()) {
                node = parents.pop();
                return PreOrder(node.right);
            }
        }
        String send = result;
        result = "";
        return send;
    } // nLR

    public String PostOrder(Node root) {
        if (root.hasLeft()) {
            parents.push(root);
            return PostOrder(root.left);
        } else if (root.hasRight()) {
            parents.push(root);
            return PostOrder(root.right);
        } else if (!root.hasLeft() && !root.hasRight()) {
            result += root.data + " ";
            Node<E> node = root;
            while (!parents.empty()) {
                Node before = parents.peek();
                if ((before.hasRight() && before.right.data.equals(node.data)) || !before.hasRight()) {
                    result += before.data + " ";
                    node = parents.pop();
                } else if (before.hasRight()) {
                    return PostOrder(before.right);
                }
            }
        }
        String send = result;
        result = "";
        return send;
    } // LRn

    public String LevelOrder(Node root) {
        ArrayList list = new ArrayList();
        String result2 = PreOrder(root);
        char current;
        String element = "";
        boolean More1Digit = false;

        for (int i = 0; i < result2.length(); i++) {
            current = result2.charAt(i);
            if (current != ' ') {
                if (More1Digit) {
                    element += current;
                } else {
                    element = current + "";
                }
                More1Digit = true;

            } else {
                list.add(Integer.parseInt(element));
                More1Digit = false;
            }
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            result += list.get(i) + " ";
        }
        String send = result;
        result = "";
        return send;
    } // Order by ascending

}
