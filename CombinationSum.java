package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public void combinationSum(List<List<Integer>> res, List<Integer> curr, int index, int target, int[] can){
        if ( target == 0 ){ res.add(new ArrayList(curr));return;}

        if ( target < can[index] ) return;

        for ( int i = index; i < can.length; i++ ){
            curr.add(can[i]);
            combinationSum(res,curr,i,target - can[i],can);
            curr.remove(curr.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] can, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(can);
        combinationSum(res,new ArrayList(),0,target,can);
        return res;
    }
}
