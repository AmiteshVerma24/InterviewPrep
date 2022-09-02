package Arrays;
// I/P =>
// a1 = {6,7,10,25,30,63,64}
// a2 = {0,4,5,6,7,8,50}
// a3 = {1,6,10,14}

// O/P => 6 as it is the smallest common element in all three array
public class smallestCommonInSortedArray {
    static void findSmallest(int[] a1, int[] a2, int[] a3){
        int p1=0 ,p2=0 ,p3=0;
        while (p1<a1.length && p2<a2.length && p3<a3.length){
            if (a1[p1] < a2[p2] && a1[p1] < a3[p3]){
                p1++;
            }
            else if (a2[p2] < a1[p1] && a2[p2] < a3[p3]){
                p2++;
            }
            else{
                p3++;
            }
        }
        System.out.println(a1[p1]);
    }
    public static void main(String[] args) {
        int a1[] = {6,7,10,25,30,63,64};
        int a2[] = {0,4,5,6,7,8,50};
        int a3[] = {1,6,10,14};
        findSmallest(a1, a2, a3);

    }
    
}
