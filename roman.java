import java.util.*;
public class roman {

    public int romanToInt(String s) {
        Dictionary <String,Integer> dict = new Hashtable<String,Integer>();
        dict.put("I",1);
        dict.put("V",5);
        dict.put("X",10);
        dict.put("L",50);
        dict.put("C",100);
        dict.put("D",500);
        dict.put("M",1000);
        // System.out.print(dict);
        int len = s.length()-1;
        int sum = 0;
        char letter = s.charAt(0);
        int number = dict.get(letter);
        sum = sum + number;
        // for (int i = 1;i<len;i++){

        //     
        //     int number = dict.get("X");
        //     System.out.println(number);
        //     
        //     return number;
            
        // }
    return sum;
    }
    public static void main(String[] args) {
        roman r = new roman();
        System.out.println(r.romanToInt("III")); 
    }
}

class solution {
    public int removeDuplicates(int[] A) {
    if (A.length==0) return 0;
    int j=0;
    for (int i=0; i<A.length; i++)
        if (A[i]!=A[j]) A[++j]=A[i];
    return ++j;

    }
}

//climbing Stairs
class Solution {
    public int climbStairs(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}