package String;

public class Palindrome {
    //O(n) - because we are creating a new reverse string
    public static boolean palindromeCheck(String s){
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
        return s.equals(rev.toString());
    }

    public static boolean palindromeCheckGoodMethod(String s){
       int begin = 0;
       int end = s.length()-1;
       while(end > begin){
           if(s.charAt(begin) != s.charAt(end))
               return false;
           begin++;
           end--;
       }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palindromeCheckGoodMethod("ABBCBBA"));
        System.out.println(palindromeCheck("ABCBA"));
        System.out.println(palindromeCheck("ABCB"));
    }
}
