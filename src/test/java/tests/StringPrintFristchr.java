package tests;

public class StringPrintFristchr {

    public static void main(String[] args) {


        String s = "Nirmal Jain";
        String[] str=s.split(" ");
        String output="";
        output=output+str[0].substring(0,1)+str[1].substring(0,1);
        System.out.println(output);
    }

    

}
