package tests;

public class Sample {
    //String s=my name is praveen
    //replace a with @ and e with $

    public static void main(String[] args) {
        String s="My name is praveen";

        char[] ch=s.toCharArray();
        char[] n=new char[ch.length];
        for(int i=0;i<ch.length;i++){
           if(ch[i]=='a'){
               s=s.substring(0,i)+"@"+s.substring(i+1);
           }
           else if(ch[i]=='e'){
                s=s.substring(0,i)+"$"+s.substring(i+1);
            }

        }
        System.out.println(s);
    }
}
