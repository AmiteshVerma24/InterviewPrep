package Questions.Searching;
// https://leetcode.com/problems/first-bad-version/description/
public class first_bad_version {
    public static void main(String[] args) {
        int number_of_version = 1000000;

        System.out.println(firstBadVersion(number_of_version));

    }

    public static boolean isBadVersion(int num){
        int bad_version = 89003;
        return (num >= bad_version);
    }

    public static int firstBadVersion(int n) {
        int start = 1, end = n, mid;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(isBadVersion(mid) == false){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
}
