package LeetCode.Question3;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int k = 0;

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                nums[k] = nums[i];
                k++;
            }
        }
        // get the last element from value
        if(nums.length -1 != nums.length-2){
            nums[k] = nums[nums.length -1];
                k++;
        }

        return k;
        
    }

    public static void main(String[] args){
        System.out.println("Array is: ");
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println("Array after remove duplicates is: ");
        int k = removeDuplicates(arr);

        for(int i = 0; i<k; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
