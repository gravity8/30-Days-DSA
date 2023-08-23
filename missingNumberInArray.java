public class missingNumberInArray {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        int total=0;
        for(int i=0; i<nums.length;i++){
        total+=nums[i];
        }
        System.out.println((nums.length*(nums.length+1)/2)-total); ;
    }
}
