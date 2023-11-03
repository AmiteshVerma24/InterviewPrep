package Recursion.Arrays;

import java.util.ArrayList;

class LinearSearchOnMultipleOccurrences {
    
    public static void main(String[] args) {
        int [] arr = {1,2,2,2,3,4,5,6,7,2};
        ArrayList<Integer> myList = new ArrayList<>();
        System.out.println(findOccurrences(arr, 2, 0));
        
    }
    // Here we are passing the array list
    public static ArrayList findAllOccurrences(int [] arr, int target, int index, ArrayList<Integer> lst){
        if(arr[index] == target) lst.add(index);
        if(index == arr.length - 1) return lst;
        return findAllOccurrences(arr, target, index + 1, lst);
    }
    // In case when we don't want to pass the array list as an arguement
    public static ArrayList findOccurrences(int [] arr, int target, int index){
        ArrayList<Integer> myList = new ArrayList<>();
        if(arr[index] == target) myList.add(index);
        if(index == arr.length - 1) return myList;
        if(myList.isEmpty() == false){
            myList.addAll(findOccurrences(arr, target, index+1));
        }else{
            return findOccurrences(arr, target, index+1);
        }
        return myList;
        


    }
}
