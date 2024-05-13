package tests;

public class StringManipulation {
    public static void main(String[] args) {
        String s="praveen.kr244@gmail.com";
        String[] parts = s.split("@");

        // The username is the first part before '@'
        String usernameWithoutNumbersOrDots = parts[0].replaceAll("[^a-zA-Z]", "");
        System.out.println(usernameWithoutNumbersOrDots);

    }
}
