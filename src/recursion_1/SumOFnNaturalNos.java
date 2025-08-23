package recursion_1;

public class SumOFnNaturalNos {
    public static void main(String[] args) {
        int sum = usingRecursion(4);
        System.out.println(sum);
    }
    public static int usingRecursion(int n){
        if(n==1){
            return 1;
        }
        return n+usingRecursion(n-1);
    }
}
//TimeComplexity is O(n)