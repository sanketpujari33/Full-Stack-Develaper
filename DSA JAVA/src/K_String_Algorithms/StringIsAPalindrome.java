package K_String_Algorithms;

public class StringIsAPalindrome {
    public static boolean isPalindrome(String word){
        char [] charArray= word.toCharArray();
        int start=0;
        int end=word.length()-1;
        while (start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="madam";
        System.out.println(isPalindrome(str));
    }
}
