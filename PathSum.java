package medium;
import utility.TreeNode;
import java.util.List;

public class PathSum {
    public void pathSum(TreeNode node, int sum, int pathsum, List<Integer> currNodes){
        currNodes.add(node.val);
        pathsum+=node.val;
        if(node==null|| (pathsum==sum && node.left == null && node.right==null)) {
            System.out.println(currNodes);
          }
        if(node.left!=null)
            pathSum(node.left,sum,pathsum,currNodes);
        if(node.right!=null)
            pathSum(node.right,sum,pathsum,currNodes);
        currNodes.remove(currNodes.size()-1);
        }
    }
