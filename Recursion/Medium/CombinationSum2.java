package Recursion.Medium;
import java.util.*;
public class CombinationSum2 {

    public static void findAns(int [] candidates, int target, int sum, List<List<Integer>> ans, List<Integer> current){
        if(sum == target){
            ArrayList<Integer> arrToAdd = new ArrayList<>(current);
            Collections.sort(arrToAdd);
            boolean contains = false;
            for(List<Integer> lst : ans){
                if(lst.equals(arrToAdd)){
                    contains = true;
                    break;
                }
            }
            if(!contains) ans.add(arrToAdd);
        }
        for(int i = 0 ; i < candidates.length ; i++){
            if(candidates[i] > 0 && sum + candidates[i] <= target){
                int temp = candidates[i];
                current.add(candidates[i]);
                candidates[i] *= -1;
                findAns(candidates, target, sum + temp, ans, current);
                current.remove(current.size() - 1);
                candidates[i] *= -1;
            }
        }
    }

    public static void main(String[] args) {
        int [] candidates = {2,5,2,1,2};
        int target = 5;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        findAns(candidates, target, 0, ans, current);
        for (List<Integer> innerList : ans) {
            System.out.println(innerList.toString());
        }
        System.out.println("Finished");
    }
}
