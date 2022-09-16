public class Palindrome {
    private static boolean palindrome(String str){
        String reverseStr = "";

        int strLen = str.length();

        for (int i = (strLen - 1); i >= 0; --i){
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.equals(reverseStr))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}