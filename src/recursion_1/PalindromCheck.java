package recursion_1;

public class PalindromCheck {
    public static void main(String[] args) {
        String test = "abcdhdcba";
        boolean value = IsPalindromeRec(test,0,test.length()-1);
        System.out.println(value);
    }

    //not a good solution becuase we are creating a substring here
    public static boolean IsPalindrome(String s){
        if(s.isEmpty() || s.length()==1){
            return true;
        }
        int i=0;
        int j=s.length()-1;
        return s.charAt(i) == s.charAt(j) && IsPalindrome(s.substring(i + 1, j));

        //timecomplexity O(n^2)  - a new substring is gettign created
    }

    public static boolean IsPalindromeRec(String s, int start, int end){
        if(start > end){
            return true;
        }
        return s.charAt(start) == s.charAt(end) && IsPalindromeRec(s,start+1, end-1);

        //timecomplexity O(n)
    }


    //good solution without recursion
    public static boolean IsPalindromewithoutRecusrion(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    //time Complexity is O(n)
}
