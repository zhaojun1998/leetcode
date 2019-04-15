package _589;

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
public class Solution {

    List<Integer> list = new ArrayList<>();

    /**
     * 非递归写法
     */
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Stack<Node> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            for (int i = root.children.size() - 1; i >= 0; i--) {
                stack.add(root.children.get(i));
            }
        }
        return list;
    }

    /**
     * 递归写法
     */
    public List<Integer> preorder2(Node root) {
        if (root == null) {
            return list;
        }

        list.add(root.val);
        for (Node child : root.children) {
            preorder2(child);
        }

        return list;
    }
}