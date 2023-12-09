package Recursion.Medium;
import java.util.*;

class CombinationSum {
    
    public static void main(String[] args) {
        int [] candidates = {2, 3, 6, 7};
        int target = 7;
        List<Integer> lst = new ArrayList<>();

        List<List<Integer>> ans = combination(candidates, target, lst);
        for (List<Integer> innerList : ans) {
            for (Integer value : innerList) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println("Hello");
    }    
    public static List<List<Integer>> combination(int [] candidates ,int target, List<Integer> pro){
        List<List<Integer>> ans = new ArrayList<>();
        int sum = find_sum(pro);
        if(sum == target){
            System.out.println(pro);
            ans.add(pro);
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
    public static int find_sum(List<Integer> processed){
        int sum = 0;
        for(int i = 0 ; i < processed.size() ; i++){
            sum += processed.get(i);
        }
        return sum;
    }
}
