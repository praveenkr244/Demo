package tests;

import java.util.HashSet;

public class SampleTest {


    //oftheday

    public static boolean uniqueStr(String s, int start, int end){
        HashSet<Character> chars=new HashSet<>();
        for(int i=start;i<=end;i++){
            char ch=s.charAt(i);
            if(chars.contains(ch)){
               break;
                //return false;
            }
            chars.add(ch);
        }
        System.out.println(chars);
       chars.forEach(character -> character.charValue());

        return true;
    }
    public static int logest_lenght(String str){
        int result=0;
        for(int i=0;i< str.length();i++){
            for(int j=i;j<str.length();j++){
                if(uniqueStr(str,i,j)){
                    result=Math.max(result,j-i+1);

                }
            }
        }
        return result;
    }
    public static String selectUppercaseCharacters(String string1, String string2) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(string1.length(), string2.length());

        for (int i = 0; i < minLength; i++) {
            char char1 = string1.charAt(i);
            char char2 = string2.charAt(i);

            if (Character.isUpperCase(char2)) {
                result.append(char1);
            } else if (Character.isUpperCase(char1)) {
                result.append(char2);
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String s1 = "EVERYTHING";
        String s2 = "SomeThings";
        String selectedChars = selectUppercaseCharacters(s1, s2);
        System.out.println(selectedChars);
    }

}
