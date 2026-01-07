package ArrayList;

import java.util.ArrayList;

public class ReplaceMethod {
    static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(6);
        numbers.add(1);
        numbers.replaceAll( n -> n + 1 );
        System.out.println(numbers);
    }
}
