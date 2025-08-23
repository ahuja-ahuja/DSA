package Mathematical_problems;

public class Fact {

    public static int fact1(int n){
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans = ans * i;
        }
        return ans;
    }

    public static int fact2_rec(int n){
        if(n == 0){
            return 1;
        }
        return n * fact2_rec(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact1(3));
        System.out.println(fact1(4));

    }
}
