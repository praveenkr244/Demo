package tests;

 class StringBuilderBuffer {

    private static String ss="test";
     private static class classnested {

         public void example(){

     }

    }

    static class Enumseason{

         public enum season{
             SUMMER,
             WINTER,
             SPRING
         }

        public static void main(String[] args) {
            for(season print:season.values()){
                System.out.println(print);
            }
            System.out.println(season.valueOf("WINTER"));
        }
    }
}
