package classwork;
import java.util.*;
public class program32 {
    public static void main(String [] Args) {
        Integer [] arr = new Integer[]{3,1,5,2,2,6,9,3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}