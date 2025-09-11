package Searching;

public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,45,76,59,6,5,4};
        int target = 45;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0 ) {
            return -1;
        }

        // run for loop
        for(int index=0; index<arr.length; index++){
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }


    
}
