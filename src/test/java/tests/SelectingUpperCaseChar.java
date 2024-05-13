package tests;

public class SelectingUpperCaseChar {

    public static void main(String[] args) {
        //string 1 = “heLLo” and string 2 = “GUlp”, Output would be “help”
        //I/P – “1234567”, “XxXxX”, O/P – “135”
        String s1="EVERYTHING";
        String s2="SomeThings";//EYSomeThings
        uppercaseChar(s1,s2);
    }

    public static void uppercaseChar(String s1,String s2){
        int l=Math.min(s1.length(),s2.length());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<l;i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(Character.isUpperCase(c2)){
                sb.append(c1);
            }
            else if(Character.isUpperCase(c1)){
                sb.append(c2);
            }
        }
        System.out.println(sb.toString());
    }
}
