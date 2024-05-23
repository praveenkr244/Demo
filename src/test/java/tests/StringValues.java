package tests;

import java.util.HashMap;
import java.util.Map;

public class StringValues {

    /*Suppose if all the alphabets are assigned values 1 to 26, like  a=1, b=2, c=3, …………. z= 26, Input your name and calculate the sum of your name?
    Example:
    Input: java
    Output: 34
            (Where j=10, a=1, v=22, a=1)*/

    public static void main(String[] args) {
        Map<Character, Integer> letterValues = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            letterValues.put(ch, ch - 'a' + 1);
        }
        int totalValue = 0;

        String ss="javaa" ;
        for (char ch : ss.toCharArray()) {
            if (letterValues.containsKey(ch)) {
                totalValue += letterValues.get(ch);
            }
        }

        System.out.println(totalValue);
    }
}
