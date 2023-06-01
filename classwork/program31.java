package classwork;
import java.util.*;
public class program31 {
    public static void main(String [] Args){
        String line = "Мороз и солцнце день чудесный\n" + 
        "Еще ты дремлешь друг прелестный\n" + 
        "Пора красавица проснись";
        line = line.replace(".", "");
        line = line.replace("\n", " ");
        String [] words = line.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>();
        for (String s: words){
            int len = s.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(s);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(len, list);
            }
        }
    System.out.println(map);
    }
}
