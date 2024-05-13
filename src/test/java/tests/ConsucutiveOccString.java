package tests;

import java.util.Locale;

public class ConsucutiveOccString {
    public static void main(String[] args) {
       // String s="aaaAAab~B^bbc$cC%ca*aDdDd@bB";
       // s=s.replaceAll("[~+^@%]","");
        String s="aaaAAabBbbccCcaaDdDdbB";
        String s1=s.toLowerCase();
       // char[] str=s1.toCharArray();
        for(int i=0;i<s1.length();i++){
int count=1;
            while (i + 1 < s1.length() && s1.charAt(i)==s1.charAt(i+1)) {

                i++;
                count++;
            }
            System.out.print(s1.charAt(i)+""+count);
        }

    }
}
