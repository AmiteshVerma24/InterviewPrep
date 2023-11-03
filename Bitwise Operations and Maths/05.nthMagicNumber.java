
class nthMagicNumber {
    public static void main(String[] args) {
        int n = 10;
        int magic_number = 0;
        int count = 1;
        while (n > 0){
            magic_number +=  (n & 1) * (Math.pow(5 , count));
            count++;
            n = n >> 1;
        }
        System.out.println(magic_number);
    }    
}
