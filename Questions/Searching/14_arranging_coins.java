package Questions.Searching;
// https://leetcode.com/problems/arranging-coins/description/
class arranging_coins {
    public static void main(String[] args) {
        int number_of_coins = 100234;
        System.out.println(arrangeCoins(number_of_coins));
    }
    public static int arrangeCoins(int n) {
        int start = 0, end = n;
        while(start <= end){
            long num_coin = start + (end - start) / 2;
            long sum = (num_coin*(num_coin+1))/2;
            if(sum == n){
                return (int)num_coin;
            }
            else if(sum < n){
                start = (int)num_coin + 1;
            }
            else{
                end = (int)num_coin - 1;
            }
        }
        return end;
    }
}
