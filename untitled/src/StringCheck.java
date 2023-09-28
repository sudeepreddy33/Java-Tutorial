public class StringCheck {

    public String reverseString (String str){
        //Using traditional way
//        String temp = "";
//        char ch;
//
//        for ( int i = 0; i<str.length(); i ++){
//            ch = str.charAt(i);
//            temp = ch + temp;
//        }
//        return "Reversed String is " +temp;

        //Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        String reversedString = stringBuilder.reverse().toString();

        return "Reversed String is " + reversedString;
    }

    public String checkPalindrome (String str) {
        String temp = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            temp = ch + temp;
        }
        if (temp.equals(str)) {
            return "String is Palindrome";
        } else {
            return "String is not Palindrome";
        }
    }

    public Boolean vowelCheck(String a) {
        String vowel = "aeiouAEIOU";

        for (char c : a.toCharArray()) {
            if (vowel.contains(String.valueOf(c))) {

                return true;
            }
        }
        return false;
    }


}
