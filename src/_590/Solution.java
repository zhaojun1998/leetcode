package _590;

import util.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return list;
        }

        for (Node child : root.children) {
            postorder(child);
        }

        list.add(root.val);

        return list;
    }

    public List<Integer> postorder2(Node root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.peek();
            List<Node> children = node.children;
            if (children != null && children.size() != 0) {
                for (int i = children.size() - 1; i >= 0; i--) {
                    stack.add(children.get(i));
                }
            } else {
                list.add(stack.pop().val);
            }
            node.children = new ArrayList<>();
        }

        return list;
    }
}