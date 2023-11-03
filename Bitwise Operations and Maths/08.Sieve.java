class Sieve {
    public static void main(String[] args) {
        int number = 40;
        boolean array[] = new boolean[number + 1];
        sieve(number, array);
    }
    // We consider false = the number is prime
    public static void sieve(int number, boolean[] array){
        for(int i = 2 ; i*i < number ; i++){
            if(array[i] == false){
                for(int j = i * 2 ; j < number ; j += i){
                    array[j] = true;
                }
            }
        }
        for (int i = 2; i < array.length - 1; i++) {
            if(array[i] == false){
                System.out.println(i);
            }
        }
    }
}
