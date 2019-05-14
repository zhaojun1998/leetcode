package _429;

import java.util.*;

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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result  = new ArrayList<>();
        if (root != null) {
            Queue<Node> queue = new ArrayDeque<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                List<Integer> list = new ArrayList<>();
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Node node = queue.remove();
                    list.add(node.val);
                    if (node.children == null) {
                        continue;
                    }
                    queue.addAll(node.children);
                }
                result.add(list);
            }
        }
        return result;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {this.val = _val;}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}