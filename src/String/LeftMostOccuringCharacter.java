package String;

public class LeftMostOccuringCharacter {
    public static int leftMostOccuringCharacter(String s1){
        int arr[] = new int[256];
        for(int i=0; i< s1.length();i++){
            arr[s1.charAt(i)]++;
        }
        for(int i=0; i< s1.length();i++){
          if(arr[s1.charAt(i)] > 1){
              return i;
          }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(leftMostOccuringCharacter("gaurav"));
    }
}
