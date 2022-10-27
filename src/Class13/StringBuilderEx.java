package Class13;

public class StringBuilderEx {
    public static void main(String[] args) {
         /*
        StringBuilder  allows any methods to change the original contents of the
variables
        because StringBuilder is mutable.
         */
        java.lang.StringBuilder stringBuilder=new java.lang.StringBuilder("Intellij is great");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        /*
        String does not allow any methods to change the original contents of the
variables
        because String is immutable
         */
        String str="Intellij ";
        str.toLowerCase();
        System.out.println(str);
      /*  String country="USA";
        String home="USA";
        StringBuilder state=new StringBuilder("New york");
        StringBuilder state2=new StringBuilder("New york");*/
    }
}