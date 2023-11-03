class Factors {
    public static void main(String[] args) {
        factors1(90);
        System.out.println("");
        factors2(90);
    }
    // O(n)
    public static void factors1(int num){
        for(int i = 1 ; i < num + 1 ; i++){
            if(num % i == 0){
                System.out.print(i + "  ");
            }
        }
    }
    // Much faster
    public static void factors2(int num){
        for(int i = 1 ; i*i < num + 1 ; i++){
            if(num % i == 0){
                System.out.print(i + "  ");
                System.out.print(num / i + "  ");
            }
        }
    }
}
