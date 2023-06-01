package classwork;
import java.util.Map;
import java.util.HashMap;
public class program28 {
    private Map<String, String> map = new HashMap<>();
    void add(String PassportNum, String LastName){
        map.put(PassportNum, LastName);
    }
    String get(String PassportNum){
        return PassportNum + ": " + map.get(PassportNum);
    }
    String GetByLastName(String lastname){
        StringBuilder stringbuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: map.entrySet()){
            if (entry.getValue().equalsIgnoreCase(lastname)){
                stringbuilder.append(entry.getKey());
            stringbuilder.append(": ");
            stringbuilder.append(entry.getValue());
            stringbuilder.append("\n");
            }
        }
        return stringbuilder.toString();
        
    }
    String getAll(){
        StringBuilder stringbuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: map.entrySet()){
            stringbuilder.append(entry.getKey());
            stringbuilder.append(": ");
            stringbuilder.append(entry.getValue());
            stringbuilder.append("\n");
        }
        return stringbuilder.toString();
    }
}
