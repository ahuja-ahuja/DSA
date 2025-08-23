package Mathematical_problems;

public class PalindromNumber {

    public static boolean isPalindrom(int x){
        //find the reverse of this no and if both matches then palindrom
        int revNumber = 0;
        int temp = x;  //we need this no to compare in the last
        while(temp>0){
            int lastdigit = temp%10;             //take the last digit
            revNumber = revNumber*10 + lastdigit;    //this is how we create a new no
            temp = temp/10;
        }
        return (x == revNumber);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(76367));

    }
}
