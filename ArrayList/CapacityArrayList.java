package ArrayList;

import java.util.ArrayList;

public class CapacityArrayList {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.ensureCapacity(20);
        for (int i =0; i <= 20; i++){
            list.add(i);
        }
        System.out.println(list);
    }
}
