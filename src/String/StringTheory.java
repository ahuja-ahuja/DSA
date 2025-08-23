package String;

public class StringTheory {
    public static void main(String[] args) {

    /*    Java used 16 bit utf-16 bits
        StringBufffer is a thread safe class - used in multi thread environemnt where object is shared
        String Builder is not thread safe - for single threader program

        For immutble String use String classes , its thread safe automatically

        String s1 = "ahuja";
        String s2 = "ahuja";
        java will not assign new memory for s2
        s1==s2 -> true;  here == checks for the reference not content*/


        char s = 'a';
        System.out.println((int) (s)); //66

        //print the occurance of the character

        String word = "geeksforgeeks";
        int arry[] = new int[26];
        for (int i = 0; i < word.length(); i++) {
            arry[word.charAt(i) - 'a']++;   // here for g -> arry[34-26] -> arry[8] ->1

            // in arry index 0 is for a, 1 for b ........ since we are subtracting it from 'a'.
        }
        for(int i=0; i<26; i++){
            if(arry[i] > 0){
                System.out.println((char)(i+'a') + "  " +arry[i]);
            }
    }

}
}
