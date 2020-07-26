package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Permutations {
    //List<List<Integer>> ans;
    void permute(int[] nums, LinkedList<Integer> cur) {
        if(cur.size()==nums.length){
            System.out.println(cur);
            return;
        }

        for(int i: nums){
            if(!cur.contains(i)){
                cur.add(i);
                permute(nums,cur);
                cur.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        //ans = new ArrayList<>();
        Permutations p = new Permutations();
        p.permute(arr,new LinkedList<>());
    }
}
