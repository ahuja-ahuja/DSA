package String;

public class StringSubsequence {
/*    for sting length n, subsequence is 2^n
    String s = "ABC"
    subsequence is
    AB,
    AC
    A
    B
    C
    BC
    AB
    AC

    AD is subswquence of "ABCD" -> true
    ADB is a subsequence of "ABCD" -> false*/

    public static boolean checkSubSequence(String s1, String s2){
     /*   initialize two pointer i and j for s1 and s2, if they match then move both if not then only move the s1 pointer i
        AD is subswquence of "ABCD"
        i =0 (A) , j=0(A)
        i =1 (B) , j=1(D)
        i =2 (C) , j=1(D)
        i =3 (D) , j=1(D) */
        int i = 0;
        int j = 0;
        int n = s1.length();  // abc
        int m = s2.length();  // abcdef

        while(i < n && j < m){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }            // this means i travels to the whole subsequence string .....
        return (i == n);  // how to check if s2 is completed iteration - check length of s2 is equal of j ( no of iteration)

    }

    public static void longestCommonSubsequence(String s1, String s2){
        int i = 0;
        int j = 0;
        int n = s1.length();  // abdf
        int m = s2.length();  // abcdef
        while(i<n && j<m){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
    }
}
