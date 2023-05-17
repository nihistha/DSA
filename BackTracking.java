public class BackTracking {
    int count = 0;
    public void printPermutation(String str, String perm, int indx){
        for(int i = 0;i<str.length();i++){
            char current = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            printPermutation(newstr, perm+current, indx+1);
        }
    }
}
