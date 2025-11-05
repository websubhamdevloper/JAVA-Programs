package Strings;

public class StringBuilderPrograms {
    static void main(String[] args) {
        StringBuilder string = new StringBuilder("GeeksForGeeks");
        System.out.println("Using StringBuilder: " + string);
        string.append(" is awesome!");
        System.out.println("using Append method: " + string);

        StringBuilder str1 = new StringBuilder(50);
        str1.append("This has initial capacity of 50");
        System.out.println(str1);

        StringBuilder str2 = new StringBuilder("Geeks");
        str2.append("ForGeeks");
        System.out.println(str2);

        CharSequence cs = "Java";
        StringBuilder str3 = new StringBuilder(cs);
        str3.append(" Programming");
        System.out.println(str3);

        // It has same methods as StringBuffer...

    }
}
