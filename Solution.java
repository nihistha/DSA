public class Solution {
    public int searchInsert(int[] nums, int target) {
        

        int len = nums.length;
        int ret = 0;
        for (int i = 0; i<=len-1;i++){
            if(nums[i]==target){
                return i;
            }else if(target<nums[i]){
                return i;
            }
        }
        return len;
    }
 
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num={1,2,3,5,7};
        System.out.println(s.searchInsert(num, 6)); 
    }
    
        // public boolean isValid(String s) {
        //     int len = s.length();
        //     System.out.print(len);
        //     return true;
        // }
    
}
