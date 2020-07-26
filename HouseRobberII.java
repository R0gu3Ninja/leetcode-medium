package medium;

import utility.TreeNode;

import java.util.HashMap;

public class HouseRobberII {
    public int rob(TreeNode root) {
        if (root == null) return 0;
        return helper(root, new HashMap<>());
    }

    public int helper(TreeNode root, HashMap<TreeNode, Integer> map) {
        if (root == null) return 0;
        if (map.containsKey(root)) {
            return map.get(root);
        }
        int res = 0;
        if (root.left != null) {
            res += helper(root.left.left, map) + helper(root.left.right, map);
        }
        if (root.right != null) {
            res += helper(root.right.left, map) + helper(root.right.right, map);
        }
        int max = Math.max(root.val + res, helper(root.left, map) + helper(root.right, map));
        map.put(root, max);
        return max;
    }
}
