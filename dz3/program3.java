package dz3;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class program3 {
    public static void main(String [] args) {
        List<String> list = createList();
        System.out.println(list);

    }

    static  List<String>  createList(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("total planets: ");
        String total = sc.nextLine();
        int tatal1 = Integer.parseInt(total);
        List<String> result = new ArrayList<>(tatal1);
        for (int i = 0; i < tatal1; i++){
            System.out.println("Write the name: ");
            String word = sc.nextLine();
            result.add(word);
        }
        sc.close();
        return result; 

    }

 

}
