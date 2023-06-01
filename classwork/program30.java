package classwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class program30 {
    public static boolean name (String line) {
        Stack<Character> stack = new Stack<>();
        char[] c1 = line.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put('<', '>');
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i]))
            stack.push(c1[i]);
            if(map.containsValue(c1[i])){
                if (stack.isEmpty() || map.get(stack.pop()) != c1[i]){
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
    }
}
