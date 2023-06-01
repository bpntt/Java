package classwork;

import java.util.HashMap;
import java.util.Map;

public class program29 {
    public static boolean main(String s1, String s2) {
            if (s1.length() != s2.length() ){
                return false;
            }
            char [] c1 = s1.toCharArray();
            char [] c2 = s2.toCharArray();
            Map<Character, Character> map = new HashMap<>();
            for (int i = 0; i < c1.length; i++) {
                if (map.containsKey(c1[i])){
                    if (c2[i] != map.get(c1[i])){
                        return false;
                    }
                }
                else {
                    map.put(c1[i], c2[i]);
                }
            }
        return true;
        }
    
    }

