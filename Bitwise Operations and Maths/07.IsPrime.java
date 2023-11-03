 class IsPrime {
    public static void main(String[] args) {
        for(int i = 0 ; i < 60 ; i ++){
            System.out.format("Number %d: %b \n", i, isPrime(i));
        }
    }
    public static boolean isPrime(int num){
        if (num < 2){
            return false;
        }
        int n = 2;
        while(n * n <= num){
            if(num % n == 0){
                return false;
            }
            n++;
        }
        return true;
    }
}
