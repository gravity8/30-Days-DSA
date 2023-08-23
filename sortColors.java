public class sortColors {
    public static void main(String[] args) {
        int[] nums = {2,1,0,2,1,0};
        int i =0;
        int j=i+1;
        while(j<nums.length){
            if(nums[j]<nums[i]){
                int tempo = nums[i];
                nums[i]= nums[j];
                nums[j]=tempo;
                while(i>0&&nums[i]<nums[i-1]){
                    int temp = nums[i-1];
                    nums[i-1]= nums[i];
                    nums[i]=temp;
                    i--;
                }
                j++;
                i=j-1;
            }
            else if(nums[j]==nums[i]){
                j++;
            }
            else{
                j++;
                i=j-1;
            }
        }
    }
}
