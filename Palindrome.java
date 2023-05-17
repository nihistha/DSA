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
