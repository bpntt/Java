package OOP.fourt;

import java.util.*;


public class program {
    public static void main(String [] Args) {

        uniAcc uni1 = new uniAcc(new AccounID(01, "aaa"), 1000);
        System.out.println(uni1);
        account<AccounID> acc01 = new account<AccounID>(new AccounID(01, "aaa"), 1000);

        Integer [] numbers = {2,4,5,6,1,33,-5,11};
        String [] names = {"john", "Tony", "Alice", "Eva", "margo"};
        ArrayUtils.replaceTwoElements(names, 1, 2);
    }}