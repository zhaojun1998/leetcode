package _559;

import util.Node;

import java.util.ArrayList;
import java.util.List;

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
    public int maxDepth(Node root) {
        int depth = 1;
        if (root == null)
            return 0;
        for (Node n : root.children){
            depth = Math.max(depth, maxDepth(n) + 1);
        }
        return depth;
    }
}