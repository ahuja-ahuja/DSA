package recursion_1;

public class SumOFDigits {
    public static void main(String[] args) {
        int sum = sumDigit(22134);
        System.out.println(sum);
    }

    public static int sumDigitRec(int n) {
        if(n==0){
            return 0;
        }
        return n % 10 + sumDigitRec(n / 10);

    }

    //here time complexity is O(n) and aux space is also O(n) ? Why do we have have here Auxiliry space is O(n) becuase when returning the whole
    // method which will take space is stackTrace
    //for any porblem is yo can find a iteative approce then that would eb better for this example if i would hae done this then
    //O(n)  and aux space would be less O(1)

    public static int sumDigit(int n) {
        int res = 0;
        while(n>0) {
           res =  res + n % 10;
           n = n/10;
        }
        return res;
    }
}