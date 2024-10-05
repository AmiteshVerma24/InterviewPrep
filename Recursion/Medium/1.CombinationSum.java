package Recursion.Medium;
import java.util.*;

class CombinationSum {
    
    public static void main(String[] args) {
        int [] candidates = {2, 3, 6, 7};
        int target = 7;
        List<Integer> lst = new ArrayList<>();

        List<List<Integer>> ans = unique_combinations(candidates, target, lst);
        for (List<Integer> innerList : ans) {
            System.out.println(innerList);
        }
        System.out.println(ans);
    }    
    // If we use this method since we are checking with the overall sum of processed array it will result in all possible combination which will include repeated elements within the arrays
    public static List<List<Integer>> combination(int [] candidates ,int target, List<Integer> pro){
        List<List<Integer>> ans = new ArrayList<>();
        int sum = find_sum(pro);
        if(sum == target){
            System.out.println(pro);
            ans.add(new ArrayList<>(pro));
        }
        if(sum < target){
            for (int i = 0; i < candidates.length; i++) {
                pro.add(candidates[i]);
                ans.addAll(combination(candidates, target, pro));
                pro.remove(pro.size() - 1);
            }
        }
        return ans;
    }  
    public  static List<List<Integer>> unique_combinations(int [] candidates, int target_left, List<Integer> lst) {
        List<List<Integer>> scope_ans = new ArrayList<>();
        if(target_left == 0) {
            scope_ans.add(new ArrayList<>(lst));
        }
        if(target_left > 0) {
            for (int i = 0; i < candidates.length; i++) {
                if (target_left - candidates[i] >= 0){
                    lst.add(candidates[i]);
                    scope_ans.addAll(unique_combinations(candidates, target_left - candidates[i], lst));
                    lst.remove(lst.size() - 1);

                }
            }
        }
        return scope_ans;
    }
    public static int find_sum(List<Integer> processed){
        int sum = 0;
        for(int i = 0 ; i < processed.size() ; i++){
            sum += processed.get(i);
        }
        return sum;
    }
}
