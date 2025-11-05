package Strings;

public class StringBufferProgram {
    static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("Subham");
        s.append(" ");
        s.append("Kundu");
        String str = s.toString();
        System.out.println(str);

        StringBuffer sb1 = new StringBuffer();
        sb1.append("Welcome");
        System.out.println("Default Constructor: " + sb1);

        StringBuffer sb2 = new StringBuffer(50);
        sb2.append("Subham Kundu");
        System.out.println("With capacity 50: " + sb2);

        StringBuffer sb3 = new StringBuffer(" HP ");
        sb3.append("Victus 15");
        System.out.println("With string: " + sb3);

        StringBuffer str1 = new StringBuffer("Hello");
        str1.insert(1,"Java");
        System.out.println("With Insert method: " + str1);

        StringBuffer string = new StringBuffer("Hello");
        string.replace(1, 3, "java");
        System.out.println("With replace : " + string);

        string.delete(1,5);
        System.out.println("With delete: " + string);

        sb2.reverse();
        System.out.println("With reverse : " + sb2);

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("Hello");
        System.out.println(sb.capacity());

        sb.append(" Java Is my Fav Language in programming");
        System.out.println(sb.capacity());

        int lengthOfstringBuffer = sb.length();
        System.out.println("Length of the stringBuffer (sb) is " + lengthOfstringBuffer);


        char characterAtIndex = sb.charAt(8);
        System.out.println("Character at index 8 in (sb) is " + characterAtIndex);

        sb.deleteCharAt(8);
        System.out.println("StringBuffer after using deleteCharAt : " + sb);



    }
}
