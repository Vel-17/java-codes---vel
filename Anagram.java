import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "silent";
        String str1 = "lisent";

        
        char[] arr = str.trim().toLowerCase().toCharArray();
        char[] arr1 = str1.trim().toLowerCase().toCharArray();

        
        if (arr.length != arr1.length) {
            System.out.println("Not an anagram");
            return;
        }

        
        Arrays.sort(arr);
        Arrays.sort(arr1);

        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr1[i]) {
                System.out.println("Not an anagram");
                return;
            }
        }

        System.out.println("An anagram");
    }
}
