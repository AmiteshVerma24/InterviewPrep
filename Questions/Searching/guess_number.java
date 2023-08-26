package Questions.Searching;

public class guess_number {
    public static void main(String[] args) {
        int pick = 60;
        int num = 100;
        System.out.println(guessNumber(num, pick));
    }
    public static int guessNumber(int n, int pick) {
        int start = 1 , end = n , guess;
        while(start <= end){
            guess = start + (end - start) / 2;
            if(guess == pick) {
                return 1;
            }
            else if(guess < pick){
                start = guess + 1;
            }
            else{
                end = guess - 1;
            }
        }
        return -1;
    }
}
