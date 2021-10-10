public class BinarySearch {
    public int search(int[] nums, int target) {
        if(nums.length == 1){
            if(nums[0]  == target){
                return 0;
            }
        }
        int i = 0;
        int j = nums.length- 1;


        while(i <= j){
            int mid = (i+j)/2;
            if(nums[mid] > target){
                j = mid - 1;
            }else if(nums[mid] < target){
                i = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
