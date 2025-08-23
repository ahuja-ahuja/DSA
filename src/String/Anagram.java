package String;

import java.util.Arrays;

public class Anagram {
    public static boolean checkAnagram(String s1, String s2) {
        char s1Array[] = s1.toCharArray();
        char s2Array[] = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);
    }

    public static boolean checkAnagramGoodApproach(String s1, String s2) {
        boolean result = true;
        int array[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            array[s1.charAt(i) - 'a']++;
            array[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0)
                result = false;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(checkAnagram("abcde", "bacde"));
        System.out.println(checkAnagramGoodApproach("abcde", "bacde"));
        System.out.println(checkAnagram("abcde", "bacda"));
    }
}
