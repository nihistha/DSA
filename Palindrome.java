public class Palindrome {
    public void palindrome(String name,int indx,int indx2){
        int len = name.length();
        if(indx == len){
            return;
        }
        int count = 0;
        palindrome(name, indx, indx2);
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int count = 0;
        char arr[] = s.toCharArray();
        for(int i = 0,j=len-1 ; i<=len-1  ,j>=0;i++,j--){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count == len){
            return true;
        }
        return false;
    }
}