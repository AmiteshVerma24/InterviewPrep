package Recursion.Strings;

class DiceProblem {
    public static void main(String[] args) {
        findDiceCombination("", 4);
    }
    static void findDiceCombination(String processed, int target){
        if(target == 0) {
            System.out.println(processed);
            return;
        }
        for (int i = 1; i <= 6 && i <= target ; i++) {
                findDiceCombination(processed + i, target - i);
        }
    }
}
