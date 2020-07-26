package medium;

import utility.TreeNode;

import java.util.HashMap;

public class PathSumII {
    HashMap<Integer,Integer> map = new HashMap<>();
    int count=0,target;
    public void pathSumII(TreeNode node,int pathSum){
        if(node==null)
            return;
        pathSum+=node.val;
        if(pathSum==target)
            count++;
        if(map.containsKey(pathSum-target))
            count+=map.get(pathSum-target);
        map.put(pathSum,map.getOrDefault(pathSum,0)+1);
        pathSumII(node.left,pathSum);
        pathSumII(node.right,pathSum);
        map.put(pathSum,map.get(pathSum)-1);
    }
    public int pathSum(TreeNode root, int sum) {
        target=sum;
        pathSumII(root,0);
        return count;
    }
}
