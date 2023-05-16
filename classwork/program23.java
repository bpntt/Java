package classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class program23 {
    public static void main(String[] args) {
        List<Integer> list = createList(10, 4, 10);
        System.out.println(list);
        sort(list);
        System.out.println(list);

    }
    static void sort(List<Integer> list){
        Collections.sort(list);
    }

    static List<Integer> createList(int capacity, int min, int max) {
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int) (Math.random() * (max - min + 1) + min));
            
        }
        return result;
    }
}
