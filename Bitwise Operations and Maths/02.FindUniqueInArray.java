 class FindUniqueInArray {
    public static void main(String[] args) {
        int [] arr = {2, 3, 3, 4, 2, 5, 4, 6, 5};
        int ans = 0;
        for(int i : arr){
            ans = ans ^ i;
        }
        System.out.println(ans);
    }
}
