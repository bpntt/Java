package OOP.second;

import java.util.ArrayList;
import java.util.List;

public class program1 {
    public static void main(String[] args) {

        cat cat1 = new cat("white", "Brown");
        cat1.voice();
        dog dog1 = new dog("black", 12);
        dog1.voice();
        List<animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(dog1);
    }
}
