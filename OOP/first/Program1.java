package OOP.first;

import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String [] Args) {
        
    product product1;
    product1 = new product("111", "cola" , 0.25);
/*     product1.brand = "111";
    product1.name = "cola";
    product1.price = 0.25; */
    System.out.println(product1.displayInfo());
    botle botleOfWather = new botle("boaqua", "bonaqua", 1, 500);
    System.out.println(botleOfWather.displayInfo());
    botleOfMilk botleOfMilk = new botleOfMilk("mine", "mine", 2, 900, 2);
    System.out.println(botleOfMilk.displayInfo());
    chocolate choco = new chocolate("milka", "milka", 2, 90, 45 );
    System.out.println(choco.displayInfo());


    veidingMachine vendingMachine = new veidingMachine(null);
    List<product> products = new ArrayList<>();
    products.add(product1);
    products.add(botleOfWather);
    products.add(botleOfMilk);
    products.add(choco);



    
}}