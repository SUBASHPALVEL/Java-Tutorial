public class DutchNationalFlag {
    public static void main(String[] args){
        int [] nums = {2,1,2,1,0,1,0};
        sort(nums);
        printArray(nums);
    }

private static void sort(int[] nums){
    var lowIndex=0;
    var midIndex=0;
    var highIndex=nums.length-1;

    while(midIndex<=highIndex){
        if(nums[midIndex]==0){
            swap(nums,lowIndex, midIndex);
            lowIndex++;
            midIndex++;
        }
        else if(nums[midIndex]==1){
            midIndex++;
        }
        else{
            swap(nums,midIndex, highIndex);
            highIndex--;
        }
}
}

private static void swap(int[] nums, int first, int second){
    int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
}

private static void printArray(int[] nums) {
    for (int num : nums) {
        System.out.print(num + " ");
    }

}

}
